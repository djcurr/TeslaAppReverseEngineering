package com.google.android.exoplayer2.source;

import ak.k0;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.i;

/* loaded from: classes3.dex */
public final class c implements i, i.a {

    /* renamed from: a  reason: collision with root package name */
    public final i f13802a;

    /* renamed from: b  reason: collision with root package name */
    private i.a f13803b;

    /* renamed from: c  reason: collision with root package name */
    private a[] f13804c = new a[0];

    /* renamed from: d  reason: collision with root package name */
    private long f13805d;

    /* renamed from: e  reason: collision with root package name */
    long f13806e;

    /* renamed from: f  reason: collision with root package name */
    long f13807f;

    /* loaded from: classes3.dex */
    private final class a implements fj.r {

        /* renamed from: a  reason: collision with root package name */
        public final fj.r f13808a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f13809b;

        public a(fj.r rVar) {
            this.f13808a = rVar;
        }

        @Override // fj.r
        public void a() {
            this.f13808a.a();
        }

        public void b() {
            this.f13809b = false;
        }

        @Override // fj.r
        public int f(ci.j jVar, DecoderInputBuffer decoderInputBuffer, boolean z11) {
            if (c.this.i()) {
                return -3;
            }
            if (this.f13809b) {
                decoderInputBuffer.o(4);
                return -4;
            }
            int f11 = this.f13808a.f(jVar, decoderInputBuffer, z11);
            if (f11 == -5) {
                ci.i iVar = (ci.i) ak.a.e(jVar.f9243b);
                int i11 = iVar.G;
                if (i11 != 0 || iVar.H != 0) {
                    c cVar = c.this;
                    if (cVar.f13806e != 0) {
                        i11 = 0;
                    }
                    jVar.f9243b = iVar.a().M(i11).N(cVar.f13807f == Long.MIN_VALUE ? iVar.H : 0).E();
                }
                return -5;
            }
            c cVar2 = c.this;
            long j11 = cVar2.f13807f;
            if (j11 == Long.MIN_VALUE || ((f11 != -4 || decoderInputBuffer.f13266e < j11) && !(f11 == -3 && cVar2.g() == Long.MIN_VALUE && !decoderInputBuffer.f13265d))) {
                return f11;
            }
            decoderInputBuffer.f();
            decoderInputBuffer.o(4);
            this.f13809b = true;
            return -4;
        }

        @Override // fj.r
        public boolean isReady() {
            return !c.this.i() && this.f13808a.isReady();
        }

        @Override // fj.r
        public int p(long j11) {
            if (c.this.i()) {
                return -3;
            }
            return this.f13808a.p(j11);
        }
    }

    public c(i iVar, boolean z11, long j11, long j12) {
        this.f13802a = iVar;
        this.f13805d = z11 ? j11 : -9223372036854775807L;
        this.f13806e = j11;
        this.f13807f = j12;
    }

    private ci.q f(long j11, ci.q qVar) {
        long s11 = k0.s(qVar.f9252a, 0L, j11 - this.f13806e);
        long j12 = qVar.f9253b;
        long j13 = this.f13807f;
        long s12 = k0.s(j12, 0L, j13 == Long.MIN_VALUE ? Long.MAX_VALUE : j13 - j11);
        return (s11 == qVar.f9252a && s12 == qVar.f9253b) ? qVar : new ci.q(s11, s12);
    }

