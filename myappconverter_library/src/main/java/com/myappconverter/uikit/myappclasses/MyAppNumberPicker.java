package com.myappconverter.uikit.myappclasses;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;

import android.widget.NumberPicker;


public class MyAppNumberPicker extends NumberPicker {
    //	private NumberPicker numberPicker;
    //	private LayoutInflater inflater;
    private int stepValue;
    private boolean wraps;

    public MyAppNumberPicker(Context ctx) {
        super(ctx);
        stepValue = 1;

        //		inflater = LayoutInflater.from(ctx);
        //		View v = inflater.inflate(R.layout.datepicker_layout, null);
    }

    public int getStepValue() {
        return stepValue;
    }

    public void setStepValue(int stepValue) {
        this.stepValue = stepValue;
        this.setValue(this.getValue() + this.stepValue);
    }

    public boolean getWraps() {
        return wraps;
    }

    public void setWraps(boolean wraps) {
        this.wraps = wraps;

        if (wraps == true) {
            this.setMaxValue(this.getMinValue());
        } else {
            this.setMinValue(this.getMaxValue());
        }
    }
}
