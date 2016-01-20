package com.myappconverter.uikit.myappclasses;

import android.content.Context;

import android.util.AttributeSet;

import android.view.View;
import android.view.ViewGroup;

import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.myappconverter.java.coregraphics.CGGeometry;
import com.myappconverter.java.coregraphics.CGPoint;
import com.myappconverter.java.coregraphics.CGRect;
import com.myappconverter.java.coregraphics.CGSize;

import com.myappconverter.mapping.utils.GenericMainContext;

import com.myappconverter.util.DisplayHelper;


public class MyAppWindow extends RelativeLayout {
    private MyAppWindow wrappedViewGroup;
    private MyAppController rootViewController;
    private boolean keyWindow;
    private MyAppScreen screen;

    public MyAppWindow() {
        super(GenericMainContext.sharedContext);
    }

    public MyAppWindow(CGRect frame) {
        super(GenericMainContext.sharedContext);
    }

    public MyAppWindow(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyAppWindow(Context context) {
        super(context);
    }

    public MyAppWindow(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void makeHidden() {
        if (this.isShown()) {
            this.setVisibility(View.INVISIBLE);

            if (this.getScreen() != null) {
                this.getScreen()._removeWindow(this);

                //NSNotificationCenter.defaultCenter().postNotificationNameObject(UIKitEnums.UIWindowDidBecomeHiddenNotification, this);
            }
        }
    }

    public void setRootViewController(MyAppController controller) {
        this.rootViewController = controller;
    }

    public MyAppController getRootViewController() {
        return rootViewController;
    }

    public MyAppScreen getScreen() {
        return screen;
    }

    public void setScreen(MyAppScreen screen) {
        this.screen = screen;
    }
}
