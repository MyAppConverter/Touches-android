package com.myappconverter.uikit.myappclasses;

import android.app.Activity;

import android.view.Window;
import android.view.WindowManager;

import com.myappconverter.mapping.utils.GenericMainContext;

import com.myappconverter.uikit.bridges.protocols.UIApplicationDelegate;

import com.myappconverter.util.DisplayHelper;

import java.util.ArrayList;
import java.util.List;


public class MyAppApplication {
    private static MyAppApplication instance;
    public static MyAppApplication sharedInstance = null;
    List<MyAppWindow> windows;
    private boolean idleTimerDisabled;
    private MyAppWindow keyWindow;
    private int statusBarStyle;
    private boolean statusbarhidden = false;
    private boolean networkActivityIndicatorVisible;
    private Activity context = null;
    public UIApplicationDelegate delegate;

    public MyAppApplication() {
        windows = new ArrayList<MyAppWindow>();
        idleTimerDisabled = false;
        setContext(GenericMainContext.sharedContext);
    }

    public static synchronized MyAppApplication sharedApplication() {
        if (instance == null) {
            instance = new MyAppApplication();
        }

        return instance;
    }

    public boolean isIdleTimerDisabled() {
        return idleTimerDisabled;
    }

    public void setIdleTimerDisabled(boolean isIdleTimerDisabled) {
        this.idleTimerDisabled = isIdleTimerDisabled;
    }

    public int getStatusBarStyle() {
        return statusBarStyle;
    }

    public void setStatusBarStyle(int UIStatusBarStyle) {
        this.statusBarStyle = UIStatusBarStyle;
    }

    public void setStatusBarStyle(int UIStatusBarStyle, boolean animated) {
        this.statusBarStyle = UIStatusBarStyle;
    }

    public boolean isNetworkActivityIndicatorVisible() {
        return networkActivityIndicatorVisible;
    }

    public void setNetworkActivityIndicatorVisible(
        boolean networkActivityIndicatorVisible) {
        this.networkActivityIndicatorVisible = networkActivityIndicatorVisible;
    }

    public void setKeyWindow(MyAppWindow window) {
        if (!windows.contains(window)) {
            windows.add(window);
        }

        keyWindow = window;
    }

    public MyAppWindow getKeyWindow() {
        return keyWindow;
    }

    public Activity getContext() {
        return context;
    }

    public void setContext(Activity context) {
        this.context = context;
    }

    public List<MyAppWindow> getWindows() {
        return new ArrayList<MyAppWindow>(windows);
    }

    public void setStatusBarHidden(boolean statusbarhidden) {
        setStatusBarHidden(statusbarhidden, false);
    }

    public void setStatusBarHidden(boolean statusbarhidden, boolean animated) {
        Window w = GenericMainContext.sharedContext.getWindow();

        if (statusbarhidden) {
            w.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
            w.clearFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
        } else {
            w.addFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
            w.clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }

        this.statusbarhidden = statusbarhidden;
        DisplayHelper.updateRatios(); // call this AFTER updating statusbarhidden variable

        if (keyWindow != null) {
            // keyWindow.updateStatusBarDelta();
            // keyWindow.setNeedsDisplay();
        }
    }

    public boolean isStatusBarHidden() {
        return statusbarhidden;
    }
}
