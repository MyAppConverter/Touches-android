package com.myappconverter.uikit.myappclasses;

import android.graphics.pdf.PdfDocument;
import android.graphics.pdf.PdfDocument.Page;

import com.myappconverter.java.coregraphics.CGContext;
import com.myappconverter.java.coregraphics.CGContextRef;

import java.util.Stack;


public class MyAppGraphics {
    public static CGContext cgContext = new CGContext();

    // only for pdf contexts
    public static PdfDocument pdfDocument = null;
    public static Page currentPage = null;
    private Stack<CGContextRef> graphicsStack = new Stack<CGContextRef>();

    public static CGContext getCurrentCGContext() {
        return getCgContext();
    }

    public static CGContext getCgContext() {
        return cgContext;
    }

    public Stack<CGContextRef> getGraphicsStack() {
        return graphicsStack;
    }
}
