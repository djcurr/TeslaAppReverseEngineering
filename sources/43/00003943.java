package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

@KeepForSdk
/* loaded from: classes2.dex */
public class n {

    /* renamed from: c */
    private static final Object f16835c = new Object();

    /* renamed from: d */
    private static h1 f16836d;

    /* renamed from: a */
    private final Context f16837a;

    /* renamed from: b */
    private final Executor f16838b = h.f16804a;

    public n(Context context) {
        this.f16837a = context;
    }

    public static /* synthetic */ Integer a(Context context, Intent intent) {
        return h(context, intent);
    }

    public static /* synthetic */ Integer b(Task task) {
        return g(task);
    }

    public static /* synthetic */ Integer c(Task task) {
        return i(task);
    }

    public static /* synthetic */ Task d(Context context, Intent intent, Task task) {
        return j(context, intent, task);
    }

    private static Task<Integer> e(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        return f(context, "com.google.firebase.MESSAGING_EVENT").c(intent).continueWith(h.f16804a, new Continuation() { // from class: com.google.firebase.messaging.k
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return n.b(task);
            }
        });
    }

    private static h1 f(Context context, String str) {
        h1 h1Var;
        synchronized (f16835c) {
            if (f16836d == null) {
                f16836d = new h1(context, str);
            }
            h1Var = f16836d;
        }
        return h1Var;
    }

    public static /* synthetic */ Integer g(Task task) {
        return -1;
    }

    public static /* synthetic */ Integer h(Context context, Intent intent) {
        return Integer.valueOf(s0.b().g(context, intent));
    }

    public static /* synthetic */ Integer i(Task task) {
        return Integer.valueOf((int) DownloaderService.STATUS_FORBIDDEN);
    }

    public static /* synthetic */ Task j(Context context, Intent intent, Task task) {
        return (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) ? e(context, intent).continueWith(h.f16804a, new Continuation() { // from class: com.google.firebase.messaging.l
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return n.c(task2);
            }
        }) : task;
    }

    @KeepForSdk
    public Task<Integer> k(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return l(this.f16837a, intent);
    }

    public Task<Integer> l(final Context context, final Intent intent) {
        boolean z11 = PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z12 = (intent.getFlags() & 268435456) != 0;
        if (z11 && !z12) {
            return e(context, intent);
        }
        return Tasks.call(this.f16838b, new Callable() { // from class: com.google.firebase.messaging.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return n.a(context, intent);
            }
        }).continueWithTask(this.f16838b, new Continuation() { // from class: com.google.firebase.messaging.j
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return n.d(context, intent, task);
            }
        });
    }
}