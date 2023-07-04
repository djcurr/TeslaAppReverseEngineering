package androidx.room;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class a {

    /* renamed from: e  reason: collision with root package name */
    final long f5728e;

    /* renamed from: f  reason: collision with root package name */
    final Executor f5729f;

    /* renamed from: i  reason: collision with root package name */
    v4.g f5732i;

    /* renamed from: a  reason: collision with root package name */
    private v4.h f5724a = null;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f5725b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    Runnable f5726c = null;

    /* renamed from: d  reason: collision with root package name */
    final Object f5727d = new Object();

    /* renamed from: g  reason: collision with root package name */
    int f5730g = 0;

    /* renamed from: h  reason: collision with root package name */
    long f5731h = SystemClock.uptimeMillis();

    /* renamed from: j  reason: collision with root package name */
    private boolean f5733j = false;

    /* renamed from: k  reason: collision with root package name */
    private final Runnable f5734k = new RunnableC0095a();

    /* renamed from: l  reason: collision with root package name */
    final Runnable f5735l = new b();

    /* renamed from: androidx.room.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0095a implements Runnable {
        RunnableC0095a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            aVar.f5729f.execute(aVar.f5735l);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (a.this.f5727d) {
                long uptimeMillis = SystemClock.uptimeMillis();
                a aVar = a.this;
                if (uptimeMillis - aVar.f5731h < aVar.f5728e) {
                    return;
                }
                if (aVar.f5730g != 0) {
                    return;
                }
                Runnable runnable = aVar.f5726c;
                if (runnable != null) {
                    runnable.run();
                    v4.g gVar = a.this.f5732i;
                    if (gVar != null && gVar.isOpen()) {
                        try {
                            a.this.f5732i.close();
                        } catch (IOException e11) {
                            u4.e.a(e11);
                        }
                        a.this.f5732i = null;
                    }
                    return;
                }
                throw new IllegalStateException("mOnAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(long j11, TimeUnit timeUnit, Executor executor) {
        this.f5728e = timeUnit.toMillis(j11);
        this.f5729f = executor;
    }

    public void a() {
        synchronized (this.f5727d) {
            this.f5733j = true;
            v4.g gVar = this.f5732i;
            if (gVar != null) {
                gVar.close();
            }
            this.f5732i = null;
        }
    }

    public void b() {
        synchronized (this.f5727d) {
            int i11 = this.f5730g;
            if (i11 > 0) {
                int i12 = i11 - 1;
                this.f5730g = i12;
                if (i12 == 0) {
                    if (this.f5732i == null) {
                        return;
                    }
                    this.f5725b.postDelayed(this.f5734k, this.f5728e);
                }
                return;
            }
            throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
        }
    }

    public <V> V c(p.a<v4.g, V> aVar) {
        try {
            return aVar.apply(e());
        } finally {
            b();
        }
    }

    public v4.g d() {
        v4.g gVar;
        synchronized (this.f5727d) {
            gVar = this.f5732i;
        }
        return gVar;
    }

    public v4.g e() {
        synchronized (this.f5727d) {
            this.f5725b.removeCallbacks(this.f5734k);
            this.f5730g++;
            if (!this.f5733j) {
                v4.g gVar = this.f5732i;
                if (gVar != null && gVar.isOpen()) {
                    return this.f5732i;
                }
                v4.h hVar = this.f5724a;
                if (hVar != null) {
                    v4.g W0 = hVar.W0();
                    this.f5732i = W0;
                    return W0;
                }
                throw new IllegalStateException("AutoCloser has not been initialized. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
            }
            throw new IllegalStateException("Attempting to open already closed database.");
        }
    }

    public void f(v4.h hVar) {
        if (this.f5724a != null) {
            Log.e("ROOM", "AutoCloser initialized multiple times. Please file a bug against room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
        } else {
            this.f5724a = hVar;
        }
    }

    public boolean g() {
        return !this.f5733j;
    }

    public void h(Runnable runnable) {
        this.f5726c = runnable;
    }
}