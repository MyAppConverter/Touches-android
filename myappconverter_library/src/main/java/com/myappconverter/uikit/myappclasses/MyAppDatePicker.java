package com.myappconverter.uikit.myappclasses;

import android.annotation.SuppressLint;

import android.content.Context;

import android.util.AttributeSet;

import android.view.LayoutInflater;
import android.view.View;

import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TimePicker;

import com.myappconverter.java.foundations.NSTimeZone;

import com.myappconverter.mapping.utils.AndroidRessourcesUtils;

import com.myappconverter.uikit.util.UIKitEnums.UIDatePickerMode;

import java.util.Locale;


public class MyAppDatePicker extends RelativeLayout {
    public static final int MINUTE_INTERVAL_MIN = 0;
    public static final int MINUTE_INTERVAL_MAX = 31;
    public static final int COUNT_DOWN_DURATION_MAX = 1439000;
    private DatePicker mDatePicker;
    private TimePicker mTimePicker;
    private LayoutInflater mInflater;
    private NSTimeZone mNSTimeZone;
    private Locale mLocale;
    private TextView mTextView;
    private Button mStartButton;
    private long mCountDownDuration;
    private UIDatePickerMode mDatePickerMode;

    public MyAppDatePicker(Context context) {
        super(context);
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        init();
    }

    public MyAppDatePicker(Context context, AttributeSet attrs,
        int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        init();
    }

    public MyAppDatePicker(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        init();
    }

    public MyAppDatePicker(Context context, AttributeSet attrs) {
        super(context, attrs);
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        init();
    }

    public void init() {
        View v = mInflater.inflate(AndroidRessourcesUtils.getResID(
                    "datepicker_layout", "layout"), this, true);
        mDatePicker = (DatePicker) v.findViewById(AndroidRessourcesUtils.getResID(
                    "datePicker", "id"));
        mTimePicker = (TimePicker) v.findViewById(AndroidRessourcesUtils.getResID(
                    "timePicker", "id"));
        mTextView = (TextView) v.findViewById(AndroidRessourcesUtils.getResID(
                    "textView", "id"));
        mStartButton = (Button) v.findViewById(AndroidRessourcesUtils.getResID(
                    "startButton", "id"));
        mCountDownDuration = 0;
        mDatePickerMode = UIDatePickerMode.UIDatePickerModeDateAndTime;
        setDatePickerMode(UIDatePickerMode.UIDatePickerModeDateAndTime);
        mStartButton.setOnClickListener(new MyAppDatePicker.OnClickListener() {
                public void onClick(View v) {
                    setCountDownDuration(0);
                }
            });
    }

    public DatePicker getDatePicker() {
        return this.mDatePicker;
    }

    public void setDatePicker(DatePicker datePicker) {
        this.mDatePicker = datePicker;
    }

    public TimePicker getTimePicker() {
        return this.mTimePicker;
    }

    public void setTimePicker(TimePicker timePicker) {
        this.mTimePicker = timePicker;
    }

    public NSTimeZone getNSTimeZone() {
        return this.mNSTimeZone;
    }

    public void setNSTimeZone(NSTimeZone nsTimeZone) {
        this.mNSTimeZone = nsTimeZone;
    }

    public Locale getLocale() {
        return this.mLocale;
    }

    public void setLocale(Locale locale) {
        this.mLocale = locale;
    }

    public TextView getTextView() {
        return this.mTextView;
    }

    public void setTextView(TextView textView) {
        this.mTextView = textView;
    }

    public Button getStartButton() {
        return this.mStartButton;
    }

    public void setStartButton(Button startButton) {
        this.mStartButton = startButton;
    }

    public long getCountDownDuration() {
        return this.mCountDownDuration;
    }

    public void setCountDownDuration(long countDownDuration) {
        this.mCountDownDuration = countDownDuration;
    }

    public UIDatePickerMode getDatePickerMode() {
        return this.mDatePickerMode;
    }

    public void setDatePickerMode(UIDatePickerMode datePickerMode) {
        mDatePickerMode = datePickerMode;
    }
}
