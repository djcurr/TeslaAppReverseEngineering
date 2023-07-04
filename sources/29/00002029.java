package com.google.android.gms.internal.base;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public class zaa implements IInterface {
    private final IBinder zaa;
    private final String zab;

    /* JADX INFO: Access modifiers changed from: protected */
    public zaa(IBinder iBinder, String str) {
        this.zaa = iBinder;
        this.zab = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.zaa;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel zaa() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zab);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel zab(int i11, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.zaa.transact(2, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e11) {
                obtain.recycle();
                throw e11;
            }
        } finally {
            parcel.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zac(int i11, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.zaa.transact(i11, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zad(int i11, Parcel parcel) {
        try {
            this.zaa.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}