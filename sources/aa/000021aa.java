package com.google.android.gms.internal.gcm;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* loaded from: classes3.dex */
final class zzt extends WeakReference<Throwable> {
    private final int zzdv;

    public zzt(Throwable th2, ReferenceQueue<Throwable> referenceQueue) {
        super(th2, referenceQueue);
        Objects.requireNonNull(th2, "The referent cannot be null");
        this.zzdv = System.identityHashCode(th2);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == zzt.class) {
            if (this == obj) {
                return true;
            }
            zzt zztVar = (zzt) obj;
            if (this.zzdv == zztVar.zzdv && get() == zztVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzdv;
    }
}