package com.myappconverter.uikit.myappclasses;

import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.widget.ActionMenuPresenter;

import com.myappconverter.java.foundations.NSArray;
import com.myappconverter.java.foundations.NSString;
import com.myappconverter.mapping.utils.GenericMainContext;

public class MyAppNavigationItem {

    public MyAppNavigationItem() {

        menuBuilder = new MenuBuilder(GenericMainContext.sharedContext);
        presenter = new ActionMenuPresenter(GenericMainContext.sharedContext);
        presenter.setReserveOverflow(true);
        presenter.setWidthLimit((GenericMainContext.sharedContext).getResources().getDisplayMetrics().widthPixels, true);
        presenter.setItemLimit(Integer.MAX_VALUE);

    }


    public ActionMenuPresenter presenter;

    public MenuBuilder menuBuilder;

    private NSString title;
    private NSString prompt;

    private MyAppBarButtonItem backBarButtonItem;

    private boolean hidesBackButton;

    private boolean leftItemsSupplementBackButton;

    private NSArray<MyAppBarButtonItem> leftBarButtonItems = new NSArray<>();
    private MyAppBarButtonItem leftBarButtonItem;
    private NSArray<MyAppBarButtonItem> rightBarButtonItems = new NSArray<>();
    private MyAppBarButtonItem rightBarButtonItem;

    public NSArray<MyAppBarButtonItem> getLeftBarButtonItems() {
        return leftBarButtonItems;
    }

    public void setLeftBarButtonItems(NSArray<MyAppBarButtonItem> leftBarButtonItems) {
        this.leftBarButtonItems = leftBarButtonItems;
    }

    public MyAppBarButtonItem getLeftBarButtonItem() {
        return leftBarButtonItem;
    }

    public void setLeftBarButtonItem(MyAppBarButtonItem leftBarButtonItem) {
        this.leftBarButtonItem = leftBarButtonItem;
    }

    public NSArray<MyAppBarButtonItem> getRightBarButtonItems() {
        return rightBarButtonItems;
    }

    public void setRightBarButtonItems(NSArray<MyAppBarButtonItem> rightBarButtonItems) {
        this.rightBarButtonItems = rightBarButtonItems;
    }

    public MyAppBarButtonItem getRightBarButtonItem() {
        return rightBarButtonItem;
    }

    public void setRightBarButtonItem(MyAppBarButtonItem rightBarButtonItem) {
        this.rightBarButtonItem = rightBarButtonItem;
    }

    public NSString getTitle() {
        return title;
    }

    public void setTitle(NSString title) {
        this.title = title;
    }

    public MyAppBarButtonItem getBackBarButtonItem() {
        return backBarButtonItem;
    }

    public void setBackBarButtonItem(MyAppBarButtonItem backBarButtonItem) {
        this.backBarButtonItem = backBarButtonItem;
    }

    public boolean isHidesBackButton() {
        return hidesBackButton;
    }

    public void setHidesBackButton(boolean hidesBackButton) {
        this.hidesBackButton = hidesBackButton;
    }

    public boolean isLeftItemsSupplementBackButton() {
        return leftItemsSupplementBackButton;
    }

    public void setLeftItemsSupplementBackButton(boolean leftItemsSupplementBackButton) {
        this.leftItemsSupplementBackButton = leftItemsSupplementBackButton;
    }

    public NSString getPrompt() {
        return prompt;
    }

    public void setPrompt(NSString prompt) {
        this.prompt = prompt;
    }

}
