package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.e1;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public abstract class i extends Service {

    /* renamed from: b */
    private Binder f16814b;

    /* renamed from: d */
    private int f16816d;

    /* renamed from: a */
    final ExecutorService f16813a = o.b();

    /* renamed from: c */
    private final Object f16815c = new Object();

    /* renamed from: e */
    private int f16817e = 0;

    /* loaded from: classes2.dex */
    class a implements e1.a {
        a() {
            i.this = r1;
        }

        @Override // com.google.firebase.messaging.e1.a
        @KeepForSdk
        public Task<Void> a(Intent intent) {
            return i.this.j(intent);
        }
    }

    public static /* synthetic */ void a(i iVar, Intent intent, Task task) {
        iVar.h(intent, task);
    }

    public static /* synthetic */ void b(i iVar, Intent intent, TaskCompletionSource taskCompletionSource) {
        iVar.i(intent, taskCompletionSource);
    }

    private void d(Intent intent) {
        if (intent != null) {
            c1.b(intent);
        }
        synchronized (this.f16815c) {
            int i11 = this.f16817e - 1;
            this.f16817e = i11;
            if (i11 == 0) {
                k(this.f16816d);
            }
        }
    }

    public /* synthetic */ void h(Intent intent, Task task) {
        d(intent);
    }

    public /* synthetic */ void i(Intent intent, TaskCompletionSource taskCompletionSource) {
        try {
            f(intent);
        } finally {
            taskCompletionSource.setResult(null);
        }
    }

    public Task<Void> j(final Intent intent) {
        if (g(intent)) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f16813a.execute(new Runnable() { // from class: com.google.firebase.messaging.g
            {
                i.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                i.b(i.this, intent, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    protected abstract Intent e(Intent intent);

    public abstract void f(Intent intent);

    public boolean g(Intent intent) {
        return false;
    }

    boolean k(int i11) {
        return stopSelfResult(i11);
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f16814b == null) {
            this.f16814b = new e1(new a());
        }
        return this.f16814b;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f16813a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i11, int i12) {
        synchronized (this.f16815c) {
            this.f16816d = i12;
            this.f16817e++;
        }
        Intent e11 = e(intent);
        if (e11 == null) {
            d(intent);
            return 2;
        }
        Task<Void> j11 = j(e11);
        if (j11.isComplete()) {
            d(intent);
            return 2;
        }
        j11.addOnCompleteListener(h.f16804a, new OnCompleteListener() { // from class: com.google.firebase.messaging.f
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                i.a(i.this, intent, task);
            }
        });
        return 3;
    }
}