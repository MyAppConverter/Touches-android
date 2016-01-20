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


public class MyAppTableViewCell extends RelativeLayout {
    private NSString mreuseIdentifier;
    private TextView mtextLabel;
    private TextView mdetailTextLabel;
    private ImageView mimageView;
    private View mview;

    public MyAppTableViewCell(Context context) {
        super(context);
    }

    public MyAppTableViewCell() {
        super(GenericMainContext.sharedContext);
    }

    public MyAppTableViewCell initWithStyleReuseIdentifier(
        UITableViewCellStyle style, NSString reuseIdentifier) {
        this.mreuseIdentifier = reuseIdentifier;

        LayoutInflater inflater = LayoutInflater.from(GenericMainContext.sharedContext);

        switch (style) {
        case UITableViewCellStyleDefault:
            mview = inflater.inflate(AndroidRessourcesUtils.getResID(
                        "tableview_cell_style_default", "layout"), null, false);

            break;

        case UITableViewCellStyleSubtitle:
            mview = inflater.inflate(AndroidRessourcesUtils.getResID(
                        "tableview_cell_style_subtitle", "layout"), null, false);

            break;

        case UITableViewCellStyleValue1:
            mview = inflater.inflate(AndroidRessourcesUtils.getResID(
                        "tableview_cell_style_value1", "layout"), null, false);

            break;

        case UITableViewCellStyleValue2:
            mview = inflater.inflate(AndroidRessourcesUtils.getResID(
                        "tableview_cell_style_value2", "layout"), null, false);

            break;

        default:
            mview = inflater.inflate(AndroidRessourcesUtils.getResID(
                        "tableview_cell_style_default", "layout"), null, false);

            break;
        }

        loadView();

        return (this);
    }

    public void setSelectedAnimated(boolean selected, boolean animated) {
        this.setSelected(selected);
    }

    public void loadView() {
        if (mview == null) {
            LayoutInflater inflater = LayoutInflater.from(GenericMainContext.sharedContext);
            mview = inflater.inflate(AndroidRessourcesUtils.getResID(
                        "tableview_cell_style_default", "layout"), null, false);

            if (AndroidRessourcesUtils.getResID("title_txt", "id") > 0) {
                mtextLabel = (TextView) mview.findViewById(AndroidRessourcesUtils.getResID(
                            "title_txt", "id"));
            }

            if (AndroidRessourcesUtils.getResID("subtitle_txt", "id") > 0) {
                mdetailTextLabel = (TextView) mview.findViewById(AndroidRessourcesUtils.getResID(
                            "subtitle_txt", "id"));
            }

            mimageView = (ImageView) mview.findViewById(AndroidRessourcesUtils.getResID(
                        "cell_image", "id"));
        } else {
            if (AndroidRessourcesUtils.getResID("title_txt", "id") > 0) {
                mtextLabel = (TextView) mview.findViewById(AndroidRessourcesUtils.getResID(
                            "title_txt", "id"));
            }

            if (AndroidRessourcesUtils.getResID("subtitle_txt", "id") > 0) {
                mdetailTextLabel = (TextView) mview.findViewById(AndroidRessourcesUtils.getResID(
                            "subtitle_txt", "id"));
            }

            mimageView = (ImageView) mview.findViewById(AndroidRessourcesUtils.getResID(
                        "cell_image", "id"));
        }
    }

    public NSString getReuseIdentifier() {
        return mreuseIdentifier;
    }

    public void setReuseIdentifier(NSString reuseIdentifier) {
        this.mreuseIdentifier = reuseIdentifier;
    }

    public TextView getTextLabel() {
        return mtextLabel;
    }

    public void setTextLabel(TextView textLabel) {
        this.mtextLabel = textLabel;
    }

    public View getView() {
        return mview;
    }

    public void setView(View view) {
        this.mview = view;
    }

    public TextView getDetailTextLabel() {
        return mdetailTextLabel;
    }

    public void setDetailTextLabel(TextView detailTextLabel) {
        this.mdetailTextLabel = detailTextLabel;
    }

    public ImageView getImageView() {
        return mimageView;
    }

    public void setImageView(ImageView imageView) {
        this.mimageView = imageView;
    }

    public Object init() {
        return this;
    }
}
