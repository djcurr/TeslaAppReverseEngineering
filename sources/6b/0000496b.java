package com.reactnativecommunity.picker;

import com.facebook.react.uimanager.n0;

@fg.a(name = ReactDropdownPickerManager.REACT_CLASS)
/* loaded from: classes2.dex */
public class ReactDropdownPickerManager extends ReactPickerManager {
    public static final String REACT_CLASS = "RNCAndroidDropdownPicker";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public h createViewInstance(n0 n0Var) {
        return new h(n0Var, 1);
    }
}