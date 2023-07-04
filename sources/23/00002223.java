package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes3.dex */
public final class zzv extends zza implements zzx {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzA(float f11) {
        Parcel zza = zza();
        zza.writeFloat(f11);
        zzc(27, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzB() {
        zzc(11, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final boolean zzC(zzx zzxVar) {
        Parcel zza = zza();
        zzc.zzf(zza, zzxVar);
        Parcel zzH = zzH(16, zza);
        boolean zzg = zzc.zzg(zzH);
        zzH.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final boolean zzD() {
        Parcel zzH = zzH(10, zza());
        boolean zzg = zzc.zzg(zzH);
        zzH.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final boolean zzE() {
        Parcel zzH = zzH(21, zza());
        boolean zzg = zzc.zzg(zzH);
        zzH.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final boolean zzF() {
        Parcel zzH = zzH(13, zza());
        boolean zzg = zzc.zzg(zzH);
        zzH.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final boolean zzG() {
        Parcel zzH = zzH(15, zza());
        boolean zzg = zzc.zzg(zzH);
        zzH.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final float zzd() {
        Parcel zzH = zzH(26, zza());
        float readFloat = zzH.readFloat();
        zzH.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final float zze() {
        Parcel zzH = zzH(23, zza());
        float readFloat = zzH.readFloat();
        zzH.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final float zzf() {
        Parcel zzH = zzH(28, zza());
        float readFloat = zzH.readFloat();
        zzH.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final int zzg() {
        Parcel zzH = zzH(17, zza());
        int readInt = zzH.readInt();
        zzH.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final IObjectWrapper zzh() {
        Parcel zzH = zzH(30, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzH.readStrongBinder());
        zzH.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final LatLng zzi() {
        Parcel zzH = zzH(4, zza());
        LatLng latLng = (LatLng) zzc.zza(zzH, LatLng.CREATOR);
        zzH.recycle();
        return latLng;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final String zzj() {
        Parcel zzH = zzH(2, zza());
        String readString = zzH.readString();
        zzH.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final String zzk() {
        Parcel zzH = zzH(8, zza());
        String readString = zzH.readString();
        zzH.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final String zzl() {
        Parcel zzH = zzH(6, zza());
        String readString = zzH.readString();
        zzH.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzm() {
        zzc(12, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzn() {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzo(float f11) {
        Parcel zza = zza();
        zza.writeFloat(f11);
        zzc(25, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzp(float f11, float f12) {
        Parcel zza = zza();
        zza.writeFloat(f11);
        zza.writeFloat(f12);
        zzc(19, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzq(boolean z11) {
        Parcel zza = zza();
        zzc.zzc(zza, z11);
        zzc(9, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzr(boolean z11) {
        Parcel zza = zza();
        zzc.zzc(zza, z11);
        zzc(20, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzs(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzc.zzf(zza, iObjectWrapper);
        zzc(18, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzt(float f11, float f12) {
        Parcel zza = zza();
        zza.writeFloat(f11);
        zza.writeFloat(f12);
        zzc(24, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzu(LatLng latLng) {
        Parcel zza = zza();
        zzc.zzd(zza, latLng);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzv(float f11) {
        Parcel zza = zza();
        zza.writeFloat(f11);
        zzc(22, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzw(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzc(7, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzx(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzc.zzf(zza, iObjectWrapper);
        zzc(29, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzy(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzz(boolean z11) {
        Parcel zza = zza();
        zzc.zzc(zza, z11);
        zzc(14, zza);
    }
}