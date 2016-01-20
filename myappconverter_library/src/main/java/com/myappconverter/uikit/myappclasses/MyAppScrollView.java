package com.myappconverter.uikit.myappclasses;

import android.content.Context;

import android.util.AttributeSet;

import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.myappconverter.java.uikit.custom.listeners.OnScrollStoppedListener;
import com.myappconverter.java.uikit.custom.views.CustomScrollView;

import com.myappconverter.uikit.bridges.protocols.UIScrollViewDelegate;
import com.myappconverter.uikit.util.UIKitEnums.UIScrollViewIndicatorStyle;


public class MyAppScrollView extends ScrollView {
    private static final String TAG = "MyScrollView";
    private UIScrollViewDelegate delegate;
    private Runnable scrollerTask;
    private int initialPosition;

    /**
     * A Boolean value that determines whether paging is enabled for the scroll view.
     */
    private boolean pagingEnabled;

    /**
     * Returns whether the content is moving in the scroll view after the user lifted their finger. (read-only)
     */
    private boolean decelerating;

    /**
     * Returns whether the user has touched the content to initiate scrolling. (read-only)
     */
    private boolean tracking;

    /**
     * The style of the scroll indicators.
     */
    private UIScrollViewIndicatorStyle indicatorStyle;

    /**
     * A floating-point value that determines the rate of deceleration after the user lifts their finger.
     */
    private float decelerationRate;

    /**
     * A Boolean value that determines whether the scroll view delays the handling of touch-down gestures.
     */
    private boolean delaysContentTouches;

    /**
     * A Boolean value that determines whether bouncing always occurs when horizontal scrolling reaches the end of the content view.
     */
    private boolean alwaysBounceHorizontal;

    /**
     * A Boolean value that determines whether bouncing always occurs when vertical scrolling reaches the end of the content.
     */
    private boolean alwaysBounceVertical;

    /**
     * A Boolean value that controls whether the scroll view bounces past the edge of content and back again.
     */
    private boolean bounces;

    /**
     * A Boolean value that controls whether the scroll-to-top gesture is enabled.
     */
    private boolean scrollsToTop;

    /**
     * A floating-point value that specifies the maximum scale factor that can be applied to the scroll view's content.
     */
    private float maximumZoomScale;

    /**
     * A floating-point value that specifies the minimum scale factor that can be applied to the scroll view's content.
     */
    private float minimumZoomScale;

    /**
     * A floating-point value that specifies the current scale factor applied to the scroll view's content.
     */
    private float zoomScale;

    /**
     * A Boolean value that indicates that zooming has exceeded the scaling limits specified for the receiver. (read-only)
     */
    private boolean zoomBouncing;

    /**
     * A Boolean value that indicates whether the content view is currently zooming in or out. (read-only)
     */
    private boolean zooming;

    /**
     * A Boolean value that determines whether the scroll view animates the content scaling when the scaling exceeds the maximum or minimum limits.
     */
    private boolean bouncesZoom;
    private int newCheck = 100;
    private OnScrollStoppedListener onScrollStoppedListener;

