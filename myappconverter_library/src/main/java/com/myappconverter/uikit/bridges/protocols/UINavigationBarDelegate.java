package com.myappconverter.uikit.bridges.protocols;

import com.myappconverter.uikit.myappclasses.MyAppNavigationBar;
import com.myappconverter.uikit.myappclasses.MyAppNavigationItem;


public interface UINavigationBarDelegate {
    public boolean navigationBarShouldPushItem(
        MyAppNavigationBar myAppNavigationBar, MyAppNavigationItem item);

    public void navigationBarDidPushItem(
        MyAppNavigationBar myAppNavigationBar, MyAppNavigationItem item);

    public boolean navigationBarShouldPopItem(
        MyAppNavigationBar myAppNavigationBar, MyAppNavigationItem item);

    public void navigationBarDidPopItem(MyAppNavigationBar myAppNavigationBar,
        MyAppNavigationItem item);
}
