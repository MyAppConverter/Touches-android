package com.myappconverter.util;

import android.content.Context;

import android.util.DisplayMetrics;

import android.view.WindowManager;

import com.myappconverter.java.coregraphics.CGRect;

import com.myappconverter.mapping.utils.GenericMainContext;


public class DisplayHelper {
    private static float xratio = 1.0F;
    private static float yratio = 1.0F;
    private static boolean activateDisplayResize = false;

    public static void updateRatios() {
        // TODO : take care of orientations...
        if (activateDisplayResize) {
            DisplayMetrics metrics = new DisplayMetrics();
            ((WindowManager) GenericMainContext.sharedContext
             .getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay()
             .getMetrics(metrics);

            CGRect appframe = getApplicationFrame();
            xratio = (float) metrics.widthPixels / appframe.size.width;
            yratio = (float) metrics.heightPixels / appframe.size.height;
        }
    }

    private static CGRect getApplicationFrame() {
        return new CGRect(0, 0, 320, 480);
    }

    public static float x2Android(float fromIOS) {
        return fromIOS * xratio;
    }

    public static float y2Android(float fromIOS) {
        return fromIOS * yratio;
    }

    public static float x2IOS(float fromAndroid) {
        return fromAndroid / xratio;
    }

    public static float y2IOS(float fromAndroid) {
        return fromAndroid / yratio;
    }
}
