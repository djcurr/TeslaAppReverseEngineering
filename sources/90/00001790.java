package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* loaded from: classes3.dex */
class h extends d {

    /* renamed from: e  reason: collision with root package name */
    private long f11737e;

    /* renamed from: f  reason: collision with root package name */
    private double[] f11738f;

    /* renamed from: g  reason: collision with root package name */
    private double f11739g;

    /* renamed from: h  reason: collision with root package name */
    private double f11740h;

    /* renamed from: i  reason: collision with root package name */
    private int f11741i;

    /* renamed from: j  reason: collision with root package name */
    private int f11742j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(ReadableMap readableMap) {
        a(readableMap);
    }

    @Override // com.facebook.react.animated.d
    public void a(ReadableMap readableMap) {
        ReadableArray array = readableMap.getArray("frames");
        int size = array.size();
        double[] dArr = this.f11738f;
        if (dArr == null || dArr.length != size) {
            this.f11738f = new double[size];
        }
        for (int i11 = 0; i11 < size; i11++) {
            this.f11738f[i11] = array.getDouble(i11);
        }
        if (readableMap.hasKey("toValue")) {
            this.f11739g = readableMap.getType("toValue") == ReadableType.Number ? readableMap.getDouble("toValue") : 0.0d;
        } else {
            this.f11739g = 0.0d;
        }
        if (readableMap.hasKey("iterations")) {
            this.f11741i = readableMap.getType("iterations") == ReadableType.Number ? readableMap.getInt("iterations") : 1;
        } else {
            this.f11741i = 1;
        }
        this.f11742j = 1;
        this.f11719a = this.f11741i == 0;
        this.f11737e = -1L;
    }

    @Override // com.facebook.react.animated.d
    public void b(long j11) {
        double d11;
        if (this.f11737e < 0) {
            this.f11737e = j11;
            if (this.f11742j == 1) {
                this.f11740h = this.f11720b.f11813f;
            }
        }
        int round = (int) Math.round(((j11 - this.f11737e) / 1000000) / 16.666666666666668d);
        if (round >= 0) {
            if (this.f11719a) {
                return;
            }
            double[] dArr = this.f11738f;
            if (round >= dArr.length - 1) {
                d11 = this.f11739g;
                int i11 = this.f11741i;
                if (i11 != -1 && this.f11742j >= i11) {
                    this.f11719a = true;
                } else {
                    this.f11737e = -1L;
                    this.f11742j++;
                }
            } else {
                double d12 = this.f11740h;
                d11 = (dArr[round] * (this.f11739g - d12)) + d12;
            }
            this.f11720b.f11813f = d11;
            return;
        }
        throw new IllegalStateException("Calculated frame index should never be lower than 0");
    }
}