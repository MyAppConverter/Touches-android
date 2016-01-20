package com.myappconverter.uikit.bridges.protocols;

import android.view.View;

import com.myappconverter.java.foundations.NSArray;
import com.myappconverter.java.foundations.NSIndexPath;
import com.myappconverter.java.foundations.NSString;

import com.myappconverter.uikit.myappclasses.MyAppListView;
import com.myappconverter.uikit.myappclasses.MyAppTableViewCell;
import com.myappconverter.uikit.util.UIKitEnums.UITableViewCellEditingStyle;


public interface UITableViewDataSource {
    // 1

    /**
     * @return Return Value The number of sections in tableView. The default value is 1.
     * @Signature: numberOfSectionsInTableView:
     * @Declaration : - (NSInteger)numberOfSectionsInTableView:(UITableView *)tableView
     * @Description : Asks the data source to return the number of sections in the table view.
     **/
    public int numberOfSectionsInTableView(MyAppListView tableView);

    // 2

    /**
     * @return Return Value An array of strings that serve as the title of sections in the table view and appear in the index list on the
     * right side of the table view. The table view must be in the plain style (UITableViewStylePlain). For example, for an
     * alphabetized list, you could return an array containing strings â€œÂ€Â�Aâ€�Â€Â� through â€œZâ€�.
     * @Signature: sectionIndexTitlesForTableView:
     * @Declaration : - (NSArray *)sectionIndexTitlesForTableView:(UITableView *)tableView
     * @Description : Asks the data source to return the titles for the sections for a table view.
     **/
    public NSArray sectionIndexTitlesForTableView(MyAppListView tableView);

    // 3

    /**
     * @return Return Value YES if the row indicated by indexPath is editable; otherwise, NO.
     * @Signature: tableView:canEditRowAtIndexPath:
     * @Declaration : - (BOOL)tableView:(UITableView *)tableView canEditRowAtIndexPath:(NSIndexPath *)indexPath
     * @Description : Asks the data source to verify that the given row is editable.
     * @Discussion The method permits the data source to exclude individual rows from being treated as editable. Editable rows display the
     * insertion or deletion control in their cells. If this method is not implemented, all rows are assumed to be editable.
     * Rows that are not editable ignore the editingStyle property of a UITableViewCell object and do no indentation for the
     * deletion or insertion control. Rows that are editable, but that do not want to have an insertion or remove control shown,
     * can return UITableViewCellEditingStyleNone from the tableView:editingStyleForRowAtIndexPath: delegate method.
     **/
    public boolean tableViewCanEditRowAtIndexPath(MyAppListView tableView,
        NSIndexPath indexPath);

    // 4

    /**
     * @return Return Value YES if the row can be moved; otherwise NO.
     * @Signature: tableView:canMoveRowAtIndexPath:
     * @Declaration : - (BOOL)tableView:(UITableView *)tableView canMoveRowAtIndexPath:(NSIndexPath *)indexPath
     * @Description : Asks the data source whether a given row can be moved to another location in the table view.
     * @Discussion This method allows the data source to specify that the reordering control for the specified row not be shown. By default,
     * the reordering control is shown if the data source implements the tableView:moveRowAtIndexPath:toIndexPath: method.
     **/
    public boolean tableViewCanMoveRowAtIndexPath(MyAppListView tableView,
        NSIndexPath indexPath);

    // 5

    /**
     * @return Return Value An object inheriting from UITableViewCell that the table view can use for the specified row. An assertion is
     * raised if you return nil.
     * @Signature: tableView:cellForRowAtIndexPath:
     * @Declaration : - (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath
     * @Description : Asks the data source for a cell to insert in a particular location of the table view. (required)
     * @Discussion The returned UITableViewCell object is frequently one that the application reuses for performance reasons. You should
     * fetch a previously created cell object that is marked for reuse by sending a dequeueReusableCellWithIdentifier: message
     * to tableView. Various attributes of a table cell are set automatically based on whether the cell is a separator and on
     * information the data source provides, such as for accessory views and editing controls.
     **/
    public MyAppTableViewCell tableViewCellForRowAtIndexPath(
        MyAppListView tableView, NSIndexPath indexPath, View convertView);

    // 6

