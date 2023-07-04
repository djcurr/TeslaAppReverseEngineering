package u;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final InterfaceC1175a f52726a;

    /* renamed from: u.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    interface InterfaceC1175a {
        CameraCaptureSession a();

        int b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        int c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);
    }

    /* loaded from: classes.dex */
    static final class b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a  reason: collision with root package name */
        final CameraCaptureSession.CaptureCallback f52727a;

        /* renamed from: b  reason: collision with root package name */
        private final Executor f52728b;

        /* renamed from: u.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC1176a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CameraCaptureSession f52729a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ CaptureRequest f52730b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ long f52731c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ long f52732d;

            RunnableC1176a(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j11, long j12) {
                this.f52729a = cameraCaptureSession;
                this.f52730b = captureRequest;
                this.f52731c = j11;
                this.f52732d = j12;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f52727a.onCaptureStarted(this.f52729a, this.f52730b, this.f52731c, this.f52732d);
            }
        }

        /* renamed from: u.a$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC1177b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CameraCaptureSession f52734a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ CaptureRequest f52735b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ CaptureResult f52736c;

            RunnableC1177b(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                this.f52734a = cameraCaptureSession;
                this.f52735b = captureRequest;
                this.f52736c = captureResult;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f52727a.onCaptureProgressed(this.f52734a, this.f52735b, this.f52736c);
            }
        }

        /* loaded from: classes.dex */
        class c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CameraCaptureSession f52738a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ CaptureRequest f52739b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ TotalCaptureResult f52740c;

            c(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                this.f52738a = cameraCaptureSession;
                this.f52739b = captureRequest;
                this.f52740c = totalCaptureResult;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f52727a.onCaptureCompleted(this.f52738a, this.f52739b, this.f52740c);
            }
        }

        /* loaded from: classes.dex */
        class d implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CameraCaptureSession f52742a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ CaptureRequest f52743b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ CaptureFailure f52744c;

            d(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                this.f52742a = cameraCaptureSession;
                this.f52743b = captureRequest;
                this.f52744c = captureFailure;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f52727a.onCaptureFailed(this.f52742a, this.f52743b, this.f52744c);
            }
        }

        /* loaded from: classes.dex */
        class e implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CameraCaptureSession f52746a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f52747b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ long f52748c;

            e(CameraCaptureSession cameraCaptureSession, int i11, long j11) {
                this.f52746a = cameraCaptureSession;
                this.f52747b = i11;
                this.f52748c = j11;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f52727a.onCaptureSequenceCompleted(this.f52746a, this.f52747b, this.f52748c);
            }
        }

        /* loaded from: classes.dex */
        class f implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CameraCaptureSession f52750a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f52751b;

            f(CameraCaptureSession cameraCaptureSession, int i11) {
                this.f52750a = cameraCaptureSession;
                this.f52751b = i11;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f52727a.onCaptureSequenceAborted(this.f52750a, this.f52751b);
            }
        }

        /* loaded from: classes.dex */
        class g implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CameraCaptureSession f52753a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ CaptureRequest f52754b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Surface f52755c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ long f52756d;

            g(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j11) {
                this.f52753a = cameraCaptureSession;
                this.f52754b = captureRequest;
                this.f52755c = surface;
                this.f52756d = j11;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f52727a.onCaptureBufferLost(this.f52753a, this.f52754b, this.f52755c, this.f52756d);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.f52728b = executor;
            this.f52727a = captureCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j11) {
            this.f52728b.execute(new g(cameraCaptureSession, captureRequest, surface, j11));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f52728b.execute(new c(cameraCaptureSession, captureRequest, totalCaptureResult));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.f52728b.execute(new d(cameraCaptureSession, captureRequest, captureFailure));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.f52728b.execute(new RunnableC1177b(cameraCaptureSession, captureRequest, captureResult));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i11) {
            this.f52728b.execute(new f(cameraCaptureSession, i11));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i11, long j11) {
            this.f52728b.execute(new e(cameraCaptureSession, i11, j11));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j11, long j12) {
            this.f52728b.execute(new RunnableC1176a(cameraCaptureSession, captureRequest, j11, j12));
        }
    }

    /* loaded from: classes.dex */
    static final class c extends CameraCaptureSession.StateCallback {

        /* renamed from: a  reason: collision with root package name */
        final CameraCaptureSession.StateCallback f52758a;

        /* renamed from: b  reason: collision with root package name */
        private final Executor f52759b;

        /* renamed from: u.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC1178a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CameraCaptureSession f52760a;

            RunnableC1178a(CameraCaptureSession cameraCaptureSession) {
                this.f52760a = cameraCaptureSession;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f52758a.onConfigured(this.f52760a);
            }
        }

        /* loaded from: classes.dex */
        class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CameraCaptureSession f52762a;

            b(CameraCaptureSession cameraCaptureSession) {
                this.f52762a = cameraCaptureSession;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f52758a.onConfigureFailed(this.f52762a);
            }
        }

        /* renamed from: u.a$c$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC1179c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CameraCaptureSession f52764a;

            RunnableC1179c(CameraCaptureSession cameraCaptureSession) {
                this.f52764a = cameraCaptureSession;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f52758a.onReady(this.f52764a);
            }
        }

        /* loaded from: classes.dex */
        class d implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CameraCaptureSession f52766a;

            d(CameraCaptureSession cameraCaptureSession) {
                this.f52766a = cameraCaptureSession;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f52758a.onActive(this.f52766a);
            }
        }

        /* loaded from: classes.dex */
        class e implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CameraCaptureSession f52768a;

            e(CameraCaptureSession cameraCaptureSession) {
                this.f52768a = cameraCaptureSession;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f52758a.onCaptureQueueEmpty(this.f52768a);
            }
        }

        /* loaded from: classes.dex */
        class f implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CameraCaptureSession f52770a;

            f(CameraCaptureSession cameraCaptureSession) {
                this.f52770a = cameraCaptureSession;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f52758a.onClosed(this.f52770a);
            }
        }

        /* loaded from: classes.dex */
        class g implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CameraCaptureSession f52772a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Surface f52773b;

            g(CameraCaptureSession cameraCaptureSession, Surface surface) {
                this.f52772a = cameraCaptureSession;
                this.f52773b = surface;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f52758a.onSurfacePrepared(this.f52772a, this.f52773b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f52759b = executor;
            this.f52758a = stateCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            this.f52759b.execute(new d(cameraCaptureSession));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            this.f52759b.execute(new e(cameraCaptureSession));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            this.f52759b.execute(new f(cameraCaptureSession));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            this.f52759b.execute(new b(cameraCaptureSession));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            this.f52759b.execute(new RunnableC1178a(cameraCaptureSession));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            this.f52759b.execute(new RunnableC1179c(cameraCaptureSession));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            this.f52759b.execute(new g(cameraCaptureSession, surface));
        }
    }

    private a(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f52726a = new u.b(cameraCaptureSession);
        } else {
            this.f52726a = u.c.d(cameraCaptureSession, handler);
        }
    }

    public static a d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new a(cameraCaptureSession, handler);
    }

    public int a(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f52726a.b(list, executor, captureCallback);
    }

    public int b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f52726a.c(captureRequest, executor, captureCallback);
    }

    public CameraCaptureSession c() {
        return this.f52726a.a();
    }
}