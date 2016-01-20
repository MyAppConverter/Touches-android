package com.myappconverter.uikit.myappclasses;

import android.content.Context;

import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.widget.ActionMenuPresenter;
import android.support.v7.widget.ActionMenuView;

import android.util.AttributeSet;
import android.util.Log;

import android.view.MenuItem;

import com.myappconverter.java.foundations.NSArray;
import com.myappconverter.java.foundations.SEL;

import com.myappconverter.mapping.utils.GenericMainContext;
import com.myappconverter.mapping.utils.InvokableHelper;

import com.myappconverter.uikit.util.UIViewProperty;


public class MyAppToolbar extends ActionMenuView {
    private NSArray<MyAppBarButtonItem> mItems = new NSArray<MyAppBarButtonItem>();
    private ActionMenuPresenter mPresenter;
    private MenuBuilder mMenuBuilder;

    public MyAppToolbar(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyAppToolbar(Context context) {
        super(context);
        init();
    }

    public MyAppToolbar() {
        this(GenericMainContext.sharedContext);
    }

    public ActionMenuPresenter getPresenter() {
        return mPresenter;
    }

    public MenuBuilder getMenuBuilder() {
        return mMenuBuilder;
    }

    public void setMenuBuilder(MenuBuilder menuBuilder) {
        this.mMenuBuilder = menuBuilder;
    }

    public NSArray<MyAppBarButtonItem> getItems() {
        return mItems;
    }

    public void setItems(NSArray<MyAppBarButtonItem> items) {
        this.mItems = items;
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        init();
    }

    public void loadItems(Object object) {
        try {
            int resID = GenericMainContext.sharedContext.getResources()
                                                        .getIdentifier(getTag()
                                                                           .toString(),
                    "menu", GenericMainContext.sharedContext.getPackageName());

            ActionMenuPresenter presenter = new ActionMenuPresenter(GenericMainContext.sharedContext);
            presenter.setReserveOverflow(true);
            presenter.setWidthLimit(getResources().getDisplayMetrics().widthPixels,
                true);
            presenter.setItemLimit(Integer.MAX_VALUE);

            GenericMainContext.sharedContext.getMenuInflater()
                                            .inflate(resID, getMenuBuilder());

            getMenuBuilder()
                .addMenuPresenter(presenter, GenericMainContext.sharedContext);

            setPresenter(presenter);

            presenter.updateMenuView(true);

            for (MenuItem m : getMenuBuilder().getActionItems()) {
                {
                    MyAppBarButtonItem myAppBarButtonItem = new MyAppBarButtonItem(m);
                    final SEL actionTarget = new SEL(m.getTitleCondensed()
                                                      .toString());

                    final Object targetAction = object;

                    myAppBarButtonItem.setTargetAction(targetAction);
                    myAppBarButtonItem.setActionTarget(actionTarget);

                    m.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                            @Override
                            public boolean onMenuItemClick(MenuItem item) {
                                try {
                                    InvokableHelper.invoke(targetAction,
                                        actionTarget.getMethodName(), item);
                                } catch (IllegalArgumentException e) {
                                    Log.d("Exception ",
                                        "Message :" + e.getMessage() +
                                        "\n StackTrace: " +
                                        Log.getStackTraceString(e));
                                }

                                return false;
                            }
                        });
                    setItems((NSArray) new NSArray<MyAppBarButtonItem>().initWithObjects(
                            myAppBarButtonItem));
                }
            }
        } catch (Exception e) {
            Log.e("MyApptoolBar",
                "Error inflating menu items >>" + e.getMessage());
        }
    }

    protected void init() {
        setTag(new UIViewProperty());
        mMenuBuilder = new MenuBuilder(GenericMainContext.sharedContext);
        mPresenter = new ActionMenuPresenter(GenericMainContext.sharedContext);
        mPresenter.setReserveOverflow(true);
        mPresenter.setWidthLimit((GenericMainContext.sharedContext).getResources()
                                  .getDisplayMetrics().widthPixels, true);
        mPresenter.setItemLimit(Integer.MAX_VALUE);
        setPresenter(mPresenter);
    }
}