    private static boolean s(long j11, xj.g[] gVarArr) {
        if (j11 != 0) {
            for (xj.g gVar : gVarArr) {
                if (gVar != null) {
                    ci.i p11 = gVar.p();
                    if (!ak.r.a(p11.f9205l, p11.f9202i)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public long b() {
        long b11 = this.f13802a.b();
        if (b11 != Long.MIN_VALUE) {
            long j11 = this.f13807f;
            if (j11 == Long.MIN_VALUE || b11 < j11) {
                return b11;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public boolean c() {
        return this.f13802a.c();
    }

    @Override // com.google.android.exoplayer2.source.i
    public long d(long j11, ci.q qVar) {
        long j12 = this.f13806e;
        if (j11 == j12) {
            return j12;
        }
        return this.f13802a.d(j11, f(j11, qVar));
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public boolean e(long j11) {
        return this.f13802a.e(j11);
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public long g() {
        long g11 = this.f13802a.g();
        if (g11 != Long.MIN_VALUE) {
            long j11 = this.f13807f;
            if (j11 == Long.MIN_VALUE || g11 < j11) {
                return g11;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public void h(long j11) {
        this.f13802a.h(j11);
    }

    boolean i() {
        return this.f13805d != -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (r0 > r6) goto L18;
     */
    @Override // com.google.android.exoplayer2.source.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long k(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f13805d = r0
            com.google.android.exoplayer2.source.c$a[] r0 = r5.f13804c
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.b()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            com.google.android.exoplayer2.source.i r0 = r5.f13802a
            long r0 = r0.k(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L34
            long r6 = r5.f13806e
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L35
            long r6 = r5.f13807f
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L34
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L35
        L34:
            r2 = 1
        L35:
            ak.a.f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.c.k(long):long");
    }

    @Override // com.google.android.exoplayer2.source.i
    public long l() {
        if (i()) {
            long j11 = this.f13805d;
            this.f13805d = -9223372036854775807L;
            long l11 = l();
            return l11 != -9223372036854775807L ? l11 : j11;
        }
        long l12 = this.f13802a.l();
        if (l12 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z11 = true;
        ak.a.f(l12 >= this.f13806e);
        long j12 = this.f13807f;
        if (j12 != Long.MIN_VALUE && l12 > j12) {
            z11 = false;
        }
        ak.a.f(z11);
        return l12;
    }

    @Override // com.google.android.exoplayer2.source.i
    public void m(i.a aVar, long j11) {
        this.f13803b = aVar;
        this.f13802a.m(this, j11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
        if (r2 > r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    @Override // com.google.android.exoplayer2.source.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long o(xj.g[] r13, boolean[] r14, fj.r[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            com.google.android.exoplayer2.source.c$a[] r2 = new com.google.android.exoplayer2.source.c.a[r2]
            r0.f13804c = r2
            int r2 = r1.length
            fj.r[] r9 = new fj.r[r2]
            r10 = 0
            r2 = r10
        Lc:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L25
            com.google.android.exoplayer2.source.c$a[] r3 = r0.f13804c
            r4 = r1[r2]
            com.google.android.exoplayer2.source.c$a r4 = (com.google.android.exoplayer2.source.c.a) r4
            r3[r2] = r4
            r4 = r3[r2]
            if (r4 == 0) goto L20
            r3 = r3[r2]
            fj.r r11 = r3.f13808a
        L20:
            r9[r2] = r11
            int r2 = r2 + 1
            goto Lc
        L25:
            com.google.android.exoplayer2.source.i r2 = r0.f13802a
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.o(r3, r4, r5, r6, r7)
            boolean r4 = r12.i()
            if (r4 == 0) goto L47
            long r4 = r0.f13806e
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L47
            r6 = r13
            boolean r4 = s(r4, r13)
            if (r4 == 0) goto L47
            r4 = r2
            goto L4c
        L47:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L4c:
            r0.f13805d = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L67
            long r4 = r0.f13806e
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L65
            long r4 = r0.f13807f
            r6 = -9223372036854775808
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L67
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L65
            goto L67
        L65:
            r4 = r10
            goto L68
        L67:
            r4 = 1
        L68:
            ak.a.f(r4)
        L6b:
            int r4 = r1.length
            if (r10 >= r4) goto L97
            r4 = r9[r10]
            if (r4 != 0) goto L77
            com.google.android.exoplayer2.source.c$a[] r4 = r0.f13804c
            r4[r10] = r11
            goto L8e
        L77:
            com.google.android.exoplayer2.source.c$a[] r4 = r0.f13804c
            r5 = r4[r10]
            if (r5 == 0) goto L85
            r5 = r4[r10]
            fj.r r5 = r5.f13808a
            r6 = r9[r10]
            if (r5 == r6) goto L8e
        L85:
            com.google.android.exoplayer2.source.c$a r5 = new com.google.android.exoplayer2.source.c$a
            r6 = r9[r10]
            r5.<init>(r6)
            r4[r10] = r5
        L8e:
            com.google.android.exoplayer2.source.c$a[] r4 = r0.f13804c
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L6b
        L97:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.c.o(xj.g[], boolean[], fj.r[], boolean[], long):long");
    }

    @Override // com.google.android.exoplayer2.source.i.a
    public void p(i iVar) {
        ((i.a) ak.a.e(this.f13803b)).p(this);
    }

    @Override // com.google.android.exoplayer2.source.u.a
    /* renamed from: q */
    public void j(i iVar) {
        ((i.a) ak.a.e(this.f13803b)).j(this);
    }

    @Override // com.google.android.exoplayer2.source.i
    public void r() {
        this.f13802a.r();
    }

    @Override // com.google.android.exoplayer2.source.i
    public fj.v t() {
        return this.f13802a.t();
    }

    @Override // com.google.android.exoplayer2.source.i
    public void u(long j11, boolean z11) {
        this.f13802a.u(j11, z11);
    }

    public void v(long j11, long j12) {
        this.f13806e = j11;
        this.f13807f = j12;
    }
}