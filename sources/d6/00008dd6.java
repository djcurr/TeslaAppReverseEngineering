package o8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import d9.a;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class g implements m8.a {

    /* loaded from: classes.dex */
    public static final class b implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        public boolean f42321a;

        /* renamed from: b  reason: collision with root package name */
        public final LinkedBlockingQueue<IBinder> f42322b;

        public b() {
            this.f42321a = false;
            this.f42322b = new LinkedBlockingQueue<>();
        }

        public IBinder a() {
            if (!this.f42321a) {
                this.f42321a = true;
                return this.f42322b.poll(5L, TimeUnit.SECONDS);
            }
            throw new IllegalStateException();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f42322b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    @Override // m8.a
    public String a(Context context) {
        b bVar = new b();
        Intent intent = new Intent();
        intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
        if (context.bindService(intent, bVar, 1)) {
            try {
                return a.AbstractBinderC0456a.J(bVar.a()).a();
            } catch (Exception unused) {
            } finally {
                context.unbindService(bVar);
            }
        }
        return null;
    }
}