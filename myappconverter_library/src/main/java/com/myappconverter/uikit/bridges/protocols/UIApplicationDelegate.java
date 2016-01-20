package com.myappconverter.uikit.bridges.protocols;

import android.view.ViewGroup;

import com.myappconverter.java.coregraphics.CGRect;
import com.myappconverter.java.foundations.NSArray;
import com.myappconverter.java.foundations.NSCoder;
import com.myappconverter.java.foundations.NSData;
import com.myappconverter.java.foundations.NSDictionary;
import com.myappconverter.java.foundations.NSError;
import com.myappconverter.java.foundations.NSString;
import com.myappconverter.java.foundations.NSURL;

import com.myappconverter.uikit.myappclasses.MyAppApplication;
import com.myappconverter.uikit.myappclasses.MyAppController;
import com.myappconverter.uikit.myappclasses.MyAppWindow;
import com.myappconverter.uikit.util.UIKitEnums.UIInterfaceOrientation;


public interface UIApplicationDelegate {
    // 1

    /**
     * @param application       The delegating application object.
     * @param oldStatusBarFrame The previous frame of the status bar, in screen coordinates.
     * @Signature: application:didChangeStatusBarFrame:
     * @Declaration : - (void)application:(MyAppApplication *)application didChangeStatusBarFrame:(CGRect)oldStatusBarFrame
     * @Description : Tells the delegate when the frame of the status bar has changed.
     * @Discussion After calling this method, the application also posts a UIApplicationDidChangeStatusBarFrameNotification notification to
     * give interested objects a chance to respond to the change.
     **/
    public void applicationDidChangeStatusBarFrame(
        MyAppApplication application, CGRect oldStatusBarFrame);

    // 2

    /**
     * @param application             The delegating application object.
     * @param oldStatusBarOrientation A constant that indicates the previous orientation of the application?s user interface; see
     *                                ?Monitoring App State Changes? for details.
     * @Signature: application:didChangeStatusBarOrientation:
     * @Declaration : - (void)application:(MyAppApplication *)application
     * didChangeStatusBarOrientation:(UIInterfaceOrientation)oldStatusBarOrientation
     * @Description : Tells the delegate when the interface orientation of the status bar has changed.
     * @Discussion The delegate can get the current device orientation from the shared UIDevice object. After calling this method, the
     * application also posts a UIApplicationDidChangeStatusBarOrientationNotification notification to give interested objects a
     * chance to respond to the change.
     **/
    public void applicationDidChangeStatusBarOrientation(
        MyAppApplication application);

    // 3

    /**
     * @param application The delegating application object.
     * @param coder       The keyed archiver containing the app?s previously saved state information.
     * @Signature: application:didDecodeRestorableStateWithCoder:
     * @Declaration : - (void)application:(MyAppApplication *)application didDecodeRestorableStateWithCoder:(NSCoder *)coder
     * @Description : Tells your delegate to restore any high-level state information as part of the state restoration process.
     * @Discussion The state restoration system calls this method as the final step in the state restoration process. By the time this
     * method is called, all other restorable objects will have been restored and put back into their previous state. You can
     * use this method to read any high-level app data you saved in the application:willEncodeRestorableStateWithCoder: method
     * and apply it to your app.
     **/
    public void applicationDidDecodeRestorableStateWithCoder(
        MyAppApplication application, NSCoder coder);

    // 4

    /**
     * @param application The application that initiated the remote-notification registration process.
     * @param error       An NSError object that encapsulates information why registration did not succeed. The application can choose to display
     *                    this information to the user.
     * @Signature: application:didFailToRegisterForRemoteNotificationsWithError:
     * @Declaration : - (void)application:(MyAppApplication *)application didFailToRegisterForRemoteNotificationsWithError:(NSError *)error
     * @Description : Sent to the delegate when Apple Push Service cannot successfully complete the registration process.
     * @Discussion The delegate receives this message after the registerForRemoteNotificationTypes: method of MyAppApplication is invoked
     * and there is an error in the registration process. For more information about how to implement push notifications in your
     * application, see Local and Push Notification Programming Guide.
     **/
    public void applicationDidFailToRegisterForRemoteNotificationsWithError(
        MyAppApplication application, NSError error);

    // 5

