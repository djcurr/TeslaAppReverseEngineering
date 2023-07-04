package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes3.dex */
public abstract class zzfz {
    public static zzfy zzd(Context context) {
        String packageName = context.getPackageName();
        int i11 = 0;
        try {
            i11 = context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        zzfv zzfvVar = new zzfv();
        zzfvVar.zza(packageName);
        zzfvVar.zzb(i11);
        zzfvVar.zzd(1);
        return zzfvVar;
    }

    public abstract int zza();

    public abstract String zzb();

    public abstract int zzc();
}