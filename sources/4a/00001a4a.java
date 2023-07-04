package com.facebook.react.views.switchview;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.c;

/* loaded from: classes3.dex */
class b extends c<b> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f12603a;

    public b(int i11, int i12, boolean z11) {
        super(i11, i12);
        this.f12603a = z11;
    }

    public boolean a() {
        return this.f12603a;
    }

    @Override // com.facebook.react.uimanager.events.c
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", getViewTag());
        createMap.putBoolean("value", a());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topChange";
    }
}