    /**
     * @param application   The delegating application object.
     * @param launchOptions A dictionary indicating the reason the application was launched (if any). The contents of this dictionary may be
     *                      empty in situations where the user launched the application directly. For information about the possible keys in this
     *                      dictionary and how to handle them, see ?Launch Options Keys?.
     * @return Return Value NO if the application cannot handle the URL resource, otherwise return YES. The return value is ignored if the
     * application is launched as a result of a remote notification.
     * @Signature: application:didFinishLaunchingWithOptions:
     * @Declaration : - (BOOL)application:(MyAppApplication *)application didFinishLaunchingWithOptions:(NSDictionary *)launchOptions
     * @Description : Tells the delegate that the launch process is almost done and the app is almost ready to run.
     * @Discussion You should use this method (and the corresponding application:willFinishLaunchingWithOptions: method) to complete your
     * app?s initialization and make any final tweaks. This method is called after state restoration has occurred but before
     * your app?s window and other UI have been presented. At some point after this method returns, the system calls another of
     * your app delegate?s methods to move the app to the active (foreground) state or the background state. This method
     * represents your last chance to process any keys in the launchOptions dictionary. If you did not evaluate the keys in your
     * application:willFinishLaunchingWithOptions: method, you should look at them in this method and provide an appropriate
     * response. Objects that are not the application delegate can access the same launchOptions dictionary values by observing
     * the notification named UIApplicationDidFinishLaunchingNotification and accessing the notification?s userInfo dictionary.
     * That notification is sent shortly after this method returns. Important:?For app initialization, it is highly recommended
     * that you use this method and the application:willFinishLaunchingWithOptions: method and do not use the
     * applicationDidFinishLaunching: method, which is intended only for apps that run on older versions of iOS. The return
     * result from this method is combined with the return result from the application:willFinishLaunchingWithOptions: method to
     * determine if a URL should be handled. If either method returns NO, the URL is not handled. If you do not implement one of
     * the methods, only the return value of the implemented method is considered.
     **/
    public boolean applicationDidFinishLaunchingWithOptions(
        MyAppApplication application, NSDictionary launchOptions);

    // 6

    /**
     * @param application  The application that received the local notification.
     * @param notification A local notification that encapsulates details about the notification, potentially including custom data.
     * @Signature: application:didReceiveLocalNotification:
     * @Declaration : - (void)application:(MyAppApplication *)application didReceiveLocalNotification:(UILocalNotification *)notification
     * @Description : Sent to the delegate when a running application receives a local notification.
     * @Discussion Local notifications are similar to remote push notifications, but differ in that they are scheduled, displayed, and
     * received entirely on the same device. An application can create and schedule a local notification, and the operating
     * system then delivers it at the schedule date and time. If it delivers it when the application is not active in the
     * foreground, it displays an alert, badges the application icon, or plays a sound?whatever is specified in the
     * UILocalNotification object. If the application is running in the foreground, there is no alert, badging, or sound;
     * instead, the application:didReceiveLocalNotification: method is called if the delegate implements it. The delegate can
     * implement this method if it wants to be notified that a local notification occurred. For example, if the application is a
     * calendar application, it can enumerate its list of calendar events to determine which ones have due dates that have
     * transpired or are about to transpire soon. It can also reset the application icon badge number, and it can access any
     * custom data in the local-notification object?s userInfo dictionary. This method is called after the
     * application:didFinishLaunchingWithOptions: method (if that method is implemented).
     **/
    public void applicationDidReceiveLocalNotification(
        MyAppApplication application, Object notification);

    // 7

    /**
     * @param application The application that received the remote notification.
     * @param userInfo    A dictionary that contains information related to the remote notification, potentially including a badge number for
     *                    the application icon, an alert sound, an alert message to display to the user, a notification identifier, and custom data.
     *                    The provider originates it as a JSON-defined dictionary that iOS converts to an NSDictionary object; the dictionary may
     *                    contain only property-list objects plus NSNull.
     * @Signature: application:didReceiveRemoteNotification:
     * @Declaration : - (void)application:(MyAppApplication *)application didReceiveRemoteNotification:(NSDictionary *)userInfo
     * @Description : Tells the delegate that the running application received a remote notification.
     * @Discussion If the app is running and receives a remote notification, the app calls this method to process the notification. Your
     * implementation of this method should use the notification to take an appropriate course of action. For example, you could
     * use it as a signal to connect to a server and download the data waiting that is waiting for the app. The userInfo
     * dictionary contains the aps key whose value is another dictionary. Although you should not need the information in the
     * aps dictionary, you can retrieve its contents using the following keys: alert?The value is either a string for the alert
     * message or a dictionary with two keys: body and show-view. The value of the body key is a string containing the alert
     * message and the value of the show-view key is a Boolean. If the value of the show-view key is false, the alert?s View
     * button is not shown. The default is to show the View button which, if the user taps it, launches the application. badge?A
     * number indicating the quantity of data items to download from the provider. This number is to be displayed on the
     * application icon. The absence of a badge property indicates that any number currently badging the icon should be removed.
     * sound?The name of a sound file in the application bundle to play as an alert sound. If ?default? is specified, the
     * default sound should be played. The userInfo dictionary may also have custom data defined by the provider according to
     * the JSON schema. The properties for custom data should be specified at the same level as the aps dictionary. However,
     * custom-defined properties should not be used for mass data transport because there is a strict size limit per
     * notification (256 bytes) and delivery is not guaranteed. If the app is not running when a push notification arrives, the
     * method launches the app and provides the appropriate information in the launch options dictionary. The app does not call
     * this method to handle that push notification. Instead, your implementation of the
     * application:willFinishLaunchingWithOptions: or application:didFinishLaunchingWithOptions: method needs to get the push
     * notification payload data and respond appropriately. For more information about how to implement push notifications in
     * your application, see Local and Push Notification Programming Guide.
     **/
    public void applicationDidReceiveRemoteNotification(
        MyAppApplication application, NSDictionary userInfo);

