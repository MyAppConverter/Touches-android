package com.myappconverter.uikit.myappclasses;

import android.widget.GridView;

import com.myappconverter.java.coregraphics.CGPoint;
import com.myappconverter.java.coregraphics.CGRect;
import com.myappconverter.java.coregraphics.CGSize;
import com.myappconverter.java.foundations.NSArray;
import com.myappconverter.java.foundations.NSIndexPath;
import com.myappconverter.java.foundations.NSString;


public abstract class MyAppCollectionViewLayout {
    public GridView collectionView;

    public static Class layoutAttributesClass() {
        return null;
    }

    public abstract GridView collectionView();

    public abstract GridView getCollectionView();

    public abstract void setCollectionView(GridView collectionView);

    public abstract CGSize collectionViewContentSize();

    public abstract void finalizeAnimatedBoundsChange();

    public abstract void finalizeCollectionViewUpdates();

    public abstract MyAppCollectionViewLayoutAttributes finalLayoutAttributesForDisappearingDecorationElementOfKindAtIndexPath(
        NSString elementKind, NSIndexPath elementIndexPath);

    public abstract MyAppCollectionViewLayoutAttributes finalLayoutAttributesForDisappearingItemAtIndexPath();

    public abstract MyAppCollectionViewLayoutAttributes finalLayoutAttributesForDisappearingSupplementaryElementOfKindAtIndexPath(
        NSString elementKind, NSIndexPath elementIndexPath);

    public abstract MyAppCollectionViewLayoutAttributes initialLayoutAttributesForAppearingDecorationElementOfKindAtIndexPath(
        NSString elementKind, NSIndexPath elementIndexPath);

    public abstract MyAppCollectionViewLayoutAttributes initialLayoutAttributesForAppearingItemAtIndexPath(
        NSIndexPath itemIndexPath);

    public abstract MyAppCollectionViewLayoutAttributes initialLayoutAttributesForAppearingSupplementaryElementOfKindAtIndexPath(
        NSString elementKind, NSIndexPath elementIndexPath);

    public abstract void invalidateLayout();

    public abstract MyAppCollectionViewLayoutAttributes layoutAttributesForDecorationViewOfKindAtIndexPath(
        NSString decorationViewKind, NSIndexPath indexPath);

    public abstract NSArray layoutAttributesForElementsInRect(CGRect rect);

    public abstract MyAppCollectionViewLayoutAttributes layoutAttributesForItemAtIndexPath(
        NSIndexPath indexPath);

    public abstract MyAppCollectionViewLayoutAttributes layoutAttributesForSupplementaryViewOfKindAtIndexPath(
        NSString kind, NSIndexPath indexPath);

    public abstract void prepareForAnimatedBoundsChange(CGRect oldBounds);

    public abstract void prepareForCollectionViewUpdates(NSArray updateItems);

    public abstract void prepareLayout();

    public abstract void registerClassForDecorationViewOfKind(Class viewClass,
        NSString decorationViewKind);

    public abstract void registerNibForDecorationViewOfKind(MyAppNib nib,
        NSString decorationViewKind);

    public abstract boolean shouldInvalidateLayoutForBoundsChange(
        CGRect newBounds);

    public abstract CGPoint targetContentOffsetForProposedContentOffsetWithScrollingVelocity(
        CGPoint proposedContentOffset, CGPoint velocity);
}
