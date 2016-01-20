package com.myappconverter.uikit.myappclasses;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;

import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.myappconverter.java.foundations.NSString;

import com.myappconverter.mapping.utils.AndroidRessourcesUtils;
import com.myappconverter.mapping.utils.GenericMainContext;

import com.myappconverter.uikit.util.UIKitEnums.UITableViewCellStyle;


public class MyAppCollectionViewCell extends RelativeLayout {
    private NSString reuseIdentifier;
    private View view;

    public MyAppCollectionViewCell(Context context) {
        super(context);
    }

    public MyAppCollectionViewCell() {
        super(GenericMainContext.sharedContext);
    }

    public void setSelectedAnimated(boolean selected, boolean animated) {
        this.setSelected(selected);
    }

    public NSString getReuseIdentifier() {
        return reuseIdentifier;
    }

    public void setReuseIdentifier(NSString reuseIdentifier) {
        this.reuseIdentifier = reuseIdentifier;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public void init() {
        this.view = new View(GenericMainContext.sharedContext);
    }
}
