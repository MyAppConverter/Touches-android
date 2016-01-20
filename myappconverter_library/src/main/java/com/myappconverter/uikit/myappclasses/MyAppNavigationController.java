package com.myappconverter.uikit.myappclasses;

import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.myappconverter.java.foundations.NSArray;
import com.myappconverter.java.foundations.SEL;
import com.myappconverter.mapping.utils.AndroidRessourcesUtils;
import com.myappconverter.mapping.utils.GenericMainContext;
import com.myappconverter.mapping.utils.InvokableHelper;
import com.myappconverter.uikit.bridges.protocols.UINavigationControllerDelegate;

public class MyAppNavigationController extends MyAppController {

    public MyAppController rootViewController;
    public NSArray<MyAppController> viewControllers = new NSArray<>();

    private MyAppNavigationBar navigationBar;
    private MyAppToolbar toolbar;
    private boolean navigationBarHidden;
    private boolean toolbarHidden;

    private UINavigationControllerDelegate delegate;
    private boolean hidesBarsWhenKeyboardAppears;
    private boolean hidesBarsOnTap;
    private RelativeLayout content;
    private MyAppController topViewController;
    private MyAppController visibleViewController;

    public boolean getHidesBarsWhenKeyboardAppears() {
        return hidesBarsWhenKeyboardAppears;
    }

    public void setHidesBarsWhenKeyboardAppears(boolean hidesBarsWhenKeyboardAppears) {
        this.hidesBarsWhenKeyboardAppears = hidesBarsWhenKeyboardAppears;
    }

    public boolean getHidesBarsOnTap() {
        return this.hidesBarsOnTap;
    }

    public void setHidesBarsOnTap(boolean hidesBarsOnTap) {
        this.hidesBarsOnTap = hidesBarsOnTap;
    }

    public UINavigationControllerDelegate getDelegate() {
        return delegate;
    }

    public void setDelegate(UINavigationControllerDelegate delegate) {
        this.delegate = delegate;
    }

    public boolean getNavigationBarHidden() {
        return navigationBarHidden;
    }

    public void setNavigationBarHidden(boolean navigationBarHidden) {
        this.navigationBarHidden = navigationBarHidden;
    }

    public MyAppToolbar getToolbar() {

        return toolbar;

    }

    public RelativeLayout getContent() {
        return content;
    }

    public void setContent(RelativeLayout content) {
        this.content = content;
    }

    public void setToolbar(MyAppToolbar myAppToolbar) {
        this.toolbar = myAppToolbar;
    }

    public MyAppNavigationBar getNavigationBar() {
        return navigationBar;
    }

    public void setNavigationBar(MyAppNavigationBar myAppNavigationBar) {
        this.navigationBar = myAppNavigationBar;
    }

    public MyAppController getVisibleViewController() {
        return visibleViewController;
    }

    public void setVisibleViewController(MyAppController visibleViewController) {
        this.visibleViewController = visibleViewController;
    }

    public MyAppController getTopViewController() {
        return topViewController;
    }

    public void setTopViewController(MyAppController topViewController) {
        this.topViewController = topViewController;
    }

    public boolean isToolbarHidden() {
        return toolbarHidden;
    }

    public void setToolbarHidden(boolean toolbarHidden) {
        this.toolbarHidden = toolbarHidden;
    }

