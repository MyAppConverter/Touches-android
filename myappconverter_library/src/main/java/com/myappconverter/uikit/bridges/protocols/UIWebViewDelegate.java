package com.myappconverter.uikit.bridges.protocols;

import android.webkit.WebView;

import com.myappconverter.java.foundations.NSError;
import com.myappconverter.java.foundations.NSURLRequest;


public interface UIWebViewDelegate {
    public boolean webViewShouldStartLoadWithRequestNavigationType(
        WebView webView, NSURLRequest request, int navigationType);

    public void webViewDidStartLoad(WebView webView);

    public void webViewDidFinishLoad(WebView webView);

    public void webViewDidFailLoadWithError(WebView webView, NSError error);
}
