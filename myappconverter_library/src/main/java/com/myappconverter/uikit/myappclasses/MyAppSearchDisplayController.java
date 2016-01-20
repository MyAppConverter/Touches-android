package com.myappconverter.uikit.myappclasses;

import android.widget.SearchView;

import com.myappconverter.java.foundations.NSString;

import com.myappconverter.uikit.bridges.protocols.UISearchDisplayDelegate;
import com.myappconverter.uikit.bridges.protocols.UITableViewDataSource;
import com.myappconverter.uikit.bridges.protocols.UITableViewDelegate;


public class MyAppSearchDisplayController {
    private boolean active;
    private UISearchDisplayDelegate delegate;
    private SearchView searchBar;
    private MyAppController searchContentsController;
    private MyAppListView searchResultsTableView;
    private UITableViewDataSource searchResultsDataSource;
    private UITableViewDelegate searchResultsDelegate;
    private NSString searchResultsTitle;
    private boolean displaysSearchBarInNavigationBar;
    private MyAppNavigationItem navigationItem;

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public UISearchDisplayDelegate getDelegate() {
        return delegate;
    }

    public void setDelegate(UISearchDisplayDelegate delegate) {
        this.delegate = delegate;
    }

    public SearchView getSearchBar() {
        return searchBar;
    }

    public void setSearchBar(SearchView searchBar) {
        this.searchBar = searchBar;
    }

    public void setSearchContentsController(
        MyAppController searchContentsController) {
        this.searchContentsController = searchContentsController;
    }

    public void setSearchResultsTableView(MyAppListView searchResultsTableView) {
        this.searchResultsTableView = searchResultsTableView;
    }

    public UITableViewDataSource getSearchResultsDataSource() {
        return searchResultsDataSource;
    }

    public void setSearchResultsDataSource(
        UITableViewDataSource searchResultsDataSource) {
        this.searchResultsDataSource = searchResultsDataSource;
    }

    public UITableViewDelegate getSearchResultsDelegate() {
        return searchResultsDelegate;
    }

    public void setSearchResultsDelegate(
        UITableViewDelegate searchResultsDelegate) {
        this.searchResultsDelegate = searchResultsDelegate;
    }

    public NSString getSearchResultsTitle() {
        return searchResultsTitle;
    }

    public void setSearchResultsTitle(NSString searchResultsTitle) {
        this.searchResultsTitle = searchResultsTitle;
    }

    public boolean getDisplaysSearchBarInNavigationBar() {
        return displaysSearchBarInNavigationBar;
    }

    public void setDisplaysSearchBarInNavigationBar(
        boolean displaysSearchBarInNavigationBar) {
        this.displaysSearchBarInNavigationBar = displaysSearchBarInNavigationBar;
    }

    public MyAppNavigationItem getNavigationItem() {
        return navigationItem;
    }

    public void setNavigationItem(MyAppNavigationItem navigationItem) {
        this.navigationItem = navigationItem;
    }
}
