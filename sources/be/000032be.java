package com.google.android.libraries.places.internal;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class zzcg {
    private static final zzbx zza = new zzca();
    private static final zzcg zzb = new zzcg(SystemClock.elapsedRealtime());

    private zzcg() {
        SystemClock.elapsedRealtime();
    }

    private zzcg(long j11) {
    }

    public static zzcg zza() {
        return new zzcg(SystemClock.elapsedRealtime());
    }
}