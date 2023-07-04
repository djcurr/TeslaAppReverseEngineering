package a6;

import a6.b;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: b */
    private final a f286b;

    /* renamed from: c */
    private final ConnectivityManager f287c;

    /* renamed from: d */
    private final b.InterfaceC0011b f288d;

    /* loaded from: classes.dex */
    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
            d.this = r1;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            s.g(network, "network");
            d.this.d(network, true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            s.g(network, "network");
            d.this.d(network, false);
        }
    }

    public d(ConnectivityManager connectivityManager, b.InterfaceC0011b listener) {
        s.g(connectivityManager, "connectivityManager");
        s.g(listener, "listener");
        this.f287c = connectivityManager;
        this.f288d = listener;
        a aVar = new a();
        this.f286b = aVar;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), aVar);
    }

    private final boolean c(Network network) {
        NetworkCapabilities networkCapabilities = this.f287c.getNetworkCapabilities(network);
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    public final void d(Network network, boolean z11) {
        boolean c11;
        Network[] allNetworks = this.f287c.getAllNetworks();
        s.f(allNetworks, "connectivityManager.allNetworks");
        int length = allNetworks.length;
        boolean z12 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            Network it2 = allNetworks[i11];
            if (s.c(it2, network)) {
                c11 = z11;
            } else {
                s.f(it2, "it");
                c11 = c(it2);
            }
            if (c11) {
                z12 = true;
                break;
            }
            i11++;
        }
        this.f288d.a(z12);
    }

    @Override // a6.b
    public boolean a() {
        Network[] allNetworks = this.f287c.getAllNetworks();
        s.f(allNetworks, "connectivityManager.allNetworks");
        for (Network it2 : allNetworks) {
            s.f(it2, "it");
            if (c(it2)) {
                return true;
            }
        }
        return false;
    }

    @Override // a6.b
    public void shutdown() {
        this.f287c.unregisterNetworkCallback(this.f286b);
    }
}