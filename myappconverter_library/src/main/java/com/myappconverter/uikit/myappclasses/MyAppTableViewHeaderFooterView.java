package com.myappconverter.uikit.myappclasses;

import android.content.Context;

import android.view.Gravity;

import android.widget.LinearLayout;
import android.widget.TextView;


public class MyAppTableViewHeaderFooterView extends LinearLayout {
    public TextView textLabel;
    public TextView detailTextLabel;

    public MyAppTableViewHeaderFooterView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        textLabel = new TextView(context);
        detailTextLabel = new TextView(context);

        LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        this.setGravity(LinearLayout.VERTICAL);
        textLabel.setGravity(Gravity.CENTER);
        detailTextLabel.setGravity(Gravity.CENTER);
        addView(textLabel, params);
        addView(detailTextLabel, params);
    }

    public void setTextLabel(TextView textLabel) {
        this.textLabel = textLabel;
    }

    public void setDetailTextLabel(TextView detailTextLabel) {
        this.detailTextLabel = detailTextLabel;
    }

    public void setTextLabel(CharSequence text) {
        textLabel.setText(text);
    }

    public String getTextLabel() {
        return textLabel.getText().toString();
    }

    public void setDetailTextLabel(CharSequence text) {
        detailTextLabel.setText(text);
    }

    public String getDetailTextLabel() {
        return detailTextLabel.getText().toString();
    }

    public void setTintColor(int textColor) {
        this.setTintColor(textColor);
    }

    public int getTextColor() {
        return 0;
    }
}
