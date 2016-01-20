package com.myappconverter.uikit.myappclasses;

import android.graphics.drawable.Drawable;

import com.myappconverter.java.foundations.NSArray;
import com.myappconverter.java.foundations.NSObject;
import com.myappconverter.java.foundations.NSString;

import com.myappconverter.uikit.util.UIKitEnums.UIActivityCategory;


public abstract class MyAppActivity {
    public abstract UIActivityCategory activityCategory(
        MyAppActivity myAppActivity);

    public abstract NSString activityType(MyAppActivity myAppActivity);

    public abstract NSString activityTitle(MyAppActivity myAppActivity);

    public abstract Drawable activityImage(MyAppActivity myAppActivity);

    public abstract boolean canPerformWithActivityItems(
        MyAppActivity myAppActivity, NSArray<NSObject> activityItems);

    public abstract void prepareWithActivityItems(MyAppActivity myAppActivity,
        NSArray<NSObject> activityItems);

    public abstract MyAppController activityViewController(
        MyAppActivity myAppActivity);

    public abstract void performActivity(MyAppActivity myAppActivity);

    public abstract void activityDidFinish(MyAppActivity myAppActivity,
        boolean completed);
}
