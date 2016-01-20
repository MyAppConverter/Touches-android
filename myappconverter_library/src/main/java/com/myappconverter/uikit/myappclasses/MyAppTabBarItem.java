package com.myappconverter.uikit.myappclasses;

import android.graphics.drawable.Drawable;

import com.myappconverter.java.foundations.NSString;


public class MyAppTabBarItem {
    public NSString title;
    public Drawable icon;
    public int postion;

    public MyAppTabBarItem(NSString title, Drawable icon) {
        super();
        this.title = title;
        this.icon = icon;
    }

    public NSString getTitle() {
        return title;
    }

    public void setTitle(NSString title) {
        this.title = title;
    }

    public Drawable getIcon() {
        return icon;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }

    public int getPostion() {
        return postion;
    }

    public void setPostion(int postion) {
        this.postion = postion;
    }
}
