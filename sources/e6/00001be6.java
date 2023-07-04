package com.google.android.exoplayer2;

import android.os.Handler;
import android.util.Pair;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.z0;
import com.google.common.collect.r;
import di.d1;

/* loaded from: classes3.dex */
public final class n0 {

    /* renamed from: a */
    private final z0.b f13717a = new z0.b();

    /* renamed from: b */
    private final z0.c f13718b = new z0.c();

    /* renamed from: c */
    private final d1 f13719c;

    /* renamed from: d */
    private final Handler f13720d;

    /* renamed from: e */
    private long f13721e;

    /* renamed from: f */
    private int f13722f;

    /* renamed from: g */
    private boolean f13723g;

    /* renamed from: h */
    private k0 f13724h;

    /* renamed from: i */
    private k0 f13725i;

    /* renamed from: j */
    private k0 f13726j;

    /* renamed from: k */
    private int f13727k;

    /* renamed from: l */
    private Object f13728l;

    /* renamed from: m */
    private long f13729m;

    public n0(d1 d1Var, Handler handler) {
        this.f13719c = d1Var;
        this.f13720d = handler;
    }

    private static j.a A(z0 z0Var, Object obj, long j11, long j12, z0.b bVar) {
        z0Var.h(obj, bVar);
        int e11 = bVar.e(j11);
        if (e11 == -1) {
            return new j.a(obj, j12, bVar.d(j11));
        }
        return new j.a(obj, e11, bVar.i(e11), j12);
    }

    private long B(z0 z0Var, Object obj) {
        int b11;
        int i11 = z0Var.h(obj, this.f13717a).f14781c;
        Object obj2 = this.f13728l;
        if (obj2 != null && (b11 = z0Var.b(obj2)) != -1 && z0Var.f(b11, this.f13717a).f14781c == i11) {
            return this.f13729m;
        }
        for (k0 k0Var = this.f13724h; k0Var != null; k0Var = k0Var.j()) {
            if (k0Var.f13571b.equals(obj)) {
                return k0Var.f13575f.f13586a.f26306d;
            }
        }
        for (k0 k0Var2 = this.f13724h; k0Var2 != null; k0Var2 = k0Var2.j()) {
            int b12 = z0Var.b(k0Var2.f13571b);
            if (b12 != -1 && z0Var.f(b12, this.f13717a).f14781c == i11) {
                return k0Var2.f13575f.f13586a.f26306d;
            }
        }
        long j11 = this.f13721e;
        this.f13721e = 1 + j11;
        if (this.f13724h == null) {
            this.f13728l = obj;
            this.f13729m = j11;
        }
        return j11;
    }

    private boolean D(z0 z0Var) {
        k0 k0Var = this.f13724h;
        if (k0Var == null) {
            return true;
        }
        int b11 = z0Var.b(k0Var.f13571b);
        while (true) {
            b11 = z0Var.d(b11, this.f13717a, this.f13718b, this.f13722f, this.f13723g);
            while (k0Var.j() != null && !k0Var.f13575f.f13591f) {
                k0Var = k0Var.j();
            }
            k0 j11 = k0Var.j();
            if (b11 == -1 || j11 == null || z0Var.b(j11.f13571b) != b11) {
                break;
            }
            k0Var = j11;
        }
        boolean y11 = y(k0Var);
        k0Var.f13575f = q(z0Var, k0Var.f13575f);
        return !y11;
    }

    public static /* synthetic */ void a(n0 n0Var, r.a aVar, j.a aVar2) {
        n0Var.v(aVar, aVar2);
    }

    private boolean d(long j11, long j12) {
        return j11 == -9223372036854775807L || j11 == j12;
    }

    private boolean e(l0 l0Var, l0 l0Var2) {
        return l0Var.f13587b == l0Var2.f13587b && l0Var.f13586a.equals(l0Var2.f13586a);
    }

    private l0 h(r0 r0Var) {
        return k(r0Var.f13760a, r0Var.f13761b, r0Var.f13762c, r0Var.f13777r);
    }

