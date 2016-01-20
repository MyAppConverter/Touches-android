package com.myappconverter.uikit.myappclasses;

import android.content.Context;

import android.content.res.TypedArray;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

import android.util.AttributeSet;

import android.view.Gravity;

import android.widget.ImageView;

import android.widget.ImageView.ScaleType;

import android.widget.RelativeLayout;
import android.widget.TextView;

import com.myappconverter.mapping.utils.AndroidRessourcesUtils;
import com.myappconverter.mapping.utils.GenericMainContext;

import java.lang.reflect.Field;


public class MyAppButton extends RelativeLayout {
    private StateListDrawable stateListDrawable;
    private StateListDrawable imageStateListDrawable;

    //
    public TextView wrappedTextView;
    public ImageView wrappedImageView;
    private String buttonText;
    private Drawable innerImage;
    private int textColor = 0xff000000;
    private int typeButton;

    public MyAppButton() {
        this(GenericMainContext.sharedContext);
    }

    public MyAppButton(Context context) {
        super(context);
        init(context);
    }

    public MyAppButton(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray a = context.obtainStyledAttributes(attrs,
                AndroidRessourcesUtils.getResourceDeclareStyleableIntArray(
                    context, "CustomButton"));

        final int N = a.getIndexCount();

        for (int i = 0; i < N; ++i) {
            int attr = a.getIndex(i);

            if (attr == AndroidRessourcesUtils.getResID("CustomButton_text",
                        "styleable")) {
                buttonText = a.getString(attr);
            } else if (attr == AndroidRessourcesUtils.getResID(
                        "CustomButton_image", "styleable")) {
                innerImage = a.getDrawable(AndroidRessourcesUtils.getResID(
                            "CustomButton_image", "styleable"));
            } else if (attr == AndroidRessourcesUtils.getResID(
                        "CustomButton_textColor", "styleable")) {
                textColor = a.getColor(AndroidRessourcesUtils.getResID(
                            "CustomButton_textColor", "styleable"), 0xff000000);
            }
        }

        a.recycle();

        init(context);
    }

    public MyAppButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public int getTypeButton() {
        return typeButton;
    }

    public void setTypeButton(int typeButton) {
        this.typeButton = typeButton;
    }

    private void init(Context context) {
        wrappedTextView = new TextView(context);
        wrappedImageView = new ImageView(context);
        wrappedImageView.setScaleType(ScaleType.CENTER_CROP);

        LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT);
        params.addRule(RelativeLayout.CENTER_IN_PARENT);
        wrappedTextView.setGravity(Gravity.CENTER);
        addView(wrappedImageView, params);
        addView(wrappedTextView, params);

        if (buttonText != null) {
            wrappedTextView.setText(buttonText);
        }

        if (innerImage != null) {
            wrappedImageView.setImageDrawable(innerImage);
        }

        wrappedTextView.setTextColor(textColor);
    }

    public void setText(CharSequence text) {
        wrappedTextView.setText(text);
    }

    public TextView getTextView() {
        return wrappedTextView;
    }

    public ImageView getImageView() {
        return wrappedImageView;
    }

    public TextView getWrappedTextView() {
        return wrappedTextView;
    }

    public void setWrappedTextView(TextView wrappedTextView) {
        this.wrappedTextView = wrappedTextView;
    }

    public ImageView getWrappedImageView() {
        return wrappedImageView;
    }

    public void setWrappedImageView(ImageView wrappedImageView) {
        this.wrappedImageView = wrappedImageView;
    }

    public String getButtonText() {
        return buttonText;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    public Drawable getInnerImage() {
        return innerImage;
    }

    public void setInnerImage(Drawable innerImage) {
        this.innerImage = innerImage;
        this.wrappedImageView.setImageDrawable(innerImage);
    }

    public int getTextColor() {
        return textColor;
    }

    public void setTextColor(int textColor) {
        this.textColor = textColor;
    }

    public StateListDrawable getStateListDrawable() {
        if (stateListDrawable == null) {
            stateListDrawable = new StateListDrawable();
        }

        return stateListDrawable;
    }

    public void setStateListDrawable(StateListDrawable stateListDrawable) {
        this.stateListDrawable = stateListDrawable;
    }

    public StateListDrawable getImageStateListDrawable() {
        return imageStateListDrawable;
    }

    public void setImageStateListDrawable(
        StateListDrawable imageStateListDrawable) {
        this.imageStateListDrawable = imageStateListDrawable;
    }
}
