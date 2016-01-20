package com.myappconverter.uikit.util;

import android.content.pm.ActivityInfo;

import com.myappconverter.java.foundations.NSString;


public class UIKitEnums {
    public static final int UIWebViewNavigationTypeLinkClicked = 0;
    public static final int UIWebViewNavigationTypeFormSubmitted = 1;
    public static final int UIWebViewNavigationTypeBackForward = 2;
    public static final int UIWebViewNavigationTypeReload = 3;
    public static final int UIWebViewNavigationTypeFormResubmitted = 4;
    public static final int UIWebViewNavigationTypeOther = 5;
    public static final float SWITCH_DEFAULT_WIDTH = 145f;
    public static final float SWITCH_DEFAULT_HEIGHT = 40f;
    public final static int UIDataDetectorTypePhoneNumber = 1 << 0;
    public final static int UIDataDetectorTypeLink = 1 << 1;
    public final static int UIDataDetectorTypeAddress = 1 << 2;
    public final static int UIDataDetectorTypeCalendarEvent = 1 << 3;
    public final static int UIDataDetectorTypeNone = 0;
    public final static int UIDataDetectorTypeAll = Integer.MAX_VALUE;
    public final static NSString UIActivityTypePostToFacebook = new NSString(
            "UIActivityTypePostToFacebook");
    public final static NSString UIActivityTypePostToTwitter = new NSString(
            "UIActivityTypePostToTwitter");
    public final static NSString UIActivityTypePostToWeibo = new NSString(
            "UIActivityTypePostToWeibo");
    public final static NSString UIActivityTypeMessage = new NSString(
            "UIActivityTypeMessage");
    public final static NSString UIActivityTypeMail = new NSString(
            "UIActivityTypeMail");
    public final static NSString UIActivityTypePrint = new NSString(
            "UIActivityTypePrint");
    public final static NSString UIActivityTypeCopyToPasteboard = new NSString(
            "UIActivityTypeCopyToPasteboard");
    public final static NSString UIActivityTypeAssignToContact = new NSString(
            "UIActivityTypeAssignToContact");
    public final static NSString UIActivityTypeSaveToCameraRoll = new NSString(
            "UIActivityTypeSaveToCameraRoll");
    public final static NSString UIActivityTypeAddToReadingList = new NSString(
            "UIActivityTypeAddToReadingList");
    public final static NSString UIActivityTypePostToFlickr = new NSString(
            "UIActivityTypePostToFlickr");
    public final static NSString UIActivityTypePostToVimeo = new NSString(
            "UIActivityTypePostToVimeo");
    public final static NSString UIActivityTypePostToTencentWeibo = new NSString(
            "UIActivityTypePostToTencentWeibo");
    public final static NSString UIActivityTypeAirDrop = new NSString(
            "UIActivityTypeAirDrop");
    public static final NSString UIImagePickerControllerMediaType = new NSString(
            "UIImagePickerControllerMediaType");
    public static final NSString UIImagePickerControllerOriginalImage = new NSString(
            "UIImagePickerControllerOriginalImage");
    public static final NSString UIImagePickerControllerEditedImage = new NSString(
            "UIImagePickerControllerEditedImage");
    public static final NSString UIImagePickerControllerCropRect = new NSString(
            "UIImagePickerControllerCropRect");
    public static final NSString UIImagePickerControllerMediaURL = new NSString(
            "UIImagePickerControllerMediaURL");
    public static final NSString UIImagePickerControllerReferenceURL = new NSString(
            "UIImagePickerControllerReferenceURL");
    public static final NSString UIImagePickerControllerMediaMetadata = new NSString(
            "UIImagePickerControllerMediaMetadata");
    public static final NSString UIAccessibilityAnnouncementKeyStringValue = new NSString(
            "UIAccessibilityAnnouncementKeyStringValue");
    public static final NSString UIAccessibilityAnnouncementKeyWasSuccessful = new NSString(
            "UIAccessibilityAnnouncementKeyWasSuccessful");
    public static final NSString UIAccessibilitySpeechAttributePunctuation = new NSString(
            "UIAccessibilitySpeechAttributePunctuation");
    public static final NSString UIAccessibilitySpeechAttributeLanguage = new NSString(
            "UIAccessibilitySpeechAttributeLanguage");
    public static final NSString UIAccessibilitySpeechAttributePitch = new NSString(
            "UIAccessibilitySpeechAttributePitch");
    public static final NSString UIAccessibilityNotificationSwitchControlIdentifier =
        new NSString("UIAccessibilityNotificationSwitchControlIdentifier");
    public final static float UIWindowLevelNormal = 0.0f;
    public final static float UIWindowLevelAlert = 1.0f;
    public final static float UIWindowLevelStatusBar = 2.0f;

    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    //////////////////////UIKIT NOT ANNOTED/////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    public static NSString UIKeyboardFrameEndUserInfoKey;
    public static final NSString UIKeyboardAnimationCurveUserInfoKey = new NSString(
            "UIKeyboardAnimationCurveUserInfoKey");
    public static final NSString UIKeyboardCenterBeginUserInfoKey = new NSString(
            "UIKeyboardCenterBeginUserInfoKey");
    public static final NSString UIKeyboardCenterEndUserInfoKey = new NSString(
            "UIKeyboardCenterEndUserInfoKey");
    public static final NSString UIKeyboardBoundsUserInfoKey = new NSString(
            "UIKeyboardBoundsUserInfoKey");
    public static final NSString UIWindowDidBecomeVisibleNotification = new NSString(
            "UIWindowDidBecomeVisibleNotification");
    public static final NSString UIWindowDidBecomeHiddenNotification = new NSString(
            "UIWindowDidBecomeHiddenNotification");
    public static final NSString UIWindowDidBecomeKeyNotification = new NSString(
            "UIWindowDidBecomeKeyNotification");
    public static final NSString UIWindowDidResignKeyNotification = new NSString(
            "UIWindowDidResignKeyNotification");
    public static final NSString UIKeyboardWillShowNotification = new NSString(
            "UIKeyboardWillShowNotification");
    public static final NSString UIKeyboardDidShowNotification = new NSString(
            "UIKeyboardDidShowNotification");
    public static final NSString UIKeyboardWillHideNotification = new NSString(
            "UIKeyboardWillHideNotification");
    public static final NSString UIKeyboardDidHideNotification = new NSString(
            "UIKeyboardDidHideNotification");
    public static final NSString UIKeyboardWillChangeFrameNotification = new NSString(
            "UIKeyboardWillChangeFrameNotification");
    public static final NSString UIKeyboardDidChangeFrameNotification = new NSString(
            "UIKeyboardDidChangeFrameNotification");
    public static final NSString UIKeyboardAnimationDurationUserInfoKey = new NSString(
            "UIKeyboardAnimationDurationUserInfoKey");
    public static final NSString UILocalNotificationDefaultSoundName = new NSString(
            "UILocalNotificationDefaultSoundName");
    public static final NSString UITextViewTextDidBeginEditingNotification = new NSString(
            "UITextViewTextDidBeginEditingNotification");
    public static final NSString UITextFieldTextDidBeginEditingNotification = new NSString(
            "UITextFieldTextDidBeginEditingNotification");
    public final static NSString UIAccessibilityAnnouncementNotification = new NSString(
            "UIAccessibilityAnnouncementNotification");
    public final static NSString UIAccessibilityAnnouncementDidFinishNotification =
        new NSString("UIAccessibilityAnnouncementDidFinishNotification");
    public final static NSString UIAccessibilityBoldTextStatusDidChangeNotification =
        new NSString("UIAccessibilityBoldTextStatusDidChangeNotification");
    public final static NSString UIAccessibilityClosedCaptioningStatusDidChangeNotification =
        new NSString(
            "UIAccessibilityClosedCaptioningStatusDidChangeNotification");
    public final static NSString UIAccessibilityDarkerSystemColorsStatusDidChangeNotification =
        new NSString(
            "UIAccessibilityDarkerSystemColorsStatusDidChangeNotification");
    public final static NSString UIAccessibilityGrayscaleStatusDidChangeNotification =
        new NSString("UIAccessibilityGrayscaleStatusDidChangeNotification");
    public final static NSString UIAccessibilityGuidedAccessStatusDidChangeNotification =
        new NSString("UIAccessibilityGuidedAccessStatusDidChangeNotification");
    public final static NSString UIAccessibilityInvertColorsStatusDidChangeNotification =
        new NSString("UIAccessibilityInvertColorsStatusDidChangeNotification");
    public final static NSString UIAccessibilityLayoutChangedNotification = new NSString(
            "UIAccessibilityLayoutChangedNotification");
    public final static NSString UIAccessibilityMonoAudioStatusDidChangeNotification =
        new NSString("UIAccessibilityMonoAudioStatusDidChangeNotification");
    public final static NSString UIAccessibilityPageScrolledNotification = new NSString(
            "UIAccessibilityPageScrolledNotification");
    public final static NSString UIAccessibilityPauseAssistiveTechnologyNotification =
        new NSString("UIAccessibilityPauseAssistiveTechnologyNotification");
    public final static NSString UIAccessibilityReduceMotionStatusDidChangeNotification =
        new NSString("UIAccessibilityReduceMotionStatusDidChangeNotification");
    public final static NSString UIAccessibilityReduceTransparencyStatusDidChangeNotification =
        new NSString(
            "UIAccessibilityReduceTransparencyStatusDidChangeNotification");
    public final static NSString UIAccessibilityResumeAssistiveTechnologyNotification =
        new NSString("UIAccessibilityResumeAssistiveTechnologyNotification");
    public final static NSString UIAccessibilityScreenChangedNotification = new NSString(
            "UIAccessibilityScreenChangedNotification");
    public final static NSString UIAccessibilitySpeakScreenStatusDidChangeNotification =
        new NSString("UIAccessibilitySpeakScreenStatusDidChangeNotification");
    public final static NSString UIAccessibilitySpeakSelectionStatusDidChangeNotification =
        new NSString("UIAccessibilitySpeakSelectionStatusDidChangeNotification");
    public final static NSString UIAccessibilitySwitchControlStatusDidChangeNotification =
        new NSString("UIAccessibilitySwitchControlStatusDidChangeNotification");
    public final static NSString UIAccessibilityVoiceOverStatusChanged = new NSString(
            "UIAccessibilityVoiceOverStatusChanged");

