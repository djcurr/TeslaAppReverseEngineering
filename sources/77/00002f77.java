package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes3.dex */
final class zzjj implements Runnable {
    final /* synthetic */ zzjl zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjj(zzjl zzjlVar) {
        this.zza = zzjlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjm zzjmVar = this.zza.zza;
        Context zzau = zzjmVar.zzs.zzau();
        this.zza.zza.zzs.zzaw();
        zzjm.zzo(zzjmVar, new ComponentName(zzau, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}