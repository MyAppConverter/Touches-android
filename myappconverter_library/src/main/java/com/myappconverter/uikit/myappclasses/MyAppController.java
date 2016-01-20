package com.myappconverter.uikit.myappclasses;

import android.app.ActionBar;
import android.app.AlertDialog;

import android.content.pm.ActivityInfo;

import android.content.res.Configuration;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.RelativeLayout;

import com.myappconverter.java.foundations.NSArray;
import com.myappconverter.java.foundations.NSString;

import com.myappconverter.mapping.utils.AndroidRessourcesUtils;
import com.myappconverter.mapping.utils.GenericMainContext;

import com.myappconverter.uikit.util.UIKitEnums;
import com.myappconverter.uikit.util.UIKitEnums.UIInterfaceOrientation;
import com.myappconverter.uikit.util.UIViewProperty;


public class MyAppController {
    // UITabBarItem
    public MyAppTabBarItem tabBarItem;
    public View view;
    public MyAppTabBarController tabBarController;
    private AlertDialog modalBuilder;
    public NSArray<MyAppController> childViewControllers;
    public MyAppController parentViewController;
    public MyAppNavigationController navigationController;
    public NSString title;
    public NSString nibName = new NSString("");
    public UIKitEnums.UIModalPresentationStyle modalPresentationStyle;
    public UIKitEnums.UIModalTransitionStyle modalTransitionStyle;
    public boolean definesPresentationContext = false;
    public boolean providesPresentationContextTransitionStyle = false;
    public MyAppController presentingViewController;
    public MyAppController presentedViewController;
    public MyAppSplitViewController splitViewController;
    public MyAppPopoverPresentationController popoverPresentationController;
    public NSArray<MyAppBarButtonItem> toolbarItems = new NSArray();
    public MyAppNavigationItem navigationItem;
    public UIKitEnums.UIInterfaceOrientation interfaceOrientation;
    public MyAppSearchDisplayController searchDisplayController;
    public MyAppController modalViewController;

    public MyAppController getModalViewController() {
        return modalViewController;
    }

    public void setModalViewController(MyAppController modalViewController) {
        this.modalViewController = modalViewController;
    }

    public MyAppSearchDisplayController getSearchDisplayController() {
        return searchDisplayController;
    }

    public void setSearchDisplayController(
        MyAppSearchDisplayController searchDisplayController) {
        this.searchDisplayController = searchDisplayController;
    }