    private l0 i(z0 z0Var, k0 k0Var, long j11) {
        long j12;
        l0 l0Var = k0Var.f13575f;
        long l11 = (k0Var.l() + l0Var.f13590e) - j11;
        if (l0Var.f13591f) {
            long j13 = 0;
            int d11 = z0Var.d(z0Var.b(l0Var.f13586a.f26303a), this.f13717a, this.f13718b, this.f13722f, this.f13723g);
            if (d11 == -1) {
                return null;
            }
            int i11 = z0Var.g(d11, this.f13717a, true).f14781c;
            Object obj = this.f13717a.f14780b;
            long j14 = l0Var.f13586a.f26306d;
            if (z0Var.n(i11, this.f13718b).f14799m == d11) {
                Pair<Object, Long> k11 = z0Var.k(this.f13718b, this.f13717a, i11, -9223372036854775807L, Math.max(0L, l11));
                if (k11 == null) {
                    return null;
                }
                obj = k11.first;
                long longValue = ((Long) k11.second).longValue();
                k0 j15 = k0Var.j();
                if (j15 != null && j15.f13571b.equals(obj)) {
                    j14 = j15.f13575f.f13586a.f26306d;
                } else {
                    j14 = this.f13721e;
                    this.f13721e = 1 + j14;
                }
                j12 = longValue;
                j13 = -9223372036854775807L;
            } else {
                j12 = 0;
            }
            return k(z0Var, A(z0Var, obj, j12, j14, this.f13717a), j13, j12);
        }
        j.a aVar = l0Var.f13586a;
        z0Var.h(aVar.f26303a, this.f13717a);
        if (aVar.b()) {
            int i12 = aVar.f26304b;
            int a11 = this.f13717a.a(i12);
            if (a11 == -1) {
                return null;
            }
            int j16 = this.f13717a.j(i12, aVar.f26305c);
            if (j16 < a11) {
                return l(z0Var, aVar.f26303a, i12, j16, l0Var.f13588c, aVar.f26306d);
            }
            long j17 = l0Var.f13588c;
            if (j17 == -9223372036854775807L) {
                z0.c cVar = this.f13718b;
                z0.b bVar = this.f13717a;
                Pair<Object, Long> k12 = z0Var.k(cVar, bVar, bVar.f14781c, -9223372036854775807L, Math.max(0L, l11));
                if (k12 == null) {
                    return null;
                }
                j17 = ((Long) k12.second).longValue();
            }
            return m(z0Var, aVar.f26303a, j17, l0Var.f13588c, aVar.f26306d);
        }
        int e11 = this.f13717a.e(l0Var.f13589d);
        if (e11 == -1) {
            Object obj2 = aVar.f26303a;
            long j18 = l0Var.f13590e;
            return m(z0Var, obj2, j18, j18, aVar.f26306d);
        }
        return l(z0Var, aVar.f26303a, e11, this.f13717a.i(e11), l0Var.f13590e, aVar.f26306d);
    }

    private l0 k(z0 z0Var, j.a aVar, long j11, long j12) {
        z0Var.h(aVar.f26303a, this.f13717a);
        if (aVar.b()) {
            return l(z0Var, aVar.f26303a, aVar.f26304b, aVar.f26305c, j11, aVar.f26306d);
        }
        return m(z0Var, aVar.f26303a, j12, j11, aVar.f26306d);
    }

    private l0 l(z0 z0Var, Object obj, int i11, int i12, long j11, long j12) {
        j.a aVar = new j.a(obj, i11, i12, j12);
        long b11 = z0Var.h(aVar.f26303a, this.f13717a).b(aVar.f26304b, aVar.f26305c);
        long g11 = i12 == this.f13717a.i(i11) ? this.f13717a.g() : 0L;
        return new l0(aVar, (b11 == -9223372036854775807L || g11 < b11) ? g11 : Math.max(0L, b11 - 1), j11, -9223372036854775807L, b11, false, false, false);
    }

    private l0 m(z0 z0Var, Object obj, long j11, long j12, long j13) {
        long j14 = j11;
        z0Var.h(obj, this.f13717a);
        int d11 = this.f13717a.d(j14);
        j.a aVar = new j.a(obj, j13, d11);
        boolean r11 = r(aVar);
        boolean t11 = t(z0Var, aVar);
        boolean s11 = s(z0Var, aVar, r11);
        long f11 = d11 != -1 ? this.f13717a.f(d11) : -9223372036854775807L;
        long j15 = (f11 == -9223372036854775807L || f11 == Long.MIN_VALUE) ? this.f13717a.f14782d : f11;
        if (j15 != -9223372036854775807L && j14 >= j15) {
            j14 = Math.max(0L, j15 - 1);
        }
        return new l0(aVar, j14, j12, f11, j15, r11, t11, s11);
    }

