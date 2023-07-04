package com.reactnativecommunity.picker;

import com.facebook.react.uimanager.n0;

@fg.a(name = ReactDialogPickerManager.REACT_CLASS)
/* loaded from: classes2.dex */
public class ReactDialogPickerManager extends ReactPickerManager {
    public static final String REACT_CLASS = "RNCAndroidDialogPicker";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public h createViewInstance(n0 n0Var) {
        return new h(n0Var, 0);
    }
}