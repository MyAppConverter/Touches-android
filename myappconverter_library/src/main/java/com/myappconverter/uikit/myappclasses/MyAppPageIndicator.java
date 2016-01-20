package com.myappconverter.uikit.myappclasses;

import android.annotation.SuppressLint;

import android.content.Context;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

import android.util.AttributeSet;

import android.view.View;

import com.myappconverter.mapping.utils.AndroidRessourcesUtils;


public class MyAppPageIndicator extends View {
    private MyAppPager pager;
    private Paint dotPaint;
    private int cellSize;
    private MyAppOnPageChangeListener scrollListener = new MyAppOnPageChangeListener() {
            public void onPageChange(MyAppPager scroller) {
                update();
            }

            public void onPageCountChange(MyAppPager scroller) {
                updatePageCount();
            }
        };

    public MyAppPageIndicator(Context context, AttributeSet attrs) {
        super(context, attrs);
        initPaints();
    }

    public MyAppPageIndicator(Context context) {
        super(context);
        initPaints();
    }

    private final void initPaints() {
        dotPaint = new Paint();
        dotPaint.setAntiAlias(true);
        dotPaint.setStyle(Paint.Style.FILL);
        dotPaint.setColor(Color.WHITE);

        cellSize = 16;
    }

    public void setPageIndicatorTintColor(int mColor) {
        dotPaint.setColor(mColor);
    }

    public int getPageIndicatorTintColor() {
        return dotPaint.getColor();
    }

    public void setPager(MyAppPager pager) {
        if (pager != null) {
            pager.removeOnPageChangeListener(scrollListener);
        }

        this.pager = pager;

        if (pager != null) {
            pager.addOnPageChangeListener(scrollListener);
        }
    }

    public void update() {
        invalidate();
    }

    public void updatePageCount() {
        requestLayout();
        invalidate();
    }

    private int getNumPages() {
        return (pager == null) ? 1 : pager.getPageCount();
    }

    private int getActivePage() {
        return (pager == null) ? 0 : pager.getCurrentPage();
    }

    /**
     * @see View#measure(int, int)
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(measureWidth(widthMeasureSpec),
            measureHeight(heightMeasureSpec));
    }

    /**
     * Determines the width of this view
     *
     * @param measureSpec A measureSpec packed into an int
     * @return The width of the view, honoring constraints from measureSpec
     */
    private int measureWidth(int measureSpec) {
        int result = 0;
        int specMode = MeasureSpec.getMode(measureSpec);
        int specSize = MeasureSpec.getSize(measureSpec);

        if (specMode == MeasureSpec.EXACTLY) {
            // We were told how big to be
            result = specSize;
        } else {
            result = getNumPages() * cellSize;

            if (specMode == MeasureSpec.AT_MOST) {
                // Respect AT_MOST value if that was what is called for by
                // measureSpec
                result = Math.min(result, specSize);
            }
        }

        return result;
    }

    /**
     * Determines the height of this view
     *
     * @param measureSpec A measureSpec packed into an int
     * @return The height of the view, honoring constraints from measureSpec
     */
    private int measureHeight(int measureSpec) {
        int result = 0;
        int specMode = MeasureSpec.getMode(measureSpec);
        int specSize = MeasureSpec.getSize(measureSpec);

        if (specMode == MeasureSpec.EXACTLY) {
            // We were told how big to be
            result = specSize;
        } else {
            result = cellSize;

            if (specMode == MeasureSpec.AT_MOST) {
                // Respect AT_MOST value if that was what is called for by
                // measureSpec
                result = Math.min(result, specSize);
            }
        }

        return result;
    }

    /**
     * Render the pager
     *
     * @see View#onDraw(Canvas)
     */
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int count = getNumPages();
        int current = getActivePage();

        int x = 0;

        for (int i = 0; i < count; i++, x += cellSize) {
            if (i == current) {
                RectF oval = new RectF(x + 1, 1, (x + cellSize) - 2,
                        cellSize - 2);
                canvas.drawOval(oval, dotPaint);
            } else {
                int dotSize = 10;
                int dotOffset = (cellSize - dotSize) / 2;
                RectF oval = new RectF(x + dotOffset, dotOffset,
                        x + dotOffset + dotSize, dotOffset + dotSize);
                canvas.drawOval(oval, dotPaint);
            }
        }
    }

    public int getCurrentPage() {
        return pager.getCurrentPage();
    }

    public void setCurrentPage(int current) {
        int width = AndroidRessourcesUtils.deviceWidth();

        if ((current > 0) && (current < getNumberOfPages())) {
            pager.smoothScrollTo(width * current, 0);
        } else if (current == 0) {
            pager.smoothScrollTo(0, 0);
        } else if (current == getNumPages()) {
            pager.smoothScrollTo(width * (getNumberOfPages() - 1), 0);
        }
    }

    public int getNumberOfPages() {
        return pager.contents.getChildCount();
    }
}
