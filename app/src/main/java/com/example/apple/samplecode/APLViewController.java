/*
 * Copyright (c) 2015 MyAppConverter
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the MyAppConverter License v1.0
 * which accompanies this distribution, and is available at
 * http://www.myappconverter.com/legal/epl-v1.html
 *
 * Contributors:
 *    MyAppConverter Core Team - initial API and implementation
 * @date : Oct, 02 2015 - 17:20:42
 */
package com.example.apple.samplecode;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;

import android.app.Activity;
import android.app.Activity;
import android.app.Activity;

import android.content.Context;
import android.content.Intent;

import android.graphics.Canvas;

import android.graphics.Paint.Align;

import android.graphics.Rect;
import android.graphics.Typeface;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

import android.inputmethodservice.KeyboardView;
import android.inputmethodservice.KeyboardView;

import android.inputmethodservice.KeyboardView.OnKeyboardActionListener;
import android.inputmethodservice.KeyboardView.OnKeyboardActionListener;

import android.os.Build;
import android.os.Build;
import android.os.Bundle;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;

import android.text.style.ForegroundColorSpan;

import android.util.Log;
import android.util.Log;

import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.MotionEvent;

import android.view.MotionEvent.PointerCoords;
import android.view.MotionEvent.PointerProperties;

import android.view.View;
import android.view.View;
import android.view.View;

import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;

import android.view.ViewGroup;
import android.view.ViewGroup;

import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.LayoutParams;

import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import android.widget.TextView.BufferType;

import android.widget.Toast;

import com.myappconverter.java.coregraphics.CGAffineTransform;
import com.myappconverter.java.coregraphics.CGGeometry;
import com.myappconverter.java.coregraphics.CGPoint;
import com.myappconverter.java.coregraphics.CGRect;
import com.myappconverter.java.coregraphics.CGSize;
import com.myappconverter.java.foundations.NSArray;
import com.myappconverter.java.foundations.NSArray;
import com.myappconverter.java.foundations.NSAttributedString;
import com.myappconverter.java.foundations.NSBundle;
import com.myappconverter.java.foundations.NSBundle;
import com.myappconverter.java.foundations.NSMutableSet;
import com.myappconverter.java.foundations.NSObject;
import com.myappconverter.java.foundations.NSObject;
import com.myappconverter.java.foundations.NSSet;
import com.myappconverter.java.foundations.NSSet;
import com.myappconverter.java.foundations.NSString;
import com.myappconverter.java.foundations.NSString;
import com.myappconverter.java.foundations.NSString;
import com.myappconverter.java.foundations.SEL;
import com.myappconverter.java.foundations.SEL;
import com.myappconverter.java.foundations.utilities.*;
import com.myappconverter.java.quartzcore.CALayer;
import com.myappconverter.java.uikit.NSText;
import com.myappconverter.java.uikit.NSText.NSTextAlignment;
import com.myappconverter.java.uikit.utilities.AndroidViewHelper;

import com.myappconverter.mapping.utils.*;
import com.myappconverter.mapping.utils.GenericMainContext;
import com.myappconverter.mapping.utils.GenericMainContext;
import com.myappconverter.mapping.utils.GenericMainContext;
import com.myappconverter.mapping.utils.InvokableHelper;
import com.myappconverter.mapping.utils.InvokableHelper;

