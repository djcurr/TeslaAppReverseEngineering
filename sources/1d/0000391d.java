package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.iid.InstanceID;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import ezvcard.property.Gender;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class a1 {

    /* renamed from: i  reason: collision with root package name */
    private static final long f16749i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a  reason: collision with root package name */
    private final Context f16750a;

    /* renamed from: b  reason: collision with root package name */
    private final i0 f16751b;

    /* renamed from: c  reason: collision with root package name */
    private final d0 f16752c;

    /* renamed from: d  reason: collision with root package name */
    private final FirebaseMessaging f16753d;

    /* renamed from: f  reason: collision with root package name */
    private final ScheduledExecutorService f16755f;

    /* renamed from: h  reason: collision with root package name */
    private final y0 f16757h;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, ArrayDeque<TaskCompletionSource<Void>>> f16754e = new androidx.collection.a();

    /* renamed from: g  reason: collision with root package name */
    private boolean f16756g = false;

    private a1(FirebaseMessaging firebaseMessaging, i0 i0Var, y0 y0Var, d0 d0Var, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f16753d = firebaseMessaging;
        this.f16751b = i0Var;
        this.f16757h = y0Var;
        this.f16752c = d0Var;
        this.f16750a = context;
        this.f16755f = scheduledExecutorService;
    }

    private static <T> void b(Task<T> task) {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e11) {
            e = e11;
            throw new IOException(InstanceID.ERROR_SERVICE_NOT_AVAILABLE, e);
        } catch (ExecutionException e12) {
            Throwable cause = e12.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e12);
            }
            throw ((IOException) cause);
        } catch (TimeoutException e13) {
            e = e13;
            throw new IOException(InstanceID.ERROR_SERVICE_NOT_AVAILABLE, e);
        }
    }

    private void c(String str) {
        b(this.f16752c.l(this.f16753d.k(), str));
    }

    private void d(String str) {
        b(this.f16752c.m(this.f16753d.k(), str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Task<a1> e(final FirebaseMessaging firebaseMessaging, final i0 i0Var, final d0 d0Var, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return Tasks.call(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.z0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                a1 i11;
                i11 = a1.i(context, scheduledExecutorService, firebaseMessaging, i0Var, d0Var);
                return i11;
            }
        });
    }

    static boolean g() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a1 i(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, i0 i0Var, d0 d0Var) {
        return new a1(firebaseMessaging, i0Var, y0.a(context, scheduledExecutorService), d0Var, context, scheduledExecutorService);
    }

    private void j(x0 x0Var) {
        synchronized (this.f16754e) {
            String e11 = x0Var.e();
            if (this.f16754e.containsKey(e11)) {
                ArrayDeque<TaskCompletionSource<Void>> arrayDeque = this.f16754e.get(e11);
                TaskCompletionSource<Void> poll = arrayDeque.poll();
                if (poll != null) {
                    poll.setResult(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.f16754e.remove(e11);
                }
            }
        }
    }

    private void n() {
        if (h()) {
            return;
        }
        q(0L);
    }

    boolean f() {
        return this.f16757h.b() != null;
    }

    synchronized boolean h() {
        return this.f16756g;
    }

    boolean k(x0 x0Var) {
        try {
            String b11 = x0Var.b();
            char c11 = 65535;
            int hashCode = b11.hashCode();
            if (hashCode != 83) {
                if (hashCode == 85 && b11.equals(Gender.UNKNOWN)) {
                    c11 = 1;
                }
            } else if (b11.equals("S")) {
                c11 = 0;
            }
            if (c11 == 0) {
                c(x0Var.c());
                if (g()) {
                    Log.d("FirebaseMessaging", "Subscribe to topic: " + x0Var.c() + " succeeded.");
                }
            } else if (c11 != 1) {
                if (g()) {
                    Log.d("FirebaseMessaging", "Unknown topic operation" + x0Var + ".");
                }
            } else {
                d(x0Var.c());
                if (g()) {
                    Log.d("FirebaseMessaging", "Unsubscribe from topic: " + x0Var.c() + " succeeded.");
                }
            }
            return true;
        } catch (IOException e11) {
            if (!InstanceID.ERROR_SERVICE_NOT_AVAILABLE.equals(e11.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e11.getMessage())) {
                if (e11.getMessage() == null) {
                    Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                    return false;
                }
                throw e11;
            }
            Log.e("FirebaseMessaging", "Topic operation failed: " + e11.getMessage() + ". Will retry Topic operation.");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(Runnable runnable, long j11) {
        this.f16755f.schedule(runnable, j11, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void m(boolean z11) {
        this.f16756g = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o() {
        if (f()) {
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (g() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean p() {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            com.google.firebase.messaging.y0 r0 = r2.f16757h     // Catch: java.lang.Throwable -> L2b
            com.google.firebase.messaging.x0 r0 = r0.b()     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L19
            boolean r0 = g()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L16
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L2b
        L16:
            r0 = 1
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            return r0
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r2.k(r0)
            if (r1 != 0) goto L22
            r0 = 0
            return r0
        L22:
            com.google.firebase.messaging.y0 r1 = r2.f16757h
            r1.d(r0)
            r2.j(r0)
            goto L0
        L2b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.a1.p():boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(long j11) {
        l(new b1(this, this.f16750a, this.f16751b, Math.min(Math.max(30L, 2 * j11), f16749i)), j11);
        m(true);
    }
}