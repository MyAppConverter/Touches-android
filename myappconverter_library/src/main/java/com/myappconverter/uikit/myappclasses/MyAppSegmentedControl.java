package com.myappconverter.uikit.myappclasses;

import android.content.Context;

import android.content.res.ColorStateList;
import android.content.res.Resources;

import android.graphics.Color;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;

import android.os.Build;

import android.util.AttributeSet;
import android.util.TypedValue;

import android.view.View;

import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

import com.myappconverter.mapping.utils.AndroidRessourcesUtils;
import com.myappconverter.mapping.utils.GenericMainContext;


public class MyAppSegmentedControl extends RadioGroup {
    private int oneDP;
    private Resources resources;
    private int mTintColor;
    private int mCheckedTextColor = Color.WHITE;

    public MyAppSegmentedControl() {
        super(GenericMainContext.sharedContext);
        resources = getResources();
        mTintColor = resources.getColor(AndroidRessourcesUtils.getResID(
                    "radio_button_selected_color", "color"));
        oneDP = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 1,
                resources.getDisplayMetrics());
    }

    public MyAppSegmentedControl(Context context) {
        super(context);
        resources = getResources();
        mTintColor = resources.getColor(AndroidRessourcesUtils.getResID(
                    "radio_button_selected_color", "color"));
        oneDP = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 1,
                resources.getDisplayMetrics());
    }

    public MyAppSegmentedControl(Context context, AttributeSet attrs) {
        super(context, attrs);
        resources = getResources();
        mTintColor = resources.getColor(AndroidRessourcesUtils.getResID(
                    "radio_button_selected_color", "color"));
        oneDP = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 1,
                resources.getDisplayMetrics());
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        // Use holo light for default
        updateBackground();
    }

    public void setTintColor(int tintColor) {
        mTintColor = tintColor;
        updateBackground();
    }

    public int getTintColor() {
        return mTintColor;
    }

    public void setTintColor(int tintColor, int checkedTextColor) {
        mTintColor = tintColor;
        mCheckedTextColor = checkedTextColor;
        updateBackground();
    }

    public void updateBackground() {
        int count = super.getChildCount();

        if (count > 1) {
            View child = getChildAt(0);
            LayoutParams initParams = (LayoutParams) child.getLayoutParams();
            LayoutParams params = new LayoutParams(initParams.width,
                    initParams.height, initParams.weight);

            // Check orientation for proper margins
            if (getOrientation() == LinearLayout.HORIZONTAL) {
                params.setMargins(0, 0, -oneDP, 0);
            } else {
                params.setMargins(0, 0, 0, -oneDP);
            }

            child.setLayoutParams(params);

            // Check orientation for proper layout
            if (getOrientation() == LinearLayout.HORIZONTAL) {
                updateBackground(getChildAt(0),
                    AndroidRessourcesUtils.getResID("radio_checked_left",
                        "drawable"),
                    AndroidRessourcesUtils.getResID("radio_unchecked_left",
                        "drawable"));
            } else {
                updateBackground(getChildAt(0),
                    AndroidRessourcesUtils.getResID("radio_checked_top",
                        "drawable"),
                    AndroidRessourcesUtils.getResID("radio_unchecked_top",
                        "drawable"));
            }

            for (int i = 1; i < (count - 1); i++) {
                // Check orientation for proper layout
                if (getOrientation() == LinearLayout.HORIZONTAL) {
                    updateBackground(getChildAt(i),
                        AndroidRessourcesUtils.getResID(
                            "radio_checked_middle", "drawable"),
                        AndroidRessourcesUtils.getResID(
                            "radio_unchecked_middle", "drawable"));
                } else {
                    // Middle radiobutton when checked is the same as horizontal.
                    updateBackground(getChildAt(i),
                        AndroidRessourcesUtils.getResID(
                            "radio_checked_middle", "drawable"),
                        AndroidRessourcesUtils.getResID(
                            "radio_unchecked_middle_vertical", "drawable"));
                }

                View child2 = getChildAt(i);
                initParams = (LayoutParams) child2.getLayoutParams();
                params = new LayoutParams(initParams.width, initParams.height,
                        initParams.weight);

                // Check orientation for proper margins
                if (getOrientation() == LinearLayout.HORIZONTAL) {
                    params.setMargins(0, 0, -oneDP, 0);
                } else {
                    params.setMargins(0, 0, 0, -oneDP);
                }

                child2.setLayoutParams(params);
            }

            // Check orientation for proper layout
            if (getOrientation() == LinearLayout.HORIZONTAL) {
                updateBackground(getChildAt(count - 1),
                    AndroidRessourcesUtils.getResID("radio_checked_right",
                        "drawable"),
                    AndroidRessourcesUtils.getResID("radio_unchecked_right",
                        "drawable"));
            } else {
                updateBackground(getChildAt(count - 1),
                    AndroidRessourcesUtils.getResID("radio_checked_bottom",
                        "drawable"),
                    AndroidRessourcesUtils.getResID("radio_unchecked_bottom",
                        "drawable"));
            }
        } else if (count == 1) {
            updateBackground(getChildAt(0),
                AndroidRessourcesUtils.getResID("radio_checked_default",
                    "drawable"),
                AndroidRessourcesUtils.getResID("radio_unchecked_default",
                    "drawable"));
        }
    }

    private void updateBackground(View view, int checked, int unchecked) {
        // Set text color
        ColorStateList colorStateList = new ColorStateList(new int[][] {
                    { android.R.attr.state_pressed },
                    {
                        -android.R.attr.state_pressed,
                        -android.R.attr.state_checked
                    },
                    { -android.R.attr.state_pressed, android.R.attr.state_checked }
                }, new int[] { Color.GRAY, mTintColor, mCheckedTextColor });
        ((Button) view).setTextColor(colorStateList);

        // Redraw with tint color
        Drawable checkedDrawable = resources.getDrawable(checked).mutate();
        Drawable uncheckedDrawable = resources.getDrawable(unchecked).mutate();
        ((GradientDrawable) checkedDrawable).setColor(mTintColor);
        ((GradientDrawable) uncheckedDrawable).setStroke(oneDP, mTintColor);

        // Create drawable
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[] { -android.R.attr.state_checked },
            uncheckedDrawable);
        stateListDrawable.addState(new int[] { android.R.attr.state_checked },
            checkedDrawable);

        // Set button background
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(stateListDrawable);
        } else {
            view.setBackgroundDrawable(stateListDrawable);
        }
    }
}
