package com.myappconverter.uikit.util;

import android.view.MotionEvent;
import static android.view.MotionEvent.ACTION_CANCEL;
import static android.view.MotionEvent.ACTION_DOWN;
import static android.view.MotionEvent.ACTION_MOVE;
import static android.view.MotionEvent.ACTION_UP;

import android.view.View;
import android.view.ViewGroup;

import android.widget.Toast;

import com.myappconverter.java.foundations.NSMutableSet;
import com.myappconverter.java.foundations.NSSet;

import com.myappconverter.mapping.utils.GenericMainContext;

import com.myappconverter.uikit.myappclasses.BaseAppDelegate;
import com.myappconverter.uikit.myappclasses.MyAppController;
import com.myappconverter.uikit.myappclasses.MyAppTouch;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class TouchUtil {
    public void handleTouch(View v, MotionEvent event, int[] tapcount,
        long[] last_tap_timestamp, float[] prevX, float[] prevY,
        NSMutableSet<MyAppTouch> touches) {
        UIKitEnums.UITouchPhase phase;

        switch (event.getAction()) {
        case ACTION_DOWN:

            // Calculate tap count
            long current_tap_timestamp = System.currentTimeMillis();

            if ((current_tap_timestamp - last_tap_timestamp[0]) < 400) {
                tapcount[0]++;
            } else {
                tapcount[0] = 1;
            }

            last_tap_timestamp[0] = current_tap_timestamp;

            phase = UIKitEnums.UITouchPhase.UITouchPhaseBegan;

            break;

        case ACTION_MOVE:
            phase = UIKitEnums.UITouchPhase.UITouchPhaseMoved;

            break;

        case ACTION_UP:
            phase = UIKitEnums.UITouchPhase.UITouchPhaseEnded;

            break;

        case ACTION_CANCEL:default:
            phase = UIKitEnums.UITouchPhase.UITouchPhaseCancelled;

            break;
        }

        float deltaY = 0; // ActionBarHeight !! TODO
        touches = new NSMutableSet<MyAppTouch>();

        if (event.getPointerCount() > 1) {
            Toast.makeText(GenericMainContext.sharedContext,
                "event.getPointerCount() > 1 : " + event.getPointerCount(),
                Toast.LENGTH_SHORT).show();
        }

        for (int p = event.getPointerCount() - 1; p >= 0; p--) {
            MyAppTouch touch = new MyAppTouch((int) (0.5f + event.getX(p)),
                    (int) (0.5f + event.getY(p) + deltaY),
                    (int) (0.5f + prevX[0]), (int) (0.5f + prevY[0] + deltaY),
                    v, System.currentTimeMillis() / 1000d, phase, tapcount[0]);
            ((NSMutableSet) touches).addObject(touch);
        }

        switch (event.getAction()) {
        case ACTION_DOWN:
            prevX[0] = event.getRawX();
            prevY[0] = event.getRawY();
            invokeTouchAction("touchesBeganWithEvent", v,
                touches.immutableClone(), event);

            break;

        case ACTION_MOVE:
            invokeTouchAction("touchesMovedWithEvent", v,
                touches.immutableClone(), event);

            break;

        case ACTION_UP:
            invokeTouchAction("touchesEndedWithEvent", v,
                touches.immutableClone(), event);

            break;

        case ACTION_CANCEL:
            invokeTouchAction("touchesCancelledWithEvent", v,
                touches.immutableClone(), event);

        default:
            break;
        }
    }

    public void invokeTouchAction(String name, Object target,
        NSSet<MyAppTouch> touches, MotionEvent event) {
        try {
            Method method = target.getClass()
                                  .getDeclaredMethod(name, touches.getClass(),
                    event.getClass());
            method.invoke(target, touches, event);
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            //            e.printStackTrace();
            if (target instanceof ViewGroup) {
                MyAppController currentVC = (MyAppController) ((BaseAppDelegate) GenericMainContext.sharedContext
                                                               .getApplication()).getViewControllers()
                                                               .lastObject();

                if (((ViewGroup) target).equals(currentVC.getView())) {
                    invokeTouchAction(name, currentVC, touches, event);
                } else if ((((ViewGroup) target).getParent() != null) &
                        ((ViewGroup) target).getParent() instanceof ViewGroup) {
                    invokeTouchAction(name, ((ViewGroup) target).getParent(),
                        touches, event);
                } else {
                    return;
                }
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
