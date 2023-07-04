package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.p;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* loaded from: classes3.dex */
public class b extends c<b> {

    /* renamed from: a  reason: collision with root package name */
    private final int f12247a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12248b;

    @Deprecated
    public b(int i11, int i12, int i13) {
        this(-1, i11, i12, i13);
    }

    @Override // com.facebook.react.uimanager.events.c
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble(Snapshot.WIDTH, p.a(this.f12247a));
        createMap.putDouble(Snapshot.HEIGHT, p.a(this.f12248b));
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topContentSizeChange";
    }

    public b(int i11, int i12, int i13, int i14) {
        super(i11, i12);
        this.f12247a = i13;
        this.f12248b = i14;
    }
}