package mx;

import com.google.common.base.u;
import com.stripe.android.model.Stripe3ds2AuthParams;
import io.grpc.internal.c2;
import java.io.IOException;
import java.net.Socket;
import mx.b;
import okio.c0;
import okio.f0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class a implements c0 {

    /* renamed from: c  reason: collision with root package name */
    private final c2 f39489c;

    /* renamed from: d  reason: collision with root package name */
    private final b.a f39490d;

    /* renamed from: h  reason: collision with root package name */
    private c0 f39494h;

    /* renamed from: i  reason: collision with root package name */
    private Socket f39495i;

    /* renamed from: a  reason: collision with root package name */
    private final Object f39487a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final okio.f f39488b = new okio.f();

    /* renamed from: e  reason: collision with root package name */
    private boolean f39491e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f39492f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f39493g = false;

    /* renamed from: mx.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class C0763a extends d {

        /* renamed from: b  reason: collision with root package name */
        final dy.b f39496b;

        C0763a() {
            super(a.this, null);
            this.f39496b = dy.c.e();
        }

        @Override // mx.a.d
        public void a() {
            dy.c.f("WriteRunnable.runWrite");
            dy.c.d(this.f39496b);
            okio.f fVar = new okio.f();
            try {
                synchronized (a.this.f39487a) {
                    fVar.write(a.this.f39488b, a.this.f39488b.j());
                    a.this.f39491e = false;
                }
                a.this.f39494h.write(fVar, fVar.P0());
            } finally {
                dy.c.h("WriteRunnable.runWrite");
            }
        }
    }

    /* loaded from: classes5.dex */
    class b extends d {

        /* renamed from: b  reason: collision with root package name */
        final dy.b f39498b;

        b() {
            super(a.this, null);
            this.f39498b = dy.c.e();
        }

        @Override // mx.a.d
        public void a() {
            dy.c.f("WriteRunnable.runFlush");
            dy.c.d(this.f39498b);
            okio.f fVar = new okio.f();
            try {
                synchronized (a.this.f39487a) {
                    fVar.write(a.this.f39488b, a.this.f39488b.P0());
                    a.this.f39492f = false;
                }
                a.this.f39494h.write(fVar, fVar.P0());
                a.this.f39494h.flush();
            } finally {
                dy.c.h("WriteRunnable.runFlush");
            }
        }
    }

    /* loaded from: classes5.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f39488b.close();
            try {
                if (a.this.f39494h != null) {
                    a.this.f39494h.close();
                }
            } catch (IOException e11) {
                a.this.f39490d.a(e11);
            }
            try {
                if (a.this.f39495i != null) {
                    a.this.f39495i.close();
                }
            } catch (IOException e12) {
                a.this.f39490d.a(e12);
            }
        }
    }

    /* loaded from: classes5.dex */
    private abstract class d implements Runnable {
        private d() {
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (a.this.f39494h != null) {
                    a();
                    return;
                }
                throw new IOException("Unable to perform write due to unavailable sink.");
            } catch (Exception e11) {
                a.this.f39490d.a(e11);
            }
        }

        /* synthetic */ d(a aVar, C0763a c0763a) {
            this();
        }
    }

    private a(c2 c2Var, b.a aVar) {
        this.f39489c = (c2) u.p(c2Var, "executor");
        this.f39490d = (b.a) u.p(aVar, "exceptionHandler");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a J(c2 c2Var, b.a aVar) {
        return new a(c2Var, aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D(c0 c0Var, Socket socket) {
        u.v(this.f39494h == null, "AsyncSink's becomeConnected should only be called once.");
        this.f39494h = (c0) u.p(c0Var, "sink");
        this.f39495i = (Socket) u.p(socket, "socket");
    }

    @Override // okio.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f39493g) {
            return;
        }
        this.f39493g = true;
        this.f39489c.execute(new c());
    }

    @Override // okio.c0, java.io.Flushable
    public void flush() {
        if (!this.f39493g) {
            dy.c.f("AsyncSink.flush");
            try {
                synchronized (this.f39487a) {
                    if (this.f39492f) {
                        return;
                    }
                    this.f39492f = true;
                    this.f39489c.execute(new b());
                    return;
                }
            } finally {
                dy.c.h("AsyncSink.flush");
            }
        }
        throw new IOException("closed");
    }

    @Override // okio.c0
    public f0 timeout() {
        return f0.NONE;
    }

    @Override // okio.c0
    public void write(okio.f fVar, long j11) {
        u.p(fVar, Stripe3ds2AuthParams.FIELD_SOURCE);
        if (!this.f39493g) {
            dy.c.f("AsyncSink.write");
            try {
                synchronized (this.f39487a) {
                    this.f39488b.write(fVar, j11);
                    if (!this.f39491e && !this.f39492f && this.f39488b.j() > 0) {
                        this.f39491e = true;
                        this.f39489c.execute(new C0763a());
                        return;
                    }
                    return;
                }
            } finally {
                dy.c.h("AsyncSink.write");
            }
        }
        throw new IOException("closed");
    }
}