package io.sentry;

import com.stripe.android.networking.FraudDetectionData;
import io.sentry.d2;
import io.sentry.f3;
import io.sentry.protocol.d;
import io.sentry.protocol.i;
import io.sentry.protocol.n;
import io.sentry.protocol.u;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class b3 extends d2 implements x0 {
    private Map<String, Object> A;
    private Map<String, String> B;
    private io.sentry.protocol.d C;

    /* renamed from: o  reason: collision with root package name */
    private Date f32191o;

    /* renamed from: p  reason: collision with root package name */
    private io.sentry.protocol.i f32192p;

    /* renamed from: q  reason: collision with root package name */
    private String f32193q;

    /* renamed from: t  reason: collision with root package name */
    private p3<io.sentry.protocol.u> f32194t;

    /* renamed from: w  reason: collision with root package name */
    private p3<io.sentry.protocol.n> f32195w;

    /* renamed from: x  reason: collision with root package name */
    private f3 f32196x;

    /* renamed from: y  reason: collision with root package name */
    private String f32197y;

    /* renamed from: z  reason: collision with root package name */
    private List<String> f32198z;

    /* loaded from: classes5.dex */
    public static final class a implements n0<b3> {
        @Override // io.sentry.n0
        /* renamed from: b */
        public b3 a(t0 t0Var, d0 d0Var) {
            t0Var.g();
            b3 b3Var = new b3();
            d2.a aVar = new d2.a();
            ConcurrentHashMap concurrentHashMap = null;
            while (t0Var.G0() == io.sentry.vendor.gson.stream.b.NAME) {
                String p02 = t0Var.p0();
                p02.hashCode();
                char c11 = 65535;
                switch (p02.hashCode()) {
                    case -1840434063:
                        if (p02.equals("debug_meta")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case -1375934236:
                        if (p02.equals("fingerprint")) {
                            c11 = 1;
                            break;
                        }
                        break;
                    case -1337936983:
                        if (p02.equals("threads")) {
                            c11 = 2;
                            break;
                        }
                        break;
                    case -1097337456:
                        if (p02.equals("logger")) {
                            c11 = 3;
                            break;
                        }
                        break;
                    case 55126294:
                        if (p02.equals(FraudDetectionData.KEY_TIMESTAMP)) {
                            c11 = 4;
                            break;
                        }
                        break;
                    case 102865796:
                        if (p02.equals("level")) {
                            c11 = 5;
                            break;
                        }
                        break;
                    case 954925063:
                        if (p02.equals("message")) {
                            c11 = 6;
                            break;
                        }
                        break;
                    case 1227433863:
                        if (p02.equals("modules")) {
                            c11 = 7;
                            break;
                        }
                        break;
                    case 1481625679:
                        if (p02.equals("exception")) {
                            c11 = '\b';
                            break;
                        }
                        break;
                    case 2141246174:
                        if (p02.equals("transaction")) {
                            c11 = '\t';
                            break;
                        }
                        break;
                }
                switch (c11) {
                    case 0:
                        b3Var.C = (io.sentry.protocol.d) t0Var.M1(d0Var, new d.a());
                        break;
                    case 1:
                        List list = (List) t0Var.L1();
                        if (list == null) {
                            break;
                        } else {
                            b3Var.f32198z = list;
                            break;
                        }
                    case 2:
                        t0Var.g();
                        t0Var.p0();
                        b3Var.f32194t = new p3(t0Var.F1(d0Var, new u.a()));
                        t0Var.C();
                        break;
                    case 3:
                        b3Var.f32193q = t0Var.N1();
                        break;
                    case 4:
                        Date t12 = t0Var.t1(d0Var);
                        if (t12 == null) {
                            break;
                        } else {
                            b3Var.f32191o = t12;
                            break;
                        }
                    case 5:
                        b3Var.f32196x = (f3) t0Var.M1(d0Var, new f3.a());
                        break;
                    case 6:
                        b3Var.f32192p = (io.sentry.protocol.i) t0Var.M1(d0Var, new i.a());
                        break;
                    case 7:
                        b3Var.B = rz.a.b((Map) t0Var.L1());
                        break;
                    case '\b':
                        t0Var.g();
                        t0Var.p0();
                        b3Var.f32195w = new p3(t0Var.F1(d0Var, new n.a()));
                        t0Var.C();
                        break;
                    case '\t':
                        b3Var.f32197y = t0Var.N1();
                        break;
                    default:
                        if (!aVar.a(b3Var, p02, t0Var, d0Var)) {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            t0Var.P1(d0Var, concurrentHashMap, p02);
                            break;
                        } else {
                            break;
                        }
                }
            }
            b3Var.z0(concurrentHashMap);
            t0Var.C();
            return b3Var;
        }
    }

    b3(io.sentry.protocol.o oVar, Date date) {
        super(oVar);
        this.f32191o = date;
    }

    public io.sentry.protocol.d m0() {
        return this.C;
    }

    public List<io.sentry.protocol.n> n0() {
        p3<io.sentry.protocol.n> p3Var = this.f32195w;
        if (p3Var == null) {
            return null;
        }
        return p3Var.a();
    }

    public List<String> o0() {
        return this.f32198z;
    }

    public List<io.sentry.protocol.u> p0() {
        p3<io.sentry.protocol.u> p3Var = this.f32194t;
        if (p3Var != null) {
            return p3Var.a();
        }
        return null;
    }

    public String q0() {
        return this.f32197y;
    }

    public boolean r0() {
        p3<io.sentry.protocol.n> p3Var = this.f32195w;
        if (p3Var != null) {
            for (io.sentry.protocol.n nVar : p3Var.a()) {
                if (nVar.g() != null && nVar.g().h() != null && !nVar.g().h().booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public boolean s0() {
        p3<io.sentry.protocol.n> p3Var = this.f32195w;
        return (p3Var == null || p3Var.a().isEmpty()) ? false : true;
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.l();
        v0Var.P0(FraudDetectionData.KEY_TIMESTAMP).Q0(d0Var, this.f32191o);
        if (this.f32192p != null) {
            v0Var.P0("message").Q0(d0Var, this.f32192p);
        }
        if (this.f32193q != null) {
            v0Var.P0("logger").G0(this.f32193q);
        }
        p3<io.sentry.protocol.u> p3Var = this.f32194t;
        if (p3Var != null && !p3Var.a().isEmpty()) {
            v0Var.P0("threads");
            v0Var.l();
            v0Var.P0("values").Q0(d0Var, this.f32194t.a());
            v0Var.C();
        }
        p3<io.sentry.protocol.n> p3Var2 = this.f32195w;
        if (p3Var2 != null && !p3Var2.a().isEmpty()) {
            v0Var.P0("exception");
            v0Var.l();
            v0Var.P0("values").Q0(d0Var, this.f32195w.a());
            v0Var.C();
        }
        if (this.f32196x != null) {
            v0Var.P0("level").Q0(d0Var, this.f32196x);
        }
        if (this.f32197y != null) {
            v0Var.P0("transaction").G0(this.f32197y);
        }
        if (this.f32198z != null) {
            v0Var.P0("fingerprint").Q0(d0Var, this.f32198z);
        }
        if (this.B != null) {
            v0Var.P0("modules").Q0(d0Var, this.B);
        }
        if (this.C != null) {
            v0Var.P0("debug_meta").Q0(d0Var, this.C);
        }
        new d2.b().a(this, v0Var, d0Var);
        Map<String, Object> map = this.A;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.A.get(str);
                v0Var.P0(str);
                v0Var.Q0(d0Var, obj);
            }
        }
        v0Var.C();
    }

    public void t0(io.sentry.protocol.d dVar) {
        this.C = dVar;
    }

    public void u0(List<io.sentry.protocol.n> list) {
        this.f32195w = new p3<>(list);
    }

    public void v0(List<String> list) {
        this.f32198z = list != null ? new ArrayList(list) : null;
    }

    public void w0(f3 f3Var) {
        this.f32196x = f3Var;
    }

    public void x0(List<io.sentry.protocol.u> list) {
        this.f32194t = new p3<>(list);
    }

    public void y0(String str) {
        this.f32197y = str;
    }

    public void z0(Map<String, Object> map) {
        this.A = map;
    }

    public b3(Throwable th2) {
        this();
        this.f32240j = th2;
    }

    public b3() {
        this(new io.sentry.protocol.o(), g.b());
    }
}