package com.google.android.gms.internal.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public class zza implements IInterface {
    private final IBinder zza;
    private final String zzb;

    /* JADX INFO: Access modifiers changed from: protected */
    public zza(IBinder iBinder, String str) {
        this.zza = iBinder;
        this.zzb = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel zzB(int i11, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.zza.transact(i11, parcel, obtain, 0);
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
    public final void zzC(int i11, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.zza.transact(1, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzD(int i11, Parcel parcel) {
        try {
            this.zza.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel zza() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zzb);
        return obtain;
    }
}