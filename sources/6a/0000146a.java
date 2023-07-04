package com.android.vending.licensing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: com.android.vending.licensing.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0195a extends Binder implements a {
        public AbstractBinderC0195a() {
            attachInterface(this, "com.android.vending.licensing.ILicenseResultListener");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
            if (i11 == 1) {
                parcel.enforceInterface("com.android.vending.licensing.ILicenseResultListener");
                o(parcel.readInt(), parcel.readString(), parcel.readString());
                return true;
            } else if (i11 != 1598968902) {
                return super.onTransact(i11, parcel, parcel2, i12);
            } else {
                parcel2.writeString("com.android.vending.licensing.ILicenseResultListener");
                return true;
            }
        }
    }

    void o(int i11, String str, String str2);
}