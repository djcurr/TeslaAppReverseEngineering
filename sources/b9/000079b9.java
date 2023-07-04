package io.sentry.protocol;

import io.sentry.d0;
import io.sentry.n0;
import io.sentry.t0;
import io.sentry.v0;
import io.sentry.x0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class j implements x0 {

    /* renamed from: a  reason: collision with root package name */
    private String f32435a;

    /* renamed from: b  reason: collision with root package name */
    private String f32436b;

    /* renamed from: c  reason: collision with root package name */
    private String f32437c;

    /* renamed from: d  reason: collision with root package name */
    private String f32438d;

    /* renamed from: e  reason: collision with root package name */
    private String f32439e;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f32440f;

    /* renamed from: g  reason: collision with root package name */
    private Map<String, Object> f32441g;

    /* loaded from: classes5.dex */
    public static final class a implements n0<j> {
        @Override // io.sentry.n0
        /* renamed from: b */
        public j a(t0 t0Var, d0 d0Var) {
            t0Var.g();
            j jVar = new j();
            ConcurrentHashMap concurrentHashMap = null;
            while (t0Var.G0() == io.sentry.vendor.gson.stream.b.NAME) {
                String p02 = t0Var.p0();
                p02.hashCode();
                char c11 = 65535;
                switch (p02.hashCode()) {
                    case -925311743:
                        if (p02.equals("rooted")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case -339173787:
                        if (p02.equals("raw_description")) {
                            c11 = 1;
                            break;
                        }
                        break;
                    case 3373707:
                        if (p02.equals("name")) {
                            c11 = 2;
                            break;
                        }
                        break;
                    case 94094958:
                        if (p02.equals("build")) {
                            c11 = 3;
                            break;
                        }
                        break;
                    case 351608024:
                        if (p02.equals("version")) {
                            c11 = 4;
                            break;
                        }
                        break;
                    case 2015527638:
                        if (p02.equals("kernel_version")) {
                            c11 = 5;
                            break;
                        }
                        break;
                }
                switch (c11) {
                    case 0:
                        jVar.f32440f = t0Var.p1();
                        break;
                    case 1:
                        jVar.f32437c = t0Var.N1();
                        break;
                    case 2:
                        jVar.f32435a = t0Var.N1();
                        break;
                    case 3:
                        jVar.f32438d = t0Var.N1();
                        break;
                    case 4:
                        jVar.f32436b = t0Var.N1();
                        break;
                    case 5:
                        jVar.f32439e = t0Var.N1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        t0Var.P1(d0Var, concurrentHashMap, p02);
                        break;
                }
            }
            jVar.l(concurrentHashMap);
            t0Var.C();
            return jVar;
        }
    }

    public j() {
    }

    public String g() {
        return this.f32435a;
    }

    public void h(String str) {
        this.f32438d = str;
    }

    public void i(String str) {
        this.f32439e = str;
    }

    public void j(String str) {
        this.f32435a = str;
    }

    public void k(Boolean bool) {
        this.f32440f = bool;
    }

    public void l(Map<String, Object> map) {
        this.f32441g = map;
    }

    public void m(String str) {
        this.f32436b = str;
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.l();
        if (this.f32435a != null) {
            v0Var.P0("name").G0(this.f32435a);
        }
        if (this.f32436b != null) {
            v0Var.P0("version").G0(this.f32436b);
        }
        if (this.f32437c != null) {
            v0Var.P0("raw_description").G0(this.f32437c);
        }
        if (this.f32438d != null) {
            v0Var.P0("build").G0(this.f32438d);
        }
        if (this.f32439e != null) {
            v0Var.P0("kernel_version").G0(this.f32439e);
        }
        if (this.f32440f != null) {
            v0Var.P0("rooted").D0(this.f32440f);
        }
        Map<String, Object> map = this.f32441g;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f32441g.get(str);
                v0Var.P0(str);
                v0Var.Q0(d0Var, obj);
            }
        }
        v0Var.C();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(j jVar) {
        this.f32435a = jVar.f32435a;
        this.f32436b = jVar.f32436b;
        this.f32437c = jVar.f32437c;
        this.f32438d = jVar.f32438d;
        this.f32439e = jVar.f32439e;
        this.f32440f = jVar.f32440f;
        this.f32441g = rz.a.b(jVar.f32441g);
    }
}