package com.myappconverter.uikit.myappclasses;

import com.myappconverter.java.foundations.NSString;


public class MyAppStoryboardSegue {
    private MyAppController sourceViewController;
    private MyAppController destinationViewController;
    private NSString identifier;
    private PerformHandler performHandler;
    private Kind kind;
    private NSString segueKind;
    private Class source;
    private Class destination;

    public MyAppStoryboardSegue() {
    }

    public MyAppStoryboardSegue(String identifier, String destination,
        String kind) {
        super();

        try {
            this.destination = Class.forName(destination);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        this.identifier = new NSString(identifier);
        this.segueKind = new NSString(kind);

        try {
            this.destinationViewController = (MyAppController) this.destination.newInstance();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        this.destinationViewController.init();
    }

    public MyAppStoryboardSegue(MyAppController sourceViewController,
        MyAppController destinationViewController, NSString identifier,
        PerformHandler performHandler, Kind kind) {
        super();
        this.sourceViewController = sourceViewController;
        this.destinationViewController = destinationViewController;
        this.identifier = identifier;
        this.performHandler = performHandler;
        this.kind = kind;
    }

    public MyAppStoryboardSegue(MyAppController sourceViewController,
        MyAppController destinationViewController, NSString identifier,
        String kind) {
        super();
        this.sourceViewController = sourceViewController;
        this.destinationViewController = destinationViewController;
        this.identifier = identifier;
        this.segueKind = new NSString(kind);
    }

    public MyAppStoryboardSegue(MyAppController sourceViewController,
        MyAppController destinationViewController, NSString identifier,
        PerformHandler performHandler) {
        super();
        this.sourceViewController = sourceViewController;
        this.destinationViewController = destinationViewController;
        this.identifier = identifier;
        this.performHandler = performHandler;
    }

    public MyAppController getSourceViewController() {
        return sourceViewController;
    }

    public MyAppController getDestinationViewController() {
        return destinationViewController;
    }

    public NSString getIdentifier() {
        return identifier;
    }

    public void setIdentifier(NSString identifier) {
        identifier = identifier;
    }

    public NSString getSegueKind() {
        return segueKind;
    }

    public void setSegueKind(NSString segueKind) {
        this.segueKind = segueKind;
    }

    public void setSourceViewController(MyAppController sourceViewController) {
        this.sourceViewController = sourceViewController;
    }

    public void setDestinationViewController(
        MyAppController destinationViewController) {
        this.destinationViewController = destinationViewController;
    }

    private void setDestination(Class destination) {
        this.destination = destination;
    }

    public Class getDestination() {
        return this.destination;
    }

    public void perform() {
    }

    public static interface PerformHandler {
        public void performAction();
    }

    public enum Kind {push,
        relationship;
    }
}
