package com.myappconverter.uikit.bridges.protocols;

import android.view.ViewGroup;

import com.myappconverter.java.foundations.NSIndexPath;
import com.myappconverter.java.foundations.NSString;
import com.myappconverter.java.foundations.SEL;

import com.myappconverter.uikit.myappclasses.MyAppListView;
import com.myappconverter.uikit.myappclasses.MyAppTableViewCell;
import com.myappconverter.uikit.util.UIKitEnums.UITableViewCellEditingStyle;


public interface UITableViewDelegate {
    /**
     * @Declaration : - (void)tableView:(MyAppListView *)tableView accessoryButtonTappedForRowWithIndexPath:(NSIndexPath *)indexPath
     * @Description : Tells the delegate that the user tapped the accessory (disclosure) view associated with a given row.
     * @param tableView The table-view object informing the delegate of this event.
     * @param indexPath An index path locating the row in tableView.
     * @Discussion The delegate usually responds to the tap on the disclosure button (the accessory view) by displaying a new view related
     *             to the selected row. This method is not called when an accessory view is set for the row at indexPath.
    **/
    public void tableViewAccessoryButtonTappedForRowWithIndexPath(
        MyAppListView tableView, NSIndexPath indexPath);

    /**
     * @Declaration : - (BOOL)tableView:(MyAppListView *)tableView canPerformAction:(SEL)action forRowAtIndexPath:(NSIndexPath *)indexPath
     *              withSender:(id)sender
     * @Description : Asks the delegate if the editing menu should omit the Copy or Paste command for a given row.
     * @param tableView The table-view object that is making this request.
     * @param action A selector type identifying the copy: or paste: method of the UIResponderStandardEditActions informal protocol.
     * @param indexPath An index-path object locating the row in its section.
     * @param sender The object that initially sent the copy: or paste: message. T
     * @return Return Value YES if the command corresponding to action should appear in the editing menu, otherwise NO. The default value is
     *         NO.
     * @Discussion This method is invoked after tableView:shouldShowMenuForRowAtIndexPath:. It gives the developer the opportunity to
     *             exclude one of the commandsâ€�?Copy or Pasteâ€�?from the editing menu. For example, the user might have copied some cell
     *             content from one row but wants to paste into another row that doesnâ€™t take the copied content. In a case like this,
     *             return NO from this method.
    **/
    public boolean tableViewCanPerformActionForRowAtIndexPathWithSender(
        MyAppListView tableView, SEL action, NSIndexPath indexPath,
        Object sender);

    /**
     * @Declaration : - (void)tableView:(MyAppListView *)tableView didDeselectRowAtIndexPath:(NSIndexPath *)indexPath
     * @Description : Tells the delegate that the specified row is now deselected.
     * @param tableView A table-view object informing the delegate about the row deselection.
     * @param indexPath An index path locating the deselected row in tableView.
     * @Discussion The delegate handles row deselections in this method. It could, for example, remove the check-mark image
     *             (UITableViewCellAccessoryCheckmark) associated with the row.
     **/
    public void tableViewDidDeselectRowAtIndexPath(MyAppListView tableView,
        NSIndexPath indexPath);

    /**
     * @Declaration : - (void)tableView:(MyAppListView *)tableView didEndDisplayingCell:(UITableViewCell *)cell
     *              forRowAtIndexPath:(NSIndexPath *)indexPath
     * @Description : Tells the delegate that the specified cell was removed from the table.
     * @param tableView The table-view object that removed the view.
     * @param cell The cell that was removed.
     * @param indexPath The index path of the cell.
     * @Discussion Use this method to detect when a cell is removed from a table view, as opposed to monitoring the view itself to see when
     *             it appears or disappears.
    **/
    public void tableViewDidEndDisplayingCellForRowAtIndexPath(
        MyAppListView tableView, MyAppTableViewCell cell, NSIndexPath indexPath);

    /**
     * @Declaration : - (void)tableView:(MyAppListView *)tableView didEndDisplayingFooterView:(UIView *)view forSection:(NSInteger)section
     * @Description : Tells the delegate that the specified footer view was removed from the table.
     * @param tableView The table-view object that removed the view.
     * @param view The footer view that was removed.
     * @param section The index of the section that contained the footer.
     * @Discussion Use this method to detect when a footer view is removed from a table view, as opposed to monitoring the view itself to
     *             see when it appears or disappears.
     **/
    public void tableViewDidEndDisplayingFooterViewForSection(
        MyAppListView tableView, ViewGroup view, int section);

