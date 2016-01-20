package com.myappconverter.uikit.myappclasses;

import com.myappconverter.java.foundations.NSString;
import com.myappconverter.java.foundations.NSURL;


public class MyAppDocumentInteractionController {
    private NSURL URL;
    private NSString name;

    public NSURL getURL() {
        return URL;
    }

    public void setURL(NSURL uRL) {
        URL = uRL;
    }

    public NSString getName() {
        return name;
    }

    public void setName(NSString name) {
        this.name = name;
    }
}