    public static enum UICollectionViewScrollPosition {
        UICollectionViewScrollPositionNone(0),
        UICollectionViewScrollPositionTop(1 << 0),
        UICollectionViewScrollPositionCenteredVertically(1 << 1),
        UICollectionViewScrollPositionBottom(1 << 2),
        UICollectionViewScrollPositionLeft(1 << 3),
        UICollectionViewScrollPositionCenteredHorizontally(1 << 4),
        UICollectionViewScrollPositionRight(1 << 5);
        int value;

        private UICollectionViewScrollPosition(int v) {
            value = v;
        }

        public int getValue() {
            return value;
        }
    }

    public enum UIScrollViewIndicatorStyle {UIScrollViewIndicatorStyleDefault,
        UIScrollViewIndicatorStyleBlack,
        UIScrollViewIndicatorStyleWhite;
    }

    public enum UIScrollViewKeyboardDismissMode {
        UIScrollViewKeyboardDismissModeNone,
        UIScrollViewKeyboardDismissModeOnDrag,
        UIScrollViewKeyboardDismissModeInteractive;
    }

    public enum UIWebPaginationMode {UIWebPaginationModeUnpaginated,
        UIWebPaginationModeLeftToRight,
        UIWebPaginationModeTopToBottom,
        UIWebPaginationModeBottomToTop,
        UIWebPaginationModeRightToLeft;
        public int getValue() {
            return this.ordinal();
        }
    }

