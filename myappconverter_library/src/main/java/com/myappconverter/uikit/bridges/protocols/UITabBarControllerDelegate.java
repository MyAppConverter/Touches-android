package com.myappconverter.uikit.bridges.protocols;

import com.myappconverter.java.foundations.NSArray;

import com.myappconverter.uikit.myappclasses.MyAppController;
import com.myappconverter.uikit.myappclasses.MyAppTabBarController;
import com.myappconverter.uikit.util.UIKitEnums.UIInterfaceOrientation;


public interface UITabBarControllerDelegate {
    /**
     * tabBarController:animationControllerForTransitionFromViewController:toViewController: Called to allow the delegate to return a
     * UIViewControllerAnimatedTransitioning delegate object for use during a noninteractive tab bar view controller transition. -
     * (id<UIViewControllerAnimatedTransitioning>)tabBarController:(UITabBarController *)tabBarController
     * animationControllerForTransitionFromViewController:(MyAppController *)fromVC toViewController:(MyAppController *)toVC Parameters
     * tabBarController The tab bar controller whose view controller is transitioning. fromVC The currently visible view controller. toVC
     * The view controller intended to be visible after the transition ends. Return Value The UIViewControllerAnimatedTransitioning delegate
     * object responsible for managing the tab bar view controller transition animation.
     */
    public UIViewControllerAnimatedTransitioning tabBarControllerAnimationControllerForTransitionFromViewControllerToViewController(
        MyAppTabBarController tabBarController, MyAppController fromVC,
        MyAppController toVC);

    /**
     * tabBarController:didEndCustomizingViewControllers:changed: Tells the delegate that the tab bar customization sheet was dismissed. -
     * (void)tabBarController:(UITabBarController *)tabBarController didEndCustomizingViewControllers:(NSArray *)viewControllers
     * changed:(BOOL)changed Parameters tabBarController The tab bar controller that is being customized. viewControllers The view
     * controllers of the tab bar controller. The arrangement of the controllers in the array represents the new display order within the
     * tab bar. changed A Boolean value indicating whether items changed on the tab bar. YES if items changed or NO if they did not.
     * Discussion You can use this method to respond to changes to the order of tabs in the tab bar.
     */
    public void tabBarControllerDidEndCustomizingViewControllersChanged(
        MyAppTabBarController tabBarController,
        NSArray<MyAppController> viewControllers, boolean changed);

    /**
     * tabBarController:didSelectViewController: Tells the delegate that the user selected an item in the tab bar. -
     * (void)tabBarController:(UITabBarController *)tabBarController didSelectViewController:(MyAppController *)viewController Parameters
     * tabBarController The tab bar controller containing viewController. viewController The view controller that the user selected. In iOS
     * v3.0 and later, this could be the same view controller that was already selected. Discussion In iOS v3.0 and later, the tab bar
     * controller calls this method regardless of whether the selected view controller changed. In addition, it is called only in response
     * to user taps in the tab bar and is not called when your code changes the tab bar contents programmatically. In versions of iOS prior
     * to version 3.0, this method is called only when the selected view controller actually changes. In other words, it is not called when
     * the same view controller is selected. In addition, the method was called for both programmatic and user-initiated changes to the
     * selected view controller.
     */
    public void tabBarControllerDidSelectViewController(
        MyAppTabBarController tabBarController, MyAppController viewController);

    /**
     * tabBarController:interactionControllerForAnimationController: Called to allow the delegate to return a
     * UIViewControllerInteractiveTransitioning delegate object for use during an animated tab bar transition. -
     * (id<UIViewControllerInteractiveTransitioning>)tabBarController:(UITabBarController *)tabBarController
     * interactionControllerForAnimationController:(id<UIViewControllerAnimatedTransitioning>)animationController Parameters
     * tabBarController The tab bar controller participating in the interactive, animated transition. animationController The noninteractive
     * animation controller
     */
    public UIViewControllerInteractiveTransitioning tabBarControllerInteractionControllerForAnimationController(
        MyAppTabBarController tabBarController,
        UIViewControllerAnimatedTransitioning animationController);

