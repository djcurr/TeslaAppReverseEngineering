package mx;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.base.u;
import com.google.common.base.y;
import com.stripe.android.core.networking.FileUploadRequest;
import com.stripe.android.core.networking.NetworkConstantsKt;
import io.grpc.StatusException;
import io.grpc.a0;
import io.grpc.b0;
import io.grpc.f1;
import io.grpc.g0;
import io.grpc.internal.b1;
import io.grpc.internal.c2;
import io.grpc.internal.h2;
import io.grpc.internal.j1;
import io.grpc.internal.n2;
import io.grpc.internal.p0;
import io.grpc.internal.q0;
import io.grpc.internal.r;
import io.grpc.internal.s;
import io.grpc.internal.u0;
import io.grpc.internal.v;
import io.grpc.internal.v0;
import io.grpc.r0;
import io.grpc.s0;
import io.grpc.z;
import io.grpc.z0;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import mx.b;
import mx.e;
import mx.g;
import mx.i;
import nx.b;
import okhttp3.internal.http2.Settings;
import okio.e0;
import okio.f0;
import okio.r;
import ox.a;
import ox.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class h implements v, b.a {
    private static final Map<nx.a, f1> V = P();
    private static final Logger W = Logger.getLogger(h.class.getName());
    private static final g[] X = new g[0];
    private final SocketFactory A;
    private SSLSocketFactory B;
    private HostnameVerifier C;
    private Socket D;
    private int E;
    private final Deque<g> F;
    private final io.grpc.okhttp.internal.b G;
    private b1 H;
    private boolean I;
    private long J;
    private long K;
    private boolean L;
    private final Runnable M;
    private final int N;
    private final boolean O;
    private final n2 P;
    private final v0<g> Q;
    private b0.b R;
    final a0 S;
    Runnable T;
    com.google.common.util.concurrent.g<Void> U;

    /* renamed from: a  reason: collision with root package name */
    private final InetSocketAddress f39569a;

    /* renamed from: b  reason: collision with root package name */
    private final String f39570b;

    /* renamed from: c  reason: collision with root package name */
    private final String f39571c;

    /* renamed from: d  reason: collision with root package name */
    private final Random f39572d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.common.base.a0<y> f39573e;

    /* renamed from: f  reason: collision with root package name */
    private final int f39574f;

    /* renamed from: g  reason: collision with root package name */
    private final nx.j f39575g;

    /* renamed from: h  reason: collision with root package name */
    private j1.a f39576h;

    /* renamed from: i  reason: collision with root package name */
    private mx.b f39577i;

    /* renamed from: j  reason: collision with root package name */
    private p f39578j;

    /* renamed from: k  reason: collision with root package name */
    private final Object f39579k;

    /* renamed from: l  reason: collision with root package name */
    private final g0 f39580l;

    /* renamed from: m  reason: collision with root package name */
    private int f39581m;

    /* renamed from: n  reason: collision with root package name */
    private final Map<Integer, g> f39582n;

    /* renamed from: o  reason: collision with root package name */
    private final Executor f39583o;

    /* renamed from: p  reason: collision with root package name */
    private final c2 f39584p;

    /* renamed from: q  reason: collision with root package name */
    private final ScheduledExecutorService f39585q;

    /* renamed from: r  reason: collision with root package name */
    private final int f39586r;

    /* renamed from: s  reason: collision with root package name */
    private int f39587s;

    /* renamed from: t  reason: collision with root package name */
    private e f39588t;

    /* renamed from: u  reason: collision with root package name */
    private io.grpc.a f39589u;

    /* renamed from: v  reason: collision with root package name */
    private f1 f39590v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f39591w;

    /* renamed from: x  reason: collision with root package name */
    private u0 f39592x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f39593y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f39594z;

    /* loaded from: classes5.dex */
    class a extends v0<g> {
        a() {
        }

        @Override // io.grpc.internal.v0
        protected void b() {
            h.this.f39576h.c(true);
        }

        @Override // io.grpc.internal.v0
        protected void c() {
            h.this.f39576h.c(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class b implements n2.c {
        b(h hVar) {
        }
    }

    /* loaded from: classes5.dex */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CountDownLatch f39596a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ mx.a f39597b;

        /* loaded from: classes5.dex */
        class a implements e0 {
            a(c cVar) {
            }

            @Override // okio.e0, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // okio.e0
            public long read(okio.f fVar, long j11) {
                return -1L;
            }

            @Override // okio.e0
            public f0 timeout() {
                return f0.NONE;
            }
        }

        c(CountDownLatch countDownLatch, mx.a aVar) {
            this.f39596a = countDownLatch;
            this.f39597b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar;
            e eVar;
            Socket R;
            try {
                this.f39596a.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            okio.h d11 = r.d(new a(this));
            SSLSession sSLSession = null;
            try {
                try {
                    h hVar2 = h.this;
                    a0 a0Var = hVar2.S;
                    if (a0Var == null) {
                        R = hVar2.A.createSocket(h.this.f39569a.getAddress(), h.this.f39569a.getPort());
                    } else if (a0Var.b() instanceof InetSocketAddress) {
                        h hVar3 = h.this;
                        R = hVar3.R(hVar3.S.c(), (InetSocketAddress) h.this.S.b(), h.this.S.d(), h.this.S.a());
                    } else {
                        f1 f1Var = f1.f30570n;
                        throw f1Var.r("Unsupported SocketAddress implementation " + h.this.S.b().getClass()).c();
                    }
                    Socket socket = R;
                    SSLSocket sSLSocket = socket;
                    if (h.this.B != null) {
                        SSLSocket b11 = m.b(h.this.B, h.this.C, socket, h.this.W(), h.this.X(), h.this.G);
                        sSLSession = b11.getSession();
                        sSLSocket = b11;
                    }
                    sSLSocket.setTcpNoDelay(true);
                    okio.h d12 = r.d(r.l(sSLSocket));
                    this.f39597b.D(r.h(sSLSocket), sSLSocket);
                    h hVar4 = h.this;
                    hVar4.f39589u = hVar4.f39589u.d().d(z.f31683a, sSLSocket.getRemoteSocketAddress()).d(z.f31684b, sSLSocket.getLocalSocketAddress()).d(z.f31685c, sSLSession).d(p0.f31148a, sSLSession == null ? z0.NONE : z0.PRIVACY_AND_INTEGRITY).a();
                    h hVar5 = h.this;
                    hVar5.f39588t = new e(hVar5.f39575g.a(d12, true));
                    synchronized (h.this.f39579k) {
                        h.this.D = (Socket) u.p(sSLSocket, "socket");
                        if (sSLSession != null) {
                            h.this.R = new b0.b(new b0.c(sSLSession));
                        }
                    }
                } catch (StatusException e11) {
                    h.this.k0(0, nx.a.INTERNAL_ERROR, e11.a());
                    hVar = h.this;
                    eVar = new e(hVar.f39575g.a(d11, true));
                    hVar.f39588t = eVar;
                } catch (Exception e12) {
                    h.this.a(e12);
                    hVar = h.this;
                    eVar = new e(hVar.f39575g.a(d11, true));
                    hVar.f39588t = eVar;
                }
            } catch (Throwable th2) {
                h hVar6 = h.this;
                hVar6.f39588t = new e(hVar6.f39575g.a(d11, true));
                throw th2;
            }
        }
    }

    /* loaded from: classes5.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = h.this.T;
            if (runnable != null) {
                runnable.run();
            }
            h.this.f39583o.execute(h.this.f39588t);
            synchronized (h.this.f39579k) {
                h.this.E = Integer.MAX_VALUE;
                h.this.l0();
            }
            com.google.common.util.concurrent.g<Void> gVar = h.this.U;
        }
    }

    /* loaded from: classes5.dex */
    class e implements b.a, Runnable {

        /* renamed from: b  reason: collision with root package name */
        nx.b f39601b;

        /* renamed from: a  reason: collision with root package name */
        private final i f39600a = new i(Level.FINE, h.class);

        /* renamed from: c  reason: collision with root package name */
        boolean f39602c = true;

        e(nx.b bVar) {
            this.f39601b = bVar;
        }

        private int a(List<nx.d> list) {
            long j11 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                nx.d dVar = list.get(i11);
                j11 += dVar.f41936a.z() + 32 + dVar.f41937b.z();
            }
            return (int) Math.min(j11, 2147483647L);
        }

        @Override // nx.b.a
        public void ackSettings() {
        }

        @Override // nx.b.a
        public void data(boolean z11, int i11, okio.h hVar, int i12) {
            this.f39600a.b(i.a.INBOUND, i11, hVar.b(), i12, z11);
            g Z = h.this.Z(i11);
            if (Z == null) {
                if (h.this.c0(i11)) {
                    synchronized (h.this.f39579k) {
                        h.this.f39577i.k(i11, nx.a.INVALID_STREAM);
                    }
                    hVar.skip(i12);
                } else {
                    h.this.f0(nx.a.PROTOCOL_ERROR, "Received data for unknown stream: " + i11);
                    return;
                }
            } else {
                long j11 = i12;
                hVar.m0(j11);
                okio.f fVar = new okio.f();
                fVar.write(hVar.b(), j11);
                dy.c.c("OkHttpClientTransport$ClientFrameHandler.data", Z.x().f0());
                synchronized (h.this.f39579k) {
                    Z.x().g0(fVar, z11);
                }
            }
            h.A(h.this, i12);
            if (h.this.f39587s >= h.this.f39574f * 0.5f) {
                synchronized (h.this.f39579k) {
                    h.this.f39577i.windowUpdate(0, h.this.f39587s);
                }
                h.this.f39587s = 0;
            }
        }

        @Override // nx.b.a
        public void k(int i11, nx.a aVar) {
            this.f39600a.h(i.a.INBOUND, i11, aVar);
            f1 f11 = h.p0(aVar).f("Rst Stream");
            boolean z11 = f11.n() == f1.b.CANCELLED || f11.n() == f1.b.DEADLINE_EXCEEDED;
            synchronized (h.this.f39579k) {
                g gVar = (g) h.this.f39582n.get(Integer.valueOf(i11));
                if (gVar != null) {
                    dy.c.c("OkHttpClientTransport$ClientFrameHandler.rstStream", gVar.x().f0());
                    h.this.T(i11, f11, aVar == nx.a.REFUSED_STREAM ? r.a.REFUSED : r.a.PROCESSED, z11, null, null);
                }
            }
        }

        @Override // nx.b.a
        public void l(boolean z11, boolean z12, int i11, int i12, List<nx.d> list, nx.e eVar) {
            f1 f1Var;
            int a11;
            this.f39600a.d(i.a.INBOUND, i11, list, z12);
            boolean z13 = true;
            if (h.this.N == Integer.MAX_VALUE || (a11 = a(list)) <= h.this.N) {
                f1Var = null;
            } else {
                f1 f1Var2 = f1.f30568l;
                Object[] objArr = new Object[3];
                objArr[0] = z12 ? "trailer" : "header";
                objArr[1] = Integer.valueOf(h.this.N);
                objArr[2] = Integer.valueOf(a11);
                f1Var = f1Var2.r(String.format("Response %s metadata larger than %d: %d", objArr));
            }
            synchronized (h.this.f39579k) {
                g gVar = (g) h.this.f39582n.get(Integer.valueOf(i11));
                if (gVar == null) {
                    if (h.this.c0(i11)) {
                        h.this.f39577i.k(i11, nx.a.INVALID_STREAM);
                    }
                } else if (f1Var == null) {
                    dy.c.c("OkHttpClientTransport$ClientFrameHandler.headers", gVar.x().f0());
                    gVar.x().h0(list, z12);
                } else {
                    if (!z12) {
                        h.this.f39577i.k(i11, nx.a.CANCEL);
                    }
                    gVar.x().N(f1Var, false, new r0());
                }
                z13 = false;
            }
            if (z13) {
                h.this.f0(nx.a.PROTOCOL_ERROR, "Received header for unknown stream: " + i11);
            }
        }

        @Override // nx.b.a
        public void m(int i11, nx.a aVar, okio.i iVar) {
            this.f39600a.c(i.a.INBOUND, i11, aVar, iVar);
            if (aVar == nx.a.ENHANCE_YOUR_CALM) {
                String F = iVar.F();
                h.W.log(Level.WARNING, String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", this, F));
                if ("too_many_pings".equals(F)) {
                    h.this.M.run();
                }
            }
            f1 f11 = q0.h.statusForCode(aVar.httpCode).f("Received Goaway");
            if (iVar.z() > 0) {
                f11 = f11.f(iVar.F());
            }
            h.this.k0(i11, null, f11);
        }

        @Override // nx.b.a
        public void n(boolean z11, nx.i iVar) {
            boolean z12;
            this.f39600a.i(i.a.INBOUND, iVar);
            synchronized (h.this.f39579k) {
                if (l.b(iVar, 4)) {
                    h.this.E = l.a(iVar, 4);
                }
                if (l.b(iVar, 7)) {
                    z12 = h.this.f39578j.e(l.a(iVar, 7));
                } else {
                    z12 = false;
                }
                if (this.f39602c) {
                    h.this.f39576h.b();
                    this.f39602c = false;
                }
                h.this.f39577i.v0(iVar);
                if (z12) {
                    h.this.f39578j.h();
                }
                h.this.l0();
            }
        }

        @Override // nx.b.a
        public void ping(boolean z11, int i11, int i12) {
            u0 u0Var;
            long j11 = (i11 << 32) | (i12 & 4294967295L);
            this.f39600a.e(i.a.INBOUND, j11);
            if (!z11) {
                synchronized (h.this.f39579k) {
                    h.this.f39577i.ping(true, i11, i12);
                }
                return;
            }
            synchronized (h.this.f39579k) {
                u0Var = null;
                if (h.this.f39592x != null) {
                    if (h.this.f39592x.h() == j11) {
                        u0 u0Var2 = h.this.f39592x;
                        h.this.f39592x = null;
                        u0Var = u0Var2;
                    } else {
                        h.W.log(Level.WARNING, String.format("Received unexpected ping ack. Expecting %d, got %d", Long.valueOf(h.this.f39592x.h()), Long.valueOf(j11)));
                    }
                } else {
                    h.W.warning("Received unexpected ping ack. No ping outstanding");
                }
            }
            if (u0Var != null) {
                u0Var.d();
            }
        }

        @Override // nx.b.a
        public void priority(int i11, int i12, int i13, boolean z11) {
        }

        @Override // nx.b.a
        public void pushPromise(int i11, int i12, List<nx.d> list) {
            this.f39600a.g(i.a.INBOUND, i11, i12, list);
            synchronized (h.this.f39579k) {
                h.this.f39577i.k(i11, nx.a.PROTOCOL_ERROR);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            f1 f1Var;
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("OkHttpClientTransport");
            while (this.f39601b.y0(this)) {
                try {
                    if (h.this.H != null) {
                        h.this.H.n();
                    }
                } catch (Throwable th2) {
                    try {
                        h.this.k0(0, nx.a.PROTOCOL_ERROR, f1.f30570n.r("error in frame handler").q(th2));
                        try {
                            this.f39601b.close();
                        } catch (IOException e11) {
                            e = e11;
                            h.W.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                            h.this.f39576h.d();
                            Thread.currentThread().setName(name);
                        }
                    } catch (Throwable th3) {
                        try {
                            this.f39601b.close();
                        } catch (IOException e12) {
                            h.W.log(Level.INFO, "Exception closing frame reader", (Throwable) e12);
                        }
                        h.this.f39576h.d();
                        Thread.currentThread().setName(name);
                        throw th3;
                    }
                }
            }
            synchronized (h.this.f39579k) {
                f1Var = h.this.f39590v;
            }
            if (f1Var == null) {
                f1Var = f1.f30571o.r("End of stream or IOException");
            }
            h.this.k0(0, nx.a.INTERNAL_ERROR, f1Var);
            try {
                this.f39601b.close();
            } catch (IOException e13) {
                e = e13;
                h.W.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                h.this.f39576h.d();
                Thread.currentThread().setName(name);
            }
            h.this.f39576h.d();
            Thread.currentThread().setName(name);
        }

        @Override // nx.b.a
        public void windowUpdate(int i11, long j11) {
            this.f39600a.k(i.a.INBOUND, i11, j11);
            if (j11 == 0) {
                if (i11 == 0) {
                    h.this.f0(nx.a.PROTOCOL_ERROR, "Received 0 flow control window increment.");
                    return;
                } else {
                    h.this.T(i11, f1.f30570n.r("Received 0 flow control window increment."), r.a.PROCESSED, false, nx.a.PROTOCOL_ERROR, null);
                    return;
                }
            }
            boolean z11 = false;
            synchronized (h.this.f39579k) {
                if (i11 == 0) {
                    h.this.f39578j.g(null, (int) j11);
                    return;
                }
                g gVar = (g) h.this.f39582n.get(Integer.valueOf(i11));
                if (gVar != null) {
                    h.this.f39578j.g(gVar, (int) j11);
                } else if (!h.this.c0(i11)) {
                    z11 = true;
                }
                if (z11) {
                    h hVar = h.this;
                    nx.a aVar = nx.a.PROTOCOL_ERROR;
                    hVar.f0(aVar, "Received window_update for unknown stream: " + i11);
                }
            }
        }
    }

    public h(e.f fVar, InetSocketAddress inetSocketAddress, String str, String str2, io.grpc.a aVar, a0 a0Var, Runnable runnable) {
        this(fVar, inetSocketAddress, str, str2, aVar, q0.f31174q, new nx.g(), a0Var, runnable);
    }

    static /* synthetic */ int A(h hVar, int i11) {
        int i12 = hVar.f39587s + i11;
        hVar.f39587s = i12;
        return i12;
    }

    private static Map<nx.a, f1> P() {
        EnumMap enumMap = new EnumMap(nx.a.class);
        nx.a aVar = nx.a.NO_ERROR;
        f1 f1Var = f1.f30570n;
        enumMap.put((EnumMap) aVar, (nx.a) f1Var.r("No error: A GRPC status of OK should have been sent"));
        enumMap.put((EnumMap) nx.a.PROTOCOL_ERROR, (nx.a) f1Var.r("Protocol error"));
        enumMap.put((EnumMap) nx.a.INTERNAL_ERROR, (nx.a) f1Var.r("Internal error"));
        enumMap.put((EnumMap) nx.a.FLOW_CONTROL_ERROR, (nx.a) f1Var.r("Flow control error"));
        enumMap.put((EnumMap) nx.a.STREAM_CLOSED, (nx.a) f1Var.r("Stream closed"));
        enumMap.put((EnumMap) nx.a.FRAME_TOO_LARGE, (nx.a) f1Var.r("Frame too large"));
        enumMap.put((EnumMap) nx.a.REFUSED_STREAM, (nx.a) f1.f30571o.r("Refused stream"));
        enumMap.put((EnumMap) nx.a.CANCEL, (nx.a) f1.f30563g.r("Cancelled"));
        enumMap.put((EnumMap) nx.a.COMPRESSION_ERROR, (nx.a) f1Var.r("Compression error"));
        enumMap.put((EnumMap) nx.a.CONNECT_ERROR, (nx.a) f1Var.r("Connect error"));
        enumMap.put((EnumMap) nx.a.ENHANCE_YOUR_CALM, (nx.a) f1.f30568l.r("Enhance your calm"));
        enumMap.put((EnumMap) nx.a.INADEQUATE_SECURITY, (nx.a) f1.f30566j.r("Inadequate security"));
        return Collections.unmodifiableMap(enumMap);
    }

    private ox.b Q(InetSocketAddress inetSocketAddress, String str, String str2) {
        ox.a a11 = new a.b().k("https").h(inetSocketAddress.getHostName()).j(inetSocketAddress.getPort()).a();
        b.C0959b e11 = new b.C0959b().e(a11);
        b.C0959b d11 = e11.d("Host", a11.c() + ":" + a11.f()).d(NetworkConstantsKt.HEADER_USER_AGENT, this.f39571c);
        if (str != null && str2 != null) {
            d11.d("Proxy-Authorization", io.grpc.okhttp.internal.c.a(str, str2));
        }
        return d11.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Socket R(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) {
        Socket createSocket;
        try {
            if (inetSocketAddress2.getAddress() != null) {
                createSocket = this.A.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort());
            } else {
                createSocket = this.A.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            }
            createSocket.setTcpNoDelay(true);
            e0 l11 = okio.r.l(createSocket);
            okio.g c11 = okio.r.c(okio.r.h(createSocket));
            ox.b Q = Q(inetSocketAddress, str, str2);
            ox.a b11 = Q.b();
            c11.T(String.format("CONNECT %s:%d HTTP/1.1", b11.c(), Integer.valueOf(b11.f()))).T(FileUploadRequest.LINE_BREAK);
            int b12 = Q.a().b();
            for (int i11 = 0; i11 < b12; i11++) {
                c11.T(Q.a().a(i11)).T(": ").T(Q.a().c(i11)).T(FileUploadRequest.LINE_BREAK);
            }
            c11.T(FileUploadRequest.LINE_BREAK);
            c11.flush();
            io.grpc.okhttp.internal.j a11 = io.grpc.okhttp.internal.j.a(g0(l11));
            while (!g0(l11).equals("")) {
            }
            int i12 = a11.f31568b;
            if (i12 < 200 || i12 >= 300) {
                okio.f fVar = new okio.f();
                try {
                    createSocket.shutdownOutput();
                    l11.read(fVar, 1024L);
                } catch (IOException e11) {
                    fVar.T("Unable to read body: " + e11.toString());
                }
                try {
                    createSocket.close();
                } catch (IOException unused) {
                }
                throw f1.f30571o.r(String.format("Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s", Integer.valueOf(a11.f31568b), a11.f31569c, fVar.G0())).c();
            }
            return createSocket;
        } catch (IOException e12) {
            throw f1.f30571o.r("Failed trying to connect with proxy").q(e12).c();
        }
    }

    private Throwable Y() {
        synchronized (this.f39579k) {
            f1 f1Var = this.f39590v;
            if (f1Var != null) {
                return f1Var.c();
            }
            return f1.f30571o.r("Connection closed").c();
        }
    }

    private void a0() {
        synchronized (this.f39579k) {
            this.P.g(new b(this));
        }
    }

    private void d0(g gVar) {
        if (this.f39594z && this.F.isEmpty() && this.f39582n.isEmpty()) {
            this.f39594z = false;
            b1 b1Var = this.H;
            if (b1Var != null) {
                b1Var.p();
            }
        }
        if (gVar.w()) {
            this.Q.e(gVar, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(nx.a aVar, String str) {
        k0(0, aVar, p0(aVar).f(str));
    }

    private static String g0(e0 e0Var) {
        okio.f fVar = new okio.f();
        while (e0Var.read(fVar, 1L) != -1) {
            if (fVar.J(fVar.P0() - 1) == 10) {
                return fVar.f0();
            }
        }
        throw new EOFException("\\n not found: " + fVar.j1().n());
    }

    private void i0() {
        synchronized (this.f39579k) {
            this.f39577i.connectionPreface();
            nx.i iVar = new nx.i();
            l.c(iVar, 7, this.f39574f);
            this.f39577i.B0(iVar);
            int i11 = this.f39574f;
            if (i11 > 65535) {
                this.f39577i.windowUpdate(0, i11 - Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            }
        }
    }

    private void j0(g gVar) {
        if (!this.f39594z) {
            this.f39594z = true;
            b1 b1Var = this.H;
            if (b1Var != null) {
                b1Var.o();
            }
        }
        if (gVar.w()) {
            this.Q.e(gVar, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(int i11, nx.a aVar, f1 f1Var) {
        synchronized (this.f39579k) {
            if (this.f39590v == null) {
                this.f39590v = f1Var;
                this.f39576h.a(f1Var);
            }
            if (aVar != null && !this.f39591w) {
                this.f39591w = true;
                this.f39577i.n1(0, aVar, new byte[0]);
            }
            Iterator<Map.Entry<Integer, g>> it2 = this.f39582n.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<Integer, g> next = it2.next();
                if (next.getKey().intValue() > i11) {
                    it2.remove();
                    next.getValue().x().M(f1Var, r.a.REFUSED, false, new r0());
                    d0(next.getValue());
                }
            }
            for (g gVar : this.F) {
                gVar.x().M(f1Var, r.a.MISCARRIED, true, new r0());
                d0(gVar);
            }
            this.F.clear();
            n0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l0() {
        boolean z11 = false;
        while (!this.F.isEmpty() && this.f39582n.size() < this.E) {
            m0(this.F.poll());
            z11 = true;
        }
        return z11;
    }

    private void m0(g gVar) {
        u.v(gVar.O() == -1, "StreamId already assigned");
        this.f39582n.put(Integer.valueOf(this.f39581m), gVar);
        j0(gVar);
        gVar.x().d0(this.f39581m);
        if ((gVar.N() != s0.d.UNARY && gVar.N() != s0.d.SERVER_STREAMING) || gVar.R()) {
            this.f39577i.flush();
        }
        int i11 = this.f39581m;
        if (i11 >= 2147483645) {
            this.f39581m = Integer.MAX_VALUE;
            k0(Integer.MAX_VALUE, nx.a.NO_ERROR, f1.f30571o.r("Stream ids exhausted"));
            return;
        }
        this.f39581m = i11 + 2;
    }

    private void n0() {
        if (this.f39590v == null || !this.f39582n.isEmpty() || !this.F.isEmpty() || this.f39593y) {
            return;
        }
        this.f39593y = true;
        b1 b1Var = this.H;
        if (b1Var != null) {
            b1Var.r();
        }
        u0 u0Var = this.f39592x;
        if (u0Var != null) {
            u0Var.f(Y());
            this.f39592x = null;
        }
        if (!this.f39591w) {
            this.f39591w = true;
            this.f39577i.n1(0, nx.a.NO_ERROR, new byte[0]);
        }
        this.f39577i.close();
    }

    static f1 p0(nx.a aVar) {
        f1 f1Var = V.get(aVar);
        if (f1Var != null) {
            return f1Var;
        }
        f1 f1Var2 = f1.f30564h;
        return f1Var2.r("Unknown http2 error code: " + aVar.httpCode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S(boolean z11, long j11, long j12, boolean z12) {
        this.I = z11;
        this.J = j11;
        this.K = j12;
        this.L = z12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(int i11, f1 f1Var, r.a aVar, boolean z11, nx.a aVar2, r0 r0Var) {
        synchronized (this.f39579k) {
            g remove = this.f39582n.remove(Integer.valueOf(i11));
            if (remove != null) {
                if (aVar2 != null) {
                    this.f39577i.k(i11, nx.a.CANCEL);
                }
                if (f1Var != null) {
                    g.b x11 = remove.x();
                    if (r0Var == null) {
                        r0Var = new r0();
                    }
                    x11.M(f1Var, aVar, z11, r0Var);
                }
                if (!l0()) {
                    n0();
                    d0(remove);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g[] U() {
        g[] gVarArr;
        synchronized (this.f39579k) {
            gVarArr = (g[]) this.f39582n.values().toArray(X);
        }
        return gVarArr;
    }

    public io.grpc.a V() {
        return this.f39589u;
    }

    String W() {
        URI b11 = q0.b(this.f39570b);
        if (b11.getHost() != null) {
            return b11.getHost();
        }
        return this.f39570b;
    }

    int X() {
        URI b11 = q0.b(this.f39570b);
        if (b11.getPort() != -1) {
            return b11.getPort();
        }
        return this.f39569a.getPort();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g Z(int i11) {
        g gVar;
        synchronized (this.f39579k) {
            gVar = this.f39582n.get(Integer.valueOf(i11));
        }
        return gVar;
    }

    @Override // mx.b.a
    public void a(Throwable th2) {
        u.p(th2, "failureCause");
        k0(0, nx.a.INTERNAL_ERROR, f1.f30571o.q(th2));
    }

    @Override // io.grpc.internal.j1
    public void b(f1 f1Var) {
        f(f1Var);
        synchronized (this.f39579k) {
            Iterator<Map.Entry<Integer, g>> it2 = this.f39582n.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<Integer, g> next = it2.next();
                it2.remove();
                next.getValue().x().N(f1Var, false, new r0());
                d0(next.getValue());
            }
            for (g gVar : this.F) {
                gVar.x().M(f1Var, r.a.MISCARRIED, true, new r0());
                d0(gVar);
            }
            this.F.clear();
            n0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b0() {
        return this.B == null;
    }

    @Override // io.grpc.k0
    public g0 c() {
        return this.f39580l;
    }

    boolean c0(int i11) {
        boolean z11;
        synchronized (this.f39579k) {
            z11 = true;
            if (i11 >= this.f39581m || (i11 & 1) != 1) {
                z11 = false;
            }
        }
        return z11;
    }

    @Override // io.grpc.internal.s
    public void d(s.a aVar, Executor executor) {
        long nextLong;
        synchronized (this.f39579k) {
            boolean z11 = true;
            u.u(this.f39577i != null);
            if (this.f39593y) {
                u0.g(aVar, executor, Y());
                return;
            }
            u0 u0Var = this.f39592x;
            if (u0Var != null) {
                nextLong = 0;
                z11 = false;
            } else {
                nextLong = this.f39572d.nextLong();
                y yVar = this.f39573e.get();
                yVar.g();
                u0 u0Var2 = new u0(nextLong, yVar);
                this.f39592x = u0Var2;
                this.P.b();
                u0Var = u0Var2;
            }
            if (z11) {
                this.f39577i.ping(false, (int) (nextLong >>> 32), (int) nextLong);
            }
            u0Var.a(aVar, executor);
        }
    }

    @Override // io.grpc.internal.s
    /* renamed from: e0 */
    public g e(s0<?, ?> s0Var, r0 r0Var, io.grpc.c cVar, io.grpc.k[] kVarArr) {
        u.p(s0Var, "method");
        u.p(r0Var, "headers");
        h2 h11 = h2.h(kVarArr, V(), r0Var);
        synchronized (this.f39579k) {
            try {
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                return new g(s0Var, r0Var, this.f39577i, this, this.f39578j, this.f39579k, this.f39586r, this.f39574f, this.f39570b, this.f39571c, h11, this.P, cVar, this.O);
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    @Override // io.grpc.internal.j1
    public void f(f1 f1Var) {
        synchronized (this.f39579k) {
            if (this.f39590v != null) {
                return;
            }
            this.f39590v = f1Var;
            this.f39576h.a(f1Var);
            n0();
        }
    }

    @Override // io.grpc.internal.j1
    public Runnable g(j1.a aVar) {
        this.f39576h = (j1.a) u.p(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (this.I) {
            b1 b1Var = new b1(new b1.c(this), this.f39585q, this.J, this.K, this.L);
            this.H = b1Var;
            b1Var.q();
        }
        mx.a J = mx.a.J(this.f39584p, this);
        nx.c b11 = this.f39575g.b(okio.r.c(J), true);
        synchronized (this.f39579k) {
            mx.b bVar = new mx.b(this, b11);
            this.f39577i = bVar;
            this.f39578j = new p(this, bVar);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f39584p.execute(new c(countDownLatch, J));
        try {
            i0();
            countDownLatch.countDown();
            this.f39584p.execute(new d());
            return null;
        } catch (Throwable th2) {
            countDownLatch.countDown();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h0(g gVar) {
        this.F.remove(gVar);
        d0(gVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o0(g gVar) {
        if (this.f39590v != null) {
            gVar.x().M(this.f39590v, r.a.MISCARRIED, true, new r0());
        } else if (this.f39582n.size() >= this.E) {
            this.F.add(gVar);
            j0(gVar);
        } else {
            m0(gVar);
        }
    }

    public String toString() {
        return com.google.common.base.o.c(this).c("logId", this.f39580l.d()).d("address", this.f39569a).toString();
    }

    private h(e.f fVar, InetSocketAddress inetSocketAddress, String str, String str2, io.grpc.a aVar, com.google.common.base.a0<y> a0Var, nx.j jVar, a0 a0Var2, Runnable runnable) {
        this.f39572d = new Random();
        this.f39579k = new Object();
        this.f39582n = new HashMap();
        this.E = 0;
        this.F = new LinkedList();
        this.Q = new a();
        this.f39569a = (InetSocketAddress) u.p(inetSocketAddress, "address");
        this.f39570b = str;
        this.f39586r = fVar.f39544j;
        this.f39574f = fVar.f39548n;
        this.f39583o = (Executor) u.p(fVar.f39536b, "executor");
        this.f39584p = new c2(fVar.f39536b);
        this.f39585q = (ScheduledExecutorService) u.p(fVar.f39538d, "scheduledExecutorService");
        this.f39581m = 3;
        SocketFactory socketFactory = fVar.f39540f;
        this.A = socketFactory == null ? SocketFactory.getDefault() : socketFactory;
        this.B = fVar.f39541g;
        this.C = fVar.f39542h;
        this.G = (io.grpc.okhttp.internal.b) u.p(fVar.f39543i, "connectionSpec");
        this.f39573e = (com.google.common.base.a0) u.p(a0Var, "stopwatchFactory");
        this.f39575g = (nx.j) u.p(jVar, "variant");
        this.f39571c = q0.g("okhttp", str2);
        this.S = a0Var2;
        this.M = (Runnable) u.p(runnable, "tooManyPingsRunnable");
        this.N = fVar.f39550p;
        this.P = fVar.f39539e.a();
        this.f39580l = g0.a(h.class, inetSocketAddress.toString());
        this.f39589u = io.grpc.a.c().d(p0.f31149b, aVar).a();
        this.O = fVar.f39551q;
        a0();
    }
}