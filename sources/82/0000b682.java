package u;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a */
    private final b f52795a;

    /* renamed from: b */
    private final Map<String, d> f52796b = new ArrayMap(4);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends CameraManager.AvailabilityCallback {

        /* renamed from: a */
        private final Executor f52797a;

        /* renamed from: b */
        final CameraManager.AvailabilityCallback f52798b;

        /* renamed from: c */
        private final Object f52799c = new Object();

        /* renamed from: d */
        private boolean f52800d = false;

        /* renamed from: u.j$a$a */
        /* loaded from: classes.dex */
        class RunnableC1181a implements Runnable {
            RunnableC1181a() {
                a.this = r1;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f52798b.onCameraAccessPrioritiesChanged();
            }
        }

        /* loaded from: classes.dex */
        class b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f52802a;

            b(String str) {
                a.this = r1;
                this.f52802a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f52798b.onCameraAvailable(this.f52802a);
            }
        }

        /* loaded from: classes.dex */
        class c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f52804a;

            c(String str) {
                a.this = r1;
                this.f52804a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f52798b.onCameraUnavailable(this.f52804a);
            }
        }

        public a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
            this.f52797a = executor;
            this.f52798b = availabilityCallback;
        }

        public void a() {
            synchronized (this.f52799c) {
                this.f52800d = true;
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.f52799c) {
                if (!this.f52800d) {
                    this.f52797a.execute(new RunnableC1181a());
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) {
            synchronized (this.f52799c) {
                if (!this.f52800d) {
                    this.f52797a.execute(new b(str));
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            synchronized (this.f52799c) {
                if (!this.f52800d) {
                    this.f52797a.execute(new c(str));
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        static b f(Context context, Handler handler) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                return new l(context);
            }
            if (i11 >= 28) {
                return k.h(context);
            }
            return m.g(context, handler);
        }

        void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        CameraCharacteristics b(String str);

        void c(String str, Executor executor, CameraDevice.StateCallback stateCallback);

        String[] d();

        void e(CameraManager.AvailabilityCallback availabilityCallback);
    }

    private j(b bVar) {
        this.f52795a = bVar;
    }

    public static j a(Context context) {
        return b(context, a0.i.a());
    }

    public static j b(Context context, Handler handler) {
        return new j(b.f(context, handler));
    }

    public d c(String str) {
        d dVar;
        synchronized (this.f52796b) {
            dVar = this.f52796b.get(str);
            if (dVar == null) {
                dVar = d.b(this.f52795a.b(str));
                this.f52796b.put(str, dVar);
            }
        }
        return dVar;
    }

    public String[] d() {
        return this.f52795a.d();
    }

    public void e(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        this.f52795a.c(str, executor, stateCallback);
    }

    public void f(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f52795a.a(executor, availabilityCallback);
    }

    public void g(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f52795a.e(availabilityCallback);
    }
}