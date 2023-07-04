package com.reactnativecommunity.netinfo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import ch.qos.logback.core.spi.AbstractComponentTracker;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    private final Context f20090b;

    /* renamed from: c  reason: collision with root package name */
    private final b f20091c;

    /* renamed from: e  reason: collision with root package name */
    private Handler f20093e;

    /* renamed from: a  reason: collision with root package name */
    private final d f20089a = new d();

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f20092d = new c();

    /* renamed from: f  reason: collision with root package name */
    private boolean f20094f = false;

    /* loaded from: classes2.dex */
    public interface b {
        void onAmazonFireDeviceConnectivityChanged(boolean z11);
    }

    /* loaded from: classes2.dex */
    private class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f20094f) {
                a.this.f20090b.sendBroadcast(new Intent("com.amazon.tv.networkmonitor.CONNECTIVITY_CHECK"));
                a.this.f20093e.postDelayed(a.this.f20092d, AbstractComponentTracker.LINGERING_TIMEOUT);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class d extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        boolean f20096a;

        /* renamed from: b  reason: collision with root package name */
        private Boolean f20097b;

        private d() {
            this.f20096a = false;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z11;
            String action = intent == null ? null : intent.getAction();
            if ("com.amazon.tv.networkmonitor.INTERNET_DOWN".equals(action)) {
                z11 = false;
            } else if (!"com.amazon.tv.networkmonitor.INTERNET_UP".equals(action)) {
                return;
            } else {
                z11 = true;
            }
            Boolean bool = this.f20097b;
            if (bool == null || bool.booleanValue() != z11) {
                this.f20097b = Boolean.valueOf(z11);
                a.this.f20091c.onAmazonFireDeviceConnectivityChanged(z11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context, b bVar) {
        this.f20090b = context;
        this.f20091c = bVar;
    }

    private boolean f() {
        if (Build.MANUFACTURER.equals("Amazon")) {
            String str = Build.MODEL;
            if (str.startsWith("AF") || str.startsWith("KF")) {
                return true;
            }
        }
        return false;
    }

    private void h() {
        if (this.f20089a.f20096a) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.amazon.tv.networkmonitor.INTERNET_DOWN");
        intentFilter.addAction("com.amazon.tv.networkmonitor.INTERNET_UP");
        this.f20090b.registerReceiver(this.f20089a, intentFilter);
        this.f20089a.f20096a = true;
    }

    private void i() {
        if (this.f20094f) {
            return;
        }
        Handler handler = new Handler();
        this.f20093e = handler;
        this.f20094f = true;
        handler.post(this.f20092d);
    }

    private void j() {
        if (this.f20094f) {
            this.f20094f = false;
            this.f20093e.removeCallbacksAndMessages(null);
            this.f20093e = null;
        }
    }

    private void l() {
        d dVar = this.f20089a;
        if (dVar.f20096a) {
            this.f20090b.unregisterReceiver(dVar);
            this.f20089a.f20096a = false;
        }
    }

    public void g() {
        if (f()) {
            h();
            i();
        }
    }

    public void k() {
        if (f()) {
            j();
            l();
        }
    }
}