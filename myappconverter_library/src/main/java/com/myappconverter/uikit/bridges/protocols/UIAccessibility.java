package com.myappconverter.uikit.bridges.protocols;

import com.myappconverter.java.coregraphics.CGPoint;
import com.myappconverter.java.coregraphics.CGRect;
import com.myappconverter.java.foundations.NSString;

import com.myappconverter.uikit.myappclasses.MyAppAccessebilityElement;
import com.myappconverter.uikit.myappclasses.MyAppBezierPath;
import com.myappconverter.uikit.util.UIKitEnums.UIAccessibilityNavigationStyle;
import com.myappconverter.uikit.util.UIKitEnums.UIAccessibilityTraits;


public interface UIAccessibility {
    public boolean getIsAccessibilityElement(
        MyAppAccessebilityElement myAppAccessebilityElement);

    public void setIsAccessibilityElement(
        MyAppAccessebilityElement myAppAccessebilityElement,
        boolean isAccessibilityElement);

    public CGPoint getAccessibilityActivationPoint(
        MyAppAccessebilityElement myAppAccessebilityElement);

    public void setAccessibilityActivationPoint(
        MyAppAccessebilityElement myAppAccessebilityElement, CGPoint cgPoint);

    public boolean getAccessibilityElementsHidden(
        MyAppAccessebilityElement myAppAccessebilityElement);

    public void setAccessibilityElementsHidden(
        MyAppAccessebilityElement myAppAccessebilityElement,
        boolean accessibilityElementsHidden);

    public CGRect getAccessibilityFrame(
        MyAppAccessebilityElement myAppAccessebilityElement);

    public void setAccessibilityFrame(
        MyAppAccessebilityElement myAppAccessebilityElement,
        CGRect accessibilityFrame);

    public NSString getAccessibilityHint(
        MyAppAccessebilityElement myAppAccessebilityElement);

    public void setAccessibilityHint(
        MyAppAccessebilityElement myAppAccessebilityElement,
        NSString accessibilityHint);

    public NSString getAccessibilityLabel(
        MyAppAccessebilityElement myAppAccessebilityElement);

    public void setAccessibilityLabel(
        MyAppAccessebilityElement myAppAccessebilityElement,
        NSString accessibilityLabel);

    public NSString getAccessibilityLanguage(
        MyAppAccessebilityElement myAppAccessebilityElement);

    public void setAccessibilityLanguage(
        MyAppAccessebilityElement myAppAccessebilityElement,
        NSString accessibilityLanguage);

    public MyAppBezierPath getAccessibilityPath(
        MyAppAccessebilityElement myAppAccessebilityElement);

    public void setAccessibilityPath(
        MyAppAccessebilityElement myAppAccessebilityElement,
        MyAppBezierPath accessibilityPath);

    public MyAppBezierPath getAccessibilityTraits(
        MyAppAccessebilityElement myAppAccessebilityElement);

    public void setAccessibilityTraits(
        MyAppAccessebilityElement myAppAccessebilityElement,
        UIAccessibilityTraits accessibilityTraits);

    public NSString getAccessibilityValue(
        MyAppAccessebilityElement myAppAccessebilityElement);

    public void setAccessibilityValue(
        MyAppAccessebilityElement myAppAccessebilityElement,
        NSString accessibilityValue);

    public boolean getAccessibilityViewIsModal(
        MyAppAccessebilityElement myAppAccessebilityElement);

    public void setAccessibilityViewIsModal(
        MyAppAccessebilityElement myAppAccessebilityElement,
        boolean accessibilityViewIsModal);

    public boolean getShouldGroupAccessibilityChildren(
        MyAppAccessebilityElement myAppAccessebilityElement);

    public void setShouldGroupAccessibilityChildren(
        MyAppAccessebilityElement myAppAccessebilityElement,
        boolean shouldGroupAccessibilityChildren);

    public UIAccessibilityNavigationStyle getAccessibilityNavigationStyle(
        MyAppAccessebilityElement myAppAccessebilityElement);

    public void setAccessibilityNavigationStyle(
        MyAppAccessebilityElement myAppAccessebilityElement,
        UIAccessibilityNavigationStyle accessibilityNavigationStyle);
}
