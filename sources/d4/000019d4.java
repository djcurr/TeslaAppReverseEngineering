package com.facebook.react.uimanager;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* loaded from: classes3.dex */
public class o extends com.facebook.react.uimanager.events.c<o> {

    /* renamed from: e  reason: collision with root package name */
    private static final v3.g<o> f12379e = new v3.g<>(20);

    /* renamed from: a  reason: collision with root package name */
    private int f12380a;

    /* renamed from: b  reason: collision with root package name */
    private int f12381b;

    /* renamed from: c  reason: collision with root package name */
    private int f12382c;

    /* renamed from: d  reason: collision with root package name */
    private int f12383d;

    private o() {
    }

    @Deprecated
    public static o b(int i11, int i12, int i13, int i14, int i15) {
        return c(-1, i11, i12, i13, i14, i15);
    }

    public static o c(int i11, int i12, int i13, int i14, int i15, int i16) {
        o b11 = f12379e.b();
        if (b11 == null) {
            b11 = new o();
        }
        b11.a(i11, i12, i13, i14, i15, i16);
        return b11;
    }

    protected void a(int i11, int i12, int i13, int i14, int i15, int i16) {
        super.init(i11, i12);
        this.f12380a = i13;
        this.f12381b = i14;
        this.f12382c = i15;
        this.f12383d = i16;
    }

    @Override // com.facebook.react.uimanager.events.c
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("x", p.a(this.f12380a));
        createMap.putDouble("y", p.a(this.f12381b));
        createMap.putDouble(Snapshot.WIDTH, p.a(this.f12382c));
        createMap.putDouble(Snapshot.HEIGHT, p.a(this.f12383d));
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap("layout", createMap);
        createMap2.putInt("target", getViewTag());
        return createMap2;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topLayout";
    }

    @Override // com.facebook.react.uimanager.events.c
    public void onDispose() {
        f12379e.a(this);
    }
}