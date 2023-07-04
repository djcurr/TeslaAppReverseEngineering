package y0;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final c1.o0 f58370a;

    /* renamed from: b  reason: collision with root package name */
    private final c1.o0 f58371b;

    /* renamed from: c  reason: collision with root package name */
    private final c1.o0 f58372c;

    /* renamed from: d  reason: collision with root package name */
    private final c1.o0 f58373d;

    /* renamed from: e  reason: collision with root package name */
    private final c1.o0 f58374e;

    /* renamed from: f  reason: collision with root package name */
    private final c1.o0 f58375f;

    /* renamed from: g  reason: collision with root package name */
    private final c1.o0 f58376g;

    /* renamed from: h  reason: collision with root package name */
    private final c1.o0 f58377h;

    /* renamed from: i  reason: collision with root package name */
    private final c1.o0 f58378i;

    /* renamed from: j  reason: collision with root package name */
    private final c1.o0 f58379j;

    /* renamed from: k  reason: collision with root package name */
    private final c1.o0 f58380k;

    /* renamed from: l  reason: collision with root package name */
    private final c1.o0 f58381l;

    /* renamed from: m  reason: collision with root package name */
    private final c1.o0 f58382m;

    private l(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, boolean z11) {
        this.f58370a = c1.n1.f(t1.a0.h(j11), c1.n1.o());
        this.f58371b = c1.n1.f(t1.a0.h(j12), c1.n1.o());
        this.f58372c = c1.n1.f(t1.a0.h(j13), c1.n1.o());
        this.f58373d = c1.n1.f(t1.a0.h(j14), c1.n1.o());
        this.f58374e = c1.n1.f(t1.a0.h(j15), c1.n1.o());
        this.f58375f = c1.n1.f(t1.a0.h(j16), c1.n1.o());
        this.f58376g = c1.n1.f(t1.a0.h(j17), c1.n1.o());
        this.f58377h = c1.n1.f(t1.a0.h(j18), c1.n1.o());
        this.f58378i = c1.n1.f(t1.a0.h(j19), c1.n1.o());
        this.f58379j = c1.n1.f(t1.a0.h(j21), c1.n1.o());
        this.f58380k = c1.n1.f(t1.a0.h(j22), c1.n1.o());
        this.f58381l = c1.n1.f(t1.a0.h(j23), c1.n1.o());
        this.f58382m = c1.n1.f(Boolean.valueOf(z11), c1.n1.o());
    }

    public /* synthetic */ l(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, j22, j23, z11);
    }

    public final void A(long j11) {
        this.f58373d.setValue(t1.a0.h(j11));
    }

    public final void B(long j11) {
        this.f58375f.setValue(t1.a0.h(j11));
    }

    public final l a(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, boolean z11) {
        return new l(j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, j22, j23, z11, null);
    }

    public final long c() {
        return ((t1.a0) this.f58374e.getValue()).v();
    }

    public final long d() {
        return ((t1.a0) this.f58376g.getValue()).v();
    }

    public final long e() {
        return ((t1.a0) this.f58379j.getValue()).v();
    }

    public final long f() {
        return ((t1.a0) this.f58381l.getValue()).v();
    }

    public final long g() {
        return ((t1.a0) this.f58377h.getValue()).v();
    }

    public final long h() {
        return ((t1.a0) this.f58378i.getValue()).v();
    }

    public final long i() {
        return ((t1.a0) this.f58380k.getValue()).v();
    }

    public final long j() {
        return ((t1.a0) this.f58370a.getValue()).v();
    }

    public final long k() {
        return ((t1.a0) this.f58371b.getValue()).v();
    }

    public final long l() {
        return ((t1.a0) this.f58372c.getValue()).v();
    }

    public final long m() {
        return ((t1.a0) this.f58373d.getValue()).v();
    }

    public final long n() {
        return ((t1.a0) this.f58375f.getValue()).v();
    }

    public final boolean o() {
        return ((Boolean) this.f58382m.getValue()).booleanValue();
    }

    public final void p(long j11) {
        this.f58374e.setValue(t1.a0.h(j11));
    }

    public final void q(long j11) {
        this.f58376g.setValue(t1.a0.h(j11));
    }

    public final void r(boolean z11) {
        this.f58382m.setValue(Boolean.valueOf(z11));
    }

    public final void s(long j11) {
        this.f58379j.setValue(t1.a0.h(j11));
    }

    public final void t(long j11) {
        this.f58381l.setValue(t1.a0.h(j11));
    }

    public String toString() {
        return "Colors(primary=" + ((Object) t1.a0.u(j())) + ", primaryVariant=" + ((Object) t1.a0.u(k())) + ", secondary=" + ((Object) t1.a0.u(l())) + ", secondaryVariant=" + ((Object) t1.a0.u(m())) + ", background=" + ((Object) t1.a0.u(c())) + ", surface=" + ((Object) t1.a0.u(n())) + ", error=" + ((Object) t1.a0.u(d())) + ", onPrimary=" + ((Object) t1.a0.u(g())) + ", onSecondary=" + ((Object) t1.a0.u(h())) + ", onBackground=" + ((Object) t1.a0.u(e())) + ", onSurface=" + ((Object) t1.a0.u(i())) + ", onError=" + ((Object) t1.a0.u(f())) + ", isLight=" + o() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final void u(long j11) {
        this.f58377h.setValue(t1.a0.h(j11));
    }

    public final void v(long j11) {
        this.f58378i.setValue(t1.a0.h(j11));
    }

    public final void w(long j11) {
        this.f58380k.setValue(t1.a0.h(j11));
    }

    public final void x(long j11) {
        this.f58370a.setValue(t1.a0.h(j11));
    }

    public final void y(long j11) {
        this.f58371b.setValue(t1.a0.h(j11));
    }

    public final void z(long j11) {
        this.f58372c.setValue(t1.a0.h(j11));
    }
}