import com.myappconverter.uikit.myappclasses.BaseAppDelegate;
import com.myappconverter.uikit.myappclasses.BaseAppDelegate;
import com.myappconverter.uikit.myappclasses.MyAppBarButtonItem;
import com.myappconverter.uikit.myappclasses.MyAppBarButtonItem;
import com.myappconverter.uikit.myappclasses.MyAppController;
import com.myappconverter.uikit.myappclasses.MyAppController;
import com.myappconverter.uikit.myappclasses.MyAppFont;
import com.myappconverter.uikit.myappclasses.MyAppGestureRecognizer;
import com.myappconverter.uikit.myappclasses.MyAppLayoutConstraint;
import com.myappconverter.uikit.myappclasses.MyAppNavigationController;
import com.myappconverter.uikit.myappclasses.MyAppNavigationController;
import com.myappconverter.uikit.myappclasses.MyAppNavigationItem;
import com.myappconverter.uikit.myappclasses.MyAppNavigationItem;
import com.myappconverter.uikit.myappclasses.MyAppScreen;
import com.myappconverter.uikit.myappclasses.MyAppStoryboardSegue;
import com.myappconverter.uikit.myappclasses.MyAppStoryboardSegue;
import com.myappconverter.uikit.myappclasses.MyAppTouch;
import com.myappconverter.uikit.myappclasses.MyAppTouch;
import com.myappconverter.uikit.myappclasses.MyAppWindow;
import com.myappconverter.uikit.util.TouchUtil;
import com.myappconverter.uikit.util.UIKitEnums;
import com.myappconverter.uikit.util.UIKitEnums.UIEventSubtype;
import com.myappconverter.uikit.util.UIKitEnums.UIEventSubtype;
import com.myappconverter.uikit.util.UIKitEnums.UIEventType;
import com.myappconverter.uikit.util.UIKitEnums.UIInterfaceOrientation;
import com.myappconverter.uikit.util.UIKitEnums.UIInterfaceOrientation;
import com.myappconverter.uikit.util.UIKitEnums.UIInterfaceOrientationMask;
import com.myappconverter.uikit.util.UIKitEnums.UIInterfaceOrientationMask;
import com.myappconverter.uikit.util.UIKitUtils;
import com.myappconverter.uikit.util.UIViewProperty;
import com.myappconverter.uikit.util.UIViewProperty;

import com.myappconverter.util.DisplayHelper;
import com.myappconverter.util.PerformBlocks;
import com.myappconverter.util.PerformBlocks.VoidBlock;
import com.myappconverter.util.PerformBlocks.VoidBlock;
import com.myappconverter.util.PerformBlocks.VoidBlockBool;

import java.lang.ref.SoftReference;
import java.lang.ref.SoftReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.Stack;


public class APLViewController extends MyAppController {
    private static long[] myapp_last_tap_timestamp = { 0 };
    private static int[] myapp_tapcount = { 1 };
    private Animation anim;

    /**
     * The cached value of the '<em>_firstPieceView</em>' property.
     * @see #get_firstPieceView()
     * @generated
     * @ordered
     */
    public ImageView _firstPieceView;

    /**
     * The cached value of the '<em>_secondPieceView</em>' property.
     * @see #get_secondPieceView()
     * @generated
     * @ordered
     */
    public ImageView _secondPieceView;

    /**
     * The cached value of the '<em>_thirdPieceView</em>' property.
     * @see #get_thirdPieceView()
     * @generated
     * @ordered
     */
    public ImageView _thirdPieceView;

    /**
     * The cached value of the '<em>_touchPhaseText</em>' property.
     * @see #get_touchPhaseText()
     * @generated
     * @ordered
     */
    public TextView _touchPhaseText;

    /**
     * The cached value of the '<em>_touchInfoText</em>' property.
     * @see #get_touchInfoText()
     * @generated
     * @ordered
     */
    public TextView _touchInfoText;

    /**
     * The cached value of the '<em>_touchTrackingText</em>' property.
     * @see #get_touchTrackingText()
     * @generated
     * @ordered
     */
    public TextView _touchTrackingText;

    /**
     * The cached value of the '<em>_touchInstructionsText</em>' property.
     * @see #get_touchInstructionsText()
     * @generated
     * @ordered
     */
    public TextView _touchInstructionsText;

    /**
     * The cached value of the '<em>piecesOnTop</em>' property.
     * @see #getPiecesOnTop()
     * @generated
     * @ordered
     */
    public boolean piecesOnTop;

    /**
     * The cached value of the '<em>startTouchPosition</em>' property.
     * @see #getStartTouchPosition()
     * @generated
     * @ordered
     */
    public CGPoint startTouchPosition = (CGPoint) (new CGPoint());
    private NSMutableSet<MyAppTouch> myapp_touches;
    float[] myapp_prevX = { 0 };
    float[] myapp_prevY = { 0 };

