package q1;

import kotlin.jvm.internal.s;
import vz.b0;
import x2.d;
import x2.q;

/* loaded from: classes.dex */
public final class c implements x2.d {

    /* renamed from: a  reason: collision with root package name */
    private b f47294a = l.f47305a;

    /* renamed from: b  reason: collision with root package name */
    private j f47295b;

    @Override // x2.d
    public int G(float f11) {
        return d.a.b(this, f11);
    }

    @Override // x2.d
    public float M(long j11) {
        return d.a.d(this, j11);
    }

    public final j a() {
        return this.f47295b;
    }

    @Override // x2.d
    public float b0(int i11) {
        return d.a.c(this, i11);
    }

    public final long c() {
        return this.f47294a.c();
    }

    @Override // x2.d
    public float c0() {
        return this.f47294a.getDensity().c0();
    }

    @Override // x2.d
    public float getDensity() {
        return this.f47294a.getDensity().getDensity();
    }

    public final q getLayoutDirection() {
        return this.f47294a.getLayoutDirection();
    }

    public final j h(h00.l<? super v1.c, b0> block) {
        s.g(block, "block");
        j jVar = new j(block);
        p(jVar);
        return jVar;
    }

    @Override // x2.d
    public float i0(float f11) {
        return d.a.e(this, f11);
    }

    @Override // x2.d
    public int l0(long j11) {
        return d.a.a(this, j11);
    }

    public final void o(b bVar) {
        s.g(bVar, "<set-?>");
        this.f47294a = bVar;
    }

    public final void p(j jVar) {
        this.f47295b = jVar;
    }

    @Override // x2.d
    public long p0(long j11) {
        return d.a.f(this, j11);
    }
}