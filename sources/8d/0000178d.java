package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes3.dex */
public class e extends d {

    /* renamed from: e  reason: collision with root package name */
    private final double f11723e;

    /* renamed from: f  reason: collision with root package name */
    private double f11724f;

    /* renamed from: g  reason: collision with root package name */
    private long f11725g;

    /* renamed from: h  reason: collision with root package name */
    private double f11726h;

    /* renamed from: i  reason: collision with root package name */
    private double f11727i;

    /* renamed from: j  reason: collision with root package name */
    private int f11728j;

    /* renamed from: k  reason: collision with root package name */
    private int f11729k;

    public e(ReadableMap readableMap) {
        this.f11723e = readableMap.getDouble("velocity");
        a(readableMap);
    }

    @Override // com.facebook.react.animated.d
    public void a(ReadableMap readableMap) {
        this.f11724f = readableMap.getDouble("deceleration");
        int i11 = readableMap.hasKey("iterations") ? readableMap.getInt("iterations") : 1;
        this.f11728j = i11;
        this.f11729k = 1;
        this.f11719a = i11 == 0;
        this.f11725g = -1L;
        this.f11726h = 0.0d;
        this.f11727i = 0.0d;
    }

    @Override // com.facebook.react.animated.d
    public void b(long j11) {
        long j12 = j11 / 1000000;
        if (this.f11725g == -1) {
            this.f11725g = j12 - 16;
            double d11 = this.f11726h;
            if (d11 == this.f11727i) {
                this.f11726h = this.f11720b.f11813f;
            } else {
                this.f11720b.f11813f = d11;
            }
            this.f11727i = this.f11720b.f11813f;
        }
        double d12 = this.f11726h;
        double d13 = this.f11723e;
        double d14 = this.f11724f;
        double exp = d12 + ((d13 / (1.0d - d14)) * (1.0d - Math.exp((-(1.0d - d14)) * (j12 - this.f11725g))));
        if (Math.abs(this.f11727i - exp) < 0.1d) {
            int i11 = this.f11728j;
            if (i11 != -1 && this.f11729k >= i11) {
                this.f11719a = true;
                return;
            } else {
                this.f11725g = -1L;
                this.f11729k++;
            }
        }
        this.f11727i = exp;
        this.f11720b.f11813f = exp;
    }
}