package com.google.android.gms.measurement.internal;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzeg implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ Object zzd;
    final /* synthetic */ Object zze;
    final /* synthetic */ zzej zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeg(zzej zzejVar, int i11, String str, Object obj, Object obj2, Object obj3) {
        this.zzf = zzejVar;
        this.zza = i11;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c11;
        long j11;
        char c12;
        long j12;
        zzey zzm = this.zzf.zzs.zzm();
        if (zzm.zzx()) {
            zzej zzejVar = this.zzf;
            c11 = zzejVar.zza;
            if (c11 == 0) {
                if (zzejVar.zzs.zzf().zzy()) {
                    zzej zzejVar2 = this.zzf;
                    zzejVar2.zzs.zzaw();
                    zzejVar2.zza = 'C';
                } else {
                    zzej zzejVar3 = this.zzf;
                    zzejVar3.zzs.zzaw();
                    zzejVar3.zza = 'c';
                }
            }
            zzej zzejVar4 = this.zzf;
            j11 = zzejVar4.zzb;
            if (j11 < 0) {
                zzejVar4.zzs.zzf().zzh();
                zzejVar4.zzb = 60000L;
            }
            char charAt = "01VDIWEA?".charAt(this.zza);
            zzej zzejVar5 = this.zzf;
            c12 = zzejVar5.zza;
            j12 = zzejVar5.zzb;
            String zzo = zzej.zzo(true, this.zzb, this.zzc, this.zzd, this.zze);
            StringBuilder sb2 = new StringBuilder(zzo.length() + 24);
            sb2.append("2");
            sb2.append(charAt);
            sb2.append(c12);
            sb2.append(j12);
            sb2.append(":");
            sb2.append(zzo);
            String sb3 = sb2.toString();
            if (sb3.length() > 1024) {
                sb3 = this.zzb.substring(0, 1024);
            }
            zzew zzewVar = zzm.zzb;
            if (zzewVar != null) {
                zzewVar.zzb(sb3, 1L);
                return;
            }
            return;
        }
        Log.println(6, this.zzf.zzq(), "Persisted config not initialized. Not logging error/warn");
    }
}