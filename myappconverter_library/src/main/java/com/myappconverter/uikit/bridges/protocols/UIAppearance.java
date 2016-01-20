package com.myappconverter.uikit.bridges.protocols;

public interface UIAppearance {
    public Object appearance();

    public Object appearanceWhenContainedIn(
        Class<UIAppearanceContainer> containerClass, Object... args);
}
