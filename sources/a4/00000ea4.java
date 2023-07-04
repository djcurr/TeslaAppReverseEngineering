package c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0160a extends Binder implements a {

        /* renamed from: c.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0161a implements a {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f8344a;

            C0161a(IBinder iBinder) {
                this.f8344a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f8344a;
            }
        }

        public AbstractBinderC0160a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        public static a J(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            return new C0161a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
            if (i11 == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                p(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i11 != 1598968902) {
                return super.onTransact(i11, parcel, parcel2, i12);
            } else {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
        }
    }

    void p(int i11, Bundle bundle);
}