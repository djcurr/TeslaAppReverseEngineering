package com.google.android.exoplayer2.source;

import ak.k0;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.source.j;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class g implements i, i.a {

    /* renamed from: a  reason: collision with root package name */
    public final j.a f13947a;

    /* renamed from: b  reason: collision with root package name */
    private final long f13948b;

    /* renamed from: c  reason: collision with root package name */
    private final zj.b f13949c;

    /* renamed from: d  reason: collision with root package name */
    private j f13950d;

    /* renamed from: e  reason: collision with root package name */
    private i f13951e;

    /* renamed from: f  reason: collision with root package name */
    private i.a f13952f;

    /* renamed from: g  reason: collision with root package name */
    private a f13953g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f13954h;

    /* renamed from: i  reason: collision with root package name */
    private long f13955i = -9223372036854775807L;

    /* loaded from: classes3.dex */
    public interface a {
        void a(j.a aVar);

        void b(j.a aVar, IOException iOException);
    }

    public g(j.a aVar, zj.b bVar, long j11) {
        this.f13947a = aVar;
        this.f13949c = bVar;
        this.f13948b = j11;
    }

    private long s(long j11) {
        long j12 = this.f13955i;
        return j12 != -9223372036854775807L ? j12 : j11;
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public long b() {
        return ((i) k0.j(this.f13951e)).b();
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public boolean c() {
        i iVar = this.f13951e;
        return iVar != null && iVar.c();
    }

    @Override // com.google.android.exoplayer2.source.i
    public long d(long j11, ci.q qVar) {
        return ((i) k0.j(this.f13951e)).d(j11, qVar);
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public boolean e(long j11) {
        i iVar = this.f13951e;
        return iVar != null && iVar.e(j11);
    }

    public void f(j.a aVar) {
        long s11 = s(this.f13948b);
        i k11 = ((j) ak.a.e(this.f13950d)).k(aVar, this.f13949c, s11);
        this.f13951e = k11;
        if (this.f13952f != null) {
            k11.m(this, s11);
        }
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public long g() {
        return ((i) k0.j(this.f13951e)).g();
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public void h(long j11) {
        ((i) k0.j(this.f13951e)).h(j11);
    }

    public long i() {
        return this.f13955i;
    }

    @Override // com.google.android.exoplayer2.source.i
    public long k(long j11) {
        return ((i) k0.j(this.f13951e)).k(j11);
    }

    @Override // com.google.android.exoplayer2.source.i
    public long l() {
        return ((i) k0.j(this.f13951e)).l();
    }

    @Override // com.google.android.exoplayer2.source.i
    public void m(i.a aVar, long j11) {
        this.f13952f = aVar;
        i iVar = this.f13951e;
        if (iVar != null) {
            iVar.m(this, s(this.f13948b));
        }
    }

    @Override // com.google.android.exoplayer2.source.i
    public long o(xj.g[] gVarArr, boolean[] zArr, fj.r[] rVarArr, boolean[] zArr2, long j11) {
        long j12;
        long j13 = this.f13955i;
        if (j13 == -9223372036854775807L || j11 != this.f13948b) {
            j12 = j11;
        } else {
            this.f13955i = -9223372036854775807L;
            j12 = j13;
        }
        return ((i) k0.j(this.f13951e)).o(gVarArr, zArr, rVarArr, zArr2, j12);
    }

    @Override // com.google.android.exoplayer2.source.i.a
    public void p(i iVar) {
        ((i.a) k0.j(this.f13952f)).p(this);
        a aVar = this.f13953g;
        if (aVar != null) {
            aVar.a(this.f13947a);
        }
    }

    public long q() {
        return this.f13948b;
    }

    @Override // com.google.android.exoplayer2.source.i
    public void r() {
        try {
            i iVar = this.f13951e;
            if (iVar != null) {
                iVar.r();
            } else {
                j jVar = this.f13950d;
                if (jVar != null) {
                    jVar.p();
                }
            }
        } catch (IOException e11) {
            a aVar = this.f13953g;
            if (aVar != null) {
                if (this.f13954h) {
                    return;
                }
                this.f13954h = true;
                aVar.b(this.f13947a, e11);
                return;
            }
            throw e11;
        }
    }

    @Override // com.google.android.exoplayer2.source.i
    public fj.v t() {
        return ((i) k0.j(this.f13951e)).t();
    }

    @Override // com.google.android.exoplayer2.source.i
    public void u(long j11, boolean z11) {
        ((i) k0.j(this.f13951e)).u(j11, z11);
    }

    @Override // com.google.android.exoplayer2.source.u.a
    /* renamed from: v */
    public void j(i iVar) {
        ((i.a) k0.j(this.f13952f)).j(this);
    }

    public void w(long j11) {
        this.f13955i = j11;
    }

    public void x() {
        if (this.f13951e != null) {
            ((j) ak.a.e(this.f13950d)).g(this.f13951e);
        }
    }

    public void y(j jVar) {
        ak.a.f(this.f13950d == null);
        this.f13950d = jVar;
    }
}