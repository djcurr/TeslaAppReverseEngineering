package va;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import va.c;

/* loaded from: classes.dex */
final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f54427a;

    /* renamed from: b  reason: collision with root package name */
    final c.a f54428b;

    /* renamed from: c  reason: collision with root package name */
    boolean f54429c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f54430d;

    /* renamed from: e  reason: collision with root package name */
    private final BroadcastReceiver f54431e = new a();

    /* loaded from: classes.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            e eVar = e.this;
            boolean z11 = eVar.f54429c;
            eVar.f54429c = eVar.a(context);
            if (z11 != e.this.f54429c) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + e.this.f54429c);
                }
                e eVar2 = e.this;
                eVar2.f54428b.a(eVar2.f54429c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Context context, c.a aVar) {
        this.f54427a = context.getApplicationContext();
        this.f54428b = aVar;
    }

    private void b() {
        if (this.f54430d) {
            return;
        }
        this.f54429c = a(this.f54427a);
        try {
            this.f54427a.registerReceiver(this.f54431e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f54430d = true;
        } catch (SecurityException e11) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register", e11);
            }
        }
    }

    private void c() {
        if (this.f54430d) {
            this.f54427a.unregisterReceiver(this.f54431e);
            this.f54430d = false;
        }
    }

    boolean a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) bb.j.d((ConnectivityManager) context.getSystemService("connectivity"))).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e11) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e11);
            }
            return true;
        }
    }

    @Override // va.m
    public void onDestroy() {
    }

    @Override // va.m
    public void onStart() {
        b();
    }

    @Override // va.m
    public void onStop() {
        c();
    }
}