    // 8

    /**
     * @param application The application that initiated the remote-notification registration process.
     * @param deviceToken A token that identifies the device to APS. The token is an opaque data type because that is the form that the
     *                    provider needs to submit to the APS servers when it sends a notification to a device. The APS servers require a binary
     *                    format for performance reasons. Note that the device token is different from the uniqueIdentifier property of UIDevice
     *                    because, for security and privacy reasons, it must change when the device is wiped.
     * @Signature: application:didRegisterForRemoteNotificationsWithDeviceToken:
     * @Declaration : - (void)application:(MyAppApplication *)application didRegisterForRemoteNotificationsWithDeviceToken:(NSData
     * *)deviceToken
     * @Description : Tells the delegate that the application successfully registered with Apple Push Service (APS).
     * @Discussion The delegate receives this message after the registerForRemoteNotificationTypes: method of MyAppApplication is invoked
     * and there is no error in the registration process. After receiving the device token, the application should connect with
     * its provider and give the token to it. APS only pushes notifications to the application?s device that are accompanied
     * with this token. This method could be called in other rare circumstances, such as when the user launches an application
     * after having restored a device from data that is not the device?s backup data. In this exceptional case, the application
     * won?t know the new device?s token until the user launches it. For more information about how to implement push
     * notifications in your application, see Local and Push Notification Programming Guide.
     **/
    public void applicationDidRegisterForRemoteNotificationsWithDeviceToken(
        MyAppApplication application, NSData deviceToken);

    // 9

    /**
     * @param application The application object.
     * @param url         A object representing a URL (Universal Resource Locator). See the appendix of iOS App Programming Guide for
     *                    Apple-registered schemes for URLs.
     * @return Return Value YES if the delegate successfully handled the request; NO if the attempt to handle the URL failed.
     * @Signature: application:handleOpenURL:
     * @Declaration : - (BOOL)application:(MyAppApplication *)application handleOpenURL:(NSURL *)url
     * @Description : Asks the delegate to open a resource identified by URL. (Deprecated. Use
     * application:openURL:sourceApplication:annotation: instead of this method to open URL resources.)
     * @Discussion If the delegate also implements the application:openURL:sourceApplication:annotation: method, that method is called
     * instead of this one. This method is not called if the delegate returns NO from both the
     * application:willFinishLaunchingWithOptions: and application:didFinishLaunchingWithOptions: methods. (If only one of the
     * two methods is implemented, its return value determines whether this method is called.) If your application implements
     * the applicationDidFinishLaunching: method instead of application:didFinishLaunchingWithOptions:, this method is called to
     * open the specified URL after the application has been initialized. If a URL arrives while your application is suspended
     * or running in the background, the system moves your application to the foreground prior to calling this method. There is
     * no equivalent notification for this delegation method.
     **/
    public void applicationHandleOpenURL(MyAppApplication application, NSURL url);

    // 10

