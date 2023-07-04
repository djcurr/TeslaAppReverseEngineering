package com.google.android.gms.maps.internal;

import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class zzaa extends com.google.android.gms.internal.maps.zzb implements zzab {
    public zzaa() {
        super("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            zzb();
        } else if (i11 != 2) {
            return false;
        } else {
            zzc(com.google.android.gms.internal.maps.zzq.zzb(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}