    /**default getter of _firstPieceView */
    public ImageView getFirstPieceView() {
        return this._firstPieceView;
    }

    /**default setter of _firstPieceView */
    public void setFirstPieceView(ImageView _firstPieceView) {
        this._firstPieceView = _firstPieceView;
    }

    /**default getter of _secondPieceView */
    public ImageView getSecondPieceView() {
        return this._secondPieceView;
    }

    /**default setter of _secondPieceView */
    public void setSecondPieceView(ImageView _secondPieceView) {
        this._secondPieceView = _secondPieceView;
    }

    /**default getter of _thirdPieceView */
    public ImageView getThirdPieceView() {
        return this._thirdPieceView;
    }

    /**default setter of _thirdPieceView */
    public void setThirdPieceView(ImageView _thirdPieceView) {
        this._thirdPieceView = _thirdPieceView;
    }

    /**default getter of _touchPhaseText */
    public TextView getTouchPhaseText() {
        return this._touchPhaseText;
    }

    /**default setter of _touchPhaseText */
    public void setTouchPhaseText(TextView _touchPhaseText) {
        this._touchPhaseText = _touchPhaseText;
    }

    /**default getter of _touchInfoText */
    public TextView getTouchInfoText() {
        return this._touchInfoText;
    }

    /**default setter of _touchInfoText */
    public void setTouchInfoText(TextView _touchInfoText) {
        this._touchInfoText = _touchInfoText;
    }

    /**default getter of _touchTrackingText */
    public TextView getTouchTrackingText() {
        return this._touchTrackingText;
    }

    /**default setter of _touchTrackingText */
    public void setTouchTrackingText(TextView _touchTrackingText) {
        this._touchTrackingText = _touchTrackingText;
    }

    /**default getter of _touchInstructionsText */
    public TextView getTouchInstructionsText() {
        return this._touchInstructionsText;
    }

    /**default setter of _touchInstructionsText */
    public void setTouchInstructionsText(TextView _touchInstructionsText) {
        this._touchInstructionsText = _touchInstructionsText;
    }

    /** <!-- begin-user-doc -->
    * *&#10; Checks to see which view, or views, the point is in and then calls a method to perform the opening animation, which  makes the piece slightly larger, as if it is being picked up by the user.&#10; *
    * <!-- end-user-doc -->
    */
    public void dispatchFirstTouchAtPointForEvent(CGPoint touchPoint,
        MotionEvent event) {
        if (ExpressNullable.assertCondition(CGGeometry.CGRectContainsPoint(
                        getFrame(this.getFirstPieceView()), touchPoint))) {
            this.animateFirstTouchAtPointForView(touchPoint,
                this.getFirstPieceView());
        }

        if (ExpressNullable.assertCondition(CGGeometry.CGRectContainsPoint(
                        getFrame(this.getSecondPieceView()), touchPoint))) {
            this.animateFirstTouchAtPointForView(touchPoint,
                this.getSecondPieceView());
        }

        if (ExpressNullable.assertCondition(CGGeometry.CGRectContainsPoint(
                        getFrame(this.getThirdPieceView()), touchPoint))) {
            this.animateFirstTouchAtPointForView(touchPoint,
                this.getThirdPieceView());
        }
    }

    /** <!-- begin-user-doc -->
    *
    * <!-- end-user-doc -->
    */
    public void dispatchTouchEventToPosition(View theView, CGPoint position) {
        if (ExpressNullable.assertCondition(CGGeometry.CGRectContainsPoint(
                        getFrame(this.getFirstPieceView()), position))) {
            setCenter(this.getFirstPieceView(), position);
        }

        if (ExpressNullable.assertCondition(CGGeometry.CGRectContainsPoint(
                        getFrame(this.getSecondPieceView()), position))) {
            setCenter(this.getSecondPieceView(), position);
        }

        if (ExpressNullable.assertCondition(CGGeometry.CGRectContainsPoint(
                        getFrame(this.getThirdPieceView()), position))) {
            setCenter(this.getThirdPieceView(), position);
        }
    }

