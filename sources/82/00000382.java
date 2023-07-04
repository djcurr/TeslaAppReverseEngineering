package androidx.camera.core.impl;

import androidx.camera.core.f1;
import androidx.camera.core.impl.a0;
import androidx.camera.core.impl.d0;
import androidx.camera.core.impl.g1;

/* loaded from: classes.dex */
public interface p1<T extends androidx.camera.core.f1> extends d0.e<T>, d0.g, o0 {

    /* renamed from: h */
    public static final d0.a<g1> f2354h = d0.a.a("camerax.core.useCase.defaultSessionConfig", g1.class);

    /* renamed from: i */
    public static final d0.a<a0> f2355i = d0.a.a("camerax.core.useCase.defaultCaptureConfig", a0.class);

    /* renamed from: j */
    public static final d0.a<g1.d> f2356j = d0.a.a("camerax.core.useCase.sessionConfigUnpacker", g1.d.class);

    /* renamed from: k */
    public static final d0.a<a0.b> f2357k = d0.a.a("camerax.core.useCase.captureConfigUnpacker", a0.b.class);

    /* renamed from: l */
    public static final d0.a<Integer> f2358l = d0.a.a("camerax.core.useCase.surfaceOccupancyPriority", Integer.TYPE);

    /* renamed from: m */
    public static final d0.a<z.e> f2359m = d0.a.a("camerax.core.useCase.cameraSelector", z.e.class);

    /* loaded from: classes.dex */
    public interface a<T extends androidx.camera.core.f1, C extends p1<T>, B> extends z.q<T> {
        C b();
    }

    default g1.d D(g1.d dVar) {
        return (g1.d) g(f2356j, dVar);
    }

    default g1 m(g1 g1Var) {
        return (g1) g(f2354h, g1Var);
    }

    default a0.b o(a0.b bVar) {
        return (a0.b) g(f2357k, bVar);
    }

    default a0 q(a0 a0Var) {
        return (a0) g(f2355i, a0Var);
    }

    default z.e s(z.e eVar) {
        return (z.e) g(f2359m, eVar);
    }

    default int v(int i11) {
        return ((Integer) g(f2358l, Integer.valueOf(i11))).intValue();
    }
}