    public static enum UIDatePickerMode {UIDatePickerModeTime,
        UIDatePickerModeDate,
        UIDatePickerModeDateAndTime,
        UIDatePickerModeCountDownTimer;
    }

    public static enum UIAlertViewStyle {UIAlertViewStyleDefault,
        UIAlertViewStyleSecureTextInput,
        UIAlertViewStylePlainTextInput,
        UIAlertViewStyleLoginAndPasswordInput;
        public int getValue() {
            return this.ordinal();
        }
    }

    public static enum UIWebViewNavigationType {
        UIWebViewNavigationTypeLinkClicked,UIWebViewNavigationTypeFormSubmitted,
        UIWebViewNavigationTypeBackForward,
        UIWebViewNavigationTypeReload,
        UIWebViewNavigationTypeFormResubmitted,
        UIWebViewNavigationTypeOther;
    }

    public enum UIWebPaginationBreakingMode {UIWebPaginationBreakingModePage,
        UIWebPaginationBreakingModeColumn;
        public int getValue() {
            return this.ordinal();
        }
    }

    public enum UITabBarItemPositioning {UITabBarItemPositioningAutomatic,
        UITabBarItemPositioningFill,
        UITabBarItemPositioningCentered;
    }

    public static enum UITableViewStyle {UITableViewStylePlain,
        UITableViewStyleGrouped;
        public int getValue() {
            return this.ordinal();
        }
    }

    public static enum UITableViewCellEditingStyle {
        UITableViewCellEditingStyleNone,UITableViewCellEditingStyleDelete,
        UITableViewCellEditingStyleInsert;
        public int getValue() {
            return this.ordinal();
        }
    }

    public enum UIBaselineAdjustment {UIBaselineAdjustmentAlignBaselines,
        UIBaselineAdjustmentAlignCenters,
        UIBaselineAdjustmentNone;
    }

    public enum UIProgressViewStyle {UIProgressViewStyleDefault,
        UIProgressViewStyleBar;
        public int getValue() {
            return this.ordinal();
        }
    }

    public static enum UIActivityIndicatorViewStyle {
        UIActivityIndicatorViewStyleWhiteLarge,
        UIActivityIndicatorViewStyleWhite,UIActivityIndicatorViewStyleGray;
        public int getValue() {
            return this.ordinal();
        }
    }

    public enum UITextBorderStyle {UITextBorderStyleNone,
        UITextBorderStyleLine,
        UITextBorderStyleBezel,
        UITextBorderStyleRoundedRect;
        public int getValue() {
            return this.ordinal();
        }
    }

    public enum UITextFieldViewMode {UITextFieldViewModeNever,
        UITextFieldViewModeWhileEditing,
        UITextFieldViewModeUnlessEditing,
        UITextFieldViewModeAlways;
        public int getValue() {
            return this.ordinal();
        }
    }

    public static enum UIImageOrientation {
        /**
         * The default orientation of images. The image is drawn right-side up, as shown here. up orientation
         */
        UIImageOrientationUp,
        /**
        * The image is rotated 180 degrees, as shown here. down orientation<br>
        * 180 deg rotation
        */
        UIImageOrientationDown,
        /**
        * The image is rotated 90 degrees clockwise, as shown here. right orientation<br>
        * 90 deg CW
        */
        UIImageOrientationLeft,
        /**
        * The image is rotated 90 degrees counterclockwise, as shown here. left orientation<br>
        * 90 deg CCW
        */
        UIImageOrientationRight,
        /**
        * The image is drawn as a mirror version of an image drawn with the UIImageOrientationUp value. In other
        * words, the image is flipped along its horizontal axis, as shown here. up mirrored orientation <br>
        * as above but image mirrored along other axis. horizontal flip
        */
        UIImageOrientationUpMirrored,
        /**
        * The image is drawn as a mirror version of an image drawn with the UIImageOrientationDown value.
        * This is the equivalent to flipping an image in the up orientation along its horizontal axis and then rotating the image 180
        * degrees, as shown here. down mirrored orientation<br>
        * horizontal flip
        */
        UIImageOrientationDownMirrored,
        /**
        * The image is drawn as a mirror version of an image drawn with the UIImageOrientationLeft value.
        * This is the equivalent to flipping an image in the up orientation along its horizontal axis and then rotating the image 90
        * degrees counterclockwise, as shown here. left mirrored orientation<br>
        * vertical flip
        */
        UIImageOrientationLeftMirrored,
        /**
        * The image is drawn as a mirror version of an image drawn with the UIImageOrientationRight value.
        * This is the equivalent to flipping an image in the up orientation along its horizontal axis and then rotating the image 90
        * degrees clockwise, as shown here. right mirrored orientation<br>
        * vertical flip
        */
        UIImageOrientationRightMirrored;public int getValue() {
            return this.ordinal();
        }
    }

    public static enum UIButtonType {UIButtonTypeCustom,
        UIButtonTypeSystem,
        UIButtonTypeDetailDisclosure,
        UIButtonTypeInfoLight,
        UIButtonTypeInfoDark,
        UIButtonTypeContactAdd,
        UIButtonTypeRoundedRect;
        public int getValue() {
            return this.ordinal();
        }
    }

    public static enum UIInterfaceOrientation {
        UIInterfaceOrientationUnknown(UIDeviceOrientation.UIDeviceOrientationUnknown.ordinal()),
        UIInterfaceOrientationPortrait(UIDeviceOrientation.UIDeviceOrientationPortrait.ordinal()),
        UIInterfaceOrientationPortraitUpsideDown(UIDeviceOrientation.UIDeviceOrientationPortraitUpsideDown.ordinal()),
        UIInterfaceOrientationLandscapeLeft(UIDeviceOrientation.UIDeviceOrientationLandscapeRight.ordinal()),
        UIInterfaceOrientationLandscapeRight(UIDeviceOrientation.UIDeviceOrientationLandscapeLeft.ordinal());
        private long value;

