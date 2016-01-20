package com.myappconverter.util;

public class PerformBlocks {
    public static interface VoidBlockBool {
        public void perform(boolean finished);
    }

    public static interface VoidBlock {
        public void perform();
    }
}
