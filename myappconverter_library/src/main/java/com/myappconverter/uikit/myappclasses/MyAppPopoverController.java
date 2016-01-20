package com.myappconverter.uikit.myappclasses;

public class MyAppPopoverController extends MyAppController {
    /*
     * PopoverView
     */
    private MyAppPopoverView myAppPopoverView;

    public MyAppPopoverController(MyAppPopoverView myAppPopoverView) {
        super();
        this.myAppPopoverView = myAppPopoverView;
    }

    public MyAppPopoverView getMyAppPopoverView() {
        return this.myAppPopoverView;
    }

    public void setMyAppPopoverView(MyAppPopoverView myAppPopoverView) {
        this.myAppPopoverView = myAppPopoverView;
    }
}
