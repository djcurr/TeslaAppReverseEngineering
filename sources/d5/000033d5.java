package com.google.android.libraries.places.internal;

import java.io.Closeable;

/* loaded from: classes3.dex */
public final class zzmc implements Closeable {
    private static final ThreadLocal zza = new zzmb();
    private int zzb = 0;

    public static int zza() {
        return ((zzmc) zza.get()).zzb;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i11 = this.zzb;
        if (i11 <= 0) {
            throw new AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
        }
        this.zzb = i11 - 1;
    }
}