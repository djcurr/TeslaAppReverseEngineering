package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes3.dex */
public final class zzm extends zza implements zzo {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final boolean zzA() {
        Parcel zzH = zzH(23, zza());
        boolean zzg = zzc.zzg(zzH);
        zzH.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final boolean zzB() {
        Parcel zzH = zzH(16, zza());
        boolean zzg = zzc.zzg(zzH);
        zzH.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final float zzd() {
        Parcel zzH = zzH(12, zza());
        float readFloat = zzH.readFloat();
        zzH.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final float zze() {
        Parcel zzH = zzH(8, zza());
        float readFloat = zzH.readFloat();
        zzH.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final float zzf() {
        Parcel zzH = zzH(18, zza());
        float readFloat = zzH.readFloat();
        zzH.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final float zzg() {
        Parcel zzH = zzH(7, zza());
        float readFloat = zzH.readFloat();
        zzH.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final float zzh() {
        Parcel zzH = zzH(14, zza());
        float readFloat = zzH.readFloat();
        zzH.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final int zzi() {
        Parcel zzH = zzH(20, zza());
        int readInt = zzH.readInt();
        zzH.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final IObjectWrapper zzj() {
        Parcel zzH = zzH(25, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzH.readStrongBinder());
        zzH.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final LatLng zzk() {
        Parcel zzH = zzH(4, zza());
        LatLng latLng = (LatLng) zzc.zza(zzH, LatLng.CREATOR);
        zzH.recycle();
        return latLng;
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final LatLngBounds zzl() {
        Parcel zzH = zzH(10, zza());
        LatLngBounds latLngBounds = (LatLngBounds) zzc.zza(zzH, LatLngBounds.CREATOR);
        zzH.recycle();
        return latLngBounds;
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final String zzm() {
        Parcel zzH = zzH(2, zza());
        String readString = zzH.readString();
        zzH.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final void zzn() {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final void zzo(float f11) {
        Parcel zza = zza();
        zza.writeFloat(f11);
        zzc(11, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final void zzp(boolean z11) {
        Parcel zza = zza();
        zzc.zzc(zza, z11);
        zzc(22, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final void zzq(float f11) {
        Parcel zza = zza();
        zza.writeFloat(f11);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final void zzr(float f11, float f12) {
        Parcel zza = zza();
        zza.writeFloat(f11);
        zza.writeFloat(f12);
        zzc(6, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final void zzs(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzc.zzf(zza, iObjectWrapper);
        zzc(21, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final void zzt(LatLng latLng) {
        Parcel zza = zza();
        zzc.zzd(zza, latLng);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final void zzu(LatLngBounds latLngBounds) {
        Parcel zza = zza();
        zzc.zzd(zza, latLngBounds);
        zzc(9, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final void zzv(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzc.zzf(zza, iObjectWrapper);
        zzc(24, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final void zzw(float f11) {
        Parcel zza = zza();
        zza.writeFloat(f11);
        zzc(17, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final void zzx(boolean z11) {
        Parcel zza = zza();
        zzc.zzc(zza, z11);
        zzc(15, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final void zzy(float f11) {
        Parcel zza = zza();
        zza.writeFloat(f11);
        zzc(13, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public final boolean zzz(zzo zzoVar) {
        Parcel zza = zza();
        zzc.zzf(zza, zzoVar);
        Parcel zzH = zzH(19, zza);
        boolean zzg = zzc.zzg(zzH);
        zzH.recycle();
        return zzg;
    }
}