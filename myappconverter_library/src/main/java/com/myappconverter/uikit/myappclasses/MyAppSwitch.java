package com.myappconverter.uikit.myappclasses;

import android.graphics.drawable.Drawable;


public class MyAppSwitch {
    // ********************************************************************
    // MEMBERS
    // ********************************************************************

    /**
     * The image displayed when the switch is in the on position.
     */
    private Drawable monImage;

    /**
     * The image displayed while the switch is in the off position.
     */
    private Drawable moffImage;

    /**
     * The color used to tint the outline of the switch when it is turned off.
     */
    private Integer tintColor;

    public Integer getTintColor() {
        return tintColor;
    }

    public void setTintColor(Integer tintColor) {
        this.tintColor = tintColor;
    }

    public Drawable getOnImage() {
        return monImage;
    }

    public void setOnImage(Drawable onImage) {
        this.monImage = onImage;
    }

    public Drawable getOffImage() {
        return moffImage;
    }

    public void setOffImage(Drawable offImage) {
        this.moffImage = offImage;
    }
}
