package com.myappconverter.uikit.myappclasses;

import com.myappconverter.java.foundations.NSMutableAttributedString;
import com.myappconverter.java.foundations.NSRange;

import com.myappconverter.uikit.bridges.protocols.NSTextStorageDelegate;
import com.myappconverter.uikit.util.UIKitEnums.NSTextStorageEditActions;


public class MyAppTextStorage extends NSMutableAttributedString {
    private NSTextStorageDelegate delegate;
    private NSTextStorageEditActions editedMask;
    private int changeInLength;
    private NSRange editedRange;

    //NSArray layoutManagers;
    public NSTextStorageDelegate getDelegate() {
        return delegate;
    }

    public void setDelegate(NSTextStorageDelegate delegate) {
        this.delegate = delegate;
    }

    public NSTextStorageEditActions getEditedMask() {
        return editedMask;
    }

    public void setEditedMask(NSTextStorageEditActions editedMask) {
        this.editedMask = editedMask;
    }

    public int getChangeInLength() {
        return changeInLength;
    }

    public void setChangeInLength(int changeInLength) {
        this.changeInLength = changeInLength;
    }

    public NSRange getEditedRange() {
        return editedRange;
    }

    public void setEditedRange(NSRange editedRange) {
        this.editedRange = editedRange;
    }
}
