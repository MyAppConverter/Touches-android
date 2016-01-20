package com.myappconverter.uikit.myappclasses;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

import com.myappconverter.java.foundations.NSIndexPath;
import com.myappconverter.java.uikit.custom.events.ListViewDisplayed;
import com.myappconverter.java.uikit.custom.listeners.CustomListViewListener;
import com.myappconverter.uikit.bridges.protocols.UITableViewDataSource;
import com.myappconverter.uikit.bridges.protocols.UITableViewDelegate;
import com.myappconverter.uikit.util.UIKitEnums.UITableViewStyle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

;

public class MyAppListView extends ListView {

	private ArrayList<CustomListViewListener> listenerList = new ArrayList<CustomListViewListener>();
	
	
	public int mcurrentViewIndex = 0;
	private NSIndexPath mindexPathForSelectedRow;
	private Class mCellClass;
	private float mrowHeight=-1f;// default value
	private UITableViewStyle mstyle =UITableViewStyle.UITableViewStylePlain;//default value
	private boolean mallowsSelection=true;//default value
	private MyAppNib mregistredNibFile;
    private UITableViewDelegate delegate ;
    private UITableViewDataSource dataSource;
	private int numberOfSections;
	private int numberOfRows;
	private Map<Integer, Integer> dicOfsections = new HashMap<>();

    public void setDelegate(UITableViewDelegate delegate){
        this.delegate = delegate ;
    }

    public void setDataSource(UITableViewDataSource dataSource){
        this.dataSource = dataSource ;
    }

    public UITableViewDelegate getDelegate(){
        return this.delegate ;
    }

    public UITableViewDataSource getDataSource(){
       return this.dataSource;
    }

	public float getrowHeight() {
		if(mrowHeight==-1)
			return 44f;
		return mrowHeight;
	}

	public boolean getAllowsSelection() {
		return mallowsSelection;
	}


	public MyAppNib getRegistredNibFile() {
		return mregistredNibFile;
	}

	public void setRegistredNibFile(MyAppNib registredNibFile) {
		this.mregistredNibFile = registredNibFile;
	}

	public void setAllowsSelection(boolean allowsSelection) {
		this.mallowsSelection = allowsSelection;
	}


	public void setrowHeight(float mrowHeight) {
		this.mrowHeight = mrowHeight;
	}

	public UITableViewStyle getStyle() {
		return mstyle;
	}

	public void setStyle(UITableViewStyle style) {
		this.mstyle = style;
	}

	public Class getmCellClass() {
		return mCellClass;
	}

	public void setmCellClass(Class CellClass) {
		this.mCellClass = CellClass;
	}

	public NSIndexPath getIndexPathForSelectedRow() {
		return mindexPathForSelectedRow;
	}

	public void setIndexPathForSelectedRow(NSIndexPath indexPathForSelectedRow) {
		this.mindexPathForSelectedRow = indexPathForSelectedRow;
	}

	public MyAppListView(Context context) {
		super(context);
	}

	public MyAppListView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public MyAppListView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	@Override
	protected void onAttachedToWindow() {
		super.onAttachedToWindow();

	}

	@Override
	protected void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) {
		super.onOverScrolled(scrollX, scrollY, clampedX, clampedY);
		processDisplayedEvent(new ListViewDisplayed(this));
	}

	// Register an event listener
	public synchronized void addCustomListener(CustomListViewListener listener) {
		if (!listenerList.contains(listener)) {
			listenerList.add(listener);
		}
	}

	private void processDisplayedEvent(ListViewDisplayed event) {
		ArrayList<CustomListViewListener> templistenerList;

		synchronized (this) {
			if (listenerList.size() == 0) {
				return;
			}
			templistenerList = (ArrayList<CustomListViewListener>) listenerList.clone();
		}

		for (CustomListViewListener listener : templistenerList) {
			listener.listDisplayed(event);
		}
	}

	@Override
	public void addHeaderView(View v) {
		super.addHeaderView(v);
	}

	@Override
	public void addHeaderView(View v, Object data, boolean isSelectable) {

		super.addHeaderView(v, data, isSelectable);
	}

	@Override
	public void addFooterView(View v) {

		super.addFooterView(v);
	}

	@Override
	public void addFooterView(View v, Object data, boolean isSelectable) {
		super.addFooterView(v, data, isSelectable);
	}

	public int getNumberOfSections() {
		return numberOfSections;
	}

	public void setNumberOfSections(int numberOfSections) {
		this.numberOfSections = numberOfSections;
	}

	public int getNumberOfRows() {
		return numberOfRows;
	}

	public void setNumberOfRows(int numberOfRows) {
		this.numberOfRows = numberOfRows;
	}

	public Map<Integer, Integer> getDicOfsections() {
		return dicOfsections;
	}

	public void setDicOfsections(Map<Integer, Integer> indexOfListView) {
		this.dicOfsections = indexOfListView;
	}

}
