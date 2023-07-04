package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzab extends zza implements zzad {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzab(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolylineDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final void zzA(float f11) {
        Parcel zza = zza();
        zza.writeFloat(f11);
        zzc(9, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final boolean zzB(zzad zzadVar) {
        Parcel zza = zza();
        zzc.zzf(zza, zzadVar);
        Parcel zzH = zzH(15, zza);
        boolean zzg = zzc.zzg(zzH);
        zzH.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final boolean zzC() {
        Parcel zzH = zzH(18, zza());
        boolean zzg = zzc.zzg(zzH);
        zzH.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final boolean zzD() {
        Parcel zzH = zzH(14, zza());
        boolean zzg = zzc.zzg(zzH);
        zzH.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final boolean zzE() {
        Parcel zzH = zzH(12, zza());
        boolean zzg = zzc.zzg(zzH);
        zzH.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final float zzd() {
        Parcel zzH = zzH(6, zza());
        float readFloat = zzH.readFloat();
        zzH.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final float zze() {
        Parcel zzH = zzH(10, zza());
        float readFloat = zzH.readFloat();
        zzH.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final int zzf() {
        Parcel zzH = zzH(8, zza());
        int readInt = zzH.readInt();
        zzH.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final int zzg() {
        Parcel zzH = zzH(24, zza());
        int readInt = zzH.readInt();
        zzH.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final int zzh() {
        Parcel zzH = zzH(16, zza());
        int readInt = zzH.readInt();
        zzH.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final IObjectWrapper zzi() {
        Parcel zzH = zzH(28, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzH.readStrongBinder());
        zzH.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final Cap zzj() {
        Parcel zzH = zzH(22, zza());
        Cap cap = (Cap) zzc.zza(zzH, Cap.CREATOR);
        zzH.recycle();
        return cap;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final Cap zzk() {
        Parcel zzH = zzH(20, zza());
        Cap cap = (Cap) zzc.zza(zzH, Cap.CREATOR);
        zzH.recycle();
        return cap;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final String zzl() {
        Parcel zzH = zzH(2, zza());
        String readString = zzH.readString();
        zzH.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final List<PatternItem> zzm() {
        Parcel zzH = zzH(26, zza());
        ArrayList createTypedArrayList = zzH.createTypedArrayList(PatternItem.CREATOR);
        zzH.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final List<LatLng> zzn() {
        Parcel zzH = zzH(4, zza());
        ArrayList createTypedArrayList = zzH.createTypedArrayList(LatLng.CREATOR);
        zzH.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final void zzo() {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final void zzp(boolean z11) {
        Parcel zza = zza();
        zzc.zzc(zza, z11);
        zzc(17, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final void zzq(int i11) {
        Parcel zza = zza();
        zza.writeInt(i11);
        zzc(7, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final void zzr(Cap cap) {
        Parcel zza = zza();
        zzc.zzd(zza, cap);
        zzc(21, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final void zzs(boolean z11) {
        Parcel zza = zza();
        zzc.zzc(zza, z11);
        zzc(13, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final void zzt(int i11) {
        Parcel zza = zza();
        zza.writeInt(i11);
        zzc(23, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final void zzu(List<PatternItem> list) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzc(25, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final void zzv(List<LatLng> list) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final void zzw(Cap cap) {
        Parcel zza = zza();
        zzc.zzd(zza, cap);
        zzc(19, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final void zzx(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzc.zzf(zza, iObjectWrapper);
        zzc(27, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final void zzy(boolean z11) {
        Parcel zza = zza();
        zzc.zzc(zza, z11);
        zzc(11, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final void zzz(float f11) {
        Parcel zza = zza();
        zza.writeFloat(f11);
        zzc(5, zza);
    }
}