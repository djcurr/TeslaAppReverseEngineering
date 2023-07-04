package com.google.android.gms.internal.vision;

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
    public IBinder asBinder() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel obtainAndWriteInterfaceToken() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zzb);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel zza(int i11, Parcel parcel) {
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
    public final void zzb(int i11, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.zza.transact(i11, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}