package com.myappconverter.uikit.myappclasses;

import android.view.MotionEvent;
import android.view.View;

import com.myappconverter.java.coregraphics.CGPoint;


public class MyAppTapGestureRecognizer extends MyAppGestureRecognizer {
    private int numberOfTapsRequired = 1;
    private int numberOfTouchesRequired = 1;

    public int getNumberOfTapsRequired() {
        return numberOfTapsRequired;
    }

    public void setNumberOfTapsRequired(int numberOfTapsRequired) {
        this.numberOfTapsRequired = numberOfTapsRequired;
    }

    public int getNumberOfTouchesRequired() {
        return numberOfTouchesRequired;
    }

    public void setNumberOfTouchesRequired(int numberOfTouchesRequired) {
        this.numberOfTouchesRequired = numberOfTouchesRequired;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        boolean actionTap = false;
        setTouchLocation(new CGPoint(event.getRawX(), event.getRawY()));

        switch (event.getAction()) {
        case MotionEvent.ACTION_DOWN:
            invokMethodsSel(v, event);
            actionTap = true;

            break;

        default:
            break;
        }

        return actionTap;
    }

    private void invokMethodsSel(View v, MotionEvent event) {
        try {
            if ((this.getTargetAction() != null) && (getTarget() != null)) {
                final String methodName = getTargetAction()
                                              .getMethodName();
                //				if (getTarget() instanceof GLKViewController) {
                //					try {
                //						GLKViewController glk = (GLKViewController) target;
                //						GLKView view = (GLKView) glk.view();
                //						view.getGLSurfaceView().queueEvent(new Runnable() {
                //							@Override
                //							public void run() {
                //								try {
                //									targetAction.invokeMethodOnTarget(target, methodName, UITapGestureRecognizerBase.this);
                //								} catch (Exception e) {
                //									e.printStackTrace();
                //								}
                //							}
                //						});
                //					} catch (Exception e) {
                //
                //						e.printStackTrace();
                //					}
                //				} else {
                getTargetAction()
                    .invokeMethodOnTarget(getTarget(), methodName, this);

                //				}
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initTapEvent(View v, MotionEvent event) {
        this.setTouchLocation(new CGPoint(event.getX(), event.getY()));
    }
}
