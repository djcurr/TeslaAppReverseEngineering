package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.vision.zzdh;
import com.google.android.gms.internal.vision.zzdm;
import com.google.android.gms.internal.vision.zzdp;
import com.google.android.gms.internal.vision.zzdt;
import com.google.android.gms.internal.vision.zzdu;
import com.google.android.gms.vision.L;

@Keep
/* loaded from: classes3.dex */
public class LogUtils {
    public static zzdu zza(long j11, int i11) {
        zzdu zzduVar = new zzdu();
        zzdp zzdpVar = new zzdp();
        zzduVar.zzqe = zzdpVar;
        zzdm zzdmVar = new zzdm();
        zzdpVar.zzpk = r3;
        zzdm[] zzdmVarArr = {zzdmVar};
        zzdmVar.zzot = Long.valueOf(j11);
        zzdmVar.zzou = Long.valueOf(i11);
        zzdmVar.zzov = new zzdt[i11];
        return zzduVar;
    }

    public static zzdh zzd(Context context) {
        zzdh zzdhVar = new zzdh();
        zzdhVar.zzod = context.getPackageName();
        String zze = zze(context);
        if (zze != null) {
            zzdhVar.version = zze;
        }
        return zzdhVar;
    }

    private static String zze(Context context) {
        try {
            return Wrappers.packageManager(context).getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e11) {
            L.zza(e11, "Unable to find calling package info for %s", context.getPackageName());
            return null;
        }
    }
}