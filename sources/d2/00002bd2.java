package com.google.android.gms.internal.vision;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
final class zzcv {
    private final ConcurrentHashMap<zzcw, List<Throwable>> zzlt = new ConcurrentHashMap<>(16, 0.75f, 10);
    private final ReferenceQueue<Throwable> zzlu = new ReferenceQueue<>();

    public final List<Throwable> zza(Throwable th2, boolean z11) {
        Reference<? extends Throwable> poll = this.zzlu.poll();
        while (poll != null) {
            this.zzlt.remove(poll);
            poll = this.zzlu.poll();
        }
        return this.zzlt.get(new zzcw(th2, null));
    }
}