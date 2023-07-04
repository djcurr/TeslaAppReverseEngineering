package zu;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final y f60801a = new y();

    private y() {
    }

    public final String a(Context context) {
        kotlin.jvm.internal.s.g(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        return (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) ? "-" : activeNetworkInfo.getType() == 1 ? "wifi" : "cellular";
    }

    public final boolean b(Context context) {
        kotlin.jvm.internal.s.g(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}