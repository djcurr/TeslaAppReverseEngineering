package io.sentry;

import io.sentry.protocol.o;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Experimental
/* loaded from: classes5.dex */
public final class c4 implements x0 {

    /* renamed from: a  reason: collision with root package name */
    private io.sentry.protocol.o f32211a;

    /* renamed from: b  reason: collision with root package name */
    private String f32212b;

    /* renamed from: c  reason: collision with root package name */
    private String f32213c;

    /* renamed from: d  reason: collision with root package name */
    private String f32214d;

    /* renamed from: e  reason: collision with root package name */
    private b f32215e;

    /* renamed from: f  reason: collision with root package name */
    private String f32216f;

    /* renamed from: g  reason: collision with root package name */
    private Map<String, Object> f32217g;

    /* loaded from: classes5.dex */
    public static final class a implements n0<c4> {
        private Exception c(String str, d0 d0Var) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            d0Var.b(f3.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.n0
        /* renamed from: b */
        public c4 a(t0 t0Var, d0 d0Var) {
            t0Var.g();
            ConcurrentHashMap concurrentHashMap = null;
            io.sentry.protocol.o oVar = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            b bVar = null;
            String str4 = null;
            while (t0Var.G0() == io.sentry.vendor.gson.stream.b.NAME) {
                String p02 = t0Var.p0();
                p02.hashCode();
                char c11 = 65535;
                switch (p02.hashCode()) {
                    case -85904877:
                        if (p02.equals("environment")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case 3599307:
                        if (p02.equals("user")) {
                            c11 = 1;
                            break;
                        }
                        break;
                    case 1090594823:
                        if (p02.equals("release")) {
                            c11 = 2;
                            break;
                        }
                        break;
                    case 1270300245:
                        if (p02.equals("trace_id")) {
                            c11 = 3;
                            break;
                        }
                        break;
                    case 1904812937:
                        if (p02.equals("public_key")) {
                            c11 = 4;
                            break;
                        }
                        break;
                    case 2141246174:
                        if (p02.equals("transaction")) {
                            c11 = 5;
                            break;
                        }
                        break;
                }
                switch (c11) {
                    case 0:
                        str3 = t0Var.N1();
                        break;
                    case 1:
                        bVar = (b) t0Var.M1(d0Var, new b.a());
                        break;
                    case 2:
                        str2 = t0Var.N1();
                        break;
                    case 3:
                        oVar = new o.a().a(t0Var, d0Var);
                        break;
                    case 4:
                        str = t0Var.D0();
                        break;
                    case 5:
                        str4 = t0Var.N1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        t0Var.P1(d0Var, concurrentHashMap, p02);
                        break;
                }
            }
            if (oVar != null) {
                if (str != null) {
                    c4 c4Var = new c4(oVar, str, str2, str3, bVar, str4);
                    c4Var.a(concurrentHashMap);
                    t0Var.C();
                    return c4Var;
                }
                throw c("public_key", d0Var);
            }
            throw c("trace_id", d0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c4(io.sentry.protocol.o oVar, String str) {
        this(oVar, str, null, null, null, null);
    }

    public void a(Map<String, Object> map) {
        this.f32217g = map;
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.l();
        v0Var.P0("trace_id").Q0(d0Var, this.f32211a);
        v0Var.P0("public_key").G0(this.f32212b);
        if (this.f32213c != null) {
            v0Var.P0("release").G0(this.f32213c);
        }
        if (this.f32214d != null) {
            v0Var.P0("environment").G0(this.f32214d);
        }
        b bVar = this.f32215e;
        if (bVar != null && (bVar.f32218a != null || this.f32215e.f32219b != null || this.f32215e.f32220c != null)) {
            v0Var.P0("user").Q0(d0Var, this.f32215e);
        }
        if (this.f32216f != null) {
            v0Var.P0("transaction").G0(this.f32216f);
        }
        Map<String, Object> map = this.f32217g;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f32217g.get(str);
                v0Var.P0(str);
                v0Var.Q0(d0Var, obj);
            }
        }
        v0Var.C();
    }

    c4(io.sentry.protocol.o oVar, String str, String str2, String str3, b bVar, String str4) {
        this.f32211a = oVar;
        this.f32212b = str;
        this.f32213c = str2;
        this.f32214d = str3;
        this.f32215e = bVar;
        this.f32216f = str4;
    }

    /* loaded from: classes5.dex */
    public static final class b implements x0 {

        /* renamed from: a  reason: collision with root package name */
        private String f32218a;

        /* renamed from: b  reason: collision with root package name */
        private String f32219b;

        /* renamed from: c  reason: collision with root package name */
        private Map<String, Object> f32220c;

        /* loaded from: classes5.dex */
        public static final class a implements n0<b> {
            @Override // io.sentry.n0
            /* renamed from: b */
            public b a(t0 t0Var, d0 d0Var) {
                t0Var.g();
                String str = null;
                String str2 = null;
                ConcurrentHashMap concurrentHashMap = null;
                while (t0Var.G0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String p02 = t0Var.p0();
                    p02.hashCode();
                    if (p02.equals("id")) {
                        str = t0Var.N1();
                    } else if (!p02.equals("segment")) {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        t0Var.P1(d0Var, concurrentHashMap, p02);
                    } else {
                        str2 = t0Var.N1();
                    }
                }
                b bVar = new b(str, str2);
                bVar.e(concurrentHashMap);
                t0Var.C();
                return bVar;
            }
        }

        b(String str, String str2) {
            this.f32218a = str;
            this.f32219b = str2;
        }

        private static String d(io.sentry.protocol.w wVar) {
            Map<String, String> i11 = wVar.i();
            if (i11 != null) {
                return i11.get("segment");
            }
            return null;
        }

        public void e(Map<String, Object> map) {
            this.f32220c = map;
        }

        @Override // io.sentry.x0
        public void serialize(v0 v0Var, d0 d0Var) {
            v0Var.l();
            if (this.f32218a != null) {
                v0Var.P0("id").G0(this.f32218a);
            }
            if (this.f32219b != null) {
                v0Var.P0("segment").G0(this.f32219b);
            }
            Map<String, Object> map = this.f32220c;
            if (map != null) {
                for (String str : map.keySet()) {
                    Object obj = this.f32220c.get(str);
                    v0Var.P0(str);
                    v0Var.Q0(d0Var, obj);
                }
            }
            v0Var.C();
        }

        public b(io.sentry.protocol.w wVar) {
            if (wVar != null) {
                this.f32218a = wVar.g();
                this.f32219b = d(wVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c4(j0 j0Var, io.sentry.protocol.w wVar, g3 g3Var) {
        this(j0Var.h().h(), new k(g3Var.getDsn()).a(), g3Var.getRelease(), g3Var.getEnvironment(), wVar != null ? new b(wVar) : null, j0Var.getName());
    }
}