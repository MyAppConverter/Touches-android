package com.myappconverter.uikit.bridges.protocols;

import android.graphics.drawable.Drawable;

import com.myappconverter.java.foundations.NSDictionary;

import com.myappconverter.uikit.myappclasses.MyAppImagePickerController;


public interface UIImagePickerControllerDelegate {
    public void imagePickerControllerDidFinishPickingMediaWithInfo(
        MyAppImagePickerController picker, NSDictionary info);

    public void imagePickerControllerDidFinishPickingMediaWithInfo(
        MyAppImagePickerController picker, Drawable image,
        NSDictionary editingInfo);

    public void imagePickerControllerDidCancel(
        MyAppImagePickerController picker);
}
