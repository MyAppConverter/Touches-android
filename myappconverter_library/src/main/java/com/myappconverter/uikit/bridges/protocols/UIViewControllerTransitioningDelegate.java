package com.myappconverter.uikit.bridges.protocols;

public interface UIViewControllerTransitioningDelegate {
    // Getting the Animator Objects
    public void animationControllerForPresentedControllerPresentingControllerSourceController();

    public void animationControllerForDismissedController();

    // Getting the Interactive Transition Object
    public void interactionControllerForPresentation();

    public void interactionControllerForDismissal();
}
