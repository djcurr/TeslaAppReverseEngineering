package kz;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import io.sentry.android.core.a0;
import io.sentry.d0;
import io.sentry.f3;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: kz.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public enum EnumC0686a {
        CONNECTED,
        NOT_CONNECTED,
        NO_PERMISSION,
        UNKNOWN
    }

    private static EnumC0686a a(Context context, ConnectivityManager connectivityManager, d0 d0Var) {
        if (!e.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            d0Var.c(f3.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return EnumC0686a.NO_PERMISSION;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.isConnected() ? EnumC0686a.CONNECTED : EnumC0686a.NOT_CONNECTED;
        }
        d0Var.c(f3.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
        return EnumC0686a.NOT_CONNECTED;
    }

    public static EnumC0686a b(Context context, d0 d0Var) {
        ConnectivityManager d11 = d(context, d0Var);
        if (d11 == null) {
            return EnumC0686a.UNKNOWN;
        }
        return a(context, d11, d0Var);
    }

    public static String c(Context context, d0 d0Var, a0 a0Var) {
        boolean z11;
        ConnectivityManager d11 = d(context, d0Var);
        if (d11 == null) {
            return null;
        }
        boolean z12 = false;
        if (!e.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            d0Var.c(f3.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return null;
        }
        boolean z13 = true;
        if (a0Var.d() >= 23) {
            Network activeNetwork = d11.getActiveNetwork();
            if (activeNetwork == null) {
                d0Var.c(f3.INFO, "Network is null and cannot check network status", new Object[0]);
                return null;
            }
            NetworkCapabilities networkCapabilities = d11.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null) {
                d0Var.c(f3.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
                return null;
            }
            boolean hasTransport = networkCapabilities.hasTransport(3);
            z11 = networkCapabilities.hasTransport(1);
            z13 = networkCapabilities.hasTransport(0);
            z12 = hasTransport;
        } else {
            NetworkInfo activeNetworkInfo = d11.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                d0Var.c(f3.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
                return null;
            }
            int type = activeNetworkInfo.getType();
            if (type == 0) {
                z11 = false;
            } else if (type != 1) {
                if (type != 9) {
                    z11 = false;
                } else {
                    z11 = false;
                    z12 = true;
                }
                z13 = z11;
            } else {
                z11 = true;
                z13 = false;
            }
        }
        if (z12) {
            return "ethernet";
        }
        if (z11) {
            return "wifi";
        }
        if (z13) {
            return "cellular";
        }
        return null;
    }

    private static ConnectivityManager d(Context context, d0 d0Var) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            d0Var.c(f3.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
        }
        return connectivityManager;
    }
}