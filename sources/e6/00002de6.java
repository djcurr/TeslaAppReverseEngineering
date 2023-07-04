package com.google.android.gms.maps.internal;

import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;

/* loaded from: classes3.dex */
public abstract class zzm extends com.google.android.gms.internal.maps.zzb implements zzn {
    public zzm() {
        super("com.google.android.gms.maps.internal.IOnCameraChangeListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            zzb((CameraPosition) com.google.android.gms.internal.maps.zzc.zza(parcel, CameraPosition.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}