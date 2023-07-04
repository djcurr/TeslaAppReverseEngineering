package com.reactnativecommunity.netinfo;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import com.facebook.react.bridge.ReactApplicationContext;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class d extends c {

    /* renamed from: i  reason: collision with root package name */
    private final b f20110i;

    /* renamed from: j  reason: collision with root package name */
    Network f20111j;

    /* renamed from: k  reason: collision with root package name */
    NetworkCapabilities f20112k;

    /* loaded from: classes2.dex */
    private class b extends ConnectivityManager.NetworkCallback {
        private b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            d dVar = d.this;
            dVar.f20111j = network;
            dVar.f20112k = dVar.c().getNetworkCapabilities(network);
            d.this.k();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            d dVar = d.this;
            dVar.f20111j = network;
            dVar.f20112k = networkCapabilities;
            dVar.k();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            d dVar = d.this;
            if (dVar.f20111j != null) {
                dVar.f20111j = network;
                dVar.f20112k = dVar.c().getNetworkCapabilities(network);
            }
            d.this.k();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLosing(Network network, int i11) {
            d dVar = d.this;
            dVar.f20111j = network;
            dVar.f20112k = dVar.c().getNetworkCapabilities(network);
            d.this.k();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            d dVar = d.this;
            dVar.f20111j = null;
            dVar.f20112k = null;
            dVar.k();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            d dVar = d.this;
            dVar.f20111j = null;
            dVar.f20112k = null;
            dVar.k();
        }
    }

    public d(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.f20111j = null;
        this.f20112k = null;
        this.f20110i = new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.reactnativecommunity.netinfo.c
    public void f() {
        try {
            c().registerNetworkCallback(new NetworkRequest.Builder().build(), this.f20110i);
        } catch (SecurityException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.reactnativecommunity.netinfo.c
    public void i() {
        try {
            c().unregisterNetworkCallback(this.f20110i);
        } catch (IllegalArgumentException | SecurityException unused) {
        }
    }

    void k() {
        boolean z11;
        wq.b bVar = wq.b.UNKNOWN;
        NetworkCapabilities networkCapabilities = this.f20112k;
        wq.a aVar = null;
        boolean z12 = false;
        if (networkCapabilities != null) {
            if (networkCapabilities.hasTransport(2)) {
                bVar = wq.b.BLUETOOTH;
            } else if (this.f20112k.hasTransport(0)) {
                bVar = wq.b.CELLULAR;
            } else if (this.f20112k.hasTransport(3)) {
                bVar = wq.b.ETHERNET;
            } else if (this.f20112k.hasTransport(1)) {
                bVar = wq.b.WIFI;
            } else if (this.f20112k.hasTransport(4)) {
                bVar = wq.b.VPN;
            }
            NetworkInfo networkInfo = this.f20111j != null ? c().getNetworkInfo(this.f20111j) : null;
            if (Build.VERSION.SDK_INT >= 28) {
                z11 = !this.f20112k.hasCapability(21);
            } else {
                z11 = (this.f20111j == null || networkInfo == null || networkInfo.getDetailedState().equals(NetworkInfo.DetailedState.CONNECTED)) ? false : true;
            }
            if (this.f20112k.hasCapability(12) && this.f20112k.hasCapability(16) && !z11) {
                z12 = true;
            }
            if (this.f20111j != null && bVar == wq.b.CELLULAR && z12) {
                aVar = wq.a.fromNetworkInfo(networkInfo);
            }
        } else {
            bVar = wq.b.NONE;
        }
        j(bVar, aVar, z12);
    }
}