package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes3.dex */
class n extends d {

    /* renamed from: e  reason: collision with root package name */
    private long f11780e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11781f;

    /* renamed from: g  reason: collision with root package name */
    private double f11782g;

    /* renamed from: h  reason: collision with root package name */
    private double f11783h;

    /* renamed from: i  reason: collision with root package name */
    private double f11784i;

    /* renamed from: j  reason: collision with root package name */
    private double f11785j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f11786k;

    /* renamed from: l  reason: collision with root package name */
    private final b f11787l;

    /* renamed from: m  reason: collision with root package name */
    private double f11788m;

    /* renamed from: n  reason: collision with root package name */
    private double f11789n;

    /* renamed from: o  reason: collision with root package name */
    private double f11790o;

    /* renamed from: p  reason: collision with root package name */
    private double f11791p;

    /* renamed from: q  reason: collision with root package name */
    private double f11792q;

    /* renamed from: r  reason: collision with root package name */
    private int f11793r;

    /* renamed from: s  reason: collision with root package name */
    private int f11794s;

    /* renamed from: t  reason: collision with root package name */
    private double f11795t;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        double f11796a;

        /* renamed from: b  reason: collision with root package name */
        double f11797b;

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(ReadableMap readableMap) {
        b bVar = new b();
        this.f11787l = bVar;
        bVar.f11797b = readableMap.getDouble("initialVelocity");
        a(readableMap);
    }

    private void c(double d11) {
        double d12;
        double d13;
        if (e()) {
            return;
        }
        this.f11792q += d11 <= 0.064d ? d11 : 0.064d;
        double d14 = this.f11783h;
        double d15 = this.f11784i;
        double d16 = this.f11782g;
        double d17 = -this.f11785j;
        double sqrt = d14 / (Math.sqrt(d16 * d15) * 2.0d);
        double sqrt2 = Math.sqrt(d16 / d15);
        double sqrt3 = Math.sqrt(1.0d - (sqrt * sqrt)) * sqrt2;
        double d18 = this.f11789n - this.f11788m;
        double d19 = this.f11792q;
        if (sqrt < 1.0d) {
            double exp = Math.exp((-sqrt) * sqrt2 * d19);
            double d21 = sqrt * sqrt2;
            double d22 = d17 + (d21 * d18);
            double d23 = d19 * sqrt3;
            d13 = this.f11789n - ((((d22 / sqrt3) * Math.sin(d23)) + (Math.cos(d23) * d18)) * exp);
            d12 = ((d21 * exp) * (((Math.sin(d23) * d22) / sqrt3) + (Math.cos(d23) * d18))) - (((Math.cos(d23) * d22) - ((sqrt3 * d18) * Math.sin(d23))) * exp);
        } else {
            double exp2 = Math.exp((-sqrt2) * d19);
            double d24 = this.f11789n - (((((sqrt2 * d18) + d17) * d19) + d18) * exp2);
            d12 = exp2 * ((d17 * ((d19 * sqrt2) - 1.0d)) + (d19 * d18 * sqrt2 * sqrt2));
            d13 = d24;
        }
        b bVar = this.f11787l;
        bVar.f11796a = d13;
        bVar.f11797b = d12;
        if (e() || (this.f11786k && f())) {
            if (this.f11782g > 0.0d) {
                double d25 = this.f11789n;
                this.f11788m = d25;
                this.f11787l.f11796a = d25;
            } else {
                double d26 = this.f11787l.f11796a;
                this.f11789n = d26;
                this.f11788m = d26;
            }
            this.f11787l.f11797b = 0.0d;
        }
    }

    private double d(b bVar) {
        return Math.abs(this.f11789n - bVar.f11796a);
    }

    private boolean e() {
        return Math.abs(this.f11787l.f11797b) <= this.f11790o && (d(this.f11787l) <= this.f11791p || this.f11782g == 0.0d);
    }

    private boolean f() {
        if (this.f11782g > 0.0d) {
            double d11 = this.f11788m;
            double d12 = this.f11789n;
            if ((d11 < d12 && this.f11787l.f11796a > d12) || (d11 > d12 && this.f11787l.f11796a < d12)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.animated.d
    public void a(ReadableMap readableMap) {
        this.f11782g = readableMap.getDouble("stiffness");
        this.f11783h = readableMap.getDouble("damping");
        this.f11784i = readableMap.getDouble("mass");
        this.f11785j = this.f11787l.f11797b;
        this.f11789n = readableMap.getDouble("toValue");
        this.f11790o = readableMap.getDouble("restSpeedThreshold");
        this.f11791p = readableMap.getDouble("restDisplacementThreshold");
        this.f11786k = readableMap.getBoolean("overshootClamping");
        int i11 = readableMap.hasKey("iterations") ? readableMap.getInt("iterations") : 1;
        this.f11793r = i11;
        this.f11719a = i11 == 0;
        this.f11794s = 0;
        this.f11792q = 0.0d;
        this.f11781f = false;
    }

    @Override // com.facebook.react.animated.d
    public void b(long j11) {
        long j12 = j11 / 1000000;
        if (!this.f11781f) {
            if (this.f11794s == 0) {
                this.f11795t = this.f11720b.f11813f;
                this.f11794s = 1;
            }
            b bVar = this.f11787l;
            double d11 = this.f11720b.f11813f;
            bVar.f11796a = d11;
            this.f11788m = d11;
            this.f11780e = j12;
            this.f11792q = 0.0d;
            this.f11781f = true;
        }
        c((j12 - this.f11780e) / 1000.0d);
        this.f11780e = j12;
        this.f11720b.f11813f = this.f11787l.f11796a;
        if (e()) {
            int i11 = this.f11793r;
            if (i11 != -1 && this.f11794s >= i11) {
                this.f11719a = true;
                return;
            }
            this.f11781f = false;
            this.f11720b.f11813f = this.f11795t;
            this.f11794s++;
        }
    }
}