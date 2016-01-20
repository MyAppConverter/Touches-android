package com.myappconverter.uikit.bridges.protocols;

import com.myappconverter.java.foundations.NSString;
import com.myappconverter.java.foundations.types.NSInteger_UnUsed;

import com.myappconverter.uikit.myappclasses.MyAppListView;
import com.myappconverter.uikit.myappclasses.MyAppSearchDisplayController;


public interface UISearchDisplayDelegate {
    public void searchDisplayControllerWillBeginSearch(
        MyAppSearchDisplayController controller);

    public boolean searchDisplayControllerDidBeginSearch(
        MyAppSearchDisplayController controller);

    public void searchDisplayControllerWillEndSearch(
        MyAppSearchDisplayController controller);

    public void searchDisplayControllerDidEndSearch(
        MyAppSearchDisplayController controller);

    public void searchDisplayControllerDidLoadSearchResultsTableView(
        MyAppSearchDisplayController controller, MyAppListView tableView);

    public void searchDisplayControllerWillUnloadSearchResultsTableView(
        MyAppSearchDisplayController controller, MyAppListView tableView);

    public void searchDisplayControllerWillShowSearchResultsTableView(
        MyAppSearchDisplayController controller, MyAppListView tableView);

    public void searchDisplayControllerDidShowSearchResultsTableView(
        MyAppSearchDisplayController controller, MyAppListView tableView);

    public void searchDisplayControllerWillHideSearchResultsTableView(
        MyAppSearchDisplayController controller, MyAppListView tableView);

    public void searchDisplayControllerDidHideSearchResultsTableView(
        MyAppSearchDisplayController controller, MyAppListView tableView);

    public boolean searchDisplayControllerShouldReloadTableForSearchString(
        MyAppSearchDisplayController controller, NSString searchString);

    public boolean searchDisplayControllerShouldReloadTableForSearchScope(
        MyAppSearchDisplayController controller, NSInteger_UnUsed searchOption);
}