        UIInterfaceOrientation(long v) {
            value = v;
        }

        public long getValue() {
            return value;
        }
    }

    public static enum UIControlState {UIControlStateNormal(0),
        UIControlStateHighlighted(1 << 0),
        UIControlStateDisabled(1 << 1),
        UIControlStateSelected(1 << 2),
        UIControlStateApplication(0x00FF0000),
        UIControlStateReserved(0xFF000000);

        private int value;

        UIControlState(int v) {
            value = v;
        }

        public int getValue() {
            return value;
        }
    }

    public static enum UIDeviceOrientation {UIDeviceOrientationUnknown,
        UIDeviceOrientationPortrait,
        UIDeviceOrientationPortraitUpsideDown,
        UIDeviceOrientationLandscapeLeft,
        UIDeviceOrientationLandscapeRight,
        UIDeviceOrientationFaceUp,
        UIDeviceOrientationFaceDown;
        public int getValue() {
            return this.ordinal();
        }
    }

    public static enum UITableViewCellStyle {UITableViewCellStyleDefault,
        UITableViewCellStyleValue1,
        UITableViewCellStyleValue2,
        UITableViewCellStyleSubtitle;
        public int getValue() {
            return this.ordinal();
        }
    }

    public enum UIModalPresentationStyle {UIModalPresentationFullScreen(0),
        UIModalPresentationPageSheet,
        UIModalPresentationFormSheet,
        UIModalPresentationCurrentContext,
        UIModalPresentationCustom,
        UIModalPresentationNone,
        UIModalPresentationOverFullScreen,
        UIModalPresentationOverCurrentContext,
        UIModalPresentationPopover(1);

        int value;

        private UIModalPresentationStyle(int value) {
            this.value = value;
        }

        UIModalPresentationStyle() {
            value = 0;
        }

        public int getValue() {
            return value;
        }
    }

    public enum UIModalTransitionStyle {UIModalTransitionStyleCoverVertical,
        UIModalTransitionStyleFlipHorizontal,
        UIModalTransitionStyleCrossDissolve,
        UIModalTransitionStylePartialCurl;
        public int getValue() {
            return this.ordinal();
        }
    }

    public enum UIBarMetrics {
        UIBarMetricsDefault(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED),
        UIBarMetricsLandscapePhone(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE),
        UIBarMetricsDefaultPrompt(101),UIBarMetricsLandscapePhonePrompt;

        int value;

        UIBarMetrics() {
        }

        UIBarMetrics(int v) {
            value = v;
        }
    }

    public static enum UIInterfaceOrientationMask {
        UIInterfaceOrientationMaskPortrait(1 << UIInterfaceOrientation.UIInterfaceOrientationPortrait.getValue()),
        UIInterfaceOrientationMaskLandscapeLeft(1 << UIInterfaceOrientation.UIInterfaceOrientationLandscapeLeft.getValue()),
        UIInterfaceOrientationMaskLandscapeRight(1 << UIInterfaceOrientation.UIInterfaceOrientationLandscapeRight.getValue()),
        UIInterfaceOrientationMaskPortraitUpsideDown(1 << UIInterfaceOrientation.UIInterfaceOrientationPortraitUpsideDown.getValue()),
        UIInterfaceOrientationMaskLandscape(UIInterfaceOrientationMaskLandscapeLeft.getValue() |
            UIInterfaceOrientationMaskLandscapeRight.getValue()),
        UIInterfaceOrientationMaskAll(UIInterfaceOrientationMaskPortrait.getValue() |
            UIInterfaceOrientationMaskLandscapeLeft.getValue() |
            UIInterfaceOrientationMaskLandscapeRight.getValue() |
            UIInterfaceOrientationMaskPortraitUpsideDown.getValue()),
        UIInterfaceOrientationMaskAllButUpsideDown(UIInterfaceOrientationMaskPortrait.getValue() |
            UIInterfaceOrientationMaskLandscapeLeft.getValue() |
            UIInterfaceOrientationMaskLandscapeRight.getValue());
        private int value;

        UIInterfaceOrientationMask(int v) {
            value = v;
        }

        public int getValue() {
            return value;
        }
    }

    public static enum UISegmentedControlStyle {UISegmentedControlStylePlain,
        UISegmentedControlStyleBordered,
        UISegmentedControlStyleBar,
        UISegmentedControlStyleBezeled;
    }

    public static enum NSTextAlignment {NSTextAlignmentLeft(0),
        NSTextAlignmentCenter(1),
        NSTextAlignmentRight(2),
        NSTextAlignmentJustified(3),
        NSTextAlignmentNatural(4),
        NSWritingDirectionNatural(-1),
        NSWritingDirectionLeftToRight(0),
        NSWritingDirectionRightToLeft(1);

        public int value;

        NSTextAlignment(int v) {
            value = v;
        }

        public int getValue() {
            return value;
        }
    }

    public static enum UISwipeGestureRecognizerDirection {
        UISwipeGestureRecognizerDirectionRight(1 << 0),
        UISwipeGestureRecognizerDirectionLeft(1 << 1),
        UISwipeGestureRecognizerDirectionUp(1 << 2),
        UISwipeGestureRecognizerDirectionDown(1 << 3);
        int value;

        UISwipeGestureRecognizerDirection(int v) {
            value = v;
        }

        public int getValue() {
            return value;
        }
    }

    public enum UITouchPhase {UITouchPhaseBegan,
        UITouchPhaseMoved,
        UITouchPhaseStationary,
        UITouchPhaseEnded,
        UITouchPhaseCancelled;
        public int getValue() {
            return this.ordinal();
        }
    }

