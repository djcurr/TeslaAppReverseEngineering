package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzap {
    final String zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final zzas zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzap(zzft zzftVar, String str, String str2, String str3, long j11, long j12, Bundle bundle) {
        zzas zzasVar;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j11;
        this.zze = j12;
        if (j12 != 0 && j12 > j11) {
            zzftVar.zzay().zzk().zzb("Event created with reverse previous/current timestamps. appId", zzej.zzn(str2));
        }
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it2 = bundle2.keySet().iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                if (next == null) {
                    zzftVar.zzay().zzd().zza("Param name can't be null");
                    it2.remove();
                } else {
                    Object zzA = zzftVar.zzv().zzA(next, bundle2.get(next));
                    if (zzA == null) {
                        zzftVar.zzay().zzk().zzb("Param value can't be null", zzftVar.zzj().zze(next));
                        it2.remove();
                    } else {
                        zzftVar.zzv().zzN(bundle2, next, zzA);
                    }
                }
            }
            zzasVar = new zzas(bundle2);
        } else {
            zzasVar = new zzas(new Bundle());
        }
        this.zzf = zzasVar;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        String obj = this.zzf.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + obj.length());
        sb2.append("Event{appId='");
        sb2.append(str);
        sb2.append("', name='");
        sb2.append(str2);
        sb2.append("', params=");
        sb2.append(obj);
        sb2.append(CoreConstants.CURLY_RIGHT);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzap zza(zzft zzftVar, long j11) {
        return new zzap(zzftVar, this.zzc, this.zza, this.zzb, this.zzd, j11, this.zzf);
    }

    private zzap(zzft zzftVar, String str, String str2, String str3, long j11, long j12, zzas zzasVar) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzasVar);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j11;
        this.zze = j12;
        if (j12 != 0 && j12 > j11) {
            zzftVar.zzay().zzk().zzc("Event created with reverse previous/current timestamps. appId, name", zzej.zzn(str2), zzej.zzn(str3));
        }
        this.zzf = zzasVar;
    }
}