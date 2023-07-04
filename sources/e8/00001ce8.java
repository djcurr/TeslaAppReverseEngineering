package com.google.android.exoplayer2;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.i0;
import gj.a;

/* loaded from: classes3.dex */
public abstract class z0 {

    /* renamed from: a  reason: collision with root package name */
    public static final z0 f14778a = new a();

    /* loaded from: classes3.dex */
    class a extends z0 {
        a() {
        }

        @Override // com.google.android.exoplayer2.z0
        public int b(Object obj) {
            return -1;
        }

        @Override // com.google.android.exoplayer2.z0
        public b g(int i11, b bVar, boolean z11) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.z0
        public int i() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.z0
        public Object m(int i11) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.z0
        public c o(int i11, c cVar, long j11) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.z0
        public int p() {
            return 0;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public Object f14779a;

        /* renamed from: b  reason: collision with root package name */
        public Object f14780b;

        /* renamed from: c  reason: collision with root package name */
        public int f14781c;

        /* renamed from: d  reason: collision with root package name */
        public long f14782d;

        /* renamed from: e  reason: collision with root package name */
        private long f14783e;

        /* renamed from: f  reason: collision with root package name */
        private gj.a f14784f = gj.a.f27982g;

        public int a(int i11) {
            return this.f14784f.f27986d[i11].f27989a;
        }

        public long b(int i11, int i12) {
            a.C0531a c0531a = this.f14784f.f27986d[i11];
            if (c0531a.f27989a != -1) {
                return c0531a.f27992d[i12];
            }
            return -9223372036854775807L;
        }

        public int c() {
            return this.f14784f.f27984b;
        }

        public int d(long j11) {
            return this.f14784f.a(j11, this.f14782d);
        }

        public int e(long j11) {
            return this.f14784f.b(j11, this.f14782d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return ak.k0.c(this.f14779a, bVar.f14779a) && ak.k0.c(this.f14780b, bVar.f14780b) && this.f14781c == bVar.f14781c && this.f14782d == bVar.f14782d && this.f14783e == bVar.f14783e && ak.k0.c(this.f14784f, bVar.f14784f);
        }

        public long f(int i11) {
            return this.f14784f.f27985c[i11];
        }

        public long g() {
            return this.f14784f.f27987e;
        }

        public long h() {
            return this.f14782d;
        }

        public int hashCode() {
            Object obj = this.f14779a;
            int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f14780b;
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            long j11 = this.f14782d;
            long j12 = this.f14783e;
            return ((((((((hashCode + hashCode2) * 31) + this.f14781c) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.f14784f.hashCode();
        }

        public int i(int i11) {
            return this.f14784f.f27986d[i11].a();
        }

        public int j(int i11, int i12) {
            return this.f14784f.f27986d[i11].b(i12);
        }

        public long k() {
            return ci.b.d(this.f14783e);
        }

        public long l() {
            return this.f14783e;
        }

        public boolean m(int i11) {
            return !this.f14784f.f27986d[i11].c();
        }

        public b n(Object obj, Object obj2, int i11, long j11, long j12) {
            return o(obj, obj2, i11, j11, j12, gj.a.f27982g);
        }

        public b o(Object obj, Object obj2, int i11, long j11, long j12, gj.a aVar) {
            this.f14779a = obj;
            this.f14780b = obj2;
            this.f14781c = i11;
            this.f14782d = j11;
            this.f14783e = j12;
            this.f14784f = aVar;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: r  reason: collision with root package name */
        public static final Object f14785r = new Object();

        /* renamed from: s  reason: collision with root package name */
        private static final i0 f14786s = new i0.c().d("com.google.android.exoplayer2.Timeline").i(Uri.EMPTY).a();
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public Object f14788b;

        /* renamed from: d  reason: collision with root package name */
        public Object f14790d;

        /* renamed from: e  reason: collision with root package name */
        public long f14791e;

        /* renamed from: f  reason: collision with root package name */
        public long f14792f;

        /* renamed from: g  reason: collision with root package name */
        public long f14793g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f14794h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f14795i;
        @Deprecated

        /* renamed from: j  reason: collision with root package name */
        public boolean f14796j;

        /* renamed from: k  reason: collision with root package name */
        public i0.f f14797k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f14798l;

        /* renamed from: m  reason: collision with root package name */
        public int f14799m;

        /* renamed from: n  reason: collision with root package name */
        public int f14800n;

        /* renamed from: o  reason: collision with root package name */
        public long f14801o;

        /* renamed from: p  reason: collision with root package name */
        public long f14802p;

        /* renamed from: q  reason: collision with root package name */
        public long f14803q;

        /* renamed from: a  reason: collision with root package name */
        public Object f14787a = f14785r;

        /* renamed from: c  reason: collision with root package name */
        public i0 f14789c = f14786s;

        public long a() {
            return ak.k0.Z(this.f14793g);
        }

        public long b() {
            return ci.b.d(this.f14801o);
        }

        public long c() {
            return this.f14801o;
        }

        public long d() {
            return ci.b.d(this.f14802p);
        }

        public long e() {
            return this.f14803q;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !c.class.equals(obj.getClass())) {
                return false;
            }
            c cVar = (c) obj;
            return ak.k0.c(this.f14787a, cVar.f14787a) && ak.k0.c(this.f14789c, cVar.f14789c) && ak.k0.c(this.f14790d, cVar.f14790d) && ak.k0.c(this.f14797k, cVar.f14797k) && this.f14791e == cVar.f14791e && this.f14792f == cVar.f14792f && this.f14793g == cVar.f14793g && this.f14794h == cVar.f14794h && this.f14795i == cVar.f14795i && this.f14798l == cVar.f14798l && this.f14801o == cVar.f14801o && this.f14802p == cVar.f14802p && this.f14799m == cVar.f14799m && this.f14800n == cVar.f14800n && this.f14803q == cVar.f14803q;
        }

        public boolean f() {
            ak.a.f(this.f14796j == (this.f14797k != null));
            return this.f14797k != null;
        }

        public c g(Object obj, i0 i0Var, Object obj2, long j11, long j12, long j13, boolean z11, boolean z12, i0.f fVar, long j14, long j15, int i11, int i12, long j16) {
            i0.g gVar;
            this.f14787a = obj;
            this.f14789c = i0Var != null ? i0Var : f14786s;
            this.f14788b = (i0Var == null || (gVar = i0Var.f13502b) == null) ? null : gVar.f13559h;
            this.f14790d = obj2;
            this.f14791e = j11;
            this.f14792f = j12;
            this.f14793g = j13;
            this.f14794h = z11;
            this.f14795i = z12;
            this.f14796j = fVar != null;
            this.f14797k = fVar;
            this.f14801o = j14;
            this.f14802p = j15;
            this.f14799m = i11;
            this.f14800n = i12;
            this.f14803q = j16;
            this.f14798l = false;
            return this;
        }

        public int hashCode() {
            int hashCode = (((217 + this.f14787a.hashCode()) * 31) + this.f14789c.hashCode()) * 31;
            Object obj = this.f14790d;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            i0.f fVar = this.f14797k;
            int hashCode3 = fVar != null ? fVar.hashCode() : 0;
            long j11 = this.f14791e;
            long j12 = this.f14792f;
            long j13 = this.f14793g;
            long j14 = this.f14801o;
            long j15 = this.f14802p;
            long j16 = this.f14803q;
            return ((((((((((((((((((((((hashCode2 + hashCode3) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + (this.f14794h ? 1 : 0)) * 31) + (this.f14795i ? 1 : 0)) * 31) + (this.f14798l ? 1 : 0)) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + ((int) (j15 ^ (j15 >>> 32)))) * 31) + this.f14799m) * 31) + this.f14800n) * 31) + ((int) (j16 ^ (j16 >>> 32)));
        }
    }

    public int a(boolean z11) {
        return q() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z11) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i11, b bVar, c cVar, int i12, boolean z11) {
        int i13 = f(i11, bVar).f14781c;
        if (n(i13, cVar).f14800n == i11) {
            int e11 = e(i13, i12, z11);
            if (e11 == -1) {
                return -1;
            }
            return n(e11, cVar).f14799m;
        }
        return i11 + 1;
    }

    public int e(int i11, int i12, boolean z11) {
        if (i12 == 0) {
            if (i11 == c(z11)) {
                return -1;
            }
            return i11 + 1;
        } else if (i12 != 1) {
            if (i12 == 2) {
                return i11 == c(z11) ? a(z11) : i11 + 1;
            }
            throw new IllegalStateException();
        } else {
            return i11;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z0) {
            z0 z0Var = (z0) obj;
            if (z0Var.p() == p() && z0Var.i() == i()) {
                c cVar = new c();
                b bVar = new b();
                c cVar2 = new c();
                b bVar2 = new b();
                for (int i11 = 0; i11 < p(); i11++) {
                    if (!n(i11, cVar).equals(z0Var.n(i11, cVar2))) {
                        return false;
                    }
                }
                for (int i12 = 0; i12 < i(); i12++) {
                    if (!g(i12, bVar, true).equals(z0Var.g(i12, bVar2, true))) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final b f(int i11, b bVar) {
        return g(i11, bVar, false);
    }

    public abstract b g(int i11, b bVar, boolean z11);

    public b h(Object obj, b bVar) {
        return g(b(obj), bVar, true);
    }

    public int hashCode() {
        c cVar = new c();
        b bVar = new b();
        int p11 = 217 + p();
        for (int i11 = 0; i11 < p(); i11++) {
            p11 = (p11 * 31) + n(i11, cVar).hashCode();
        }
        int i12 = (p11 * 31) + i();
        for (int i13 = 0; i13 < i(); i13++) {
            i12 = (i12 * 31) + g(i13, bVar, true).hashCode();
        }
        return i12;
    }

    public abstract int i();

    public final Pair<Object, Long> j(c cVar, b bVar, int i11, long j11) {
        return (Pair) ak.a.e(k(cVar, bVar, i11, j11, 0L));
    }

    public final Pair<Object, Long> k(c cVar, b bVar, int i11, long j11, long j12) {
        ak.a.c(i11, 0, p());
        o(i11, cVar, j12);
        if (j11 == -9223372036854775807L) {
            j11 = cVar.c();
            if (j11 == -9223372036854775807L) {
                return null;
            }
        }
        int i12 = cVar.f14799m;
        long e11 = cVar.e() + j11;
        long h11 = g(i12, bVar, true).h();
        while (h11 != -9223372036854775807L && e11 >= h11 && i12 < cVar.f14800n) {
            e11 -= h11;
            i12++;
            h11 = g(i12, bVar, true).h();
        }
        return Pair.create(ak.a.e(bVar.f14780b), Long.valueOf(e11));
    }

    public int l(int i11, int i12, boolean z11) {
        if (i12 == 0) {
            if (i11 == a(z11)) {
                return -1;
            }
            return i11 - 1;
        } else if (i12 != 1) {
            if (i12 == 2) {
                return i11 == a(z11) ? c(z11) : i11 - 1;
            }
            throw new IllegalStateException();
        } else {
            return i11;
        }
    }

    public abstract Object m(int i11);

    public final c n(int i11, c cVar) {
        return o(i11, cVar, 0L);
    }

    public abstract c o(int i11, c cVar, long j11);

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }

    public final boolean r(int i11, b bVar, c cVar, int i12, boolean z11) {
        return d(i11, bVar, cVar, i12, z11) == -1;
    }
}