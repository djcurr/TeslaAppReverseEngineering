package com.google.android.gms.maps.internal;

import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class zzau extends com.google.android.gms.internal.maps.zzb implements zzav {
    public zzau() {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            zzd(com.google.android.gms.internal.maps.zzw.zzb(parcel.readStrongBinder()));
        } else if (i11 == 2) {
            zzb(com.google.android.gms.internal.maps.zzw.zzb(parcel.readStrongBinder()));
        } else if (i11 != 3) {
            return false;
        } else {
            zzc(com.google.android.gms.internal.maps.zzw.zzb(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}