package com.myappconverter.uikit.bridges.protocols;

import android.widget.GridView;

import com.myappconverter.java.foundations.NSIndexPath;
import com.myappconverter.java.foundations.NSString;

import com.myappconverter.uikit.myappclasses.MyAppCollectionViewCell;


public interface UICollectionViewDataSource {
    public int collectionViewNumberOfItemsInSection(GridView collectionView,
        int section);

    public int numberOfSectionsInCollectionView(GridView collectionView);

    public MyAppCollectionViewCell collectionViewCellForItemAtIndexPath(
        GridView collectionView, NSIndexPath indexPath);

    public int collectionViewViewForSupplementaryElementOfKindAtIndexPath(
        GridView collectionView, NSString kind, int indexPath);
}
