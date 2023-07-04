package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class zzj extends com.google.android.gms.internal.maps.zzb implements ILocationSourceDelegate {
    public zzj() {
        super("com.google.android.gms.maps.internal.ILocationSourceDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        zzaj zzaiVar;
        if (i11 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzaiVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                zzaiVar = queryLocalInterface instanceof zzaj ? (zzaj) queryLocalInterface : new zzai(readStrongBinder);
            }
            activate(zzaiVar);
        } else if (i11 != 2) {
            return false;
        } else {
            deactivate();
        }
        parcel2.writeNoException();
        return true;
    }
}