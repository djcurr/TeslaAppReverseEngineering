package com.google.android.gms.internal.location;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbw extends zzbx {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzbx zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbw(zzbx zzbxVar, int i11, int i12) {
        this.zzc = zzbxVar;
        this.zza = i11;
        this.zzb = i12;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzbr.zza(i11, this.zzb, "index");
        return this.zzc.get(i11 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzbx, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i11, int i12) {
        return subList(i11, i12);
    }

    @Override // com.google.android.gms.internal.location.zzbu
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.location.zzbu
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.location.zzbu
    public final boolean zzf() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.location.zzbu
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.location.zzbx
    public final zzbx zzh(int i11, int i12) {
        zzbr.zzc(i11, i12, this.zzb);
        zzbx zzbxVar = this.zzc;
        int i13 = this.zza;
        return zzbxVar.subList(i11 + i13, i12 + i13);
    }
}