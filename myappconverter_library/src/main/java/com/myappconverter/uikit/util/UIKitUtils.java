package com.myappconverter.uikit.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.myappconverter.mapping.utils.GenericMainContext;


/**
 * Created by macmin on 21/09/2015.
 */
public class UIKitUtils {
    public static void addSubviewUI(final View supperView, final View subView) {
        GenericMainContext.sharedContext.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (subView.getParent() != null) {
                        if (subView.getParent() != supperView) {
                            ViewParent parent = subView.getParent();

                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(subView);
                            }
                        } else {
                            if (subView.getVisibility() == View.GONE) {
                                subView.setVisibility(View.VISIBLE);

                                return;
                            }
                        }
                    }

                    if (supperView instanceof ViewGroup) {
                        if (subView.getLayoutParams() != null) {
                            ((ViewGroup) supperView).addView(subView,
                                subView.getLayoutParams());
                        } else {
                            ((ViewGroup) supperView).addView(subView);
                        }

                        ((ViewGroup) supperView).bringChildToFront(subView);
                    } else {
                    }

                    supperView.invalidate();
                }
            });
    }

    public static Bitmap drawableToBitmap(Drawable drawable) {
        Bitmap bitmap = null;

        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;

            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }

        if ((drawable.getIntrinsicWidth() <= 0) ||
                (drawable.getIntrinsicHeight() <= 0)) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888); // Single color bitmap will be created of 1x1 pixel
        } else {
            bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(),
                    drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        }

        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);

        return bitmap;
    }
}
