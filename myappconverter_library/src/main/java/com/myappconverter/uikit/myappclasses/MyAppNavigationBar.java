package com.myappconverter.uikit.myappclasses;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.MenuItem;

import com.myappconverter.java.foundations.NSArray;
import com.myappconverter.java.foundations.SEL;
import com.myappconverter.mapping.utils.InvokableHelper;
import com.myappconverter.uikit.bridges.protocols.UINavigationBarDelegate;
import com.myappconverter.uikit.util.UIViewProperty;

public class MyAppNavigationBar extends Toolbar {

    private NSArray<MyAppNavigationItem> mItems=new NSArray<>();
    private UINavigationBarDelegate mDelegate;
    private Integer tintColor ;

    public UINavigationBarDelegate getDelegate() {
        return mDelegate;
    }

    public void setDelegate(UINavigationBarDelegate delegate) {
        this.mDelegate = delegate;
    }

    public NSArray<MyAppNavigationItem> getItems() {
        return mItems;
    }

    public void setItems(NSArray<MyAppNavigationItem> items) {
        this.mItems = items;
    }

    public MyAppNavigationBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    public void setTintColor(Integer color)
    {
        this.tintColor = color ;
    }

    public Integer getTintColor(){
        return tintColor;
    }

    public MyAppNavigationBar(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    public MyAppNavigationBar(Context context) {
        super(context);
        setTag(new UIViewProperty());
    }

    public void syncUI(){

        MyAppNavigationItem item = getItems().objectAtIndex(getItems().count()-1);
        if(item != null) {


            if(item.getTitle()!=null){
                setTitle(item.getTitle().getWrappedString());
            }

            //Updating Right Item
            setMenu(item.getRightBarButtonItem());
            //Updating left Item
            setMenu(item.getLeftBarButtonItem());
            //Updating Right Items
            for(MyAppBarButtonItem bitem  : item.getRightBarButtonItems()){
                setMenu(bitem);
            }
            //Updating Left Items
            for(MyAppBarButtonItem bitem  : item.getLeftBarButtonItems()){
                setMenu(bitem);
            }
        }
    }

    void setMenu(MyAppBarButtonItem item){
        //((BaseAppDelegate) GenericMainContext.sharedContext.getApplication()).myAppNavigationBar.getMenu().add(item.getTitle().getWrappedString());
        if(item!=null) {
            MenuItem mitem = getMenu().add(item.getTitle().getWrappedString());
            mitem.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
            item.setMenuItem(mitem);
            final SEL sel = item.getActionTarget();
            final Object targetAction = item.getTargetAction();

            mitem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {

                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    try {
                        InvokableHelper.invoke(targetAction, sel.getMethodName());
                    } catch (IllegalArgumentException e) {

                    }
                    return false;
                }
            });
        }

    }

}