    /** <!-- begin-user-doc -->
    *
    * <!-- end-user-doc -->
    */
    public void dispatchTouchEndEventToPosition(View theView, CGPoint position) {
        if (ExpressNullable.assertCondition(CGGeometry.CGRectContainsPoint(
                        getFrame(this.getFirstPieceView()), position))) {
            this.animateViewToPosition(((View) this.getFirstPieceView()),
                position);
        }

        if (ExpressNullable.assertCondition(CGGeometry.CGRectContainsPoint(
                        getFrame(this.getSecondPieceView()), position))) {
            this.animateViewToPosition(((View) this.getSecondPieceView()),
                position);
        }

        if (ExpressNullable.assertCondition(CGGeometry.CGRectContainsPoint(
                        getFrame(this.getThirdPieceView()), position))) {
            this.animateViewToPosition(((View) this.getThirdPieceView()),
                position);
        }

        if (ExpressNullable.assertCondition(CGGeometry.CGPointEqualToPoint(
                        getCenter(this.getFirstPieceView()),
                        getCenter(this.getSecondPieceView()))) ||
                ExpressNullable.assertCondition(CGGeometry.CGPointEqualToPoint(
                        getCenter(this.getFirstPieceView()),
                        getCenter(this.getThirdPieceView()))) ||
                ExpressNullable.assertCondition(CGGeometry.CGPointEqualToPoint(
                        getCenter(this.getSecondPieceView()),
                        getCenter(this.getThirdPieceView())))) {
            setText(this.getTouchInstructionsText(),
                NSBundle.mainBundle()
                        .localizedStringForKeyValueTable(((NSString) (new NSString(
                        "Double tap the background to move the pieces apart."))),
                    new NSString(""), ((NSString) (null))));
            piecesOnTop = (boolean) (true);
        } else {
            piecesOnTop = (boolean) (false);
        }
    }

    /** <!-- begin-user-doc -->
    *
    * <!-- end-user-doc -->
    */
    public void animateFirstTouchAtPointForView(CGPoint touchPoint,
        ImageView theView) {
//        beginAnimationsContext((null), (null));
//        setAnimationDuration(0.15f);
//        setTransform(theView,
//            CGAffineTransform.CGAffineTransformMakeScale(((float) 1.2f),
//                ((float) 1.2f)));
        anim = new ScaleAnimation(
                1f, 1.2f, // Start and end values for the X axis scaling
                1f, 1.2f, // Start and end values for the Y axis scaling
                Animation.RELATIVE_TO_SELF, 1f, // Pivot point of X scaling
                Animation.RELATIVE_TO_SELF, 1f); // Pivot point of Y scaling
        anim.setFillAfter(true); // Needed to keep the result of the animation
        anim.setDuration((long) (0.15f * 1000));
        theView.startAnimation(anim);
//        commitAnimations();
    }

    /** <!-- begin-user-doc -->
    *
    * <!-- end-user-doc -->
    */
    public void animateViewToPosition(View theView, CGPoint thePosition) {
//        beginAnimationsContext((null), (null));
//        setAnimationDuration(0.15f);
        setCenter(theView, thePosition);
        anim.setInterpolator(new ReverseInterpolator());
        theView.startAnimation(anim);
//        setTransform(theView, CGAffineTransform.CGAffineTransformIdentity);
//        commitAnimations();
    }

    public class ReverseInterpolator implements Interpolator {
        @Override
        public float getInterpolation(float paramFloat) {
            return Math.abs(paramFloat -1f);
        }
    }