    /**
     * @param application       The application object.
     * @param url               A object representing a URL (Universal Resource Locator). See Apple URL Scheme Reference for Apple-registered schemes for
     *                          URLs.
     * @param sourceApplication The bundle ID of the application that is requesting your application to open the URL (url).
     * @param annotation        A property-list object supplied by the source application to communicate information to the receiving application.
     * @return Return Value YES if the delegate successfully handled the request; NO if the attempt to open the URL resource failed.
     * @Signature: application:openURL:sourceApplication:annotation:
     * @Declaration : - (BOOL)application:(MyAppApplication *)application openURL:(NSURL *)url sourceApplication:(NSString
     * *)sourceApplication annotation:(id)annotation
     * @Description : Asks the delegate to open a resource identified by URL.
     * @Discussion Your implementation of this method should open the specified URL and update its user interface accordingly. The URL
     * resource can be a network resource or a file to open. If your app had to be launched to open the URL, the app calls the
     * application:willFinishLaunchingWithOptions: and application:didFinishLaunchingWithOptions: methods first, followed by
     * this method. The return values of those methods can be used to prevent this method from being called. (If the application
     * is already running, only this method is called.) If the URL refers to a file that was opened through a document
     * interaction controller, the annotation parameter may contain additional data that the source application wanted to send
     * along with the URL. The format of this data is defined by the application that sent it but the data must consist of
     * objects that can be put into a property list. The app prefers calling this method over the application:handleOpenURL:
     * method. You should implement the application:handleOpenURL: method only if you need to support older versions of iOS.
     * There is no matching notification for this method.
     **/
    public boolean applicationOpenURLSourceApplicationAnnotation(
        MyAppApplication application, NSURL url, NSString sourceApplication,
        Object annotation);

    // 11

    /**
     * @param application The delegating application object.
     * @param coder       The keyed archiver containing the app?s previously saved state information.
     * @return Return Value YES if the app?s state should be restored or NO if it should not.
     * @Signature: application:shouldRestoreApplicationState:
     * @Declaration : - (BOOL)application:(MyAppApplication *)application shouldRestoreApplicationState:(NSCoder *)coder
     * @Description : Asks the delegate whether the app?s saved state information should be restored.
     * @Discussion Apps must implement this method and the application:shouldSaveApplicationState: method for state preservation to occur.
     * In addition, your implementation of this method must return YES each time UIKit tries to restore the state of your app.
     * You can use the information in the provided coder object to decide whether or not to proceed with state restoration. For
     * example, you might return NO if the data in the coder is from a different version of your app and cannot be effectively
     * restored to the current version.
     **/
    public boolean applicationShouldRestoreApplicationState(
        MyAppApplication application, NSCoder coder);

    // 12

    /**
     * @param application The delegating application object.
     * @param coder       The keyed archiver into which you can put high-level state information.
     * @return Return Value YES if the app?s state should be preserved or NO if it should not.
     * @Signature: application:shouldSaveApplicationState:
     * @Declaration : - (BOOL)application:(MyAppApplication *)application shouldSaveApplicationState:(NSCoder *)coder
     * @Description : Asks the delegate whether the app?s state should be preserved.
     * @Discussion Apps must implement this method and the application:shouldRestoreApplicationState: method for state preservation to
     * occur. In addition, your implementation of this method must return YES each time UIKit tries to preserve the state of
     * your app. You can return NO to disable state preservation temporarily. For example, during testing, you could disable
     * state preservation to test specific code paths. You can add version information or any other contextual data to the
     * provided coder object as needed. During restoration, you can use that information to help decide whether or not to
     * proceed with restoring your app to its previous state.
     **/
    public boolean applicationShouldSaveApplicationState(
        MyAppApplication application, NSCoder coder);

    // 13

    /**
     * @param application The delegating application object.
     * @param window      The window whose interface orientations you want to retrieve.
     * @return Return Value A bit mask of the UIInterfaceOrientationMask constants that indicate the orientations to use for the view
     * controllers.
     * @Signature: application:supportedInterfaceOrientationsForWindow:
     * @Declaration : - (NSUInteger)application:(MyAppApplication *)application supportedInterfaceOrientationsForWindow:(ViewGroup *)window
     * @Description : Asks the delegate for the interface orientations to use for the view controllers in the specified window.
     * @Discussion This method returns the interface orientations to use for any view controllers that do not specify their own explicitly.
     * The orientations returned by this method are used if the view controller does not override the
     * supportedInterfaceOrientations or shouldAutorotateToInterfaceOrientation: method. If you do not implement this method,
     * the application uses the values in the UIInterfaceOrientation key of the app?s Info.plist as the default interface
     * orientations.
     **/
    public int applicationSupportedInterfaceOrientationsForWindow(
        MyAppApplication application, ViewGroup window);

    // 14