    /**
     * @Declaration : - (void)tableView:(MyAppListView *)tableView didEndDisplayingHeaderView:(UIView *)view forSection:(NSInteger)section
     * @Description : Tells the delegate that the specified header view was removed from the table.
     * @param tableView The table-view object that removed the view.
     * @param view The header view that was removed.
     * @param section The index of the section that contained the header.
     * @Discussion Use this method to detect when a header view is removed from a table view, as opposed to monitoring the view itself to
     *             see when it appears or disappears.
     **/
    public void tableViewDidEndDisplayingHeaderViewForSection(
        MyAppListView tableView, ViewGroup view, int section);

    /**
     * @Declaration : - (void)tableView:(MyAppListView *)tableView didEndEditingRowAtIndexPath:(NSIndexPath *)indexPath
     * @Description : Tells the delegate that the table view has left editing mode.
     * @param tableView The table-view object providing this information.
     * @param indexPath An index path locating the row in tableView.
     * @Discussion This method is called when the table view exits editing mode after having been put into the mode by the user swiping
     *             across the row identified by indexPath. As a result, a Delete button appears in the row; however, in this
     *             "??swipe to delete"?? mode the table view does not display any insertion, deletion, and reordering controls. When
     *             entering this "??swipe to delete"?? editing mode, the table view sends a tableView:willBeginEditingRowAtIndexPath:
     *             message to the delegate to allow it to adjust its user interface.
    **/
    public void tableViewDidEndEditingRowAtIndexPath(MyAppListView tableView,
        NSIndexPath indexPath);

    /**
     * @Declaration : - (void)tableView:(MyAppListView *)tableView didHighlightRowAtIndexPath:(NSIndexPath *)indexPath
     * @Description : Tells the delegate that the specified row was highlighted.
     * @param tableView The table-view object that highlighted the cell.
     * @param indexPath The index path of the row that was highlighted.
     **/
    public void tableViewDidHighlightRowAtIndexPath(MyAppListView tableView,
        NSIndexPath indexPath);

    /**
     * @Declaration : - (void)tableView:(MyAppListView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath
     * @Description : Tells the delegate that the specified row is now selected.
     * @param tableView A table-view object informing the delegate about the new row selection.
     * @param indexPath An index path locating the new selected row in tableView.
     * @Discussion The delegate handles selections in this method. One of the things it can do is exclusively assign the check-mark image
     *             (UITableViewCellAccessoryCheckmark) to one row in a section (radio-list style). This method isnâ€™t called when the
     *             editing property of the table is set to YES (that is, the table view is in editing mode). See
     *             "??â€œManaging Selectionsâ€�" in Table View Programming Guide for iOS for further information (and code examples) related
     *             to this method.
     **/
    public void tableViewDidSelectRowAtIndexPath(MyAppListView tableView,
        NSIndexPath indexPath);

    /**
     * @Declaration : - (void)tableView:(MyAppListView *)tableView didUnhighlightRowAtIndexPath:(NSIndexPath *)indexPath
     * @Description : Tells the delegate that the highlight was removed from the row at the specified index path.
     * @param tableView The table-view object that removed the highlight from the cell.
     * @param indexPath The index path of the row that had its highlight removed.
     **/
    public void tableViewDidUnhighlightRowAtIndexPath(MyAppListView tableView,
        NSIndexPath indexPath);

    /**
     * @Declaration : - (UITableViewCellEditingStyle)tableView:(MyAppListView *)tableView editingStyleForRowAtIndexPath:(NSIndexPath
     *              *)indexPath
     * @Description : Asks the delegate for the editing style of a row at a particular location in a table view.
     * @param tableView The table-view object requesting this information.
     * @param indexPath An index path locating a row in tableView.
     * @return Return Value The editing style of the cell for the row identified by indexPath.
     * @Discussion This method allows the delegate to customize the editing style of the cell located atindexPath. If the delegate does not
     *             implement this method and the UITableViewCell object is editable (that is, it has its editing property set to YES), the
     *             cell has the UITableViewCellEditingStyleDelete style set for it.
     * @AutoMapping
     **/
    public UITableViewCellEditingStyle tableViewEditingStyleForRowAtIndexPath(
        MyAppListView tableView, NSIndexPath indexPath);