    /** <!-- begin-user-doc -->
    * *&#10; Handles the start of a touch.&#10; *
    * <!-- end-user-doc -->
    */
    public void touchesBeganWithEvent(NSSet touches, MotionEvent event) {
        int numTaps = (int) (getTapCount((MyAppTouch) touches.anyObject()));
        setText(this.getTouchPhaseText(),
            NSBundle.mainBundle()
                    .localizedStringForKeyValueTable(((NSString) (new NSString(
                    "Phase: Touches began"))), new NSString(""),
                ((NSString) (null))));
        setText(this.getTouchInfoText(), new NSString(""));

        if (ExpressNullable.assertCondition(numTaps >= 2)) {
            NSString infoFormatString = (NSString) (NSBundle.mainBundle()
                                                            .localizedStringForKeyValueTable(((NSString) (new NSString(
                        "%d taps"))), new NSString(""), ((NSString) (null))));
            setText(this.getTouchInfoText(),
                NSString.stringWithFormat(NSString.class, infoFormatString,
                    numTaps));

            if (ExpressNullable.assertCondition((numTaps == 2)) &&
                    ExpressNullable.assertCondition(piecesOnTop)) {
                if (ExpressNullable.assertCondition(
                            getCenter(this.getFirstPieceView()).x == getCenter(
                                this.getSecondPieceView()).x)) {
                    setCenter(this.getSecondPieceView(),
                        CGGeometry.CGPointMake(((float) getCenter(
                                this.getFirstPieceView()).x - 50),
                            ((float) getCenter(this.getFirstPieceView()).y -
                            50)));
                }

                if (ExpressNullable.assertCondition(
                            getCenter(this.getFirstPieceView()).x == getCenter(
                                this.getThirdPieceView()).x)) {
                    setCenter(this.getThirdPieceView(),
                        CGGeometry.CGPointMake(((float) getCenter(
                                this.getFirstPieceView()).x + 50),
                            ((float) getCenter(this.getFirstPieceView()).y +
                            50)));
                }

                if (ExpressNullable.assertCondition(
                            getCenter(this.getSecondPieceView()).x == getCenter(
                                this.getThirdPieceView()).x)) {
                    setCenter(this.getThirdPieceView(),
                        CGGeometry.CGPointMake(((float) getCenter(
                                this.getSecondPieceView()).x + 50),
                            ((float) getCenter(this.getSecondPieceView()).y +
                            50)));
                }

                setText(this.getTouchInstructionsText(), new NSString(""));
            }
        } else {
            setText(this.getTouchTrackingText(), new NSString(""));
        }

        int touchCount = (int) (0);

        for (Object touchInter : touches) {
            if (touchInter instanceof MyAppTouch) {
                MyAppTouch touch = (MyAppTouch) touchInter;
                this.dispatchFirstTouchAtPointForEvent(locationInView(touch,
                        getView(this)), ((MotionEvent) (null)));
                touchCount++;
            }
        }
    }

    /** <!-- begin-user-doc -->
    *
    * <!-- end-user-doc -->
    */
    public void touchesMovedWithEvent(NSSet touches, MotionEvent event) {
        int touchCount = (int) (0);
        setText(this.getTouchPhaseText(),
            NSBundle.mainBundle()
                    .localizedStringForKeyValueTable(((NSString) (new NSString(
                    "Phase: Touches moved"))), new NSString(""),
                ((NSString) (null))));

        for (Object touchInter : touches) {
            if (touchInter instanceof MyAppTouch) {
                MyAppTouch touch = (MyAppTouch) touchInter;
                this.dispatchTouchEventToPosition(getView(touch),
                    locationInView(touch, getView(this)));
                touchCount++;
            }
        }

        if (ExpressNullable.assertCondition(touchCount > 1)) {
            NSString trackingFormatString = (NSString) (NSBundle.mainBundle()
                                                                .localizedStringForKeyValueTable(((NSString) (new NSString(
                        "Tracking %d touches"))), new NSString(""),
                    ((NSString) (null))));
            setText(this.getTouchTrackingText(),
                NSString.stringWithFormat(NSString.class, trackingFormatString,
                    touchCount));
        } else {
            setText(this.getTouchTrackingText(),
                NSBundle.mainBundle()
                        .localizedStringForKeyValueTable(((NSString) (new NSString(
                        "Tracking 1 touch"))), new NSString(""),
                    ((NSString) (null))));
        }
    }

