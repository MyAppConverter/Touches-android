package com.myappconverter.uikit.myappclasses;

import android.view.Display;

import com.myappconverter.java.coregraphics.CGRect;
import com.myappconverter.java.foundations.NSArray;
import com.myappconverter.java.foundations.NSMutableArray;

import com.myappconverter.uikit.util.UIKitEnums;


public class MyAppScreen {
    public static UIKitEnums.UIDeviceOrientation orientation = MyAppDevice.currentDevice()
                                                                          .getOrientation();
    public final static MyAppScreen mainScreen = new MyAppScreen();
    public static NSMutableArray<MyAppScreen> allScreens = null;
    private CGRect applicationFrame;
    private NSArray<Display> availableModes;
    private CGRect bounds = new CGRect(0, 0, 320, 480);
    private Display currentMode;
    private MyAppScreen mirroredScreen;
    private float brightness;
    private Display preferredMode;
    private NSMutableArray<MyAppWindow> windows;
    private MyAppWindow keyWindow;

    public MyAppScreen() {
        allScreens = new NSMutableArray<MyAppScreen>();
        windows = new NSMutableArray<MyAppWindow>();

        switch (MyAppDevice.currentDevice().getUserInterfaceIdiom()) {
        case UIUserInterfaceIdiomPhone:
            bounds = new CGRect(0, 0, 320, 480);

            break;

        default:
            bounds = new CGRect(0, 0, 768, 1024);
        }
    }

    public static MyAppScreen mainScreen() {
        return mainScreen;
    }

    public CGRect getBounds() {
        return new CGRect(bounds);
    }

    public void addWindow(MyAppWindow window) {
        windows.addObject(window);
    }

    public void _removeWindow(MyAppWindow window) {
        if (keyWindow.equals(window)) {
            keyWindow = null;
        }

        windows.removeObject(window);
    }

    public NSArray windows() {
        return windows;
    }

    public MyAppWindow getKeyWindow() {
        return keyWindow;
    }

    public void setKeyWindow(MyAppWindow keyWindow) {
        if (this.windows.containsObject(keyWindow)) {
            System.out.println(
                "cannot set key window to a window not on this screen");
        }

        this.keyWindow = keyWindow;
    }

    public CGRect getApplicationFrame() {
        return applicationFrame;
    }

    public void setApplicationFrame(CGRect applicationFrame) {
        this.applicationFrame = applicationFrame;
    }

    public NSArray<Display> getAvailableModes() {
        return availableModes;
    }

    public void setAvailableModes(NSArray<Display> availableModes) {
        this.availableModes = availableModes;
    }

    public void setBounds(CGRect bounds) {
        this.bounds = bounds;
    }

    public Display getCurrentMode() {
        return currentMode;
    }

    public void setCurrentMode(Display currentMode) {
        this.currentMode = currentMode;
    }

    public MyAppScreen getMirroredScreen() {
        return mirroredScreen;
    }

    public void setMirroredScreen(MyAppScreen mirroredScreen) {
        this.mirroredScreen = mirroredScreen;
    }

    public float getBrightness() {
        return brightness;
    }

    public void setBrightness(float brightness) {
        this.brightness = brightness;
    }

    public Display getPreferredMode() {
        return preferredMode;
    }

    public void setPreferredMode(Display preferredMode) {
        this.preferredMode = preferredMode;
    }

    public NSMutableArray<MyAppWindow> getWindows() {
        return windows;
    }

    public void setWindows(NSMutableArray<MyAppWindow> windows) {
        this.windows = windows;
    }
}
