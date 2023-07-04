package f2;

import f2.b0;
import f2.m0;
import java.util.Map;

/* loaded from: classes.dex */
public final class n implements b0, x2.d {

    /* renamed from: a  reason: collision with root package name */
    private final x2.q f25589a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ x2.d f25590b;

    public n(x2.d density, x2.q layoutDirection) {
        kotlin.jvm.internal.s.g(density, "density");
        kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
        this.f25589a = layoutDirection;
        this.f25590b = density;
    }

    @Override // x2.d
    public int G(float f11) {
        return this.f25590b.G(f11);
    }

    @Override // f2.b0
    public a0 I(int i11, int i12, Map<a, Integer> map, h00.l<? super m0.a, vz.b0> lVar) {
        return b0.a.a(this, i11, i12, map, lVar);
    }

    @Override // x2.d
    public float M(long j11) {
        return this.f25590b.M(j11);
    }

    @Override // x2.d
    public float b0(int i11) {
        return this.f25590b.b0(i11);
    }

    @Override // x2.d
    public float c0() {
        return this.f25590b.c0();
    }

    @Override // x2.d
    public float getDensity() {
        return this.f25590b.getDensity();
    }

    @Override // f2.k
    public x2.q getLayoutDirection() {
        return this.f25589a;
    }

    @Override // x2.d
    public float i0(float f11) {
        return this.f25590b.i0(f11);
    }

    @Override // x2.d
    public int l0(long j11) {
        return this.f25590b.l0(j11);
    }

    @Override // x2.d
    public long p0(long j11) {
        return this.f25590b.p0(j11);
    }
}