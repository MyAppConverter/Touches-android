package com.myappconverter.uikit.myappclasses;

import com.myappconverter.java.uikit.constants.UIGeometry.UIRectEdge;


public class MyAppScreenEdgePanGestureRecognizer
    extends MyAppPanGestureRecognizer {
    private UIRectEdge edges;

    public UIRectEdge getEdges() {
        return edges;
    }

    public void setEdges(UIRectEdge edges) {
        this.edges = edges;
    }
}
