package com.myappconverter.uikit.myappclasses;

import android.view.View;

import com.myappconverter.java.coregraphics.CGPoint;
import com.myappconverter.java.foundations.NSObject;

import com.myappconverter.uikit.util.UIKitEnums.UITouchPhase;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class MyAppTouch {
    private float x;
    private float y;
    private float previousX;
    private float previousY;
    private android.view.View view;
    private double timestamp = 0;
    public UITouchPhase phase;
    public int tapcount;

    public MyAppTouch() {
        super();
    }

    public MyAppTouch(android.view.View v) {
        view = v;
    }

    public MyAppTouch(float x, float y, float previousX, float previousY,
        View view, double timestamp, UITouchPhase phase, int tapcount) {
        this.x = x;
        this.y = y;
        this.previousX = previousX;
        this.previousY = previousY;
        this.view = view;
        this.timestamp = timestamp;
        this.phase = phase;
        this.tapcount = tapcount;
    }

    public int getTapCount() {
        return tapcount;
    }

    public double getTimestamp() {
        return timestamp;
    }

    public UITouchPhase getPhase() {
        return phase;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getPreviousX() {
        return previousX;
    }

    public void setPreviousX(float previousX) {
        this.previousX = previousX;
    }

    public float getPreviousY() {
        return previousY;
    }

    public void setPreviousY(float previousY) {
        this.previousY = previousY;
    }

    public android.view.View getView() {
        return view;
    }

    public void setView(android.view.View view) {
        this.view = view;
    }

    // Added by Othman to support SpriteKit specs
    public CGPoint locationInNode(NSObject node) {
        try {
            Method m = node.getClass()
                           .getMethod("convertToNodeSpace", Float.class,
                    Float.class);
            CGPoint ret = (CGPoint) m.invoke(node, x, y);

            return ret;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        return new CGPoint(0, 0);
    }
}
