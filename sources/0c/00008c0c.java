package net.time4j;

import java.util.Iterator;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes5.dex */
public final class p0 implements net.time4j.base.e<b0> {

    /* renamed from: c  reason: collision with root package name */
    private static final m30.e f41488c;

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f41489d;

    /* renamed from: e  reason: collision with root package name */
    public static final p0 f41490e;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f41491a;

    /* renamed from: b  reason: collision with root package name */
    private final long f41492b;

    /* loaded from: classes5.dex */
    private static class b implements m30.e {
        private b() {
        }

        @Override // m30.e
        public String a() {
            return "";
        }

        @Override // m30.e
        public long getNanos() {
            return System.nanoTime();
        }
    }

    static {
        m30.e eVar;
        String property = System.getProperty("java.vm.name");
        Iterator it2 = net.time4j.base.d.c().g(m30.e.class).iterator();
        while (true) {
            if (!it2.hasNext()) {
                eVar = null;
                break;
            }
            eVar = (m30.e) it2.next();
            if (property.equals(eVar.a())) {
                break;
            }
        }
        if (eVar == null) {
            eVar = new b();
        }
        f41488c = eVar;
        f41489d = Boolean.getBoolean("net.time4j.systemclock.nanoTime");
        f41490e = new p0(false, a());
        new p0(true, a());
    }

    private p0(boolean z11, long j11) {
        this.f41491a = z11;
        this.f41492b = j11;
    }

    private static long a() {
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = 0;
        int i11 = 0;
        while (i11 < 10) {
            j11 = f41489d ? System.nanoTime() : f41488c.getNanos();
            long currentTimeMillis2 = System.currentTimeMillis();
            if (currentTimeMillis == currentTimeMillis2) {
                break;
            }
            i11++;
            currentTimeMillis = currentTimeMillis2;
        }
        return net.time4j.base.c.m(net.time4j.base.c.i(m30.d.p().f(net.time4j.base.c.b(currentTimeMillis, 1000)), 1000000000L) + (net.time4j.base.c.d(currentTimeMillis, 1000) * 1000000), j11);
    }

    public static b0 b() {
        return f41490e.c();
    }

    private long d() {
        return net.time4j.base.c.f(f41489d ? System.nanoTime() : f41488c.getNanos(), this.f41492b);
    }

    public b0 c() {
        if ((this.f41491a || f41489d) && m30.d.p().t()) {
            long d11 = d();
            return b0.k0(net.time4j.base.c.b(d11, Http2Connection.DEGRADED_PONG_TIMEOUT_NS), net.time4j.base.c.d(d11, Http2Connection.DEGRADED_PONG_TIMEOUT_NS), m30.f.UTC);
        }
        long currentTimeMillis = System.currentTimeMillis();
        return b0.k0(net.time4j.base.c.b(currentTimeMillis, 1000), net.time4j.base.c.d(currentTimeMillis, 1000) * 1000000, m30.f.POSIX);
    }
}