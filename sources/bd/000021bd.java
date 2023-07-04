package com.google.android.gms.internal.location;

import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class zzah extends zzb implements zzai {
    public zzah() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            zzb((zzaa) zzc.zza(parcel, zzaa.CREATOR));
        } else if (i11 != 2) {
            return false;
        } else {
            zzc();
        }
        return true;
    }
}