package com.myappconverter.uikit.myappclasses;

public class MyAppCollectionViewFlowLayoutInvalidationContext {
    boolean invalidateFlowLayoutDelegateMetrics;
    boolean invalidateFlowLayoutAttributes;

    public boolean getInvalidateFlowLayoutDelegateMetrics() {
        return invalidateFlowLayoutDelegateMetrics;
    }

    public void setInvalidateFlowLayoutDelegateMetrics(
        boolean invalidateFlowLayoutDelegateMetrics) {
        this.invalidateFlowLayoutDelegateMetrics = invalidateFlowLayoutDelegateMetrics;
    }

    public boolean getInvalidateFlowLayoutAttributes() {
        return invalidateFlowLayoutAttributes;
    }

    public void setInvalidateFlowLayoutAttributes(
        boolean invalidateFlowLayoutAttributes) {
        this.invalidateFlowLayoutAttributes = invalidateFlowLayoutAttributes;
    }
}