    /**
     * @Declaration : - (CGFloat)tableView:(MyAppListView *)tableView estimatedHeightForFooterInSection:(NSInteger)section
     * @Description : Asks the delegate for the estimated height of the footer of a particular section.
     * @param tableView The table-view object requesting this information.
     * @param section An index number identifying a section of tableView .
     * @return Return Value A nonnegative floating-point value that estimates the height (in points) of the footer for section.
     * @Discussion Providing an estimate the height of section footers can improve the user experience when loading the table view. If the
     *             table contains variable height section footers, it might be expensive to calculate all their heights and so lead to a
     *             longer load time. Using estimation allows you to defer some of the cost of geometry calculation from load time to
     *             scrolling time.
     * @AutoMapping
     **/
    public float tableViewEstimatedHeightForFooterInSection(
        MyAppListView tableView, int section);

    /**
     * @Declaration : - (CGFloat)tableView:(MyAppListView *)tableView estimatedHeightForHeaderInSection:(NSInteger)section
     * @Description : Asks the delegate for the estimated height of the header of a particular section.
     * @param tableView The table-view object requesting this information.
     * @param section An index number identifying a section of tableView .
     * @return Return Value A nonnegative floating-point value that specifies the height (in points) of the header for section.
     * @Discussion Providing an estimate the height of section headers can improve the user experience when loading the table view. If the
     *             table contains variable height section headers, it might be expensive to calculate all their heights and so lead to a
     *             longer load time. Using estimation allows you to defer some of the cost of geometry calculation from load time to
     *             scrolling time.
     * @AutoMapping
     **/
    public float tableViewEstimatedHeightForHeaderInSection(
        MyAppListView tableView, int section);

    /**
     * @Declaration : - (CGFloat)tableView:(MyAppListView *)tableView estimatedHeightForRowAtIndexPath:(NSIndexPath *)indexPath
     * @Description : Asks the delegate for the estimated height of a row in a specified location.
     * @param tableView The table-view object requesting this information.
     * @param indexPath An index path that locates a row in tableView.
     * @return Return Value A nonnegative floating-point value that estimates the height (in points) that row should be. Return
     *         UITableViewAutomaticDimension if you have no estimate.
     * @Discussion Providing an estimate the height of rows can improve the user experience when loading the table view. If the table
     *             contains variable height rows, it might be expensive to calculate all their heights and so lead to a longer load time.
     *             Using estimation allows you to defer some of the cost of geometry calculation from load time to scrolling time.
     **/
    public float tableViewEstimatedHeightForRowAtIndexPath(
        MyAppListView tableView, NSIndexPath indexPath);

    /**
     * @Declaration : - (CGFloat)tableView:(MyAppListView *)tableView heightForFooterInSection:(NSInteger)section
     * @Description : Asks the delegate for the height to use for the footer of a particular section.
     * @param tableView The table-view object requesting this information.
     * @param section An index number identifying a section of tableView .
     * @return Return Value A nonnegative floating-point value that specifies the height (in points) of the footer for section.
     * @Discussion This method allows the delegate to specify section footers with varying heights. The table view does not call this method
     *             if it was created in a plain style (UITableViewStylePlain).
     **/
    public float tableViewHeightForFooterInSection(MyAppListView tableView,
        int section);

    /**
     * @Declaration : - (CGFloat)tableView:(MyAppListView *)tableView heightForHeaderInSection:(NSInteger)section
     * @Description : Asks the delegate for the height to use for the header of a particular section.
     * @param tableView The table-view object requesting this information.
     * @param section An index number identifying a section of tableView .
     * @return Return Value A nonnegative floating-point value that specifies the height (in points) of the header for section.
     * @Discussion This method allows the delegate to specify section headers with varying heights.
     * @AutoMapping
     **/
    public float tableViewheightForHeaderInSection(MyAppListView tableView,
        int section);

    /**
     * @Declaration : - (CGFloat)tableView:(MyAppListView *)tableView heightForRowAtIndexPath:(NSIndexPath *)indexPath
     * @Description : Asks the delegate for the height to use for a row in a specified location.
     * @param tableView The table-view object requesting this information.
     * @param indexPath An index path that locates a row in tableView.
     * @return Return Value A nonnegative floating-point value that specifies the height (in points) that row should be.
     * @Discussion The method allows the delegate to specify rows with varying heights. If this method is implemented, the value it returns
     *             overrides the value specified for the rowHeight property of MyAppListView for the given row. There are performance
     *             implications to using tableView:heightForRowAtIndexPath: instead of the rowHeight property. Every time a table view is
     *             displayed, it calls tableView:heightForRowAtIndexPath: on the delegate for each of its rows, which can result in a
     *             significant performance problem with table views having a large number of rows (approximately 1000 or more). See also
     *             tableView:estimatedHeightForRowAtIndexPath:. Important:Â Due to an underlying implementation detail, you should not
     *             return values greater than 2009.
     **/
    public float tableViewHeightForRowAtIndexPath(MyAppListView tableView,
        NSIndexPath indexPath);

