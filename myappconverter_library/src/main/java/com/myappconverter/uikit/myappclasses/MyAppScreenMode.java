package com.myappconverter.uikit.myappclasses;

import android.app.Activity;

import android.graphics.Point;

import android.os.Build;

import android.view.Display;
import android.view.WindowManager;

import com.myappconverter.mapping.utils.GenericMainContext;


public class MyAppScreenMode {
    private Activity mContext = GenericMainContext.sharedContext;
    private Display wrappedDisplay;

    public Activity getActivity() {
        return mContext;
    }

    public void setActivity(Activity activity) {
        this.mContext = activity;
    }

    public Display getWrappedDisplay() {
        return wrappedDisplay;
    }

    public void setWrappedDisplay(Display wrappedDisplay) {
        this.wrappedDisplay = wrappedDisplay;
    }

    public int[] getScreenSize() {
        Point size = new Point();
        WindowManager w = mContext.getWindowManager();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2) {
            w.getDefaultDisplay().getSize(size);

            return new int[] { size.x, size.y };
        } else {
            Display d = w.getDefaultDisplay();

            // noinspection deprecation
            return new int[] { d.getWidth(), d.getHeight() };
        }
    }

    public int[] getScreenSize(Display display) {
        Point size = new Point();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2) {
            display.getSize(size);

            return new int[] { size.x, size.y };
        } else {
            // noinspection deprecation
            return new int[] { display.getWidth(), display.getHeight() };
        }
    }
}
