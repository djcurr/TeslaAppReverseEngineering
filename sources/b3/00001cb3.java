package com.google.android.exoplayer2.upstream;

import ak.h0;
import ak.k0;
import ak.o;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import zj.l;

/* loaded from: classes3.dex */
public final class Loader implements l {

    /* renamed from: d  reason: collision with root package name */
    public static final c f14596d = h(false, -9223372036854775807L);

    /* renamed from: e  reason: collision with root package name */
    public static final c f14597e;

    /* renamed from: f  reason: collision with root package name */
    public static final c f14598f;

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f14599a;

    /* renamed from: b  reason: collision with root package name */
    private d<? extends e> f14600b;

    /* renamed from: c  reason: collision with root package name */
    private IOException f14601c;

    /* loaded from: classes3.dex */
    public static final class UnexpectedLoaderException extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public UnexpectedLoaderException(java.lang.Throwable r5) {
            /*
                r4 = this;
                java.lang.Class r0 = r5.getClass()
                java.lang.String r0 = r0.getSimpleName()
                java.lang.String r1 = r5.getMessage()
                int r2 = r0.length()
                int r2 = r2 + 13
                java.lang.String r3 = java.lang.String.valueOf(r1)
                int r3 = r3.length()
                int r2 = r2 + r3
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r2)
                java.lang.String r2 = "Unexpected "
                r3.append(r2)
                r3.append(r0)
                java.lang.String r0 = ": "
                r3.append(r0)
                r3.append(r1)
                java.lang.String r0 = r3.toString()
                r4.<init>(r0, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.Loader.UnexpectedLoaderException.<init>(java.lang.Throwable):void");
        }
    }

    /* loaded from: classes3.dex */
    public interface b<T extends e> {
        void i(T t11, long j11, long j12, boolean z11);

        void j(T t11, long j11, long j12);

        c n(T t11, long j11, long j12, IOException iOException, int i11);
    }

    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final int f14602a;

        /* renamed from: b  reason: collision with root package name */
        private final long f14603b;

        public boolean c() {
            int i11 = this.f14602a;
            return i11 == 0 || i11 == 1;
        }

