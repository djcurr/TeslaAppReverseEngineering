package zu;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final x f60797a = new x();

    /* renamed from: b  reason: collision with root package name */
    private static final com.tesla.logging.g f60798b = com.tesla.logging.g.f21878b.a("NetworkListener");

    /* renamed from: c  reason: collision with root package name */
    private static final cz.e<Boolean> f60799c;

    /* renamed from: d  reason: collision with root package name */
    private static final a f60800d;

    /* loaded from: classes6.dex */
    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            kotlin.jvm.internal.s.g(network, "network");
            super.onAvailable(network);
            x.f60798b.i("network available.");
            x.f60797a.c(true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            kotlin.jvm.internal.s.g(network, "network");
            super.onLost(network);
            x.f60798b.i("network lost.");
            x.f60797a.c(false);
        }
    }

    static {
        cz.e U = cz.a.W().U();
        kotlin.jvm.internal.s.f(U, "create<Boolean>().toSerialized()");
        f60799c = U;
        f60800d = new a();
    }

    private x() {
    }

    public final void b(Context context) {
        kotlin.jvm.internal.s.g(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ((ConnectivityManager) systemService).registerDefaultNetworkCallback(f60800d);
    }

    public final void c(boolean z11) {
        f60799c.b(Boolean.valueOf(z11));
    }
}