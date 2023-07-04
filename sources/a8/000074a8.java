package i5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.work.q;

/* loaded from: classes.dex */
public class e extends d<g5.b> {

    /* renamed from: j  reason: collision with root package name */
    static final String f29894j = q.f("NetworkStateTracker");

    /* renamed from: g  reason: collision with root package name */
    private final ConnectivityManager f29895g;

    /* renamed from: h  reason: collision with root package name */
    private b f29896h;

    /* renamed from: i  reason: collision with root package name */
    private a f29897i;

    /* loaded from: classes.dex */
    private class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            q.c().a(e.f29894j, "Network broadcast received", new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }
    }

    /* loaded from: classes.dex */
    private class b extends ConnectivityManager.NetworkCallback {
        b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            q.c().a(e.f29894j, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            q.c().a(e.f29894j, "Network connection lost", new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }
    }

    public e(Context context, m5.a aVar) {
        super(context, aVar);
        this.f29895g = (ConnectivityManager) this.f29888b.getSystemService("connectivity");
        if (j()) {
            this.f29896h = new b();
        } else {
            this.f29897i = new a();
        }
    }

    private static boolean j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Override // i5.d
    public void e() {
        if (j()) {
            try {
                q.c().a(f29894j, "Registering network callback", new Throwable[0]);
                this.f29895g.registerDefaultNetworkCallback(this.f29896h);
                return;
            } catch (IllegalArgumentException | SecurityException e11) {
                q.c().b(f29894j, "Received exception while registering network callback", e11);
                return;
            }
        }
        q.c().a(f29894j, "Registering broadcast receiver", new Throwable[0]);
        this.f29888b.registerReceiver(this.f29897i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // i5.d
    public void f() {
        if (j()) {
            try {
                q.c().a(f29894j, "Unregistering network callback", new Throwable[0]);
                this.f29895g.unregisterNetworkCallback(this.f29896h);
                return;
            } catch (IllegalArgumentException | SecurityException e11) {
                q.c().b(f29894j, "Received exception while unregistering network callback", e11);
                return;
            }
        }
        q.c().a(f29894j, "Unregistering broadcast receiver", new Throwable[0]);
        this.f29888b.unregisterReceiver(this.f29897i);
    }

    g5.b g() {
        NetworkInfo activeNetworkInfo = this.f29895g.getActiveNetworkInfo();
        boolean z11 = true;
        boolean z12 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean i11 = i();
        boolean a11 = q3.a.a(this.f29895g);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z11 = false;
        }
        return new g5.b(z12, i11, a11, z11);
    }

    @Override // i5.d
    /* renamed from: h */
    public g5.b b() {
        return g();
    }

    boolean i() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = this.f29895g.getNetworkCapabilities(this.f29895g.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (SecurityException e11) {
            q.c().b(f29894j, "Unable to validate active network", e11);
            return false;
        }
    }
}