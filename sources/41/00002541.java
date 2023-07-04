package com.google.android.gms.internal.mlkit_common;

import android.os.SystemClock;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.mlkit.common.sdkinternal.l;
import com.google.mlkit.common.sdkinternal.n;
import eo.b;

/* loaded from: classes3.dex */
public final class zznc {
    private static final GmsLogger zza = new GmsLogger("RemoteModelUtils", "");

    public static zzjg zza(b bVar, n nVar, zzms zzmsVar) {
        zzji zzjiVar;
        l zzb = zzmsVar.zzb();
        String a11 = bVar.a();
        zzjm zzjmVar = new zzjm();
        zzjh zzjhVar = new zzjh();
        zzjhVar.zzc(bVar.b());
        zzjhVar.zzd(zzjj.CLOUD);
        zzjhVar.zza(zzad.zzb(a11));
        int ordinal = zzb.ordinal();
        if (ordinal == 2) {
            zzjiVar = zzji.BASE_TRANSLATE;
        } else if (ordinal == 4) {
            zzjiVar = zzji.CUSTOM;
        } else if (ordinal != 5) {
            zzjiVar = zzji.TYPE_UNKNOWN;
        } else {
            zzjiVar = zzji.BASE_DIGITAL_INK;
        }
        zzjhVar.zzb(zzjiVar);
        zzjmVar.zzb(zzjhVar.zzg());
        zzjp zzc = zzjmVar.zzc();
        zzjd zzjdVar = new zzjd();
        zzjdVar.zzd(zzmsVar.zzc());
        zzjdVar.zzc(zzmsVar.zzd());
        zzjdVar.zzb(Long.valueOf(zzmsVar.zza()));
        zzjdVar.zzf(zzc);
        if (zzmsVar.zzg()) {
            long b11 = nVar.b(bVar);
            if (b11 == 0) {
                zza.w("RemoteModelUtils", "Model downloaded without its beginning time recorded.");
            } else {
                long c11 = nVar.c(bVar);
                if (c11 == 0) {
                    c11 = SystemClock.elapsedRealtime();
                    nVar.d(bVar, c11);
                }
                zzjdVar.zzg(Long.valueOf(c11 - b11));
            }
        }
        if (zzmsVar.zzf()) {
            long b12 = nVar.b(bVar);
            if (b12 == 0) {
                zza.w("RemoteModelUtils", "Model downloaded without its beginning time recorded.");
            } else {
                zzjdVar.zze(Long.valueOf(SystemClock.elapsedRealtime() - b12));
            }
        }
        return zzjdVar.zzi();
    }
}