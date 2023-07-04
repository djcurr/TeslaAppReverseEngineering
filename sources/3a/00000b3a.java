package atd.w;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import atd.i.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
abstract class a extends atd.i.d {
    @Override // atd.i.d
    protected List<String> b() {
        return Collections.singletonList(atd.s0.a.a(-139387532536384L));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WifiInfo d(Context context) {
        WifiInfo connectionInfo = e(context).getConnectionInfo();
        if (connectionInfo != null) {
            return connectionInfo;
        }
        throw new atd.i.c(c.a.UNSUPPORTED_BY_PLATFORM_OR_DEPRECATED, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WifiManager e(Context context) {
        WifiManager wifiManager = (WifiManager) context.getSystemService(atd.s0.a.a(-138713222670912L));
        if (wifiManager != null) {
            return wifiManager;
        }
        throw new atd.i.c(c.a.UNSUPPORTED_BY_PLATFORM_OR_DEPRECATED, null);
    }
}