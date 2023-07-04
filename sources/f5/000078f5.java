package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import io.sentry.f3;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class b extends Thread {

    /* renamed from: a */
    private final boolean f32044a;

    /* renamed from: b */
    private final a f32045b;

    /* renamed from: c */
    private final j0 f32046c;

    /* renamed from: d */
    private final long f32047d;

    /* renamed from: e */
    private final io.sentry.d0 f32048e;

    /* renamed from: f */
    private final AtomicLong f32049f;

    /* renamed from: g */
    private final AtomicBoolean f32050g;

    /* renamed from: h */
    private final Context f32051h;

    /* renamed from: i */
    private final Runnable f32052i;

    /* loaded from: classes5.dex */
    public interface a {
        void a(z zVar);
    }

    public b(long j11, boolean z11, a aVar, io.sentry.d0 d0Var, Context context) {
        this(j11, z11, aVar, d0Var, new j0(), context);
    }

    public static /* synthetic */ void a(b bVar) {
        bVar.b();
    }

    public /* synthetic */ void b() {
        this.f32049f.set(0L);
        this.f32050g.set(false);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        boolean z11;
        setName("|ANR-WatchDog|");
        long j11 = this.f32047d;
        while (!isInterrupted()) {
            boolean z12 = this.f32049f.get() == 0;
            this.f32049f.addAndGet(j11);
            if (z12) {
                this.f32046c.b(this.f32052i);
            }
            try {
                Thread.sleep(j11);
                if (this.f32049f.get() != 0 && !this.f32050g.get()) {
                    if (!this.f32044a && (Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        this.f32048e.c(f3.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.f32050g.set(true);
                    } else {
                        ActivityManager activityManager = (ActivityManager) this.f32051h.getSystemService("activity");
                        if (activityManager != null) {
                            List<ActivityManager.ProcessErrorStateInfo> list = null;
                            try {
                                list = activityManager.getProcessesInErrorState();
                            } catch (Throwable th2) {
                                this.f32048e.b(f3.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th2);
                            }
                            if (list != null) {
                                Iterator<ActivityManager.ProcessErrorStateInfo> it2 = list.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z11 = false;
                                        break;
                                    } else if (it2.next().condition == 2) {
                                        z11 = true;
                                        break;
                                    }
                                }
                                if (!z11) {
                                }
                            }
                        }
                        this.f32048e.c(f3.INFO, "Raising ANR", new Object[0]);
                        this.f32045b.a(new z("Application Not Responding for at least " + this.f32047d + " ms.", this.f32046c.a()));
                        j11 = this.f32047d;
                        this.f32050g.set(true);
                    }
                }
            } catch (InterruptedException e11) {
                try {
                    Thread.currentThread().interrupt();
                    this.f32048e.c(f3.WARNING, "Interrupted: %s", e11.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.f32048e.c(f3.WARNING, "Failed to interrupt due to SecurityException: %s", e11.getMessage());
                    return;
                }
            }
        }
    }

    b(long j11, boolean z11, a aVar, io.sentry.d0 d0Var, j0 j0Var, Context context) {
        this.f32049f = new AtomicLong(0L);
        this.f32050g = new AtomicBoolean(false);
        this.f32052i = new Runnable() { // from class: io.sentry.android.core.a
            {
                b.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b.a(b.this);
            }
        };
        this.f32044a = z11;
        this.f32045b = aVar;
        this.f32047d = j11;
        this.f32048e = d0Var;
        this.f32046c = j0Var;
        this.f32051h = context;
    }
}