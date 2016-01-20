package com.myappconverter.uikit.bridges.protocols;

import android.app.AlertDialog;


public interface UIAlertViewDelegate {
    public void alertViewClickedButtonAtIndex(AlertDialog.Builder alertView,
        int buttonIndex);

    public boolean alertViewShouldEnableFirstOtherButton(
        AlertDialog.Builder alertView);

    public void willPresentAlertView(AlertDialog.Builder alertView);

    public void didPresentAlertView(AlertDialog.Builder alertView);

    public void alertViewWillDismissWithButtonIndex(
        AlertDialog.Builder alertView, int buttonIndex);

    public void alertViewDidDismissWithButtonIndex(
        AlertDialog.Builder alertView, int buttonIndex);

    public void alertViewCancel(AlertDialog.Builder alertView);
}
