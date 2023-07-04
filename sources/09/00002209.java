package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class zzae extends zza implements zzag {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzae(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final float zzd() {
        Parcel zzH = zzH(13, zza());
        float readFloat = zzH.readFloat();
        zzH.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final float zze() {
        Parcel zzH = zzH(5, zza());
        float readFloat = zzH.readFloat();
        zzH.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final int zzf() {
        Parcel zzH = zzH(9, zza());
        int readInt = zzH.readInt();
        zzH.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final String zzg() {
        Parcel zzH = zzH(3, zza());
        String readString = zzH.readString();
        zzH.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final void zzh() {
        zzc(2, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final void zzi() {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final void zzj(boolean z11) {
        Parcel zza = zza();
        zzc.zzc(zza, z11);
        zzc(10, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final void zzk(float f11) {
        Parcel zza = zza();
        zza.writeFloat(f11);
        zzc(12, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final void zzl(boolean z11) {
        Parcel zza = zza();
        zzc.zzc(zza, z11);
        zzc(6, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final void zzm(float f11) {
        Parcel zza = zza();
        zza.writeFloat(f11);
        zzc(4, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final boolean zzn(zzag zzagVar) {
        Parcel zza = zza();
        zzc.zzf(zza, zzagVar);
        Parcel zzH = zzH(8, zza);
        boolean zzg = zzc.zzg(zzH);
        zzH.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final boolean zzo() {
        Parcel zzH = zzH(11, zza());
        boolean zzg = zzc.zzg(zzH);
        zzH.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final boolean zzp() {
        Parcel zzH = zzH(7, zza());
        boolean zzg = zzc.zzg(zzH);
        zzH.recycle();
        return zzg;
    }
}