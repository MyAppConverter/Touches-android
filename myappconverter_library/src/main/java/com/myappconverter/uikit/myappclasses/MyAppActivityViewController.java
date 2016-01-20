package com.myappconverter.uikit.myappclasses;

import android.content.Intent;

import com.myappconverter.java.foundations.NSArray;
import com.myappconverter.java.foundations.NSString;


public class MyAppActivityViewController {
    public Intent intent;
    public NSArray<NSString> excludedActivityTypes = null;
    public UIActivityViewControllerCompletionHandler completionHandler = new UIActivityViewControllerCompletionHandler() {
            @Override
            public void _UIActivityViewControllerCompletionHandler(
                NSString pActivityType, boolean pCompleted) {
            }
        };

    public MyAppActivityViewController() {
    }

    public UIActivityViewControllerCompletionHandler getCompletionHandler() {
        return completionHandler;
    }

    public void setCompletionHandler(
        UIActivityViewControllerCompletionHandler pCompletionHandler) {
        completionHandler = pCompletionHandler;
    }

    public NSArray<NSString> getExcludedActivityTypes() {
        return excludedActivityTypes;
    }

    public void setExcludedActivityTypes(
        NSArray<NSString> pExcludedActivityTypes) {
        excludedActivityTypes = pExcludedActivityTypes;
    }

    public Intent getIntent() {
        return intent;
    }

    public void setIntent(Intent intent) {
        this.intent = intent;
    }

    public static interface UIActivityViewControllerCompletionWithItemsHandler {
        void _UIActivityViewControllerCompletionWithItemsHandler(
            NSString activityType, boolean completed);
    }

    public interface UIActivityViewControllerCompletionHandler {
        void _UIActivityViewControllerCompletionHandler(NSString activityType,
            boolean completed);
    }
}
