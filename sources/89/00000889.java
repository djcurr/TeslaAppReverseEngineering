package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface t extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements t {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: androidx.room.t$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0097a implements t {

            /* renamed from: b  reason: collision with root package name */
            public static t f5830b;

            /* renamed from: a  reason: collision with root package name */
            private IBinder f5831a;

            C0097a(IBinder iBinder) {
                this.f5831a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5831a;
            }

            @Override // androidx.room.t
            public void b(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    if (this.f5831a.transact(1, obtain, null, 1) || a.K() == null) {
                        return;
                    }
                    a.K().b(strArr);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        public static t J(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof t)) {
                return (t) queryLocalInterface;
            }
            return new C0097a(iBinder);
        }

        public static t K() {
            return C0097a.f5830b;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
            if (i11 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
                b(parcel.createStringArray());
                return true;
            } else if (i11 != 1598968902) {
                return super.onTransact(i11, parcel, parcel2, i12);
            } else {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                return true;
            }
        }
    }

    void b(String[] strArr);
}