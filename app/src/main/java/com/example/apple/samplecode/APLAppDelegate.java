/*
 * Copyright (c) 2015 MyAppConverter
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the MyAppConverter License v1.0
 * which accompanies this distribution, and is available at
 * http://www.myappconverter.com/legal/epl-v1.html
 *
 * Contributors:
 *    MyAppConverter Core Team - initial API and implementation
 * @date : Oct, 02 2015 - 17:20:51
 */
package com.example.apple.samplecode;

import android.app.Activity;
import android.app.Activity;
import android.app.Application;

import android.inputmethodservice.KeyboardView;
import android.inputmethodservice.KeyboardView;

import android.inputmethodservice.KeyboardView.OnKeyboardActionListener;
import android.inputmethodservice.KeyboardView.OnKeyboardActionListener;

import android.os.Bundle;

import android.view.MotionEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup;

import com.myappconverter.java.coregraphics.CGGeometry;
import com.myappconverter.java.coregraphics.CGGeometry;
import com.myappconverter.java.coregraphics.CGPoint;
import com.myappconverter.java.coregraphics.CGPoint;
import com.myappconverter.java.coregraphics.CGRect;
import com.myappconverter.java.coregraphics.CGRect;
import com.myappconverter.java.foundations.NSArray;
import com.myappconverter.java.foundations.NSArray;
import com.myappconverter.java.foundations.NSCoder;
import com.myappconverter.java.foundations.NSData;
import com.myappconverter.java.foundations.NSDictionary;
import com.myappconverter.java.foundations.NSDictionary;
import com.myappconverter.java.foundations.NSError;
import com.myappconverter.java.foundations.NSObject;
import com.myappconverter.java.foundations.NSObject;
import com.myappconverter.java.foundations.NSSet;
import com.myappconverter.java.foundations.NSSet;
import com.myappconverter.java.foundations.NSString;
import com.myappconverter.java.foundations.NSString;
import com.myappconverter.java.foundations.NSURL;
import com.myappconverter.java.foundations.utilities.*;

import com.myappconverter.mapping.utils.*;
import com.myappconverter.mapping.utils.GenericMainContext;
import com.myappconverter.mapping.utils.GenericMainContext;
import com.myappconverter.mapping.utils.GenericMainContext;

import com.myappconverter.uikit.bridges.protocols.UIApplicationDelegate;
import com.myappconverter.uikit.myappclasses.BaseAppDelegate;
import com.myappconverter.uikit.myappclasses.BaseAppDelegate;
import com.myappconverter.uikit.myappclasses.BaseAppDelegate;
import com.myappconverter.uikit.myappclasses.MyAppApplication;
import com.myappconverter.uikit.myappclasses.MyAppApplication;
import com.myappconverter.uikit.myappclasses.MyAppApplication;
import com.myappconverter.uikit.myappclasses.MyAppController;
import com.myappconverter.uikit.myappclasses.MyAppController;
import com.myappconverter.uikit.myappclasses.MyAppController;
import com.myappconverter.uikit.myappclasses.MyAppFont;
import com.myappconverter.uikit.myappclasses.MyAppNavigationController;
import com.myappconverter.uikit.myappclasses.MyAppScreen;
import com.myappconverter.uikit.myappclasses.MyAppScreen;
import com.myappconverter.uikit.myappclasses.MyAppTabBarController;
import com.myappconverter.uikit.myappclasses.MyAppTouch;
import com.myappconverter.uikit.myappclasses.MyAppTouch;
import com.myappconverter.uikit.myappclasses.MyAppWindow;
import com.myappconverter.uikit.myappclasses.MyAppWindow;
import com.myappconverter.uikit.util.UIKitEnums;
import com.myappconverter.uikit.util.UIKitEnums;
import com.myappconverter.uikit.util.UIKitEnums.UIEventSubtype;
import com.myappconverter.uikit.util.UIKitEnums.UIEventSubtype;
import com.myappconverter.uikit.util.UIKitEnums.UIInterfaceOrientation;
import com.myappconverter.uikit.util.UIViewProperty;
import com.myappconverter.uikit.util.UIViewProperty;

import com.myappconverter.util.DisplayHelper;
import com.myappconverter.util.DisplayHelper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Method;


public class APLAppDelegate extends BaseAppDelegate {
    /**
     * The cached value of the '<em>_window</em>' property.
     * @see #get_window()
     * @generated
     * @ordered
     */
    public MyAppWindow _window;

    /**default getter of _window */
    public MyAppWindow getWindow() {
        return this._window;
    }

    /**default setter of _window */
    public void setWindow(MyAppWindow _window) {
        this._window = _window;
    }

    @Override
    public boolean applicationDidFinishLaunchingWithOptions(
        MyAppApplication application, NSDictionary launchOptions) {
        initControllersIdentifiers();
        initRootViewController(application);

        return true;
    }

    private void initRootViewController(MyAppApplication application) {
        APLViewController sgViewController = (APLViewController) (new APLViewController()).init();
        ((BaseAppDelegate) GenericMainContext.sharedContext.getApplication()).pushViewControllerAnimated(sgViewController,
            false);
    }

    private void initControllersIdentifiers() {
    }
}
