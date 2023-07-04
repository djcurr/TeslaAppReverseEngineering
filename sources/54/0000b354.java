package t;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import t.u1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f2 {

    /* renamed from: a  reason: collision with root package name */
    private final b f50983a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Executor f50984a;

        /* renamed from: b  reason: collision with root package name */
        private final ScheduledExecutorService f50985b;

        /* renamed from: c  reason: collision with root package name */
        private final Handler f50986c;

        /* renamed from: d  reason: collision with root package name */
        private final f1 f50987d;

        /* renamed from: e  reason: collision with root package name */
        private final int f50988e;

        /* renamed from: f  reason: collision with root package name */
        private final Set<String> f50989f;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, f1 f1Var, int i11) {
            HashSet hashSet = new HashSet();
            this.f50989f = hashSet;
            this.f50984a = executor;
            this.f50985b = scheduledExecutorService;
            this.f50986c = handler;
            this.f50987d = f1Var;
            this.f50988e = i11;
            int i12 = Build.VERSION.SDK_INT;
            if (i12 < 23) {
                hashSet.add("force_close");
            }
            if (i11 == 2 || i12 <= 23) {
                hashSet.add("deferrableSurface_close");
            }
            if (i11 == 2) {
                hashSet.add("wait_for_request");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public f2 a() {
            if (this.f50989f.isEmpty()) {
                return new f2(new a2(this.f50987d, this.f50984a, this.f50985b, this.f50986c));
            }
            return new f2(new e2(this.f50989f, this.f50987d, this.f50984a, this.f50985b, this.f50986c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        Executor a();

        com.google.common.util.concurrent.c<List<Surface>> b(List<DeferrableSurface> list, long j11);

        v.g i(int i11, List<v.b> list, u1.a aVar);

        com.google.common.util.concurrent.c<Void> l(CameraDevice cameraDevice, v.g gVar, List<DeferrableSurface> list);

        boolean stop();
    }

    f2(b bVar) {
        this.f50983a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v.g a(int i11, List<v.b> list, u1.a aVar) {
        return this.f50983a.i(i11, list, aVar);
    }

    public Executor b() {
        return this.f50983a.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.common.util.concurrent.c<Void> c(CameraDevice cameraDevice, v.g gVar, List<DeferrableSurface> list) {
        return this.f50983a.l(cameraDevice, gVar, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.common.util.concurrent.c<List<Surface>> d(List<DeferrableSurface> list, long j11) {
        return this.f50983a.b(list, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return this.f50983a.stop();
    }
}