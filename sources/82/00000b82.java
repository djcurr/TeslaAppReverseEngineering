package b;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0133a extends Binder implements a {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0134a implements a {

            /* renamed from: b  reason: collision with root package name */
            public static a f7147b;

            /* renamed from: a  reason: collision with root package name */
            private IBinder f7148a;

            C0134a(IBinder iBinder) {
                this.f7148a = iBinder;
            }

            @Override // b.a
            public void F(String str, int i11, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i11);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f7148a.transact(1, obtain, null, 1) || AbstractBinderC0133a.K() == null) {
                        return;
                    }
                    AbstractBinderC0133a.K().F(str, i11, str2, notification);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f7148a;
            }

            @Override // b.a
            public void d(String str, int i11, String str2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i11);
                    obtain.writeString(str2);
                    if (this.f7148a.transact(2, obtain, null, 1) || AbstractBinderC0133a.K() == null) {
                        return;
                    }
                    AbstractBinderC0133a.K().d(str, i11, str2);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // b.a
            public void t(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    if (this.f7148a.transact(3, obtain, null, 1) || AbstractBinderC0133a.K() == null) {
                        return;
                    }
                    AbstractBinderC0133a.K().t(str);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static a J(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            return new C0134a(iBinder);
        }

        public static a K() {
            return C0134a.f7147b;
        }
    }

    void F(String str, int i11, String str2, Notification notification);

    void d(String str, int i11, String str2);

    void t(String str);
}