package io.sentry.protocol;

import io.sentry.d0;
import io.sentry.n0;
import io.sentry.protocol.t;
import io.sentry.t0;
import io.sentry.v0;
import io.sentry.x0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class u implements x0 {

    /* renamed from: a  reason: collision with root package name */
    private Long f32508a;

    /* renamed from: b  reason: collision with root package name */
    private Integer f32509b;

    /* renamed from: c  reason: collision with root package name */
    private String f32510c;

    /* renamed from: d  reason: collision with root package name */
    private String f32511d;

    /* renamed from: e  reason: collision with root package name */
    private Boolean f32512e;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f32513f;

    /* renamed from: g  reason: collision with root package name */
    private Boolean f32514g;

    /* renamed from: h  reason: collision with root package name */
    private t f32515h;

    /* renamed from: i  reason: collision with root package name */
    private Map<String, Object> f32516i;

    /* loaded from: classes5.dex */
    public static final class a implements n0<u> {
        @Override // io.sentry.n0
        /* renamed from: b */
        public u a(t0 t0Var, d0 d0Var) {
            u uVar = new u();
            t0Var.g();
            ConcurrentHashMap concurrentHashMap = null;
            while (t0Var.G0() == io.sentry.vendor.gson.stream.b.NAME) {
                String p02 = t0Var.p0();
                p02.hashCode();
                char c11 = 65535;
                switch (p02.hashCode()) {
                    case -1339353468:
                        if (p02.equals("daemon")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case -1165461084:
                        if (p02.equals("priority")) {
                            c11 = 1;
                            break;
                        }
                        break;
                    case 3355:
                        if (p02.equals("id")) {
                            c11 = 2;
                            break;
                        }
                        break;
                    case 3373707:
                        if (p02.equals("name")) {
                            c11 = 3;
                            break;
                        }
                        break;
                    case 109757585:
                        if (p02.equals("state")) {
                            c11 = 4;
                            break;
                        }
                        break;
                    case 1025385094:
                        if (p02.equals("crashed")) {
                            c11 = 5;
                            break;
                        }
                        break;
                    case 1126940025:
                        if (p02.equals("current")) {
                            c11 = 6;
                            break;
                        }
                        break;
                    case 2055832509:
                        if (p02.equals("stacktrace")) {
                            c11 = 7;
                            break;
                        }
                        break;
                }
                switch (c11) {
                    case 0:
                        uVar.f32514g = t0Var.p1();
                        break;
                    case 1:
                        uVar.f32509b = t0Var.D1();
                        break;
                    case 2:
                        uVar.f32508a = t0Var.K1();
                        break;
                    case 3:
                        uVar.f32510c = t0Var.N1();
                        break;
                    case 4:
                        uVar.f32511d = t0Var.N1();
                        break;
                    case 5:
                        uVar.f32512e = t0Var.p1();
                        break;
                    case 6:
                        uVar.f32513f = t0Var.p1();
                        break;
                    case 7:
                        uVar.f32515h = (t) t0Var.M1(d0Var, new t.a());
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        t0Var.P1(d0Var, concurrentHashMap, p02);
                        break;
                }
            }
            uVar.s(concurrentHashMap);
            t0Var.C();
            return uVar;
        }
    }

    public Long i() {
        return this.f32508a;
    }

    public Boolean j() {
        return this.f32513f;
    }

    public void k(Boolean bool) {
        this.f32512e = bool;
    }

    public void l(Boolean bool) {
        this.f32513f = bool;
    }

    public void m(Boolean bool) {
        this.f32514g = bool;
    }

    public void n(Long l11) {
        this.f32508a = l11;
    }

    public void o(String str) {
        this.f32510c = str;
    }

    public void p(Integer num) {
        this.f32509b = num;
    }

    public void q(t tVar) {
        this.f32515h = tVar;
    }

    public void r(String str) {
        this.f32511d = str;
    }

    public void s(Map<String, Object> map) {
        this.f32516i = map;
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.l();
        if (this.f32508a != null) {
            v0Var.P0("id").F0(this.f32508a);
        }
        if (this.f32509b != null) {
            v0Var.P0("priority").F0(this.f32509b);
        }
        if (this.f32510c != null) {
            v0Var.P0("name").G0(this.f32510c);
        }
        if (this.f32511d != null) {
            v0Var.P0("state").G0(this.f32511d);
        }
        if (this.f32512e != null) {
            v0Var.P0("crashed").D0(this.f32512e);
        }
        if (this.f32513f != null) {
            v0Var.P0("current").D0(this.f32513f);
        }
        if (this.f32514g != null) {
            v0Var.P0("daemon").D0(this.f32514g);
        }
        if (this.f32515h != null) {
            v0Var.P0("stacktrace").Q0(d0Var, this.f32515h);
        }
        Map<String, Object> map = this.f32516i;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f32516i.get(str);
                v0Var.P0(str);
                v0Var.Q0(d0Var, obj);
            }
        }
        v0Var.C();
    }
}