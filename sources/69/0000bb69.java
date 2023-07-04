package w0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.o;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a  reason: collision with root package name */
    private final n2.w f55235a;

    /* renamed from: b  reason: collision with root package name */
    private f2.o f55236b;

    /* renamed from: c  reason: collision with root package name */
    private f2.o f55237c;

    public v0(n2.w value) {
        kotlin.jvm.internal.s.g(value, "value");
        this.f55235a = value;
    }

    private final long a(long j11) {
        long b11;
        s1.h a11;
        f2.o oVar = this.f55236b;
        s1.h hVar = null;
        if (oVar != null) {
            if (oVar.h()) {
                f2.o b12 = b();
                if (b12 != null) {
                    a11 = o.a.a(b12, oVar, false, 2, null);
                }
            } else {
                a11 = s1.h.f49955e.a();
            }
            hVar = a11;
        }
        if (hVar == null) {
            hVar = s1.h.f49955e.a();
        }
        b11 = w0.b(j11, hVar);
        return b11;
    }

    public static /* synthetic */ int e(v0 v0Var, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        return v0Var.d(i11, z11);
    }

    public static /* synthetic */ int h(v0 v0Var, long j11, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return v0Var.g(j11, z11);
    }

    private final long k(long j11) {
        s1.f d11;
        f2.o oVar = this.f55236b;
        if (oVar == null) {
            return j11;
        }
        f2.o b11 = b();
        if (b11 == null) {
            d11 = null;
        } else {
            d11 = s1.f.d((oVar.h() && b11.h()) ? oVar.U(b11, j11) : j11);
        }
        return d11 == null ? j11 : d11.t();
    }

    public final f2.o b() {
        return this.f55237c;
    }

    public final f2.o c() {
        return this.f55236b;
    }

    public final int d(int i11, boolean z11) {
        return this.f55235a.n(i11, z11);
    }

    public final int f(float f11) {
        return this.f55235a.q(s1.f.m(k(a(s1.g.a(BitmapDescriptorFactory.HUE_RED, f11)))));
    }

    public final int g(long j11, boolean z11) {
        if (z11) {
            j11 = a(j11);
        }
        return this.f55235a.w(k(j11));
    }

    public final n2.w i() {
        return this.f55235a;
    }

    public final boolean j(long j11) {
        long k11 = k(a(j11));
        int q11 = this.f55235a.q(s1.f.m(k11));
        return s1.f.l(k11) >= this.f55235a.r(q11) && s1.f.l(k11) <= this.f55235a.s(q11);
    }

    public final void l(f2.o oVar) {
        this.f55237c = oVar;
    }

    public final void m(f2.o oVar) {
        this.f55236b = oVar;
    }
}