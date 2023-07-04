package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzj extends zza implements zzl {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final boolean zzA() {
        Parcel zzH = zzH(16, zza());
        boolean zzg = zzc.zzg(zzH);
        zzH.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final double zzd() {
        Parcel zzH = zzH(6, zza());
        double readDouble = zzH.readDouble();
        zzH.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final float zze() {
        Parcel zzH = zzH(8, zza());
        float readFloat = zzH.readFloat();
        zzH.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final float zzf() {
        Parcel zzH = zzH(14, zza());
        float readFloat = zzH.readFloat();
        zzH.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final int zzg() {
        Parcel zzH = zzH(12, zza());
        int readInt = zzH.readInt();
        zzH.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final int zzh() {
        Parcel zzH = zzH(10, zza());
        int readInt = zzH.readInt();
        zzH.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final int zzi() {
        Parcel zzH = zzH(18, zza());
        int readInt = zzH.readInt();
        zzH.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final IObjectWrapper zzj() {
        Parcel zzH = zzH(24, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzH.readStrongBinder());
        zzH.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final LatLng zzk() {
        Parcel zzH = zzH(4, zza());
        LatLng latLng = (LatLng) zzc.zza(zzH, LatLng.CREATOR);
        zzH.recycle();
        return latLng;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final String zzl() {
        Parcel zzH = zzH(2, zza());
        String readString = zzH.readString();
        zzH.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final List<PatternItem> zzm() {
        Parcel zzH = zzH(22, zza());
        ArrayList createTypedArrayList = zzH.createTypedArrayList(PatternItem.CREATOR);
        zzH.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzn() {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzo(LatLng latLng) {
        Parcel zza = zza();
        zzc.zzd(zza, latLng);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzp(boolean z11) {
        Parcel zza = zza();
        zzc.zzc(zza, z11);
        zzc(19, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzq(int i11) {
        Parcel zza = zza();
        zza.writeInt(i11);
        zzc(11, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzr(double d11) {
        Parcel zza = zza();
        zza.writeDouble(d11);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzs(int i11) {
        Parcel zza = zza();
        zza.writeInt(i11);
        zzc(9, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzt(List<PatternItem> list) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzc(21, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzu(float f11) {
        Parcel zza = zza();
        zza.writeFloat(f11);
        zzc(7, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzv(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzc.zzf(zza, iObjectWrapper);
        zzc(23, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzw(boolean z11) {
        Parcel zza = zza();
        zzc.zzc(zza, z11);
        zzc(15, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzx(float f11) {
        Parcel zza = zza();
        zza.writeFloat(f11);
        zzc(13, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final boolean zzy(zzl zzlVar) {
        Parcel zza = zza();
        zzc.zzf(zza, zzlVar);
        Parcel zzH = zzH(17, zza);
        boolean zzg = zzc.zzg(zzH);
        zzH.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final boolean zzz() {
        Parcel zzH = zzH(20, zza());
        boolean zzg = zzc.zzg(zzH);
        zzH.recycle();
        return zzg;
    }
}