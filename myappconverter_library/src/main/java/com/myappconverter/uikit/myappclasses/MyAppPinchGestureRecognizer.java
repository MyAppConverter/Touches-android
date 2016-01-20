package com.myappconverter.uikit.myappclasses;

import android.content.Context;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.View;

import com.myappconverter.java.coregraphics.CGPoint;

import com.myappconverter.mapping.utils.GenericMainContext;

import java.lang.reflect.Method;


public class MyAppPinchGestureRecognizer extends MyAppGestureRecognizer {
    public ScaleGestureDetector scaleGestureDetector;
    private float scale = 1f;
    private float velocity;
    protected VelocityTracker mTracker;

    public MyAppPinchGestureRecognizer(Context context) {
        scaleGestureDetector = new ScaleGestureDetector(GenericMainContext.sharedContext,
                new ScaleListener());
    }

    public MyAppPinchGestureRecognizer() {
        scaleGestureDetector = new ScaleGestureDetector(GenericMainContext.sharedContext,
                new ScaleListener());
    }

    public float getScale() {
        return scale;
    }

    public void setScale(float scale) {
        this.scale = scale;
    }

    public float getVelocity() {
        return velocity;
    }

    public void setVelocity(float velocity) {
        this.velocity = velocity;
    }

    //	protected CGPoint _velocity;
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        setTouchLocation(new CGPoint(event.getRawX(), event.getRawY()));

        VelocityTracker vel = VelocityTracker.obtain();
        vel.addMovement(event);
        scaleGestureDetector.onTouchEvent(event);

        return true;
    }

    protected void invokMethodsSel() {
        try {
            if ((this.getTargetAction() != null) && (getTarget() != null)) {
                Method m = getTarget().getClass()
                               .getDeclaredMethod(getTargetAction()
                                                      .getMethodName(),
                        MyAppPinchGestureRecognizer.class);
                m.invoke(getTarget(), this);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        @Override
        public boolean onScale(ScaleGestureDetector detector) {
            scale *= detector.getScaleFactor();
            scale = Math.max(0.1f, Math.min(scale, 5.0f));
            velocity = 1000 * (scale / detector.getEventTime()); // ScaleFactor per second
            invokMethodsSel();

            return true;
        }
    }
}
