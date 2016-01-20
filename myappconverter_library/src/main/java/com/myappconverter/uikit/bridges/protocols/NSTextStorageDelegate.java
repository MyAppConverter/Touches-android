package com.myappconverter.uikit.bridges.protocols;

import com.myappconverter.java.foundations.NSRange;

import com.myappconverter.uikit.myappclasses.MyAppTextStorage;
import com.myappconverter.uikit.util.UIKitEnums.NSTextStorageEditActions;


public interface NSTextStorageDelegate {
    void textStorageWillProcessEditingrangeChangeInLength(
        MyAppTextStorage textStorage, NSTextStorageEditActions editedMask,
        NSRange editedRange, int delta);

    void textStorageDidProcessEditingRangeChangeInLength(
        MyAppTextStorage textStorage, NSTextStorageEditActions editedMask,
        NSRange editedRange, int delta);
}
