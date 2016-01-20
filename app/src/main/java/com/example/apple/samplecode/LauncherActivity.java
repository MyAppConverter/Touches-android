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
 * @date : Jul, 29 2015 - 23:26:16
 */

package com.example.apple.samplecode;

import java.lang.ref.SoftReference;
import java.util.Stack;

import android.os.Bundle;
import android.support.v7.widget.ActionMenuView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.myappconverter.java.ios.util.GenericCustomActivity;
import com.myappconverter.mapping.utils.GenericMainContext;
import com.myappconverter.uikit.myappclasses.BaseAppDelegate;
import com.myappconverter.uikit.myappclasses.MyAppController;
import com.myappconverter.uikit.myappclasses.MyAppNavigationBar;
import com.myappconverter.uikit.myappclasses.MyAppToolbar;
import com.myappconverter.uikit.myappclasses.MyAppWindow;
import com.myappconverter.util.DisplayHelper;

public class LauncherActivity extends GenericCustomActivity {


    public Stack<SoftReference<MyAppController>> viewControllersStack = new Stack<SoftReference<MyAppController>>();


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GenericMainContext.sharedContext = this;
        setContentView(R.layout.launcher_activity);
        DisplayHelper.updateRatios();

        APLAppDelegate appDelegate = (APLAppDelegate) getApplication();
        appDelegate.contentFrame = (MyAppWindow) findViewById(R.id.content_frame);

        appDelegate.setWindow((MyAppWindow)((BaseAppDelegate) GenericMainContext.sharedContext.getApplication()).contentFrame);
        appDelegate.applicationDidFinishLaunchingWithOptions(null, null);
    }

    @Override
    public void onBackPressed() {
        ((BaseAppDelegate) getApplication()).popViewControllerAnimated(false);
    }


}
