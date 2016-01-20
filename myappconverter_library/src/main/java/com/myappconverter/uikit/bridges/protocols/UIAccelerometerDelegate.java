package com.myappconverter.uikit.bridges.protocols;

import com.myappconverter.uikit.myappclasses.MyAppAcceleration;
import com.myappconverter.uikit.myappclasses.MyAppAccelerometer;


public interface UIAccelerometerDelegate {
    public void accelerometerDidAccelerate(MyAppAccelerometer accelerometer,
        MyAppAcceleration acceleration);
}
