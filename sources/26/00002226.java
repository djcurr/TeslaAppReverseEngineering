package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzy extends zza implements zzaa {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolygonDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzA(float f11) {
        Parcel zza = zza();
        zza.writeFloat(f11);
        zzc(13, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final boolean zzB(zzaa zzaaVar) {
        Parcel zza = zza();
        zzc.zzf(zza, zzaaVar);
        Parcel zzH = zzH(19, zza);
        boolean zzg = zzc.zzg(zzH);
        zzH.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final boolean zzC() {
        Parcel zzH = zzH(22, zza());
        boolean zzg = zzc.zzg(zzH);
        zzH.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final boolean zzD() {
        Parcel zzH = zzH(18, zza());
        boolean zzg = zzc.zzg(zzH);
        zzH.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final boolean zzE() {
        Parcel zzH = zzH(16, zza());
        boolean zzg = zzc.zzg(zzH);
        zzH.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final float zzd() {
        Parcel zzH = zzH(8, zza());
        float readFloat = zzH.readFloat();
        zzH.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final float zze() {
        Parcel zzH = zzH(14, zza());
        float readFloat = zzH.readFloat();
        zzH.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final int zzf() {
        Parcel zzH = zzH(12, zza());
        int readInt = zzH.readInt();
        zzH.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final int zzg() {
        Parcel zzH = zzH(10, zza());
        int readInt = zzH.readInt();
        zzH.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final int zzh() {
        Parcel zzH = zzH(24, zza());
        int readInt = zzH.readInt();
        zzH.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final int zzi() {
        Parcel zzH = zzH(20, zza());
        int readInt = zzH.readInt();
        zzH.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final IObjectWrapper zzj() {
        Parcel zzH = zzH(28, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzH.readStrongBinder());
        zzH.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final String zzk() {
        Parcel zzH = zzH(2, zza());
        String readString = zzH.readString();
        zzH.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final List zzl() {
        Parcel zzH = zzH(6, zza());
        ArrayList zzb = zzc.zzb(zzH);
        zzH.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final List<LatLng> zzm() {
        Parcel zzH = zzH(4, zza());
        ArrayList createTypedArrayList = zzH.createTypedArrayList(LatLng.CREATOR);
        zzH.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final List<PatternItem> zzn() {
        Parcel zzH = zzH(26, zza());
        ArrayList createTypedArrayList = zzH.createTypedArrayList(PatternItem.CREATOR);
        zzH.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzo() {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzp(boolean z11) {
        Parcel zza = zza();
        zzc.zzc(zza, z11);
        zzc(21, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzq(int i11) {
        Parcel zza = zza();
        zza.writeInt(i11);
        zzc(11, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzr(boolean z11) {
        Parcel zza = zza();
        zzc.zzc(zza, z11);
        zzc(17, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzs(List list) {
        Parcel zza = zza();
        zza.writeList(list);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzt(List<LatLng> list) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzu(int i11) {
        Parcel zza = zza();
        zza.writeInt(i11);
        zzc(9, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzv(int i11) {
        Parcel zza = zza();
        zza.writeInt(i11);
        zzc(23, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzw(List<PatternItem> list) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzc(25, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzx(float f11) {
        Parcel zza = zza();
        zza.writeFloat(f11);
        zzc(7, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzy(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzc.zzf(zza, iObjectWrapper);
        zzc(27, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzz(boolean z11) {
        Parcel zza = zza();
        zzc.zzc(zza, z11);
        zzc(15, zza);
    }
}