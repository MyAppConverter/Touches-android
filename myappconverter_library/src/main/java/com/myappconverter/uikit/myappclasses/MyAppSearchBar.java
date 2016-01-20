package com.myappconverter.uikit.myappclasses;

import android.graphics.drawable.Drawable;

import android.widget.RelativeLayout;

import com.myappconverter.java.foundations.NSArray;
import com.myappconverter.java.foundations.NSString;

import com.myappconverter.uikit.util.UIKitEnums.UIBarStyle;


public class MyAppSearchBar {
    /**
     * A single line of text displayed at the top of the search bar.
     */
    private NSString mprompt;

    /**
     * A bar style that specifies the search bar’s appearance.
     */
    private UIBarStyle mbarStyle;

    /**
     *
     */

    //private UISearchBarStyle searchBarStyle;

    /**
     * A Boolean value that indicates whether the search bar is translucent (YES) or not (NO).
     */
    private boolean mtranslucent;

    /**
     * A Boolean value indicating whether the bookmark button is displayed.
     */
    private boolean mshowsBookmarkButton;

    /**
     * A Boolean value indicating whether the search results button is selected.
     */
    private boolean msearchResultsButtonSelected;

    /**
     * An array of strings indicating the titles of the scope buttons.
     */
    private NSArray mscopeButtonTitles;

    /**
     * The index of the selected scope button.
     */
    private int mselectedScopeButtonIndex;

    /**
     * Specifies whether the scope bar is displayed.
     */
    private boolean mshowsScopeBar;

    /**
     * A custom input accessory view for the keyboard of the search bar.
     */
    private RelativeLayout minputAccessoryView;

    /**
     * The background image for the scope bar.
     */
    private Drawable mscopeBarBackgroundImage;

    public NSString getPrompt() {
        return mprompt;
    }

    public void setPrompt(NSString prompt) {
        this.mprompt = prompt;
    }

    public UIBarStyle getBarStyle() {
        return mbarStyle;
    }

    public void setBarStyle(UIBarStyle barStyle) {
        this.mbarStyle = barStyle;
    }

    public boolean isTranslucent() {
        return mtranslucent;
    }

    public void setTranslucent(boolean translucent) {
        this.mtranslucent = translucent;
    }

    public boolean isShowsBookmarkButton() {
        return mshowsBookmarkButton;
    }

    public void setShowsBookmarkButton(boolean showsBookmarkButton) {
        this.mshowsBookmarkButton = showsBookmarkButton;
    }

    public boolean isSearchResultsButtonSelected() {
        return msearchResultsButtonSelected;
    }

    public void setSearchResultsButtonSelected(
        boolean searchResultsButtonSelected) {
        this.msearchResultsButtonSelected = searchResultsButtonSelected;
    }

    public NSArray getScopeButtonTitles() {
        return mscopeButtonTitles;
    }

    public void setScopeButtonTitles(NSArray scopeButtonTitles) {
        this.mscopeButtonTitles = scopeButtonTitles;
    }

    public int getSelectedScopeButtonIndex() {
        return mselectedScopeButtonIndex;
    }

    public void setSelectedScopeButtonIndex(int selectedScopeButtonIndex) {
        this.mselectedScopeButtonIndex = selectedScopeButtonIndex;
    }

    public boolean isShowsScopeBar() {
        return mshowsScopeBar;
    }

    public void setShowsScopeBar(boolean showsScopeBar) {
        this.mshowsScopeBar = showsScopeBar;
    }

    public RelativeLayout getInputAccessoryView() {
        return minputAccessoryView;
    }

    public void setInputAccessoryView(RelativeLayout inputAccessoryView) {
        this.minputAccessoryView = inputAccessoryView;
    }

    public Drawable getScopeBarBackgroundImage() {
        return mscopeBarBackgroundImage;
    }

    public void setScopeBarBackgroundImage(Drawable scopeBarBackgroundImage) {
        this.mscopeBarBackgroundImage = scopeBarBackgroundImage;
    }

    /**
     *
     */

    //UIOffset searchFieldBackgroundPositionAdjustment
}
