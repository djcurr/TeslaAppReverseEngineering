package com.google.android.gms.maps.internal;

import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class zzc extends com.google.android.gms.internal.maps.zzb implements zzd {
    public zzc() {
        super("com.google.android.gms.maps.internal.ICancelableCallback");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            zzc();
        } else if (i11 != 2) {
            return false;
        } else {
            zzb();
        }
        parcel2.writeNoException();
        return true;
    }
}