package com.myappconverter.uikit.myappclasses;

import android.view.MotionEvent;
import android.view.View;

import com.myappconverter.java.uikit.utilities.RotateGestureDetector;

import com.myappconverter.mapping.utils.GenericMainContext;

import java.lang.reflect.Method;


public class MyAppRotationGestureRecognizer extends MyAppGestureRecognizer {
    private float rotation;
    private float velocity;
    public float rotationDegree;
    private RotateGestureDetector mRotateDetector;

    public MyAppRotationGestureRecognizer() {
        mRotateDetector = new RotateGestureDetector(GenericMainContext.sharedContext,
                new RotateListener());
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        mRotateDetector.onTouchEvent(event);

        return false;
    }

    protected void invokMethodsSel() {
        try {
            if ((this.getTargetAction() != null) && (getTarget() != null)) {
                Method m = getTarget().getClass()
                               .getDeclaredMethod(getTargetAction()
                                                      .getMethodName(),
                        MyAppRotationGestureRecognizer.class);
                m.invoke(getTarget(), this);
            }
        } catch (Exception e) {
        }
    }

    public float getRotation() {
        return rotation;
    }

    public void setRotation(float rotation) {
        this.rotation = rotation;
    }

    public float getVelocity() {
        return velocity;
    }

    public void setVelocity(float velocity) {
        this.velocity = velocity;
    }

    class RotateListener extends RotateGestureDetector.SimpleOnRotateGestureListener {
        @Override
        public boolean onRotate(RotateGestureDetector detector) {
            rotationDegree -= detector.getRotationDegreesDelta();
            rotation = (float) (rotationDegree * Math.PI) / 180; // 180 = Math.PI and deg = x
            invokMethodsSel();

            return false;
        }
    }
}
