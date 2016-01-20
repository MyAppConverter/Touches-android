package com.myappconverter.uikit.myappclasses;

import android.view.View;

import com.myappconverter.java.coregraphics.CGPoint;
import com.myappconverter.java.foundations.NSSet;
import com.myappconverter.java.foundations.SEL;

import com.myappconverter.uikit.bridges.protocols.UIGestureRecognizerDelegate;
import com.myappconverter.uikit.util.UIKitEnums;
import com.myappconverter.uikit.util.UIKitEnums.UIGestureRecognizerState;

import java.util.HashSet;


public abstract class MyAppGestureRecognizer {
    private Object mTarget;
    private SEL mTargetAction;
    private CGPoint mTouchLocation = new CGPoint(0, 0);

    //	private MyAppTouch[] mToucheArray = new MyAppTouch[] {};
    private HashSet<MyAppTouch> mTouches = new HashSet<MyAppTouch>();
    private UIGestureRecognizerDelegate mDelegate;
    private boolean cancelsTouchesInView = true;
    private boolean delaysTouchesBegan = false;
    private boolean delaysTouchesEnded = true;
    private UIKitEnums.UIGestureRecognizerState state = UIKitEnums.UIGestureRecognizerState.UIGestureRecognizerStatePossible;
    private View view;
    private boolean enabled = true;

    public MyAppGestureRecognizer() {
        super();
    }

    public UIGestureRecognizerDelegate getDelegate() {
        return mDelegate;
    }

    public void setDelegate(UIGestureRecognizerDelegate delegate) {
        if (mDelegate != delegate) {
            this.mDelegate = delegate;
        }
    }

    public Object getTarget() {
        return mTarget;
    }

    public void setTarget(Object target) {
        this.mTarget = target;
    }

    public SEL getTargetAction() {
        return mTargetAction;
    }

    public void setTargetAction(SEL targetAction) {
        this.mTargetAction = targetAction;
    }

    public CGPoint getTouchLocation() {
        return mTouchLocation;
    }

    public void setTouchLocation(CGPoint touchLocation) {
        this.mTouchLocation = touchLocation;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public boolean isCancelsTouchesInView() {
        return cancelsTouchesInView;
    }

    public void setCancelsTouchesInView(boolean cancelsTouchesInView) {
        this.cancelsTouchesInView = cancelsTouchesInView;
    }

    public boolean isDelaysTouchesBegan() {
        return delaysTouchesBegan;
    }

    public void setDelaysTouchesBegan(boolean delaysTouchesBegan) {
        this.delaysTouchesBegan = delaysTouchesBegan;
    }

    public boolean isDelaysTouchesEnded() {
        return delaysTouchesEnded;
    }

    public void setDelaysTouchesEnded(boolean delaysTouchesEnded) {
        this.delaysTouchesEnded = delaysTouchesEnded;
    }

    public UIGestureRecognizerState getState() {
        return state;
    }

    public void setState(UIGestureRecognizerState state) {
        if ((this.state == UIGestureRecognizerState.UIGestureRecognizerStatePossible) &&
                ((state == UIGestureRecognizerState.UIGestureRecognizerStateRecognized) ||
                (state == UIGestureRecognizerState.UIGestureRecognizerStateBegan))) {
            if (!mDelegate.gestureRecognizerShouldBegin(this)) {
                this.state = UIGestureRecognizerState.UIGestureRecognizerStateFailed;
            } else {
                this.state = state;
            }
        } else {
            this.state = state;
        }
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public HashSet<MyAppTouch> getTouches() {
        return mTouches;
    }

    public void setTouches(HashSet<MyAppTouch> mTouches) {
        this.mTouches = mTouches;
    }

    public abstract boolean onTouch(android.view.View v,
        android.view.MotionEvent event);

    public void touchesBeganWithEvent(NSSet<MyAppTouch> touches,
        android.view.MotionEvent event) {
        setState(UIGestureRecognizerState.UIGestureRecognizerStateBegan);
    }

    public void touchesMovedWithEvent(NSSet<MyAppTouch> touches,
        android.view.MotionEvent event) {
        setState(UIGestureRecognizerState.UIGestureRecognizerStateChanged);
    }

    public void touchesEndedWithEvent(NSSet<MyAppTouch> touches,
        android.view.MotionEvent event) {
        setState(UIGestureRecognizerState.UIGestureRecognizerStateEnded);
    }

    public void touchesCancelledWithEvent(NSSet<MyAppTouch> touches,
        android.view.MotionEvent event) {
        setState(UIGestureRecognizerState.UIGestureRecognizerStateCancelled);
    }

    public void reset() {
        this.state = UIGestureRecognizerState.UIGestureRecognizerStatePossible;
    }
}
