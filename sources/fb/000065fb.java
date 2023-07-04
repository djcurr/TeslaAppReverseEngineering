package dk;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import lh.b;
import lh.c;

/* loaded from: classes3.dex */
public interface a extends IInterface {

    /* renamed from: dk.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static abstract class AbstractBinderC0459a extends b implements a {

        /* renamed from: dk.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0460a extends lh.a implements a {
            C0460a(IBinder iBinder) {
                super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            }

            @Override // dk.a
            public final Bundle a(Bundle bundle) {
                Parcel J = J();
                c.b(J, bundle);
                Parcel K = K(J);
                Bundle bundle2 = (Bundle) c.a(K, Bundle.CREATOR);
                K.recycle();
                return bundle2;
            }
        }

        public static a J(IBinder iBinder) {
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                if (queryLocalInterface instanceof a) {
                    return (a) queryLocalInterface;
                }
                return new C0460a(iBinder);
            }
            return null;
        }
    }

    Bundle a(Bundle bundle);
}