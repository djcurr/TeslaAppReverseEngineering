package org.reactnative.maskedview;

import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.n0;

/* loaded from: classes5.dex */
public class RNCMaskedViewManager extends ViewGroupManager<a> {
    private static final String REACT_CLASS = "RNCMaskedView";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ng.a(name = "androidRenderingMode")
    public void setAndroidRenderingMode(a aVar, String str) {
        if (str != null) {
            aVar.setRenderingMode(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(n0 n0Var) {
        return new a(n0Var);
    }
}