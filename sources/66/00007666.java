package io.grpc.internal;

import ch.qos.logback.core.util.FileSize;
import io.grpc.internal.e0;
import io.grpc.t0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class g1 extends io.grpc.q0<g1> {
    private static final Logger G = Logger.getLogger(g1.class.getName());
    static final long H = TimeUnit.MINUTES.toMillis(30);
    static final long I = TimeUnit.SECONDS.toMillis(1);
    private static final o1<? extends Executor> J = f2.c(q0.f31172o);
    private static final io.grpc.v K = io.grpc.v.c();
    private static final io.grpc.o L = io.grpc.o.a();
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private final c E;
    private final b F;

    /* renamed from: a  reason: collision with root package name */
    o1<? extends Executor> f30939a;

    /* renamed from: b  reason: collision with root package name */
    o1<? extends Executor> f30940b;

    /* renamed from: c  reason: collision with root package name */
    private final List<io.grpc.h> f30941c;

    /* renamed from: d  reason: collision with root package name */
    final io.grpc.v0 f30942d;

    /* renamed from: e  reason: collision with root package name */
    t0.d f30943e;

    /* renamed from: f  reason: collision with root package name */
    final String f30944f;

    /* renamed from: g  reason: collision with root package name */
    final io.grpc.b f30945g;

    /* renamed from: h  reason: collision with root package name */
    String f30946h;

    /* renamed from: i  reason: collision with root package name */
    String f30947i;

    /* renamed from: j  reason: collision with root package name */
    String f30948j;

    /* renamed from: k  reason: collision with root package name */
    boolean f30949k;

    /* renamed from: l  reason: collision with root package name */
    io.grpc.v f30950l;

    /* renamed from: m  reason: collision with root package name */
    io.grpc.o f30951m;

    /* renamed from: n  reason: collision with root package name */
    long f30952n;

    /* renamed from: o  reason: collision with root package name */
    int f30953o;

    /* renamed from: p  reason: collision with root package name */
    int f30954p;

    /* renamed from: q  reason: collision with root package name */
    long f30955q;

    /* renamed from: r  reason: collision with root package name */
    long f30956r;

    /* renamed from: s  reason: collision with root package name */
    boolean f30957s;

    /* renamed from: t  reason: collision with root package name */
    io.grpc.b0 f30958t;

    /* renamed from: u  reason: collision with root package name */
    int f30959u;

    /* renamed from: v  reason: collision with root package name */
    Map<String, ?> f30960v;

    /* renamed from: w  reason: collision with root package name */
    boolean f30961w;

    /* renamed from: x  reason: collision with root package name */
    io.grpc.y0 f30962x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f30963y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f30964z;

    /* loaded from: classes5.dex */
    public interface b {
        int a();
    }

    /* loaded from: classes5.dex */
    public interface c {
        t a();
    }

    /* loaded from: classes5.dex */
    private static final class d implements b {
        private d() {
        }

        @Override // io.grpc.internal.g1.b
        public int a() {
            return 443;
        }
    }

    public g1(String str, c cVar, b bVar) {
        this(str, null, null, cVar, bVar);
    }

    @Override // io.grpc.q0
    public io.grpc.p0 a() {
        return new h1(new f1(this, this.E.a(), new e0.a(), f2.c(q0.f31172o), q0.f31174q, c(), k2.f31033a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.F.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.util.List<io.grpc.h> c() {
        /*
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<io.grpc.h> r1 = r12.f30941c
            r0.<init>(r1)
            boolean r1 = r12.f30963y
            java.lang.String r2 = "getClientInterceptor"
            r3 = 0
            r4 = 0
            java.lang.String r5 = "Unable to apply census stats"
            if (r1 == 0) goto L7d
            java.lang.String r1 = "io.grpc.census.InternalCensusStatsAccessor"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L66 java.lang.ClassNotFoundException -> L6f
            r6 = 4
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L66 java.lang.ClassNotFoundException -> L6f
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L66 java.lang.ClassNotFoundException -> L6f
            r7[r4] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L66 java.lang.ClassNotFoundException -> L6f
            r9 = 1
            r7[r9] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L66 java.lang.ClassNotFoundException -> L6f
            r10 = 2
            r7[r10] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L66 java.lang.ClassNotFoundException -> L6f
            r11 = 3
            r7[r11] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L66 java.lang.ClassNotFoundException -> L6f
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L66 java.lang.ClassNotFoundException -> L6f
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L66 java.lang.ClassNotFoundException -> L6f
            boolean r7 = r12.f30964z     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L66 java.lang.ClassNotFoundException -> L6f
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L66 java.lang.ClassNotFoundException -> L6f
            r6[r4] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L66 java.lang.ClassNotFoundException -> L6f
            boolean r7 = r12.A     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L66 java.lang.ClassNotFoundException -> L6f
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L66 java.lang.ClassNotFoundException -> L6f
            r6[r9] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L66 java.lang.ClassNotFoundException -> L6f
            boolean r7 = r12.B     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L66 java.lang.ClassNotFoundException -> L6f
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L66 java.lang.ClassNotFoundException -> L6f
            r6[r10] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L66 java.lang.ClassNotFoundException -> L6f
            boolean r7 = r12.C     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L66 java.lang.ClassNotFoundException -> L6f
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L66 java.lang.ClassNotFoundException -> L6f
            r6[r11] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L66 java.lang.ClassNotFoundException -> L6f
            java.lang.Object r1 = r1.invoke(r3, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L66 java.lang.ClassNotFoundException -> L6f
            io.grpc.h r1 = (io.grpc.h) r1     // Catch: java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L66 java.lang.ClassNotFoundException -> L6f
            goto L78
        L54:
            r1 = move-exception
            java.util.logging.Logger r6 = io.grpc.internal.g1.G
            java.util.logging.Level r7 = java.util.logging.Level.FINE
            r6.log(r7, r5, r1)
            goto L77
        L5d:
            r1 = move-exception
            java.util.logging.Logger r6 = io.grpc.internal.g1.G
            java.util.logging.Level r7 = java.util.logging.Level.FINE
            r6.log(r7, r5, r1)
            goto L77
        L66:
            r1 = move-exception
            java.util.logging.Logger r6 = io.grpc.internal.g1.G
            java.util.logging.Level r7 = java.util.logging.Level.FINE
            r6.log(r7, r5, r1)
            goto L77
        L6f:
            r1 = move-exception
            java.util.logging.Logger r6 = io.grpc.internal.g1.G
            java.util.logging.Level r7 = java.util.logging.Level.FINE
            r6.log(r7, r5, r1)
        L77:
            r1 = r3
        L78:
            if (r1 == 0) goto L7d
            r0.add(r4, r1)
        L7d:
            boolean r1 = r12.D
            if (r1 == 0) goto Lbf
            java.lang.String r1 = "io.grpc.census.InternalCensusTracingAccessor"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L97 java.lang.IllegalAccessException -> La0 java.lang.NoSuchMethodException -> La9 java.lang.ClassNotFoundException -> Lb2
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L97 java.lang.IllegalAccessException -> La0 java.lang.NoSuchMethodException -> La9 java.lang.ClassNotFoundException -> Lb2
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L97 java.lang.IllegalAccessException -> La0 java.lang.NoSuchMethodException -> La9 java.lang.ClassNotFoundException -> Lb2
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L97 java.lang.IllegalAccessException -> La0 java.lang.NoSuchMethodException -> La9 java.lang.ClassNotFoundException -> Lb2
            java.lang.Object r1 = r1.invoke(r3, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L97 java.lang.IllegalAccessException -> La0 java.lang.NoSuchMethodException -> La9 java.lang.ClassNotFoundException -> Lb2
            io.grpc.h r1 = (io.grpc.h) r1     // Catch: java.lang.reflect.InvocationTargetException -> L97 java.lang.IllegalAccessException -> La0 java.lang.NoSuchMethodException -> La9 java.lang.ClassNotFoundException -> Lb2
            r3 = r1
            goto Lba
        L97:
            r1 = move-exception
            java.util.logging.Logger r2 = io.grpc.internal.g1.G
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            r2.log(r6, r5, r1)
            goto Lba
        La0:
            r1 = move-exception
            java.util.logging.Logger r2 = io.grpc.internal.g1.G
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            r2.log(r6, r5, r1)
            goto Lba
        La9:
            r1 = move-exception
            java.util.logging.Logger r2 = io.grpc.internal.g1.G
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            r2.log(r6, r5, r1)
            goto Lba
        Lb2:
            r1 = move-exception
            java.util.logging.Logger r2 = io.grpc.internal.g1.G
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            r2.log(r6, r5, r1)
        Lba:
            if (r3 == 0) goto Lbf
            r0.add(r4, r3)
        Lbf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.g1.c():java.util.List");
    }

    public g1(String str, io.grpc.e eVar, io.grpc.b bVar, c cVar, b bVar2) {
        o1<? extends Executor> o1Var = J;
        this.f30939a = o1Var;
        this.f30940b = o1Var;
        this.f30941c = new ArrayList();
        io.grpc.v0 d11 = io.grpc.v0.d();
        this.f30942d = d11;
        this.f30943e = d11.c();
        this.f30948j = "pick_first";
        this.f30950l = K;
        this.f30951m = L;
        this.f30952n = H;
        this.f30953o = 5;
        this.f30954p = 5;
        this.f30955q = 16777216L;
        this.f30956r = FileSize.MB_COEFFICIENT;
        this.f30957s = true;
        this.f30958t = io.grpc.b0.g();
        this.f30961w = true;
        this.f30963y = true;
        this.f30964z = true;
        this.A = true;
        this.B = false;
        this.C = true;
        this.D = true;
        this.f30944f = (String) com.google.common.base.u.p(str, "target");
        this.f30945g = bVar;
        this.E = (c) com.google.common.base.u.p(cVar, "clientTransportFactoryBuilder");
        if (bVar2 != null) {
            this.F = bVar2;
        } else {
            this.F = new d();
        }
    }
}