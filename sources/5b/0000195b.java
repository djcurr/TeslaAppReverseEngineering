package com.facebook.react.uimanager;

import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public class RootViewManager extends ViewGroupManager<ViewGroup> {
    public static final String REACT_CLASS = "RootView";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ViewGroup createViewInstance(n0 n0Var) {
        return new FrameLayout(n0Var);
    }
}