    /**
     * @Declaration : - (NSInteger)tableView:(MyAppListView *)tableView indentationLevelForRowAtIndexPath:(NSIndexPath *)indexPath
     * @Description : Asks the delegate to return the level of indentation for a row in a given section.
     * @param tableView The table-view object requesting this information.
     * @param indexPath An index path locating the row in tableView.
     * @return Return Value Returns the depth of the specified row to show its hierarchical position in the section.
     **/
    public int tableViewIndentationLevelForRowAtIndexPath(
        MyAppListView tableView, NSIndexPath indexPath);

    /**
     * @Declaration : - (void)tableView:(MyAppListView *)tableView performAction:(SEL)action forRowAtIndexPath:(NSIndexPath *)indexPath
     *              withSender:(id)sender
     * @Description : Tells the delegate to perform a copy or paste operation on the content of a given row.
     * @param tableView The table-view object that is making this request.
     * @param action A selector type identifying the copy: or paste: method of the UIResponderStandardEditActions informal protocol.
     * @param indexPath An index-path object locating the row in its section.
     * @param sender The object that initially sent the copy: or paste: message.
     * @Discussion The table view invokes this method for a given action if the user taps Copy or Paste in the editing menu. The delegate
     *             can do whatever is appropriate for the action; for example, for a copy, it can extract the relevant cell content for the
     *             row at indexPath and write it to the general pasteboard or an application (private) pasteboard. See UIPasteboard Class
     *             Reference for further information.
     **/
    public void tableViewPerformActionForRowAtIndexPathWithSender(
        MyAppListView tableView, SEL action, NSIndexPath indexPath,
        Object sender);

    /**
     * @Declaration : - (BOOL)tableView:(MyAppListView *)tableView shouldHighlightRowAtIndexPath:(NSIndexPath *)indexPath
     * @Description : Asks the delegate if the specified row should be highlighted.
     * @param tableView The table-view object that is making this request.
     * @param indexPath The index path of the row being highlighted.
     * @return Return Value YES if the row should be highlighted or NO if it should not.
     * @Discussion As touch events arrive, the table view highlights rows in anticipation of the user selecting them. As it processes those
     *             touch events, the table view calls this method to ask your delegate if a given cell should be highlighted. Your delegate
     *             can implement this method and use it to prevent the highlighting of a row when another row is already selected or when
     *             other relevant criteria occur. If you do not implement this method, the default return value is YES.
     **/
    public Boolean tableViewShouldHighlightRowAtIndexPath(
        MyAppListView tableView, NSIndexPath indexPath);

    /**
     * @Declaration : - (BOOL)tableView:(MyAppListView *)tableView shouldIndentWhileEditingRowAtIndexPath:(NSIndexPath *)indexPath
     * @Description : Asks the delegate whether the background of the specified row should be indented while the table view is in editing
     *              mode.
     * @param tableView The table-view object requesting this information.
     * @param indexPath An index-path object locating the row in its section.
     * @return Return Value YES if the background of the row should be indented, otherwise NO.
     * @Discussion If the delegate does not implement this method, the default is YES. This method is unrelated to
     *             tableView:indentationLevelForRowAtIndexPath:.
     **/
    public Boolean tableViewShouldIndentWhileEditingRowAtIndexPath(
        MyAppListView tableView, NSIndexPath indexPath);

    /**
     * @Declaration : - (BOOL)tableView:(MyAppListView *)tableView shouldShowMenuForRowAtIndexPath:(NSIndexPath *)indexPath
     * @Description : Asks the delegate if the editing menu should be shown for a certain row.
     * @param tableView The table-view object that is making this request.
     * @param indexPath An index-path object locating the row in its section.
     * @return Return Value YES if the editing menu should be shown positioned near the row and pointing to it, otherwise NO. The default
     *         value is NO.
     * @Discussion If the user tap-holds a certain row in the table view, this method (if implemented) is invoked first. Return NO if the
     *             editing menu shouldnâ€™t be shownâ€�?for example, the cell corresponding to the row contains content that shouldnâ€™t be
     *             copied or pasted over.
     **/
    public Boolean tableViewShouldShowMenuForRowAtIndexPath(
        MyAppListView tableView, NSIndexPath indexPath);

