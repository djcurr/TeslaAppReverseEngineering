package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes3.dex */
class f extends s {

    /* renamed from: i  reason: collision with root package name */
    private final l f11730i;

    /* renamed from: j  reason: collision with root package name */
    private final int f11731j;

    /* renamed from: k  reason: collision with root package name */
    private final double f11732k;

    /* renamed from: l  reason: collision with root package name */
    private final double f11733l;

    /* renamed from: m  reason: collision with root package name */
    private double f11734m = 0.0d;

    public f(ReadableMap readableMap, l lVar) {
        this.f11730i = lVar;
        this.f11731j = readableMap.getInt("input");
        this.f11732k = readableMap.getDouble("min");
        this.f11733l = readableMap.getDouble("max");
        this.f11813f = 0.0d;
    }

    private double n() {
        b n11 = this.f11730i.n(this.f11731j);
        if (n11 != null && (n11 instanceof s)) {
            return ((s) n11).k();
        }
        throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.DiffClamp node");
    }

    @Override // com.facebook.react.animated.s, com.facebook.react.animated.b
    public String d() {
        return "DiffClampAnimatedNode[" + this.f11718d + "]: InputNodeTag: " + this.f11731j + " min: " + this.f11732k + " max: " + this.f11733l + " lastValue: " + this.f11734m + " super: " + super.d();
    }

    @Override // com.facebook.react.animated.b
    public void g() {
        double n11 = n();
        double d11 = n11 - this.f11734m;
        this.f11734m = n11;
        this.f11813f = Math.min(Math.max(this.f11813f + d11, this.f11732k), this.f11733l);
    }
}