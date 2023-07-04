package x0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import vz.b0;
import x0.b;

/* loaded from: classes.dex */
public abstract class b<T extends b<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final n2.a f56552a;

    /* renamed from: b  reason: collision with root package name */
    private final long f56553b;

    /* renamed from: c  reason: collision with root package name */
    private final n2.w f56554c;

    /* renamed from: d  reason: collision with root package name */
    private final s2.t f56555d;

    /* renamed from: e  reason: collision with root package name */
    private final w f56556e;

    /* renamed from: f  reason: collision with root package name */
    private long f56557f;

    /* renamed from: g  reason: collision with root package name */
    private n2.a f56558g;

    private b(n2.a aVar, long j11, n2.w wVar, s2.t tVar, w wVar2) {
        this.f56552a = aVar;
        this.f56553b = j11;
        this.f56554c = wVar;
        this.f56555d = tVar;
        this.f56556e = wVar2;
        this.f56557f = o();
        this.f56558g = aVar;
    }

    public /* synthetic */ b(n2.a aVar, long j11, n2.w wVar, s2.t tVar, w wVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, j11, wVar, tVar, wVar2);
    }

    private final int W() {
        return this.f56555d.originalToTransformed(n2.y.i(t()));
    }

    private final int X() {
        return this.f56555d.originalToTransformed(n2.y.k(t()));
    }

    private final int Y() {
        return this.f56555d.originalToTransformed(n2.y.l(t()));
    }

    private final int a(int i11) {
        int i12;
        i12 = m00.l.i(i11, v().length() - 1);
        return i12;
    }

    private final int h(n2.w wVar, int i11) {
        return this.f56555d.transformedToOriginal(wVar.n(wVar.p(i11), true));
    }

    static /* synthetic */ int i(b bVar, n2.w wVar, int i11, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 1) != 0) {
                i11 = bVar.X();
            }
            return bVar.h(wVar, i11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffset");
    }

    private final int j(n2.w wVar, int i11) {
        return this.f56555d.transformedToOriginal(wVar.t(wVar.p(i11)));
    }

    static /* synthetic */ int k(b bVar, n2.w wVar, int i11, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 1) != 0) {
                i11 = bVar.Y();
            }
            return bVar.j(wVar, i11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffset");
    }

    private final int l(n2.w wVar, int i11) {
        if (i11 >= this.f56552a.length()) {
            return this.f56552a.length();
        }
        long B = wVar.B(a(i11));
        if (n2.y.i(B) <= i11) {
            return l(wVar, i11 + 1);
        }
        return this.f56555d.transformedToOriginal(n2.y.i(B));
    }

    static /* synthetic */ int m(b bVar, n2.w wVar, int i11, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 1) != 0) {
                i11 = bVar.W();
            }
            return bVar.l(wVar, i11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffset");
    }

    private final int p() {
        return w0.z.a(v(), n2.y.k(t()));
    }

    private final int q() {
        return w0.z.b(v(), n2.y.l(t()));
    }

    private final int r(n2.w wVar, int i11) {
        if (i11 < 0) {
            return 0;
        }
        long B = wVar.B(a(i11));
        if (n2.y.n(B) >= i11) {
            return r(wVar, i11 - 1);
        }
        return this.f56555d.transformedToOriginal(n2.y.n(B));
    }

    static /* synthetic */ int s(b bVar, n2.w wVar, int i11, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 1) != 0) {
                i11 = bVar.W();
            }
            return bVar.r(wVar, i11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
    }

    private final boolean w() {
        n2.w wVar = this.f56554c;
        return (wVar == null ? null : wVar.x(n2.y.i(t()))) != w2.c.Rtl;
    }

    private final int x(n2.w wVar, int i11) {
        int W = W();
        if (this.f56556e.a() == null) {
            this.f56556e.c(Float.valueOf(wVar.d(W).i()));
        }
        int p11 = wVar.p(W) + i11;
        if (p11 < 0) {
            return 0;
        }
        if (p11 >= wVar.m()) {
            return v().length();
        }
        float l11 = wVar.l(p11) - 1;
        Float a11 = this.f56556e.a();
        kotlin.jvm.internal.s.e(a11);
        float floatValue = a11.floatValue();
        if ((w() && floatValue >= wVar.s(p11)) || (!w() && floatValue <= wVar.r(p11))) {
            return wVar.n(p11, true);
        }
        return n().transformedToOriginal(wVar.w(s1.g.a(a11.floatValue(), l11)));
    }

    public final T A() {
        u().b();
        if (v().length() > 0) {
            if (w()) {
                G();
            } else {
                D();
            }
        }
        return this;
    }

    public final T B() {
        int a11;
        u().b();
        if ((v().length() > 0) && (a11 = w0.a0.a(f().g(), n2.y.i(t()))) != -1) {
            T(a11);
        }
        return this;
    }

    public final T C() {
        u().b();
        if (v().length() > 0) {
            T(p());
        }
        return this;
    }

    public final T D() {
        n2.w g11;
        u().b();
        if ((v().length() > 0) && (g11 = g()) != null) {
            T(m(this, g11, 0, 1, null));
        }
        return this;
    }

    public final T E() {
        int b11;
        u().b();
        if ((v().length() > 0) && (b11 = w0.a0.b(f().g(), n2.y.i(t()))) != -1) {
            T(b11);
        }
        return this;
    }

    public final T F() {
        u().b();
        if (v().length() > 0) {
            T(q());
        }
        return this;
    }

    public final T G() {
        n2.w g11;
        u().b();
        if ((v().length() > 0) && (g11 = g()) != null) {
            T(s(this, g11, 0, 1, null));
        }
        return this;
    }

    public final T H() {
        u().b();
        if (v().length() > 0) {
            if (w()) {
                B();
            } else {
                E();
            }
        }
        return this;
    }

    public final T I() {
        u().b();
        if (v().length() > 0) {
            if (w()) {
                D();
            } else {
                G();
            }
        }
        return this;
    }

    public final T J() {
        u().b();
        if (v().length() > 0) {
            T(v().length());
        }
        return this;
    }

    public final T K() {
        u().b();
        if (v().length() > 0) {
            T(0);
        }
        return this;
    }

    public final T L() {
        n2.w g11;
        u().b();
        if ((v().length() > 0) && (g11 = g()) != null) {
            T(i(this, g11, 0, 1, null));
        }
        return this;
    }

    public final T M() {
        u().b();
        if (v().length() > 0) {
            if (w()) {
                O();
            } else {
                L();
            }
        }
        return this;
    }

    public final T N() {
        u().b();
        if (v().length() > 0) {
            if (w()) {
                L();
            } else {
                O();
            }
        }
        return this;
    }

    public final T O() {
        n2.w g11;
        u().b();
        if ((v().length() > 0) && (g11 = g()) != null) {
            T(k(this, g11, 0, 1, null));
        }
        return this;
    }

    public final T P() {
        n2.w g11;
        if ((v().length() > 0) && (g11 = g()) != null) {
            T(x(g11, -1));
        }
        return this;
    }

    public final T Q() {
        u().b();
        if (v().length() > 0) {
            U(0, v().length());
        }
        return this;
    }

    public final T R() {
        if (v().length() > 0) {
            V(n2.z.b(n2.y.n(o()), n2.y.i(t())));
        }
        return this;
    }

    public final void S(n2.a aVar) {
        kotlin.jvm.internal.s.g(aVar, "<set-?>");
        this.f56558g = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void T(int i11) {
        U(i11, i11);
    }

    protected final void U(int i11, int i12) {
        V(n2.z.b(i11, i12));
    }

    public final void V(long j11) {
        this.f56557f = j11;
    }

    public final T b(h00.l<? super T, b0> or2) {
        kotlin.jvm.internal.s.g(or2, "or");
        u().b();
        if (v().length() > 0) {
            if (n2.y.h(t())) {
                or2.invoke(this);
            } else if (w()) {
                T(n2.y.l(t()));
            } else {
                T(n2.y.k(t()));
            }
        }
        return this;
    }

    public final T c(h00.l<? super T, b0> or2) {
        kotlin.jvm.internal.s.g(or2, "or");
        u().b();
        if (v().length() > 0) {
            if (n2.y.h(t())) {
                or2.invoke(this);
            } else if (w()) {
                T(n2.y.k(t()));
            } else {
                T(n2.y.l(t()));
            }
        }
        return this;
    }

    public final T d() {
        u().b();
        if (v().length() > 0) {
            int length = v().length();
            S(f().subSequence(Math.max(0, n2.y.l(t()) - length), n2.y.l(t())).i(f().subSequence(n2.y.k(t()), Math.min(n2.y.k(t()) + length, v().length()))));
            T(n2.y.l(t()));
        }
        return this;
    }

    public final T e() {
        u().b();
        if (v().length() > 0) {
            T(n2.y.i(t()));
        }
        return this;
    }

    public final n2.a f() {
        return this.f56558g;
    }

    public final n2.w g() {
        return this.f56554c;
    }

    public final s2.t n() {
        return this.f56555d;
    }

    public final long o() {
        return this.f56553b;
    }

    public final long t() {
        return this.f56557f;
    }

    public final w u() {
        return this.f56556e;
    }

    public final String v() {
        return this.f56558g.g();
    }

    public final T y() {
        n2.w g11;
        if ((v().length() > 0) && (g11 = g()) != null) {
            T(x(g11, 1));
        }
        return this;
    }

    public final T z() {
        u().b();
        if (v().length() > 0) {
            if (w()) {
                E();
            } else {
                B();
            }
        }
        return this;
    }
}