package y0;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a */
    private static final c1.w0<l> f58404a = c1.r.d(a.f58405a);

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<l> {

        /* renamed from: a */
        public static final a f58405a = new a();

        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final l invoke() {
            return m.g(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 4095, null);
        }
    }

    public static final long a(l contentColorFor, long j11) {
        kotlin.jvm.internal.s.g(contentColorFor, "$this$contentColorFor");
        if (!t1.a0.n(j11, contentColorFor.j()) && !t1.a0.n(j11, contentColorFor.k())) {
            if (!t1.a0.n(j11, contentColorFor.l()) && !t1.a0.n(j11, contentColorFor.m())) {
                return t1.a0.n(j11, contentColorFor.c()) ? contentColorFor.e() : t1.a0.n(j11, contentColorFor.n()) ? contentColorFor.i() : t1.a0.n(j11, contentColorFor.d()) ? contentColorFor.f() : t1.a0.f51365b.f();
            }
            return contentColorFor.h();
        }
        return contentColorFor.g();
    }

    public static final long b(long j11, c1.i iVar, int i11) {
        long a11 = a(h0.f58131a.a(iVar, 6), j11);
        return (a11 > t1.a0.f51365b.f() ? 1 : (a11 == t1.a0.f51365b.f() ? 0 : -1)) != 0 ? a11 : ((t1.a0) iVar.A(p.a())).v();
    }

    public static final l c(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23) {
        return new l(j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, j22, j23, false, null);
    }

    public static /* synthetic */ l d(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, int i11, Object obj) {
        long c11 = (i11 & 1) != 0 ? t1.c0.c(4290479868L) : j11;
        long c12 = (i11 & 2) != 0 ? t1.c0.c(4281794739L) : j12;
        long c13 = (i11 & 4) != 0 ? t1.c0.c(4278442694L) : j13;
        return c(c11, c12, c13, (i11 & 8) != 0 ? c13 : j14, (i11 & 16) != 0 ? t1.c0.c(4279374354L) : j15, (i11 & 32) != 0 ? t1.c0.c(4279374354L) : j16, (i11 & 64) != 0 ? t1.c0.c(4291782265L) : j17, (i11 & 128) != 0 ? t1.a0.f51365b.a() : j18, (i11 & 256) != 0 ? t1.a0.f51365b.a() : j19, (i11 & 512) != 0 ? t1.a0.f51365b.g() : j21, (i11 & 1024) != 0 ? t1.a0.f51365b.g() : j22, (i11 & 2048) != 0 ? t1.a0.f51365b.a() : j23);
    }

    public static final c1.w0<l> e() {
        return f58404a;
    }

    public static final l f(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23) {
        return new l(j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, j22, j23, true, null);
    }

    public static /* synthetic */ l g(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, int i11, Object obj) {
        return f((i11 & 1) != 0 ? t1.c0.c(4284612846L) : j11, (i11 & 2) != 0 ? t1.c0.c(4281794739L) : j12, (i11 & 4) != 0 ? t1.c0.c(4278442694L) : j13, (i11 & 8) != 0 ? t1.c0.c(4278290310L) : j14, (i11 & 16) != 0 ? t1.a0.f51365b.g() : j15, (i11 & 32) != 0 ? t1.a0.f51365b.g() : j16, (i11 & 64) != 0 ? t1.c0.c(4289724448L) : j17, (i11 & 128) != 0 ? t1.a0.f51365b.g() : j18, (i11 & 256) != 0 ? t1.a0.f51365b.a() : j19, (i11 & 512) != 0 ? t1.a0.f51365b.a() : j21, (i11 & 1024) != 0 ? t1.a0.f51365b.a() : j22, (i11 & 2048) != 0 ? t1.a0.f51365b.g() : j23);
    }

    public static final void h(l lVar, l other) {
        kotlin.jvm.internal.s.g(lVar, "<this>");
        kotlin.jvm.internal.s.g(other, "other");
        lVar.x(other.j());
        lVar.y(other.k());
        lVar.z(other.l());
        lVar.A(other.m());
        lVar.p(other.c());
        lVar.B(other.n());
        lVar.q(other.d());
        lVar.u(other.g());
        lVar.v(other.h());
        lVar.s(other.e());
        lVar.w(other.i());
        lVar.t(other.f());
        lVar.r(other.o());
    }
}