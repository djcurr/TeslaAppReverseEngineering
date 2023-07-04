package com.wix.reactnativenotifications.core.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import androidx.core.app.m;
import com.tesla.logging.g;
import lw.b;
import lw.d;
import lw.e;
import lw.f;

/* loaded from: classes6.dex */
public class b implements IPushNotification {

    /* renamed from: h  reason: collision with root package name */
    private static final g f22941h;

    /* renamed from: i  reason: collision with root package name */
    private static final g f22942i;

    /* renamed from: j  reason: collision with root package name */
    private static final g f22943j;

    /* renamed from: k  reason: collision with root package name */
    private static dt.a f22944k;

    /* renamed from: a  reason: collision with root package name */
    protected final Context f22945a;

    /* renamed from: b  reason: collision with root package name */
    protected final lw.b f22946b;

    /* renamed from: c  reason: collision with root package name */
    protected final lw.a f22947c;

    /* renamed from: d  reason: collision with root package name */
    protected final e f22948d;

    /* renamed from: e  reason: collision with root package name */
    protected final c f22949e;

    /* renamed from: f  reason: collision with root package name */
    private final mw.e f22950f;

    /* renamed from: g  reason: collision with root package name */
    protected final b.a f22951g = new a();

    /* loaded from: classes6.dex */
    class a implements b.a {
        a() {
        }

        @Override // lw.b.a
        public void a() {
            b.this.f22946b.c(this);
            b.this.h();
        }

        @Override // lw.b.a
        public void b() {
        }
    }

    static {
        g g11 = g.g("ReactNativeNotifs");
        f22941h = g11;
        f22942i = g11.n("onReceived");
        f22943j = g11.n("notifyOwnerApi");
        f22944k = null;
    }

    protected b(Context context, Bundle bundle, lw.b bVar, lw.a aVar, e eVar) {
        this.f22945a = context;
        this.f22946b = bVar;
        this.f22947c = aVar;
        this.f22948d = eVar;
        this.f22949e = f(bundle);
        this.f22950f = mw.e.a(bundle, Boolean.valueOf(bVar.f()));
    }

    public static IPushNotification j(Context context, Bundle bundle) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof mw.b) {
            return ((mw.b) applicationContext).a(context, bundle, lw.c.a(), new lw.a());
        }
        return new b(context, bundle, lw.c.a(), new lw.a(), new e());
    }

    public static void l(dt.a aVar) {
        f22944k = aVar;
    }

    private void n() {
        Bundle bundle = new Bundle();
        bundle.putBundle("notification", this.f22949e.a());
        this.f22948d.b("notificationOpened", bundle, this.f22946b.d());
    }

    private void o(com.wix.reactnativenotifications.core.notification.a aVar) {
        mw.e eVar = this.f22950f;
        if (eVar == null) {
            f22943j.i("not notifying OAPI, data is null");
        } else if (!eVar.b()) {
            f22943j.i("not notifying OAPI, data does not require confirmation");
        } else {
            g gVar = f22943j;
            gVar.i("notifying OAPI with data `" + this.f22950f.toString() + "` of type `" + aVar + "`");
            ow.b.d(this.f22950f, this.f22945a, aVar);
        }
    }

    private void p() {
        this.f22948d.b("notificationReceivedBackground", this.f22949e.a(), this.f22946b.d());
    }

    private void q() {
        this.f22948d.b("notificationReceived", this.f22949e.a(), this.f22946b.d());
    }

    @Override // com.wix.reactnativenotifications.core.notification.IPushNotification
    public void a() {
        g gVar = f22942i;
        gVar.i(this.f22949e.toString());
        boolean f11 = this.f22946b.f();
        gVar.i("app is visible `" + f11 + "`");
        if (f11) {
            q();
        } else {
            if (!this.f22949e.f22953a.getBoolean("com.tesla.TeslaV4.key-notification-push", false)) {
                s(null);
            }
            p();
        }
        o(com.wix.reactnativenotifications.core.notification.a.RECEIVE);
    }

    @Override // com.wix.reactnativenotifications.core.notification.IPushNotification
    public int b(Integer num) {
        return s(num);
    }

    @Override // com.wix.reactnativenotifications.core.notification.IPushNotification
    public void c() {
        g();
        o(com.wix.reactnativenotifications.core.notification.a.OPEN);
    }

    protected dt.b d(PendingIntent pendingIntent) {
        return f22944k.a(this.f22945a, this.f22949e.f22953a, pendingIntent);
    }

    protected int e(Notification notification) {
        return (int) System.nanoTime();
    }

    protected c f(Bundle bundle) {
        return new c(bundle);
    }

    protected void g() {
        if (!this.f22946b.a()) {
            u();
            m();
            return;
        }
        if (this.f22946b.d().getCurrentActivity() == null) {
            u();
        }
        if (this.f22946b.f()) {
            h();
        } else if (this.f22946b.b()) {
            m();
        } else {
            i();
        }
    }

    protected void h() {
        n();
    }

    protected void i() {
        this.f22946b.e(k());
        m();
    }

    protected b.a k() {
        return this.f22951g;
    }

    protected void m() {
        this.f22945a.startActivity(this.f22947c.a(this.f22945a));
    }

    protected int r(Notification notification, Integer num) {
        int intValue = num != null ? num.intValue() : e(notification);
        t(intValue, notification);
        return intValue;
    }

    protected int s(Integer num) {
        dt.b d11 = d(f.b(this.f22945a, this.f22949e));
        return r(d11.b(), Integer.valueOf(d11.a()));
    }

    protected void t(int i11, Notification notification) {
        m.e(this.f22945a).g(i11, notification);
    }

    protected void u() {
        d.c().d(this.f22949e);
    }
}