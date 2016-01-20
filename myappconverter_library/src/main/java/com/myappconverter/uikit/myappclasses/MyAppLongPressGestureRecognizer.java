package com.myappconverter.uikit.myappclasses;

import android.view.MotionEvent;
import android.view.View;

import com.myappconverter.uikit.util.UIKitEnums;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class MyAppLongPressGestureRecognizer extends MyAppGestureRecognizer {
    private double minimumPressDuration = 0.5;
    private int numberOfTouchesRequired = 1;
    private int numberOfTapsRequired = 0;
    private float allowableMovement = 10;

    //	private GestureDetectorCompat mGestureDetector;
    public MyAppLongPressGestureRecognizer() {
        //		mGestureDetector = new GestureDetectorCompat(GenericMainContext.sharedContext, new PanListener());
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        System.out.println("on touch long press gesture");
        invokMethodsSel();
        setState(UIKitEnums.UIGestureRecognizerState.UIGestureRecognizerStateCancelled);

        return true;
    }

    protected void invokMethodsSel() {
        if ((this.getTargetAction() != null) && (getTarget() != null)) {
            Method m = null;

            try {
                m = getTarget().getClass()
                        .getDeclaredMethod(getTargetAction().getMethodName(),
                        MyAppLongPressGestureRecognizer.class);
            } catch (NoSuchMethodException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            try {
                m.invoke(getTarget(), this);
            } catch (IllegalAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    /*
    class PanListener extends GestureDetector.SimpleOnGestureListener {
            @Override
            public void onLongPress(MotionEvent e) {
                    if(e.getPointerCount() >= numberOfTouchesRequired){
                            System.out.println("on touch listener longPress yes");
                            invokMethodsSel();
                            setState(UIGestureRecognizerState.UIGestureRecognizerStateCancelled);
                    }
            }

    }
    */
    public double getMinimumPressDuration() {
        return minimumPressDuration;
    }

    public void setMinimumPressDuration(double minimumPressDuration) {
        this.minimumPressDuration = minimumPressDuration;
    }

    public int getNumberOfTouchesRequired() {
        return numberOfTouchesRequired;
    }

    public void setNumberOfTouchesRequired(int numberOfTouchesRequired) {
        this.numberOfTouchesRequired = numberOfTouchesRequired;
    }

    public int getNumberOfTapsRequired() {
        return numberOfTapsRequired;
    }

    public void setNumberOfTapsRequired(int numberOfTapsRequired) {
        this.numberOfTapsRequired = numberOfTapsRequired;
    }

    public float getAllowableMovement() {
        return allowableMovement;
    }

    public void setAllowableMovement(float allowableMovement) {
        this.allowableMovement = allowableMovement;
    }
}