    public void pushViewControllerAnimated(MyAppController nextController, boolean animated) {

        //set navigation controller property
        if(nextController.getNavigationController()==null)
            nextController.setNavigationController(this);

        //Add controller to the stack
        if (viewControllers == null) {
            viewControllers = new NSArray<MyAppController>();
        }
        //Add nextController to the navigation stack
        if (!viewControllers.getWrappedList().contains(nextController)) {
            viewControllers.getWrappedList().add(nextController);
        }

        //set navigation button
        if( viewControllers.getWrappedList().size()>1){
            getNavigationBar().setNavigationIcon(GenericMainContext.sharedContext.getResources().getDrawable(AndroidRessourcesUtils.getResID("abc_ic_ab_back_mtrl_am_alpha","drawable")));
            getNavigationBar().setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    popViewControllerAnimated(true);
                }
            });
        }else{
            getNavigationBar().setNavigationIcon(null);
        }

        //hidetoolbar
        getToolbar().setVisibility(View.GONE);

        //next controller lyfecycle and updating naviagtion view
        nextController.viewDidLoad();
        nextController.viewWillAppear(false);
        nextController.viewWillLayoutSubviews();
        if (content != null) {
            content.removeAllViews();
            content.addView(nextController.getView(), ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        }
        nextController.viewDidLayoutSubviews();
        nextController.viewDidAppear(false);

        //setVisible ViewController
        setVisibleViewController(nextController);
        //setTop ViewController
        setTopViewController(nextController);

        //set up navigationjBar and toolBar
        updateUI(nextController);

        if(nextController.getNavigationController()!=null)
            if(nextController.getNavigationController().getTabBarController()==null){
                //update main view
                if (((BaseAppDelegate) GenericMainContext.sharedContext.getApplication()).contentFrame != null) {
                    ((BaseAppDelegate) GenericMainContext.sharedContext.getApplication()).contentFrame.removeAllViews();
                    ((BaseAppDelegate) GenericMainContext.sharedContext.getApplication()).contentFrame.addView(getView(), ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
                }
            }
    }

    public NSArray<MyAppController> popToRootViewControllerAnimated(boolean animated) {

        if(getViewControllers()!=null){

            if(getViewControllers().count()>0){

                //getController and prepare stack
                final NSArray<MyAppController> poped = new NSArray<>();
                for(int i=1 ;i<getViewControllers().getWrappedList().size();i++){
                    poped.getWrappedList().add(getViewControllers().getWrappedList().get(i));
                    getViewControllers().getWrappedList().remove(i);
                }

                MyAppController popedTo = getViewControllers().getWrappedList().get(0);
                getViewControllers().getWrappedList().remove(poped);

                if( viewControllers.getWrappedList().size()==1){
                    getNavigationBar().setNavigationIcon(null);
                }

                //hidetoolbar
                getToolbar().setVisibility(View.GONE);

                //next controller lyfecycle and updating naviagtion view
                popedTo.viewDidLoad();
                popedTo.viewWillAppear(false);
                popedTo.viewWillLayoutSubviews();
                if (content != null) {
                    content.removeAllViews();
                    content.addView(popedTo.getView(), ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
                }
                popedTo.viewDidLayoutSubviews();
                popedTo.viewDidAppear(false);

                //setVisible ViewController
                setVisibleViewController(popedTo);

                //setTop ViewController
                setTopViewController(popedTo);

                //set up navigationjBar and toolBar
                updateUI(popedTo);

                return poped;
            }
        }
        return null;

    }

    public MyAppController popToViewControllerAnimated(MyAppController viewController, boolean animated) {
        return ((BaseAppDelegate) GenericMainContext.sharedContext.getApplication()).popToViewControllerAnimated(viewController, animated);
    }

    public MyAppController popViewControllerAnimated(boolean animated) {
        if(getViewControllers()!=null){
            if(getViewControllers().count()>1){
                MyAppController poped = getViewControllers().getWrappedList().get(getViewControllers().count()-1);
                MyAppController popedTo = getViewControllers().getWrappedList().get(getViewControllers().count()-2);
                getViewControllers().getWrappedList().remove(poped);

                if( viewControllers.getWrappedList().size()==1){
                    getNavigationBar().setNavigationIcon(null);
                }

                //hidetoolbar
                getToolbar().setVisibility(View.GONE);

                //next controller lyfecycle and updating naviagtion view
                popedTo.viewDidLoad();
                popedTo.viewWillAppear(false);
                popedTo.viewWillLayoutSubviews();
                if (content != null) {
                    content.removeAllViews();
                    content.addView(popedTo.getView(), ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
                }
                popedTo.viewDidLayoutSubviews();
                popedTo.viewDidAppear(false);

                //setVisible ViewController
                setVisibleViewController(popedTo);

                //setTop ViewController
                setTopViewController(popedTo);

                //set up navigationjBar and toolBar
                updateUI(popedTo);

                return poped;
            }
        }
        return null;
    }


    public NSArray<MyAppController> popToViewControllerAnimated(MyAppController controller) {
        if(getViewControllers()!=null){

            //cannot pop root controller
            if(getViewControllers().count()>1){

                //getController and prepare stack
                int poptoIndex = -1;
                final NSArray<MyAppController> poped = new NSArray<>();
                for(int i=0 ;i<getViewControllers().getWrappedList().size();i++){
                    if(getViewControllers().getWrappedList().get(i).equals(controller)){
                        poptoIndex = i ;
                    }
                    if(i>poptoIndex){
                        poped.getWrappedList().add(getViewControllers().getWrappedList().get(i));
                        getViewControllers().getWrappedList().remove(i);
                    }
                }

                MyAppController popedTo = getViewControllers().getWrappedList().get(poptoIndex);
                getViewControllers().getWrappedList().remove(poped);

                if( viewControllers.getWrappedList().size()==1){
                    getNavigationBar().setNavigationIcon(null);
                }

                //hidetoolbar
                getToolbar().setVisibility(View.GONE);

                //next controller lyfecycle and updating naviagtion view
                popedTo.viewDidLoad();
                popedTo.viewWillAppear(false);
                popedTo.viewWillLayoutSubviews();
                if (content != null) {
                    content.removeAllViews();
                    content.addView(popedTo.getView(), ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
                }
                popedTo.viewDidLayoutSubviews();
                popedTo.viewDidAppear(false);

                //setVisible ViewController
                setVisibleViewController(popedTo);

                //setTop ViewController
                setTopViewController(popedTo);

                //set up navigationjBar and toolBar
                updateUI(popedTo);

                return poped;
            }
        }
        return null;
    }

    public MyAppNavigationController initWithRootViewController(MyAppController rootViewController) {

        //Add first view controller as rootController
        if (viewControllers == null) {
            viewControllers = new NSArray<MyAppController>();
        }
        if (!viewControllers.getWrappedList().contains(rootViewController)) {
            viewControllers.getWrappedList().add(rootViewController);
        }
        if(rootViewController.getNavigationController()==null)
            rootViewController.setNavigationController(this);

        //hidetoolbar
        getToolbar().setVisibility(View.GONE);

        //update naviagtion view
        rootViewController.viewDidLoad();
        rootViewController.viewWillAppear(false);
        rootViewController.viewWillLayoutSubviews();
        if (content != null) {
            content.removeAllViews();
            content.addView(rootViewController.getView(), ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        }
        rootViewController.viewDidLayoutSubviews();
        rootViewController.viewDidAppear(false);

        //set up navigationjBar and toolBar
        updateUI(rootViewController);
        return this;
    }

    public MyAppController getRootViewController() {
        return rootViewController;
    }

    public void setRootViewController(MyAppController rootViewController) {
        this.rootViewController = rootViewController;
    }

    public NSArray<MyAppController> getViewControllers() {
        return viewControllers;
    }

    public void setViewControllers(NSArray<MyAppController> newviewControllers) {
        this.viewControllers = newviewControllers;
        //Add first view controller as rootController
        if (viewControllers == null) {
            viewControllers = new NSArray<MyAppController>();
        }
        if(viewControllers.count()>0) {
            rootViewController = viewControllers.getWrappedList().get(0);
            if (rootViewController.getNavigationController() == null)
                rootViewController.setNavigationController(this);

            //hidetoolbar
            getToolbar().setVisibility(View.GONE);

            //update naviagtion view
            rootViewController.viewDidLoad();
            rootViewController.viewWillAppear(false);
            rootViewController.viewWillLayoutSubviews();
            if (content != null) {
                content.removeAllViews();
                rootViewController.getView().setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,RelativeLayout.LayoutParams.MATCH_PARENT));
                content.addView(rootViewController.getView());
            }
            rootViewController.viewDidLayoutSubviews();
            rootViewController.viewDidAppear(false);

            //set up navigationjBar and toolBar
            updateUI(rootViewController);
        }
    }

    @Override
    public void loadView() {
        super.loadView();
        int c_resID = AndroidRessourcesUtils.getResID("custom_content", "id");
        int t_resID = AndroidRessourcesUtils.getResID("toolbar", "id");
        int n_resID = AndroidRessourcesUtils.getResID("navbar", "id");
        content = (RelativeLayout) getView().findViewById(c_resID);
        navigationBar = (MyAppNavigationBar) getView().findViewById(n_resID);
        toolbar = (MyAppToolbar) getView().findViewById(t_resID);

    }

    public void initWithNavigationBarClassToolbarClass(MyAppNavigationBar myAppNavigationBar, MyAppToolbar myAppToolbar) {
        if (myAppNavigationBar != null)
            this.setNavigationBar(myAppNavigationBar);
        if (myAppToolbar != null)
            this.setToolbar(myAppToolbar);
        navigationController = (this);
    }

    /**
     * prepare the Navigationbar,NavigationItems for the current view
     */
    private void updateUI(MyAppController nextController){
        //reset ui
        getNavigationBar().getMenu().clear();
        getNavigationBar().getItems().getWrappedList().clear();
        getNavigationBar().setTitle("");

        //reset toolbar
        getToolbar().getItems().getWrappedList().clear();
        getToolbar().getMenu().clear();

        if(nextController.getNavigationItem()!=null) {
            //set title
            if (nextController.getNavigationItem().getTitle() != null) {
                getNavigationBar().setTitle(nextController.getNavigationItem().getTitle().getWrappedString());
            }
            //Right button
            if(nextController.getNavigationItem().getRightBarButtonItem()!=null){
                final MyAppBarButtonItem r_item = nextController.getNavigationItem().getRightBarButtonItem();
                MenuItem mitem = getNavigationBar().getMenu().add("");
                if(nextController.getNavigationItem().getRightBarButtonItem().getTitle()!=null) {
                    mitem.setTitle(r_item.getTitle().getWrappedString());
                }else if(r_item.getImage()!=null){
                    mitem.setIcon(r_item.getImage());
                }
                mitem.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);

                if(r_item.getCustomView()!=null){
                    mitem.setActionView(r_item.getCustomView());
                }
                r_item.setMenuItem(mitem);
                final SEL sel = r_item.getActionTarget();
                final Object targetAction = r_item.getTargetAction();

                r_item.getMenuItem().setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        try {
                            InvokableHelper.invoke(targetAction, sel.getMethodName(), r_item);
                        } catch (IllegalArgumentException e) {
                            Log.d("Exception ", "Message :" + e.getMessage() + "\n StackTrace: " + Log.getStackTraceString(e));
                        }
                        return true;
                    }
                });
            }
            //Left button
            if(nextController.getNavigationItem().getLeftBarButtonItem()!=null){
                final MyAppBarButtonItem l_item = nextController.getNavigationItem().getLeftBarButtonItem();
                MenuItem mitem = getNavigationBar().getMenu().add("");
                if(l_item.getTitle()!=null) {
                    mitem.setTitle(l_item.getTitle().getWrappedString());
                }else if(l_item.getImage()!=null){
                    mitem.setIcon(l_item.getImage());
                }
                mitem.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);

                if(l_item.getCustomView()!=null){
                    mitem.setActionView(l_item.getCustomView());
                }
                l_item.setMenuItem(mitem);
                final SEL sel = l_item.getActionTarget();
                final Object targetAction = l_item.getTargetAction();

                l_item.getMenuItem().setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        try {
                            InvokableHelper.invoke(targetAction, sel.getMethodName(), l_item);
                        } catch (IllegalArgumentException e) {
                            Log.d("Exception ", "Message :" + e.getMessage() + "\n StackTrace: " + Log.getStackTraceString(e));
                        }
                        return true;
                    }
                });
            }

            //Right buttons
            for(final MyAppBarButtonItem value:nextController.getNavigationItem().getRightBarButtonItems()){
                MenuItem mitem = getNavigationBar().getMenu().add(value.getTitle().getWrappedString());
                mitem.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);

                if(value.getCustomView()!=null){
                    mitem.setActionView(value.getCustomView());
                }
                value.setMenuItem(mitem);
                final SEL sel = value.getActionTarget();
                final Object targetAction = value.getTargetAction();

                value.getMenuItem().setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        try {
                            InvokableHelper.invoke(targetAction, sel.getMethodName(), value);
                        } catch (IllegalArgumentException e) {
                            Log.d("Exception ", "Message :" + e.getMessage() + "\n StackTrace: " + Log.getStackTraceString(e));
                        }
                        return true;
                    }
                });
            }
            //Left buttons
            for(final MyAppBarButtonItem value:nextController.getNavigationItem().getRightBarButtonItems()){
                MenuItem mitem = getNavigationBar().getMenu().add(value.getTitle().getWrappedString());
                mitem.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);

                if(value.getCustomView()!=null){
                    mitem.setActionView(value.getCustomView());
                }
                value.setMenuItem(mitem);
                final SEL sel = value.getActionTarget();
                final Object targetAction = value.getTargetAction();

                value.getMenuItem().setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        try {
                            InvokableHelper.invoke(targetAction, sel.getMethodName(), value);
                        } catch (IllegalArgumentException e) {
                            Log.d("Exception ", "Message :" + e.getMessage() + "\n StackTrace: " + Log.getStackTraceString(e));
                        }
                        return true;
                    }
                });
            }

            //toolbar

            for (final MyAppBarButtonItem item : nextController.getToolbarItems()) {

                if(item.getTitle()!=null) {
                    item.setMenuItem(getToolbar().getMenu().add(item.getTitle().getWrappedString()));
                    item.getMenuItem().setShowAsActionFlags(MenuItem.SHOW_AS_ACTION_IF_ROOM);
                }else {
                    item.setMenuItem(getToolbar().getMenu().add(""));
                    item.getMenuItem().setIcon(item.getImage());
                    item.getMenuItem().setShowAsActionFlags(MenuItem.SHOW_AS_ACTION_ALWAYS);
                }

                final SEL sel = item.getActionTarget();
                final Object targetAction = item.getTargetAction();

                item.getMenuItem().setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem items) {
                        try {
                            InvokableHelper.invoke(targetAction, sel.getMethodName(), item);
                        } catch (IllegalArgumentException e) {
                            Log.d("Exception ", "Message :" + e.getMessage() + "\n StackTrace: " + Log.getStackTraceString(e));
                        }
                        return true;
                    }
                });
            }
        }
    }




}