    private boolean r(j.a aVar) {
        return !aVar.b() && aVar.f26307e == -1;
    }

    private boolean s(z0 z0Var, j.a aVar, boolean z11) {
        int b11 = z0Var.b(aVar.f26303a);
        return !z0Var.n(z0Var.f(b11, this.f13717a).f14781c, this.f13718b).f14795i && z0Var.r(b11, this.f13717a, this.f13718b, this.f13722f, this.f13723g) && z11;
    }

    private boolean t(z0 z0Var, j.a aVar) {
        if (r(aVar)) {
            return z0Var.n(z0Var.h(aVar.f26303a, this.f13717a).f14781c, this.f13718b).f14800n == z0Var.b(aVar.f26303a);
        }
        return false;
    }

    public /* synthetic */ void v(r.a aVar, j.a aVar2) {
        this.f13719c.v2(aVar.e(), aVar2);
    }

    private void w() {
        if (this.f13719c != null) {
            final r.a m11 = com.google.common.collect.r.m();
            for (k0 k0Var = this.f13724h; k0Var != null; k0Var = k0Var.j()) {
                m11.d(k0Var.f13575f.f13586a);
            }
            k0 k0Var2 = this.f13725i;
            final j.a aVar = k0Var2 == null ? null : k0Var2.f13575f.f13586a;
            this.f13720d.post(new Runnable() { // from class: com.google.android.exoplayer2.m0
                @Override // java.lang.Runnable
                public final void run() {
                    n0.a(n0.this, m11, aVar);
                }
            });
        }
    }

    public boolean C() {
        k0 k0Var = this.f13726j;
        return k0Var == null || (!k0Var.f13575f.f13593h && k0Var.q() && this.f13726j.f13575f.f13590e != -9223372036854775807L && this.f13727k < 100);
    }

