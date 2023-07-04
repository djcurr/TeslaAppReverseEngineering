package ug;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes3.dex */
public class d extends com.facebook.react.uimanager.events.c<d> {

    /* renamed from: a  reason: collision with root package name */
    private final int f53433a;

    public d(int i11, int i12, int i13) {
        super(i11, i12);
        this.f53433a = i13;
    }

    public int a() {
        return this.f53433a;
    }

    @Override // com.facebook.react.uimanager.events.c
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("drawerState", a());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topDrawerStateChanged";
    }
}