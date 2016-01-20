package com.myappconverter.uikit.bridges.protocols;

import android.widget.SearchView;

import com.myappconverter.java.foundations.NSRange;
import com.myappconverter.java.foundations.NSString;


public interface UISearchBarDelegate {
    public void searchBarSelectedScopeButtonIndexDidChange(
        SearchView searchBar, int selectedScope);

    public boolean searchBarShouldChangeTextInRangeReplacementText(
        SearchView searchBar, NSRange range, NSString text);

    public void searchBarTextDidChange(SearchView searchBar, NSString searchText);

    public void searchBarBookmarkButtonClicked(SearchView searchBar);

    public void searchBarCancelButtonClicked(SearchView searchBar);

    public void searchBarResultsListButtonClicked(SearchView searchBar);

    public void searchBarSearchButtonClicked(SearchView searchBar);

    public boolean searchBarShouldBeginEditing(SearchView searchBar);

    public boolean searchBarShouldEndEditing(SearchView searchBar);

    public void searchBarTextDidBeginEditing(SearchView searchBar);

    public void searchBarTextDidEndEditing(SearchView searchBar);
}
