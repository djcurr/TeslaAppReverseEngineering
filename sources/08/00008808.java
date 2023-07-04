package mx;

import com.google.common.base.u;
import io.grpc.internal.b1;
import io.grpc.internal.e2;
import io.grpc.internal.f2;
import io.grpc.internal.g1;
import io.grpc.internal.h;
import io.grpc.internal.n2;
import io.grpc.internal.o1;
import io.grpc.internal.q0;
import io.grpc.internal.t;
import io.grpc.internal.v;
import io.grpc.j1;
import io.grpc.okhttp.internal.b;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import java.util.EnumSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.http2.Settings;

/* loaded from: classes5.dex */
public final class e extends io.grpc.internal.b<e> {

    /* renamed from: q  reason: collision with root package name */
    static final io.grpc.okhttp.internal.b f39512q;

    /* renamed from: r  reason: collision with root package name */
    private static final long f39513r;

    /* renamed from: s  reason: collision with root package name */
    private static final e2.d<Executor> f39514s;

    /* renamed from: t  reason: collision with root package name */
    private static final o1<Executor> f39515t;

    /* renamed from: b  reason: collision with root package name */
    private final g1 f39516b;

    /* renamed from: f  reason: collision with root package name */
    private SocketFactory f39520f;

    /* renamed from: g  reason: collision with root package name */
    private SSLSocketFactory f39521g;

    /* renamed from: i  reason: collision with root package name */
    private HostnameVerifier f39523i;

    /* renamed from: o  reason: collision with root package name */
    private boolean f39529o;

    /* renamed from: c  reason: collision with root package name */
    private n2.b f39517c = n2.a();

    /* renamed from: d  reason: collision with root package name */
    private o1<Executor> f39518d = f39515t;

    /* renamed from: e  reason: collision with root package name */
    private o1<ScheduledExecutorService> f39519e = f2.c(q0.f31173p);

    /* renamed from: j  reason: collision with root package name */
    private io.grpc.okhttp.internal.b f39524j = f39512q;

    /* renamed from: k  reason: collision with root package name */
    private c f39525k = c.TLS;

    /* renamed from: l  reason: collision with root package name */
    private long f39526l = Long.MAX_VALUE;

    /* renamed from: m  reason: collision with root package name */
    private long f39527m = q0.f31168k;

    /* renamed from: n  reason: collision with root package name */
    private int f39528n = Settings.DEFAULT_INITIAL_WINDOW_SIZE;

