package com.myappconverter.uikit.myappclasses;

import android.widget.SearchView;

import com.myappconverter.uikit.bridges.protocols.UISearchControllerDelegate;
import com.myappconverter.uikit.bridges.protocols.UISearchResultsUpdating;


public class MyAppSearchController {
    private boolean active;
    private UISearchControllerDelegate delegate;
    private SearchView searchBar;
    private boolean dimsBackgroundDuringPresentation;
    private boolean hidesNavigationBarDuringPresentation;
    private MyAppController searchResultsController;
    private UISearchResultsUpdating searchResultsUpdater;

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public UISearchControllerDelegate getDelegate() {
        return delegate;
    }

    public void setDelegate(UISearchControllerDelegate delegate) {
        this.delegate = delegate;
    }

    public SearchView getSearchBar() {
        return searchBar;
    }

    public void setSearchBar(SearchView searchBar) {
        this.searchBar = searchBar;
    }

    public boolean getDimsBackgroundDuringPresentation() {
        return dimsBackgroundDuringPresentation;
    }

    public void setDimsBackgroundDuringPresentation(
        boolean dimsBackgroundDuringPresentation) {
        this.dimsBackgroundDuringPresentation = dimsBackgroundDuringPresentation;
    }

    public boolean getHidesNavigationBarDuringPresentation() {
        return hidesNavigationBarDuringPresentation;
    }

    public void setHidesNavigationBarDuringPresentation(
        boolean hidesNavigationBarDuringPresentation) {
        this.hidesNavigationBarDuringPresentation = hidesNavigationBarDuringPresentation;
    }

    public MyAppController getSearchResultsController() {
        return searchResultsController;
    }

    public void setSearchResultsController(
        MyAppController searchResultsController) {
        this.searchResultsController = searchResultsController;
    }

    public UISearchResultsUpdating getSearchResultsUpdater() {
        return searchResultsUpdater;
    }

    public void setSearchResultsUpdater(
        UISearchResultsUpdating searchResultsUpdater) {
        this.searchResultsUpdater = searchResultsUpdater;
    }
}
