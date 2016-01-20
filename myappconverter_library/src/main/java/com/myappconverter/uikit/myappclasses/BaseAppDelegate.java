package com.myappconverter.uikit.myappclasses;

import android.content.Context;
import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;

import com.myappconverter.java.coregraphics.CGRect;
import com.myappconverter.java.foundations.NSArray;
import com.myappconverter.java.foundations.NSCoder;
import com.myappconverter.java.foundations.NSData;
import com.myappconverter.java.foundations.NSDictionary;
import com.myappconverter.java.foundations.NSError;
import com.myappconverter.java.foundations.NSString;
import com.myappconverter.java.foundations.NSURL;
import com.myappconverter.mapping.utils.GenericMainContext;
import com.myappconverter.uikit.bridges.protocols.UIApplicationDelegate;
import com.myappconverter.uikit.util.UIKitEnums.UIInterfaceOrientation;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class BaseAppDelegate extends MultiDexApplication implements UIApplicationDelegate {

	public Stack<SoftReference<MyAppController>> viewControllersStack = new Stack<SoftReference<MyAppController>>();
	public MyAppWindow contentFrame;

	public static Map<String, String> identifiers = new HashMap<String, String>();


	public static void addIdentifiers(String identifier, String value) {
		identifiers.put(identifier, value);
	}

	protected void attachBaseContext(Context base) {
		super.attachBaseContext(base);
		MultiDex.install(this);
	}

	private Map<String, MyAppStoryboardSegue> segueDict;

	public void addSegue(String identifier, String destination, String kind) {
		segueDict.put(identifier, new MyAppStoryboardSegue(identifier, destination, kind));
	}

	public MyAppStoryboardSegue getSegueWithIdentifier(String identifier) {
		return segueDict.get(identifier);
	}

	public MyAppController popViewControllerAnimated(boolean animated) {
		if (viewControllersStack == null) {
			viewControllersStack = new Stack<SoftReference<MyAppController>>();
			GenericMainContext.sharedContext.finish();
		}

		if (viewControllersStack.size() == 1) {
			GenericMainContext.sharedContext.finish();
			GenericMainContext.sharedContext.finish();
		} else if (viewControllersStack.size() > 1) {
			MyAppController popedUivc = viewControllersStack.pop().get();
			MyAppController toBringOut = viewControllersStack.pop().get(); // popLast();
			pushViewControllerAnimated(toBringOut, animated);

			return popedUivc;
		} else {
			GenericMainContext.sharedContext.finish();
		}

		return null;
	}

	public MyAppController popToViewControllerAnimated(MyAppController controller, boolean animated) {
		SoftReference<MyAppController> toPutFirst = new SoftReference<MyAppController>(controller);

		if (viewControllersStack == null) {
			viewControllersStack = new Stack<SoftReference<MyAppController>>();
			GenericMainContext.sharedContext.finish();
		}

		if (viewControllersStack.size() == 1) {
			GenericMainContext.sharedContext.finish();
			GenericMainContext.sharedContext.finish();
		} else if (viewControllersStack.size() > 1) {
			if (viewControllersStack.contains(toPutFirst)) {
				viewControllersStack.removeElement(toPutFirst);
				viewControllersStack.push(toPutFirst);
				pushViewControllerAnimated(toPutFirst.get(), animated);

				return toPutFirst.get();
			}
		} else {
			GenericMainContext.sharedContext.finish();
		}

		return null;
	}

	public List<MyAppController> popToRootViewControllerAnimated(boolean animated) {
		List<MyAppController> result = new ArrayList<>();
		if (viewControllersStack != null && viewControllersStack.size() > 1) {

			List<SoftReference<MyAppController>> softControllers = viewControllersStack.subList(1, viewControllersStack.size() - 1);
			if (softControllers != null && softControllers.size() > 0) {

				for (Iterator iterator = softControllers.iterator(); iterator.hasNext();) {
					SoftReference<MyAppController> softReference = (SoftReference<MyAppController>) iterator.next();

					result.add(softReference.get());
				}
			}
			SoftReference<MyAppController> rootViewControllerRef = viewControllersStack.lastElement();
			if (rootViewControllerRef != null) {
				viewControllersStack = new Stack<SoftReference<MyAppController>>();
				pushViewControllerAnimated(rootViewControllerRef.get(), animated);
			}
		}
		return result;
	}

	public void pushViewControllerAnimated(MyAppController toBringOut, boolean animated) {
		viewControllersStack.push(new SoftReference(toBringOut));
		toBringOut.viewDidLoad();
		toBringOut.viewWillAppear(false);
		toBringOut.viewWillLayoutSubviews();
		if (contentFrame != null) {
			contentFrame.removeAllViews();
			contentFrame.addView(toBringOut.getView(), LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
		}
		toBringOut.viewDidLayoutSubviews();
		toBringOut.viewDidAppear(false);
	}

	public NSArray<MyAppController> getViewControllers() {
		NSArray<MyAppController> viewControllers = NSArray.array();
		Object[] arraViewControllers = viewControllersStack.toArray();

		for (int i = 0; i < arraViewControllers.length; i++) {
			SoftReference<MyAppController> controller = (SoftReference<MyAppController>) arraViewControllers[i];
			viewControllers.getWrappedList().add(controller.get());
		}

		return viewControllers;
	}


	public NSArray<View> getAllSubviews(View view) {
		NSArray<View> subviews = new NSArray<View>();
		if (view != null) {
			for (int i = 0; i < ((ViewGroup) view).getChildCount(); ++i) {
				View child = ((ViewGroup) view).getChildAt(i);
				subviews.getWrappedList().add(child);
				if (child instanceof ViewGroup && ((ViewGroup) child).getChildCount() > 0) {
					subviews.getWrappedList().addAll(getAllSubviews(child).getWrappedList());
				}
			}
			return subviews;
		}
		return new NSArray<View>();
	}

	// /////////////////////////////////////Other methods///////////////////////

	@Override
	public void applicationDidChangeStatusBarFrame(MyAppApplication application, CGRect oldStatusBarFrame) {
	}

	@Override
	public void applicationDidChangeStatusBarOrientation(MyAppApplication application) {
	}

	@Override
	public void applicationDidDecodeRestorableStateWithCoder(MyAppApplication application, NSCoder coder) {
	}

	@Override
	public void applicationDidFailToRegisterForRemoteNotificationsWithError(MyAppApplication application, NSError error) {
	}

	@Override
	public boolean applicationDidFinishLaunchingWithOptions(MyAppApplication application, NSDictionary launchOptions) {
		return false;
	}

	@Override
	public void applicationDidReceiveLocalNotification(MyAppApplication application, Object notification) {
	}

	@Override
	public void applicationDidReceiveRemoteNotification(MyAppApplication application, NSDictionary userInfo) {
	}

	@Override
	public void applicationDidRegisterForRemoteNotificationsWithDeviceToken(MyAppApplication application, NSData deviceToken) {
	}

	@Override
	public void applicationHandleOpenURL(MyAppApplication application, NSURL url) {
	}

	@Override
	public boolean applicationOpenURLSourceApplicationAnnotation(MyAppApplication application, NSURL url, NSString sourceApplication,
																 Object annotation) {
		return false;
	}

	@Override
	public boolean applicationShouldRestoreApplicationState(MyAppApplication application, NSCoder coder) {
		return false;
	}

	@Override
	public boolean applicationShouldSaveApplicationState(MyAppApplication application, NSCoder coder) {
		return false;
	}

	@Override
	public int applicationSupportedInterfaceOrientationsForWindow(MyAppApplication application, ViewGroup window) {
		return 0;
	}

	@Override
	public MyAppController applicationViewControllerWithRestorationIdentifierPathCoder(MyAppApplication application,
																					   NSArray identifierComponents, NSCoder coder) {
		return null;
	}

	@Override
	public void applicationWillChangeStatusBarFrame(MyAppApplication application, CGRect newStatusBarFrame) {
	}

	@Override
	public void applicationWillChangeStatusBarOrientationDuration(MyAppApplication application,
																  UIInterfaceOrientation newStatusBarOrientation, double duration) {
	}

	@Override
	public void applicationWillEncodeRestorableStateWithCoder(MyAppApplication application, NSCoder coder) {
	}

	@Override
	public boolean applicationWillFinishLaunchingWithOptions(MyAppApplication application, NSDictionary launchOptions) {
		return false;
	}

	@Override
	public void applicationDidBecomeActive(MyAppApplication application) {
	}

	@Override
	public void applicationDidEnterBackground(MyAppApplication application) {
	}

	@Override
	public void applicationDidFinishLaunching(MyAppApplication application) {
	}

	@Override
	public void applicationDidReceiveMemoryWarning(MyAppApplication application) {
	}

	@Override
	public void applicationProtectedDataDidBecomeAvailable(MyAppApplication application) {
	}

	@Override
	public void applicationProtectedDataWillBecomeUnavailable(MyAppApplication application) {
	}

	@Override
	public void applicationSignificantTimeChange(MyAppApplication application) {
	}

	@Override
	public void applicationWillEnterForeground(MyAppApplication application) {
	}

	@Override
	public void applicationWillResignActive(MyAppApplication application) {
	}

	@Override
	public void applicationWillTerminate(MyAppApplication application) {
	}

	@Override
	public MyAppWindow getWindow() {
		return new MyAppWindow();
	}

	@Override
	public void setWindow(MyAppWindow window) {
	}

    /*
	public MyAppNavigationBar getNavigationBar() {
		if (myAppNavigationBar == null) {
			myAppNavigationBar = (MyAppNavigationBar) GenericMainContext.sharedContext.findViewById(AndroidRessourcesUtils.getResID(
					"navbar", "id"));
			myAppNavigationBar.setVisibility(View.VISIBLE);
		}
		return myAppNavigationBar;
	}

    public void setToolbar(MyAppToolbar toolbar){
        this.toolbar = toolbar;
    }
    public MyAppToolbar getToolbar(){
        return this.toolbar ;
    }

	public void setNavigationBar(MyAppNavigationBar myAppNavigationBar) {
		this.myAppNavigationBar = myAppNavigationBar;
	}

	public void showNavigationBar(boolean show){
		if (show) {
			app_action_bar.setVisibility(View.VISIBLE);
		}else {
			app_action_bar.setVisibility(View.GONE);
		}
	}
	*/


}
