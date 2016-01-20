package com.myappconverter.uikit.myappclasses;

import android.content.Context;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import android.view.View;

import com.myappconverter.java.coregraphics.CGPath.CGLineCap;
import com.myappconverter.java.coregraphics.CGPath.CGLineJoin;
import com.myappconverter.java.coregraphics.CGPathRef;
import com.myappconverter.java.coregraphics.CGPoint;
import com.myappconverter.java.coregraphics.CGRect;


public class MyAppBezierPath extends View {
    private CGRect bounds;
    private CGPathRef path;
    private CGPoint currentPoint = CGPoint.zero();
    private boolean empty;
    private float flatness;
    private CGLineCap lineCapStyle;
    private CGLineJoin lineJoinStyle;
    private float lineWidth;
    private float miterLimit;
    private boolean usesEvenOddFillRule;

    public MyAppBezierPath(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        // TODO Auto-generated method stub
        super.onDraw(canvas);

        Paint myPaint = new Paint();
        myPaint.setColor(Color.rgb(0, 0, 0));
        myPaint.setStyle(Paint.Style.STROKE);

        if (lineWidth < 1) {
            myPaint.setStrokeWidth(2);
        } else {
            myPaint.setStrokeWidth(lineWidth);
        }

        if (path != null) {
            canvas.drawPath(path.getWrappedPath(), myPaint);
        }
    }

    public CGRect getBounds() {
        return bounds;
    }

    public void setBounds(CGRect bounds) {
        this.bounds = bounds;
    }

    public CGPathRef getCGPath() {
        return path;
    }

    public void setCGPath(CGPathRef cGPath) {
        path = cGPath;
    }

    public CGPoint getCurrentPoint() {
        return currentPoint;
    }

    public void setCurrentPoint(CGPoint currentPoint) {
        this.currentPoint = currentPoint;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public float getFlatness() {
        return flatness;
    }

    public void setFlatness(float flatness) {
        this.flatness = flatness;
    }

    public CGLineCap getLineCapStyle() {
        return lineCapStyle;
    }

    public void setLineCapStyle(CGLineCap lineCapStyle) {
        this.lineCapStyle = lineCapStyle;
    }

    public CGLineJoin getLineJoinStyle() {
        return lineJoinStyle;
    }

    public void setLineJoinStyle(CGLineJoin lineJoinStyle) {
        this.lineJoinStyle = lineJoinStyle;
    }

    public float getLineWidth() {
        return lineWidth;
    }

    public void setLineWidth(float lineWidth) {
        this.lineWidth = lineWidth;
    }

    public float getMiterLimit() {
        return miterLimit;
    }

    public void setMiterLimit(float miterLimit) {
        this.miterLimit = miterLimit;
    }

    public boolean isUsesEvenOddFillRule() {
        return usesEvenOddFillRule;
    }

    public void setUsesEvenOddFillRule(boolean usesEvenOddFillRule) {
        this.usesEvenOddFillRule = usesEvenOddFillRule;
    }
}
