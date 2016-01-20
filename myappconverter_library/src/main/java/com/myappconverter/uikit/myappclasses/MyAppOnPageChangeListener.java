package com.myappconverter.uikit.myappclasses;

public interface MyAppOnPageChangeListener {
    /**
     * THis is a poorly named event listener.  It gets called every time the page scroller updates its scroll position,
     * not just when a page changes.  It does this because we want to be updated while in the middle of a scroll.
     */
    public void onPageChange(MyAppPager scroller);

    /**
     * Called whenever a page is added or removed from the pager, so that any page indicators can update themselves.
     * @param scroller
     */
    public void onPageCountChange(MyAppPager scroller);
}
