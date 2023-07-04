package h2;

import kotlin.jvm.internal.DefaultConstructorMarker;
import t1.q0;
import t1.r0;

/* loaded from: classes.dex */
public final class m implements v1.e, v1.c {

    /* renamed from: a  reason: collision with root package name */
    private final v1.a f28731a;

    /* renamed from: b  reason: collision with root package name */
    private e f28732b;

    public m(v1.a canvasDrawScope) {
        kotlin.jvm.internal.s.g(canvasDrawScope, "canvasDrawScope");
        this.f28731a = canvasDrawScope;
    }

    @Override // v1.e
    public void A(long j11, long j12, long j13, float f11, int i11, r0 r0Var, float f12, t1.b0 b0Var, int i12) {
        this.f28731a.A(j11, j12, j13, f11, i11, r0Var, f12, b0Var, i12);
    }

    @Override // x2.d
    public int G(float f11) {
        return this.f28731a.G(f11);
    }

    @Override // v1.e
    public void K(long j11, long j12, long j13, long j14, v1.f style, float f11, t1.b0 b0Var, int i11) {
        kotlin.jvm.internal.s.g(style, "style");
        this.f28731a.K(j11, j12, j13, j14, style, f11, b0Var, i11);
    }

    @Override // x2.d
    public float M(long j11) {
        return this.f28731a.M(j11);
    }

    @Override // v1.e
    public void O(q0 path, long j11, float f11, v1.f style, t1.b0 b0Var, int i11) {
        kotlin.jvm.internal.s.g(path, "path");
        kotlin.jvm.internal.s.g(style, "style");
        this.f28731a.O(path, j11, f11, style, b0Var, i11);
    }

    @Override // v1.e
    public void V(long j11, float f11, long j12, float f12, v1.f style, t1.b0 b0Var, int i11) {
        kotlin.jvm.internal.s.g(style, "style");
        this.f28731a.V(j11, f11, j12, f12, style, b0Var, i11);
    }

    @Override // v1.e
    public void W(long j11, float f11, float f12, boolean z11, long j12, long j13, float f13, v1.f style, t1.b0 b0Var, int i11) {
        kotlin.jvm.internal.s.g(style, "style");
        this.f28731a.W(j11, f11, f12, z11, j12, j13, f13, style, b0Var, i11);
    }

    @Override // x2.d
    public float b0(int i11) {
        return this.f28731a.b0(i11);
    }

    @Override // v1.e
    public long c() {
        return this.f28731a.c();
    }

    @Override // x2.d
    public float c0() {
        return this.f28731a.c0();
    }

    @Override // v1.e
    public void d0(t1.h0 image, long j11, long j12, long j13, long j14, float f11, v1.f style, t1.b0 b0Var, int i11, int i12) {
        kotlin.jvm.internal.s.g(image, "image");
        kotlin.jvm.internal.s.g(style, "style");
        this.f28731a.d0(image, j11, j12, j13, j14, f11, style, b0Var, i11, i12);
    }

    @Override // v1.e
    public void f0(t1.s brush, long j11, long j12, float f11, v1.f style, t1.b0 b0Var, int i11) {
        kotlin.jvm.internal.s.g(brush, "brush");
        kotlin.jvm.internal.s.g(style, "style");
        this.f28731a.f0(brush, j11, j12, f11, style, b0Var, i11);
    }

    @Override // x2.d
    public float getDensity() {
        return this.f28731a.getDensity();
    }

    @Override // v1.e
    public x2.q getLayoutDirection() {
        return this.f28731a.getLayoutDirection();
    }

    @Override // x2.d
    public float i0(float f11) {
        return this.f28731a.i0(f11);
    }

    @Override // v1.e
    public v1.d j0() {
        return this.f28731a.j0();
    }

    @Override // x2.d
    public int l0(long j11) {
        return this.f28731a.l0(j11);
    }

    @Override // v1.e
    public void m0(t1.h0 image, long j11, float f11, v1.f style, t1.b0 b0Var, int i11) {
        kotlin.jvm.internal.s.g(image, "image");
        kotlin.jvm.internal.s.g(style, "style");
        this.f28731a.m0(image, j11, f11, style, b0Var, i11);
    }

    @Override // v1.e
    public long o0() {
        return this.f28731a.o0();
    }

    @Override // x2.d
    public long p0(long j11) {
        return this.f28731a.p0(j11);
    }

    @Override // v1.e
    public void q(t1.s brush, long j11, long j12, float f11, int i11, r0 r0Var, float f12, t1.b0 b0Var, int i12) {
        kotlin.jvm.internal.s.g(brush, "brush");
        this.f28731a.q(brush, j11, j12, f11, i11, r0Var, f12, b0Var, i12);
    }

    @Override // v1.e
    public void r(q0 path, t1.s brush, float f11, v1.f style, t1.b0 b0Var, int i11) {
        kotlin.jvm.internal.s.g(path, "path");
        kotlin.jvm.internal.s.g(brush, "brush");
        kotlin.jvm.internal.s.g(style, "style");
        this.f28731a.r(path, brush, f11, style, b0Var, i11);
    }

    @Override // v1.e
    public void s(t1.s brush, long j11, long j12, long j13, float f11, v1.f style, t1.b0 b0Var, int i11) {
        kotlin.jvm.internal.s.g(brush, "brush");
        kotlin.jvm.internal.s.g(style, "style");
        this.f28731a.s(brush, j11, j12, j13, f11, style, b0Var, i11);
    }

    @Override // v1.c
    public void s0() {
        t1.u b11 = j0().b();
        e eVar = this.f28732b;
        kotlin.jvm.internal.s.e(eVar);
        e i11 = eVar.i();
        if (i11 != null) {
            i11.e(b11);
        } else {
            eVar.g().M1(b11);
        }
    }

    @Override // v1.e
    public void y(long j11, long j12, long j13, float f11, v1.f style, t1.b0 b0Var, int i11) {
        kotlin.jvm.internal.s.g(style, "style");
        this.f28731a.y(j11, j12, j13, f11, style, b0Var, i11);
    }

    public /* synthetic */ m(v1.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new v1.a() : aVar);
    }
}