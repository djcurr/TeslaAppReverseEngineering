package t;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.g1;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
public class s1 {

    /* renamed from: a */
    private DeferrableSurface f51182a;

    /* renamed from: b */
    private final androidx.camera.core.impl.g1 f51183b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements c0.c<Void> {

        /* renamed from: a */
        final /* synthetic */ Surface f51184a;

        /* renamed from: b */
        final /* synthetic */ SurfaceTexture f51185b;

        a(s1 s1Var, Surface surface, SurfaceTexture surfaceTexture) {
            this.f51184a = surface;
            this.f51185b = surfaceTexture;
        }

        @Override // c0.c
        /* renamed from: a */
        public void onSuccess(Void r12) {
            this.f51184a.release();
            this.f51185b.release();
        }

        @Override // c0.c
        public void onFailure(Throwable th2) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements androidx.camera.core.impl.p1<androidx.camera.core.f1> {

        /* renamed from: s */
        private final androidx.camera.core.impl.d0 f51186s;

        b() {
            androidx.camera.core.impl.x0 I = androidx.camera.core.impl.x0.I();
            I.p(androidx.camera.core.impl.p1.f2356j, new q0());
            this.f51186s = I;
        }

        @Override // androidx.camera.core.impl.f1
        public androidx.camera.core.impl.d0 l() {
            return this.f51186s;
        }
    }

    public s1(u.d dVar) {
        b bVar = new b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size c11 = c(dVar);
        androidx.camera.core.n0.a("MeteringRepeating", "MerteringSession SurfaceTexture size: " + c11);
        surfaceTexture.setDefaultBufferSize(c11.getWidth(), c11.getHeight());
        Surface surface = new Surface(surfaceTexture);
        g1.b n11 = g1.b.n(bVar);
        n11.q(1);
        androidx.camera.core.impl.s0 s0Var = new androidx.camera.core.impl.s0(surface);
        this.f51182a = s0Var;
        c0.f.b(s0Var.f(), new a(this, surface, surfaceTexture), b0.a.a());
        n11.k(this.f51182a);
        this.f51183b = n11.m();
    }

    public static /* synthetic */ int a(Size size, Size size2) {
        return f(size, size2);
    }

    private Size c(u.d dVar) {
        Size[] outputSizes;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) dVar.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            androidx.camera.core.n0.c("MeteringRepeating", "Can not retrieve SCALER_STREAM_CONFIGURATION_MAP.");
            return new Size(0, 0);
        }
        if (Build.VERSION.SDK_INT < 23) {
            outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        } else {
            outputSizes = streamConfigurationMap.getOutputSizes(34);
        }
        if (outputSizes == null) {
            androidx.camera.core.n0.c("MeteringRepeating", "Can not get output size list.");
            return new Size(0, 0);
        }
        return (Size) Collections.min(Arrays.asList(outputSizes), new Comparator() { // from class: t.r1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return s1.a((Size) obj, (Size) obj2);
            }
        });
    }

    public static /* synthetic */ int f(Size size, Size size2) {
        return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
    }

    public void b() {
        androidx.camera.core.n0.a("MeteringRepeating", "MeteringRepeating clear!");
        DeferrableSurface deferrableSurface = this.f51182a;
        if (deferrableSurface != null) {
            deferrableSurface.c();
        }
        this.f51182a = null;
    }

    public String d() {
        return "MeteringRepeating";
    }

    public androidx.camera.core.impl.g1 e() {
        return this.f51183b;
    }
}