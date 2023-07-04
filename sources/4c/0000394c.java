package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class r0 {

    /* renamed from: a */
    private final Executor f16846a;

    /* renamed from: b */
    private final Map<String, Task<String>> f16847b = new androidx.collection.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface a {
        Task<String> start();
    }

    public r0(Executor executor) {
        this.f16846a = executor;
    }

    public static /* synthetic */ Task a(r0 r0Var, String str, Task task) {
        return r0Var.c(str, task);
    }

    public /* synthetic */ Task c(String str, Task task) {
        synchronized (this) {
            this.f16847b.remove(str);
        }
        return task;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized Task<String> b(final String str, a aVar) {
        Task<String> task = this.f16847b.get(str);
        if (task != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return task;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        Task continueWithTask = aVar.start().continueWithTask(this.f16846a, new Continuation() { // from class: com.google.firebase.messaging.q0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return r0.a(r0.this, str, task2);
            }
        });
        this.f16847b.put(str, continueWithTask);
        return continueWithTask;
    }
}