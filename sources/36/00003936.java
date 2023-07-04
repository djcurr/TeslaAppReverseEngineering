package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.h1;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
class h1 implements ServiceConnection {

    /* renamed from: a */
    private final Context f16805a;

    /* renamed from: b */
    private final Intent f16806b;

    /* renamed from: c */
    private final ScheduledExecutorService f16807c;

    /* renamed from: d */
    private final Queue<a> f16808d;

    /* renamed from: e */
    private e1 f16809e;

    /* renamed from: f */
    private boolean f16810f;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        final Intent f16811a;

        /* renamed from: b */
        private final TaskCompletionSource<Void> f16812b = new TaskCompletionSource<>();

        a(Intent intent) {
            this.f16811a = intent;
        }

        public static /* synthetic */ void a(a aVar) {
            aVar.f();
        }

        public static /* synthetic */ void b(ScheduledFuture scheduledFuture, Task task) {
            scheduledFuture.cancel(false);
        }

        public /* synthetic */ void f() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.f16811a.getAction() + " App may get closed.");
            d();
        }

        void c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.g1
                {
                    h1.a.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    h1.a.a(h1.a.this);
                }
            }, 9000L, TimeUnit.MILLISECONDS);
            e().addOnCompleteListener(scheduledExecutorService, new OnCompleteListener() { // from class: com.google.firebase.messaging.f1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    h1.a.b(schedule, task);
                }
            });
        }

        public void d() {
            this.f16812b.trySetResult(null);
        }

        Task<Void> e() {
            return this.f16812b.getTask();
        }
    }

    public h1(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private void a() {
        while (!this.f16808d.isEmpty()) {
            this.f16808d.poll().d();
        }
    }

    private synchronized void b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f16808d.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            e1 e1Var = this.f16809e;
            if (e1Var != null && e1Var.isBinderAlive()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f16809e.c(this.f16808d.poll());
            } else {
                d();
                return;
            }
        }
    }

    private void d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("binder is dead. start connection? ");
            sb2.append(!this.f16810f);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f16810f) {
            return;
        }
        this.f16810f = true;
        try {
        } catch (SecurityException e11) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e11);
        }
        if (ConnectionTracker.getInstance().bindService(this.f16805a, this.f16806b, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f16810f = false;
        a();
    }

    public synchronized Task<Void> c(Intent intent) {
        a aVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        aVar = new a(intent);
        aVar.c(this.f16807c);
        this.f16808d.add(aVar);
        b();
        return aVar.e();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f16810f = false;
        if (!(iBinder instanceof e1)) {
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            a();
            return;
        }
        this.f16809e = (e1) iBinder;
        b();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        b();
    }

    h1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f16808d = new ArrayDeque();
        this.f16810f = false;
        Context applicationContext = context.getApplicationContext();
        this.f16805a = applicationContext;
        this.f16806b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f16807c = scheduledExecutorService;
    }
}