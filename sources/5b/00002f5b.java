package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzii implements Runnable {
    final /* synthetic */ zzim zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzii(zzim zzimVar) {
        this.zza = zzimVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzif zzifVar;
        zzim zzimVar = this.zza;
        zzifVar = zzimVar.zzh;
        zzimVar.zza = zzifVar;
    }
}