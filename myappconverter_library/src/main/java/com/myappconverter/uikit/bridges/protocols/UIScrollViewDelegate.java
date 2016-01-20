package com.myappconverter.uikit.bridges.protocols;

import android.widget.ScrollView;

import com.myappconverter.java.coregraphics.CGPoint;


public interface UIScrollViewDelegate {
    public void scrollViewDidEndDecelerating(ScrollView sv);

    public void scrollViewDidEndDraggingWillDecelerate(ScrollView sv,
        boolean decelerate);

    public void scrollViewDidEndScrollingAnimation(ScrollView sv);

    public void scrollViewDidEndZoomingWithViewAtScale(ScrollView sv);

    public void scrollViewDidScroll(ScrollView sv);

    public void scrollViewDidScrollToTop(ScrollView sv);

    public void scrollViewDidZoom(ScrollView sv);

    public boolean scrollViewShouldScrollToTop(ScrollView sv);

    public void scrollViewWillBeginDecelerating(ScrollView sv);

    public void scrollViewWillBeginDragging(ScrollView sv);

    public void scrollViewWillBeginZoomingWithView(ScrollView sv,
        android.view.View view);

    public void scrollViewWillEndDraggingWithVelocityTargetContentOffset(
        ScrollView sv, CGPoint velocity, CGPoint targetContentOffset);

    public android.view.View viewForZoomingInScrollView(ScrollView sv);
}
