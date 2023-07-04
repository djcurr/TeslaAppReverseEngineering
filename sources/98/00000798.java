package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public class z extends Service implements v {

    /* renamed from: a  reason: collision with root package name */
    private final n0 f5233a = new n0(this);

    @Override // androidx.lifecycle.v
    public p getLifecycle() {
        return this.f5233a.a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.f5233a.b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f5233a.c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f5233a.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i11) {
        this.f5233a.e();
        super.onStart(intent, i11);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        return super.onStartCommand(intent, i11, i12);
    }
}