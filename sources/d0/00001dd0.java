package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* loaded from: classes3.dex */
abstract class zaav implements Runnable {
    final /* synthetic */ zaaw zab;

    @Override // java.lang.Runnable
    public final void run() {
        Lock lock;
        Lock lock2;
        zabi zabiVar;
        Lock lock3;
        lock = this.zab.zab;
        lock.lock();
        try {
            try {
                if (Thread.interrupted()) {
                    lock3 = this.zab.zab;
                } else {
                    zaa();
                    lock3 = this.zab.zab;
                }
            } catch (RuntimeException e11) {
                zabiVar = this.zab.zaa;
                zabiVar.zam(e11);
                lock3 = this.zab.zab;
            }
            lock3.unlock();
        } catch (Throwable th2) {
            lock2 = this.zab.zab;
            lock2.unlock();
            throw th2;
        }
    }

    protected abstract void zaa();
}