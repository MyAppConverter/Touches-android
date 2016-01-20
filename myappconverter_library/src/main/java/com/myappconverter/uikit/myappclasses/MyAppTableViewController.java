package com.myappconverter.uikit.myappclasses;

import android.view.View;
import android.view.ViewGroup;

import com.myappconverter.java.foundations.NSArray;
import com.myappconverter.java.foundations.NSIndexPath;
import com.myappconverter.java.foundations.NSString;
import com.myappconverter.java.foundations.SEL;

import com.myappconverter.uikit.bridges.protocols.UITableViewDataSource;
import com.myappconverter.uikit.bridges.protocols.UITableViewDelegate;
import com.myappconverter.uikit.util.UIKitEnums.UITableViewCellEditingStyle;


public class MyAppTableViewController extends MyAppController
    implements UITableViewDataSource, UITableViewDelegate {
    public MyAppListView tableView;

    public Object initWithStyle(UITableViewStyle style) {
        return this;
    }

    @Override
    public View getView() {
        return super.getView();
    }

    @Override
    public void loadView() {
    }

    @Override
    public void viewDidLoad() {
    }

    @Override
    public void viewWillAppear(boolean animated) {
    }

    @Override
    public void viewDidUnLoad() {
    }

    @Override
    public MyAppController init() {
        return super.init();
    }

    @Override
    public void viewWillDisappear(boolean animated) {
    }

    @Override
    public void release() {
    }

    @Override
    public void viewDidAppear(boolean animated) {
    }

    @Override
    public void didReceiveMemoryWarning() {
    }

    public MyAppListView getTableView() {
        return tableView;
    }

    public void setTableView(MyAppListView tableView) {
        this.tableView = tableView;
    }

    @Override
    public void tableViewAccessoryButtonTappedForRowWithIndexPath(
        MyAppListView tableView, NSIndexPath indexPath) {
    }

    @Override
    public boolean tableViewCanPerformActionForRowAtIndexPathWithSender(
        MyAppListView tableView, SEL action, NSIndexPath indexPath,
        Object sender) {
        return false;
    }

    @Override
    public void tableViewDidDeselectRowAtIndexPath(MyAppListView tableView,
        NSIndexPath indexPath) {
    }

    @Override
    public void tableViewDidEndDisplayingCellForRowAtIndexPath(
        MyAppListView tableView, MyAppTableViewCell cell, NSIndexPath indexPath) {
    }

    @Override
    public void tableViewDidEndDisplayingFooterViewForSection(
        MyAppListView tableView, ViewGroup view, int section) {
    }

    @Override
    public void tableViewDidEndDisplayingHeaderViewForSection(
        MyAppListView tableView, ViewGroup view, int section) {
    }

    @Override
    public void tableViewDidEndEditingRowAtIndexPath(MyAppListView tableView,
        NSIndexPath indexPath) {
    }

    @Override
    public void tableViewDidHighlightRowAtIndexPath(MyAppListView tableView,
        NSIndexPath indexPath) {
    }

    @Override
    public void tableViewDidSelectRowAtIndexPath(MyAppListView tableView,
        NSIndexPath indexPath) {
    }

    @Override
    public void tableViewDidUnhighlightRowAtIndexPath(MyAppListView tableView,
        NSIndexPath indexPath) {
    }

    @Override
    public UITableViewCellEditingStyle tableViewEditingStyleForRowAtIndexPath(
        MyAppListView tableView, NSIndexPath indexPath) {
        return null;
    }

    @Override
    public float tableViewEstimatedHeightForFooterInSection(
        MyAppListView tableView, int section) {
        return 0;
    }

    @Override
    public float tableViewEstimatedHeightForHeaderInSection(
        MyAppListView tableView, int section) {
        return 0;
    }

    @Override
    public float tableViewEstimatedHeightForRowAtIndexPath(
        MyAppListView tableView, NSIndexPath indexPath) {
        return 0;
    }

    @Override
    public float tableViewHeightForFooterInSection(MyAppListView tableView,
        int section) {
        return 0;
    }

    @Override
    public float tableViewheightForHeaderInSection(MyAppListView tableView,
        int section) {
        return 0;
    }

    @Override
    public float tableViewHeightForRowAtIndexPath(MyAppListView tableView,
        NSIndexPath indexPath) {
        return 0;
    }

    @Override
    public int tableViewIndentationLevelForRowAtIndexPath(
        MyAppListView tableView, NSIndexPath indexPath) {
        return 0;
    }

    @Override
    public void tableViewPerformActionForRowAtIndexPathWithSender(
        MyAppListView tableView, SEL action, NSIndexPath indexPath,
        Object sender) {
    }

    @Override
    public Boolean tableViewShouldHighlightRowAtIndexPath(
        MyAppListView tableView, NSIndexPath indexPath) {
        return null;
    }

    @Override
    public Boolean tableViewShouldIndentWhileEditingRowAtIndexPath(
        MyAppListView tableView, NSIndexPath indexPath) {
        return null;
    }

    @Override
    public Boolean tableViewShouldShowMenuForRowAtIndexPath(
        MyAppListView tableView, NSIndexPath indexPath) {
        return null;
    }

    @Override
    public NSIndexPath tableViewTargetIndexPathForMoveFromRowAtIndexPathToProposedIndexPath(
        MyAppListView tableView, NSIndexPath sourceIndexPath,
        NSIndexPath toProposedIndexPath) {
        return null;
    }

    @Override
    public NSString tableViewTitleForDeleteConfirmationButtonForRowAtIndexPath(
        MyAppListView tableView, NSIndexPath indexPath) {
        return null;
    }

    @Override
    public ViewGroup tableViewViewForFooterInSection(MyAppListView tableView,
        int section) {
        return null;
    }

    @Override
    public ViewGroup tableViewViewForHeaderInSection(MyAppListView tableView,
        int section) {
        return null;
    }

    @Override
    public void tableViewWillBeginEditingRowAtIndexPath(
        MyAppListView tableView, NSIndexPath indexPath) {
    }

    @Override
    public NSIndexPath tableViewWillDeselectRowAtIndexPath(
        MyAppListView tableView, NSIndexPath indexPath) {
        return null;
    }

    @Override
    public void tableViewWillDisplayCellForRowAtIndexPath(
        MyAppListView tableView, MyAppTableViewCell cell, NSIndexPath indexPath) {
    }

    @Override
    public void tableViewWillDisplayFooterViewForSection(
        MyAppListView tableView, ViewGroup view, int section) {
    }

    @Override
    public void tableViewWillDisplayHeaderViewForSection(
        MyAppListView tableView, ViewGroup view, int section) {
    }

    @Override
    public NSIndexPath tableViewWillSelectRowAtIndexPath(
        MyAppListView tableView, NSIndexPath indexPath) {
        return null;
    }

    @Override
    public int numberOfSectionsInTableView(MyAppListView tableView) {
        return 0;
    }

    @Override
    public NSArray sectionIndexTitlesForTableView(MyAppListView tableView) {
        return null;
    }

    @Override
    public boolean tableViewCanEditRowAtIndexPath(MyAppListView tableView,
        NSIndexPath indexPath) {
        return false;
    }

    @Override
    public boolean tableViewCanMoveRowAtIndexPath(MyAppListView tableView,
        NSIndexPath indexPath) {
        return false;
    }

    @Override
    public void tableViewCommitEditingStyleForRowAtIndexPath(
        MyAppListView tableView, UITableViewCellEditingStyle editingStyle,
        NSIndexPath indexPath) {
    }

    @Override
    public void tableViewMoveRowAtIndexPathToIndexPath(
        MyAppListView tableView, NSIndexPath fromIndexPath,
        NSIndexPath toIndexPath) {
    }

    @Override
    public int tableViewNumberOfRowsInSection(MyAppListView tableView,
        int section) {
        return 0;
    }

    @Override
    public int tableViewSectionForSectionIndexTitleAtIndex(
        MyAppListView tableView, NSString title, int index) {
        return 0;
    }

    @Override
    public NSString tableViewTitleForFooterInSection(MyAppListView tableView,
        int section) {
        return null;
    }

    @Override
    public NSString tableViewTitleForHeaderInSection(MyAppListView tableView,
        int section) {
        return null;
    }

    @Override
    public MyAppTableViewCell tableViewCellForRowAtIndexPath(
        MyAppListView tableView, NSIndexPath indexPath, View convertView) {
        return null;
    }

    public static enum UITableViewStyle {UITableViewStylePlain,
        UITableViewStyleGrouped;
        public int getValue() {
            return this.ordinal();
        }
    }
}