        private c(int i11, long j11) {
            this.f14602a = i11;
            this.f14603b = j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class d<T extends e> extends Handler implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final int f14604a;

        /* renamed from: b  reason: collision with root package name */
        private final T f14605b;

        /* renamed from: c  reason: collision with root package name */
        private final long f14606c;

        /* renamed from: d  reason: collision with root package name */
        private b<T> f14607d;

        /* renamed from: e  reason: collision with root package name */
        private IOException f14608e;

        /* renamed from: f  reason: collision with root package name */
        private int f14609f;

        /* renamed from: g  reason: collision with root package name */
        private Thread f14610g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f14611h;

        /* renamed from: i  reason: collision with root package name */
        private volatile boolean f14612i;

        public d(Looper looper, T t11, b<T> bVar, int i11, long j11) {
            super(looper);
            this.f14605b = t11;
            this.f14607d = bVar;
            this.f14604a = i11;
            this.f14606c = j11;
        }

        private void b() {
            this.f14608e = null;
            Loader.this.f14599a.execute((Runnable) ak.a.e(Loader.this.f14600b));
        }

        private void c() {
            Loader.this.f14600b = null;
        }

        private long d() {
            return Math.min((this.f14609f - 1) * 1000, 5000);
        }

        public void a(boolean z11) {
            this.f14612i = z11;
            this.f14608e = null;
            if (hasMessages(0)) {
                this.f14611h = true;
                removeMessages(0);
                if (!z11) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f14611h = true;
                    this.f14605b.b();
                    Thread thread = this.f14610g;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z11) {
                c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((b) ak.a.e(this.f14607d)).i(this.f14605b, elapsedRealtime, elapsedRealtime - this.f14606c, true);
                this.f14607d = null;
            }
        }

        public void e(int i11) {
            IOException iOException = this.f14608e;
            if (iOException != null && this.f14609f > i11) {
                throw iOException;
            }
        }

        public void f(long j11) {
            ak.a.f(Loader.this.f14600b == null);
            Loader.this.f14600b = this;
            if (j11 > 0) {
                sendEmptyMessageDelayed(0, j11);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            long d11;
            if (this.f14612i) {
                return;
            }
            int i11 = message.what;
            if (i11 == 0) {
                b();
            } else if (i11 != 3) {
                c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j11 = elapsedRealtime - this.f14606c;
                b bVar = (b) ak.a.e(this.f14607d);
                if (this.f14611h) {
                    bVar.i(this.f14605b, elapsedRealtime, j11, false);
                    return;
                }
                int i12 = message.what;
                if (i12 == 1) {
                    try {
                        bVar.j(this.f14605b, elapsedRealtime, j11);
                    } catch (RuntimeException e11) {
                        o.d("LoadTask", "Unexpected exception handling load completed", e11);
                        Loader.this.f14601c = new UnexpectedLoaderException(e11);
                    }
                } else if (i12 != 2) {
                } else {
                    IOException iOException = (IOException) message.obj;
                    this.f14608e = iOException;
                    int i13 = this.f14609f + 1;
                    this.f14609f = i13;
                    c n11 = bVar.n(this.f14605b, elapsedRealtime, j11, iOException, i13);
                    if (n11.f14602a != 3) {
                        if (n11.f14602a != 2) {
                            if (n11.f14602a == 1) {
                                this.f14609f = 1;
                            }
                            if (n11.f14603b != -9223372036854775807L) {
                                d11 = n11.f14603b;
                            } else {
                                d11 = d();
                            }
                            f(d11);
                            return;
                        }
                        return;
                    }
                    Loader.this.f14601c = this.f14608e;
                }
            } else {
                throw ((Error) message.obj);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z11;
            try {
                synchronized (this) {
                    z11 = !this.f14611h;
                    this.f14610g = Thread.currentThread();
                }
                if (z11) {
                    String simpleName = this.f14605b.getClass().getSimpleName();
                    h0.a(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                    try {
                        this.f14605b.a();
                        h0.c();
                    } catch (Throwable th2) {
                        h0.c();
                        throw th2;
                    }
                }
                synchronized (this) {
                    this.f14610g = null;
                    Thread.interrupted();
                }
                if (this.f14612i) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e11) {
                if (this.f14612i) {
                    return;
                }
                obtainMessage(2, e11).sendToTarget();
            } catch (Exception e12) {
                o.d("LoadTask", "Unexpected exception loading stream", e12);
                if (this.f14612i) {
                    return;
                }
                obtainMessage(2, new UnexpectedLoaderException(e12)).sendToTarget();
            } catch (OutOfMemoryError e13) {
                o.d("LoadTask", "OutOfMemory error loading stream", e13);
                if (this.f14612i) {
                    return;
                }
                obtainMessage(2, new UnexpectedLoaderException(e13)).sendToTarget();
            } catch (Error e14) {
                o.d("LoadTask", "Unexpected error loading stream", e14);
                if (!this.f14612i) {
                    obtainMessage(3, e14).sendToTarget();
                }
                throw e14;
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface e {
        void a();

        void b();
    }

    /* loaded from: classes3.dex */
    public interface f {
        void q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final f f14614a;

        public g(f fVar) {
            this.f14614a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14614a.q();
        }
    }

    static {
        h(true, -9223372036854775807L);
        f14597e = new c(2, -9223372036854775807L);
        f14598f = new c(3, -9223372036854775807L);
    }

    public Loader(String str) {
        this.f14599a = k0.x0(str);
    }

    public static c h(boolean z11, long j11) {
        return new c(z11 ? 1 : 0, j11);
    }

    @Override // zj.l
    public void a() {
        k(Integer.MIN_VALUE);
    }

    public void f() {
        ((d) ak.a.h(this.f14600b)).a(false);
    }

    public void g() {
        this.f14601c = null;
    }

    public boolean i() {
        return this.f14601c != null;
    }

    public boolean j() {
        return this.f14600b != null;
    }

    public void k(int i11) {
        IOException iOException = this.f14601c;
        if (iOException == null) {
            d<? extends e> dVar = this.f14600b;
            if (dVar != null) {
                if (i11 == Integer.MIN_VALUE) {
                    i11 = dVar.f14604a;
                }
                dVar.e(i11);
                return;
            }
            return;
        }
        throw iOException;
    }

    public void l() {
        m(null);
    }

    public void m(f fVar) {
        d<? extends e> dVar = this.f14600b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f14599a.execute(new g(fVar));
        }
        this.f14599a.shutdown();
    }

    public <T extends e> long n(T t11, b<T> bVar, int i11) {
        this.f14601c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d((Looper) ak.a.h(Looper.myLooper()), t11, bVar, i11, elapsedRealtime).f(0L);
        return elapsedRealtime;
    }
}