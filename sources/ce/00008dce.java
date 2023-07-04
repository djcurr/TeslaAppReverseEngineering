package o8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class b implements m8.a {

    /* renamed from: o8.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class ServiceConnectionC0837b implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        public boolean f42314a;

        /* renamed from: b  reason: collision with root package name */
        public final LinkedBlockingQueue<IBinder> f42315b;

        public ServiceConnectionC0837b() {
            this.f42314a = false;
            this.f42315b = new LinkedBlockingQueue<>();
        }

        public IBinder a() {
            if (!this.f42314a) {
                this.f42314a = true;
                return this.f42315b.poll(5L, TimeUnit.SECONDS);
            }
            throw new IllegalStateException();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f42315b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements IInterface {

        /* renamed from: a  reason: collision with root package name */
        public IBinder f42316a;

        public c(IBinder iBinder) {
            this.f42316a = iBinder;
        }

        public String J() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                this.f42316a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f42316a;
        }
    }

    @Override // m8.a
    public String a(Context context) {
        ServiceConnectionC0837b serviceConnectionC0837b = new ServiceConnectionC0837b();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        if (context.bindService(intent, serviceConnectionC0837b, 1)) {
            try {
                return new c(serviceConnectionC0837b.a()).J();
            } catch (Exception unused) {
            } finally {
                context.unbindService(serviceConnectionC0837b);
            }
        }
        return null;
    }
}