    /** <!-- begin-user-doc -->
    *
    * <!-- end-user-doc -->
    */
    public void touchesEndedWithEvent(NSSet touches, MotionEvent event) {
        setText(this.getTouchPhaseText(),
            NSBundle.mainBundle()
                    .localizedStringForKeyValueTable(((NSString) (new NSString(
                    "Phase: Touches ended"))), new NSString(""),
                ((NSString) (null))));

        for (Object touchInter : touches) {
            if (touchInter instanceof MyAppTouch) {
                MyAppTouch touch = (MyAppTouch) touchInter;
                this.dispatchTouchEndEventToPosition(getView(touch),
                    locationInView(touch, getView(this)));
            }
        }
    }

    /** <!-- begin-user-doc -->
    *
    * <!-- end-user-doc -->
    */
    public void touchesCancelledWithEvent(NSSet touches, MotionEvent event) {
        setText(this.getTouchPhaseText(),
            NSBundle.mainBundle()
                    .localizedStringForKeyValueTable(((NSString) (new NSString(
                    "Phase: Touches cancelled"))), new NSString(""),
                ((NSString) (null))));

        for (Object touchInter : touches) {
            if (touchInter instanceof MyAppTouch) {
                MyAppTouch touch = (MyAppTouch) touchInter;
                this.dispatchTouchEndEventToPosition(getView(touch),
                    locationInView(touch, getView(this)));
            }
        }
    }

