package com.myappconverter.uikit.myappclasses;

import android.graphics.Typeface;


public class MyAppFont {
    private Typeface typeface = Typeface.DEFAULT;
    private float fontSize = 0;
    private String mfontName;

    public MyAppFont(Typeface typeFace, float fontSize) {
        this.typeface = typeFace;
        this.fontSize = fontSize;
    }

    public MyAppFont(Typeface typeFace, float fontSize, String name) {
        this.typeface = typeFace;
        this.fontSize = fontSize;
        this.mfontName = name;
    }

    public MyAppFont(float fontSize) {
        this.fontSize = fontSize;
    }

    public MyAppFont(Typeface typeFace) {
        this.typeface = typeFace;
    }

    public Typeface getTypeface() {
        return typeface;
    }

    public void setTypeface(Typeface typeface) {
        this.typeface = typeface;
    }

    public float getFontSize() {
        return fontSize;
    }

    public void setFontSize(float fontSize) {
        this.fontSize = fontSize;
    }

    public String getMfontName() {
        return mfontName;
    }

    public void setMfontName(String mfontName) {
        this.mfontName = mfontName;
    }
}
