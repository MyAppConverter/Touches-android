package com.myappconverter.uikit.myappclasses;

import com.myappconverter.java.corelocation.CLRegion;
import com.myappconverter.java.foundations.NSCalendar;
import com.myappconverter.java.foundations.NSCalendar.NSCalendarUnit;
import com.myappconverter.java.foundations.NSDate;
import com.myappconverter.java.foundations.NSDictionary;
import com.myappconverter.java.foundations.NSString;
import com.myappconverter.java.foundations.NSTimeZone;


public class MyAppLocalNotification {
    private NSDate fireDate;
    private NSTimeZone timeZone;
    private NSCalendarUnit repeatInterval;
    private NSCalendar repeatCalendar;
    private CLRegion region;
    private boolean regionTriggersOnce;
    private NSString alertBody;
    private NSString alertAction;
    private NSString alertTitle;
    private boolean hasAction;
    private NSString alertLaunchImage;
    private NSString category;
    private int applicationIconBadgeNumber;
    private NSString soundName;
    private NSDictionary userInfo;

    public NSDate getFireDate() {
        return fireDate;
    }

    public void setFireDate(NSDate fireDate) {
        this.fireDate = fireDate;
    }

    public NSTimeZone getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(NSTimeZone timeZone) {
        this.timeZone = timeZone;
    }

    public NSCalendarUnit getRepeatInterval() {
        return repeatInterval;
    }

    public void setRepeatInterval(NSCalendarUnit repeatInterval) {
        this.repeatInterval = repeatInterval;
    }

    public NSCalendar getRepeatCalendar() {
        return repeatCalendar;
    }

    public void setRepeatCalendar(NSCalendar repeatCalendar) {
        this.repeatCalendar = repeatCalendar;
    }

    public CLRegion getRegion() {
        return region;
    }

    public void setRegion(CLRegion region) {
        this.region = region;
    }

    public boolean isRegionTriggersOnce() {
        return regionTriggersOnce;
    }

    public void setRegionTriggersOnce(boolean regionTriggersOnce) {
        this.regionTriggersOnce = regionTriggersOnce;
    }

    public NSString getAlertBody() {
        return alertBody;
    }

    public void setAlertBody(NSString alertBody) {
        this.alertBody = alertBody;
    }

    public NSString getAlertAction() {
        return alertAction;
    }

    public void setAlertAction(NSString alertAction) {
        this.alertAction = alertAction;
    }

    public NSString getAlertTitle() {
        return alertTitle;
    }

    public void setAlertTitle(NSString alertTitle) {
        this.alertTitle = alertTitle;
    }

    public boolean isHasAction() {
        return hasAction;
    }

    public void setHasAction(boolean hasAction) {
        this.hasAction = hasAction;
    }

    public NSString getAlertLaunchImage() {
        return alertLaunchImage;
    }

    public void setAlertLaunchImage(NSString alertLaunchImage) {
        this.alertLaunchImage = alertLaunchImage;
    }

    public NSString getCategory() {
        return category;
    }

    public void setCategory(NSString category) {
        this.category = category;
    }

    public int getApplicationIconBadgeNumber() {
        return applicationIconBadgeNumber;
    }

    public void setApplicationIconBadgeNumber(int applicationIconBadgeNumber) {
        this.applicationIconBadgeNumber = applicationIconBadgeNumber;
    }

    public NSString getSoundName() {
        return soundName;
    }

    public void setSoundName(NSString soundName) {
        this.soundName = soundName;
    }

    public NSDictionary getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(NSDictionary userInfo) {
        this.userInfo = userInfo;
    }
}
