package com.google.android.libraries.places.internal;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzgf {
    private final Context zza;

    public zzgf(Context context) {
        zzig.zzc(context, "Context must not be null.");
        this.zza = context;
    }

    public final zzjb zza() {
        String packageName = this.zza.getPackageName();
        String zza = zzfu.zza(this.zza.getPackageManager(), packageName);
        zzja zzjaVar = new zzja();
        if (packageName != null) {
            zzjaVar.zza("X-Android-Package", packageName);
        }
        if (zza != null) {
            zzjaVar.zza("X-Android-Cert", zza);
        }
        return zzjaVar.zzb();
    }
}