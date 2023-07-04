package com.google.android.gms.measurement.internal;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfi implements com.google.android.gms.internal.measurement.zzr {
    final /* synthetic */ zzfk zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfi(zzfk zzfkVar) {
        this.zza = zzfkVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i11, String str, List list, boolean z11, boolean z12) {
        zzeh zzc;
        int i12 = i11 - 1;
        if (i12 == 0) {
            zzc = this.zza.zzs.zzay().zzc();
        } else if (i12 != 1) {
            if (i12 == 3) {
                zzc = this.zza.zzs.zzay().zzj();
            } else if (i12 != 4) {
                zzc = this.zza.zzs.zzay().zzi();
            } else if (z11) {
                zzc = this.zza.zzs.zzay().zzm();
            } else if (!z12) {
                zzc = this.zza.zzs.zzay().zzl();
            } else {
                zzc = this.zza.zzs.zzay().zzk();
            }
        } else if (z11) {
            zzc = this.zza.zzs.zzay().zzh();
        } else if (!z12) {
            zzc = this.zza.zzs.zzay().zze();
        } else {
            zzc = this.zza.zzs.zzay().zzd();
        }
        int size = list.size();
        if (size == 1) {
            zzc.zzb(str, list.get(0));
        } else if (size == 2) {
            zzc.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzc.zza(str);
        } else {
            zzc.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }
}