package com.myappconverter.uikit.myappclasses;

import com.myappconverter.java.coregraphics.CGSize;

import com.myappconverter.uikit.util.UIKitEnums.UICollectionViewScrollDirection;


public class MyAppCollectionViewFlowLayout {
    UICollectionViewScrollDirection scrollDirection;
    float minimumLineSpacing;
    float minimumInteritemSpacing;
    CGSize itemSize;
    CGSize estimatedItemSize;
    MyAppEdgeInsets sectionInset;
    CGSize headerReferenceSize;
    CGSize footerReferenceSize;

    public UICollectionViewScrollDirection getScrollDirection() {
        return scrollDirection;
    }

    public void setScrollDirection(
        UICollectionViewScrollDirection scrollDirection) {
        this.scrollDirection = scrollDirection;
    }

    public float getMinimumLineSpacing() {
        return minimumLineSpacing;
    }

    public void setMinimumLineSpacing(float minimumLineSpacing) {
        this.minimumLineSpacing = minimumLineSpacing;
    }

    public float getMinimumInteritemSpacing() {
        return minimumInteritemSpacing;
    }

    public void setMinimumInteritemSpacing(float minimumInteritemSpacing) {
        this.minimumInteritemSpacing = minimumInteritemSpacing;
    }

    public CGSize getItemSize() {
        return itemSize;
    }

    public void setItemSize(CGSize itemSize) {
        this.itemSize = itemSize;
    }

    public CGSize getEstimatedItemSize() {
        return estimatedItemSize;
    }

    public void setEstimatedItemSize(CGSize estimatedItemSize) {
        this.estimatedItemSize = estimatedItemSize;
    }

    public MyAppEdgeInsets getSectionInset() {
        return sectionInset;
    }

    public void setSectionInset(MyAppEdgeInsets sectionInset) {
        this.sectionInset = sectionInset;
    }

    public CGSize getHeaderReferenceSize() {
        return headerReferenceSize;
    }

    public void setHeaderReferenceSize(CGSize headerReferenceSize) {
        this.headerReferenceSize = headerReferenceSize;
    }

    public CGSize getFooterReferenceSize() {
        return footerReferenceSize;
    }

    public void setFooterReferenceSize(CGSize footerReferenceSize) {
        this.footerReferenceSize = footerReferenceSize;
    }
}
