package com.myappconverter.uikit.myappclasses;

import android.content.Context;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

import com.myappconverter.mapping.utils.GenericMainContext;

import com.myappconverter.uikit.bridges.protocols.UIAccelerometerDelegate;


public class MyAppAccelerometer {
    public static Context context;
    private Sensor sensor;
    private SensorManager sensorManager;
    private SensorEventListener accelerometerListener;
    public UIAccelerometerDelegate delegate;
    public double updateInterval;

    public MyAppAccelerometer() {
        context = GenericMainContext.sharedContext;
        sensorManager = (SensorManager) context.getSystemService(Context.SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        // Define the accelerometer event listener ( onSensorChanged and onAccuracyChanged)
        accelerometerListener = new SensorEventListener() {
                    @Override
                    public void onSensorChanged(SensorEvent event) {
                        if (delegate != null) {
                            delegate.accelerometerDidAccelerate((MyAppAccelerometer) MyAppAccelerometer.this,
                                new MyAppAcceleration(event));
                        }
                    }

                    @Override
                    public void onAccuracyChanged(Sensor sensor, int accuracy) {
                        // Not supported in IOs the accuracy can be calculated by the average it's not precise
                    }
                };
        sensorManager.registerListener(accelerometerListener, sensor,
            (int) (1.0f / 60));
    }

    public MyAppAccelerometer(Context ctx) {
        context = ctx;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor mSensor) {
        this.sensor = mSensor;
    }

    public SensorManager getSensorManager() {
        return sensorManager;
    }

    public void setSensorManager(SensorManager sensorManager) {
        this.sensorManager = sensorManager;
    }

    public UIAccelerometerDelegate getDelegate() {
        return delegate;
    }

    public void setDelegate(UIAccelerometerDelegate delegate) {
        this.delegate = delegate;
    }

    public double getUpdateInterval() {
        return updateInterval;
    }

    public void setUpdateInterval(double updateInterval) {
        this.updateInterval = updateInterval;
        sensorManager.unregisterListener(accelerometerListener);
        sensorManager.registerListener(accelerometerListener, sensor,
            (int) (updateInterval));
    }
}