    public UIInterfaceOrientation getInterfaceOrientation() {
        int orientation = GenericMainContext.sharedContext.getResources()
                                                          .getConfiguration().orientation;

        if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            this.interfaceOrientation = UIInterfaceOrientation.UIInterfaceOrientationPortrait;
        } else if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            this.interfaceOrientation = UIInterfaceOrientation.UIInterfaceOrientationLandscapeRight;
        }

        return this.interfaceOrientation;
    }

    public void setInterfaceOrientation(
        UIKitEnums.UIInterfaceOrientation interfaceOrientation) {
        if (interfaceOrientation == UIInterfaceOrientation.UIInterfaceOrientationLandscapeRight) {
            GenericMainContext.sharedContext.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        } else {
            GenericMainContext.sharedContext.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
    }

    public MyAppNavigationItem getNavigationItem() {
        return this.navigationItem;
    }

    public void setNavigationItem(MyAppNavigationItem navigationItem) {
        this.navigationItem = navigationItem;
    }

    public NSArray<MyAppBarButtonItem> getToolbarItems() {
        /*
        MyAppNavigationController navigationController = MyAppController.getNavigationController();
        MyAppNavigationBar navigationBar = navigationController.getNavigationBar();
        NSArray<MyAppNavigationItem> navigationItems = navigationBar.getItems();
        for (MyAppNavigationItem myAppNavigationItem : navigationItems.getWrappedList()) {
                if (myAppNavigationItem.getBackBarButtonItem() != null) {
                        toolbarItems.getWrappedList().add(myAppNavigationItem.getBackBarButtonItem());
                }

                if (myAppNavigationItem.getLeftBarButtonItem() != null) {
                        toolbarItems.getWrappedList().add(myAppNavigationItem.getLeftBarButtonItem());
                }

                if (myAppNavigationItem.getRightBarButtonItem() != null) {
                        toolbarItems.getWrappedList().add(myAppNavigationItem.getRightBarButtonItem());
                }

        }
        */
        return toolbarItems;
    }

    public void setToolbarItems(NSArray<MyAppBarButtonItem> toolbarItems) {
        this.toolbarItems = toolbarItems;
    }

    public MyAppSplitViewController getSplitViewController() {
        return splitViewController;
    }

    public void setSplitViewController(
        MyAppSplitViewController splitViewController) {
        this.splitViewController = splitViewController;
    }

    public MyAppPopoverPresentationController getPopoverPresentationController() {
        return popoverPresentationController;
    }

    public void setPopoverPresentationController(
        MyAppPopoverPresentationController popoverPresentationController) {
        this.popoverPresentationController = popoverPresentationController;
    }

    public MyAppController getPresentingViewController() {
        return presentingViewController;
    }

    public void setPresentingViewController(
        MyAppController presentingViewController) {
        this.presentingViewController = presentingViewController;
    }

    public MyAppController getPresentedViewController() {
        return presentedViewController;
    }

    public void setPresentedViewController(
        MyAppController presentedViewController) {
        this.presentedViewController = presentedViewController;
    }

    public boolean isProvidesPresentationContextTransitionStyle() {
        return providesPresentationContextTransitionStyle;
    }

    public void setProvidesPresentationContextTransitionStyle(
        boolean providesPresentationContextTransitionStyle) {
        this.providesPresentationContextTransitionStyle = providesPresentationContextTransitionStyle;
    }

    public void setDefinesPresentationContext(
        boolean definesPresentationContext) {
        this.definesPresentationContext = definesPresentationContext;
    }

    public boolean getDefinesPresentationContext() {
        return this.definesPresentationContext;
    }

    public NSString getNibName() {
        return nibName;
    }

    public void setNibName(NSString nib) {
        nibName = nib;
    }

    public NSString title() {
        return title;
    }

    public NSString getTitle() {
        return title;
    }

    public void setTitle(MyAppNavigationItem myAppNavigationItem, NSString title) {
        myAppNavigationItem.setTitle(title);
    }

    public void setTitle(NSString title) {
        this.title = title;

        ActionBar ab = GenericMainContext.sharedContext.getActionBar();
        ab.setTitle(title.getWrappedString());
    }

    public View getView() {
        return view;
    }

    public void setModalPresentationStyle(
        UIKitEnums.UIModalPresentationStyle modalStyle) {
        this.modalPresentationStyle = modalStyle;
    }

    public UIKitEnums.UIModalPresentationStyle getModalPresentationStyle() {
        return this.modalPresentationStyle;
    }

    public UIKitEnums.UIModalTransitionStyle getModalTransitionStyle() {
        return modalTransitionStyle;
    }

    public void setModalTransitionStyle(
        UIKitEnums.UIModalTransitionStyle modalTransitionStyle) {
        this.modalTransitionStyle = modalTransitionStyle;
    }

    public void loadView() {
    }

    public void viewDidLoad() {
    }

    public void viewWillAppear(boolean animated) {
    }

    public void viewDidUnLoad() {
    }

    public MyAppController init() {
        String nibName = null;

        try {
            nibName = this.getClass().getSimpleName().toLowerCase();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return initWithNibNameBundle(nibName);
    }

    public void viewWillDisappear(boolean animated) {
    }

    public void viewDidDisappear(boolean animated) {
    }

    public void release() {
    }

    public void viewDidAppear(boolean animated) {
    }

    public void didReceiveMemoryWarning() {
    }

    public MyAppTabBarItem getTabBarItem() {
        if (tabBarItem == null) {
            tabBarItem = new MyAppTabBarItem(new NSString(
                        this.getClass().getSimpleName()), null);
        } else if (tabBarItem.getTitle() == null) {
            tabBarItem.setTitle(new NSString(this.getClass().getSimpleName()));
        }

        return tabBarItem;
    }

    public void setTabBarItem(MyAppTabBarItem tabBarItem) {
        this.tabBarItem = tabBarItem;
    }

    public MyAppTabBarController getTabBarController() {
        return tabBarController;
    }

    public void setTabBarController(MyAppTabBarController tabBarController) {
        this.tabBarController = tabBarController;
    }

    public void setView(View view) {
        this.view = view;
    }

    public void setAlertDialog(AlertDialog alertDialog) {
        this.modalBuilder = alertDialog;
    }

    public AlertDialog getAlertDialog() {
        return this.modalBuilder;
    }

    public MyAppController initWithNibNameBundle(String nibName) {
        if (nibName != null) {
            nibName = nibName.toLowerCase();
            this.nibName.setWrappedString(nibName.toLowerCase());

            int resID = AndroidRessourcesUtils.getResID(nibName, "layout");

            if (resID > 0) {
                LayoutInflater layoutInflater = LayoutInflater.from(GenericMainContext.sharedContext);
                this.view = layoutInflater.inflate(resID, null, false);

                UIViewProperty propertyVC = new UIViewProperty();
                propertyVC.controller = this;
                this.view.setTag(propertyVC);
                loadView();

                try {
                    ((ViewGroup) getView().getParent()).removeAllViews();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                view = new RelativeLayout(GenericMainContext.sharedContext);
                view.setTag(new UIViewProperty());
            }
        }

        return this;
    }

    public void viewWillLayoutSubviews() {
    }

    public void willAnimateRotationToInterfaceOrientationDuration(
        UIInterfaceOrientation toInterfaceOrientation, double duration) {
        // TODO
    }

    public NSArray<MyAppController> getChildViewControllers() {
        return childViewControllers;
    }

    public void setChildViewControllers(
        NSArray<MyAppController> childViewControllers) {
        this.childViewControllers = childViewControllers;
    }

    public void addChildViewController(MyAppController childController) {
        if ((getView() != null) && (childController != null) &&
                (childController.getView() != null)) {
            childController.setParentViewController(this);

            if (childViewControllers == null) {
                childViewControllers = new NSArray();
            }

            childViewControllers.arrayByAddingObject(childController);

            if (childController.getView().getParent() != null) {
                ((ViewGroup) childController.getView().getParent()).removeView(childController.getView());
            }

            ((ViewGroup) getView()).addView(childController.getView());
        }
    }

    public void removeFromParentViewController() {
        if ((getView() != null) && (parentViewController != null) &&
                (parentViewController.getView() != null)) {
            setParentViewController(null);

            if (parentViewController.getChildViewControllers() != null) {
                parentViewController.getChildViewControllers().getWrappedList()
                                    .remove(this);
            }

            if (getView().getParent() != null) {
                ((ViewGroup) parentViewController.getView()).removeView(getView());
            }
        }
    }

    public MyAppController getParentViewController() {
        return parentViewController;
    }

    public void setParentViewController(MyAppController parentViewController) {
        this.parentViewController = parentViewController;
    }

    public MyAppNavigationController getNavigationController() {
        //if (navigationController == null) {
        //	navigationController = new MyAppNavigationController();
        //}
        return navigationController;
    }

    public void setNavigationController(
        MyAppNavigationController navigationController) {
        this.navigationController = navigationController;
    }

    public void viewDidLayoutSubviews() {
    }

    public void startCycelViewforGl() {
        viewDidLoad();
        viewWillAppear(true);
        viewWillLayoutSubviews();
        viewDidLayoutSubviews();
        viewDidAppear(true);
    }

    public void prepareForSegueSender(MyAppStoryboardSegue segue, Object sender) {
    }
}