    /**
     * @Signature: tableView:commitEditingStyle:forRowAtIndexPath:
     * @Declaration : - (void)tableView:(UITableView *)tableView commitEditingStyle:(UITableViewCellEditingStyle)editingStyle
     * forRowAtIndexPath:(NSIndexPath *)indexPath
     * @Description : Asks the data source to commit the insertion or deletion of a specified row in the receiver.
     * @Discussion When users tap the insertion (green plus) control or Delete button associated with a UITableViewCell object in the table
     * view, the table view sends this message to the data source, asking it to commit the change. (If the user taps the
     * deletion (red minus) control, the table view then displays the Delete button to get confirmation.) The data source
     * commits the insertion or deletion by invoking the UITableView methods insertRowsAtIndexPaths:withRowAnimation: or
     * deleteRowsAtIndexPaths:withRowAnimation:, as appropriate. To enable the swipe-to-delete feature of table views (wherein a
     * user swipes horizontally across a row to display a Delete button), you must implement this method. You should not call
     * setEditing:animated: within an implementation of this method. If for some reason you must, invoke it after a delay by
     * using the performSelector:withObject:afterDelay: method.
     **/
    public void tableViewCommitEditingStyleForRowAtIndexPath(
        MyAppListView tableView, UITableViewCellEditingStyle editingStyle,
        NSIndexPath indexPath);

    // 7

    /**
     * @Signature: tableView:moveRowAtIndexPath:toIndexPath:
     * @Declaration : - (void)tableView:(UITableView *)tableView moveRowAtIndexPath:(NSIndexPath *)fromIndexPath toIndexPath:(NSIndexPath
     * *)toIndexPath
     * @Description : Tells the data source to move a row at a specific location in the table view to another location.
     * @Discussion The UITableView object sends this message to the data source when the user presses the reorder control in fromRow.
     **/
    public void tableViewMoveRowAtIndexPathToIndexPath(
        MyAppListView tableView, NSIndexPath fromIndexPath,
        NSIndexPath toIndexPath);

    // 8

    /**
     * @return Return Value The number of rows in section.
     * @Signature: tableView:numberOfRowsInSection:
     * @Declaration : - (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section
     * @Description : Tells the data source to return the number of rows in a given section of a table view. (required)
     **/
    public int tableViewNumberOfRowsInSection(MyAppListView tableView,
        int section);

    // 9

    /**
     * @return Return Value An index number identifying a section.
     * @Signature: tableView:sectionForSectionIndexTitle:atIndex:
     * @Declaration : - (NSInteger)tableView:(UITableView *)tableView sectionForSectionIndexTitle:(NSString *)title atIndex:(NSInteger)index
     * @Description : Asks the data source to return the index of the section having the given title and section title index.
     * @Discussion This method is passed the index number and title of an entry in the section index list and should return the index of the
     * referenced section. To be clear, there are two index numbers in play here: an index to an section index title in the
     * array returned by sectionIndexTitlesForTableView:, and an index to a section of the table view; the former is passed in,
     * and the latter is returned. You implement this method only for table views with a section index listâ€�?which can only be
     * table views created in the plain style (UITableViewStylePlain). Note that the array of section titles returned by
     * sectionIndexTitlesForTableView: can have fewer items than the actual number of sections in the table view.
     **/
    public int tableViewSectionForSectionIndexTitleAtIndex(
        MyAppListView tableView, NSString title, int index);

    // 10

    /**
     * @return Return Value A string to use as the title of the section footer. If you return nil , the section will have no title.
     * @Signature: tableView:titleForFooterInSection:
     * @Declaration : - (NSString *)tableView:(UITableView *)tableView titleForFooterInSection:(NSInteger)section
     * @Description : Asks the data source for the title of the footer of the specified section of the table view.
     * @Discussion The table view uses a fixed font style for section footer titles. If you want a different font style, return a custom
     * view (for example, a UILabel object) in the delegate method tableView:viewForFooterInSection: instead.
     **/
    public NSString tableViewTitleForFooterInSection(MyAppListView tableView,
        int section);

    // 11

    /**
     * @return Return Value A string to use as the title of the section header. If you return nil , the section will have no title.
     * @Signature: tableView:titleForHeaderInSection:
     * @Declaration : - (NSString *)tableView:(UITableView *)tableView titleForHeaderInSection:(NSInteger)section
     * @Description : Asks the data source for the title of the header of the specified section of the table view.
     * @Discussion The table view uses a fixed font style for section header titles. If you want a different font style, return a custom
     * view (for example, a UILabel object) in the delegate method tableView:viewForHeaderInSection: instead.
     **/
    public NSString tableViewTitleForHeaderInSection(MyAppListView tableView,
        int section);
}
