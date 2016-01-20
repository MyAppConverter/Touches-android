package com.myappconverter.uikit.myappclasses;

import com.myappconverter.java.coregraphics.CGPoint;
import com.myappconverter.java.coregraphics.CGRect;
import com.myappconverter.java.coregraphics.CGSize;
import com.myappconverter.java.foundations.NSIndexPath;
import com.myappconverter.java.foundations.NSString;
import com.myappconverter.java.quartzcore.CATransform3D;

import com.myappconverter.uikit.util.UIKitEnums.UICollectionElementCategory;


public class MyAppCollectionViewLayoutAttributes {
    private NSIndexPath indexPath;
    private UICollectionElementCategory representedElementCategory;
    private NSString representedElementKind;
    private CGRect frame;
    private CGRect bounds;
    private CGPoint center;
    private CGSize size;
    private CATransform3D transform3D;
    private Float alpha;
    private Integer zIndex;
    private boolean hidden;

    public static MyAppCollectionViewLayoutAttributes layoutAttributesForCellWithIndexPath(
        NSIndexPath indexPath) {
        return new MyAppCollectionViewLayoutAttributes();
    }

    public NSIndexPath getIndexPath() {
        return indexPath;
    }

    public void setIndexPath(NSIndexPath indexPath) {
        this.indexPath = indexPath;
    }

    public UICollectionElementCategory getRepresentedElementCategory() {
        return representedElementCategory;
    }

    public void setRepresentedElementCategory(
        UICollectionElementCategory representedElementCategory) {
        this.representedElementCategory = representedElementCategory;
    }

    public NSString getRepresentedElementKind() {
        return representedElementKind;
    }

    public void setRepresentedElementKind(NSString representedElementKind) {
        this.representedElementKind = representedElementKind;
    }

    public CGRect getFrame() {
        return frame;
    }

    public void setFrame(CGRect frame) {
        this.frame = frame;
    }

    public CGRect getBounds() {
        return bounds;
    }

    public void setBounds(CGRect bounds) {
        this.bounds = bounds;
    }

    public CGPoint getCenter() {
        return center;
    }

    public void setCenter(CGPoint center) {
        this.center = center;
    }

    public CGSize getSize() {
        return size;
    }

    public void setSize(CGSize size) {
        this.size = size;
    }

    public CATransform3D getTransform3D() {
        return transform3D;
    }

    public void setTransform3D(CATransform3D transform3d) {
        transform3D = transform3d;
    }

    public Float getAlpha() {
        return alpha;
    }

    public void setAlpha(Float alpha) {
        this.alpha = alpha;
    }

    public Integer getzIndex() {
        return zIndex;
    }

    public void setzIndex(Integer zIndex) {
        this.zIndex = zIndex;
    }

    public boolean getHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }
}
