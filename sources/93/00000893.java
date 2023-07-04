package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.room.t;

/* loaded from: classes.dex */
public interface u extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements u {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: androidx.room.u$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0098a implements u {

            /* renamed from: b  reason: collision with root package name */
            public static u f5858b;

            /* renamed from: a  reason: collision with root package name */
            private IBinder f5859a;

            C0098a(IBinder iBinder) {
                this.f5859a = iBinder;
            }

            @Override // androidx.room.u
            public void H(t tVar, int i11) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(tVar != null ? tVar.asBinder() : null);
                    obtain.writeInt(i11);
                    if (!this.f5859a.transact(2, obtain, obtain2, 0) && a.K() != null) {
                        a.K().H(tVar, i11);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5859a;
            }

            @Override // androidx.room.u
            public void n(int i11, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i11);
                    obtain.writeStringArray(strArr);
                    if (this.f5859a.transact(3, obtain, null, 1) || a.K() == null) {
                        return;
                    }
                    a.K().n(i11, strArr);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.room.u
            public int u(t tVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(tVar != null ? tVar.asBinder() : null);
                    obtain.writeString(str);
                    if (!this.f5859a.transact(1, obtain, obtain2, 0) && a.K() != null) {
                        return a.K().u(tVar, str);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        public static u J(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof u)) {
                return (u) queryLocalInterface;
            }
            return new C0098a(iBinder);
        }

        public static u K() {
            return C0098a.f5858b;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
            if (i11 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                int u11 = u(t.a.J(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(u11);
                return true;
            } else if (i11 == 2) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                H(t.a.J(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i11 == 3) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                n(parcel.readInt(), parcel.createStringArray());
                return true;
            } else if (i11 != 1598968902) {
                return super.onTransact(i11, parcel, parcel2, i12);
            } else {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                return true;
            }
        }
    }

    void H(t tVar, int i11);

    void n(int i11, String[] strArr);

    int u(t tVar, String str);
}