    /**
     * tabBarController:shouldSelectViewController: Asks the delegate whether the specified view controller should be made active. -
     * (BOOL)tabBarController:(UITabBarController *)tabBarController shouldSelectViewController:(MyAppController *)viewController Parameters
     * tabBarController The tab bar controller containing viewController. viewController The view controller belonging to the tab that was
     * tapped by the user. Return Value YES if the view controller’s tab should be selected or NO if the current tab should remain active.
     * Discussion The tab bar controller calls this method in response to the user tapping a tab bar item. You can use this method to
     * dynamically decide whether a given tab should be made the active tab.
     *
     * @param tabBarController
     * @param viewController
     * @return
     */
    public boolean tabBarControllerShouldSelectViewController(
        MyAppTabBarController tabBarController, MyAppController viewController);

    /**
     * tabBarController:willBeginCustomizingViewControllers: Tells the delegate that the tab bar customization sheet is about to be
     * displayed. - (void)tabBarController:(UITabBarController *)tabBarController willBeginCustomizingViewControllers:(NSArray
     * *)viewControllers Parameters tabBarController The tab bar controller that is being customized. viewControllers The view controllers
     * to be displayed in the customization sheet. This list typically contains all custom view controllers you added but does not include
     * some standard controllers, such as the one that manages the More tab.
     *
     * @param tabBarController
     * @param viewControllers
     */
    public void tabBarControllerWillBeginCustomizingViewControllers(
        MyAppTabBarController tabBarController,
        NSArray<MyAppController> viewControllers);

    /**
     * tabBarController:willEndCustomizingViewControllers:changed: Tells the delegate that the tab bar customization sheet is about to be
     * dismissed. - (void)tabBarController:(UITabBarController *)tabBarController willEndCustomizingViewControllers:(NSArray
     * *)viewControllers changed:(BOOL)changed Parameters tabBarController The tab bar controller that is being customized. viewControllers
     * The view controllers of the tab bar controller. The arrangement of the controllers in the array represents the new display order
     * within the tab bar. changed A Boolean value indicating whether items changed on the tab bar. YES if items changed or NO if they did
     * not. Discussion This method is called in response to the user tapping the Done button on the sheet but before the sheet is dismissed.
     */
    public void tabBarControllerWillEndCustomizingViewControllersChanged(
        MyAppTabBarController tabBarController,
        NSArray<MyAppController> viewControllers, boolean changed);

    /**
     * tabBarControllerPreferredInterfaceOrientationForPresentation: Called to allow the delegate to provide the preferred orientation for
     * presentation of the tab bar controller. -
     * (UIInterfaceOrientation)tabBarControllerPreferredInterfaceOrientationForPresentation:(UITabBarController *)tabBarController
     * Parameters tabBarController The tab bar controller that is asking the delegate object for the preferred presentation orientation.
     * Return Value The preferred orientation for presenting the tab bar controller. Availability Available in iOS 7.0 and later. See Also
     * preferredInterfaceOrientationForPresentation
     */
    public UIInterfaceOrientation tabBarControllerPreferredInterfaceOrientationForPresentation(
        MyAppTabBarController tabBarController);

    /**
     * tabBarControllerSupportedInterfaceOrientations: Called to allow the delegate to provide the complete set of supported interface
     * orientations for the tab bar controller. - (NSUInteger)tabBarControllerSupportedInterfaceOrientations:(UITabBarController
     * *)tabBarController Parameters tabBarController The tab bar controller that is asking the delegate object for the supported interface
     * orientations. Return Value One of the UIInterfaceOrientationMask constants that represents the set of interface orientations
     * supported by the tab bar controller.
     */
    public int tabBarControllerSupportedInterfaceOrientations(
        MyAppTabBarController tabBarController);
}
