package com.myappconverter.uikit.bridges.protocols;

import android.widget.EditText;

import com.myappconverter.java.foundations.NSRange;
import com.myappconverter.java.foundations.NSString;


public interface UITextFieldDelegate {
    /**
     * @Declaration : - (BOOL)textFieldShouldBeginEditing:(UITextField *)textField
     * @Description : Asks the delegate if editing should begin in the specified text field.
     * @param textField The text field for which editing is about to begin.
     * @return Return Value YES if an editing session should be initiated; otherwise, NO to disallow editing.
     * @Discussion When the user performs an action that would normally initiate an editing session, the text field calls this method first
     *             to see if editing should actually proceed. In most circumstances, you would simply return YES from this method to allow
     *             editing to proceed. Implementation of this method by the delegate is optional. If it is not present, editing proceeds as
     *             if this method had returned YES.
     */
    public boolean textFieldShouldBeginEditing(EditText textField);

    /**
     * @Declaration : - (void)textFieldDidBeginEditing:(UITextField *)textField
     * @Description : Tells the delegate that editing began for the specified text field.
     * @param textField The text field for which an editing session began.
     * @Discussion This method notifies the delegate that the specified text field just became the first responder. You can use this method
     *             to update your delegate’s state information. For example, you might use this method to show overlay views that should be
     *             visible while editing. Implementation of this method by the delegate is optional.
     */
    public void textFieldDidBeginEditing(EditText textField);

    /**
     * @Declaration : - (BOOL)textFieldShouldEndEditing:(UITextField *)textField
     * @Description : Asks the delegate if editing should stop in the specified text field.
     * @param textField The text field for which editing is about to end.
     * @return Return Value YES if editing should stop; otherwise, NO if the editing session should continue
     * @Discussion This method is called when the text field is asked to resign the first responder status. This might occur when your
     *             application asks the text field to resign focus or when the user tries to change the editing focus to another control.
     *             Before the focus actually changes, however, the text field calls this method to give your delegate a chance to decide
     *             whether it should. Normally, you would return YES from this method to allow the text field to resign the first responder
     *             status. You might return NO, however, in cases where your delegate detects invalid contents in the text field. By
     *             returning NO, you could prevent the user from switching to another control until the text field contained a valid value.
     *             Note: If you use this method to validate the contents of the text field, you might also want to provide feedback to that
     *             effect using an overlay view. For example, you could temporarily display a small icon indicating the text was invalid and
     *             needs to be corrected. For more information about adding overlays to text fields, see the methods of UITextField. Be
     *             aware that this method provides only a recommendation about whether editing should end. Even if you return NO from this
     *             method, it is possible that editing might still end. For example, this might happen when the text field is forced to
     *             resign the first responder status by being removed from its parent view or window. Implementation of this method by the
     *             delegate is optional. If it is not present, the first responder status is resigned as if this method had returned YES.
     */
    public boolean textFieldShouldEndEditing(EditText textField);

    /**
     * @Declaration : - (void)textFieldDidEndEditing:(UITextField *)textField
     * @Description : Tells the delegate that editing stopped for the specified text field.
     * @param textField The text field for which editing ended.
     * @Discussion This method is called after the text field resigns its first responder status. You can use this method to update your
     *             delegate’s state information. For example, you might use this method to hide overlay views that should be visible only
     *             while editing. Implementation of this method by the delegate is optional.
     */
    public void textFieldDidEndEditing(EditText textField);

    // Editing the Text Field’s Text

    /**
     * @Declaration : - (BOOL)textField:(UITextField *)textField shouldChangeCharactersInRange:(NSRange)range replacementString:(NSString
     *              *)string
     * @Description : Asks the delegate if the specified text should be changed.
     * @param textField The text field containing the text.
     * @param range The range of characters to be replaced
     * @param string The replacement string.
     * @return Return Value YES if the specified text range should be replaced; otherwise, NO to keep the old text.
     * @Discussion The text field calls this method whenever the user types a new character in the text field or deletes an existing
     *             character.
     */
    public boolean textFieldShouldChangeCharactersInRangeReplacementString(
        EditText textField, NSRange range, NSString string);

    /**
     * @Declaration : - (BOOL)textFieldShouldClear:(UITextField *)textField
     * @Description : Asks the delegate if the text field’s current contents should be removed.
     * @param textField The text field containing the text.
     * @return Return Value YES if the text field’s contents should be cleared; otherwise, NO.
     * @Discussion The text field calls this method in response to the user pressing the built-in clear button. (This button is not shown by
     *             default but can be enabled by changing the value in the clearButtonMode property of the text field.) This method is also
     *             called when editing begins and the clearsOnBeginEditing property of the text field is set to YES. Implementation of this
     *             method by the delegate is optional. If it is not present, the text is cleared as if this method had returned YES.
     */
    public boolean textFieldShouldClear(EditText textField);

    /**
     * @Declaration : - (BOOL)textFieldShouldReturn:(UITextField *)textField
     * @Description : Asks the delegate if the text field should process the pressing of the return button.
     * @param textField The text field whose return button was pressed.
     * @return Return Value YES if the text field should implement its default behavior for the return button; otherwise, NO.
     * @Discussion The text field calls this method whenever the user taps the return button. You can use this method to implement any
     *             custom behavior when the button is tapped.
     */
    public boolean textFieldShouldReturn(EditText textField);
}