    public MyAppScrollView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public MyAppScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
        scrollerTask = new Runnable() {
                    public void run() {
                        int newPosition = getScrollY();

                        if ((initialPosition - newPosition) == 0) { // has stopped

                            if (onScrollStoppedListener != null) {
                                onScrollStoppedListener.onScrollStopped();
                            }
                        } else {
                            initialPosition = getScrollY();
                            MyAppScrollView.this.postDelayed(scrollerTask,
                                newCheck);
                        }
                    }
                };
    }

    public MyAppScrollView(Context context) {
        super(context);
    }

    public void setOnScrollStoppedListener(OnScrollStoppedListener listener) {
        onScrollStoppedListener = listener;
    }

    public void startScrollerTask() {
        initialPosition = getScrollY();
        MyAppScrollView.this.postDelayed(scrollerTask, newCheck);
    }

    public void setContentSize(CustomScrollView customScrollView, int width,
        int height) {
        customScrollView.setLayoutParams(new LinearLayout.LayoutParams(width,
                height));
    }

    public UIScrollViewDelegate delegate() {
        return delegate;
    }

    public UIScrollViewDelegate getDelegate() {
        return delegate;
    }

    public void setDelegate(UIScrollViewDelegate delegate) {
        this.delegate = delegate;
    }

    public Runnable getScrollerTask() {
        return scrollerTask;
    }

    public void setScrollerTask(Runnable scrollerTask) {
        this.scrollerTask = scrollerTask;
    }

    public int getInitialPosition() {
        return initialPosition;
    }

    public void setInitialPosition(int initialPosition) {
        this.initialPosition = initialPosition;
    }

    public boolean isPagingEnabled() {
        return pagingEnabled;
    }

    public void setPagingEnabled(boolean pagingEnabled) {
        this.pagingEnabled = pagingEnabled;
    }

    public UIScrollViewIndicatorStyle getIndicatorStyle() {
        return indicatorStyle;
    }

    public void setIndicatorStyle(UIScrollViewIndicatorStyle indicatorStyle) {
        this.indicatorStyle = indicatorStyle;
    }

    public float getDecelerationRate() {
        return decelerationRate;
    }

    public void setDecelerationRate(float decelerationRate) {
        this.decelerationRate = decelerationRate;
    }

    public boolean isDelaysContentTouches() {
        return delaysContentTouches;
    }

    public void setDelaysContentTouches(boolean delaysContentTouches) {
        this.delaysContentTouches = delaysContentTouches;
    }

    public boolean isAlwaysBounceHorizontal() {
        return alwaysBounceHorizontal;
    }

    public void setAlwaysBounceHorizontal(boolean alwaysBounceHorizontal) {
        this.alwaysBounceHorizontal = alwaysBounceHorizontal;
    }

    public boolean isAlwaysBounceVertical() {
        return alwaysBounceVertical;
    }

    public void setAlwaysBounceVertical(boolean alwaysBounceVertical) {
        this.alwaysBounceVertical = alwaysBounceVertical;
    }

    public boolean isBounces() {
        return bounces;
    }

    public void setBounces(boolean bounces) {
        this.bounces = bounces;
    }

    public int getNewCheck() {
        return newCheck;
    }

    public void setNewCheck(int newCheck) {
        this.newCheck = newCheck;
    }

    public boolean isDecelerating() {
        return decelerating;
    }

    public boolean isTracking() {
        return tracking;
    }

    public OnScrollStoppedListener getOnScrollStoppedListener() {
        return onScrollStoppedListener;
    }

    public boolean isScrollsToTop() {
        return scrollsToTop;
    }

    public void setScrollsToTop(boolean scrollsToTop) {
        this.scrollsToTop = scrollsToTop;
    }

    public float getMaximumZoomScale() {
        return maximumZoomScale;
    }

    public void setMaximumZoomScale(float maximumZoomScale) {
        this.maximumZoomScale = maximumZoomScale;
    }

    public float getMinimumZoomScale() {
        return minimumZoomScale;
    }

    public void setMinimumZoomScale(float minimumZoomScale) {
        this.minimumZoomScale = minimumZoomScale;
    }

    public float getZoomScale() {
        return zoomScale;
    }

    public void setZoomScale(float zoomScale) {
        this.zoomScale = zoomScale;
    }

    public boolean isBouncesZoom() {
        return bouncesZoom;
    }

    public void setBouncesZoom(boolean bouncesZoom) {
        this.bouncesZoom = bouncesZoom;
    }

    public boolean isZoomBouncing() {
        return zoomBouncing;
    }

    public boolean isZooming() {
        return zooming;
    }

    public void setDecelerating(boolean decelerating) {
        this.decelerating = decelerating;
    }

    public void setTracking(boolean tracking) {
        this.tracking = tracking;
    }
}
