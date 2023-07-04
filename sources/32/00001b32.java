package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.z0;

/* loaded from: classes3.dex */
public abstract class a extends z0 {

    /* renamed from: b  reason: collision with root package name */
    private final int f13030b;

    /* renamed from: c  reason: collision with root package name */
    private final fj.s f13031c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f13032d;

    public a(boolean z11, fj.s sVar) {
        this.f13032d = z11;
        this.f13031c = sVar;
        this.f13030b = sVar.getLength();
    }

    private int B(int i11, boolean z11) {
        if (z11) {
            return this.f13031c.c(i11);
        }
        if (i11 < this.f13030b - 1) {
            return i11 + 1;
        }
        return -1;
    }

    private int C(int i11, boolean z11) {
        if (z11) {
            return this.f13031c.b(i11);
        }
        if (i11 > 0) {
            return i11 - 1;
        }
        return -1;
    }

    public static Object v(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object w(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object y(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    protected abstract int A(int i11);

    protected abstract z0 D(int i11);

    @Override // com.google.android.exoplayer2.z0
    public int a(boolean z11) {
        if (this.f13030b == 0) {
            return -1;
        }
        if (this.f13032d) {
            z11 = false;
        }
        int f11 = z11 ? this.f13031c.f() : 0;
        while (D(f11).q()) {
            f11 = B(f11, z11);
            if (f11 == -1) {
                return -1;
            }
        }
        return A(f11) + D(f11).a(z11);
    }

    @Override // com.google.android.exoplayer2.z0
    public final int b(Object obj) {
        int b11;
        if (obj instanceof Pair) {
            Object w11 = w(obj);
            Object v11 = v(obj);
            int s11 = s(w11);
            if (s11 == -1 || (b11 = D(s11).b(v11)) == -1) {
                return -1;
            }
            return z(s11) + b11;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.z0
    public int c(boolean z11) {
        int i11 = this.f13030b;
        if (i11 == 0) {
            return -1;
        }
        if (this.f13032d) {
            z11 = false;
        }
        int d11 = z11 ? this.f13031c.d() : i11 - 1;
        while (D(d11).q()) {
            d11 = C(d11, z11);
            if (d11 == -1) {
                return -1;
            }
        }
        return A(d11) + D(d11).c(z11);
    }

    @Override // com.google.android.exoplayer2.z0
    public int e(int i11, int i12, boolean z11) {
        if (this.f13032d) {
            if (i12 == 1) {
                i12 = 2;
            }
            z11 = false;
        }
        int u11 = u(i11);
        int A = A(u11);
        int e11 = D(u11).e(i11 - A, i12 != 2 ? i12 : 0, z11);
        if (e11 != -1) {
            return A + e11;
        }
        int B = B(u11, z11);
        while (B != -1 && D(B).q()) {
            B = B(B, z11);
        }
        if (B != -1) {
            return A(B) + D(B).a(z11);
        }
        if (i12 == 2) {
            return a(z11);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.z0
    public final z0.b g(int i11, z0.b bVar, boolean z11) {
        int t11 = t(i11);
        int A = A(t11);
        D(t11).g(i11 - z(t11), bVar, z11);
        bVar.f14781c += A;
        if (z11) {
            bVar.f14780b = y(x(t11), ak.a.e(bVar.f14780b));
        }
        return bVar;
    }

    @Override // com.google.android.exoplayer2.z0
    public final z0.b h(Object obj, z0.b bVar) {
        Object w11 = w(obj);
        Object v11 = v(obj);
        int s11 = s(w11);
        int A = A(s11);
        D(s11).h(v11, bVar);
        bVar.f14781c += A;
        bVar.f14780b = obj;
        return bVar;
    }

    @Override // com.google.android.exoplayer2.z0
    public int l(int i11, int i12, boolean z11) {
        if (this.f13032d) {
            if (i12 == 1) {
                i12 = 2;
            }
            z11 = false;
        }
        int u11 = u(i11);
        int A = A(u11);
        int l11 = D(u11).l(i11 - A, i12 != 2 ? i12 : 0, z11);
        if (l11 != -1) {
            return A + l11;
        }
        int C = C(u11, z11);
        while (C != -1 && D(C).q()) {
            C = C(C, z11);
        }
        if (C != -1) {
            return A(C) + D(C).c(z11);
        }
        if (i12 == 2) {
            return c(z11);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.z0
    public final Object m(int i11) {
        int t11 = t(i11);
        return y(x(t11), D(t11).m(i11 - z(t11)));
    }

    @Override // com.google.android.exoplayer2.z0
    public final z0.c o(int i11, z0.c cVar, long j11) {
        int u11 = u(i11);
        int A = A(u11);
        int z11 = z(u11);
        D(u11).o(i11 - A, cVar, j11);
        Object x11 = x(u11);
        if (!z0.c.f14785r.equals(cVar.f14787a)) {
            x11 = y(x11, cVar.f14787a);
        }
        cVar.f14787a = x11;
        cVar.f14799m += z11;
        cVar.f14800n += z11;
        return cVar;
    }

    protected abstract int s(Object obj);

    protected abstract int t(int i11);

    protected abstract int u(int i11);

    protected abstract Object x(int i11);

    protected abstract int z(int i11);
}