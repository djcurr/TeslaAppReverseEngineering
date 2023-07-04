package io.sentry.protocol;

import com.stripe.android.core.networking.AnalyticsFields;
import io.sentry.d0;
import io.sentry.n0;
import io.sentry.t0;
import io.sentry.v0;
import io.sentry.x0;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class a implements x0 {

    /* renamed from: a  reason: collision with root package name */
    private String f32375a;

    /* renamed from: b  reason: collision with root package name */
    private Date f32376b;

    /* renamed from: c  reason: collision with root package name */
    private String f32377c;

    /* renamed from: d  reason: collision with root package name */
    private String f32378d;

    /* renamed from: e  reason: collision with root package name */
    private String f32379e;

    /* renamed from: f  reason: collision with root package name */
    private String f32380f;

    /* renamed from: g  reason: collision with root package name */
    private String f32381g;

    /* renamed from: h  reason: collision with root package name */
    private Map<String, String> f32382h;

    /* renamed from: i  reason: collision with root package name */
    private Map<String, Object> f32383i;

    /* renamed from: io.sentry.protocol.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0598a implements n0<a> {
        @Override // io.sentry.n0
        /* renamed from: b */
        public a a(t0 t0Var, d0 d0Var) {
            t0Var.g();
            a aVar = new a();
            ConcurrentHashMap concurrentHashMap = null;
            while (t0Var.G0() == io.sentry.vendor.gson.stream.b.NAME) {
                String p02 = t0Var.p0();
                p02.hashCode();
                char c11 = 65535;
                switch (p02.hashCode()) {
                    case -1898053579:
                        if (p02.equals("device_app_hash")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case -901870406:
                        if (p02.equals(AnalyticsFields.APP_VERSION)) {
                            c11 = 1;
                            break;
                        }
                        break;
                    case -470395285:
                        if (p02.equals("build_type")) {
                            c11 = 2;
                            break;
                        }
                        break;
                    case 746297735:
                        if (p02.equals("app_identifier")) {
                            c11 = 3;
                            break;
                        }
                        break;
                    case 791585128:
                        if (p02.equals("app_start_time")) {
                            c11 = 4;
                            break;
                        }
                        break;
                    case 1133704324:
                        if (p02.equals("permissions")) {
                            c11 = 5;
                            break;
                        }
                        break;
                    case 1167648233:
                        if (p02.equals(AnalyticsFields.APP_NAME)) {
                            c11 = 6;
                            break;
                        }
                        break;
                    case 1826866896:
                        if (p02.equals("app_build")) {
                            c11 = 7;
                            break;
                        }
                        break;
                }
                switch (c11) {
                    case 0:
                        aVar.f32377c = t0Var.N1();
                        break;
                    case 1:
                        aVar.f32380f = t0Var.N1();
                        break;
                    case 2:
                        aVar.f32378d = t0Var.N1();
                        break;
                    case 3:
                        aVar.f32375a = t0Var.N1();
                        break;
                    case 4:
                        aVar.f32376b = t0Var.t1(d0Var);
                        break;
                    case 5:
                        aVar.f32382h = rz.a.b((Map) t0Var.L1());
                        break;
                    case 6:
                        aVar.f32379e = t0Var.N1();
                        break;
                    case 7:
                        aVar.f32381g = t0Var.N1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        t0Var.P1(d0Var, concurrentHashMap, p02);
                        break;
                }
            }
            aVar.o(concurrentHashMap);
            t0Var.C();
            return aVar;
        }
    }

    public a() {
    }

    public void i(String str) {
        this.f32381g = str;
    }

    public void j(String str) {
        this.f32375a = str;
    }

    public void k(String str) {
        this.f32379e = str;
    }

    public void l(Date date) {
        this.f32376b = date;
    }

    public void m(String str) {
        this.f32380f = str;
    }

    public void n(Map<String, String> map) {
        this.f32382h = map;
    }

    public void o(Map<String, Object> map) {
        this.f32383i = map;
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.l();
        if (this.f32375a != null) {
            v0Var.P0("app_identifier").G0(this.f32375a);
        }
        if (this.f32376b != null) {
            v0Var.P0("app_start_time").Q0(d0Var, this.f32376b);
        }
        if (this.f32377c != null) {
            v0Var.P0("device_app_hash").G0(this.f32377c);
        }
        if (this.f32378d != null) {
            v0Var.P0("build_type").G0(this.f32378d);
        }
        if (this.f32379e != null) {
            v0Var.P0(AnalyticsFields.APP_NAME).G0(this.f32379e);
        }
        if (this.f32380f != null) {
            v0Var.P0(AnalyticsFields.APP_VERSION).G0(this.f32380f);
        }
        if (this.f32381g != null) {
            v0Var.P0("app_build").G0(this.f32381g);
        }
        Map<String, String> map = this.f32382h;
        if (map != null && !map.isEmpty()) {
            v0Var.P0("permissions").Q0(d0Var, this.f32382h);
        }
        Map<String, Object> map2 = this.f32383i;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                v0Var.P0(str).Q0(d0Var, this.f32383i.get(str));
            }
        }
        v0Var.C();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(a aVar) {
        this.f32381g = aVar.f32381g;
        this.f32375a = aVar.f32375a;
        this.f32379e = aVar.f32379e;
        this.f32376b = aVar.f32376b;
        this.f32380f = aVar.f32380f;
        this.f32378d = aVar.f32378d;
        this.f32377c = aVar.f32377c;
        this.f32382h = rz.a.b(aVar.f32382h);
        this.f32383i = rz.a.b(aVar.f32383i);
    }
}