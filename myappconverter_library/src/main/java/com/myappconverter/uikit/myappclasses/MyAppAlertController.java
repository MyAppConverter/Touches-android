package com.myappconverter.uikit.myappclasses;

import android.annotation.SuppressLint;

import android.app.AlertDialog;

import android.app.AlertDialog.Builder;

import android.content.Context;

import android.util.AttributeSet;

import android.widget.RelativeLayout;

import com.myappconverter.uikit.util.UIKitEnums.UIAlertControllerStyle;


public class MyAppAlertController extends RelativeLayout {
    private AlertDialog.Builder mBuilder;
    private MyAppActionSheet mMyAppActionSheet;
    private UIAlertControllerStyle mPreferredStyle;

    // UIAlertControllerStyle.UIAlertControllerStyleActionSheet is the default value
    public MyAppAlertController(Context context) {
        super(context);
        mMyAppActionSheet = new MyAppActionSheet(context);
        mBuilder = new Builder(context);
        mPreferredStyle = UIAlertControllerStyle.UIAlertControllerStyleActionSheet;
    }

    public MyAppAlertController(Context context, AttributeSet attrs,
        int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        mMyAppActionSheet = new MyAppActionSheet(context);
        mBuilder = new Builder(context);
        mPreferredStyle = UIAlertControllerStyle.UIAlertControllerStyleActionSheet;
    }

    public MyAppAlertController(Context context, AttributeSet attrs,
        int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mMyAppActionSheet = new MyAppActionSheet(context);
        mBuilder = new Builder(context);
        mPreferredStyle = UIAlertControllerStyle.UIAlertControllerStyleActionSheet;
    }

    public MyAppAlertController(Context context, AttributeSet attrs) {
        super(context, attrs);
        mMyAppActionSheet = new MyAppActionSheet(context);
        mBuilder = new Builder(context);
        mPreferredStyle = UIAlertControllerStyle.UIAlertControllerStyleActionSheet;
    }

    public AlertDialog.Builder getBuilder() {
        return mBuilder;
    }

    public void setBuilder(AlertDialog.Builder mBuilder) {
        this.mBuilder = mBuilder;
    }

    public MyAppActionSheet getMyAppActionSheet() {
        return mMyAppActionSheet;
    }

    public void setMyAppActionSheet(MyAppActionSheet mMyAppActionSheet) {
        this.mMyAppActionSheet = mMyAppActionSheet;
    }

    public UIAlertControllerStyle getPreferredStyle() {
        return mPreferredStyle;
    }

    public void setPreferredStyle(UIAlertControllerStyle preferredStyle) {
        this.mPreferredStyle = preferredStyle;
    }
}
