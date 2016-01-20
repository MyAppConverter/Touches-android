package com.myappconverter.uikit.bridges.protocols;

import com.myappconverter.uikit.myappclasses.MyAppActionSheet;


public interface UIActionSheetDelegate {
    public void actionSheetClickedButtonAtIndex(MyAppActionSheet actionSheet,
        int buttonIndex);

    public void actionSheetDidDismissWithButtonIndex(
        MyAppActionSheet actionSheet, int buttonIndex);

    public void actionSheetWillDismissWithButtonIndex(
        MyAppActionSheet actionSheet, int buttonIndex);

    public void actionSheetCancel(MyAppActionSheet actionSheet);

    public void didPresentActionSheet(MyAppActionSheet actionSheet);

    public void willPresentActionSheet(MyAppActionSheet actionSheet);
}
