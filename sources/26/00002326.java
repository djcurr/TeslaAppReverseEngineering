package com.google.android.gms.internal.measurement;

import okhttp3.internal.http2.Settings;

/* loaded from: classes3.dex */
final class zzjk {
    private final Object zza;
    private final int zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjk(Object obj, int i11) {
        this.zza = obj;
        this.zzb = i11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzjk) {
            zzjk zzjkVar = (zzjk) obj;
            return this.zza == zzjkVar.zza && this.zzb == zzjkVar.zzb;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.zzb;
    }
}