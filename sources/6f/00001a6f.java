package com.facebook.react.views.text;

import android.text.Spannable;

/* loaded from: classes3.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private final Spannable f12653a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12654b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f12655c;

    /* renamed from: d  reason: collision with root package name */
    private final float f12656d;

    /* renamed from: e  reason: collision with root package name */
    private final float f12657e;

    /* renamed from: f  reason: collision with root package name */
    private final float f12658f;

    /* renamed from: g  reason: collision with root package name */
    private final float f12659g;

    /* renamed from: h  reason: collision with root package name */
    private final int f12660h;

    /* renamed from: i  reason: collision with root package name */
    private final int f12661i;

    /* renamed from: j  reason: collision with root package name */
    private final int f12662j;

    /* renamed from: k  reason: collision with root package name */
    private final int f12663k;

    /* renamed from: l  reason: collision with root package name */
    private final int f12664l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f12665m;

    public r(Spannable spannable, int i11, boolean z11, float f11, float f12, float f13, float f14, int i12, int i13, int i14) {
        this(spannable, i11, z11, f11, f12, f13, f14, i12, i13, i14, -1, -1);
    }

    public static r a(Spannable spannable, int i11, int i12, int i13, int i14, boolean z11) {
        r rVar = new r(spannable, i11, false, i12, i13, i14);
        rVar.f12665m = z11;
        return rVar;
    }

    public boolean b() {
        return this.f12655c;
    }

    public int c() {
        return this.f12654b;
    }

    public int d() {
        return this.f12664l;
    }

    public float e() {
        return this.f12659g;
    }

    public float f() {
        return this.f12656d;
    }

    public float g() {
        return this.f12658f;
    }

    public float h() {
        return this.f12657e;
    }

    public int i() {
        return this.f12663k;
    }

    public int j() {
        return this.f12662j;
    }

    public Spannable k() {
        return this.f12653a;
    }

    public int l() {
        return this.f12660h;
    }

    public int m() {
        return this.f12661i;
    }

    public r(Spannable spannable, int i11, boolean z11, int i12, int i13, int i14) {
        this(spannable, i11, z11, -1.0f, -1.0f, -1.0f, -1.0f, i12, i13, i14, -1, -1);
    }

    public r(Spannable spannable, int i11, boolean z11, float f11, float f12, float f13, float f14, int i12, int i13, int i14, int i15, int i16) {
        this.f12653a = spannable;
        this.f12654b = i11;
        this.f12655c = z11;
        this.f12656d = f11;
        this.f12657e = f12;
        this.f12658f = f13;
        this.f12659g = f14;
        this.f12660h = i12;
        this.f12661i = i13;
        this.f12662j = i15;
        this.f12663k = i16;
        this.f12664l = i14;
    }
}