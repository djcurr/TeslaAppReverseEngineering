package io.sentry.protocol;

import io.sentry.d0;
import io.sentry.n0;
import io.sentry.t0;
import io.sentry.v0;
import io.sentry.x0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class w implements x0 {

    /* renamed from: a  reason: collision with root package name */
    private String f32523a;

    /* renamed from: b  reason: collision with root package name */
    private String f32524b;

    /* renamed from: c  reason: collision with root package name */
    private String f32525c;

    /* renamed from: d  reason: collision with root package name */
    private String f32526d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, String> f32527e;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, Object> f32528f;

    /* loaded from: classes5.dex */
    public static final class a implements n0<w> {
        @Override // io.sentry.n0
        /* renamed from: b */
        public w a(t0 t0Var, d0 d0Var) {
            t0Var.g();
            w wVar = new w();
            ConcurrentHashMap concurrentHashMap = null;
            while (t0Var.G0() == io.sentry.vendor.gson.stream.b.NAME) {
                String p02 = t0Var.p0();
                p02.hashCode();
                char c11 = 65535;
                switch (p02.hashCode()) {
                    case -265713450:
                        if (p02.equals("username")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case 3355:
                        if (p02.equals("id")) {
                            c11 = 1;
                            break;
                        }
                        break;
                    case 96619420:
                        if (p02.equals("email")) {
                            c11 = 2;
                            break;
                        }
                        break;
                    case 106069776:
                        if (p02.equals("other")) {
                            c11 = 3;
                            break;
                        }
                        break;
                    case 1480014044:
                        if (p02.equals("ip_address")) {
                            c11 = 4;
                            break;
                        }
                        break;
                }
                switch (c11) {
                    case 0:
                        wVar.f32525c = t0Var.N1();
                        break;
                    case 1:
                        wVar.f32524b = t0Var.N1();
                        break;
                    case 2:
                        wVar.f32523a = t0Var.N1();
                        break;
                    case 3:
                        wVar.f32527e = rz.a.b((Map) t0Var.L1());
                        break;
                    case 4:
                        wVar.f32526d = t0Var.N1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        t0Var.P1(d0Var, concurrentHashMap, p02);
                        break;
                }
            }
            wVar.o(concurrentHashMap);
            t0Var.C();
            return wVar;
        }
    }

    public w() {
    }

    public String f() {
        return this.f32523a;
    }

    public String g() {
        return this.f32524b;
    }

    public String h() {
        return this.f32526d;
    }

    public Map<String, String> i() {
        return this.f32527e;
    }

    public String j() {
        return this.f32525c;
    }

    public void k(String str) {
        this.f32523a = str;
    }

    public void l(String str) {
        this.f32524b = str;
    }

    public void m(String str) {
        this.f32526d = str;
    }

    public void n(Map<String, String> map) {
        this.f32527e = rz.a.b(map);
    }

    public void o(Map<String, Object> map) {
        this.f32528f = map;
    }

    public void p(String str) {
        this.f32525c = str;
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.l();
        if (this.f32523a != null) {
            v0Var.P0("email").G0(this.f32523a);
        }
        if (this.f32524b != null) {
            v0Var.P0("id").G0(this.f32524b);
        }
        if (this.f32525c != null) {
            v0Var.P0("username").G0(this.f32525c);
        }
        if (this.f32526d != null) {
            v0Var.P0("ip_address").G0(this.f32526d);
        }
        if (this.f32527e != null) {
            v0Var.P0("other").Q0(d0Var, this.f32527e);
        }
        Map<String, Object> map = this.f32528f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f32528f.get(str);
                v0Var.P0(str);
                v0Var.Q0(d0Var, obj);
            }
        }
        v0Var.C();
    }

    public w(w wVar) {
        this.f32523a = wVar.f32523a;
        this.f32525c = wVar.f32525c;
        this.f32524b = wVar.f32524b;
        this.f32526d = wVar.f32526d;
        this.f32527e = rz.a.b(wVar.f32527e);
        this.f32528f = rz.a.b(wVar.f32528f);
    }
}