package io.sentry.protocol;

import io.sentry.d0;
import io.sentry.n0;
import io.sentry.t0;
import io.sentry.v0;
import io.sentry.x0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class f implements x0 {

    /* renamed from: a  reason: collision with root package name */
    private String f32412a;

    /* renamed from: b  reason: collision with root package name */
    private Integer f32413b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f32414c;

    /* renamed from: d  reason: collision with root package name */
    private String f32415d;

    /* renamed from: e  reason: collision with root package name */
    private Integer f32416e;

    /* renamed from: f  reason: collision with root package name */
    private String f32417f;

    /* renamed from: g  reason: collision with root package name */
    private Boolean f32418g;

    /* renamed from: h  reason: collision with root package name */
    private String f32419h;

    /* renamed from: i  reason: collision with root package name */
    private String f32420i;

    /* renamed from: j  reason: collision with root package name */
    private Map<String, Object> f32421j;

    /* loaded from: classes5.dex */
    public static final class a implements n0<f> {
        @Override // io.sentry.n0
        /* renamed from: b */
        public f a(t0 t0Var, d0 d0Var) {
            t0Var.g();
            f fVar = new f();
            ConcurrentHashMap concurrentHashMap = null;
            while (t0Var.G0() == io.sentry.vendor.gson.stream.b.NAME) {
                String p02 = t0Var.p0();
                p02.hashCode();
                char c11 = 65535;
                switch (p02.hashCode()) {
                    case -1421884745:
                        if (p02.equals("npot_support")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case -1085970574:
                        if (p02.equals("vendor_id")) {
                            c11 = 1;
                            break;
                        }
                        break;
                    case -1009234244:
                        if (p02.equals("multi_threaded_rendering")) {
                            c11 = 2;
                            break;
                        }
                        break;
                    case 3355:
                        if (p02.equals("id")) {
                            c11 = 3;
                            break;
                        }
                        break;
                    case 3373707:
                        if (p02.equals("name")) {
                            c11 = 4;
                            break;
                        }
                        break;
                    case 59480866:
                        if (p02.equals("vendor_name")) {
                            c11 = 5;
                            break;
                        }
                        break;
                    case 351608024:
                        if (p02.equals("version")) {
                            c11 = 6;
                            break;
                        }
                        break;
                    case 967446079:
                        if (p02.equals("api_type")) {
                            c11 = 7;
                            break;
                        }
                        break;
                    case 1418777727:
                        if (p02.equals("memory_size")) {
                            c11 = '\b';
                            break;
                        }
                        break;
                }
                switch (c11) {
                    case 0:
                        fVar.f32420i = t0Var.N1();
                        break;
                    case 1:
                        fVar.f32414c = t0Var.D1();
                        break;
                    case 2:
                        fVar.f32418g = t0Var.p1();
                        break;
                    case 3:
                        fVar.f32413b = t0Var.D1();
                        break;
                    case 4:
                        fVar.f32412a = t0Var.N1();
                        break;
                    case 5:
                        fVar.f32415d = t0Var.N1();
                        break;
                    case 6:
                        fVar.f32419h = t0Var.N1();
                        break;
                    case 7:
                        fVar.f32417f = t0Var.N1();
                        break;
                    case '\b':
                        fVar.f32416e = t0Var.D1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        t0Var.P1(d0Var, concurrentHashMap, p02);
                        break;
                }
            }
            fVar.j(concurrentHashMap);
            t0Var.C();
            return fVar;
        }
    }

    public f() {
    }

    public void j(Map<String, Object> map) {
        this.f32421j = map;
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.l();
        if (this.f32412a != null) {
            v0Var.P0("name").G0(this.f32412a);
        }
        if (this.f32413b != null) {
            v0Var.P0("id").F0(this.f32413b);
        }
        if (this.f32414c != null) {
            v0Var.P0("vendor_id").F0(this.f32414c);
        }
        if (this.f32415d != null) {
            v0Var.P0("vendor_name").G0(this.f32415d);
        }
        if (this.f32416e != null) {
            v0Var.P0("memory_size").F0(this.f32416e);
        }
        if (this.f32417f != null) {
            v0Var.P0("api_type").G0(this.f32417f);
        }
        if (this.f32418g != null) {
            v0Var.P0("multi_threaded_rendering").D0(this.f32418g);
        }
        if (this.f32419h != null) {
            v0Var.P0("version").G0(this.f32419h);
        }
        if (this.f32420i != null) {
            v0Var.P0("npot_support").G0(this.f32420i);
        }
        Map<String, Object> map = this.f32421j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f32421j.get(str);
                v0Var.P0(str);
                v0Var.Q0(d0Var, obj);
            }
        }
        v0Var.C();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(f fVar) {
        this.f32412a = fVar.f32412a;
        this.f32413b = fVar.f32413b;
        this.f32414c = fVar.f32414c;
        this.f32415d = fVar.f32415d;
        this.f32416e = fVar.f32416e;
        this.f32417f = fVar.f32417f;
        this.f32418g = fVar.f32418g;
        this.f32419h = fVar.f32419h;
        this.f32420i = fVar.f32420i;
        this.f32421j = rz.a.b(fVar.f32421j);
    }
}