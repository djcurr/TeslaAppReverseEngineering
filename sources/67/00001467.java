package com.android.vending.licensing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface ILicensingService extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements ILicensingService {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.android.vending.licensing.ILicensingService$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0194a implements ILicensingService {

            /* renamed from: b  reason: collision with root package name */
            public static ILicensingService f10246b;

            /* renamed from: a  reason: collision with root package name */
            private IBinder f10247a;

            C0194a(IBinder iBinder) {
                this.f10247a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f10247a;
            }

            @Override // com.android.vending.licensing.ILicensingService
            public void m(long j11, String str, com.android.vending.licensing.a aVar) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.licensing.ILicensingService");
                    obtain.writeLong(j11);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (this.f10247a.transact(1, obtain, null, 1) || a.K() == null) {
                        return;
                    }
                    a.K().m(j11, str, aVar);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static ILicensingService J(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.licensing.ILicensingService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof ILicensingService)) {
                return (ILicensingService) queryLocalInterface;
            }
            return new C0194a(iBinder);
        }

        public static ILicensingService K() {
            return C0194a.f10246b;
        }
    }

    void m(long j11, String str, com.android.vending.licensing.a aVar);
}