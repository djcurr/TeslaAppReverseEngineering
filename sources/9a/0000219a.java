package com.google.android.gms.internal.flags;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public class zzb extends Binder implements IInterface {
    private static zzd zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzb(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    protected boolean dispatchTransaction(int i11, Parcel parcel, Parcel parcel2, int i12) {
        return false;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
        boolean z11;
        if (i11 > 16777215) {
            z11 = super.onTransact(i11, parcel, parcel2, i12);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z11 = false;
        }
        if (z11) {
            return true;
        }
        return dispatchTransaction(i11, parcel, parcel2, i12);
    }
}