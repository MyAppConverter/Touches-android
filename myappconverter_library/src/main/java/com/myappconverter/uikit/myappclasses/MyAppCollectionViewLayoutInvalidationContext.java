package com.myappconverter.uikit.myappclasses;

import com.myappconverter.java.coregraphics.CGPoint;
import com.myappconverter.java.coregraphics.CGSize;
import com.myappconverter.java.foundations.NSArray;
import com.myappconverter.java.foundations.NSDictionary;


public class MyAppCollectionViewLayoutInvalidationContext {
    boolean invalidateEverything;
    boolean invalidateDataSourceCounts;
    CGPoint contentOffsetAdjustment;
    CGSize contentSizeAdjustment;
    NSArray invalidatedItemIndexPaths;
    NSDictionary invalidatedSupplementaryIndexPaths;
    NSDictionary invalidatedDecorationIndexPaths;

    public boolean getInvalidateEverything() {
        return invalidateEverything;
    }

    public void setInvalidateEverything(boolean invalidateEverything) {
        this.invalidateEverything = invalidateEverything;
    }

    public boolean getInvalidateDataSourceCounts() {
        return invalidateDataSourceCounts;
    }

    public void setInvalidateDataSourceCounts(
        boolean invalidateDataSourceCounts) {
        this.invalidateDataSourceCounts = invalidateDataSourceCounts;
    }

    public CGPoint getContentOffsetAdjustment() {
        return contentOffsetAdjustment;
    }

    public void setContentOffsetAdjustment(CGPoint contentOffsetAdjustment) {
        this.contentOffsetAdjustment = contentOffsetAdjustment;
    }

    public CGSize getContentSizeAdjustment() {
        return contentSizeAdjustment;
    }

    public void setContentSizeAdjustment(CGSize contentSizeAdjustment) {
        this.contentSizeAdjustment = contentSizeAdjustment;
    }

    public NSArray getInvalidatedItemIndexPaths() {
        return invalidatedItemIndexPaths;
    }

    public void setInvalidatedItemIndexPaths(NSArray invalidatedItemIndexPaths) {
        this.invalidatedItemIndexPaths = invalidatedItemIndexPaths;
    }

    public NSDictionary getInvalidatedSupplementaryIndexPaths() {
        return invalidatedSupplementaryIndexPaths;
    }

    public void setInvalidatedSupplementaryIndexPaths(
        NSDictionary invalidatedSupplementaryIndexPaths) {
        this.invalidatedSupplementaryIndexPaths = invalidatedSupplementaryIndexPaths;
    }

    public NSDictionary getInvalidatedDecorationIndexPaths() {
        return invalidatedDecorationIndexPaths;
    }

    public void setInvalidatedDecorationIndexPaths(
        NSDictionary invalidatedDecorationIndexPaths) {
        this.invalidatedDecorationIndexPaths = invalidatedDecorationIndexPaths;
    }
}