    /* renamed from: p  reason: collision with root package name */
    private int f39530p = Integer.MAX_VALUE;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f39522h = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a implements e2.d<Executor> {
        a() {
        }

        @Override // io.grpc.internal.e2.d
        /* renamed from: a */
        public void b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        @Override // io.grpc.internal.e2.d
        /* renamed from: c */
        public Executor create() {
            return Executors.newCachedThreadPool(q0.i("grpc-okhttp-%d", true));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f39531a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f39532b;

        static {
            int[] iArr = new int[c.values().length];
            f39532b = iArr;
            try {
                iArr[c.PLAINTEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39532b[c.TLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[mx.d.values().length];
            f39531a = iArr2;
            try {
                iArr2[mx.d.TLS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39531a[mx.d.PLAINTEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public enum c {
        TLS,
        PLAINTEXT
    }

    /* loaded from: classes5.dex */
    private final class d implements g1.b {
        private d() {
        }

        @Override // io.grpc.internal.g1.b
        public int a() {
            return e.this.f();
        }

        /* synthetic */ d(e eVar, a aVar) {
            this();
        }
    }

    /* renamed from: mx.e$e  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    private final class C0764e implements g1.c {
        private C0764e() {
        }

        @Override // io.grpc.internal.g1.c
        public t a() {
            return e.this.c();
        }

        /* synthetic */ C0764e(e eVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class f implements t {

        /* renamed from: a  reason: collision with root package name */
        private final o1<Executor> f39535a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f39536b;

        /* renamed from: c  reason: collision with root package name */
        private final o1<ScheduledExecutorService> f39537c;

        /* renamed from: d  reason: collision with root package name */
        final ScheduledExecutorService f39538d;

        /* renamed from: e  reason: collision with root package name */
        final n2.b f39539e;

        /* renamed from: f  reason: collision with root package name */
        final SocketFactory f39540f;

        /* renamed from: g  reason: collision with root package name */
        final SSLSocketFactory f39541g;

        /* renamed from: h  reason: collision with root package name */
        final HostnameVerifier f39542h;

        /* renamed from: i  reason: collision with root package name */
        final io.grpc.okhttp.internal.b f39543i;

        /* renamed from: j  reason: collision with root package name */
        final int f39544j;

        /* renamed from: k  reason: collision with root package name */
        private final boolean f39545k;

        /* renamed from: l  reason: collision with root package name */
        private final io.grpc.internal.h f39546l;

        /* renamed from: m  reason: collision with root package name */
        private final long f39547m;

        /* renamed from: n  reason: collision with root package name */
        final int f39548n;

        /* renamed from: o  reason: collision with root package name */
        private final boolean f39549o;

        /* renamed from: p  reason: collision with root package name */
        final int f39550p;

        /* renamed from: q  reason: collision with root package name */
        final boolean f39551q;

        /* renamed from: t  reason: collision with root package name */
        private boolean f39552t;

        /* loaded from: classes5.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h.b f39553a;

            a(f fVar, h.b bVar) {
                this.f39553a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f39553a.a();
            }
        }

        /* synthetic */ f(o1 o1Var, o1 o1Var2, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, io.grpc.okhttp.internal.b bVar, int i11, boolean z11, long j11, long j12, int i12, boolean z12, int i13, n2.b bVar2, boolean z13, a aVar) {
            this(o1Var, o1Var2, socketFactory, sSLSocketFactory, hostnameVerifier, bVar, i11, z11, j11, j12, i12, z12, i13, bVar2, z13);
        }

        @Override // io.grpc.internal.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f39552t) {
                return;
            }
            this.f39552t = true;
            this.f39535a.b(this.f39536b);
            this.f39537c.b(this.f39538d);
        }

        @Override // io.grpc.internal.t
        public v g1(SocketAddress socketAddress, t.a aVar, io.grpc.f fVar) {
            if (!this.f39552t) {
                h.b d11 = this.f39546l.d();
                h hVar = new h(this, (InetSocketAddress) socketAddress, aVar.a(), aVar.d(), aVar.b(), aVar.c(), new a(this, d11));
                if (this.f39545k) {
                    hVar.S(true, d11.b(), this.f39547m, this.f39549o);
                }
                return hVar;
            }
            throw new IllegalStateException("The transport factory is closed.");
        }

        @Override // io.grpc.internal.t
        public ScheduledExecutorService getScheduledExecutorService() {
            return this.f39538d;
        }

        private f(o1<Executor> o1Var, o1<ScheduledExecutorService> o1Var2, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, io.grpc.okhttp.internal.b bVar, int i11, boolean z11, long j11, long j12, int i12, boolean z12, int i13, n2.b bVar2, boolean z13) {
            this.f39535a = o1Var;
            this.f39536b = o1Var.a();
            this.f39537c = o1Var2;
            this.f39538d = o1Var2.a();
            this.f39540f = socketFactory;
            this.f39541g = sSLSocketFactory;
            this.f39542h = hostnameVerifier;
            this.f39543i = bVar;
            this.f39544j = i11;
            this.f39545k = z11;
            this.f39546l = new io.grpc.internal.h("keepalive time nanos", j11);
            this.f39547m = j12;
            this.f39548n = i12;
            this.f39549o = z12;
            this.f39550p = i13;
            this.f39551q = z13;
            this.f39539e = (n2.b) u.p(bVar2, "transportTracerFactory");
        }
    }

    static {
        Logger.getLogger(e.class.getName());
        f39512q = new b.C0593b(io.grpc.okhttp.internal.b.f31525f).f(io.grpc.okhttp.internal.a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, io.grpc.okhttp.internal.a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, io.grpc.okhttp.internal.a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, io.grpc.okhttp.internal.a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, io.grpc.okhttp.internal.a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, io.grpc.okhttp.internal.a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256).i(io.grpc.okhttp.internal.k.TLS_1_2).h(true).e();
        f39513r = TimeUnit.DAYS.toNanos(1000L);
        a aVar = new a();
        f39514s = aVar;
        f39515t = f2.c(aVar);
        EnumSet.of(j1.MTLS, j1.CUSTOM_MANAGERS);
    }

    private e(String str) {
        this.f39516b = new g1(str, new C0764e(this, null), new d(this, null));
    }

    public static e e(String str) {
        return new e(str);
    }

    @Override // io.grpc.internal.b
    protected io.grpc.q0<?> b() {
        return this.f39516b;
    }

    f c() {
        return new f(this.f39518d, this.f39519e, this.f39520f, d(), this.f39523i, this.f39524j, this.f30650a, this.f39526l != Long.MAX_VALUE, this.f39526l, this.f39527m, this.f39528n, this.f39529o, this.f39530p, this.f39517c, false, null);
    }

    SSLSocketFactory d() {
        int i11 = b.f39532b[this.f39525k.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                try {
                    if (this.f39521g == null) {
                        this.f39521g = SSLContext.getInstance("Default", io.grpc.okhttp.internal.h.e().g()).getSocketFactory();
                    }
                    return this.f39521g;
                } catch (GeneralSecurityException e11) {
                    throw new RuntimeException("TLS Provider failure", e11);
                }
            }
            throw new RuntimeException("Unknown negotiation type: " + this.f39525k);
        }
        return null;
    }

    int f() {
        int i11 = b.f39532b[this.f39525k.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return 443;
            }
            throw new AssertionError(this.f39525k + " not handled");
        }
        return 80;
    }

    public e g(long j11, TimeUnit timeUnit) {
        u.e(j11 > 0, "keepalive time must be positive");
        long nanos = timeUnit.toNanos(j11);
        this.f39526l = nanos;
        long l11 = b1.l(nanos);
        this.f39526l = l11;
        if (l11 >= f39513r) {
            this.f39526l = Long.MAX_VALUE;
        }
        return this;
    }

    public e h(long j11, TimeUnit timeUnit) {
        u.e(j11 > 0, "keepalive timeout must be positive");
        long nanos = timeUnit.toNanos(j11);
        this.f39527m = nanos;
        this.f39527m = b1.m(nanos);
        return this;
    }

    public e i(boolean z11) {
        this.f39529o = z11;
        return this;
    }

    public e j() {
        u.v(!this.f39522h, "Cannot change security when using ChannelCredentials");
        this.f39525k = c.TLS;
        return this;
    }
}