package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes3.dex */
class j extends s {

    /* renamed from: i  reason: collision with root package name */
    private final l f11755i;

    /* renamed from: j  reason: collision with root package name */
    private final int f11756j;

    /* renamed from: k  reason: collision with root package name */
    private final double f11757k;

    public j(ReadableMap readableMap, l lVar) {
        this.f11755i = lVar;
        this.f11756j = readableMap.getInt("input");
        this.f11757k = readableMap.getDouble("modulus");
    }

    @Override // com.facebook.react.animated.s, com.facebook.react.animated.b
    public String d() {
        return "NativeAnimatedNodesManager[" + this.f11718d + "] inputNode: " + this.f11756j + " modulus: " + this.f11757k + " super: " + super.d();
    }

    @Override // com.facebook.react.animated.b
    public void g() {
        b n11 = this.f11755i.n(this.f11756j);
        if (n11 != null && (n11 instanceof s)) {
            double k11 = ((s) n11).k();
            double d11 = this.f11757k;
            this.f11813f = ((k11 % d11) + d11) % d11;
            return;
        }
        throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.modulus node");
    }
}