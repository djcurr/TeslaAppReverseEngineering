package v1;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s1.l;
import t1.a0;
import t1.b0;
import t1.d0;
import t1.f1;
import t1.g1;
import t1.h0;
import t1.o0;
import t1.p;
import t1.p0;
import t1.q0;
import t1.r0;
import t1.s;
import t1.u;
import v1.e;
import x2.q;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    private final C1210a f53855a = new C1210a(null, null, null, 0, 15, null);

    /* renamed from: b  reason: collision with root package name */
    private final d f53856b = new b();

    /* renamed from: c  reason: collision with root package name */
    private o0 f53857c;

    /* renamed from: d  reason: collision with root package name */
    private o0 f53858d;

    /* loaded from: classes.dex */
    public static final class b implements d {

        /* renamed from: a  reason: collision with root package name */
        private final g f53863a;

        b() {
            g c11;
            c11 = v1.b.c(this);
            this.f53863a = c11;
        }

        @Override // v1.d
        public g a() {
            return this.f53863a;
        }

        @Override // v1.d
        public u b() {
            return a.this.D().e();
        }

        @Override // v1.d
        public long c() {
            return a.this.D().h();
        }

        @Override // v1.d
        public void d(long j11) {
            a.this.D().l(j11);
        }
    }

    static /* synthetic */ o0 C(a aVar, s sVar, float f11, float f12, int i11, int i12, r0 r0Var, float f13, b0 b0Var, int i13, int i14, int i15, Object obj) {
        return aVar.v(sVar, f11, f12, i11, i12, r0Var, f13, b0Var, i13, (i15 & 512) != 0 ? e.f53867k1.b() : i14);
    }

    private final long J(long j11, float f11) {
        return !((f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1)) == 0) ? a0.l(j11, a0.o(j11) * f11, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j11;
    }

    private final o0 L() {
        o0 o0Var = this.f53857c;
        if (o0Var == null) {
            o0 a11 = t1.i.a();
            a11.v(p0.f51496a.a());
            this.f53857c = a11;
            return a11;
        }
        return o0Var;
    }

    private final o0 S() {
        o0 o0Var = this.f53858d;
        if (o0Var == null) {
            o0 a11 = t1.i.a();
            a11.v(p0.f51496a.b());
            this.f53858d = a11;
            return a11;
        }
        return o0Var;
    }

    private final o0 T(f fVar) {
        if (kotlin.jvm.internal.s.c(fVar, i.f53871a)) {
            return L();
        }
        if (fVar instanceof j) {
            o0 S = S();
            j jVar = (j) fVar;
            if (!(S.x() == jVar.f())) {
                S.w(jVar.f());
            }
            if (!f1.g(S.i(), jVar.b())) {
                S.c(jVar.b());
            }
            if (!(S.p() == jVar.d())) {
                S.t(jVar.d());
            }
            if (!g1.g(S.o(), jVar.c())) {
                S.j(jVar.c());
            }
            if (!kotlin.jvm.internal.s.c(S.m(), jVar.e())) {
                S.k(jVar.e());
            }
            return S;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final o0 a(long j11, f fVar, float f11, b0 b0Var, int i11, int i12) {
        o0 T = T(fVar);
        long J = J(j11, f11);
        if (!a0.n(T.a(), J)) {
            T.l(J);
        }
        if (T.s() != null) {
            T.r(null);
        }
        if (!kotlin.jvm.internal.s.c(T.e(), b0Var)) {
            T.f(b0Var);
        }
        if (!p.E(T.n(), i11)) {
            T.d(i11);
        }
        if (!d0.d(T.u(), i12)) {
            T.g(i12);
        }
        return T;
    }

    static /* synthetic */ o0 h(a aVar, long j11, f fVar, float f11, b0 b0Var, int i11, int i12, int i13, Object obj) {
        return aVar.a(j11, fVar, f11, b0Var, i11, (i13 & 32) != 0 ? e.f53867k1.b() : i12);
    }

    private final o0 o(s sVar, f fVar, float f11, b0 b0Var, int i11, int i12) {
        o0 T = T(fVar);
        if (sVar != null) {
            sVar.a(c(), T, f11);
        } else {
            if (!(T.h() == f11)) {
                T.b(f11);
            }
        }
        if (!kotlin.jvm.internal.s.c(T.e(), b0Var)) {
            T.f(b0Var);
        }
        if (!p.E(T.n(), i11)) {
            T.d(i11);
        }
        if (!d0.d(T.u(), i12)) {
            T.g(i12);
        }
        return T;
    }

    static /* synthetic */ o0 p(a aVar, s sVar, f fVar, float f11, b0 b0Var, int i11, int i12, int i13, Object obj) {
        if ((i13 & 32) != 0) {
            i12 = e.f53867k1.b();
        }
        return aVar.o(sVar, fVar, f11, b0Var, i11, i12);
    }

    private final o0 t(long j11, float f11, float f12, int i11, int i12, r0 r0Var, float f13, b0 b0Var, int i13, int i14) {
        o0 S = S();
        long J = J(j11, f13);
        if (!a0.n(S.a(), J)) {
            S.l(J);
        }
        if (S.s() != null) {
            S.r(null);
        }
        if (!kotlin.jvm.internal.s.c(S.e(), b0Var)) {
            S.f(b0Var);
        }
        if (!p.E(S.n(), i13)) {
            S.d(i13);
        }
        if (!(S.x() == f11)) {
            S.w(f11);
        }
        if (!(S.p() == f12)) {
            S.t(f12);
        }
        if (!f1.g(S.i(), i11)) {
            S.c(i11);
        }
        if (!g1.g(S.o(), i12)) {
            S.j(i12);
        }
        if (!kotlin.jvm.internal.s.c(S.m(), r0Var)) {
            S.k(r0Var);
        }
        if (!d0.d(S.u(), i14)) {
            S.g(i14);
        }
        return S;
    }

    static /* synthetic */ o0 u(a aVar, long j11, float f11, float f12, int i11, int i12, r0 r0Var, float f13, b0 b0Var, int i13, int i14, int i15, Object obj) {
        return aVar.t(j11, f11, f12, i11, i12, r0Var, f13, b0Var, i13, (i15 & 512) != 0 ? e.f53867k1.b() : i14);
    }

    private final o0 v(s sVar, float f11, float f12, int i11, int i12, r0 r0Var, float f13, b0 b0Var, int i13, int i14) {
        o0 S = S();
        if (sVar != null) {
            sVar.a(c(), S, f13);
        } else {
            if (!(S.h() == f13)) {
                S.b(f13);
            }
        }
        if (!kotlin.jvm.internal.s.c(S.e(), b0Var)) {
            S.f(b0Var);
        }
        if (!p.E(S.n(), i13)) {
            S.d(i13);
        }
        if (!(S.x() == f11)) {
            S.w(f11);
        }
        if (!(S.p() == f12)) {
            S.t(f12);
        }
        if (!f1.g(S.i(), i11)) {
            S.c(i11);
        }
        if (!g1.g(S.o(), i12)) {
            S.j(i12);
        }
        if (!kotlin.jvm.internal.s.c(S.m(), r0Var)) {
            S.k(r0Var);
        }
        if (!d0.d(S.u(), i14)) {
            S.g(i14);
        }
        return S;
    }

    @Override // v1.e
    public void A(long j11, long j12, long j13, float f11, int i11, r0 r0Var, float f12, b0 b0Var, int i12) {
        this.f53855a.e().j(j12, j13, u(this, j11, f11, 4.0f, i11, g1.f51434b.b(), r0Var, f12, b0Var, i12, 0, 512, null));
    }

    public final C1210a D() {
        return this.f53855a;
    }

    @Override // x2.d
    public int G(float f11) {
        return e.b.q(this, f11);
    }

    @Override // v1.e
    public void K(long j11, long j12, long j13, long j14, f style, float f11, b0 b0Var, int i11) {
        kotlin.jvm.internal.s.g(style, "style");
        this.f53855a.e().r(s1.f.l(j12), s1.f.m(j12), s1.f.l(j12) + l.i(j13), s1.f.m(j12) + l.g(j13), s1.a.d(j14), s1.a.e(j14), h(this, j11, style, f11, b0Var, i11, 0, 32, null));
    }

    @Override // x2.d
    public float M(long j11) {
        return e.b.s(this, j11);
    }

    @Override // v1.e
    public void O(q0 path, long j11, float f11, f style, b0 b0Var, int i11) {
        kotlin.jvm.internal.s.g(path, "path");
        kotlin.jvm.internal.s.g(style, "style");
        this.f53855a.e().t(path, h(this, j11, style, f11, b0Var, i11, 0, 32, null));
    }

    @Override // v1.e
    public void V(long j11, float f11, long j12, float f12, f style, b0 b0Var, int i11) {
        kotlin.jvm.internal.s.g(style, "style");
        this.f53855a.e().o(j12, f11, h(this, j11, style, f12, b0Var, i11, 0, 32, null));
    }

    @Override // v1.e
    public void W(long j11, float f11, float f12, boolean z11, long j12, long j13, float f13, f style, b0 b0Var, int i11) {
        kotlin.jvm.internal.s.g(style, "style");
        this.f53855a.e().f(s1.f.l(j12), s1.f.m(j12), s1.f.l(j12) + l.i(j13), s1.f.m(j12) + l.g(j13), f11, f12, z11, h(this, j11, style, f13, b0Var, i11, 0, 32, null));
    }

    @Override // x2.d
    public float b0(int i11) {
        return e.b.r(this, i11);
    }

    @Override // v1.e
    public long c() {
        return e.b.n(this);
    }

    @Override // x2.d
    public float c0() {
        return this.f53855a.f().c0();
    }

    @Override // v1.e
    public void d0(h0 image, long j11, long j12, long j13, long j14, float f11, f style, b0 b0Var, int i11, int i12) {
        kotlin.jvm.internal.s.g(image, "image");
        kotlin.jvm.internal.s.g(style, "style");
        this.f53855a.e().l(image, j11, j12, j13, j14, o(null, style, f11, b0Var, i11, i12));
    }

    @Override // v1.e
    public void f0(s brush, long j11, long j12, float f11, f style, b0 b0Var, int i11) {
        kotlin.jvm.internal.s.g(brush, "brush");
        kotlin.jvm.internal.s.g(style, "style");
        this.f53855a.e().d(s1.f.l(j11), s1.f.m(j11), s1.f.l(j11) + l.i(j12), s1.f.m(j11) + l.g(j12), p(this, brush, style, f11, b0Var, i11, 0, 32, null));
    }

    @Override // x2.d
    public float getDensity() {
        return this.f53855a.f().getDensity();
    }

    @Override // v1.e
    public q getLayoutDirection() {
        return this.f53855a.g();
    }

    @Override // x2.d
    public float i0(float f11) {
        return e.b.t(this, f11);
    }

    @Override // v1.e
    public d j0() {
        return this.f53856b;
    }

    @Override // x2.d
    public int l0(long j11) {
        return e.b.p(this, j11);
    }

    @Override // v1.e
    public void m0(h0 image, long j11, float f11, f style, b0 b0Var, int i11) {
        kotlin.jvm.internal.s.g(image, "image");
        kotlin.jvm.internal.s.g(style, "style");
        this.f53855a.e().s(image, j11, p(this, null, style, f11, b0Var, i11, 0, 32, null));
    }

    @Override // v1.e
    public long o0() {
        return e.b.m(this);
    }

    @Override // x2.d
    public long p0(long j11) {
        return e.b.u(this, j11);
    }

    @Override // v1.e
    public void q(s brush, long j11, long j12, float f11, int i11, r0 r0Var, float f12, b0 b0Var, int i12) {
        kotlin.jvm.internal.s.g(brush, "brush");
        this.f53855a.e().j(j11, j12, C(this, brush, f11, 4.0f, i11, g1.f51434b.b(), r0Var, f12, b0Var, i12, 0, 512, null));
    }

    @Override // v1.e
    public void r(q0 path, s brush, float f11, f style, b0 b0Var, int i11) {
        kotlin.jvm.internal.s.g(path, "path");
        kotlin.jvm.internal.s.g(brush, "brush");
        kotlin.jvm.internal.s.g(style, "style");
        this.f53855a.e().t(path, p(this, brush, style, f11, b0Var, i11, 0, 32, null));
    }

    @Override // v1.e
    public void s(s brush, long j11, long j12, long j13, float f11, f style, b0 b0Var, int i11) {
        kotlin.jvm.internal.s.g(brush, "brush");
        kotlin.jvm.internal.s.g(style, "style");
        this.f53855a.e().r(s1.f.l(j11), s1.f.m(j11), s1.f.l(j11) + l.i(j12), s1.f.m(j11) + l.g(j12), s1.a.d(j13), s1.a.e(j13), p(this, brush, style, f11, b0Var, i11, 0, 32, null));
    }

    @Override // v1.e
    public void y(long j11, long j12, long j13, float f11, f style, b0 b0Var, int i11) {
        kotlin.jvm.internal.s.g(style, "style");
        this.f53855a.e().d(s1.f.l(j12), s1.f.m(j12), s1.f.l(j12) + l.i(j13), s1.f.m(j12) + l.g(j13), h(this, j11, style, f11, b0Var, i11, 0, 32, null));
    }

    /* renamed from: v1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1210a {

        /* renamed from: a  reason: collision with root package name */
        private x2.d f53859a;

        /* renamed from: b  reason: collision with root package name */
        private q f53860b;

        /* renamed from: c  reason: collision with root package name */
        private u f53861c;

        /* renamed from: d  reason: collision with root package name */
        private long f53862d;

        private C1210a(x2.d dVar, q qVar, u uVar, long j11) {
            this.f53859a = dVar;
            this.f53860b = qVar;
            this.f53861c = uVar;
            this.f53862d = j11;
        }

        public /* synthetic */ C1210a(x2.d dVar, q qVar, u uVar, long j11, DefaultConstructorMarker defaultConstructorMarker) {
            this(dVar, qVar, uVar, j11);
        }

        public final x2.d a() {
            return this.f53859a;
        }

        public final q b() {
            return this.f53860b;
        }

        public final u c() {
            return this.f53861c;
        }

        public final long d() {
            return this.f53862d;
        }

        public final u e() {
            return this.f53861c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C1210a) {
                C1210a c1210a = (C1210a) obj;
                return kotlin.jvm.internal.s.c(this.f53859a, c1210a.f53859a) && this.f53860b == c1210a.f53860b && kotlin.jvm.internal.s.c(this.f53861c, c1210a.f53861c) && l.f(this.f53862d, c1210a.f53862d);
            }
            return false;
        }

        public final x2.d f() {
            return this.f53859a;
        }

        public final q g() {
            return this.f53860b;
        }

        public final long h() {
            return this.f53862d;
        }

        public int hashCode() {
            return (((((this.f53859a.hashCode() * 31) + this.f53860b.hashCode()) * 31) + this.f53861c.hashCode()) * 31) + l.j(this.f53862d);
        }

        public final void i(u uVar) {
            kotlin.jvm.internal.s.g(uVar, "<set-?>");
            this.f53861c = uVar;
        }

        public final void j(x2.d dVar) {
            kotlin.jvm.internal.s.g(dVar, "<set-?>");
            this.f53859a = dVar;
        }

        public final void k(q qVar) {
            kotlin.jvm.internal.s.g(qVar, "<set-?>");
            this.f53860b = qVar;
        }

        public final void l(long j11) {
            this.f53862d = j11;
        }

        public String toString() {
            return "DrawParams(density=" + this.f53859a + ", layoutDirection=" + this.f53860b + ", canvas=" + this.f53861c + ", size=" + ((Object) l.k(this.f53862d)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ C1210a(x2.d dVar, q qVar, u uVar, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? v1.b.f53865a : dVar, (i11 & 2) != 0 ? q.Ltr : qVar, (i11 & 4) != 0 ? new h() : uVar, (i11 & 8) != 0 ? l.f49969b.b() : j11, null);
        }
    }
}