    public enum UIScreenOverscanCompensation {UIScreenOverscanCompensationScale,
        UIScreenOverscanCompensationInsetBounds,
        UIScreenOverscanCompensationInsetApplicationFrame;
        public int getValue() {
            return this.ordinal();
        }
    }

    public static enum UIImageRenderingMode {
        /**
         * Use the default rendering mode for the context where the image is used.
         */
        UIImageRenderingModeAutomatic,
        /**
        * Always draw the original image, without treating it as a template.
        */
        UIImageRenderingModeAlwaysOriginal,
        /**
        * Always draw the image as a template image, ignoring its color information.
        */
        UIImageRenderingModeAlwaysTemplate,
        /**
        *
        */
        information;public int getValue() {
            return this.ordinal();
        }
    }

    public enum UITabBarSystemItem {UITabBarSystemItemMore,
        UITabBarSystemItemFavorites,
        UITabBarSystemItemFeatured,
        UITabBarSystemItemTopRated,
        UITabBarSystemItemRecents,
        UITabBarSystemItemContacts,
        UITabBarSystemItemHistory,
        UITabBarSystemItemBookmarks,
        UITabBarSystemItemSearch,
        UITabBarSystemItemDownloads,
        UITabBarSystemItemMostRecent,
        UITabBarSystemItemMostViewed;
        public int getValue() {
            return this.ordinal();
        }
    }

    public static enum UIBarStyle {UIBarStyleDefault,
        UIBarStyleBlack;
    }

    public static enum UIBarButtonItemStyle {UIBarButtonItemStylePlain,
        UIBarButtonItemStyleBordered,
        UIBarButtonItemStyleDone;
        public int getValue() {
            return this.ordinal();
        }
    }

    public static enum UIBarButtonSystemItem {UIBarButtonSystemItemDone,
        UIBarButtonSystemItemCancel,
        UIBarButtonSystemItemEdit,
        UIBarButtonSystemItemSave,
        UIBarButtonSystemItemAdd,
        UIBarButtonSystemItemFlexibleSpace,
        UIBarButtonSystemItemFixedSpace,
        UIBarButtonSystemItemCompose,
        UIBarButtonSystemItemReply,
        UIBarButtonSystemItemAction,
        UIBarButtonSystemItemOrganize,
        UIBarButtonSystemItemBookmarks,
        UIBarButtonSystemItemSearch,
        UIBarButtonSystemItemRefresh,
        UIBarButtonSystemItemStop,
        UIBarButtonSystemItemCamera,
        UIBarButtonSystemItemTrash,
        UIBarButtonSystemItemPlay,
        UIBarButtonSystemItemPause,
        UIBarButtonSystemItemRewind,
        UIBarButtonSystemItemFastForward,
        UIBarButtonSystemItemUndo,
        UIBarButtonSystemItemRedo,
        UIBarButtonSystemItemPageCurl;
        public int getValue() {
            return this.ordinal();
        }
    }

    public static enum UITableViewRowAnimation {UITableViewRowAnimationFade,
        UITableViewRowAnimationRight,
        UITableViewRowAnimationLeft,
        UITableViewRowAnimationTop,
        UITableViewRowAnimationBottom,
        UITableViewRowAnimationNone,
        UITableViewRowAnimationMiddle,
        UITableViewRowAnimationAutomatic(100);

        int value = 0;

        UITableViewRowAnimation() {
            value = ordinal();
        }

        UITableViewRowAnimation(int v) {
            value = v;
        }

        public int getValue() {
            return value;
        }
    }

    public static enum UITextAlignment {UITextAlignmentLeft,
        UITextAlignmentCenter,
        UITextAlignmentRight;

        int value;

        public int getValue() {
            return this.ordinal();
        }
    }

    public static enum UIUserInterfaceIdiom {
        UIUserInterfaceIdiomUnspecified(-1),UIUserInterfaceIdiomPhone(0),
        UIUserInterfaceIdiomPad(1);

        private int value;

        UIUserInterfaceIdiom(int v) {
            value = v;
        }

        public int getValue() {
            return value;
        }
    }

    public static enum UITableViewScrollPosition {UITableViewScrollPositionNone,
        UITableViewScrollPositionTop,
        UITableViewScrollPositionMiddle,
        UITableViewScrollPositionBottom;
        public int getValue() {
            return this.ordinal();
        }
    }

    public static enum UIDeviceBatteryState {UIDeviceBatteryStateUnknown,
        UIDeviceBatteryStateUnplugged,
        UIDeviceBatteryStateCharging,
        UIDeviceBatteryStateFull;
        public int getValue() {
            return this.ordinal();
        }
    }

    public static enum UIViewAnimationCurve {UIViewAnimationCurveEaseInOut,
        UIViewAnimationCurveEaseIn,
        UIViewAnimationCurveEaseOut,
        UIViewAnimationCurveLinear;
        public int getValue() {
            return this.ordinal();
        }
    }

    public static enum UIViewAnimationOptions {
        UIViewAnimationOptionLayoutSubviews(1 << 0),
        UIViewAnimationOptionAllowUserInteraction(1 << 1),
        UIViewAnimationOptionBeginFromCurrentState(1 << 2),
        UIViewAnimationOptionRepeat(1 << 3),
        UIViewAnimationOptionAutoreverse(1 << 4),
        UIViewAnimationOptionOverrideInheritedDuration(1 << 5),
        UIViewAnimationOptionOverrideInheritedCurve(1 << 6),
        UIViewAnimationOptionAllowAnimatedContent(1 << 7),
        UIViewAnimationOptionShowHideTransitionViews(1 << 8),
        UIViewAnimationOptionOverrideInheritedOptions(1 << 9),
        UIViewAnimationOptionCurveEaseInOut(0 << 16),
        UIViewAnimationOptionCurveEaseIn(1 << 16),
        UIViewAnimationOptionCurveEaseOut(2 << 16),
        UIViewAnimationOptionCurveLinear(3 << 16),
        UIViewAnimationOptionTransitionNone(0 << 20),
        UIViewAnimationOptionTransitionFlipFromLeft(1 << 20),
        UIViewAnimationOptionTransitionFlipFromRight(2 << 20),
        UIViewAnimationOptionTransitionCurlUp(3 << 20),
        UIViewAnimationOptionTransitionCurlDown(4 << 20),
        UIViewAnimationOptionTransitionCrossDissolve(5 << 20),
        UIViewAnimationOptionTransitionFlipFromTop(6 << 20),
        UIViewAnimationOptionTransitionFlipFromBottom(7 << 20);
        //
        public int value;

