package lh;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f37181a;

    /* renamed from: b  reason: collision with root package name */
    private final String f37182b;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(IBinder iBinder, String str) {
        this.f37181a = iBinder;
        this.f37182b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel J() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f37182b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel K(Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f37181a.transact(1, parcel, obtain, 0);
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

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f37181a;
    }
}