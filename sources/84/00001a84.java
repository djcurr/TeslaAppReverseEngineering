package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* loaded from: classes3.dex */
public class b extends com.facebook.react.uimanager.events.c<e> {

    /* renamed from: a  reason: collision with root package name */
    private float f12741a;

    /* renamed from: b  reason: collision with root package name */
    private float f12742b;

    public b(int i11, int i12, float f11, float f12) {
        super(i11, i12);
        this.f12741a = f11;
        this.f12742b = f12;
    }

    @Override // com.facebook.react.uimanager.events.c
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble(Snapshot.WIDTH, this.f12741a);
        createMap2.putDouble(Snapshot.HEIGHT, this.f12742b);
        createMap.putMap("contentSize", createMap2);
        createMap.putInt("target", getViewTag());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topContentSizeChange";
    }
}