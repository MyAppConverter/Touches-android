package com.myappconverter.uikit.bridges.protocols;

import com.myappconverter.java.foundations.NSArray;

import com.myappconverter.uikit.myappclasses.MyAppTabBarItem;
import com.myappconverter.uikit.util.SlidingTabLayout;


public interface UITabBarDelegate {
    // 1
    /**
     * @Signature: tabBar:didBeginCustomizingItems:
     * @Declaration : - (void)tabBar:(UITabBar *)tabBar didBeginCustomizingItems:(NSArray *)items
     * @Description : Sent to the delegate after the customizing modal view is displayed.
     **/
    public void tabBarDidBeginCustomizingItems(SlidingTabLayout tabBar,
        NSArray<MyAppTabBarItem> items);

    // 2
    /**
     * @Signature: tabBar:didEndCustomizingItems:changed:
     * @Declaration : - (void)tabBar:(UITabBar *)tabBar didEndCustomizingItems:(NSArray *)items changed:(BOOL)changed
     * @Description : Sent to the delegate after the customizing modal view is dismissed.
     **/
    public void tabBarDidEndCustomizingItemsChanged(SlidingTabLayout tabBar,
        NSArray<MyAppTabBarItem> items, boolean changed);

    // 3
    /**
     * @Signature: tabBar:didSelectItem:
     * @Declaration : - (void)tabBar:(UITabBar *)tabBar didSelectItem:(UITabBarItem *)item
     * @Description : Sent to the delegate when the user selects a tab bar item. (required)
     **/
    public void tabBarDidSelectItem(SlidingTabLayout tabBar,
        MyAppTabBarItem item);

    // 4
    /**
     * @Signature: tabBar:willBeginCustomizingItems:
     * @Declaration : - (void)tabBar:(UITabBar *)tabBar willBeginCustomizingItems:(NSArray *)items
     * @Description : Sent to the delegate before the customizing modal view is displayed.
     * @Discussion Use the beginCustomizingItems: method of UITabBar to display the customizing modal view and begin the customizing mode.
     **/
    public void tabBarWillBeginCustomizingItems(SlidingTabLayout tabBar,
        NSArray<MyAppTabBarItem> items);

    // 5
    /**
     * @Signature: tabBar:willEndCustomizingItems:changed:
     * @Declaration : - (void)tabBar:(UITabBar *)tabBar willEndCustomizingItems:(NSArray *)items changed:(BOOL)changed
     * @Description : Sent to the delegate before the customizing modal view is dismissed.
     **/
    public void tabBarWillEndCustomizingItemsChanged(SlidingTabLayout tabBar,
        NSArray<MyAppTabBarItem> items, boolean changed);
}
