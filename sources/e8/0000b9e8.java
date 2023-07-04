package va;

import android.content.Context;
import android.util.Log;
import va.c;

/* loaded from: classes.dex */
public class f implements d {
    @Override // va.d
    public c a(Context context, c.a aVar) {
        boolean z11 = androidx.core.content.b.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z11 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        if (z11) {
            return new e(context, aVar);
        }
        return new n();
    }
}