package l0;

import s1.f;
import s1.h;
import s1.l;
import x2.g;
import x2.i;
import x2.k;
import x2.o;

/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a  reason: collision with root package name */
    private static final d1<Float, l0.m> f36112a = a(e.f36125a, f.f36126a);

    /* renamed from: b  reason: collision with root package name */
    private static final d1<Integer, l0.m> f36113b = a(k.f36131a, l.f36132a);

    /* renamed from: c  reason: collision with root package name */
    private static final d1<x2.g, l0.m> f36114c = a(c.f36123a, d.f36124a);

    /* renamed from: d  reason: collision with root package name */
    private static final d1<x2.i, l0.n> f36115d = a(a.f36121a, b.f36122a);

    /* renamed from: e  reason: collision with root package name */
    private static final d1<s1.l, l0.n> f36116e = a(q.f36137a, r.f36138a);

    /* renamed from: f  reason: collision with root package name */
    private static final d1<s1.f, l0.n> f36117f = a(m.f36133a, n.f36134a);

    /* renamed from: g  reason: collision with root package name */
    private static final d1<x2.k, l0.n> f36118g = a(g.f36127a, h.f36128a);

    /* renamed from: h  reason: collision with root package name */
    private static final d1<x2.o, l0.n> f36119h = a(i.f36129a, j.f36130a);

    /* renamed from: i  reason: collision with root package name */
    private static final d1<s1.h, l0.o> f36120i = a(o.f36135a, p.f36136a);

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<x2.i, l0.n> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f36121a = new a();

        a() {
            super(1);
        }

        public final l0.n a(long j11) {
            return new l0.n(x2.i.f(j11), x2.i.g(j11));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ l0.n invoke(x2.i iVar) {
            return a(iVar.j());
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<l0.n, x2.i> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f36122a = new b();

        b() {
            super(1);
        }

        public final long a(l0.n it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return x2.h.a(x2.g.f(it2.f()), x2.g.f(it2.g()));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ x2.i invoke(l0.n nVar) {
            return x2.i.b(a(nVar));
        }
    }

    /* loaded from: classes.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.l<x2.g, l0.m> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f36123a = new c();

        c() {
            super(1);
        }

        public final l0.m a(float f11) {
            return new l0.m(f11);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ l0.m invoke(x2.g gVar) {
            return a(gVar.l());
        }
    }

    /* loaded from: classes.dex */
    static final class d extends kotlin.jvm.internal.u implements h00.l<l0.m, x2.g> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f36124a = new d();

        d() {
            super(1);
        }

        public final float a(l0.m it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return x2.g.f(it2.f());
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ x2.g invoke(l0.m mVar) {
            return x2.g.c(a(mVar));
        }
    }

    /* loaded from: classes.dex */
    static final class e extends kotlin.jvm.internal.u implements h00.l<Float, l0.m> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f36125a = new e();

        e() {
            super(1);
        }

        public final l0.m a(float f11) {
            return new l0.m(f11);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ l0.m invoke(Float f11) {
            return a(f11.floatValue());
        }
    }

    /* loaded from: classes.dex */
    static final class f extends kotlin.jvm.internal.u implements h00.l<l0.m, Float> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f36126a = new f();

        f() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Float invoke(l0.m it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return Float.valueOf(it2.f());
        }
    }

    /* loaded from: classes.dex */
    static final class g extends kotlin.jvm.internal.u implements h00.l<x2.k, l0.n> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f36127a = new g();

        g() {
            super(1);
        }

        public final l0.n a(long j11) {
            return new l0.n(x2.k.h(j11), x2.k.i(j11));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ l0.n invoke(x2.k kVar) {
            return a(kVar.l());
        }
    }

    /* loaded from: classes.dex */
    static final class h extends kotlin.jvm.internal.u implements h00.l<l0.n, x2.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f36128a = new h();

        h() {
            super(1);
        }

        public final long a(l0.n it2) {
            int c11;
            int c12;
            kotlin.jvm.internal.s.g(it2, "it");
            c11 = j00.c.c(it2.f());
            c12 = j00.c.c(it2.g());
            return x2.l.a(c11, c12);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ x2.k invoke(l0.n nVar) {
            return x2.k.b(a(nVar));
        }
    }

    /* loaded from: classes.dex */
    static final class i extends kotlin.jvm.internal.u implements h00.l<x2.o, l0.n> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f36129a = new i();

        i() {
            super(1);
        }

        public final l0.n a(long j11) {
            return new l0.n(x2.o.g(j11), x2.o.f(j11));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ l0.n invoke(x2.o oVar) {
            return a(oVar.j());
        }
    }

    /* loaded from: classes.dex */
    static final class j extends kotlin.jvm.internal.u implements h00.l<l0.n, x2.o> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f36130a = new j();

        j() {
            super(1);
        }

        public final long a(l0.n it2) {
            int c11;
            int c12;
            kotlin.jvm.internal.s.g(it2, "it");
            c11 = j00.c.c(it2.f());
            c12 = j00.c.c(it2.g());
            return x2.p.a(c11, c12);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ x2.o invoke(l0.n nVar) {
            return x2.o.b(a(nVar));
        }
    }

    /* loaded from: classes.dex */
    static final class k extends kotlin.jvm.internal.u implements h00.l<Integer, l0.m> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f36131a = new k();

        k() {
            super(1);
        }

        public final l0.m a(int i11) {
            return new l0.m(i11);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ l0.m invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* loaded from: classes.dex */
    static final class l extends kotlin.jvm.internal.u implements h00.l<l0.m, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f36132a = new l();

        l() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Integer invoke(l0.m it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return Integer.valueOf((int) it2.f());
        }
    }

    /* loaded from: classes.dex */
    static final class m extends kotlin.jvm.internal.u implements h00.l<s1.f, l0.n> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f36133a = new m();

        m() {
            super(1);
        }

        public final l0.n a(long j11) {
            return new l0.n(s1.f.l(j11), s1.f.m(j11));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ l0.n invoke(s1.f fVar) {
            return a(fVar.t());
        }
    }

    /* loaded from: classes.dex */
    static final class n extends kotlin.jvm.internal.u implements h00.l<l0.n, s1.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f36134a = new n();

        n() {
            super(1);
        }

        public final long a(l0.n it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return s1.g.a(it2.f(), it2.g());
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ s1.f invoke(l0.n nVar) {
            return s1.f.d(a(nVar));
        }
    }

    /* loaded from: classes.dex */
    static final class o extends kotlin.jvm.internal.u implements h00.l<s1.h, l0.o> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f36135a = new o();

        o() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final l0.o invoke(s1.h it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return new l0.o(it2.i(), it2.l(), it2.j(), it2.e());
        }
    }

    /* loaded from: classes.dex */
    static final class p extends kotlin.jvm.internal.u implements h00.l<l0.o, s1.h> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f36136a = new p();

        p() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final s1.h invoke(l0.o it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return new s1.h(it2.f(), it2.g(), it2.h(), it2.i());
        }
    }

    /* loaded from: classes.dex */
    static final class q extends kotlin.jvm.internal.u implements h00.l<s1.l, l0.n> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f36137a = new q();

        q() {
            super(1);
        }

        public final l0.n a(long j11) {
            return new l0.n(s1.l.i(j11), s1.l.g(j11));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ l0.n invoke(s1.l lVar) {
            return a(lVar.l());
        }
    }

    /* loaded from: classes.dex */
    static final class r extends kotlin.jvm.internal.u implements h00.l<l0.n, s1.l> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f36138a = new r();

        r() {
            super(1);
        }

        public final long a(l0.n it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return s1.m.a(it2.f(), it2.g());
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ s1.l invoke(l0.n nVar) {
            return s1.l.c(a(nVar));
        }
    }

    public static final <T, V extends l0.p> d1<T, V> a(h00.l<? super T, ? extends V> convertToVector, h00.l<? super V, ? extends T> convertFromVector) {
        kotlin.jvm.internal.s.g(convertToVector, "convertToVector");
        kotlin.jvm.internal.s.g(convertFromVector, "convertFromVector");
        return new e1(convertToVector, convertFromVector);
    }

    public static final d1<Float, l0.m> b(kotlin.jvm.internal.l lVar) {
        kotlin.jvm.internal.s.g(lVar, "<this>");
        return f36112a;
    }

    public static final d1<Integer, l0.m> c(kotlin.jvm.internal.r rVar) {
        kotlin.jvm.internal.s.g(rVar, "<this>");
        return f36113b;
    }

    public static final d1<s1.f, l0.n> d(f.a aVar) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        return f36117f;
    }

    public static final d1<s1.h, l0.o> e(h.a aVar) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        return f36120i;
    }

    public static final d1<s1.l, l0.n> f(l.a aVar) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        return f36116e;
    }

    public static final d1<x2.g, l0.m> g(g.a aVar) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        return f36114c;
    }

    public static final d1<x2.i, l0.n> h(i.a aVar) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        return f36115d;
    }

    public static final d1<x2.k, l0.n> i(k.a aVar) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        return f36118g;
    }

    public static final d1<x2.o, l0.n> j(o.a aVar) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        return f36119h;
    }

    public static final float k(float f11, float f12, float f13) {
        return (f11 * (1 - f13)) + (f12 * f13);
    }
}