    /**
     * @param application          The delegating application object.
     * @param identifierComponents An array of NSString objects corresponding to the restoration identifiers of the desired view controller
     *                             and all of its ancestors in the view controller hierarchy. The last value in the array is the restoration identifier of
     *                             the desired view controller. Earlier entries represent the restoration identifiers of its ancestors.
     * @param coder                The keyed archiver containing the app?s saved state information.
     * @return Return Value The view controller object to use or nil if you do not want to restore this view controller or its children. For
     * view controllers that are children of a common parent, returning nil for one child may prevent others from being restored
     * too. For example, in a navigation controller, returning nil for a view controller in the middle of the navigation stack
     * prevents the restoration of view controllers higher up on the stack.
     * @Signature: application:viewControllerWithRestorationIdentifierPath:coder:
     * @Declaration : - (MyAppController *)application:(MyAppApplication *)application viewControllerWithRestorationIdentifierPath:(NSArray
     * *)identifierComponents coder:(NSCoder *)coder
     * @Description : Asks the delegate to provide the specified view controller.
     * @Discussion During state restoration, when UIKit encounters a view controller without a restoration class, it calls this method to
     * ask for the corresponding view controller object. Your implementation of this method should create (or find) the
     * corresponding view controller object and return it. If you determine that it does not make sense to display this view
     * controller now, you may return nil to prevent that view controller from being added to your interface as part of the
     * restoration process. You use the strings in the identifierComponents parameter to identify the view controller being
     * requested. The view controllers in your app form a hierarchy. At the root of this hierarchy is the window?s root view
     * controller, which itself may present or embed other view controllers. Those presented or embedded view controllers may
     * themselves present and embed other view controllers. The result is a hierarchy of view controller relationships, with
     * each presented or embedded view controller becoming a child of the view controller that presented or embedded it. The
     * strings in the identifierComponents array identify the path through this hierarchy from the root view controller to the
     * desired view controller. It is not always necessary to create a new view controller object in your implementation of this
     * method. You can also return an existing view controller object that was created by another means. For example, you would
     * always return the existing view controllers loaded from your app?s main storyboard file rather than create new objects.
     * Your implementation of this method may use any data in the provided coder to assist in the restoration process. However,
     * you usually do not need to restore the entire state of the view controller at this point. During a later pass, view
     * controllers that define a decodeRestorableStateWithCoder: method are normally given a chance to restore their state form
     * the same coder object. Similarly, the app delegate itself has a application:didDecodeRestorableStateWithCoder: method
     * that you can use to restore app-level state information. Note:?If you return an object whose class does not match the
     * class of the originally preserved object, or whose class is not a direct subclass of the original, the restoration system
     * does not call the decodeRestorableStateWithCoder: method of the view controller.
     **/
    public MyAppController applicationViewControllerWithRestorationIdentifierPathCoder(
        MyAppApplication application, NSArray identifierComponents,
        NSCoder coder);

    // 15

    /**
     * @param application       The delegating application object.
     * @param newStatusBarFrame The changed frame of the status bar, in screen coordinates.
     * @Signature: application:willChangeStatusBarFrame:
     * @Declaration : - (void)application:(MyAppApplication *)application willChangeStatusBarFrame:(CGRect)newStatusBarFrame
     * @Description : Tells the delegate when the frame of the status bar is about to change.
     * @Discussion The application calls this method when it receives a setStatusBarOrientation:animated: message and is about to change the
     * interface orientation. After calling this method, the application also posts a
     * UIApplicationWillChangeStatusBarFrameNotification notification to give interested objects a chance to respond to the
     * change.
     **/
    public void applicationWillChangeStatusBarFrame(
        MyAppApplication application, CGRect newStatusBarFrame);

    // 16

    /**
     * @param application             The delegating application object.
     * @param newStatusBarOrientation A constant that indicates the new orientation of the application?s user interface; see ?Monitoring App
     *                                State Changes? for details.
     * @param duration                The duration of the animation to the new orientation, in seconds.
     * @Signature: application:willChangeStatusBarOrientation:duration:
     * @Declaration : - (void)application:(MyAppApplication *)application
     * willChangeStatusBarOrientation:(UIInterfaceOrientation)newStatusBarOrientation duration:(NSTimeInterval)duration
     * @Description : Tells the delegate when the interface orientation of the status bar is about to change.
     * @Discussion The delegate typically implements this method to prepare its windows and views for the new orientation. The delegate can
     * get the current device orientation from the shared UIDevice object. After calling this method, the application also posts
     * a UIApplicationWillChangeStatusBarOrientationNotification notification to give interested objects a chance to respond to
     * the change.
     **/
    public void applicationWillChangeStatusBarOrientationDuration(
        MyAppApplication application,
        UIInterfaceOrientation newStatusBarOrientation, double duration);

    // 17