        private UIViewAnimationOptions(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    public static enum UIViewAnimationTransition {UIViewAnimationTransitionNone,
        UIViewAnimationTransitionFlipFromLeft,
        UIViewAnimationTransitionFlipFromRight,
        UIViewAnimationTransitionCurlUp,
        UIViewAnimationTransitionCurlDown;
        public int getValue() {
            return this.ordinal();
        }
    }

    public static enum UIViewAutoresizing {UIViewAutoresizingNone(0),
        UIViewAutoresizingFlexibleLeftMargin(1 << 0),
        UIViewAutoresizingFlexibleWidth(1 << 1),
        UIViewAutoresizingFlexibleRightMargin(1 << 2),
        UIViewAutoresizingFlexibleTopMargin(1 << 3),
        UIViewAutoresizingFlexibleHeight(1 << 4),
        UIViewAutoresizingFlexibleBottomMargin(1 << 5);

        int value;

        UIViewAutoresizing(int v) {
            value = v;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    public static enum UIViewContentMode {UIViewContentModeScaleToFill,
        UIViewContentModeScaleAspectFit,
        UIViewContentModeScaleAspectFill,
        UIViewContentModeRedraw,
        UIViewContentModeCenter,
        UIViewContentModeTop,
        UIViewContentModeBottom,
        UIViewContentModeLeft,
        UIViewContentModeRight,
        UIViewContentModeTopLeft,
        UIViewContentModeTopRight,
        UIViewContentModeBottomLeft,
        UIViewContentModeBottomRight;
        public int getValue() {
            return this.ordinal();
        }
    }

    public static enum UIRectCorner {UIRectCornerTopLeft(1 << 0),
        UIRectCornerTopRight(1 << 1),
        UIRectCornerBottomLeft(1 << 2),
        UIRectCornerBottomRight(1 << 3),
        UIRectCornerAllCorners(~0);

        int value;

        UIRectCorner(int v) {
            value = v;
        }

        public int getValue() {
            return value;
        }
    }

    public enum UIPopoverArrowDirection {UIPopoverArrowDirectionUp(1L << 0),
        UIPopoverArrowDirectionDown(1L << 1),
        UIPopoverArrowDirectionLeft(1L << 2),
        UIPopoverArrowDirectionRight(1L << 3),
        UIPopoverArrowDirectionAny((1L << 0) | (1L << 1) | (1L << 2) |
            (1L << 3)),UIPopoverArrowDirectionUnknown(Integer.MAX_VALUE);

        // integer max
        long value;

        private UIPopoverArrowDirection(long value) {
            this.value = value;
        }

        public long getValue() {
            return value;
        }
    }

    public static enum UIControlEvents {UIControlEventTouchDown(1 << 0),
        UIControlEventTouchDownRepeat(1 << 1),
        UIControlEventTouchDragInside(1 << 2),
        UIControlEventTouchDragOutside(1 << 3),
        UIControlEventTouchDragEnter(1 << 4),
        UIControlEventTouchDragExit(1 << 5),
        UIControlEventTouchUpInside(1 << 6),
        UIControlEventTouchUpOutside(1 << 7),
        UIControlEventTouchCancel(1 << 8),
        UIControlEventValueChanged(1 << 12),
        UIControlEventEditingDidBegin(1 << 16),
        UIControlEventEditingChanged(1 << 17),
        UIControlEventEditingDidEnd(1 << 18),
        UIControlEventEditingDidEndOnExit(1 << 19),
        UIControlEventAllTouchEvents(0x00000FFF),
        UIControlEventAllEditingEvents(0x000F0000),
        UIControlEventApplicationReserved(0x0F000000),
        UIControlEventSystemReserved(0xF0000000),
        UIControlEventAllEvents(0xFFFFFFFF);

        int value;

        UIControlEvents(int v) {
            value = v;
        }

        //
        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    public static enum UIControlContentVerticalAlignment {
        UIControlContentVerticalAlignmentCenter,
        UIControlContentVerticalAlignmentTop,
        UIControlContentVerticalAlignmentBottom,
        UIControlContentVerticalAlignmentFill;public int getValue() {
            return this.ordinal();
        }
    }

    public enum UIBarPosition {UIBarPositionAny(0),
        UIBarPositionBottom(1),
        UIBarPositionTop(2),
        UIBarPositionTopAttached(3);

        int value;

        UIBarPosition(int v) {
            value = v;
        }
    }

    public static enum UIControlContentHorizontalAlignment {
        UIControlContentHorizontalAlignmentCenter(0),
        UIControlContentHorizontalAlignmentLeft(1),
        UIControlContentHorizontalAlignmentRight(2),
        UIControlContentHorizontalAlignmentFill(3);
        int value;

        private UIControlContentHorizontalAlignment(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public enum UINavigationControllerOperation {
        UINavigationControllerOperationNone,UINavigationControllerOperationPush,
        UINavigationControllerOperationPop;
    }

    public static enum UIReturnKeyType {UIReturnKeyDefault,
        UIReturnKeyGo,
        UIReturnKeyGoogle,
        UIReturnKeyJoin,
        UIReturnKeyNext,
        UIReturnKeyRoute,
        UIReturnKeySearch,
        UIReturnKeySend,
        UIReturnKeyYahoo,
        UIReturnKeyDone,
        UIReturnKeyEmergencyCall;
        public int getValue() {
            return this.ordinal();
        }
    }

    public static enum UITableViewCellSeparatorStyle {
        UITableViewCellSeparatorStyleNone,
        UITableViewCellSeparatorStyleSingleLine,
        UITableViewCellSeparatorStyleSingleLineEtched;public int getValue() {
            return this.ordinal();
        }
    }

    public enum UIImagePickerControllerQualityType {
        UIImagePickerControllerQualityTypeHigh(0),
        UIImagePickerControllerQualityTypeMedium(1),
        UIImagePickerControllerQualityTypeLow(2),
        UIImagePickerControllerQualityType640x480(3),
        UIImagePickerControllerQualityTypeIFrame1280x720(4),
        UIImagePickerControllerQualityTypeIFrame960x540(5);
        int value = 0;

        UIImagePickerControllerQualityType() {
            value = ordinal();
        }

        UIImagePickerControllerQualityType(int v) {
            value = v;
        }

        public int getValue() {
            return value;
        }
    }

    public static enum UICollectionElementCategory {
        UICollectionElementCategoryCell,
        UICollectionElementCategorySupplementaryView,
        UICollectionElementCategoryDecorationView;public int getValue() {
            return ordinal();
        }
    }

    public static enum UIAccessibilityTraits {UIAccessibilityTraitNone(0),
        UIAccessibilityTraitButton(1),
        UIAccessibilityTraitLink(2),
        UIAccessibilityTraitSearchField(1024),
        UIAccessibilityTraitImage(4),
        UIAccessibilityTraitSelected(8),
        UIAccessibilityTraitPlaysSound(16),
        UIAccessibilityTraitKeyboardKey(32),
        UIAccessibilityTraitStaticText(64),
        UIAccessibilityTraitSummaryElement(128),
        UIAccessibilityTraitNotEnabled(256),
        UIAccessibilityTraitUpdatesFrequently(512),
        UIAccessibilityTraitStartsMediaSession(2048),
        UIAccessibilityTraitAdjustable(4096),
        UIAccessibilityTraitAllowsDirectInteraction(8192),
        UIAccessibilityTraitCausesPageTurn(16384),
        UIAccessibilityTraitHeader(65536);

        long value;

        UIAccessibilityTraits(long value) {
            this.value = value;
        }

        public long getValue() {
            return value;
        }
    }

    public static enum UIAccessibilityZoomType {
        UIAccessibilityZoomTypeInsertionPoint;
    }

    public static enum UIAccessibilityNotifications {
        UIAccessibilityNotifications(0);
        long value;

        UIAccessibilityNotifications(long value) {
            this.value = value;
        }

        public long getValue() {
            return value;
        }
    }

    public static enum UIAccessibilityNavigationStyle {
        UIAccessibilityNavigationStyleAutomatic(0),
        UIAccessibilityNavigationStyleSeparate(1),
        UIAccessibilityNavigationStyleCombined(2);
        long value;

        UIAccessibilityNavigationStyle(long value) {
            this.value = value;
        }

        public long getValue() {
            return value;
        }
    }

    public static enum NSLineBreakMode {NSLineBreakByWordWrapping,
        NSLineBreakByCharWrapping,
        NSLineBreakByClipping,
        NSLineBreakByTruncatingHead,
        NSLineBreakByTruncatingTail,
        NSLineBreakByTruncatingMiddle;
        public int getValue() {
            return ordinal();
        }
    }

    public static enum NSWritingDirection {NSWritingDirectionNatural(-1),
        NSWritingDirectionLeftToRight(0),
        NSWritingDirectionRightToLeft(1);

        int value;

        NSWritingDirection(int v) {
            value = v;
        }

        public int getValue() {
            return ordinal();
        }
    }

    public static enum UICollectionViewScrollDirection {
        UICollectionViewScrollDirectionVertical,
        UICollectionViewScrollDirectionHorizontal;public int getValue() {
            return ordinal();
        }
    }

    public static enum UIAlertActionStyle {UIAlertActionStyleDefault,
        UIAlertActionStyleCancel,
        UIAlertActionStyleDestructive;
        public int getValue() {
            return ordinal();
        }
    }

    public static enum UIAlertControllerStyle {
        UIAlertControllerStyleActionSheet,UIAlertControllerStyleAlert;
        public int getValue() {
            return ordinal();
        }
    }

    public static enum UIUserInterfaceSizeClass {
        UIUserInterfaceSizeClassUnspecified(0),
        UIUserInterfaceSizeClassCompact(1),UIUserInterfaceSizeClassRegular(2);

        int value;

        UIUserInterfaceSizeClass(int v) {
            value = v;
        }
    }

    public static enum UIActivityCategory {UIActivityCategoryAction,
        UIActivityCategoryShare;
        public int getValue() {
            return ordinal();
        }
    }

    public static enum NSTextStorageEditActions {
        NSTextStorageEditedAttributes(1 << 0),
        NSTextStorageEditedCharacters(1 << 1);
        int value;

        NSTextStorageEditActions(int v) {
            value = v;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int v) {
            value = v;
        }
    }

    public static enum UIGestureRecognizerState {
        UIGestureRecognizerStatePossible,UIGestureRecognizerStateBegan,
        UIGestureRecognizerStateChanged,
        UIGestureRecognizerStateEnded,
        UIGestureRecognizerStateCancelled,
        UIGestureRecognizerStateFailed,
        UIGestureRecognizerStateRecognized;
        public int getValue() {
            return this.ordinal();
        }
    }

    public static enum UIToolbarPosition {UIToolbarPositionAny(0),
        UIToolbarPositionBottom(1),
        UIToolbarPositionTop(2);

        int value;

        private UIToolbarPosition(int v) {
            value = v;
        }

        public int getValue() {
            return value;
        }
    }

    public static enum UITextLayoutDirection {UITextLayoutDirectionRight,
        UITextLayoutDirectionLeft,
        UITextLayoutDirectionUp,
        UITextLayoutDirectionDown;
    }

    public static enum UITextWritingDirection {
        UITextWritingDirectionNatural(-1),UITextWritingDirectionLeftToRight(0),
        UITextWritingDirectionRightToLeft(1);

        int value;

        private UITextWritingDirection(int v) {
            value = v;
        }

        public int getValue() {
            return value;
        }
    }

    public static enum UITextStorageDirection {UITextStorageDirectionForward(0),
        UITextStorageDirectionBackward(1);

        int value;

        private UITextStorageDirection(int v) {
            value = v;
        }

        public int getValue() {
            return value;
        }
    }

    public static enum UILayoutPriority {UILayoutPriorityRequired(1000),
        UILayoutPriorityDefaultHigh(750),
        UILayoutPriorityDefaultLow(250),
        UILayoutPriorityFittingSizeLevel(50);

        int value;

        private UILayoutPriority(int v) {
            value = v;
        }

        public int getValue() {
            return value;
        }
    }

    public static enum NSLayoutAttribute {NSLayoutAttributeLeft,
        NSLayoutAttributeRight,
        NSLayoutAttributeTop,
        NSLayoutAttributeBottom,
        NSLayoutAttributeLeading,
        NSLayoutAttributeTrailing,
        NSLayoutAttributeWidth,
        NSLayoutAttributeHeight,
        NSLayoutAttributeCenterX,
        NSLayoutAttributeCenterY,
        NSLayoutAttributeBaseline,
        NSLayoutAttributeLastBaseline,
        NSLayoutAttributeFirstBaseline,
        NSLayoutAttributeLeftMargin,
        NSLayoutAttributeRightMargin,
        NSLayoutAttributeTopMargin,
        NSLayoutAttributeBottomMargin,
        NSLayoutAttributeLeadingMargin,
        NSLayoutAttributeTrailingMargin,
        NSLayoutAttributeCenterXWithinMargins,
        NSLayoutAttributeCenterYWithinMargins,
        NSLayoutAttributeNotAnAttribute;
    }

    public static enum UIApplicationState {UIApplicationStateActive,
        UIApplicationStateInactive,

        UIApplicationStateBackground //
        ;
    }

    public static enum UIStatusBarAnimation {UIStatusBarAnimationNone,
        UIStatusBarAnimationFade,
        UIStatusBarAnimationSlide;
        public long getValue() {
            return ordinal();
        }
    }

    public static enum UIRemoteNotificationType {
        UIRemoteNotificationTypeNone(0),UIRemoteNotificationTypeBadge(1 << 0),
        UIRemoteNotificationTypeSound(1 << 1),
        UIRemoteNotificationTypeAlert(1 << 2),
        UIRemoteNotificationTypeNewsstandContentAvailability(1 << 3);

        int value;

        UIRemoteNotificationType(int v) {
            value = v;
        }

        public int getValue() {
            return value;
        }
    }

    public static enum UIStatusBarStyle {UIStatusBarStyleDefault,
        UIStatusBarStyleLightContent,
        UIStatusBarStyleBlackTranslucent,
        UIStatusBarStyleBlackOpaque;
        public int getValue() {
            return this.ordinal();
        }
    }

    public static enum UIUserInterfaceLayoutDirection {
        UIUserInterfaceLayoutDirectionLeftToRight,
        UIUserInterfaceLayoutDirectionRightToLeft;public int getValue() {
            return this.ordinal();
        }
    }

    public enum UIEventSubtype {UIEventSubtypeNone(0),
        UIEventSubtypeMotionShake(1),
        UIEventSubtypeRemoteControlPlay(100),
        UIEventSubtypeRemoteControlPause(101),
        UIEventSubtypeRemoteControlStop(102),
        UIEventSubtypeRemoteControlTogglePlayPause(103),
        UIEventSubtypeRemoteControlNextTrack(104),
        UIEventSubtypeRemoteControlPreviousTrack(105),
        UIEventSubtypeRemoteControlBeginSeekingBackward(106),
        UIEventSubtypeRemoteControlEndSeekingBackward(107),
        UIEventSubtypeRemoteControlBeginSeekingForward(108),
        UIEventSubtypeRemoteControlEndSeekingForward(109);

        int value;

        UIEventSubtype(int v) {
            value = v;
        }

        public int getValue() {
            return value;
        }
    }

    public enum UIEventType {UIEventTypeTouches,
        UIEventTypeMotion,
        UIEventTypeRemoteControl;
        public int getValue() {
            return this.ordinal();
        }
    }

    public enum UIImagePickerControllerSourceType {
        UIImagePickerControllerSourceTypePhotoLibrary,
        UIImagePickerControllerSourceTypeCamera,
        UIImagePickerControllerSourceTypeSavedPhotosAlbum;
    }

    public enum UIImagePickerControllerCameraCaptureMode {
        UIImagePickerControllerCameraCaptureModePhoto,
        UIImagePickerControllerCameraCaptureModeVideo;public int getValue() {
            return this.ordinal();
        }
    }

    public enum UIImagePickerControllerCameraDevice {
        UIImagePickerControllerCameraDeviceRear,
        UIImagePickerControllerCameraDeviceFront;public int getValue() {
            return this.ordinal();
        }
    }

    public enum UIImagePickerControllerCameraFlashMode {
        UIImagePickerControllerCameraFlashModeOff(-1),
        UIImagePickerControllerCameraFlashModeAuto(0),
        UIImagePickerControllerCameraFlashModeOn(1);
        int value = 0;

        UIImagePickerControllerCameraFlashMode() {
            value = ordinal();
        }

        UIImagePickerControllerCameraFlashMode(int v) {
            value = v;
        }

        public int getValue() {
            return value;
        }
    }
}
