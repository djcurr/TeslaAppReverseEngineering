package com.facebook.react.uimanager;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public class l0 {

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f12332e = {1, 2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a  reason: collision with root package name */
    private final float[] f12333a;

    /* renamed from: b  reason: collision with root package name */
    private int f12334b;

    /* renamed from: c  reason: collision with root package name */
    private final float f12335c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f12336d;

    public l0() {
        this(BitmapDescriptorFactory.HUE_RED);
    }

    private static float[] c() {
        return new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN};
    }

    public float a(int i11) {
        float f11 = (i11 == 4 || i11 == 5) ? Float.NaN : this.f12335c;
        int i12 = this.f12334b;
        if (i12 == 0) {
            return f11;
        }
        int[] iArr = f12332e;
        if ((iArr[i11] & i12) != 0) {
            return this.f12333a[i11];
        }
        if (this.f12336d) {
            char c11 = (i11 == 1 || i11 == 3) ? (char) 7 : (char) 6;
            if ((iArr[c11] & i12) != 0) {
                return this.f12333a[c11];
            }
            if ((i12 & iArr[8]) != 0) {
                return this.f12333a[8];
            }
        }
        return f11;
    }

    public float b(int i11) {
        return this.f12333a[i11];
    }

    public boolean d(int i11, float f11) {
        boolean z11 = false;
        if (e.a(this.f12333a[i11], f11)) {
            return false;
        }
        this.f12333a[i11] = f11;
        if (com.facebook.yoga.g.a(f11)) {
            this.f12334b = (~f12332e[i11]) & this.f12334b;
        } else {
            this.f12334b = f12332e[i11] | this.f12334b;
        }
        int i12 = this.f12334b;
        int[] iArr = f12332e;
        if ((iArr[8] & i12) != 0 || (iArr[7] & i12) != 0 || (i12 & iArr[6]) != 0) {
            z11 = true;
        }
        this.f12336d = z11;
        return true;
    }

    public l0(float f11) {
        this.f12334b = 0;
        this.f12335c = f11;
        this.f12333a = c();
    }
}