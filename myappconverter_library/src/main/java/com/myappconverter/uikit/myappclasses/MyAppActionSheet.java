package com.myappconverter.uikit.myappclasses;

import android.app.AlertDialog;

import android.content.Context;
import android.content.DialogInterface;

import com.myappconverter.uikit.bridges.protocols.UIActionSheetDelegate;


public class MyAppActionSheet extends AlertDialog {
    AlertDialog.Builder builder;
    UIActionSheetDelegate listener;
    private String[] items;
    private boolean mDismissed = true;
    private String cancelButtonTitle;

    protected MyAppActionSheet(Context context) {
        super(context);
        builder = new AlertDialog.Builder(context);
    }

    public AlertDialog.Builder getBuilder() {
        return builder;
    }

    public void setTitle(String title) {
        builder.setTitle(title);
    }

    public void setItems(String... items) {
        this.items = items;

        //		builder.setItems(items, new OnClickListener() {
        //			
        //			@Override
        //			public void onClick(DialogInterface dialog, int which) {
        //				if(listener != null)listener.clickedItemAtIndex(dialog, which);
        //			}
        //		});
    }

    public int addItem(String item) {
        if ((item != null) && !item.equals("")) {
            if (this.items != null) {
                String[] tabItem = new String[this.items.length + 1];
                tabItem = items;
                tabItem[this.items.length] = item;
                items = tabItem;
            }

            return items.length - 1;
        }

        return -1;
    }

    public String[] getItems() {
        return items;
    }

    public boolean ismDismissed() {
        return mDismissed;
    }

    public String getCancelButtonTitle() {
        return cancelButtonTitle;
    }

    public void setCancelButtonTitle(String title) {
        this.cancelButtonTitle = title;
    }

    public void setListener(UIActionSheetDelegate listener) {
        this.listener = listener;
    }

    public UIActionSheetDelegate getListener() {
        return this.listener;
    }

    public void show() {
        final int[] currentIndexClicked = { -1 };

        if (items != null) {
            builder.setItems(items,
                new OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (listener != null) {
                            listener.actionSheetClickedButtonAtIndex(MyAppActionSheet.this,
                                which);
                        }

                        mDismissed = true;
                    }
                });
        }

        if ((cancelButtonTitle != null) && !cancelButtonTitle.isEmpty()) {
            builder.setNegativeButton(cancelButtonTitle,
                new OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (listener != null) {
                            listener.actionSheetCancel(MyAppActionSheet.this);
                        }

                        mDismissed = true;
                        currentIndexClicked[0] = 0;
                    }
                });
        } else {
            builder.setOnCancelListener(new OnCancelListener() {
                    @Override
                    public void onCancel(DialogInterface dialog) {
                        if (listener != null) {
                            listener.actionSheetCancel(MyAppActionSheet.this);
                        }

                        currentIndexClicked[0] = -1;
                    }
                });
        }

        builder.setOnDismissListener(new OnDismissListener() {
                @Override
                public void onDismiss(DialogInterface dialog) {
                    if (listener != null) {
                        listener.actionSheetWillDismissWithButtonIndex(MyAppActionSheet.this,
                            currentIndexClicked[0]);
                    }

                    if (listener != null) {
                        listener.actionSheetDidDismissWithButtonIndex(MyAppActionSheet.this,
                            currentIndexClicked[0]);
                    }
                }
            });

        if (listener != null) {
            listener.willPresentActionSheet(MyAppActionSheet.this);
        }

        if (listener != null) {
            listener.didPresentActionSheet(MyAppActionSheet.this);
        }

        mDismissed = false;
        builder.create().show();
    }

    public void dismissWithClicked(int buttonIndex, boolean animated) {
        if (listener != null) {
            listener.actionSheetWillDismissWithButtonIndex(this, buttonIndex);
        }

        if (listener != null) {
            listener.actionSheetDidDismissWithButtonIndex(this, buttonIndex);
        }
    }
}