    /**
     * @param application The delegating application object.
     * @param coder       The keyed archiver in which to write any state information.
     * @Signature: application:willEncodeRestorableStateWithCoder:
     * @Declaration : - (void)application:(MyAppApplication *)application willEncodeRestorableStateWithCoder:(NSCoder *)coder
     * @Description : Tells your delegate to save any high-level state information at the beginning of the state preservation process.
     * @Discussion The state preservation system calls this method at the beginning of the preservation process. This is your opportunity to
     * add any app-level information to state information. For example, you might use this method to write version information
     * or the high-level configuration of your app. Important:?This method is not a substitute for saving your app?s data
     * structures persistently to disk. You should continue to save your app?s actual data to iCloud or the local file system
     * using existing techniques. This method is intended only for saving configuration state or other information related to
     * your app?s user interface. You should consider the data in the coder as purgeable and be prepared for it to be
     * unavailable during subsequent launches. Your implementation of this method can encode restorable view and view controller
     * objects that it needs to reference. Encoding a restorable view or view controller writes that object?s restoration
     * identifier to the coder. (That identifier is used during the decode process to locate the new version of the object.) If
     * the view or view controller defines a encodeRestorableStateWithCoder: method, that method is also called at some point so
     * that the object can encode its own state. Apart from views and view controllers, other objects follow the normal
     * serialization process and must adopt the NSCoding protocol before they can be encoded. Encoding such objects embeds the
     * object?s contents in the archive directly. During the decode process, a new object is created and initialized with the
     * data from the archive.
     **/
    public void applicationWillEncodeRestorableStateWithCoder(
        MyAppApplication application, NSCoder coder);

    // 18

    /**
     * @param application   The delegating application object.
     * @param launchOptions A dictionary indicating the reason the application was launched (if any). The contents of this dictionary may be
     *                      empty in situations where the user launched the application directly. For information about the possible keys in this
     *                      dictionary and how to handle them, see ?Launch Options Keys?.
     * @return Return Value NO if the application cannot handle the URL resource, otherwise return YES. The return value is ignored if the
     * application is launched as a result of a remote notification.
     * @Signature: application:willFinishLaunchingWithOptions:
     * @Declaration : - (BOOL)application:(MyAppApplication *)application willFinishLaunchingWithOptions:(NSDictionary *)launchOptions
     * @Description : Tells the delegate that the launch process has begun but that state restoration has not yet occurred.
     * @Discussion You should use this method (and the corresponding application:didFinishLaunchingWithOptions: method) to initialize your
     * application and prepare it to run. This method is called after your application has been launched and its main storyboard
     * or nib file has been loaded, but before your app?s state has been restored. At the time this method is called, your
     * application is in the inactive state. If your application was launched by the system for a specific reason, the
     * launchOptions dictionary contains data indicating the reason for the launch. Your app should look in this dictionary for
     * any keys that correspond to features your app supports. If the given key is present, you should provide an appropriate
     * response. If your app was launched to open a URL, you should examine the value of the UIApplicationLaunchOptionsURLKey
     * key and return a Boolean value indicating whether your app can actually open the URL. You should not try to open the URL
     * in this method. Instead, implement the application:openURL:sourceApplication:annotation: method in your app delegate and
     * use that method to open the URL. The return result from this method is combined with the return result from the
     * application:didFinishLaunchingWithOptions: method to determine if a URL should be handled. If either method returns NO,
     * the URL is not handled. If you do not implement one of the methods, only the return value of the implemented method is
     * considered.
     **/
    public boolean applicationWillFinishLaunchingWithOptions(
        MyAppApplication application, NSDictionary launchOptions);

    // 19

    /**
     * @param application The singleton application instance.
     * @Signature: applicationDidBecomeActive:
     * @Declaration : - (void)applicationDidBecomeActive:(MyAppApplication *)application
     * @Description : Tells the delegate that the application has become active.
     * @Discussion This method is called to let your application know that it moved from the inactive to active state. This can occur
     * because your application was launched by the user or the system. Applications can also return to the active state if the
     * user chooses to ignore an interruption (such as an incoming phone call or SMS message) that sent the application
     * temporarily to the inactive state. You should use this method to restart any tasks that were paused (or not yet started)
     * while the application was inactive. For example, you could use it to restart timers or throttle up OpenGL ES frame rates.
     * If your application was previously in the background, you could also use it to refresh your application?s user interface.
     * After calling this method, the application also posts a UIApplicationDidBecomeActiveNotification notification to give
     * interested objects a chance to respond to the transition.
     **/
    public void applicationDidBecomeActive(MyAppApplication application);

    // 20

