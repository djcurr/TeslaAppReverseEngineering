package atd.m;

import android.content.Context;
import atd.i.c;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class e extends atd.i.d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Comparator<NetworkInterface> {
        a(e eVar) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(NetworkInterface networkInterface, NetworkInterface networkInterface2) {
            return !networkInterface2.getName().contains(atd.s0.a.a(-73640173169216L)) ? 0 : -1;
        }
    }

    @Override // atd.i.b
    public String a() {
        return atd.s0.a.a(-73408244935232L);
    }

    @Override // atd.i.d
    protected List<String> b() {
        return Arrays.asList(atd.s0.a.a(-73421129837120L), atd.s0.a.a(-72716755200576L));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // atd.i.d
    /* renamed from: d */
    public String c(Context context) {
        try {
            ArrayList<NetworkInterface> list = Collections.list(NetworkInterface.getNetworkInterfaces());
            Collections.sort(list, new a(this));
            for (NetworkInterface networkInterface : list) {
                for (InetAddress inetAddress : Collections.list(networkInterface.getInetAddresses())) {
                    if (!inetAddress.isLoopbackAddress()) {
                        String hostAddress = inetAddress.getHostAddress();
                        if (hostAddress.indexOf(58) < 0) {
                            return hostAddress;
                        }
                        int indexOf = hostAddress.indexOf(37);
                        if (indexOf >= 0) {
                            hostAddress = hostAddress.substring(0, indexOf);
                        }
                        return hostAddress.toUpperCase(Locale.US);
                    }
                }
            }
            throw new atd.i.c(c.a.UNSUPPORTED_BY_PLATFORM_OR_DEPRECATED, null);
        } catch (SocketException e11) {
            throw new atd.i.c(c.a.UNSUPPORTED_BY_PLATFORM_OR_DEPRECATED, e11);
        }
    }
}