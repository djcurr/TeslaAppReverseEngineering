package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class zzab extends com.google.android.gms.internal.common.zzb implements IGmsCallbacks {
    public zzab() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.internal.common.zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            com.google.android.gms.internal.common.zzc.zzb(parcel);
            onPostInitComplete(parcel.readInt(), parcel.readStrongBinder(), (Bundle) com.google.android.gms.internal.common.zzc.zza(parcel, Bundle.CREATOR));
        } else if (i11 == 2) {
            com.google.android.gms.internal.common.zzc.zzb(parcel);
            zzb(parcel.readInt(), (Bundle) com.google.android.gms.internal.common.zzc.zza(parcel, Bundle.CREATOR));
        } else if (i11 != 3) {
            return false;
        } else {
            com.google.android.gms.internal.common.zzc.zzb(parcel);
            zzc(parcel.readInt(), parcel.readStrongBinder(), (zzj) com.google.android.gms.internal.common.zzc.zza(parcel, zzj.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}