package com.oney.WebRTCModule;

import com.facebook.react.uimanager.SimpleViewManager;

/* loaded from: classes2.dex */
public class RTCVideoViewManager extends SimpleViewManager<u0> {
    private static final String REACT_CLASS = "RTCVideoView";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ng.a(name = "mirror")
    public void setMirror(u0 u0Var, boolean z11) {
        u0Var.setMirror(z11);
    }

    @ng.a(name = "objectFit")
    public void setObjectFit(u0 u0Var, String str) {
        u0Var.setObjectFit(str);
    }

    @ng.a(name = "streamURL")
    public void setStreamURL(u0 u0Var, String str) {
        u0Var.setStreamURL(str);
    }

    @ng.a(name = "zOrder")
    public void setZOrder(u0 u0Var, int i11) {
        u0Var.setZOrder(i11);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public u0 createViewInstance(com.facebook.react.uimanager.n0 n0Var) {
        return new u0(n0Var);
    }
}