    /**
     * @param application The singleton application instance.
     * @Signature: applicationDidEnterBackground:
     * @Declaration : - (void)applicationDidEnterBackground:(MyAppApplication *)application
     * @Description : Tells the delegate that the application is now in the background.
     * @Discussion In iOS 4.0 and later, this method is called instead of the applicationWillTerminate: method when the user quits an
     * application that supports background execution. You should use this method to release shared resources, save user data,
     * invalidate timers, and store enough application state information to restore your application to its current state in
     * case it is terminated later. You should also disable updates to your application?s user interface and avoid using some
     * types of shared system resources (such as the user?s contacts database). It is also imperative that you avoid using
     * OpenGL ES in the background. Your implementation of this method has approximately five seconds to perform any tasks and
     * return. If you need additional time to perform any final tasks, you can request additional execution time from the system
     * by calling beginBackgroundTaskWithExpirationHandler:. In practice, you should return from applicationDidEnterBackground:
     * as quickly as possible. If the method does not return before time runs out your application is terminated and purged from
     * memory. You should perform any tasks relating to adjusting your user interface before this method exits but other tasks
     * (such as saving state) should be moved to a concurrent dispatch queue or secondary thread as needed. Because it's likely
     * any background tasks you start in applicationDidEnterBackground: will not run until after that method exits, you should
     * request additional background execution time before starting those tasks. In other words, first call
     * beginBackgroundTaskWithExpirationHandler: and then run the task on a dispatch queue or secondary thread. The application
     * also posts a UIApplicationDidEnterBackgroundNotification notification around the same time it calls this method to give
     * interested objects a chance to respond to the transition. For more information about how to transition gracefully to the
     * background, and for information about how to start background tasks at quit time, see iOS App Programming Guide.
     **/
    public void applicationDidEnterBackground(MyAppApplication application);

    // 21

    /**
     * @param application The delegating application object.
     * @Signature: applicationDidFinishLaunching:
     * @Declaration : - (void)applicationDidFinishLaunching:(MyAppApplication *)application
     * @Description : Tells the delegate when the application has finished launching.
     * @Discussion This method is used in earlier versions of iOS to initialize the app and prepare it to run. In iOS 3.0 and later, you
     * should use the application:didFinishLaunchingWithOptions: instead. In iOS 6.0 and later, you may also use the
     * application:willFinishLaunchingWithOptions: method to initialize your app. Your implementation of this method should
     * create your application?s user interface and initialize the application?s data structures. If your application persists
     * its state between launches, you would also use this method to restore your application to its previous state. After
     * calling this method, the application also posts a UIApplicationDidFinishLaunchingNotification notification to give
     * interested objects a chance to respond to the initialization cycle.
     **/
    public void applicationDidFinishLaunching(MyAppApplication application);

    // 22

    /**
     * @param application The delegating application object.
     * @Signature: applicationDidReceiveMemoryWarning:
     * @Declaration : - (void)applicationDidReceiveMemoryWarning:(MyAppApplication *)application
     * @Description : Tells the delegate when the application receives a memory warning from the system.
     * @Discussion Your implementation of this method should free up as much memory as possible by purging cached data objects that can be
     * recreated (or reloaded from disk) later. You use this method in conjunction with the didReceiveMemoryWarning of the
     * MyAppController class and the UIApplicationDidReceiveMemoryWarningNotification notification to release memory throughout
     * your application. It is strongly recommended that you implement this method. If your application does not release enough
     * memory during low-memory conditions, the system may terminate it outright.
     **/
    public void applicationDidReceiveMemoryWarning(MyAppApplication application);

    // 23

    /**
     * @param application The delegating application object.
     * @Signature: applicationProtectedDataDidBecomeAvailable:
     * @Declaration : - (void)applicationProtectedDataDidBecomeAvailable:(MyAppApplication *)application
     * @Description : Tells the delegate that protected files are available now.
     * @Discussion On a device that uses content protection, protected files are stored in an encrypted form and made available only at
     * certain times, usually when the device is unlocked. This notification lets your application know that the device is now
     * unlocked and that you may access certain types of protected files again.
     **/
    public void applicationProtectedDataDidBecomeAvailable(
        MyAppApplication application);

    // 24

    /**
     * @param application The delegating application object.
     * @Signature: applicationProtectedDataWillBecomeUnavailable:
     * @Declaration : - (void)applicationProtectedDataWillBecomeUnavailable:(MyAppApplication *)application
     * @Description : Tells the delegate that the protected files are about to become unavailable.
     * @Discussion On a device that uses content protection, protected files are stored in an encrypted form and made available only at
     * certain times, usually when the device is unlocked. This notification lets your application know that the device is about
     * to be locked and that any protected files it is currently accessing might become unavailable shortly. If your application
     * is currently accessing a protected file, you can use this method to release any references to that file. Although it is
     * not an error to access the file while the device is locked, any attempts to do so will fail. Therefore, if your
     * application depends on the file, you might want to take steps to avoid using that file while the device is locked.
     **/
    public void applicationProtectedDataWillBecomeUnavailable(
        MyAppApplication application);

