package com.myappconverter.uikit.util;

import android.animation.Animator;
import android.animation.AnimatorSet;

import android.view.Window;

import android.view.animation.Animation;

import com.myappconverter.java.coregraphics.CGRect;
import com.myappconverter.java.foundations.NSArray;
import com.myappconverter.java.foundations.NSString;

import com.myappconverter.uikit.myappclasses.MyAppController;
import com.myappconverter.uikit.myappclasses.MyAppEdgeInsets;
import com.myappconverter.uikit.myappclasses.MyAppGestureRecognizer;
import com.myappconverter.uikit.myappclasses.MyAppLayoutConstraint;
import com.myappconverter.uikit.util.UIKitEnums;
import com.myappconverter.uikit.util.UIKitEnums.UIViewAutoresizing;

import java.util.ArrayList;
import java.util.List;


public class UIViewProperty {
    public static List<Animator> animatorList = new ArrayList<Animator>();
    public static boolean startListening = false;
    public static double duration = 0;
    public static double delay = 0;
    public static float alpha = 1.0f;
    public static AnimatorSet animatorSet = new AnimatorSet();
    public static Animation currentAnimation;
    public static boolean animationsEnabled = true;
    public static boolean animationBegan = false;
    public static NSString currentAnimID = null;
    public static int repeatCount = 1;
    public MyAppController sourceController;
    public MyAppController controller;
    public int tagIos;
    private NSArray<MyAppLayoutConstraint> constraints = new NSArray<MyAppLayoutConstraint>();
    private MyAppEdgeInsets layoutMargins = new MyAppEdgeInsets();
    public List<MyAppGestureRecognizer> gestureRecognizers;
    public CGRect bounds;
    public int tag = 0;
    public Window window;
    public boolean multipleTouchEnabled = false;
    public UIViewAutoresizing autoresizingMask = UIViewAutoresizing.UIViewAutoresizingNone;

    public MyAppController getController() {
        return controller;
    }

    public void setController(MyAppController controller) {
        this.controller = controller;
    }

    public NSArray<MyAppLayoutConstraint> getConstraints() {
        return constraints;
    }

    public void setConstraints(NSArray<MyAppLayoutConstraint> constraints) {
        this.constraints = constraints;
    }

    public MyAppEdgeInsets getLayoutMargins() {
        return layoutMargins;
    }

    public void setLayoutMargins(MyAppEdgeInsets layoutMargins) {
        this.layoutMargins = layoutMargins;
    }

    public List<MyAppGestureRecognizer> getGestureRecognizers() {
        return gestureRecognizers;
    }

    public void setGestureRecognizers(
        List<MyAppGestureRecognizer> gestureRecognizers) {
        this.gestureRecognizers = gestureRecognizers;
    }

    public static List<Animator> getAnimatorList() {
        return animatorList;
    }

    public static void setAnimatorList(List<Animator> animatorList) {
        UIViewProperty.animatorList = animatorList;
    }
}
