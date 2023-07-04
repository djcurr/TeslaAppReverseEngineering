package com.facebook.imagepipeline.producers;

import android.net.Uri;

/* loaded from: classes3.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    private final l<nf.e> f11574a;

    /* renamed from: b  reason: collision with root package name */
    private final p0 f11575b;

    /* renamed from: c  reason: collision with root package name */
    private long f11576c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f11577d;

    /* renamed from: e  reason: collision with root package name */
    private p001if.a f11578e;

    public w(l<nf.e> lVar, p0 p0Var) {
        this.f11574a = lVar;
        this.f11575b = p0Var;
    }

    public l<nf.e> a() {
        return this.f11574a;
    }

    public p0 b() {
        return this.f11575b;
    }

    public long c() {
        return this.f11576c;
    }

    public r0 d() {
        return this.f11575b.h();
    }

    public int e() {
        return this.f11577d;
    }

    public p001if.a f() {
        return this.f11578e;
    }

    public Uri g() {
        return this.f11575b.l().s();
    }

    public void h(long j11) {
        this.f11576c = j11;
    }

    public void i(int i11) {
        this.f11577d = i11;
    }

    public void j(p001if.a aVar) {
        this.f11578e = aVar;
    }
}