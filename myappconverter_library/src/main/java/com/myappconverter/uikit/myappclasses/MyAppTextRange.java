package com.myappconverter.uikit.myappclasses;

public class MyAppTextRange {
    private MyAppTextPosition start;
    private MyAppTextPosition end;
    private boolean empty;

    public MyAppTextPosition getStart() {
        return start;
    }

    public void setStart(MyAppTextPosition start) {
        this.start = start;
    }

    public MyAppTextPosition getEnd() {
        return end;
    }

    public void setEnd(MyAppTextPosition end) {
        this.end = end;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }
}
