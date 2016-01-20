package com.myappconverter.uikit.myappclasses;

import android.graphics.drawable.Drawable;

import com.myappconverter.java.foundations.NSString;


/**
 * Created by sls on 16/09/15.
 */
public class MyAppBarItem {
    private int tag;
    private boolean enabled;
    private Drawable image;
    private Drawable landscapeImagePhone;
    private MyAppEdgeInsets imageInsets;
    private MyAppEdgeInsets landscapeImagePhoneInsets;
    private NSString title;

    public NSString getTitle() {
        return title;
    }

    public void setTitle(NSString title) {
        this.title = title;
    }

    public MyAppEdgeInsets getLandscapeImagePhoneInsets() {
        return this.landscapeImagePhoneInsets;
    }

    public void setLandscapeImagePhoneInsets(
        MyAppEdgeInsets landscapeImagePhoneInsets) {
        this.landscapeImagePhoneInsets = landscapeImagePhoneInsets;
    }

    public MyAppEdgeInsets getImageInsets() {
        return this.imageInsets;
    }

    public void setImageInsets(MyAppEdgeInsets imageInsets) {
        this.imageInsets = imageInsets;
    }

    public Drawable getLandscapeImagePhone() {
        return this.landscapeImagePhone;
    }

    public void setLandscapeImagePhone(Drawable landscapeImagePhone) {
        this.landscapeImagePhone = landscapeImagePhone;
    }

    public Drawable getImage() {
        return this.image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }
}
