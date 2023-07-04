package io.sentry.protocol;

import com.stripe.android.networking.FraudDetectionData;
import io.sentry.d0;
import io.sentry.d2;
import io.sentry.n0;
import io.sentry.o3;
import io.sentry.protocol.r;
import io.sentry.t0;
import io.sentry.t3;
import io.sentry.u3;
import io.sentry.v0;
import io.sentry.x0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class v extends d2 implements x0 {

    /* renamed from: o  reason: collision with root package name */
    private String f32517o;

    /* renamed from: p  reason: collision with root package name */
    private Double f32518p;

    /* renamed from: q  reason: collision with root package name */
    private Double f32519q;

    /* renamed from: t  reason: collision with root package name */
    private final List<r> f32520t;

    /* renamed from: w  reason: collision with root package name */
    private final Map<String, g> f32521w;

    /* renamed from: x  reason: collision with root package name */
    private Map<String, Object> f32522x;

    /* loaded from: classes5.dex */
    public static final class a implements n0<v> {
        @Override // io.sentry.n0
        /* renamed from: b */
        public v a(t0 t0Var, d0 d0Var) {
            t0Var.g();
            v vVar = new v("", Double.valueOf(0.0d), null, new ArrayList(), new HashMap());
            d2.a aVar = new d2.a();
            ConcurrentHashMap concurrentHashMap = null;
            while (t0Var.G0() == io.sentry.vendor.gson.stream.b.NAME) {
                String p02 = t0Var.p0();
                p02.hashCode();
                char c11 = 65535;
                switch (p02.hashCode()) {
                    case -1526966919:
                        if (p02.equals("start_timestamp")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case -362243017:
                        if (p02.equals("measurements")) {
                            c11 = 1;
                            break;
                        }
                        break;
                    case 3575610:
                        if (p02.equals("type")) {
                            c11 = 2;
                            break;
                        }
                        break;
                    case 55126294:
                        if (p02.equals(FraudDetectionData.KEY_TIMESTAMP)) {
                            c11 = 3;
                            break;
                        }
                        break;
                    case 109638249:
                        if (p02.equals("spans")) {
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
                        try {
                            Double v12 = t0Var.v1();
                            if (v12 == null) {
                                break;
                            } else {
                                vVar.f32518p = v12;
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            Date t12 = t0Var.t1(d0Var);
                            if (t12 == null) {
                                break;
                            } else {
                                vVar.f32518p = Double.valueOf(io.sentry.g.a(t12));
                                break;
                            }
                        }
                    case 1:
                        Map map = (Map) t0Var.L1();
                        if (map == null) {
                            break;
                        } else {
                            vVar.f32521w.putAll(map);
                            break;
                        }
                    case 2:
                        t0Var.D0();
                        break;
                    case 3:
                        try {
                            Double v13 = t0Var.v1();
                            if (v13 == null) {
                                break;
                            } else {
                                vVar.f32519q = v13;
                                break;
                            }
                        } catch (NumberFormatException unused2) {
                            Date t13 = t0Var.t1(d0Var);
                            if (t13 == null) {
                                break;
                            } else {
                                vVar.f32519q = Double.valueOf(io.sentry.g.a(t13));
                                break;
                            }
                        }
                    case 4:
                        List F1 = t0Var.F1(d0Var, new r.a());
                        if (F1 == null) {
                            break;
                        } else {
                            vVar.f32520t.addAll(F1);
                            break;
                        }
                    case 5:
                        vVar.f32517o = t0Var.N1();
                        break;
                    default:
                        if (!aVar.a(vVar, p02, t0Var, d0Var)) {
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
            vVar.m0(concurrentHashMap);
            t0Var.C();
            return vVar;
        }
    }

    public v(o3 o3Var) {
        super(o3Var.b());
        this.f32520t = new ArrayList();
        this.f32521w = new HashMap();
        rz.j.a(o3Var, "sentryTracer is required");
        this.f32518p = Double.valueOf(io.sentry.g.a(o3Var.t()));
        this.f32519q = o3Var.s();
        this.f32517o = o3Var.getName();
        for (t3 t3Var : o3Var.q()) {
            if (Boolean.TRUE.equals(t3Var.w())) {
                this.f32520t.add(new r(t3Var));
            }
        }
        c B = B();
        u3 h11 = o3Var.h();
        B.n(new u3(h11.h(), h11.e(), h11.c(), h11.b(), h11.a(), h11.d(), h11.f()));
        for (Map.Entry<String, String> entry : h11.g().entrySet()) {
            Z(entry.getKey(), entry.getValue());
        }
        Map<String, Object> r11 = o3Var.r();
        if (r11 != null) {
            for (Map.Entry<String, Object> entry2 : r11.entrySet()) {
                S(entry2.getKey(), entry2.getValue());
            }
        }
    }

    private BigDecimal h0(Double d11) {
        return BigDecimal.valueOf(d11.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public Map<String, g> i0() {
        return this.f32521w;
    }

    public List<r> j0() {
        return this.f32520t;
    }

    public boolean k0() {
        return this.f32519q != null;
    }

    public boolean l0() {
        u3 f11 = B().f();
        return f11 != null && Boolean.TRUE.equals(f11.d());
    }

    public void m0(Map<String, Object> map) {
        this.f32522x = map;
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.l();
        if (this.f32517o != null) {
            v0Var.P0("transaction").G0(this.f32517o);
        }
        v0Var.P0("start_timestamp").Q0(d0Var, h0(this.f32518p));
        if (this.f32519q != null) {
            v0Var.P0(FraudDetectionData.KEY_TIMESTAMP).Q0(d0Var, h0(this.f32519q));
        }
        if (!this.f32520t.isEmpty()) {
            v0Var.P0("spans").Q0(d0Var, this.f32520t);
        }
        v0Var.P0("type").G0("transaction");
        if (!this.f32521w.isEmpty()) {
            v0Var.P0("measurements").Q0(d0Var, this.f32521w);
        }
        new d2.b().a(this, v0Var, d0Var);
        Map<String, Object> map = this.f32522x;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f32522x.get(str);
                v0Var.P0(str);
                v0Var.Q0(d0Var, obj);
            }
        }
        v0Var.C();
    }

    @ApiStatus.Internal
    public v(String str, Double d11, Double d12, List<r> list, Map<String, g> map) {
        ArrayList arrayList = new ArrayList();
        this.f32520t = arrayList;
        HashMap hashMap = new HashMap();
        this.f32521w = hashMap;
        this.f32517o = str;
        this.f32518p = d11;
        this.f32519q = d12;
        arrayList.addAll(list);
        hashMap.putAll(map);
    }
}