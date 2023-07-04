package q9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;
import o9.a;

/* loaded from: classes.dex */
public class a {

    /* renamed from: e  reason: collision with root package name */
    public static String f48033e = "OpenDeviceId library";

    /* renamed from: f  reason: collision with root package name */
    public static boolean f48034f = false;

    /* renamed from: b  reason: collision with root package name */
    public o9.a f48036b;

    /* renamed from: c  reason: collision with root package name */
    public ServiceConnection f48037c;

    /* renamed from: a  reason: collision with root package name */
    public Context f48035a = null;

    /* renamed from: d  reason: collision with root package name */
    public b f48038d = null;

    /* renamed from: q9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class ServiceConnectionC1022a implements ServiceConnection {
        public ServiceConnectionC1022a() {
        }

        @Override // android.content.ServiceConnection
        public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            a.this.f48036b = a.AbstractBinderC0838a.J(iBinder);
            if (a.this.f48038d != null) {
                a.this.f48038d.a("Deviceid Service Connected", a.this);
            }
            a.this.g("Service onServiceConnected");
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            a.this.f48036b = null;
            a.this.g("Service onServiceDisconnected");
        }
    }

    /* loaded from: classes.dex */
    public interface b<T> {
        void a(T t11, a aVar);
    }

    private void d(String str) {
        if (f48034f) {
            Log.e(f48033e, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(String str) {
        if (f48034f) {
            Log.i(f48033e, str);
        }
    }

    public int a(Context context, b<String> bVar) {
        Objects.requireNonNull(context, "Context can not be null.");
        this.f48035a = context;
        this.f48038d = bVar;
        this.f48037c = new ServiceConnectionC1022a();
        Intent intent = new Intent();
        intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
        if (this.f48035a.bindService(intent, this.f48037c, 1)) {
            g("bindService Successful!");
            return 1;
        }
        g("bindService Failed!");
        return -1;
    }

    public String f() {
        if (this.f48035a != null) {
            try {
                o9.a aVar = this.f48036b;
                if (aVar != null) {
                    return aVar.a();
                }
                return null;
            } catch (RemoteException e11) {
                d("getOAID error, RemoteException!");
                e11.printStackTrace();
                return null;
            }
        }
        d("Context is null.");
        throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
    }

    public boolean h() {
        try {
            if (this.f48036b != null) {
                g("Device support opendeviceid");
                return this.f48036b.c();
            }
            return false;
        } catch (RemoteException unused) {
            d("isSupport error, RemoteException!");
            return false;
        }
    }
}