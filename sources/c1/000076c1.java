package io.grpc.internal;

import ch.qos.logback.core.CoreConstants;
import ezvcard.property.Gender;
import io.grpc.c;
import io.grpc.f1;
import io.grpc.h0;
import io.grpc.internal.e2;
import io.grpc.internal.j2;
import io.grpc.internal.r;
import io.grpc.k;
import io.grpc.m0;
import io.grpc.r0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class q0 {

    /* renamed from: a */
    private static final Logger f31158a = Logger.getLogger(q0.class.getName());

    /* renamed from: b */
    public static final r0.f<Long> f31159b;

    /* renamed from: c */
    public static final r0.f<String> f31160c;

    /* renamed from: d */
    public static final r0.f<byte[]> f31161d;

    /* renamed from: e */
    public static final r0.f<String> f31162e;

    /* renamed from: f */
    public static final r0.f<byte[]> f31163f;

    /* renamed from: g */
    static final r0.f<String> f31164g;

    /* renamed from: h */
    public static final r0.f<String> f31165h;

    /* renamed from: i */
    public static final r0.f<String> f31166i;

    /* renamed from: j */
    public static final r0.f<String> f31167j;

    /* renamed from: k */
    public static final long f31168k;

    /* renamed from: l */
    public static final io.grpc.y0 f31169l;

    /* renamed from: m */
    public static final c.a<Boolean> f31170m;

    /* renamed from: n */
    private static final io.grpc.k f31171n;

    /* renamed from: o */
    public static final e2.d<Executor> f31172o;

    /* renamed from: p */
    public static final e2.d<ScheduledExecutorService> f31173p;

    /* renamed from: q */
    public static final com.google.common.base.a0<com.google.common.base.y> f31174q;

    /* loaded from: classes5.dex */
    class a implements io.grpc.y0 {
        a() {
        }

        @Override // io.grpc.y0
        public io.grpc.x0 a(SocketAddress socketAddress) {
            return null;
        }
    }

    /* loaded from: classes5.dex */
    class b extends io.grpc.k {
        b() {
        }
    }

    /* loaded from: classes5.dex */
    class c implements e2.d<Executor> {
        c() {
        }

        @Override // io.grpc.internal.e2.d
        /* renamed from: a */
        public void b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        @Override // io.grpc.internal.e2.d
        /* renamed from: c */
        public Executor create() {
            return Executors.newCachedThreadPool(q0.i("grpc-default-executor-%d", true));
        }

        public String toString() {
            return "grpc-default-executor";
        }
    }

    /* loaded from: classes5.dex */
    class d implements e2.d<ScheduledExecutorService> {
        d() {
        }

        @Override // io.grpc.internal.e2.d
        /* renamed from: a */
        public void b(ScheduledExecutorService scheduledExecutorService) {
            scheduledExecutorService.shutdown();
        }

        @Override // io.grpc.internal.e2.d
        /* renamed from: c */
        public ScheduledExecutorService create() {
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, q0.i("grpc-timer-%d", true));
            try {
                newScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(newScheduledThreadPool, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception e12) {
                throw new RuntimeException(e12);
            }
            return Executors.unconfigurableScheduledExecutorService(newScheduledThreadPool);
        }
    }

    /* loaded from: classes5.dex */
    class e implements com.google.common.base.a0<com.google.common.base.y> {
        e() {
        }

        @Override // com.google.common.base.a0
        /* renamed from: a */
        public com.google.common.base.y get() {
            return com.google.common.base.y.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class f implements s {

        /* renamed from: a */
        final /* synthetic */ k.a f31175a;

        /* renamed from: b */
        final /* synthetic */ s f31176b;

        f(k.a aVar, s sVar) {
            this.f31175a = aVar;
            this.f31176b = sVar;
        }

        @Override // io.grpc.k0
        public io.grpc.g0 c() {
            return this.f31176b.c();
        }

        @Override // io.grpc.internal.s
        public q e(io.grpc.s0<?, ?> s0Var, io.grpc.r0 r0Var, io.grpc.c cVar, io.grpc.k[] kVarArr) {
            io.grpc.k a11 = this.f31175a.a(k.b.a().b(cVar).a(), r0Var);
            com.google.common.base.u.v(kVarArr[kVarArr.length - 1] == q0.f31171n, "lb tracer already assigned");
            kVarArr[kVarArr.length - 1] = a11;
            return this.f31176b.e(s0Var, r0Var, cVar, kVarArr);
        }
    }

    /* loaded from: classes5.dex */
    private static final class g implements h0.a<byte[]> {
        private g() {
        }

        @Override // io.grpc.r0.i
        /* renamed from: c */
        public byte[] b(byte[] bArr) {
            return bArr;
        }

        @Override // io.grpc.r0.i
        /* renamed from: d */
        public byte[] a(byte[] bArr) {
            return bArr;
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static final class h {
        private static final /* synthetic */ h[] $VALUES;
        public static final h CANCEL;
        public static final h COMPRESSION_ERROR;
        public static final h CONNECT_ERROR;
        public static final h ENHANCE_YOUR_CALM;
        public static final h FLOW_CONTROL_ERROR;
        public static final h FRAME_SIZE_ERROR;
        public static final h HTTP_1_1_REQUIRED;
        public static final h INADEQUATE_SECURITY;
        public static final h INTERNAL_ERROR;
        public static final h NO_ERROR;
        public static final h PROTOCOL_ERROR;
        public static final h REFUSED_STREAM;
        public static final h SETTINGS_TIMEOUT;
        public static final h STREAM_CLOSED;
        private static final h[] codeMap;
        private final int code;
        private final io.grpc.f1 status;

        static {
            io.grpc.f1 f1Var = io.grpc.f1.f30571o;
            h hVar = new h("NO_ERROR", 0, 0, f1Var);
            NO_ERROR = hVar;
            io.grpc.f1 f1Var2 = io.grpc.f1.f30570n;
            h hVar2 = new h("PROTOCOL_ERROR", 1, 1, f1Var2);
            PROTOCOL_ERROR = hVar2;
            h hVar3 = new h("INTERNAL_ERROR", 2, 2, f1Var2);
            INTERNAL_ERROR = hVar3;
            h hVar4 = new h("FLOW_CONTROL_ERROR", 3, 3, f1Var2);
            FLOW_CONTROL_ERROR = hVar4;
            h hVar5 = new h("SETTINGS_TIMEOUT", 4, 4, f1Var2);
            SETTINGS_TIMEOUT = hVar5;
            h hVar6 = new h("STREAM_CLOSED", 5, 5, f1Var2);
            STREAM_CLOSED = hVar6;
            h hVar7 = new h("FRAME_SIZE_ERROR", 6, 6, f1Var2);
            FRAME_SIZE_ERROR = hVar7;
            h hVar8 = new h("REFUSED_STREAM", 7, 7, f1Var);
            REFUSED_STREAM = hVar8;
            h hVar9 = new h("CANCEL", 8, 8, io.grpc.f1.f30563g);
            CANCEL = hVar9;
            h hVar10 = new h("COMPRESSION_ERROR", 9, 9, f1Var2);
            COMPRESSION_ERROR = hVar10;
            h hVar11 = new h("CONNECT_ERROR", 10, 10, f1Var2);
            CONNECT_ERROR = hVar11;
            h hVar12 = new h("ENHANCE_YOUR_CALM", 11, 11, io.grpc.f1.f30568l.r("Bandwidth exhausted"));
            ENHANCE_YOUR_CALM = hVar12;
            h hVar13 = new h("INADEQUATE_SECURITY", 12, 12, io.grpc.f1.f30566j.r("Permission denied as protocol is not secure enough to call"));
            INADEQUATE_SECURITY = hVar13;
            h hVar14 = new h("HTTP_1_1_REQUIRED", 13, 13, io.grpc.f1.f30564h);
            HTTP_1_1_REQUIRED = hVar14;
            $VALUES = new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11, hVar12, hVar13, hVar14};
            codeMap = buildHttp2CodeMap();
        }

        private h(String str, int i11, int i12, io.grpc.f1 f1Var) {
            super(str, i11);
            this.code = i12;
            String str2 = "HTTP/2 error code: " + name();
            if (f1Var.o() != null) {
                str2 = str2 + " (" + f1Var.o() + ")";
            }
            this.status = f1Var.r(str2);
        }

        private static h[] buildHttp2CodeMap() {
            h[] values = values();
            h[] hVarArr = new h[((int) values[values.length - 1].code()) + 1];
            for (h hVar : values) {
                hVarArr[(int) hVar.code()] = hVar;
            }
            return hVarArr;
        }

        public static h forCode(long j11) {
            h[] hVarArr = codeMap;
            if (j11 >= hVarArr.length || j11 < 0) {
                return null;
            }
            return hVarArr[(int) j11];
        }

        public static io.grpc.f1 statusForCode(long j11) {
            h forCode = forCode(j11);
            if (forCode == null) {
                io.grpc.f1 i11 = io.grpc.f1.i(INTERNAL_ERROR.status().n().value());
                return i11.r("Unrecognized HTTP/2 error code: " + j11);
            }
            return forCode.status();
        }

        public static h valueOf(String str) {
            return (h) Enum.valueOf(h.class, str);
        }

        public static h[] values() {
            return (h[]) $VALUES.clone();
        }

        public long code() {
            return this.code;
        }

        public io.grpc.f1 status() {
            return this.status;
        }
    }

    /* loaded from: classes5.dex */
    static class i implements r0.d<Long> {
        i() {
        }

        @Override // io.grpc.r0.d
        /* renamed from: c */
        public Long b(String str) {
            com.google.common.base.u.e(str.length() > 0, "empty timeout");
            com.google.common.base.u.e(str.length() <= 9, "bad timeout format");
            long parseLong = Long.parseLong(str.substring(0, str.length() - 1));
            char charAt = str.charAt(str.length() - 1);
            if (charAt != 'H') {
                if (charAt != 'M') {
                    if (charAt != 'S') {
                        if (charAt != 'u') {
                            if (charAt != 'm') {
                                if (charAt == 'n') {
                                    return Long.valueOf(parseLong);
                                }
                                throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", Character.valueOf(charAt)));
                            }
                            return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(parseLong));
                        }
                        return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(parseLong));
                    }
                    return Long.valueOf(TimeUnit.SECONDS.toNanos(parseLong));
                }
                return Long.valueOf(TimeUnit.MINUTES.toNanos(parseLong));
            }
            return Long.valueOf(TimeUnit.HOURS.toNanos(parseLong));
        }

        @Override // io.grpc.r0.d
        /* renamed from: d */
        public String a(Long l11) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (l11.longValue() >= 0) {
                if (l11.longValue() < 100000000) {
                    return l11 + "n";
                } else if (l11.longValue() < 100000000000L) {
                    return timeUnit.toMicros(l11.longValue()) + "u";
                } else if (l11.longValue() < 100000000000000L) {
                    return timeUnit.toMillis(l11.longValue()) + "m";
                } else if (l11.longValue() < 100000000000000000L) {
                    return timeUnit.toSeconds(l11.longValue()) + "S";
                } else if (l11.longValue() < 6000000000000000000L) {
                    return timeUnit.toMinutes(l11.longValue()) + Gender.MALE;
                } else {
                    return timeUnit.toHours(l11.longValue()) + "H";
                }
            }
            throw new IllegalArgumentException("Timeout too small");
        }
    }

    static {
        Charset.forName("US-ASCII");
        f31159b = r0.f.e("grpc-timeout", new i());
        r0.d<String> dVar = io.grpc.r0.f31579d;
        f31160c = r0.f.e("grpc-encoding", dVar);
        f31161d = io.grpc.h0.b("grpc-accept-encoding", new g(null));
        f31162e = r0.f.e("content-encoding", dVar);
        f31163f = io.grpc.h0.b("accept-encoding", new g(null));
        f31164g = r0.f.e("content-length", dVar);
        f31165h = r0.f.e("content-type", dVar);
        f31166i = r0.f.e("te", dVar);
        f31167j = r0.f.e("user-agent", dVar);
        com.google.common.base.x.e(CoreConstants.COMMA_CHAR).m();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f31168k = timeUnit.toNanos(20L);
        TimeUnit.HOURS.toNanos(2L);
        timeUnit.toNanos(20L);
        f31169l = new t1();
        new a();
        f31170m = c.a.b("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        f31171n = new b();
        f31172o = new c();
        f31173p = new d();
        f31174q = new e();
    }

    private q0() {
    }

    public static URI b(String str) {
        com.google.common.base.u.p(str, "authority");
        try {
            return new URI(null, str, null, null, null);
        } catch (URISyntaxException e11) {
            throw new IllegalArgumentException("Invalid authority: " + str, e11);
        }
    }

    public static String c(String str) {
        URI b11 = b(str);
        com.google.common.base.u.k(b11.getHost() != null, "No host in authority '%s'", str);
        com.google.common.base.u.k(b11.getUserInfo() == null, "Userinfo must not be present on authority: '%s'", str);
        return str;
    }

    public static void d(j2.a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next == null) {
                return;
            }
            e(next);
        }
    }

    public static void e(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e11) {
            f31158a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e11);
        }
    }

    public static io.grpc.k[] f(io.grpc.c cVar, io.grpc.r0 r0Var, int i11, boolean z11) {
        List<k.a> i12 = cVar.i();
        int size = i12.size() + 1;
        io.grpc.k[] kVarArr = new io.grpc.k[size];
        k.b a11 = k.b.a().b(cVar).d(i11).c(z11).a();
        for (int i13 = 0; i13 < i12.size(); i13++) {
            kVarArr[i13] = i12.get(i13).a(a11, r0Var);
        }
        kVarArr[size - 1] = f31171n;
        return kVarArr;
    }

    public static String g(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str2 != null) {
            sb2.append(str2);
            sb2.append(' ');
        }
        sb2.append("grpc-java-");
        sb2.append(str);
        sb2.append('/');
        sb2.append("1.47.0");
        return sb2.toString();
    }

    public static String h(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(inetSocketAddress, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    public static ThreadFactory i(String str, boolean z11) {
        return new com.google.common.util.concurrent.h().e(z11).f(str).b();
    }

    public static s j(m0.e eVar, boolean z11) {
        m0.h c11 = eVar.c();
        s a11 = c11 != null ? ((m2) c11.d()).a() : null;
        if (a11 != null) {
            k.a b11 = eVar.b();
            return b11 == null ? a11 : new f(b11, a11);
        }
        if (!eVar.a().p()) {
            if (eVar.d()) {
                return new g0(eVar.a(), r.a.DROPPED);
            }
            if (!z11) {
                return new g0(eVar.a(), r.a.PROCESSED);
            }
        }
        return null;
    }

    private static f1.b k(int i11) {
        if (i11 >= 100 && i11 < 200) {
            return f1.b.INTERNAL;
        }
        if (i11 != 400) {
            if (i11 != 401) {
                if (i11 != 403) {
                    if (i11 != 404) {
                        if (i11 != 429) {
                            if (i11 != 431) {
                                switch (i11) {
                                    case 502:
                                    case 503:
                                    case 504:
                                        break;
                                    default:
                                        return f1.b.UNKNOWN;
                                }
                            }
                        }
                        return f1.b.UNAVAILABLE;
                    }
                    return f1.b.UNIMPLEMENTED;
                }
                return f1.b.PERMISSION_DENIED;
            }
            return f1.b.UNAUTHENTICATED;
        }
        return f1.b.INTERNAL;
    }

    public static io.grpc.f1 l(int i11) {
        io.grpc.f1 status = k(i11).toStatus();
        return status.r("HTTP status code " + i11);
    }

    public static boolean m(String str) {
        if (str != null && 16 <= str.length()) {
            String lowerCase = str.toLowerCase();
            if (lowerCase.startsWith("application/grpc")) {
                if (lowerCase.length() == 16) {
                    return true;
                }
                char charAt = lowerCase.charAt(16);
                return charAt == '+' || charAt == ';';
            }
            return false;
        }
        return false;
    }

    public static boolean n(io.grpc.c cVar) {
        return !Boolean.TRUE.equals(cVar.h(f31170m));
    }
}