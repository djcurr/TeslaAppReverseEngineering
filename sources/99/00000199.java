package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface b extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements b {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: android.support.v4.media.session.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0032a implements b {

            /* renamed from: b  reason: collision with root package name */
            public static b f997b;

            /* renamed from: a  reason: collision with root package name */
            private IBinder f998a;

            C0032a(IBinder iBinder) {
                this.f998a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f998a;
            }

            @Override // android.support.v4.media.session.b
            public void r(android.support.v4.media.session.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (!this.f998a.transact(3, obtain, obtain2, 0) && a.K() != null) {
                        a.K().r(aVar);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static b J(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                return (b) queryLocalInterface;
            }
            return new C0032a(iBinder);
        }

        public static b K() {
            return C0032a.f997b;
        }
    }

    void r(android.support.v4.media.session.a aVar);
}