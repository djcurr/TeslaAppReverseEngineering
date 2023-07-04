package androidx.camera.core.impl;

import androidx.camera.core.impl.d0;

/* loaded from: classes.dex */
public final class c1 implements p1<androidx.camera.core.r0>, p0, d0.f {

    /* renamed from: t  reason: collision with root package name */
    public static final d0.a<n0> f2279t = d0.a.a("camerax.core.preview.imageInfoProcessor", n0.class);

    /* renamed from: u  reason: collision with root package name */
    public static final d0.a<b0> f2280u = d0.a.a("camerax.core.preview.captureProcessor", b0.class);

    /* renamed from: s  reason: collision with root package name */
    private final b1 f2281s;

    public c1(b1 b1Var) {
        this.f2281s = b1Var;
    }

    public b0 E(b0 b0Var) {
        return (b0) g(f2280u, b0Var);
    }

    public n0 F(n0 n0Var) {
        return (n0) g(f2279t, n0Var);
    }

    @Override // androidx.camera.core.impl.o0
    public int getInputFormat() {
        return ((Integer) a(o0.f2342a)).intValue();
    }

    @Override // androidx.camera.core.impl.f1
    public d0 l() {
        return this.f2281s;
    }
}