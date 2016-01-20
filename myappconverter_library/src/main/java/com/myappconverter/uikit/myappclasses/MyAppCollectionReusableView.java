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


public class MyAppCollectionReusableView extends RelativeLayout {
    private NSString reuseIdentifier;
    private TextView textLabel;
    private TextView detailTextLabel;
    private ImageView imageView;
    private View view;

    public MyAppCollectionReusableView(Context context) {
        super(context);
    }

    public MyAppCollectionReusableView() {
        super(GenericMainContext.sharedContext);
    }

    public MyAppCollectionReusableView initWithStyleReuseIdentifier(
        UITableViewCellStyle style, NSString reuseIdentifier) {
        this.reuseIdentifier = reuseIdentifier;

        LayoutInflater inflater = LayoutInflater.from(GenericMainContext.sharedContext);

        switch (style) {
        case UITableViewCellStyleDefault:
            view = inflater.inflate(AndroidRessourcesUtils.getResID(
                        "tableview_cell_style_default", "layout"), null, false);

            break;

        case UITableViewCellStyleSubtitle:
            view = inflater.inflate(AndroidRessourcesUtils.getResID(
                        "tableview_cell_style_subtitle", "layout"), null, false);

            break;

        case UITableViewCellStyleValue1:
            view = inflater.inflate(AndroidRessourcesUtils.getResID(
                        "tableview_cell_style_value1", "layout"), null, false);

            break;

        case UITableViewCellStyleValue2:
            view = inflater.inflate(AndroidRessourcesUtils.getResID(
                        "tableview_cell_style_value2", "layout"), null, false);

            break;

        default:
            view = inflater.inflate(AndroidRessourcesUtils.getResID(
                        "tableview_cell_style_default", "layout"), null, false);

            break;
        }

        return (this);
    }

    public void setSelectedAnimated(boolean selected, boolean animated) {
        this.setSelected(selected);
    }

    public void loadView() {
        if (view != null) {
            if (AndroidRessourcesUtils.getResID("title_txt", "id") > 0) {
                textLabel = (TextView) view.findViewById(AndroidRessourcesUtils.getResID(
                            "title_txt", "id"));
            }

            if (AndroidRessourcesUtils.getResID("subtitle_txt", "id") > 0) {
                detailTextLabel = (TextView) view.findViewById(AndroidRessourcesUtils.getResID(
                            "subtitle_txt", "id"));
            }

            imageView = (ImageView) view.findViewById(AndroidRessourcesUtils.getResID(
                        "cell_image", "id"));
        }
    }

    public NSString getReuseIdentifier() {
        return reuseIdentifier;
    }

    public void setReuseIdentifier(NSString reuseIdentifier) {
        this.reuseIdentifier = reuseIdentifier;
    }

    public TextView getTextLabel() {
        return textLabel;
    }

    public void setTextLabel(TextView textLabel) {
        this.textLabel = textLabel;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public TextView getDetailTextLabel() {
        return detailTextLabel;
    }

    public void setDetailTextLabel(TextView detailTextLabel) {
        this.detailTextLabel = detailTextLabel;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public Object init() {
        return this;
    }
}
