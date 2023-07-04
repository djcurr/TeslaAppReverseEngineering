package io.sentry.protocol;

import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import io.sentry.d0;
import io.sentry.n0;
import io.sentry.t0;
import io.sentry.v0;
import io.sentry.x0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class k implements x0 {

    /* renamed from: a  reason: collision with root package name */
    private String f32442a;

    /* renamed from: b  reason: collision with root package name */
    private String f32443b;

    /* renamed from: c  reason: collision with root package name */
    private String f32444c;

    /* renamed from: d  reason: collision with root package name */
    private Object f32445d;

    /* renamed from: e  reason: collision with root package name */
    private String f32446e;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, String> f32447f;

    /* renamed from: g  reason: collision with root package name */
    private Map<String, String> f32448g;

    /* renamed from: h  reason: collision with root package name */
    private Map<String, String> f32449h;

    /* renamed from: i  reason: collision with root package name */
    private Map<String, Object> f32450i;

    /* loaded from: classes5.dex */
    public static final class a implements n0<k> {
        @Override // io.sentry.n0
        /* renamed from: b */
        public k a(t0 t0Var, d0 d0Var) {
            t0Var.g();
            k kVar = new k();
            ConcurrentHashMap concurrentHashMap = null;
            while (t0Var.G0() == io.sentry.vendor.gson.stream.b.NAME) {
                String p02 = t0Var.p0();
                p02.hashCode();
                char c11 = 65535;
                switch (p02.hashCode()) {
                    case -1077554975:
                        if (p02.equals("method")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case 100589:
                        if (p02.equals("env")) {
                            c11 = 1;
                            break;
                        }
                        break;
                    case 116079:
                        if (p02.equals("url")) {
                            c11 = 2;
                            break;
                        }
                        break;
                    case 3076010:
                        if (p02.equals(MessageExtension.FIELD_DATA)) {
                            c11 = 3;
                            break;
                        }
                        break;
                    case 106069776:
                        if (p02.equals("other")) {
                            c11 = 4;
                            break;
                        }
                        break;
                    case 795307910:
                        if (p02.equals("headers")) {
                            c11 = 5;
                            break;
                        }
                        break;
                    case 952189583:
                        if (p02.equals("cookies")) {
                            c11 = 6;
                            break;
                        }
                        break;
                    case 1595298664:
                        if (p02.equals("query_string")) {
                            c11 = 7;
                            break;
                        }
                        break;
                }
                switch (c11) {
                    case 0:
                        kVar.f32443b = t0Var.N1();
                        break;
                    case 1:
                        Map map = (Map) t0Var.L1();
                        if (map == null) {
                            break;
                        } else {
                            kVar.f32448g = rz.a.b(map);
                            break;
                        }
                    case 2:
                        kVar.f32442a = t0Var.N1();
                        break;
                    case 3:
                        kVar.f32445d = t0Var.L1();
                        break;
                    case 4:
                        Map map2 = (Map) t0Var.L1();
                        if (map2 == null) {
                            break;
                        } else {
                            kVar.f32449h = rz.a.b(map2);
                            break;
                        }
                    case 5:
                        Map map3 = (Map) t0Var.L1();
                        if (map3 == null) {
                            break;
                        } else {
                            kVar.f32447f = rz.a.b(map3);
                            break;
                        }
                    case 6:
                        kVar.f32446e = t0Var.N1();
                        break;
                    case 7:
                        kVar.f32444c = t0Var.N1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        t0Var.P1(d0Var, concurrentHashMap, p02);
                        break;
                }
            }
            kVar.j(concurrentHashMap);
            t0Var.C();
            return kVar;
        }
    }

    public k() {
    }

    public Map<String, String> i() {
        return this.f32447f;
    }

    public void j(Map<String, Object> map) {
        this.f32450i = map;
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.l();
        if (this.f32442a != null) {
            v0Var.P0("url").G0(this.f32442a);
        }
        if (this.f32443b != null) {
            v0Var.P0("method").G0(this.f32443b);
        }
        if (this.f32444c != null) {
            v0Var.P0("query_string").G0(this.f32444c);
        }
        if (this.f32445d != null) {
            v0Var.P0(MessageExtension.FIELD_DATA).Q0(d0Var, this.f32445d);
        }
        if (this.f32446e != null) {
            v0Var.P0("cookies").G0(this.f32446e);
        }
        if (this.f32447f != null) {
            v0Var.P0("headers").Q0(d0Var, this.f32447f);
        }
        if (this.f32448g != null) {
            v0Var.P0("env").Q0(d0Var, this.f32448g);
        }
        if (this.f32449h != null) {
            v0Var.P0("other").Q0(d0Var, this.f32449h);
        }
        Map<String, Object> map = this.f32450i;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f32450i.get(str);
                v0Var.P0(str);
                v0Var.Q0(d0Var, obj);
            }
        }
        v0Var.C();
    }

    public k(k kVar) {
        this.f32442a = kVar.f32442a;
        this.f32446e = kVar.f32446e;
        this.f32443b = kVar.f32443b;
        this.f32444c = kVar.f32444c;
        this.f32447f = rz.a.b(kVar.f32447f);
        this.f32448g = rz.a.b(kVar.f32448g);
        this.f32449h = rz.a.b(kVar.f32449h);
        this.f32450i = rz.a.b(kVar.f32450i);
        this.f32445d = kVar.f32445d;
    }
}