    @Override
    public void loadView() {
        _firstPieceView = (android.widget.ImageView) getView()
                                                         .findViewById(R.id._firstPieceView);

        _secondPieceView = (android.widget.ImageView) getView()
                                                          .findViewById(R.id._secondPieceView);

        _thirdPieceView = (android.widget.ImageView) getView()
                                                         .findViewById(R.id._thirdPieceView);

        _touchPhaseText = (android.widget.TextView) getView()
                                                        .findViewById(R.id._touchPhaseText);

        _touchTrackingText = (android.widget.TextView) getView()
                                                           .findViewById(R.id._touchTrackingText);

        _touchInfoText = (android.widget.TextView) getView()
                                                       .findViewById(R.id._touchInfoText);

        _touchInstructionsText = (android.widget.TextView) getView()
                                                               .findViewById(R.id._touchInstructionsText);

        getView().setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    TouchUtil touchUtil = new TouchUtil();
                    touchUtil.handleTouch(v, event, myapp_tapcount,
                        myapp_last_tap_timestamp, myapp_prevX, myapp_prevY,
                        myapp_touches);

                    return true;
                }
            });
    }

    public static void setText(TextView textView, NSString str) {
        if ((str != null) && (str.getWrappedString() != null)) {
            textView.setText(str.getWrappedString());
        }
    }

    public static void setCenter(Object relativeLayout, CGPoint point) {
        if (relativeLayout instanceof View) {
            float x = point.x() - (((View) relativeLayout).getWidth() / 2);
            float y = point.y() - (((View) relativeLayout).getHeight() / 2);
            ((View) relativeLayout).setX(x);
            ((View) relativeLayout).setY(y);
        } else if (relativeLayout instanceof ViewGroup) {
            float x = point.x() -
                (((ViewGroup) relativeLayout).getWidth() / 2);
            float y = point.y() -
                (((ViewGroup) relativeLayout).getHeight() / 2);
            ((ViewGroup) relativeLayout).setX(x);
            ((ViewGroup) relativeLayout).setY(y);
        }
    }

    public static void setTransform(View view, CGAffineTransform transform) {
        view.setTranslationX(transform.tx);
        view.setTranslationY(transform.ty);

        double angleDegrees = (transform.b * 180) / Math.PI;
        view.setRotation((float) angleDegrees);
    }

    public static int getTapCount(MyAppTouch touch) {
        return touch.getTapCount();
    }

    public static CGPoint getCenter(View aView) {
        CGPoint point = new CGPoint();
        point.setX(aView.getX() + (aView.getWidth() / 2));
        point.setY(aView.getY() + (aView.getHeight() / 2));

        return point;
    }

    public static CGPoint locationInView(MyAppTouch touch,
        android.view.View aView) {
        if ((touch != null) && (aView.getParent() != null)) {
            CGPoint cgPoint = CGPoint.make(touch.getX(), touch.getY());

            return cgPoint;
        }

        return null;
    }

    public static View getView(MyAppController controller) {
        if (controller != null) {
            return controller.getView();
        }

        return null;
    }

    public static CGRect getFrame(View view) {
        if (view != null) {
            CGRect rect = new CGRect();

            if (view instanceof RelativeLayout) {
                ViewGroup.LayoutParams params = view.getLayoutParams();

                if (params != null) {
                    rect.setOrigin(new CGPoint(DisplayHelper.x2IOS(view.getX()),
                            DisplayHelper.y2IOS(view.getY())));
                    rect.setSize(new CGSize(DisplayHelper.x2IOS(params.width),
                            DisplayHelper.y2IOS(params.height)));
                } else {
                    view.measure(MeasureSpec.UNSPECIFIED,
                        MeasureSpec.UNSPECIFIED);
                    rect.setOrigin(new CGPoint(DisplayHelper.x2IOS(view.getX()),
                            DisplayHelper.y2IOS(view.getY())));
                    rect.setSize(new CGSize(DisplayHelper.x2IOS(
                                view.getMeasuredWidth()),
                            DisplayHelper.y2IOS(view.getMeasuredHeight())));
                }
            } else if (view instanceof LinearLayout) {
                ViewGroup.LayoutParams params = view.getLayoutParams();

                if (params != null) {
                    rect.setOrigin(new CGPoint(DisplayHelper.x2IOS(view.getX()),
                            DisplayHelper.y2IOS(view.getY())));
                    rect.setSize(new CGSize(DisplayHelper.x2IOS(params.width),
                            DisplayHelper.y2IOS(params.height)));
                } else {
                    rect.setOrigin(new CGPoint(DisplayHelper.x2IOS(view.getX()),
                            DisplayHelper.y2IOS(view.getY())));
                    rect.setSize(new CGSize(DisplayHelper.x2IOS(view.getWidth()),
                            DisplayHelper.y2IOS(view.getHeight())));
                }
            } else {
                ViewGroup.LayoutParams params = view.getLayoutParams();

                if (params != null) {
                    rect.setOrigin(new CGPoint(DisplayHelper.x2IOS(view.getX()),
                            DisplayHelper.y2IOS(view.getY())));
                    rect.setSize(new CGSize(DisplayHelper.x2IOS(params.width),
                            DisplayHelper.y2IOS(params.height)));
                } else {
                    rect.setOrigin(new CGPoint(DisplayHelper.x2IOS(view.getX()),
                            DisplayHelper.y2IOS(view.getY())));
                    rect.setSize(new CGSize(DisplayHelper.x2IOS(view.getWidth()),
                            DisplayHelper.y2IOS(view.getHeight())));
                }
            }

            return rect;
        }

        return new CGRect(0, 0, 0, 0);
    }

    public static android.view.View getView(MyAppTouch touch) {
        return touch.getView();
    }

    public static void beginAnimationsContext(NSString animationID,
        Object context) {
        if (UIViewProperty.animationsEnabled) {
            UIViewProperty.animationBegan = true;
            UIViewProperty.animatorList = new ArrayList<Animator>();
        }
    }

    public static void setAnimationDuration(double duration) {
        UIViewProperty.currentAnimation.setDuration((long) (duration * 1000));
    }

    public static void commitAnimations() {
        if (!(UIViewProperty.currentAnimID.getWrappedString().equals("") ||
                (UIViewProperty.currentAnimID != null))) {
            UIViewProperty.animatorSet.start();
            UIViewProperty.currentAnimID = null;
        }

        UIViewProperty.animationBegan = false;
        UIViewProperty.animatorList = null;
        UIViewProperty.repeatCount = 1;
        UIViewProperty.duration = 0.0f;
        UIViewProperty.delay = 0.0f;
    }
}
