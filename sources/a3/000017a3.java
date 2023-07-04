package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes3.dex */
class s extends b {

    /* renamed from: e  reason: collision with root package name */
    Object f11812e;

    /* renamed from: f  reason: collision with root package name */
    double f11813f;

    /* renamed from: g  reason: collision with root package name */
    double f11814g;

    /* renamed from: h  reason: collision with root package name */
    private c f11815h;

    public s() {
        this.f11812e = null;
        this.f11813f = Double.NaN;
        this.f11814g = 0.0d;
    }

    @Override // com.facebook.react.animated.b
    public String d() {
        return "ValueAnimatedNode[" + this.f11718d + "]: value: " + this.f11813f + " offset: " + this.f11814g;
    }

    public void h() {
        this.f11814g += this.f11813f;
        this.f11813f = 0.0d;
    }

    public void i() {
        this.f11813f += this.f11814g;
        this.f11814g = 0.0d;
    }

    public Object j() {
        return this.f11812e;
    }

    public double k() {
        if (Double.isNaN(this.f11814g + this.f11813f)) {
            g();
        }
        return this.f11814g + this.f11813f;
    }

    public void l() {
        c cVar = this.f11815h;
        if (cVar == null) {
            return;
        }
        cVar.a(k());
    }

    public void m(c cVar) {
        this.f11815h = cVar;
    }

    public s(ReadableMap readableMap) {
        this.f11812e = null;
        this.f11813f = Double.NaN;
        this.f11814g = 0.0d;
        this.f11813f = readableMap.getDouble("value");
        this.f11814g = readableMap.getDouble("offset");
    }
}