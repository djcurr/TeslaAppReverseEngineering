package com.reactnativecommunity.netinfo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import com.facebook.react.bridge.ReactApplicationContext;

/* loaded from: classes2.dex */
public class b extends c {

    /* renamed from: i  reason: collision with root package name */
    private final C0353b f20099i;

    /* renamed from: com.reactnativecommunity.netinfo.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private class C0353b extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private boolean f20100a;

        private C0353b() {
            this.f20100a = false;
        }

        public boolean a() {
            return this.f20100a;
        }

        public void b(boolean z11) {
            this.f20100a = z11;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action == null || !action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            b.this.l();
        }
    }

    public b(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.f20099i = new C0353b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        NetworkInfo activeNetworkInfo;
        wq.b bVar = wq.b.UNKNOWN;
        wq.a aVar = null;
        boolean z11 = false;
        try {
            activeNetworkInfo = c().getActiveNetworkInfo();
        } catch (SecurityException unused) {
            bVar = wq.b.UNKNOWN;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z11 = activeNetworkInfo.isConnected();
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1) {
                    bVar = wq.b.WIFI;
                } else if (type != 4) {
                    if (type == 9) {
                        bVar = wq.b.ETHERNET;
                    } else if (type == 17) {
                        bVar = wq.b.VPN;
                    } else if (type == 6) {
                        bVar = wq.b.WIMAX;
                    } else if (type == 7) {
                        bVar = wq.b.BLUETOOTH;
                    }
                }
                j(bVar, aVar, z11);
            }
            bVar = wq.b.CELLULAR;
            aVar = wq.a.fromNetworkInfo(activeNetworkInfo);
            j(bVar, aVar, z11);
        }
        bVar = wq.b.NONE;
        j(bVar, aVar, z11);
    }

    @Override // com.reactnativecommunity.netinfo.c
    public void f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        e().registerReceiver(this.f20099i, intentFilter);
        this.f20099i.b(true);
        l();
    }

    @Override // com.reactnativecommunity.netinfo.c
    public void i() {
        if (this.f20099i.a()) {
            e().unregisterReceiver(this.f20099i);
            this.f20099i.b(false);
        }
    }
}