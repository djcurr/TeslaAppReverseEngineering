package bk;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.google.android.exoplayer2.util.EGLSurfaceTexture;

/* loaded from: classes3.dex */
public final class d extends Surface {

    /* renamed from: c  reason: collision with root package name */
    private static int f7724c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f7725d;

    /* renamed from: a  reason: collision with root package name */
    private final b f7726a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f7727b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b extends HandlerThread implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        private EGLSurfaceTexture f7728a;

        /* renamed from: b  reason: collision with root package name */
        private Handler f7729b;

        /* renamed from: c  reason: collision with root package name */
        private Error f7730c;

        /* renamed from: d  reason: collision with root package name */
        private RuntimeException f7731d;

        /* renamed from: e  reason: collision with root package name */
        private d f7732e;

        public b() {
            super("ExoPlayer:DummySurface");
        }

        private void b(int i11) {
            ak.a.e(this.f7728a);
            this.f7728a.h(i11);
            this.f7732e = new d(this, this.f7728a.g(), i11 != 0);
        }

        private void d() {
            ak.a.e(this.f7728a);
            this.f7728a.i();
        }

        public d a(int i11) {
            boolean z11;
            start();
            this.f7729b = new Handler(getLooper(), this);
            this.f7728a = new EGLSurfaceTexture(this.f7729b);
            synchronized (this) {
                z11 = false;
                this.f7729b.obtainMessage(1, i11, 0).sendToTarget();
                while (this.f7732e == null && this.f7731d == null && this.f7730c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z11 = true;
                    }
                }
            }
            if (z11) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f7731d;
            if (runtimeException == null) {
                Error error = this.f7730c;
                if (error == null) {
                    return (d) ak.a.e(this.f7732e);
                }
                throw error;
            }
            throw runtimeException;
        }

        public void c() {
            ak.a.e(this.f7729b);
            this.f7729b.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i11 = message.what;
            try {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return true;
                    }
                    try {
                        d();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e11) {
                    ak.o.d("DummySurface", "Failed to initialize dummy surface", e11);
                    this.f7730c = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e12) {
                    ak.o.d("DummySurface", "Failed to initialize dummy surface", e12);
                    this.f7731d = e12;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th2) {
                synchronized (this) {
                    notify();
                    throw th2;
                }
            }
        }
    }

    private static int a(Context context) {
        if (ak.i.b(context)) {
            return ak.i.c() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        boolean z11;
        synchronized (d.class) {
            if (!f7725d) {
                f7724c = a(context);
                f7725d = true;
            }
            z11 = f7724c != 0;
        }
        return z11;
    }

    public static d c(Context context, boolean z11) {
        ak.a.f(!z11 || b(context));
        return new b().a(z11 ? f7724c : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f7726a) {
            if (!this.f7727b) {
                this.f7726a.c();
                this.f7727b = true;
            }
        }
    }

    private d(b bVar, SurfaceTexture surfaceTexture, boolean z11) {
        super(surfaceTexture);
        this.f7726a = bVar;
    }
}