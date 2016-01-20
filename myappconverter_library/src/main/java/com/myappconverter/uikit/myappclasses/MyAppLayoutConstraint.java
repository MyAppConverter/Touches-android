package com.myappconverter.uikit.myappclasses;

import com.myappconverter.java.uikit.NSLayoutConstraint.NSLayoutRelation;

import com.myappconverter.uikit.util.UIKitEnums.NSLayoutAttribute;
import com.myappconverter.uikit.util.UIKitEnums.UILayoutPriority;


public class MyAppLayoutConstraint {
    private Object firstItem;
    private NSLayoutAttribute firstAttribute;
    private NSLayoutRelation relation;
    private Object secondItem;
    private NSLayoutAttribute secondAttribute;
    private float multiplier;
    private float constant;
    private boolean active = true;
    private UILayoutPriority priority;

    public UILayoutPriority getPriority() {
        return priority;
    }

    public void setPriority(UILayoutPriority priority) {
        this.priority = priority;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Object getFirstItem() {
        return firstItem;
    }

    public void setFirstItem(Object firstItem) {
        this.firstItem = firstItem;
    }

    public NSLayoutAttribute getFirstAttribute() {
        return firstAttribute;
    }

    public void setFirstAttribute(NSLayoutAttribute firstAttribute) {
        this.firstAttribute = firstAttribute;
    }

    public NSLayoutRelation getRelation() {
        return relation;
    }

    public void setRelation(NSLayoutRelation relation) {
        this.relation = relation;
    }

    public Object getSecondItem() {
        return secondItem;
    }

    public void setSecondItem(Object secondItem) {
        this.secondItem = secondItem;
    }

    public NSLayoutAttribute getSecondAttribute() {
        return secondAttribute;
    }

    public void setSecondAttribute(NSLayoutAttribute secondAttribute) {
        this.secondAttribute = secondAttribute;
    }

    public float getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(float multiplier) {
        this.multiplier = multiplier;
    }

    public float getConstant() {
        return constant;
    }

    public void setConstant(float constant) {
        this.constant = constant;
    }
}
