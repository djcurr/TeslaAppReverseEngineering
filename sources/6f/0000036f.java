package androidx.camera.core.impl;

import androidx.camera.core.impl.d0;
import androidx.camera.core.o;

/* loaded from: classes.dex */
public final class l0 implements p1<androidx.camera.core.o>, p0, d0.f {

    /* renamed from: t  reason: collision with root package name */
    public static final d0.a<Integer> f2324t = d0.a.a("camerax.core.imageAnalysis.backpressureStrategy", o.b.class);

    /* renamed from: u  reason: collision with root package name */
    public static final d0.a<Integer> f2325u = d0.a.a("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE);

    /* renamed from: v  reason: collision with root package name */
    public static final d0.a<z.k0> f2326v = d0.a.a("camerax.core.imageAnalysis.imageReaderProxyProvider", z.k0.class);

    /* renamed from: s  reason: collision with root package name */
    private final b1 f2327s;

    public l0(b1 b1Var) {
        this.f2327s = b1Var;
    }

    public int E(int i11) {
        return ((Integer) g(f2324t, Integer.valueOf(i11))).intValue();
    }

    public int F(int i11) {
        return ((Integer) g(f2325u, Integer.valueOf(i11))).intValue();
    }

    public z.k0 G() {
        return (z.k0) g(f2326v, null);
    }

    @Override // androidx.camera.core.impl.o0
    public int getInputFormat() {
        return 35;
    }

    @Override // androidx.camera.core.impl.f1
    public d0 l() {
        return this.f2327s;
    }
}