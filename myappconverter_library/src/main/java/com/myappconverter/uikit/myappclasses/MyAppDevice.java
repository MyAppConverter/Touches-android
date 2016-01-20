package com.myappconverter.uikit.myappclasses;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

import android.content.pm.ActivityInfo;

import android.content.res.Configuration;

import android.os.BatteryManager;
import android.os.Build;

import android.telephony.TelephonyManager;

import android.view.OrientationEventListener;

import com.myappconverter.java.foundations.NSUUID;

import com.myappconverter.mapping.utils.GenericMainContext;

import com.myappconverter.uikit.util.UIKitEnums;
import com.myappconverter.uikit.util.UIKitEnums.UIDeviceBatteryState;
import com.myappconverter.uikit.util.UIKitEnums.UIDeviceOrientation;


public class MyAppDevice {
    public static MyAppDevice instance;
    private static final MyAppDevice current = new MyAppDevice();
    private boolean proximityMonitoringEnabled = false;
    private boolean batteryMonitoringEnabled = false;
    private UIKitEnums.UIDeviceOrientation orientation = UIKitEnums.UIDeviceOrientation.UIDeviceOrientationPortrait;
    private String udid;
    private UIKitEnums.UIUserInterfaceIdiom userinterfaceidiom;
    public Build build;

    private MyAppDevice() {
        String device = System.getProperty("xm.device");

        if (device == null) {
            device = "iphone";
        }

        device = device.toLowerCase();

        if (device.equals("iphone")) {
            userinterfaceidiom = UIKitEnums.UIUserInterfaceIdiom.UIUserInterfaceIdiomPhone;
        } else if (device.equals("ipad")) {
            userinterfaceidiom = UIKitEnums.UIUserInterfaceIdiom.UIUserInterfaceIdiomPad;
        } else {
            throw new IllegalStateException("Unknown device " + device);
        }
    }

    public static MyAppDevice currentDevice() {
        return current;
    }

    public static MyAppDevice instance() {
        if (instance == null) {
            instance = new MyAppDevice();
        }

        return instance;
    }

    /*
     * properties
     */

    // multitaskingSupported Property
    // name Property
    public String getName() {
        return build.MODEL;
    }

    // systemName Property
    public String getSystemName() {
        return Build.VERSION.RELEASE;
    }

    // systemVersion Property
    public String getSystemVersion() {
        return Build.VERSION.RELEASE;
    }

    // model Property
    public String getModel() {
        return Build.MODEL;
    }

    // localizedModel Property
    public String getLocalizedModel() {
        return Build.MODEL;
    }

    // userInterfaceIdiom Property
    public UIKitEnums.UIUserInterfaceIdiom getUserInterfaceIdiom() {
        return userinterfaceidiom;
    }

    // identifierForVendor Property
    public String getIdentifierForVendor(NSUUID identifierForVendor) {
        return "ask";
    }

    public UIKitEnums.UIDeviceOrientation getOrientation() {
        return orientation;
    }

    // orientation Property
    public UIDeviceOrientation getOrientation(UIDeviceOrientation orientation) {
        switch (GenericMainContext.sharedContext.getResources()
                                                .getConfiguration().orientation) {
        case Configuration.ORIENTATION_UNDEFINED:
            return UIDeviceOrientation.UIDeviceOrientationUnknown;

        case Configuration.ORIENTATION_LANDSCAPE:
            return UIDeviceOrientation.UIDeviceOrientationLandscapeLeft;

        case Configuration.ORIENTATION_PORTRAIT:
            return UIDeviceOrientation.UIDeviceOrientationPortrait;

        case Configuration.ORIENTATION_SQUARE:
            return UIDeviceOrientation.UIDeviceOrientationFaceDown;

        default:
            return UIDeviceOrientation.UIDeviceOrientationUnknown;
        }
    }

    public void setOrientation(UIKitEnums.UIDeviceOrientation orientation) {
        switch (orientation) {
        case UIDeviceOrientationUnknown:
            GenericMainContext.sharedContext.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
            this.orientation = UIKitEnums.UIDeviceOrientation.UIDeviceOrientationUnknown;

        case UIDeviceOrientationLandscapeLeft:
            GenericMainContext.sharedContext.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            this.orientation = UIKitEnums.UIDeviceOrientation.UIDeviceOrientationLandscapeLeft;

        case UIDeviceOrientationPortrait:
            GenericMainContext.sharedContext.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            this.orientation = UIKitEnums.UIDeviceOrientation.UIDeviceOrientationPortrait;

        default:
            GenericMainContext.sharedContext.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            this.orientation = UIKitEnums.UIDeviceOrientation.UIDeviceOrientationPortrait;
        }
    }

    public boolean isGeneratesDeviceOrientationNotifications() {
        OrientationEventListener eventListener = new OrientationEventListener(GenericMainContext.sharedContext) {
                @Override
                public void onOrientationChanged(int orientation) {
                }
            };

        return eventListener.canDetectOrientation();
    }

    // batteryLevel Property
    public double getBatteryLevel() {
        Intent batteryIntent = GenericMainContext.sharedContext.getApplicationContext()
                                                               .registerReceiver(null,
                new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
        int rawlevel = batteryIntent.getIntExtra("level", -1);
        double scale = batteryIntent.getIntExtra("scale", -1);
        double level = -1;

        if ((rawlevel >= 0) && (scale > 0)) {
            level = rawlevel / scale;
        }

        return level;
    }

    public boolean isBatteryMonitoringEnabled() {
        return true;
    }

    // batteryState Property
    public UIDeviceBatteryState getBatteryState() {
        if (isBatteryMonitoringEnabled()) {
            IntentFilter ifilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
            Intent batteryStatus = GenericMainContext.sharedContext.registerReceiver(null,
                    ifilter);

            int status = batteryStatus.getIntExtra(BatteryManager.EXTRA_STATUS,
                    -1);

            switch (status) {
            case BatteryManager.BATTERY_STATUS_CHARGING:
                return UIDeviceBatteryState.UIDeviceBatteryStateCharging;

            case BatteryManager.BATTERY_STATUS_FULL:
                return UIDeviceBatteryState.UIDeviceBatteryStateFull;

            case BatteryManager.BATTERY_STATUS_UNKNOWN:
                return UIDeviceBatteryState.UIDeviceBatteryStateUnknown;

            case BatteryManager.BATTERY_STATUS_DISCHARGING:
                break;
            }
        }

        return UIDeviceBatteryState.UIDeviceBatteryStateUnknown;
    }

    public boolean isProximityMonitoringEnabled() {
        return true;
    }

    public boolean isProximityState() {
        return true;
    }
}
