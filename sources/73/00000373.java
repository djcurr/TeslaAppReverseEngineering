package androidx.camera.core.impl;

import androidx.camera.core.impl.d0;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class m0 implements p1<androidx.camera.core.c0>, p0, d0.d {
    public static final d0.a<Boolean> A;

    /* renamed from: t  reason: collision with root package name */
    public static final d0.a<Integer> f2330t;

    /* renamed from: u  reason: collision with root package name */
    public static final d0.a<Integer> f2331u;

    /* renamed from: v  reason: collision with root package name */
    public static final d0.a<z> f2332v;

    /* renamed from: w  reason: collision with root package name */
    public static final d0.a<b0> f2333w;

    /* renamed from: x  reason: collision with root package name */
    public static final d0.a<Integer> f2334x;

    /* renamed from: y  reason: collision with root package name */
    public static final d0.a<Integer> f2335y;

    /* renamed from: z  reason: collision with root package name */
    public static final d0.a<z.k0> f2336z;

    /* renamed from: s  reason: collision with root package name */
    private final b1 f2337s;

    static {
        Class cls = Integer.TYPE;
        f2330t = d0.a.a("camerax.core.imageCapture.captureMode", cls);
        f2331u = d0.a.a("camerax.core.imageCapture.flashMode", cls);
        f2332v = d0.a.a("camerax.core.imageCapture.captureBundle", z.class);
        f2333w = d0.a.a("camerax.core.imageCapture.captureProcessor", b0.class);
        f2334x = d0.a.a("camerax.core.imageCapture.bufferFormat", Integer.class);
        f2335y = d0.a.a("camerax.core.imageCapture.maxCaptureStages", Integer.class);
        f2336z = d0.a.a("camerax.core.imageCapture.imageReaderProxyProvider", z.k0.class);
        A = d0.a.a("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE);
    }

    public m0(b1 b1Var) {
        this.f2337s = b1Var;
    }

    public z E(z zVar) {
        return (z) g(f2332v, zVar);
    }

    public int F() {
        return ((Integer) a(f2330t)).intValue();
    }

    public b0 G(b0 b0Var) {
        return (b0) g(f2333w, b0Var);
    }

    public int H(int i11) {
        return ((Integer) g(f2331u, Integer.valueOf(i11))).intValue();
    }

    public z.k0 I() {
        return (z.k0) g(f2336z, null);
    }

    public Executor J(Executor executor) {
        return (Executor) g(d0.d.f23251n, executor);
    }

    public int K(int i11) {
        return ((Integer) g(f2335y, Integer.valueOf(i11))).intValue();
    }

    public boolean L() {
        return b(f2330t);
    }

    public boolean M() {
        return ((Boolean) g(A, Boolean.FALSE)).booleanValue();
    }

    @Override // androidx.camera.core.impl.o0
    public int getInputFormat() {
        return ((Integer) a(o0.f2342a)).intValue();
    }

    @Override // androidx.camera.core.impl.f1
    public d0 l() {
        return this.f2337s;
    }
}