package com.myappconverter.uikit.bridges.protocols;

import android.widget.EditText;

import com.myappconverter.java.foundations.NSRange;
import com.myappconverter.java.foundations.NSString;
import com.myappconverter.java.foundations.NSURL;


public interface UITextViewDelegate {
    public boolean textViewShouldChangeTextInRangeReplacementText(
        EditText editText, NSRange range, NSString text);

    /**
     * @Declaration : - (BOOL)textView:(UITextView *)textView shouldInteractWithTextAttachment:(NSTextAttachment *)textAttachment
     *              inRange:(NSRange)characterRange
     * @Description : Asks the delegate if the specified text view should allow user interaction with the provided text attachment in the
     *              given range of text.
     * @param textView The text view containing the text attachment.
     * @param textAttachment The text attachment.
     * @param characterRange The character range containing the text attachment.
     * @return Return Value YES if interaction with the text attachment should be allowed; NO if interaction should not be allowed.
     * @Discussion The text view calls this method if the user taps or long-presses the text attachment and its image property is not nil.
     *             Implementation of this method is optional. You can use this method to trigger an action in addition to displaying the
     *             text attachment inline with the text.
     **/
    public boolean textViewShouldInteractWithTextAttachmentInRange(
        EditText editText, Object textAttachment, NSRange characterRange);

    /**
     * @Declaration : - (BOOL)textView:(UITextView *)textView shouldInteractWithURL:(NSURL *)URL inRange:(NSRange)characterRange
     * @Description : Asks the delegate if the specified text view should allow user interaction with the given URL in the given range of
     *              text.
     * @param textView The text view containing the text attachment.
     * @param URL The URL to be processed.
     * @param characterRange The character range containing the URL.
     * @return Return Value YES if interaction with the URL should be allowed; NO if interaction should not be allowed.
     * @Discussion The text view calls this method if the user taps or long-presses the URL link. Implementation of this method is optional.
     *             By default, the text view opens the application responsible for handling the URL type and passes it the URL. You can use
     *             this method to trigger an alternative action, such as displaying the web content at the URL in a web view within the
     *             current application. Important: Links in text views are interactive only if the text view is selectable but noneditable.
     *             That is, if the value of the UITextView selectable property is YES and the isEditable property is NO.
     **/
    public boolean textViewShouldInteractWithURLInRange(EditText editText,
        NSURL URL, NSRange characterRange);

    /**
     * @Declaration : - (void)textViewDidBeginEditing:(UITextView *)textView
     * @Description : Tells the delegate that editing of the specified text view has begun.
     * @param textView The text view in which editing began.
     * @Discussion Implementation of this method is optional. A text view sends this message to its delegate immediately after the user
     *             initiates editing in a text view and before any changes are actually made. You can use this method to set up any
     *             editing-related data structures and generally prepare your delegate to receive future editing messages.
     **/
    public void textViewDidBeginEditing(EditText editText);

    /**
     * @Declaration : - (void)textViewDidChange:(UITextView *)textView
     * @Description : Tells the delegate that the text or attributes in the specified text view were changed by the user.
     * @param textView The text view containing the changes.
     * @Discussion The text view calls this method in response to user-initiated changes to the text. This method is not called in response
     *             to programmatically initiated changes. Implementation of this method is optional.
     **/
    public void textViewDidChange(EditText editText);

    /**
     * @Declaration : - (void)textViewDidChangeSelection:(UITextView *)textView
     * @Description : Tells the delegate that the text selection changed in the specified text view.
     * @param textView The text view whose selection changed.
     * @Discussion Implementation of this method is optional. You can use the selectedRange property of the text view to get the new
     *             selection.
     **/
    public void textViewDidChangeSelection(EditText editText);

    /**
     * @Declaration : - (void)textViewDidEndEditing:(UITextView *)textView
     * @Description : Tells the delegate that editing of the specified text view has ended.
     * @param textView The text view in which editing ended.
     * @Discussion Implementation of this method is optional. A text view sends this message to its delegate after it closes out any pending
     *             edits and resigns its first responder status. You can use this method to tear down any data structures or change any
     *             state information that you set when editing began.
     **/
    public void textViewDidEndEditing(EditText editText);

    /**
     * @Declaration : - (BOOL)textViewShouldBeginEditing:(UITextView *)textView
     * @Description : Asks the delegate if editing should begin in the specified text view.
     * @param textView The text view for which editing is about to begin.
     * @return Return Value YES if an editing session should be initiated; otherwise, NO to disallow editing.
     * @Discussion When the user performs an action that would normally initiate an editing session, the text view calls this method first
     *             to see if editing should actually proceed. In most circumstances, you would simply return YES from this method to allow
     *             editing to proceed. Implementation of this method by the delegate is optional. If it is not present, editing proceeds as
     *             if this method had returned YES.
     **/
    public boolean textViewShouldBeginEditing(EditText editText);

    /**
     * @Declaration : - (BOOL)textViewShouldEndEditing:(UITextView *)textView
     * @Description : Asks the delegate if editing should stop in the specified text view.
     * @param textView The text view for which editing is about to end.
     * @return Return Value YES if editing should stop; otherwise, NO if the editing session should continue
     * @Discussion This method is called when the text view is asked to resign the first responder status. This might occur when the user
     *             tries to change the editing focus to another control. Before the focus actually changes, however, the text view calls
     *             this method to give your delegate a chance to decide whether it should. Normally, you would return YES from this method
     *             to allow the text view to resign the first responder status. You might return NO, however, in cases where your delegate
     *             wants to validate the contents of the text view. By returning NO, you could prevent the user from switching to another
     *             control until the text view contained a valid value. Be aware that this method provides only a recommendation about
     *             whether editing should end. Even if you return NO from this method, it is possible that editing might still end. For
     *             example, this might happen when the text view is forced to resign the first responder status by being removed from its
     *             parent view or window. Implementation of this method by the delegate is optional. If it is not present, the first
     *             responder status is resigned as if this method had returned YES.
     **/
    public boolean textViewShouldEndEditing(EditText editText);
}
