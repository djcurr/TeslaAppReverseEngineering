package w0;

import c1.s1;
import java.util.List;
import r2.d;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    private d0 f55205a;

    /* renamed from: b  reason: collision with root package name */
    private final s2.f f55206b;

    /* renamed from: c  reason: collision with root package name */
    private s2.h0 f55207c;

    /* renamed from: d  reason: collision with root package name */
    private final c1.o0 f55208d;

    /* renamed from: e  reason: collision with root package name */
    private f2.o f55209e;

    /* renamed from: f  reason: collision with root package name */
    private v0 f55210f;

    /* renamed from: g  reason: collision with root package name */
    private final c1.o0 f55211g;

    /* renamed from: h  reason: collision with root package name */
    private final c1.o0 f55212h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f55213i;

    /* renamed from: j  reason: collision with root package name */
    private final c1.o0 f55214j;

    /* renamed from: k  reason: collision with root package name */
    private final c1.o0 f55215k;

    /* renamed from: l  reason: collision with root package name */
    private final s f55216l;

    /* renamed from: m  reason: collision with root package name */
    private h00.l<? super s2.a0, vz.b0> f55217m;

    /* renamed from: n  reason: collision with root package name */
    private final t1.o0 f55218n;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<s2.a0, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f55219a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(s2.a0 a0Var) {
            invoke2(a0Var);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(s2.a0 it2) {
            kotlin.jvm.internal.s.g(it2, "it");
        }
    }

    public t0(d0 textDelegate) {
        c1.o0 d11;
        c1.o0 d12;
        c1.o0 d13;
        c1.o0 d14;
        c1.o0 d15;
        kotlin.jvm.internal.s.g(textDelegate, "textDelegate");
        this.f55205a = textDelegate;
        this.f55206b = new s2.f();
        Boolean bool = Boolean.FALSE;
        d11 = s1.d(bool, null, 2, null);
        this.f55208d = d11;
        d12 = s1.d(j.None, null, 2, null);
        this.f55211g = d12;
        d13 = s1.d(null, null, 2, null);
        this.f55212h = d13;
        d14 = s1.d(bool, null, 2, null);
        this.f55214j = d14;
        d15 = s1.d(bool, null, 2, null);
        this.f55215k = d15;
        this.f55216l = new s();
        this.f55217m = a.f55219a;
        this.f55218n = t1.i.a();
    }

    public final i a() {
        return (i) this.f55212h.getValue();
    }

    public final j b() {
        return (j) this.f55211g.getValue();
    }

    public final boolean c() {
        return ((Boolean) this.f55208d.getValue()).booleanValue();
    }

    public final s2.h0 d() {
        return this.f55207c;
    }

    public final s e() {
        return this.f55216l;
    }

    public final f2.o f() {
        return this.f55209e;
    }

    public final v0 g() {
        return this.f55210f;
    }

    public final h00.l<s2.a0, vz.b0> h() {
        return this.f55217m;
    }

    public final s2.f i() {
        return this.f55206b;
    }

    public final t1.o0 j() {
        return this.f55218n;
    }

    public final boolean k() {
        return this.f55213i;
    }

    public final boolean l() {
        return ((Boolean) this.f55215k.getValue()).booleanValue();
    }

    public final boolean m() {
        return ((Boolean) this.f55214j.getValue()).booleanValue();
    }

    public final d0 n() {
        return this.f55205a;
    }

    public final void o(i iVar) {
        this.f55212h.setValue(iVar);
    }

    public final void p(j jVar) {
        kotlin.jvm.internal.s.g(jVar, "<set-?>");
        this.f55211g.setValue(jVar);
    }

    public final void q(boolean z11) {
        this.f55208d.setValue(Boolean.valueOf(z11));
    }

    public final void r(s2.h0 h0Var) {
        this.f55207c = h0Var;
    }

    public final void s(f2.o oVar) {
        this.f55209e = oVar;
    }

    public final void t(v0 v0Var) {
        this.f55210f = v0Var;
    }

    public final void u(boolean z11) {
        this.f55213i = z11;
    }

    public final void v(boolean z11) {
        this.f55215k.setValue(Boolean.valueOf(z11));
    }

    public final void w(boolean z11) {
        this.f55214j.setValue(Boolean.valueOf(z11));
    }

    public final void x(n2.a visualText, n2.a0 textStyle, boolean z11, x2.d density, d.a resourceLoader, h00.l<? super s2.a0, vz.b0> onValueChange, u keyboardActions, r1.g focusManager, long j11) {
        List i11;
        kotlin.jvm.internal.s.g(visualText, "visualText");
        kotlin.jvm.internal.s.g(textStyle, "textStyle");
        kotlin.jvm.internal.s.g(density, "density");
        kotlin.jvm.internal.s.g(resourceLoader, "resourceLoader");
        kotlin.jvm.internal.s.g(onValueChange, "onValueChange");
        kotlin.jvm.internal.s.g(keyboardActions, "keyboardActions");
        kotlin.jvm.internal.s.g(focusManager, "focusManager");
        this.f55217m = onValueChange;
        this.f55218n.l(j11);
        s sVar = this.f55216l;
        sVar.f(keyboardActions);
        sVar.e(focusManager);
        d0 d0Var = this.f55205a;
        i11 = wz.w.i();
        this.f55205a = h.d(d0Var, visualText, textStyle, density, resourceLoader, z11, 0, 0, i11, 192, null);
    }
}