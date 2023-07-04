package a6;

import a6.b;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: b */
    private final a f281b;

    /* renamed from: c */
    private final Context f282c;

    /* renamed from: d */
    private final ConnectivityManager f283d;

    /* loaded from: classes.dex */
    public static final class a extends BroadcastReceiver {

        /* renamed from: b */
        final /* synthetic */ b.InterfaceC0011b f285b;

        a(b.InterfaceC0011b interfaceC0011b) {
            c.this = r1;
            this.f285b = interfaceC0011b;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            s.g(context, "context");
            if (s.c(intent != null ? intent.getAction() : null, "android.net.conn.CONNECTIVITY_CHANGE")) {
                this.f285b.a(c.this.a());
            }
        }
    }

    public c(Context context, ConnectivityManager connectivityManager, b.InterfaceC0011b listener) {
        s.g(context, "context");
        s.g(connectivityManager, "connectivityManager");
        s.g(listener, "listener");
        this.f282c = context;
        this.f283d = connectivityManager;
        a aVar = new a(listener);
        this.f281b = aVar;
        context.registerReceiver(aVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // a6.b
    public boolean a() {
        NetworkInfo activeNetworkInfo = this.f283d.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    @Override // a6.b
    public void shutdown() {
        this.f282c.unregisterReceiver(this.f281b);
    }
}