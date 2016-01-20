package com.myappconverter.uikit.bridges.protocols;

import com.myappconverter.uikit.myappclasses.MyAppGestureRecognizer;
import com.myappconverter.uikit.myappclasses.MyAppTouch;


public interface UIGestureRecognizerDelegate {
    boolean gestureRecognizerShouldBegin(
        MyAppGestureRecognizer gestureRecognizer);

    boolean gestureRecognizerShouldReceiveTouch(
        MyAppGestureRecognizer gestureRecognizer, MyAppTouch touch);

    boolean gestureRecognizerShouldRecognizeSimultaneouslyWithGestureRecognizer(
        MyAppGestureRecognizer gestureRecognizer);

    boolean gestureRecognizerShouldRequireFailureOfGestureRecognizer(
        MyAppGestureRecognizer gestureRecognizer);

    boolean gestureRecognizerShouldBeRequiredToFailByGestureRecognizer(
        MyAppGestureRecognizer gestureRecognizer);
}
