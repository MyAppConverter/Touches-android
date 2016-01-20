package com.myappconverter.uikit.myappclasses;

import android.content.Context;

import android.util.Log;

import android.view.GestureDetector;

import android.view.GestureDetector.SimpleOnGestureListener;

import android.view.MotionEvent;
import android.view.View;

import com.myappconverter.java.coregraphics.CGPoint;

import com.myappconverter.mapping.utils.GenericMainContext;

import com.myappconverter.uikit.util.UIKitEnums;


public class MyAppSwipeGestureRecognizer extends MyAppGestureRecognizer {
    private static final String TAG = "MyAppSwipeGestureRecognizer";
    protected static final int SWIPE_DISTANCE_THRESHOLD = 100;
    protected static final int SWIPE_VELOCITY_THRESHOLD = 100;
    private GestureDetector mGesture;
    private UIKitEnums.UISwipeGestureRecognizerDirection mdirection = UIKitEnums.UISwipeGestureRecognizerDirection.UISwipeGestureRecognizerDirectionRight;
    private int mNumberOfTouchesRequired;

    public MyAppSwipeGestureRecognizer(Context ctx) {
        super();
        mGesture = new GestureDetector(ctx, new SwipeGestureListener());
    }

    public MyAppSwipeGestureRecognizer() {
        super();
        mGesture = new GestureDetector(GenericMainContext.sharedContext,
                new SwipeGestureListener());
    }

    public int getNumberOfTouchesRequired() {
        return mNumberOfTouchesRequired;
    }

    public void setNumberOfTouchesRequired(int numberOfTouchesRequired) {
        this.mNumberOfTouchesRequired = numberOfTouchesRequired;
    }

    public UIKitEnums.UISwipeGestureRecognizerDirection getDirection() {
        return mdirection;
    }

    public void setDirection(
        UIKitEnums.UISwipeGestureRecognizerDirection direction) {
        this.mdirection = direction;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        setView(v);

        return mGesture.onTouchEvent(event);
    }

    protected boolean onSwipeRight(MotionEvent event) {
        if (this.getDirection() == UIKitEnums.UISwipeGestureRecognizerDirection.UISwipeGestureRecognizerDirectionRight) {
            invokMethodsSel(getView(), event);

            return true;
        }

        return false;
    }

    protected boolean onSwipeLeft(MotionEvent event) {
        if (this.getDirection() == UIKitEnums.UISwipeGestureRecognizerDirection.UISwipeGestureRecognizerDirectionLeft) {
            invokMethodsSel(getView(), event);

            return true;
        }

        return false;
    }

    protected boolean onSwipeTop(MotionEvent event) {
        if (this.getDirection() == UIKitEnums.UISwipeGestureRecognizerDirection.UISwipeGestureRecognizerDirectionUp) {
            invokMethodsSel(getView(), event);

            return true;
        }

        return false;
    }

    protected boolean onSwipeBottom(MotionEvent event) {
        if (this.getDirection() == UIKitEnums.UISwipeGestureRecognizerDirection.UISwipeGestureRecognizerDirectionDown) {
            invokMethodsSel(getView(), event);

            return true;
        }

        return false;
    }

    public void invokMethodsSel(View v, MotionEvent event) {
        setTouchLocation(new CGPoint(event.getX(), event.getY()));

        try {
            if ((this.getTargetAction() != null) && (getTarget() != null)) {
                getTargetAction()
                    .invokeMethodOnTarget(getTarget(),
                    getTargetAction().getMethodName(), this);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final class SwipeGestureListener extends SimpleOnGestureListener {
        @Override
        public boolean onDown(MotionEvent e) {
            return true;
        }

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
            float velocityY) {
            System.out.println("swipegesture onFling");

            boolean result = false;

            try {
                float diffY = e2.getY() - e1.getY();
                float diffX = e2.getX() - e1.getX();

                if (Math.abs(diffX) > Math.abs(diffY)) {
                    if ((Math.abs(diffX) > SWIPE_DISTANCE_THRESHOLD) &&
                            (Math.abs(velocityX) > SWIPE_VELOCITY_THRESHOLD)) {
                        if (diffX > 0) {
                            return onSwipeRight(e2);
                        } else {
                            return onSwipeLeft(e2);
                        }
                    }

                    result = true;
                } else if ((Math.abs(diffY) > SWIPE_DISTANCE_THRESHOLD) &&
                        (Math.abs(velocityY) > SWIPE_VELOCITY_THRESHOLD)) {
                    if (diffY > 0) {
                        return onSwipeBottom(e2);
                    } else {
                        return onSwipeTop(e2);
                    }
                }

                return result;
            } catch (Exception ex) {
            }

            return false;
        }
    }
}
