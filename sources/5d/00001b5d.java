package com.google.android.exoplayer2;

import android.content.Context;
import android.net.wifi.WifiManager;

/* loaded from: classes3.dex */
final class b1 {

    /* renamed from: a  reason: collision with root package name */
    private final WifiManager f13218a;

    /* renamed from: b  reason: collision with root package name */
    private WifiManager.WifiLock f13219b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f13220c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f13221d;

    public b1(Context context) {
        this.f13218a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    private void c() {
        WifiManager.WifiLock wifiLock = this.f13219b;
        if (wifiLock == null) {
            return;
        }
        if (this.f13220c && this.f13221d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    public void a(boolean z11) {
        if (z11 && this.f13219b == null) {
            WifiManager wifiManager = this.f13218a;
            if (wifiManager == null) {
                ak.o.h("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            }
            WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
            this.f13219b = createWifiLock;
            createWifiLock.setReferenceCounted(false);
        }
        this.f13220c = z11;
        c();
    }

    public void b(boolean z11) {
        this.f13221d = z11;
        c();
    }
}