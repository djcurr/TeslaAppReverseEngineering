package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.z;
import androidx.work.impl.foreground.a;
import androidx.work.q;

/* loaded from: classes.dex */
public class SystemForegroundService extends z implements a.b {

    /* renamed from: f  reason: collision with root package name */
    private static final String f6618f = q.f("SystemFgService");

    /* renamed from: b  reason: collision with root package name */
    private Handler f6619b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6620c;

    /* renamed from: d  reason: collision with root package name */
    androidx.work.impl.foreground.a f6621d;

    /* renamed from: e  reason: collision with root package name */
    NotificationManager f6622e;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f6623a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Notification f6624b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f6625c;

        a(int i11, Notification notification, int i12) {
            this.f6623a = i11;
            this.f6624b = notification;
            this.f6625c = i12;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f6623a, this.f6624b, this.f6625c);
            } else {
                SystemForegroundService.this.startForeground(this.f6623a, this.f6624b);
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f6627a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Notification f6628b;

        b(int i11, Notification notification) {
            this.f6627a = i11;
            this.f6628b = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f6622e.notify(this.f6627a, this.f6628b);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f6630a;

        c(int i11) {
            this.f6630a = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f6622e.cancel(this.f6630a);
        }
    }

    private void e() {
        this.f6619b = new Handler(Looper.getMainLooper());
        this.f6622e = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.f6621d = aVar;
        aVar.m(this);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void a(int i11, Notification notification) {
        this.f6619b.post(new b(i11, notification));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void c(int i11, int i12, Notification notification) {
        this.f6619b.post(new a(i11, notification, i12));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void d(int i11) {
        this.f6619b.post(new c(i11));
    }

    @Override // androidx.lifecycle.z, android.app.Service
    public void onCreate() {
        super.onCreate();
        e();
    }

    @Override // androidx.lifecycle.z, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f6621d.k();
    }

    @Override // androidx.lifecycle.z, android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        super.onStartCommand(intent, i11, i12);
        if (this.f6620c) {
            q.c().d(f6618f, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f6621d.k();
            e();
            this.f6620c = false;
        }
        if (intent != null) {
            this.f6621d.l(intent);
            return 3;
        }
        return 3;
    }

    @Override // androidx.work.impl.foreground.a.b
    public void stop() {
        this.f6620c = true;
        q.c().a(f6618f, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        stopSelf();
    }
}