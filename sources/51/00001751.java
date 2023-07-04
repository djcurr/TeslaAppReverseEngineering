package com.facebook.imageutils;

import android.graphics.ColorSpace;
import android.util.Pair;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final Pair<Integer, Integer> f11651a;

    /* renamed from: b  reason: collision with root package name */
    private final ColorSpace f11652b;

    public b(int i11, int i12, ColorSpace colorSpace) {
        this.f11651a = (i11 == -1 || i12 == -1) ? null : new Pair<>(Integer.valueOf(i11), Integer.valueOf(i12));
        this.f11652b = colorSpace;
    }

    public ColorSpace a() {
        return this.f11652b;
    }

    public Pair<Integer, Integer> b() {
        return this.f11651a;
    }
}