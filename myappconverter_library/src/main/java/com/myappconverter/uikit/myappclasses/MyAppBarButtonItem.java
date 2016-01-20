package com.myappconverter.uikit.myappclasses;

import android.content.Context;

import android.view.MenuItem;
import android.view.View;

import com.myappconverter.java.foundations.NSSet;
import com.myappconverter.java.foundations.NSString;
import com.myappconverter.java.foundations.SEL;

import com.myappconverter.mapping.utils.AndroidRessourcesUtils;
import com.myappconverter.mapping.utils.GenericMainContext;

import com.myappconverter.uikit.util.UIKitEnums;


public class MyAppBarButtonItem extends MyAppBarItem {
    private MenuItem menuItem;
    private SEL actionTarget;
    private Object targetAction;
    public NSSet<NSString> possibleTitles = new NSSet<NSString>();
    private Integer tintColor;
    private UIKitEnums.UIBarButtonItemStyle style;
    float width;
    View customView;

    public MyAppBarButtonItem(Context context) {
    }

    public MyAppBarButtonItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    public NSSet<NSString> getPossibleTitles() {
        return possibleTitles;
    }

    public void setPossibleTitles(NSSet<NSString> possibleTitles) {
        this.possibleTitles = possibleTitles;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    public SEL getActionTarget() {
        return actionTarget;
    }

    public void setActionTarget(SEL actionTarget) {
        this.actionTarget = actionTarget;
    }

    public Object getTargetAction() {
        return targetAction;
    }

    public void setTargetAction(Object targetAction) {
        this.targetAction = targetAction;
    }

    public UIKitEnums.UIBarButtonItemStyle getStyle() {
        return style;
    }

    public Integer getTintColor() {
        return tintColor;
    }

    public void setTintColor(Integer tintColor) {
        this.tintColor = tintColor;
    }

    public View getCustomView() {
        return customView;
    }

    public void setCustomView(View customView) {
        this.customView = customView;
    }

    public void setStyle(UIKitEnums.UIBarButtonItemStyle style) {
        this.style = style;
    }

    public float getWidth() {
        return this.width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void resolveStystemItem(
        UIKitEnums.UIBarButtonSystemItem uiBarButtonSystemItem) {
        switch (uiBarButtonSystemItem) {
        case UIBarButtonSystemItemSearch:
            setImage(GenericMainContext.sharedContext.getResources()
                                                     .getDrawable(AndroidRessourcesUtils.getResID(
                        "ic_search_white_18dp", "drawable")));

            break;

        case UIBarButtonSystemItemCancel:
            setImage(GenericMainContext.sharedContext.getResources()
                                                     .getDrawable(AndroidRessourcesUtils.getResID(
                        "ic_clear_white_18dp", "drawable")));

            break;

        case UIBarButtonSystemItemPlay:
            setImage(GenericMainContext.sharedContext.getResources()
                                                     .getDrawable(AndroidRessourcesUtils.getResID(
                        "ic_play_arrow_white_18dp", "drawable")));

            break;

        case UIBarButtonSystemItemEdit:
            setImage(GenericMainContext.sharedContext.getResources()
                                                     .getDrawable(AndroidRessourcesUtils.getResID(
                        "ic_edit_white_18dp", "drawable")));

            break;

        case UIBarButtonSystemItemSave:
            setImage(GenericMainContext.sharedContext.getResources()
                                                     .getDrawable(AndroidRessourcesUtils.getResID(
                        "ic_save_white_18dp", "drawable")));

            break;

        case UIBarButtonSystemItemAdd:
            setImage(GenericMainContext.sharedContext.getResources()
                                                     .getDrawable(AndroidRessourcesUtils.getResID(
                        "ic_add_white_18dp", "drawable")));

            break;

        case UIBarButtonSystemItemFlexibleSpace:

            //setImage(GenericMainContext.sharedContext.getResources().getDrawable(AndroidRessourcesUtils.getResID("compose", "drawable")));
            break;

        case UIBarButtonSystemItemFixedSpace:

            //setImage(GenericMainContext.sharedContext.getResources().getDrawable(AndroidRessourcesUtils.getResID("abc_ic_clear_mtrl_alpha", "drawable")));
            break;

        case UIBarButtonSystemItemCompose:
            setImage(GenericMainContext.sharedContext.getResources()
                                                     .getDrawable(AndroidRessourcesUtils.getResID(
                        "ic_message_white_18dp", "drawable")));

            break;

        case UIBarButtonSystemItemReply:
            setImage(GenericMainContext.sharedContext.getResources()
                                                     .getDrawable(AndroidRessourcesUtils.getResID(
                        "ic_reply_white_18dp", "drawable")));

            break;

        case UIBarButtonSystemItemAction:
            setImage(GenericMainContext.sharedContext.getResources()
                                                     .getDrawable(AndroidRessourcesUtils.getResID(
                        "ic_input_white_18dp", "drawable")));

            break;

        case UIBarButtonSystemItemOrganize:
            setImage(GenericMainContext.sharedContext.getResources()
                                                     .getDrawable(AndroidRessourcesUtils.getResID(
                        "ic_inbox_white_18dp", "drawable")));

            break;

        case UIBarButtonSystemItemBookmarks:
            setImage(GenericMainContext.sharedContext.getResources()
                                                     .getDrawable(AndroidRessourcesUtils.getResID(
                        "ic_book_white_18dp", "drawable")));

            break;

        case UIBarButtonSystemItemTrash:
            setImage(GenericMainContext.sharedContext.getResources()
                                                     .getDrawable(AndroidRessourcesUtils.getResID(
                        "ic_action_trash", "drawable")));

            break;

        case UIBarButtonSystemItemRefresh:
            setImage(GenericMainContext.sharedContext.getResources()
                                                     .getDrawable(AndroidRessourcesUtils.getResID(
                        "ic_refresh_white_18dp", "drawable")));

            break;

        case UIBarButtonSystemItemStop:
            setImage(GenericMainContext.sharedContext.getResources()
                                                     .getDrawable(AndroidRessourcesUtils.getResID(
                        "ic_stop_white_18dp", "drawable")));

            break;

        case UIBarButtonSystemItemCamera:
            setImage(GenericMainContext.sharedContext.getResources()
                                                     .getDrawable(AndroidRessourcesUtils.getResID(
                        "ic_camera_enhance_white_18dp", "drawable")));

            break;

        case UIBarButtonSystemItemFastForward:
            setImage(GenericMainContext.sharedContext.getResources()
                                                     .getDrawable(AndroidRessourcesUtils.getResID(
                        "ic_skip_next_white_18dp", "drawable")));

            break;

        case UIBarButtonSystemItemPause:
            setImage(GenericMainContext.sharedContext.getResources()
                                                     .getDrawable(AndroidRessourcesUtils.getResID(
                        "ic_pause_white_18dp", "drawable")));

            break;

        case UIBarButtonSystemItemRewind:
            setImage(GenericMainContext.sharedContext.getResources()
                                                     .getDrawable(AndroidRessourcesUtils.getResID(
                        "ic_skip_previous_white_18dp", "drawable")));

            break;

        case UIBarButtonSystemItemUndo:
            setImage(GenericMainContext.sharedContext.getResources()
                                                     .getDrawable(AndroidRessourcesUtils.getResID(
                        "ic_undo_white_18dp", "drawable")));

            break;

        case UIBarButtonSystemItemRedo:
            setImage(GenericMainContext.sharedContext.getResources()
                                                     .getDrawable(AndroidRessourcesUtils.getResID(
                        "ic_redo_white_18dp", "drawable")));

            break;

        case UIBarButtonSystemItemPageCurl:
            setImage(GenericMainContext.sharedContext.getResources()
                                                     .getDrawable(AndroidRessourcesUtils.getResID(
                        "curl", "drawable")));

            break;

        default:
            break;
        }
    }
}
