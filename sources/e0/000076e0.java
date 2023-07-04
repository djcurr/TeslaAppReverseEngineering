package io.grpc.internal;

import io.grpc.a0;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
class t1 implements io.grpc.y0 {

    /* renamed from: d  reason: collision with root package name */
    private static final Logger f31221d = Logger.getLogger(t1.class.getName());

    /* renamed from: e  reason: collision with root package name */
    private static final c f31222e = new a();

    /* renamed from: f  reason: collision with root package name */
    private static final com.google.common.base.a0<ProxySelector> f31223f = new b();

    /* renamed from: a  reason: collision with root package name */
    private final com.google.common.base.a0<ProxySelector> f31224a;

    /* renamed from: b  reason: collision with root package name */
    private final c f31225b;

    /* renamed from: c  reason: collision with root package name */
    private final InetSocketAddress f31226c;

    /* loaded from: classes5.dex */
    class a implements c {
        a() {
        }

        @Override // io.grpc.internal.t1.c
        public PasswordAuthentication a(String str, InetAddress inetAddress, int i11, String str2, String str3, String str4) {
            URL url;
            try {
                url = new URL(str2, str, i11, "");
            } catch (MalformedURLException unused) {
                t1.f31221d.log(Level.WARNING, String.format("failed to create URL for Authenticator: %s %s", str2, str));
                url = null;
            }
            return Authenticator.requestPasswordAuthentication(str, inetAddress, i11, str2, str3, str4, url, Authenticator.RequestorType.PROXY);
        }
    }

    /* loaded from: classes5.dex */
    class b implements com.google.common.base.a0<ProxySelector> {
        b() {
        }

        @Override // com.google.common.base.a0
        /* renamed from: a */
        public ProxySelector get() {
            return ProxySelector.getDefault();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public interface c {
        PasswordAuthentication a(String str, InetAddress inetAddress, int i11, String str2, String str3, String str4);
    }

    public t1() {
        this(f31223f, f31222e, System.getenv("GRPC_PROXY_EXP"));
    }

    private io.grpc.x0 c(InetSocketAddress inetSocketAddress) {
        try {
            try {
                URI uri = new URI("https", null, q0.h(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                ProxySelector proxySelector = this.f31224a.get();
                if (proxySelector == null) {
                    f31221d.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                List<Proxy> select = proxySelector.select(uri);
                if (select.size() > 1) {
                    f31221d.warning("More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = select.get(0);
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
                PasswordAuthentication a11 = this.f31225b.a(q0.h(inetSocketAddress2), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort(), "https", "", null);
                if (inetSocketAddress2.isUnresolved()) {
                    inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
                }
                a0.b c11 = io.grpc.a0.e().d(inetSocketAddress).c(inetSocketAddress2);
                if (a11 == null) {
                    return c11.a();
                }
                return c11.e(a11.getUserName()).b(a11.getPassword() != null ? new String(a11.getPassword()) : null).a();
            } catch (URISyntaxException e11) {
                f31221d.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e11);
                return null;
            }
        } catch (Throwable th2) {
            f31221d.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th2);
            return null;
        }
    }

    private static InetSocketAddress d(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(":", 2);
        int parseInt = split.length > 1 ? Integer.parseInt(split[1]) : 80;
        f31221d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        return new InetSocketAddress(split[0], parseInt);
    }

    @Override // io.grpc.y0
    public io.grpc.x0 a(SocketAddress socketAddress) {
        if (socketAddress instanceof InetSocketAddress) {
            if (this.f31226c != null) {
                return io.grpc.a0.e().c(this.f31226c).d((InetSocketAddress) socketAddress).a();
            }
            return c((InetSocketAddress) socketAddress);
        }
        return null;
    }

    t1(com.google.common.base.a0<ProxySelector> a0Var, c cVar, String str) {
        this.f31224a = (com.google.common.base.a0) com.google.common.base.u.o(a0Var);
        this.f31225b = (c) com.google.common.base.u.o(cVar);
        if (str != null) {
            this.f31226c = d(str);
        } else {
            this.f31226c = null;
        }
    }
}