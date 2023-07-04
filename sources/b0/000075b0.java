package io.grpc;

import java.security.cert.Certificate;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* loaded from: classes5.dex */
public final class b0 {

    /* renamed from: d  reason: collision with root package name */
    private static final Logger f30513d = Logger.getLogger(b0.class.getName());

    /* renamed from: e  reason: collision with root package name */
    private static final b0 f30514e = new b0();

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentNavigableMap<Long, f0<Object>> f30515a;

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap<Long, f0<Object>> f30516b;

    /* renamed from: c  reason: collision with root package name */
    private final ConcurrentMap<Long, f0<Object>> f30517c;

    /* loaded from: classes5.dex */
    public static final class b {
        public b(c cVar) {
            c cVar2 = (c) com.google.common.base.u.o(cVar);
        }
    }

    /* loaded from: classes5.dex */
    public static final class c {
        public c(SSLSession sSLSession) {
            sSLSession.getCipherSuite();
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                Certificate certificate = localCertificates[0];
            }
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                if (peerCertificates != null) {
                    Certificate certificate2 = peerCertificates[0];
                }
            } catch (SSLPeerUnverifiedException e11) {
                b0.f30513d.log(Level.FINE, String.format("Peer cert not available for peerHost=%s", sSLSession.getPeerHost()), (Throwable) e11);
            }
        }
    }

    public b0() {
        new ConcurrentSkipListMap();
        this.f30515a = new ConcurrentSkipListMap();
        this.f30516b = new ConcurrentHashMap();
        this.f30517c = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    private static <T extends f0<?>> void b(Map<Long, T> map, T t11) {
        map.put(Long.valueOf(t11.c().d()), t11);
    }

    public static long f(k0 k0Var) {
        return k0Var.c().d();
    }

    public static b0 g() {
        return f30514e;
    }

    private static <T extends f0<?>> void h(Map<Long, T> map, T t11) {
        map.remove(Long.valueOf(f(t11)));
    }

    public void c(f0<Object> f0Var) {
        b(this.f30517c, f0Var);
    }

    public void d(f0<Object> f0Var) {
        b(this.f30515a, f0Var);
    }

    public void e(f0<Object> f0Var) {
        b(this.f30516b, f0Var);
    }

    public void i(f0<Object> f0Var) {
        h(this.f30517c, f0Var);
    }

    public void j(f0<Object> f0Var) {
        h(this.f30515a, f0Var);
    }

    public void k(f0<Object> f0Var) {
        h(this.f30516b, f0Var);
    }
}