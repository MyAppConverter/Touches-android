package com.myappconverter.uikit.bridges.protocols;

import android.widget.GridView;

import com.myappconverter.java.foundations.NSIndexPath;
import com.myappconverter.java.foundations.NSString;
import com.myappconverter.java.foundations.SEL;

import com.myappconverter.uikit.myappclasses.MyAppCollectionReusableView;
import com.myappconverter.uikit.myappclasses.MyAppCollectionViewCell;
import com.myappconverter.uikit.myappclasses.MyAppCollectionViewLayout;


public interface UICollectionViewDelegate {
    public boolean collectionViewShouldSelectItemAtIndexPath(
        GridView collectionView, NSIndexPath indexPath);

    public boolean collectionViewDidSelectItemAtIndexPath(
        GridView collectionView, NSIndexPath indexPath);

    public boolean collectionViewShouldDeselectItemAtIndexPath(
        GridView collectionView, NSIndexPath indexPath);

    public boolean collectionViewDidDeselectItemAtIndexPath(
        GridView collectionView, NSIndexPath indexPath);

    public boolean collectionViewShouldHighlightItemAtIndexPath(
        GridView collectionView, NSIndexPath indexPath);

    public boolean collectionViewDidHighlightItemAtIndexPath(
        GridView collectionView, NSIndexPath indexPath);

    public boolean collectionViewDidUnhighlightItemAtIndexPath(
        GridView collectionView, NSIndexPath indexPath);

    public boolean collectionViewWillDisplayCellForItemAtIndexPath(
        GridView collectionView, MyAppCollectionViewCell cell,
        NSIndexPath indexPath);

    public boolean collectionViewWillDisplaySupplementaryViewForElementKindAtIndexPath(
        GridView collectionView, MyAppCollectionReusableView view,
        NSString elementKind, NSIndexPath indexPath);

    public boolean collectionViewDidEndDisplayingCellForItemAtIndexPath(
        GridView collectionView, MyAppCollectionViewCell cell,
        NSIndexPath indexPath);

    public boolean collectionViewDidEndDisplayingSupplementaryViewForElementOfKindAtIndexPath(
        GridView collectionView, MyAppCollectionReusableView view,
        NSString elementKind, NSIndexPath indexPath);

    public boolean collectionViewTransitionLayoutForOldLayoutNewLayout(
        GridView collectionView, MyAppCollectionViewLayout fromLayout,
        MyAppCollectionViewLayout toLayout, NSIndexPath indexPath);

    public boolean collectionViewShouldShowMenuForItemAtIndexPath(
        GridView collectionView, NSIndexPath indexPath);

    public boolean collectionViewCanPerformActionForItemAtIndexPathWithSender(
        GridView collectionView, SEL action, NSIndexPath indexPath,
        Object sender);

    public boolean collectionViewPerformActionForItemAtIndexPathWithSender(
        GridView collectionView, SEL action, NSIndexPath indexPath,
        Object sender);
}
