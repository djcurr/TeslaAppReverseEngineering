package u;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    private final a f52780a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        void a(v.g gVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends CameraDevice.StateCallback {

        /* renamed from: a */
        final CameraDevice.StateCallback f52781a;

        /* renamed from: b */
        private final Executor f52782b;

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ CameraDevice f52783a;

            a(CameraDevice cameraDevice) {
                b.this = r1;
                this.f52783a = cameraDevice;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f52781a.onOpened(this.f52783a);
            }
        }

        /* renamed from: u.e$b$b */
        /* loaded from: classes.dex */
        class RunnableC1180b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ CameraDevice f52785a;

            RunnableC1180b(CameraDevice cameraDevice) {
                b.this = r1;
                this.f52785a = cameraDevice;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f52781a.onDisconnected(this.f52785a);
            }
        }

        /* loaded from: classes.dex */
        class c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ CameraDevice f52787a;

            /* renamed from: b */
            final /* synthetic */ int f52788b;

            c(CameraDevice cameraDevice, int i11) {
                b.this = r1;
                this.f52787a = cameraDevice;
                this.f52788b = i11;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f52781a.onError(this.f52787a, this.f52788b);
            }
        }

        /* loaded from: classes.dex */
        class d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ CameraDevice f52790a;

            d(CameraDevice cameraDevice) {
                b.this = r1;
                this.f52790a = cameraDevice;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f52781a.onClosed(this.f52790a);
            }
        }

        public b(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.f52782b = executor;
            this.f52781a = stateCallback;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            this.f52782b.execute(new d(cameraDevice));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            this.f52782b.execute(new RunnableC1180b(cameraDevice));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i11) {
            this.f52782b.execute(new c(cameraDevice, i11));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            this.f52782b.execute(new a(cameraDevice));
        }
    }

    private e(CameraDevice cameraDevice, Handler handler) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            this.f52780a = new h(cameraDevice);
        } else if (i11 >= 24) {
            this.f52780a = g.h(cameraDevice, handler);
        } else if (i11 >= 23) {
            this.f52780a = f.g(cameraDevice, handler);
        } else {
            this.f52780a = i.d(cameraDevice, handler);
        }
    }

    public static e b(CameraDevice cameraDevice, Handler handler) {
        return new e(cameraDevice, handler);
    }

    public void a(v.g gVar) {
        this.f52780a.a(gVar);
    }
}