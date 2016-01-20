package com.myappconverter.uikit.myappclasses;

import android.graphics.Color;

import com.myappconverter.java.coregraphics.CGSize;


public class MyAppShadow {
    private CGSize mOffset;
    private float mBlurRadius;
    private Object mColor;

    public MyAppShadow() {
        mOffset = new CGSize(0, 0);
        mBlurRadius = 0;
        mColor = Color.BLACK;
    }

    public MyAppShadow(CGSize offset, float blurRadius, Object color) {
        mOffset = offset;
        mBlurRadius = blurRadius;
        mColor = color;
    }

    public MyAppShadow(CGSize offset) {
        mOffset = offset;
        mBlurRadius = 0;
        mColor = Color.BLACK;
    }

    public MyAppShadow(float blurRadius) {
        mBlurRadius = blurRadius;
        mOffset = new CGSize(0, 0);
        mColor = Color.BLACK;
    }

    public MyAppShadow(Object color) {
        mOffset = new CGSize(0, 0);
        mBlurRadius = 0;
        mColor = color;
    }

    public CGSize getOffset() {
        return mOffset;
    }

    public void setOffset(CGSize offset) {
        this.mOffset = offset;
    }

    public float getBlurRadius() {
        return mBlurRadius;
    }

    public void setBlurRadius(float blurRadius) {
        this.mBlurRadius = blurRadius;
    }

    public Object getColor() {
        return mColor;
    }

    public void setColor(Object color) {
        this.mColor = color;
    }
}
