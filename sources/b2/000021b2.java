package com.google.android.gms.internal.identity;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class zzf extends zzb implements zzg {
    public zzf() {
        super("com.google.android.gms.identity.intents.internal.IAddressCallbacks");
    }

    @Override // com.google.android.gms.internal.identity.zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 2) {
            zzc(parcel.readInt(), (Bundle) zzc.zza(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}