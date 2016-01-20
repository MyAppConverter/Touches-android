package com.myappconverter.uikit.bridges.protocols;

import com.myappconverter.uikit.myappclasses.MyAppSearchController;


public interface UISearchControllerDelegate {
    public void didDismissSearchController(
        MyAppSearchController searchController);

    public void didPresentSearchController(
        MyAppSearchController searchController);

    public void presentSearchController(MyAppSearchController searchController);

    public void willDismissSearchController(
        MyAppSearchController searchController);

    public void willPresentSearchController(
        MyAppSearchController searchController);
}
