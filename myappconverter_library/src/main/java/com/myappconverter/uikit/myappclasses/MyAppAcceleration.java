package com.myappconverter.uikit.myappclasses;

import android.content.Context;

import android.hardware.SensorEvent;


public class MyAppAcceleration {
    public static final double EARTH_GRAVITY = 9.81;
    public static Context context;
    private SensorEvent sensorEvent;
    private float x;
    private float y;
    private float z;
    private long timestamp;

    public MyAppAcceleration(SensorEvent sensorEvent) {
        this.sensorEvent = sensorEvent;

        if (sensorEvent != null) {
            x = -sensorEvent.values[0];
            y = sensorEvent.values[1];
            z = sensorEvent.values[2];
            timestamp = sensorEvent.timestamp;
        } else {
            x = 0;
            y = 0;
            z = (float) MyAppAcceleration.EARTH_GRAVITY;
            timestamp = System.currentTimeMillis();
        }
    }

    public MyAppAcceleration() {
        super();
    }

    public MyAppAcceleration(Context ctx) {
        context = ctx;
    }

    public static float convertGravityFromIOStoAND(float ios) {
        return (float) (ios / MyAppAcceleration.EARTH_GRAVITY);
    }

    public float timestamp() {
        if (sensorEvent != null) {
            timestamp = sensorEvent.timestamp;
        } else {
            timestamp = System.currentTimeMillis();
        }

        return timestamp;
    }

    public float x() {
        if (sensorEvent != null) {
            x = sensorEvent.values[0];
        } else {
            x = 0;
        }

        return x;
    }

    public float y() {
        if (sensorEvent != null) {
            y = sensorEvent.values[0];
        } else {
            y = 0;
        }

        return y;
    }

    public float z() {
        if (sensorEvent != null) {
            z = sensorEvent.values[0];
        } else {
            z = (float) MyAppAcceleration.EARTH_GRAVITY;
        }

        return z;
    }

    public float getTimestamp() {
        return timestamp;
    }

    public float getX() {
        return x;
    }

    public void setX(float mX) {
        x = mX;
    }

    public float getY() {
        return y;
    }

    public void setY(float mY) {
        x = mY;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float mZ) {
        x = mZ;
    }
}