    // 25

    /**
     * @param application The delegating application object.
     * @Signature: applicationSignificantTimeChange:
     * @Declaration : - (void)applicationSignificantTimeChange:(MyAppApplication *)application
     * @Description : Tells the delegate when there is a significant change in the time.
     * @Discussion Examples of significant time changes include the arrival of midnight, an update of the time by a carrier, and the change
     * to daylight savings time. The delegate can implement this method to adjust any object of the application that displays
     * time or is sensitive to time changes. Prior to calling this method, the application also posts a
     * UIApplicationSignificantTimeChangeNotification notification to give interested objects a chance to respond to the change.
     * If your application is currently suspended, this message is queued until your application returns to the foreground, at
     * which point it is delivered. If multiple time changes occur, only the most recent one is delivered.
     **/
    public void applicationSignificantTimeChange(MyAppApplication application);

    // 26

    /**
     * @param application The singleton application instance.
     * @Signature: applicationWillEnterForeground:
     * @Declaration : - (void)applicationWillEnterForeground:(MyAppApplication *)application
     * @Description : Tells the delegate that the application is about to enter the foreground.
     * @Discussion In iOS 4.0 and later, this method is called as part of the transition from the background to the active state. You can
     * use this method to undo many of the changes you made to your application upon entering the background. The call to this
     * method is invariably followed by a call to the applicationDidBecomeActive: method, which then moves the application from
     * the inactive to the active state. The application also posts a UIApplicationWillEnterForegroundNotification notification
     * shortly before calling this method to give interested objects a chance to respond to the transition.
     **/
    public void applicationWillEnterForeground(MyAppApplication application);

    // 27

    /**
     * @param application The singleton application instance.
     * @Signature: applicationWillResignActive:
     * @Declaration : - (void)applicationWillResignActive:(MyAppApplication *)application
     * @Description : Tells the delegate that the application is about to become inactive.
     * @Discussion This method is called to let your application know that it is about to move from the active to inactive state. This can
     * occur for certain types of temporary interruptions (such as an incoming phone call or SMS message) or when the user quits
     * the application and it begins the transition to the background state. An application in the inactive state continues to
     * run but does not dispatch incoming events to responders. You should use this method to pause ongoing tasks, disable
     * timers, and throttle down OpenGL ES frame rates. Games should use this method to pause the game. An application in the
     * inactive state should do minimal work while it waits to transition to either the active or background state. After
     * calling this method, the application also posts a UIApplicationWillResignActiveNotification notification to give
     * interested objects a chance to respond to the transition.
     **/
    public void applicationWillResignActive(MyAppApplication application);

    // 28

    /**
     * @param application The delegating application object.
     * @Signature: applicationWillTerminate:
     * @Declaration : - (void)applicationWillTerminate:(MyAppApplication *)application
     * @Description : Tells the delegate when the application is about to terminate.
     * @Discussion This method lets your application know that it is about to be terminated and purged from memory entirely. You should use
     * this method to perform any final clean-up tasks for your application, such as freeing shared resources, saving user data,
     * and invalidating timers. Your implementation of this method has approximately five seconds to perform any tasks and
     * return. If the method does not return before time expires, the system may kill the process altogether. For applications
     * that do not support background execution or are linked against iOS 3.x or earlier, this method is always called when the
     * user quits the application. For applications that support background execution, this method is generally not called when
     * the user quits the application because the application simply moves to the background in that case. However, this method
     * may be called in situations where the application is running in the background (not suspended) and the system needs to
     * terminate it for some reason. After calling this method, the application also posts a
     * UIApplicationWillTerminateNotification notification to give interested objects a chance to respond to the transition.
     **/
    public void applicationWillTerminate(MyAppApplication application);

    // 29

    /**
     * @Declaration :  ViewGroup *window
     * @Description : The window to use when presenting a storyboard.
     * @Discussion This property contains the window used to present the app?s visual content on the device?s main screen. Implementation of
     * this property is required if your app?s Info.plist file contains the UIMainStoryboardFile key. Fortunately, the Xcode
     * project templates usually include a synthesized declaration of the property automatically for the app delegate. The
     * default value of this synthesized property is nil, which causes the app to create a generic ViewGroup object and assign
     * it to the property. If you want to provide a custom window for your app, you must implement the getter method of this
     * property and use it to create and return your custom window. For more information about the ?UIMainStoryboardFile? in
     * Information Property List Key Reference key, see Information Property List Key Reference.
     **/

    // public ViewGroup window;
    public MyAppWindow getWindow();

    public void setWindow(MyAppWindow window);
}
