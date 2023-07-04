package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.h1;

/* loaded from: classes2.dex */
class e1 extends Binder {

    /* renamed from: a  reason: collision with root package name */
    private final a f16792a;

    /* loaded from: classes2.dex */
    interface a {
        Task<Void> a(Intent intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e1(a aVar) {
        this.f16792a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(final h1.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            this.f16792a.a(aVar.f16811a).addOnCompleteListener(h.f16804a, new OnCompleteListener() { // from class: com.google.firebase.messaging.d1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    h1.a.this.d();
                }
            });
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}