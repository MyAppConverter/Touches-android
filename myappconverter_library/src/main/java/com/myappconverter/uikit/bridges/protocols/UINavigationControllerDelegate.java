package com.myappconverter.uikit.bridges.protocols;

import com.myappconverter.uikit.myappclasses.MyAppController;
import com.myappconverter.uikit.myappclasses.MyAppNavigationController;
import com.myappconverter.uikit.util.UIKitEnums.UIInterfaceOrientation;
import com.myappconverter.uikit.util.UIKitEnums.UINavigationControllerOperation;


public interface UINavigationControllerDelegate {
    public void navigationControllerWillShowViewControllerAnimated(
        MyAppNavigationController navigationController,
        MyAppController viewController, boolean animated);

    public void navigationControllerDidShowViewControllerAnimated(
        MyAppNavigationController navigationController,
        MyAppController viewController, boolean animated);

    public Integer navigationControllerSupportedInterfaceOrientations(
        MyAppNavigationController navigationController);

    public UIInterfaceOrientation navigationControllerPreferredInterfaceOrientationForPresentation(
        MyAppNavigationController navigationController);

    public UIViewControllerInteractiveTransitioning navigationControllerInteractionControllerForAnimationController(
        MyAppNavigationController navigationController,
        UIViewControllerAnimatedTransitioning animationController);

    public UIViewControllerAnimatedTransitioning navigationControllerAnimationControllerForOperationFromViewControllerToViewController(
        MyAppNavigationController navigationController,
        UINavigationControllerOperation operation, MyAppController fromVC,
        MyAppController toVC);
}
