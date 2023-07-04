package com.facebook.react.views.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* loaded from: classes3.dex */
public class b extends com.facebook.react.uimanager.events.c<b> {

    /* renamed from: a  reason: collision with root package name */
    private final double f12591a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f12592b;

    public b(int i11, double d11, boolean z11) {
        super(i11);
        this.f12591a = d11;
        this.f12592b = z11;
    }

    private WritableMap c() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", getViewTag());
        createMap.putDouble("value", a());
        createMap.putBoolean("fromUser", b());
        return createMap;
    }

    public double a() {
        return this.f12591a;
    }

    public boolean b() {
        return this.f12592b;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), c());
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topChange";
    }
}