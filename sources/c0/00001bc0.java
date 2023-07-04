package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.j;

/* loaded from: classes3.dex */
final class l0 {

    /* renamed from: a  reason: collision with root package name */
    public final j.a f13586a;

    /* renamed from: b  reason: collision with root package name */
    public final long f13587b;

    /* renamed from: c  reason: collision with root package name */
    public final long f13588c;

    /* renamed from: d  reason: collision with root package name */
    public final long f13589d;

    /* renamed from: e  reason: collision with root package name */
    public final long f13590e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f13591f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f13592g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f13593h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l0(j.a aVar, long j11, long j12, long j13, long j14, boolean z11, boolean z12, boolean z13) {
        this.f13586a = aVar;
        this.f13587b = j11;
        this.f13588c = j12;
        this.f13589d = j13;
        this.f13590e = j14;
        this.f13591f = z11;
        this.f13592g = z12;
        this.f13593h = z13;
    }

    public l0 a(long j11) {
        return j11 == this.f13588c ? this : new l0(this.f13586a, this.f13587b, j11, this.f13589d, this.f13590e, this.f13591f, this.f13592g, this.f13593h);
    }

    public l0 b(long j11) {
        return j11 == this.f13587b ? this : new l0(this.f13586a, j11, this.f13588c, this.f13589d, this.f13590e, this.f13591f, this.f13592g, this.f13593h);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l0.class != obj.getClass()) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f13587b == l0Var.f13587b && this.f13588c == l0Var.f13588c && this.f13589d == l0Var.f13589d && this.f13590e == l0Var.f13590e && this.f13591f == l0Var.f13591f && this.f13592g == l0Var.f13592g && this.f13593h == l0Var.f13593h && ak.k0.c(this.f13586a, l0Var.f13586a);
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f13586a.hashCode()) * 31) + ((int) this.f13587b)) * 31) + ((int) this.f13588c)) * 31) + ((int) this.f13589d)) * 31) + ((int) this.f13590e)) * 31) + (this.f13591f ? 1 : 0)) * 31) + (this.f13592g ? 1 : 0)) * 31) + (this.f13593h ? 1 : 0);
    }
}