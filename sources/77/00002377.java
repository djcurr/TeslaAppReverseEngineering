package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class zzmk extends zzmi {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzmi
    public final /* synthetic */ int zza(Object obj) {
        return ((zzmj) obj).zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzmi
    public final /* synthetic */ int zzb(Object obj) {
        return ((zzmj) obj).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzmi
    public final /* synthetic */ Object zzc(Object obj) {
        return ((zzjz) obj).zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzmi
    public final /* bridge */ /* synthetic */ Object zzd(Object obj, Object obj2) {
        zzmj zzmjVar = (zzmj) obj2;
        return zzmjVar.equals(zzmj.zzc()) ? obj : zzmj.zzd((zzmj) obj, zzmjVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzmi
    public final /* synthetic */ Object zze() {
        return zzmj.zze();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzmi
    public final /* bridge */ /* synthetic */ void zzf(Object obj, int i11, long j11) {
        ((zzmj) obj).zzh(i11 << 3, Long.valueOf(j11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzmi
    public final void zzg(Object obj) {
        ((zzjz) obj).zzc.zzf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzmi
    public final /* synthetic */ void zzh(Object obj, Object obj2) {
        ((zzjz) obj).zzc = (zzmj) obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzmi
    public final /* synthetic */ void zzi(Object obj, zzjh zzjhVar) {
        ((zzmj) obj).zzi(zzjhVar);
    }
}