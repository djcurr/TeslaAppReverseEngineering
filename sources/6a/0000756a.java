package ij;

import jj.h;

/* loaded from: classes3.dex */
public final class f implements d {

    /* renamed from: a  reason: collision with root package name */
    private final ji.c f30444a;

    /* renamed from: b  reason: collision with root package name */
    private final long f30445b;

    public f(ji.c cVar, long j11) {
        this.f30444a = cVar;
        this.f30445b = j11;
    }

    @Override // ij.d
    public long c(long j11) {
        return this.f30444a.f33713e[(int) j11] - this.f30445b;
    }

    @Override // ij.d
    public long d(long j11, long j12) {
        return this.f30444a.f33712d[(int) j11];
    }

    @Override // ij.d
    public long e(long j11, long j12) {
        return 0L;
    }

    @Override // ij.d
    public long f(long j11, long j12) {
        return -9223372036854775807L;
    }

    @Override // ij.d
    public h g(long j11) {
        ji.c cVar = this.f30444a;
        int i11 = (int) j11;
        return new h(null, cVar.f33711c[i11], cVar.f33710b[i11]);
    }

    @Override // ij.d
    public long h(long j11, long j12) {
        return this.f30444a.a(j11 + this.f30445b);
    }

    @Override // ij.d
    public int i(long j11) {
        return this.f30444a.f33709a;
    }

    @Override // ij.d
    public boolean j() {
        return true;
    }

    @Override // ij.d
    public long k() {
        return 0L;
    }

    @Override // ij.d
    public int l(long j11, long j12) {
        return this.f30444a.f33709a;
    }
}