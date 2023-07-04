package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public class zzbn extends Binder implements IInterface {
    /* JADX INFO: Access modifiers changed from: protected */
    public zzbn(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 > 16777215) {
            if (super.onTransact(i11, parcel, parcel2, i12)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return zza(i11, parcel, parcel2, i12);
    }

    protected boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        throw null;
    }
}