    /**
     * @Declaration : - (NSIndexPath *)tableView:(MyAppListView *)tableView targetIndexPathForMoveFromRowAtIndexPath:(NSIndexPath
     *              *)sourceIndexPath toProposedIndexPath:(NSIndexPath *)proposedDestinationIndexPath
     * @Description : Asks the delegate to return a new index path to retarget a proposed move of a row.
     * @param tableView The table-view object that is requesting this information.
     * @param sourceIndexPath An index-path object identifying the original location of a row (in its section) that is being dragged.
     * @param proposedDestinationIndexPath An index-path object identifying the currently proposed destination of the row being dragged.
     * @return Return Value An index-path object locating the desired row destination for the move operation. Return
     *         proposedDestinationIndexPath if that location is suitable.
     * @Discussion This method allows customization of the target row for a particular row as it is being moved up and down a table view. As
     *             the dragged row hovers over another row, the destination row slides downward to visually make room for the relocation;
     *             this is the location identified by proposedDestinationIndexPath.
     * @AutoMapping
     **/
    public NSIndexPath tableViewTargetIndexPathForMoveFromRowAtIndexPathToProposedIndexPath(
        MyAppListView tableView, NSIndexPath sourceIndexPath,
        NSIndexPath toProposedIndexPath);

    /**
     * @Declaration : - (NSString *)tableView:(MyAppListView *)tableView titleForDeleteConfirmationButtonForRowAtIndexPath:(NSIndexPath
     *              *)indexPath
     * @Description : Changes the default title of the delete-confirmation button.
     * @param tableView The table-view object requesting this information.
     * @param indexPath An index-path object locating the row in its section.
     * @return Return Value A localized string to used as the title of the delete-confirmation button.
     * @Discussion By default, the delete-confirmation button, which appears on the right side of the cell, has the title of â€œDeleteâ€�.
     *             The table view displays this button when the user attempts to delete a row, either by swiping the row or tapping the red
     *             minus icon in editing mode. You can implement this method to return an alternative title, which should be localized.
     * @AutoMapping
     **/
    public NSString tableViewTitleForDeleteConfirmationButtonForRowAtIndexPath(
        MyAppListView tableView, NSIndexPath indexPath);

    /**
     * @Declaration : - (UIView *)tableView:(MyAppListView *)tableView viewForFooterInSection:(NSInteger)section
     * @Description : Asks the delegate for a view object to display in the footer of the specified section of the table view.
     * @param tableView The table-view object asking for the view object.
     * @param section An index number identifying a section of tableView .
     * @return Return Value A view object to be displayed in the footer of section .
     * @Discussion The returned object can be a UILabel or UIImageView object, as well as a custom view. This method only works correctly
     *             when tableView:heightForFooterInSection: is also implemented.
     * @AutoMapping
     **/
    public ViewGroup tableViewViewForFooterInSection(MyAppListView tableView,
        int section);

    /**
     * @Declaration : - (UIView *)tableView:(MyAppListView *)tableView viewForHeaderInSection:(NSInteger)section
     * @Description : Asks the delegate for a view object to display in the header of the specified section of the table view.
     * @param tableView The table-view object asking for the view object.
     * @param section An index number identifying a section of tableView .
     * @return Return Value A view object to be displayed in the header of section .
     * @Discussion The returned object can be a UILabel or UIImageView object, as well as a custom view. This method only works correctly
     *             when tableView:heightForHeaderInSection: is also implemented.
     * @AutoMapping
     **/
    public ViewGroup tableViewViewForHeaderInSection(MyAppListView tableView,
        int section);

    /**
     * @Declaration : - (void)tableView:(MyAppListView *)tableView willBeginEditingRowAtIndexPath:(NSIndexPath *)indexPath
     * @Description : Tells the delegate that the table view is about to go into editing mode.
     * @param tableView The table-view object providing this information.
     * @param indexPath An index path locating the row in tableView.
     * @Discussion This method is called when the user swipes horizontally across a row; as a consequence, the table view sets its editing
     *             property to YES (thereby entering editing mode) and displays a Delete button in the row identified by indexPath. In this
     *             "??swipe to delete"?? mode the table view does not display any insertion, deletion, and reordering controls. This method
     *             gives the delegate an opportunity to adjust the application'??s user interface to editing mode. When the table exits
     *             editing mode (for example, the user taps the Delete button), the table view calls tableView:didEndEditingRowAtIndexPath:.
     *             Note:Â A swipe motion across a cell does not cause the display of a Delete button unless the table view'??s data source
     *             implements the tableView:commitEditingStyle:forRowAtIndexPath: method.
     **/
    public void tableViewWillBeginEditingRowAtIndexPath(
        MyAppListView tableView, NSIndexPath indexPath);

