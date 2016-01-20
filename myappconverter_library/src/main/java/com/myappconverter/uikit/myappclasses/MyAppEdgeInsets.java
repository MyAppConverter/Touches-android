package com.myappconverter.uikit.myappclasses;

public class MyAppEdgeInsets {
    public float top;
    public float left;
    public float bottom;
    public float right;

    public MyAppEdgeInsets() {
        super();
        top = left = bottom = right = 0;
    }

    public MyAppEdgeInsets(float top, float left, float bottom, float right) {
        super();
        this.top = top;
        this.left = left;
        this.bottom = bottom;
        this.right = right;
    }

    public MyAppEdgeInsets(double top, double left, double bottom, double right) {
        super();
        this.top = (float) top;
        this.left = (float) left;
        this.bottom = (float) bottom;
        this.right = (float) right;
    }
}
