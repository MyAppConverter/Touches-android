package com.myappconverter.uikit.myappclasses;

import android.content.Context;

import android.util.AttributeSet;

import android.view.View;

import android.widget.ListView;

import com.myappconverter.java.uikit.custom.events.ListViewDisplayed;
import com.myappconverter.java.uikit.custom.listeners.CustomListViewListener;

import java.util.ArrayList;
import java.util.Map;


public class MyAppCollectionView extends ListView {
    private ArrayList<CustomListViewListener> listenerList = new ArrayList<CustomListViewListener>();
    public int currentViewIndex = 0;

    public MyAppCollectionView(Context context) {
        super(context);
    }

    public MyAppCollectionView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyAppCollectionView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    protected void onOverScrolled(int scrollX, int scrollY, boolean clampedX,
        boolean clampedY) {
        super.onOverScrolled(scrollX, scrollY, clampedX, clampedY);
        processDisplayedEvent(new ListViewDisplayed(this));
    }

    // Register an event listener
    public synchronized void addCustomListener(CustomListViewListener listener) {
        if (!listenerList.contains(listener)) {
            listenerList.add(listener);
        }
    }

    private void processDisplayedEvent(ListViewDisplayed event) {
        ArrayList<CustomListViewListener> templistenerList;

        synchronized (this) {
            if (listenerList.size() == 0) {
                return;
            }

            templistenerList = (ArrayList<CustomListViewListener>) listenerList.clone();
        }

        for (CustomListViewListener listener : templistenerList) {
            listener.listDisplayed(event);
        }
    }

    @Override
    public void addHeaderView(View v) {
        super.addHeaderView(v);
    }

    @Override
    public void addHeaderView(View v, Object data, boolean isSelectable) {
        super.addHeaderView(v, data, isSelectable);
    }

    @Override
    public void addFooterView(View v) {
        super.addFooterView(v);
    }

    @Override
    public void addFooterView(View v, Object data, boolean isSelectable) {
        super.addFooterView(v, data, isSelectable);
    }
}
