package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzdx extends com.google.android.gms.internal.measurement.zzbm implements zzdz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.zzdz
    public final String zzd(zzp zzpVar) {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, zzpVar);
        Parcel zzb = zzb(11, zza);
        String readString = zzb.readString();
        zzb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.measurement.internal.zzdz
    public final List zze(zzp zzpVar, boolean z11) {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, zzpVar);
        com.google.android.gms.internal.measurement.zzbo.zzc(zza, z11);
        Parcel zzb = zzb(7, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(zzku.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzdz
    public final List zzf(String str, String str2, zzp zzpVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, zzpVar);
        Parcel zzb = zzb(16, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(zzab.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzdz
    public final List zzg(String str, String str2, String str3) {
        Parcel zza = zza();
        zza.writeString(null);
        zza.writeString(str2);
        zza.writeString(str3);
        Parcel zzb = zzb(17, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(zzab.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzdz
    public final List zzh(String str, String str2, boolean z11, zzp zzpVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        com.google.android.gms.internal.measurement.zzbo.zzc(zza, z11);
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, zzpVar);
        Parcel zzb = zzb(14, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(zzku.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzdz
    public final List zzi(String str, String str2, String str3, boolean z11) {
        Parcel zza = zza();
        zza.writeString(null);
        zza.writeString(str2);
        zza.writeString(str3);
        com.google.android.gms.internal.measurement.zzbo.zzc(zza, z11);
        Parcel zzb = zzb(15, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(zzku.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzdz
    public final void zzj(zzp zzpVar) {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, zzpVar);
        zzc(4, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzdz
    public final void zzk(zzau zzauVar, zzp zzpVar) {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, zzauVar);
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, zzpVar);
        zzc(1, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzdz
    public final void zzl(zzau zzauVar, String str, String str2) {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzdz
    public final void zzm(zzp zzpVar) {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, zzpVar);
        zzc(18, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzdz
    public final void zzn(zzab zzabVar, zzp zzpVar) {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, zzabVar);
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, zzpVar);
        zzc(12, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzdz
    public final void zzo(zzab zzabVar) {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzdz
    public final void zzp(zzp zzpVar) {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, zzpVar);
        zzc(20, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzdz
    public final void zzq(long j11, String str, String str2, String str3) {
        Parcel zza = zza();
        zza.writeLong(j11);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeString(str3);
        zzc(10, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzdz
    public final void zzr(Bundle bundle, zzp zzpVar) {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, bundle);
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, zzpVar);
        zzc(19, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzdz
    public final void zzs(zzp zzpVar) {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, zzpVar);
        zzc(6, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzdz
    public final void zzt(zzku zzkuVar, zzp zzpVar) {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, zzkuVar);
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, zzpVar);
        zzc(2, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzdz
    public final byte[] zzu(zzau zzauVar, String str) {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, zzauVar);
        zza.writeString(str);
        Parcel zzb = zzb(9, zza);
        byte[] createByteArray = zzb.createByteArray();
        zzb.recycle();
        return createByteArray;
    }
}