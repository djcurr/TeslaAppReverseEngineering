package io.realm.internal;

import io.realm.log.RealmLog;
import java.lang.ref.ReferenceQueue;

/* loaded from: classes5.dex */
class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final ReferenceQueue<h> f31930a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(ReferenceQueue<h> referenceQueue) {
        this.f31930a = referenceQueue;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                ((NativeObjectReference) this.f31930a.remove()).e();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                RealmLog.c("The FinalizerRunnable thread has been interrupted. Native resources cannot be freed anymore", new Object[0]);
                return;
            }
        }
    }
}