    public boolean E(z0 z0Var, long j11, long j12) {
        l0 l0Var;
        k0 k0Var = this.f13724h;
        k0 k0Var2 = null;
        while (k0Var != null) {
            l0 l0Var2 = k0Var.f13575f;
            if (k0Var2 == null) {
                l0Var = q(z0Var, l0Var2);
            } else {
                l0 i11 = i(z0Var, k0Var2, j11);
                if (i11 == null) {
                    return !y(k0Var2);
                }
                if (!e(l0Var2, i11)) {
                    return !y(k0Var2);
                }
                l0Var = i11;
            }
            k0Var.f13575f = l0Var.a(l0Var2.f13588c);
            if (!d(l0Var2.f13590e, l0Var.f13590e)) {
                long j13 = l0Var.f13590e;
                return (y(k0Var) || (k0Var == this.f13725i && ((j12 > Long.MIN_VALUE ? 1 : (j12 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j12 > ((j13 > (-9223372036854775807L) ? 1 : (j13 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : k0Var.z(j13)) ? 1 : (j12 == ((j13 > (-9223372036854775807L) ? 1 : (j13 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : k0Var.z(j13)) ? 0 : -1)) >= 0))) ? false : true;
            }
            k0Var2 = k0Var;
            k0Var = k0Var.j();
        }
        return true;
    }

    public boolean F(z0 z0Var, int i11) {
        this.f13722f = i11;
        return D(z0Var);
    }

    public boolean G(z0 z0Var, boolean z11) {
        this.f13723g = z11;
        return D(z0Var);
    }

    public k0 b() {
        k0 k0Var = this.f13724h;
        if (k0Var == null) {
            return null;
        }
        if (k0Var == this.f13725i) {
            this.f13725i = k0Var.j();
        }
        this.f13724h.t();
        int i11 = this.f13727k - 1;
        this.f13727k = i11;
        if (i11 == 0) {
            this.f13726j = null;
            k0 k0Var2 = this.f13724h;
            this.f13728l = k0Var2.f13571b;
            this.f13729m = k0Var2.f13575f.f13586a.f26306d;
        }
        this.f13724h = this.f13724h.j();
        w();
        return this.f13724h;
    }

    public k0 c() {
        k0 k0Var = this.f13725i;
        ak.a.f((k0Var == null || k0Var.j() == null) ? false : true);
        this.f13725i = this.f13725i.j();
        w();
        return this.f13725i;
    }

    public void f() {
        if (this.f13727k == 0) {
            return;
        }
        k0 k0Var = (k0) ak.a.h(this.f13724h);
        this.f13728l = k0Var.f13571b;
        this.f13729m = k0Var.f13575f.f13586a.f26306d;
        while (k0Var != null) {
            k0Var.t();
            k0Var = k0Var.j();
        }
        this.f13724h = null;
        this.f13726j = null;
        this.f13725i = null;
        this.f13727k = 0;
        w();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0018, code lost:
        if (r1 != (-9223372036854775807L)) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.k0 g(ci.n[] r12, xj.m r13, zj.b r14, com.google.android.exoplayer2.q0 r15, com.google.android.exoplayer2.l0 r16, xj.n r17) {
        /*
            r11 = this;
            r0 = r11
            r8 = r16
            com.google.android.exoplayer2.k0 r1 = r0.f13726j
            if (r1 != 0) goto L1e
            com.google.android.exoplayer2.source.j$a r1 = r8.f13586a
            boolean r1 = r1.b()
            if (r1 == 0) goto L1b
            long r1 = r8.f13588c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L1b
            goto L2c
        L1b:
            r1 = 0
            goto L2c
        L1e:
            long r1 = r1.l()
            com.google.android.exoplayer2.k0 r3 = r0.f13726j
            com.google.android.exoplayer2.l0 r3 = r3.f13575f
            long r3 = r3.f13590e
            long r1 = r1 + r3
            long r3 = r8.f13587b
            long r1 = r1 - r3
        L2c:
            r3 = r1
            com.google.android.exoplayer2.k0 r10 = new com.google.android.exoplayer2.k0
            r1 = r10
            r2 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r1.<init>(r2, r3, r5, r6, r7, r8, r9)
            com.google.android.exoplayer2.k0 r1 = r0.f13726j
            if (r1 == 0) goto L43
            r1.w(r10)
            goto L47
        L43:
            r0.f13724h = r10
            r0.f13725i = r10
        L47:
            r1 = 0
            r0.f13728l = r1
            r0.f13726j = r10
            int r1 = r0.f13727k
            int r1 = r1 + 1
            r0.f13727k = r1
            r11.w()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.n0.g(ci.n[], xj.m, zj.b, com.google.android.exoplayer2.q0, com.google.android.exoplayer2.l0, xj.n):com.google.android.exoplayer2.k0");
    }

    public k0 j() {
        return this.f13726j;
    }

    public l0 n(long j11, r0 r0Var) {
        k0 k0Var = this.f13726j;
        if (k0Var == null) {
            return h(r0Var);
        }
        return i(r0Var.f13760a, k0Var, j11);
    }

    public k0 o() {
        return this.f13724h;
    }

    public k0 p() {
        return this.f13725i;
    }

    public l0 q(z0 z0Var, l0 l0Var) {
        long j11;
        j.a aVar = l0Var.f13586a;
        boolean r11 = r(aVar);
        boolean t11 = t(z0Var, aVar);
        boolean s11 = s(z0Var, aVar, r11);
        z0Var.h(l0Var.f13586a.f26303a, this.f13717a);
        if (aVar.b()) {
            j11 = this.f13717a.b(aVar.f26304b, aVar.f26305c);
        } else {
            j11 = l0Var.f13589d;
            if (j11 == -9223372036854775807L || j11 == Long.MIN_VALUE) {
                j11 = this.f13717a.h();
            }
        }
        return new l0(aVar, l0Var.f13587b, l0Var.f13588c, l0Var.f13589d, j11, r11, t11, s11);
    }

    public boolean u(com.google.android.exoplayer2.source.i iVar) {
        k0 k0Var = this.f13726j;
        return k0Var != null && k0Var.f13570a == iVar;
    }

    public void x(long j11) {
        k0 k0Var = this.f13726j;
        if (k0Var != null) {
            k0Var.s(j11);
        }
    }

    public boolean y(k0 k0Var) {
        boolean z11 = false;
        ak.a.f(k0Var != null);
        if (k0Var.equals(this.f13726j)) {
            return false;
        }
        this.f13726j = k0Var;
        while (k0Var.j() != null) {
            k0Var = k0Var.j();
            if (k0Var == this.f13725i) {
                this.f13725i = this.f13724h;
                z11 = true;
            }
            k0Var.t();
            this.f13727k--;
        }
        this.f13726j.w(null);
        w();
        return z11;
    }

    public j.a z(z0 z0Var, Object obj, long j11) {
        return A(z0Var, obj, j11, B(z0Var, obj), this.f13717a);
    }
}