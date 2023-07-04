package com.alipay.android.phone.mrpc.core;

/* loaded from: classes.dex */
public final class p extends u {

    /* renamed from: c  reason: collision with root package name */
    public int f10109c;

    /* renamed from: d  reason: collision with root package name */
    public String f10110d;

    /* renamed from: e  reason: collision with root package name */
    public long f10111e;

    /* renamed from: f  reason: collision with root package name */
    public long f10112f;

    /* renamed from: g  reason: collision with root package name */
    public String f10113g;

    /* renamed from: h  reason: collision with root package name */
    public HttpUrlHeader f10114h;

    public p(HttpUrlHeader httpUrlHeader, int i11, String str, byte[] bArr) {
        this.f10114h = httpUrlHeader;
        this.f10109c = i11;
        this.f10110d = str;
        this.f10135a = bArr;
    }

    public final HttpUrlHeader a() {
        return this.f10114h;
    }

    public final void a(long j11) {
        this.f10111e = j11;
    }

    public final void a(String str) {
        this.f10113g = str;
    }

    public final void b(long j11) {
        this.f10112f = j11;
    }
}