    /**
     * @Declaration : - (NSIndexPath *)tableView:(MyAppListView *)tableView willDeselectRowAtIndexPath:(NSIndexPath *)indexPath
     * @Description : Tells the delegate that a specified row is about to be deselected.
     * @param tableView A table-view object informing the delegate about the impending deselection.
     * @param indexPath An index path locating the row in tableView to be deselected.
     * @return Return Value An index-path object that confirms or alters the deselected row. Return an NSIndexPath object other than
     *         indexPath if you want another cell to be deselected. Return nil if you donâ€™t want the row deselected.
     * @Discussion This method is only called if there is an existing selection when the user tries to select a different row. The delegate
     *             is sent this method for the previously selected row. You can use UITableViewCellSelectionStyleNone to disable the
     *             appearance of the cell highlight on touch-down.
    **/
    public NSIndexPath tableViewWillDeselectRowAtIndexPath(
        MyAppListView tableView, NSIndexPath indexPath);

    /**
     * @Declaration : - (void)tableView:(MyAppListView *)tableView willDisplayCell:(UITableViewCell *)cell forRowAtIndexPath:(NSIndexPath
     *              *)indexPath
     * @Description : Tells the delegate the table view is about to draw a cell for a particular row.
     * @param tableView The table-view object informing the delegate of this impending event.
     * @param cell A table-view cell object that tableView is going to use when drawing the row.
     * @param indexPath An index path locating the row in tableView.
     * @Discussion A table view sends this message to its delegate just before it uses cell to draw a row, thereby permitting the delegate
     *             to customize the cell object before it is displayed. This method gives the delegate a chance to override state-based
     *             properties set earlier by the table view, such as selection and background color. After the delegate returns, the table
     *             view sets only the alpha and frame properties, and then only when animating rows as they slide in or out.
     * @AutoMapping
     **/
    public void tableViewWillDisplayCellForRowAtIndexPath(
        MyAppListView tableView, MyAppTableViewCell cell, NSIndexPath indexPath);

    /**
     * @Declaration : - (void)tableView:(MyAppListView *)tableView willDisplayFooterView:(UIView *)view forSection:(NSInteger)section
     * @Description : Tells the delegate that a footer view is about to be displayed for the specified section.
     * @param tableView The table-view object informing the delegate of this event.
     * @param view The footer view that is about to be displayed.
     * @param section An index number identifying a section of tableView .
     * @AutoMapping
     **/
    public void tableViewWillDisplayFooterViewForSection(
        MyAppListView tableView, ViewGroup view, int section);

    /**
     * @Declaration : - (void)tableView:(MyAppListView *)tableView willDisplayHeaderView:(UIView *)view forSection:(NSInteger)section
     * @Description : Tells the delegate that a header view is about to be displayed for the specified section.
     * @param tableView The table-view object informing the delegate of this event.
     * @param view The header view that is about to be displayed.
     * @param section An index number identifying a section of tableView.
     * @AutoMapping
     **/
    public void tableViewWillDisplayHeaderViewForSection(
        MyAppListView tableView, ViewGroup view, int section);

    /**
     * @Declaration : - (NSIndexPath *)tableView:(MyAppListView *)tableView willSelectRowAtIndexPath:(NSIndexPath *)indexPath
     * @Description : Tells the delegate that a specified row is about to be selected.
     * @param tableView A table-view object informing the delegate about the impending selection.
     * @param indexPath An index path locating the row in tableView.
     * @return Return Value An index-path object that confirms or alters the selected row. Return an NSIndexPath object other than indexPath
     *         if you want another cell to be selected. Return nil if you don'??t want the row selected.
     * @Discussion This method is not called until users touch a row and then lift their finger; the row isn'??t selected until then,
     *             although it is highlighted on touch-down. You can use UITableViewCellSelectionStyleNone to disable the appearance of the
     *             cell highlight on touch-down. This method isnâ€™t called when the table view is in editing mode (that is, the editing
     *             property of the table view is set to YES) unless the table view allows selection during editing (that is, the
     *             allowsSelectionDuringEditing property of the table view is set to YES).
     **/
    public NSIndexPath tableViewWillSelectRowAtIndexPath(
        MyAppListView tableView, NSIndexPath indexPath);
}
