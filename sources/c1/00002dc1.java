package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class zzba extends com.google.android.gms.internal.maps.zzb implements zzbb {
    public zzba() {
        super("com.google.android.gms.maps.internal.IOnMyLocationClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            zzb((Location) com.google.android.gms.internal.maps.zzc.zza(parcel, Location.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}