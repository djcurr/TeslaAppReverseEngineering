package y0;

import c1.v1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v implements g1 {

    /* renamed from: a  reason: collision with root package name */
    private final long f58667a;

    /* renamed from: b  reason: collision with root package name */
    private final long f58668b;

    /* renamed from: c  reason: collision with root package name */
    private final long f58669c;

    /* renamed from: d  reason: collision with root package name */
    private final long f58670d;

    /* renamed from: e  reason: collision with root package name */
    private final long f58671e;

    /* renamed from: f  reason: collision with root package name */
    private final long f58672f;

    /* renamed from: g  reason: collision with root package name */
    private final long f58673g;

    /* renamed from: h  reason: collision with root package name */
    private final long f58674h;

    /* renamed from: i  reason: collision with root package name */
    private final long f58675i;

    /* renamed from: j  reason: collision with root package name */
    private final long f58676j;

    /* renamed from: k  reason: collision with root package name */
    private final long f58677k;

    /* renamed from: l  reason: collision with root package name */
    private final long f58678l;

    /* renamed from: m  reason: collision with root package name */
    private final long f58679m;

    /* renamed from: n  reason: collision with root package name */
    private final long f58680n;

    /* renamed from: o  reason: collision with root package name */
    private final long f58681o;

    /* renamed from: p  reason: collision with root package name */
    private final long f58682p;

    /* renamed from: q  reason: collision with root package name */
    private final long f58683q;

    /* renamed from: r  reason: collision with root package name */
    private final long f58684r;

    /* renamed from: s  reason: collision with root package name */
    private final long f58685s;

    /* renamed from: t  reason: collision with root package name */
    private final long f58686t;

    /* renamed from: u  reason: collision with root package name */
    private final long f58687u;

    private v(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j31, long j32, long j33) {
        this.f58667a = j11;
        this.f58668b = j12;
        this.f58669c = j13;
        this.f58670d = j14;
        this.f58671e = j15;
        this.f58672f = j16;
        this.f58673g = j17;
        this.f58674h = j18;
        this.f58675i = j19;
        this.f58676j = j21;
        this.f58677k = j22;
        this.f58678l = j23;
        this.f58679m = j24;
        this.f58680n = j25;
        this.f58681o = j26;
        this.f58682p = j27;
        this.f58683q = j28;
        this.f58684r = j29;
        this.f58685s = j31;
        this.f58686t = j32;
        this.f58687u = j33;
    }

    public /* synthetic */ v(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j31, long j32, long j33, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, j22, j23, j24, j25, j26, j27, j28, j29, j31, j32, j33);
    }

    private static final boolean k(v1<Boolean> v1Var) {
        return v1Var.getValue().booleanValue();
    }

    private static final boolean l(v1<Boolean> v1Var) {
        return v1Var.getValue().booleanValue();
    }

    @Override // y0.g1
    public v1<t1.a0> a(boolean z11, c1.i iVar, int i11) {
        iVar.x(163023731);
        v1<t1.a0> m11 = c1.n1.m(t1.a0.h(this.f58681o), iVar, 0);
        iVar.N();
        return m11;
    }

    @Override // y0.g1
    public v1<t1.a0> b(boolean z11, boolean z12, c1.i iVar, int i11) {
        long j11;
        iVar.x(-2025568038);
        if (!z11) {
            j11 = this.f58679m;
        } else if (z12) {
            j11 = this.f58680n;
        } else {
            j11 = this.f58678l;
        }
        v1<t1.a0> m11 = c1.n1.m(t1.a0.h(j11), iVar, 0);
        iVar.N();
        return m11;
    }

    @Override // y0.g1
    public v1<t1.a0> c(boolean z11, boolean z12, o0.k interactionSource, c1.i iVar, int i11) {
        long j11;
        v1<t1.a0> m11;
        kotlin.jvm.internal.s.g(interactionSource, "interactionSource");
        iVar.x(-2054208596);
        v1<Boolean> a11 = o0.f.a(interactionSource, iVar, (i11 >> 6) & 14);
        if (!z11) {
            j11 = this.f58674h;
        } else if (z12) {
            j11 = this.f58673g;
        } else {
            j11 = k(a11) ? this.f58671e : this.f58672f;
        }
        long j12 = j11;
        if (z11) {
            iVar.x(-2054208139);
            m11 = k0.u.a(j12, l0.j.k(150, 0, null, 6, null), null, iVar, 48, 4);
            iVar.N();
        } else {
            iVar.x(-2054208034);
            m11 = c1.n1.m(t1.a0.h(j12), iVar, 0);
            iVar.N();
        }
        iVar.N();
        return m11;
    }

    @Override // y0.g1
    public v1<t1.a0> d(boolean z11, c1.i iVar, int i11) {
        iVar.x(-509860761);
        v1<t1.a0> m11 = c1.n1.m(t1.a0.h(z11 ? this.f58667a : this.f58668b), iVar, 0);
        iVar.N();
        return m11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.s.c(kotlin.jvm.internal.m0.b(v.class), kotlin.jvm.internal.m0.b(obj.getClass()))) {
            return false;
        }
        v vVar = (v) obj;
        return t1.a0.n(this.f58667a, vVar.f58667a) && t1.a0.n(this.f58668b, vVar.f58668b) && t1.a0.n(this.f58669c, vVar.f58669c) && t1.a0.n(this.f58670d, vVar.f58670d) && t1.a0.n(this.f58671e, vVar.f58671e) && t1.a0.n(this.f58672f, vVar.f58672f) && t1.a0.n(this.f58673g, vVar.f58673g) && t1.a0.n(this.f58674h, vVar.f58674h) && t1.a0.n(this.f58675i, vVar.f58675i) && t1.a0.n(this.f58676j, vVar.f58676j) && t1.a0.n(this.f58677k, vVar.f58677k) && t1.a0.n(this.f58678l, vVar.f58678l) && t1.a0.n(this.f58679m, vVar.f58679m) && t1.a0.n(this.f58680n, vVar.f58680n) && t1.a0.n(this.f58681o, vVar.f58681o) && t1.a0.n(this.f58682p, vVar.f58682p) && t1.a0.n(this.f58683q, vVar.f58683q) && t1.a0.n(this.f58684r, vVar.f58684r) && t1.a0.n(this.f58685s, vVar.f58685s) && t1.a0.n(this.f58686t, vVar.f58686t) && t1.a0.n(this.f58687u, vVar.f58687u);
    }

    @Override // y0.g1
    public v1<t1.a0> f(boolean z11, boolean z12, c1.i iVar, int i11) {
        long j11;
        iVar.x(-1018451296);
        if (!z11) {
            j11 = this.f58676j;
        } else if (z12) {
            j11 = this.f58677k;
        } else {
            j11 = this.f58675i;
        }
        v1<t1.a0> m11 = c1.n1.m(t1.a0.h(j11), iVar, 0);
        iVar.N();
        return m11;
    }

    @Override // y0.g1
    public v1<t1.a0> h(boolean z11, c1.i iVar, int i11) {
        iVar.x(-853664209);
        v1<t1.a0> m11 = c1.n1.m(t1.a0.h(z11 ? this.f58686t : this.f58687u), iVar, 0);
        iVar.N();
        return m11;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((t1.a0.t(this.f58667a) * 31) + t1.a0.t(this.f58668b)) * 31) + t1.a0.t(this.f58669c)) * 31) + t1.a0.t(this.f58670d)) * 31) + t1.a0.t(this.f58671e)) * 31) + t1.a0.t(this.f58672f)) * 31) + t1.a0.t(this.f58673g)) * 31) + t1.a0.t(this.f58674h)) * 31) + t1.a0.t(this.f58675i)) * 31) + t1.a0.t(this.f58676j)) * 31) + t1.a0.t(this.f58677k)) * 31) + t1.a0.t(this.f58678l)) * 31) + t1.a0.t(this.f58679m)) * 31) + t1.a0.t(this.f58680n)) * 31) + t1.a0.t(this.f58681o)) * 31) + t1.a0.t(this.f58682p)) * 31) + t1.a0.t(this.f58683q)) * 31) + t1.a0.t(this.f58684r)) * 31) + t1.a0.t(this.f58685s)) * 31) + t1.a0.t(this.f58686t)) * 31) + t1.a0.t(this.f58687u);
    }

    @Override // y0.g1
    public v1<t1.a0> i(boolean z11, boolean z12, o0.k interactionSource, c1.i iVar, int i11) {
        long j11;
        kotlin.jvm.internal.s.g(interactionSource, "interactionSource");
        iVar.x(863335084);
        v1<Boolean> a11 = o0.f.a(interactionSource, iVar, (i11 >> 6) & 14);
        if (!z11) {
            j11 = this.f58684r;
        } else if (z12) {
            j11 = this.f58685s;
        } else {
            j11 = l(a11) ? this.f58682p : this.f58683q;
        }
        v1<t1.a0> m11 = c1.n1.m(t1.a0.h(j11), iVar, 0);
        iVar.N();
        return m11;
    }

    @Override // y0.g1
    public v1<t1.a0> j(boolean z11, c1.i iVar, int i11) {
        iVar.x(-1692277385);
        v1<t1.a0> m11 = c1.n1.m(t1.a0.h(z11 ? this.f58670d : this.f58669c), iVar, 0);
        iVar.N();
        return m11;
    }
}