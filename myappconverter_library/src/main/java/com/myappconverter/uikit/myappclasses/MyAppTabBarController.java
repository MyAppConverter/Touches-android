package com.myappconverter.uikit.myappclasses;

import android.os.Bundle;

import android.support.annotation.Nullable;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

import android.util.Log;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myappconverter.java.foundations.NSArray;
import com.myappconverter.java.foundations.NSString;

import com.myappconverter.mapping.utils.AndroidRessourcesUtils;
import com.myappconverter.mapping.utils.GenericMainContext;

import com.myappconverter.uikit.bridges.protocols.UITabBarControllerDelegate;
import com.myappconverter.uikit.bridges.protocols.UITabBarDelegate;
import com.myappconverter.uikit.util.SlidingTabLayout;


public class MyAppTabBarController extends MyAppController
    implements UITabBarDelegate {
    public NSArray<MyAppController> viewControllers = null;
    public SlidingTabLayout tabBar;
    public int selectedIndex;
    public MyAppController selectedViewController;
    public NSArray<MyAppController> customizableViewControllers;
    public UITabBarControllerDelegate delegate;
    private ViewPagerAdapter adapter;
    private ViewPager pager;
    private SlidingTabLayout tabs;

    @Override
    public View getView() {
        return super.getView();
    }

    @Override
    public void loadView() {
    }

    @Override
    public void viewDidLoad() {
    }

    @Override
    public void viewWillAppear(boolean animated) {
    }

    @Override
    public void viewDidUnLoad() {
    }

    @Override
    public MyAppController init() {
        LayoutInflater inflater = LayoutInflater.from(GenericMainContext.sharedContext);
        final View view = inflater.inflate(AndroidRessourcesUtils.getResID(
                    "tabbarcontroller", "layout"), null, false);
        this.view = view;
        loadView();

        // this.tabBarItem = getTabBarController().getTabBar().newTab().setText("First").setIcon(R.drawable.first);
        try {
            ((ViewGroup) getView().getParent()).removeAllViews();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return this;
    }

    @Override
    public void viewWillDisappear(boolean animated) {
    }

    @Override
    public void release() {
    }

    @Override
    public void viewDidAppear(boolean animated) {
    }

    @Override
    public void didReceiveMemoryWarning() {
    }

    @Override
    public void tabBarDidBeginCustomizingItems(SlidingTabLayout tabBar,
        NSArray<MyAppTabBarItem> items) {
    }

    @Override
    public void tabBarDidEndCustomizingItemsChanged(SlidingTabLayout tabBar,
        NSArray<MyAppTabBarItem> items, boolean changed) {
    }

    @Override
    public void tabBarDidSelectItem(SlidingTabLayout tabBar,
        MyAppTabBarItem item) {
    }

    @Override
    public void tabBarWillBeginCustomizingItems(SlidingTabLayout tabBar,
        NSArray<MyAppTabBarItem> items) {
    }

    @Override
    public void tabBarWillEndCustomizingItemsChanged(SlidingTabLayout tabBar,
        NSArray<MyAppTabBarItem> items, boolean changed) {
    }

    public NSArray<MyAppController> getViewControllers() {
        return viewControllers;
    }

    public void setViewControllers(NSArray<MyAppController> viewControllers) {
        this.viewControllers = viewControllers;
    }

    public int selectedIndex() {
        return this.selectedIndex;
    }

    public void setSelectedIndex(int selectedIndex) {
        this.selectedIndex = selectedIndex;
    }

    public MyAppController selectedViewController() {
        return this.selectedViewController;
    }

    public void setSelectedViewController(
        MyAppController selectedViewController) {
        this.selectedViewController = selectedViewController;
    }

    public SlidingTabLayout tabBar() {
        return this.tabBar;
    }

    public SlidingTabLayout getTabBar() {
        return tabBar;
    }

    public void setTabBar(SlidingTabLayout tabBar) {
        this.tabBar = tabBar;
    }

    public NSArray<MyAppController> getCustomizableViewControllers() {
        return customizableViewControllers;
    }

    public void setCustomizableViewControllers(
        NSArray<MyAppController> customizableViewControllers) {
        this.customizableViewControllers = customizableViewControllers;
    }

    public int getSelectedIndex() {
        return selectedIndex;
    }

    public MyAppController getSelectedViewController() {
        return selectedViewController;
    }

    public void setViewControllersAnimated(
        NSArray<MyAppController> viewControllers, boolean animated) {
        setViewControllers(viewControllers);

        for (MyAppController controller : viewControllers) {
            controller.setTabBarController(this);
        }

        // Creating The ViewPagerAdapter and Passing Fragment Manager, and viewControllers.
        adapter = new ViewPagerAdapter(((FragmentActivity) GenericMainContext.sharedContext).getSupportFragmentManager(),
                viewControllers);

        // Assigning ViewPager View and setting the adapter
        pager = (ViewPager) getView()
                                .findViewById(AndroidRessourcesUtils.getResID(
                    "pager", "id"));
        pager.setAdapter(adapter);
        pager.setOffscreenPageLimit(1);

        // Assiging the Sliding Tab Layout View
        tabs = (SlidingTabLayout) getView()
                                      .findViewById(AndroidRessourcesUtils.getResID(
                    "tabs", "id"));
        tabs.setDistributeEvenly(true); // To make the Tabs Fixed set this true, This makes the tabs Space Evenly in Available width

        // Setting Custom Color for the Scroll bar indicator of the Tab View
        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
                @Override
                public int getIndicatorColor(int position) {
                    return GenericMainContext.sharedContext.getResources()
                                                           .getColor(AndroidRessourcesUtils.getResID(
                            "tabsScrollColor", "color"));
                }
            });

        // Setting the ViewPager For the SlidingTabsLayout
        tabs.setViewPager(pager);

        tabs.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset,
                    int positionOffsetPixels) {
                }

                @Override
                public void onPageSelected(int position) {
                    Log.d("selected", "selected" + position);
                }

                @Override
                public void onPageScrollStateChanged(int state) {
                }
            });
    }

    public class ViewPagerAdapter extends FragmentStatePagerAdapter {
        NSArray<MyAppController> controllers;
        NSArray<MyAppTabBarItem> items;

        public ViewPagerAdapter(FragmentManager fm,
            NSArray<MyAppController> controllers) {
            super(fm);
            this.controllers = controllers;
        }

        // This method return the fragment for the every position in the View Pager
        @Override
        public Fragment getItem(int position) {
            if (controllers != null) {
                TabPresenterFragment tab = new TabPresenterFragment();
                tab.setViewController(controllers.objectAtIndex(position));

                return tab;
            } else if ((items != null) && (items.count() > 0)) {
                TabPresenterFragment tab = new TabPresenterFragment();

                return tab;
            } else {
                return new TabPresenterFragment();
            }
        }

        // This method return the titles for the Tabs in the Tab Strip
        @Override
        public CharSequence getPageTitle(int position) {
            if ((controllers != null) && (controllers.count() > position)) {
                MyAppController appController = controllers.objectAtIndex(position);
                NSString title = appController.getTabBarItem().getTitle();

                return title.getWrappedString();
            } else if ((items != null) && (items.count() > position)) {
                try {
                    return items.objectAtIndex(position).getTitle()
                                .getWrappedString();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            return "";
        }

        // This method return the Number of tabs for the tabs Strip
        @Override
        public int getCount() {
            if (controllers != null) {
                return controllers.count();
            } else if (items != null) {
                return items.count();
            }

            return 0;
        }

        public NSArray<MyAppTabBarItem> getItems() {
            return items;
        }

        public void setItems(NSArray<MyAppTabBarItem> items) {
            this.items = items;
        }
    }

    public static class TabPresenterFragment extends Fragment {
        MyAppController viewController;
        MyAppTabBarItem tabbarItem;

        @Override
        public View onCreateView(LayoutInflater inflater,
            @Nullable
        ViewGroup container, @Nullable
        Bundle savedInstanceState) {
            //container.removeAllViewsInLayout();
            //container.addView(getView());
            View view = getView();

            //view.setLayoutParams(container.getLayoutParams());
            //return  container;
            return view;
        }

        public View getView() {
            if (viewController == null) {
                return new View(GenericMainContext.sharedContext);
            }

            viewController.viewDidLoad();
            viewController.viewWillAppear(false);
            viewController.viewWillLayoutSubviews();

            return viewController.getView();
        }

        public MyAppController getViewController() {
            return viewController;
        }

        public void setViewController(MyAppController viewController) {
            this.viewController = viewController;
        }

        public MyAppTabBarItem getTabbarItem() {
            return tabbarItem;
        }

        public void setTabbarItem(MyAppTabBarItem tabbarItem) {
            this.tabbarItem = tabbarItem;
        }
    }
}
