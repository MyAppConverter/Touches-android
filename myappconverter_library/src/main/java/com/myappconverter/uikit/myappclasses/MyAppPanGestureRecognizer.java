package com.myappconverter.uikit.myappclasses;

import android.support.v4.view.VelocityTrackerCompat;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;

import com.myappconverter.java.coregraphics.CGPoint;

import com.myappconverter.mapping.utils.GenericMainContext;

import java.lang.reflect.Method;


public class MyAppPanGestureRecognizer extends MyAppGestureRecognizer {
    protected android.view.GestureDetector mGesture;
    protected VelocityTracker mTracker;
    protected float mLastX;
    protected float mTranslationX;
    private CGPoint velocity;
    private CGPoint translation = new CGPoint(0, 0);
    private CGPoint initialePosition = new CGPoint(0, 0);
    private CGPoint distance;
    private int maximumNumberOfTouches;
    private int minimumNumberOfTouches;

    public MyAppPanGestureRecognizer() {
        //		mGesture = new GestureDetector(GenericMainContext.sharedContext, new PanListener());
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getActionMasked()) {
        case MotionEvent.ACTION_DOWN:

            if (mTracker == null) {
                mTracker = VelocityTracker.obtain();
            } else {
                mTracker.clear();
            }

            mTracker.addMovement(event);
            initialePosition.x = getView().getX();
            initialePosition.y = getView().getY();

            break;

        case MotionEvent.ACTION_MOVE:
            mTracker.addMovement(event);
            mTracker.computeCurrentVelocity(1000);
            setVelocity(new CGPoint(VelocityTrackerCompat.getXVelocity(
                        mTracker, event.getPointerId(event.getActionIndex())),
                    VelocityTrackerCompat.getYVelocity(mTracker,
                        event.getPointerId(event.getActionIndex()))));
            translation.x += (getTouchLocation().x() -
            (getView().getX() + (getView().getWidth() / 2)) - 2);
            translation.y += (getTouchLocation().y() -
            (getView().getY() + (getView().getHeight() / 2)) - 2);
            invokMethodsSel();

            break;

        case MotionEvent.ACTION_CANCEL:
            mTracker.recycle();
            translation = new CGPoint(0, 0);

            break;

        case MotionEvent.ACTION_UP:
            translation = new CGPoint(0, 0);

            break;
        }

        //mGesture.onTouchEvent(event);
        return true;
    }

    public CGPoint getVelocity() {
        return velocity;
    }

    public void setVelocity(CGPoint velocity) {
        this.velocity = velocity;
    }

    public CGPoint getTranslation() {
        return translation;
    }

    public void setTranslation(CGPoint translation) {
        this.translation.x = translation.x;
        this.translation.y = translation.y;
    }

    protected void invokMethodsSel() {
        try {
            if ((this.getTargetAction() != null) && (getTarget() != null)) {
                Method m = getTarget().getClass()
                               .getDeclaredMethod(getTargetAction()
                                                      .getMethodName(),
                        MyAppPanGestureRecognizer.class);
                m.invoke(getTarget(), this);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
            class PanListener extends GestureDetector.SimpleOnGestureListener {
                    @Override
                    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
                            translation.x += getTouchLocation().x() - getView().getX() - (getView().getWidth()/2);
                            translation.y += getTouchLocation().y() - getView().getY() - (getView().getHeight()/2);
                            invokMethodsSel();
                            return true;
                    }
            }
            */
}
