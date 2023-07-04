package com.google.android.gms.internal.vision;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* loaded from: classes3.dex */
final class zzcw extends WeakReference<Throwable> {
    private final int zzlv;

    public zzcw(Throwable th2, ReferenceQueue<Throwable> referenceQueue) {
        super(th2, null);
        Objects.requireNonNull(th2, "The referent cannot be null");
        this.zzlv = System.identityHashCode(th2);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == zzcw.class) {
            if (this == obj) {
                return true;
            }
            zzcw zzcwVar = (zzcw) obj;
            if (this.zzlv == zzcwVar.zzlv && get() == zzcwVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzlv;
    }
}