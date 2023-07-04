package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class q extends b {

    /* renamed from: e  reason: collision with root package name */
    private final l f11802e;

    /* renamed from: f  reason: collision with root package name */
    private final int f11803f;

    /* renamed from: g  reason: collision with root package name */
    private final int f11804g;

    /* renamed from: h  reason: collision with root package name */
    private final int f11805h;

    /* renamed from: i  reason: collision with root package name */
    private final JavaOnlyMap f11806i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(ReadableMap readableMap, l lVar) {
        this.f11802e = lVar;
        this.f11803f = readableMap.getInt("animationId");
        this.f11804g = readableMap.getInt("toValue");
        this.f11805h = readableMap.getInt("value");
        this.f11806i = JavaOnlyMap.deepClone(readableMap.getMap("animationConfig"));
    }

    @Override // com.facebook.react.animated.b
    public String d() {
        return "TrackingAnimatedNode[" + this.f11718d + "]: animationID: " + this.f11803f + " toValueNode: " + this.f11804g + " valueNode: " + this.f11805h + " animationConfig: " + this.f11806i;
    }

    @Override // com.facebook.react.animated.b
    public void g() {
        this.f11806i.putDouble("toValue", ((s) this.f11802e.n(this.f11804g)).k());
        this.f11802e.x(this.f11803f, this.f11805h, this.f11806i, null);
    }
}