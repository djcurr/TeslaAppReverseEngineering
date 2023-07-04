package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class zab extends ActivityLifecycleObserver {
    private final WeakReference zaa;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zab(zaa zaaVar) {
        this.zaa = new WeakReference(zaaVar);
    }

    @Override // com.google.android.gms.common.api.internal.ActivityLifecycleObserver
    public final ActivityLifecycleObserver onStopCallOnce(Runnable runnable) {
        zaa zaaVar = (zaa) this.zaa.get();
        if (zaaVar != null) {
            zaaVar.zac(runnable);
            return this;
        }
        throw new IllegalStateException("The target activity has already been GC'd");
    }
}