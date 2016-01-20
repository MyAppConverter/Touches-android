package com.myappconverter.uikit.myappclasses;

import android.annotation.SuppressLint;

import android.content.Context;

import android.os.Handler;

import android.util.AttributeSet;
import android.util.Log;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;

import android.widget.Button;
import android.widget.RelativeLayout;

import com.myappconverter.mapping.utils.AndroidRessourcesUtils;


public class MyAppStepper extends RelativeLayout {
    public static final double DEFAULT_MAX_VALUE = 100.0;
    public static final double DEFAULT_MIN_VALUE = 0.0;
    public static final double DEFAULT_STEP_VALUE = 1.0;
    private Button mIncrementButton;
    private Button mDecrementButton;
    private Double mValue;
    private Double mMaxValue;
    private Double mMinValue;
    private Double mStepValue;
    private boolean mWraps;
    private LayoutInflater mInflater;
    private boolean mContinious;
    private boolean mAutorepeat;
    private Integer mTintColor;

    public MyAppStepper(Context context) {
        super(context);
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        init();
    }

    public MyAppStepper(Context context, AttributeSet attrs, int defStyleAttr,
        int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        init();
    }

    public MyAppStepper(Context context, AttributeSet attrs) {
        super(context, attrs);
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        init();
    }

    public MyAppStepper(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        init();
    }

    public void init() {
        View v = mInflater.inflate(AndroidRessourcesUtils.getResID(
                    "myappstepper_layout", "layout"), this, true);
        mIncrementButton = (Button) v.findViewById(AndroidRessourcesUtils.getResID(
                    "incrementButton", "id"));
        mDecrementButton = (Button) v.findViewById(AndroidRessourcesUtils.getResID(
                    "decrementButton", "id"));
        mValue = DEFAULT_MIN_VALUE;
        mMaxValue = DEFAULT_MAX_VALUE;
        mMinValue = DEFAULT_MIN_VALUE;
        mStepValue = DEFAULT_STEP_VALUE;
        mAutorepeat = true;
        mWraps = false;
        mContinious = true;
        mIncrementButton.setOnClickListener(null);
        mIncrementButton.setOnTouchListener(new View.OnTouchListener() {
                private Handler mHandler;

                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:

                        if (mHandler != null) {
                            return true;
                        }

                        mHandler = new Handler();
                        mHandler.postDelayed(mAction, 100);

                        if (mValue < mMaxValue) {
                            mValue = mValue + mStepValue;
                        } else if ((mValue.intValue() + mStepValue) == mMaxValue.intValue()) {
                            mValue = mMaxValue;
                        }

                        break;

                    case MotionEvent.ACTION_UP:

                        if (mHandler == null) {
                            return true;
                        }

                        mHandler.removeCallbacks(mAction);
                        mHandler = null;

                        break;

                    default:
                        break;
                    }

                    return false;
                }

                Runnable mAction = new Runnable() {
                        @Override
                        public void run() {
                            if (mValue < mMaxValue) {
                                mValue = mValue + mStepValue;
                            } else if ((mValue.intValue() + mStepValue) == mMaxValue.intValue()) {
                                mValue = mValue + mMaxValue;
                            }

                            mHandler.postDelayed(this, 500);
                        }
                    };
            });

        mDecrementButton.setOnClickListener(null);
        mDecrementButton.setOnTouchListener(new View.OnTouchListener() {
                private Handler mHandler;

                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:

                        if (mHandler != null) {
                            return true;
                        }

                        mHandler = new Handler();
                        mHandler.postDelayed(mAction, 100);

                        if (mValue > mMinValue) {
                            mValue = mValue - mStepValue;
                        } else if ((mValue.intValue() - mStepValue) == mMinValue.intValue()) {
                            mValue = mMinValue;
                        }

                        break;

                    case MotionEvent.ACTION_UP:

                        if (mHandler == null) {
                            return true;
                        }

                        mHandler.removeCallbacks(mAction);
                        mHandler = null;

                        break;

                    default:
                        break;
                    }

                    return false;
                }

                Runnable mAction = new Runnable() {
                        @Override
                        public void run() {
                            if (mValue > mMinValue) {
                                mValue = mValue - mStepValue;
                            } else if ((mValue.intValue() - mStepValue) == mMinValue.intValue()) {
                                mValue = mMinValue;
                            }

                            mHandler.postDelayed(this, 500);
                        }
                    };
            });
    }

    public Double getStepValue() {
        return mStepValue;
    }

    public void setStepValue(Double stepValue) {
        if (stepValue > 0) {
            this.mStepValue = stepValue;
            this.setValue(this.getValue() + this.mStepValue);
        }
    }

    public boolean getWraps() {
        return mWraps;
    }

    public void setWraps(boolean wraps) {
        this.mWraps = wraps;

        if (wraps == true) {
            this.setValue(this.getMinValue());
        } else {
            this.setValue(this.getMaxValue());
        }
    }

    public Button getIncrementButton() {
        return mIncrementButton;
    }

    public void setIncrementButton(Button incrementButton) {
        this.mIncrementButton = incrementButton;
    }

    public Button getDecrementButton() {
        return mDecrementButton;
    }

    public void setDecrementButton(Button decrementButton) {
        this.mDecrementButton = decrementButton;
    }

    public Double getValue() {
        return mValue;
    }

    public void setValue(Double value) {
        if ((value >= mMinValue) && (value <= mMaxValue)) {
            this.mValue = value;
        }
    }

    public Double getMaxValue() {
        return mMaxValue;
    }

    public void setMaxValue(Double maxValue) {
        if (maxValue > mMinValue) {
            this.mMaxValue = maxValue;
        }
    }

    public Double getMinValue() {
        return mMinValue;
    }

    public void setMinValue(Double minValue) {
        if (minValue < mMaxValue) {
            this.mMinValue = minValue;
        }
    }

    public boolean getContinious() {
        return mContinious;
    }

    public void setContinious(boolean continious) {
        this.mContinious = continious;
    }

    public boolean getAutorepeat() {
        return mAutorepeat;
    }

    public void setAutorepeat(boolean autorepeat) {
        this.mAutorepeat = autorepeat;
    }

    public Integer getTintColor() {
        return mTintColor;
    }

    public void setTintColor(Integer tintColor) {
        this.mTintColor = tintColor;
    }
}
