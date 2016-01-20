package com.myappconverter.uikit.myappclasses;

import android.graphics.drawable.Drawable;

import com.myappconverter.java.coregraphics.CGRect;
import com.myappconverter.java.foundations.NSData;
import com.myappconverter.java.foundations.NSFileWrapper;
import com.myappconverter.java.foundations.NSString;


public class MyAppTextAttachement {
    private CGRect bounds;
    private NSData contents;
    private NSString fileType;
    private Drawable image;
    private NSFileWrapper fileWrapper;

    public CGRect getBounds() {
        return bounds;
    }

    public void setBounds(CGRect bounds) {
        this.bounds = bounds;
    }

    public NSData getContents() {
        return contents;
    }

    public void setContents(NSData contents) {
        this.contents = contents;
    }

    public NSString getFileType() {
        return fileType;
    }

    public void setFileType(NSString fileType) {
        this.fileType = fileType;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public NSFileWrapper getFileWrapper() {
        return fileWrapper;
    }

    public void setFileWrapper(NSFileWrapper fileWrapper) {
        this.fileWrapper = fileWrapper;
    }
}
