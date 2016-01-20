package com.myappconverter.uikit.myappclasses;

import android.widget.TextView;


public class MyAppParagraphStyle {
    TextView element;

    public MyAppParagraphStyle(TextView element) {
        this.element = element;
    }

    public TextView getElement() {
        return element;
    }

    public void setElement(TextView element) {
        this.element = element;
    }
}
