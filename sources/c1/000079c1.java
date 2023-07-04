package io.sentry.protocol;

import io.sentry.d0;
import io.sentry.n0;
import io.sentry.protocol.h;
import io.sentry.protocol.t;
import io.sentry.t0;
import io.sentry.v0;
import io.sentry.x0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class n implements x0 {

    /* renamed from: a  reason: collision with root package name */
    private String f32461a;

    /* renamed from: b  reason: collision with root package name */
    private String f32462b;

    /* renamed from: c  reason: collision with root package name */
    private String f32463c;

    /* renamed from: d  reason: collision with root package name */
    private Long f32464d;

    /* renamed from: e  reason: collision with root package name */
    private t f32465e;

    /* renamed from: f  reason: collision with root package name */
    private h f32466f;

    /* renamed from: g  reason: collision with root package name */
    private Map<String, Object> f32467g;

    /* loaded from: classes5.dex */
    public static final class a implements n0<n> {
        @Override // io.sentry.n0
        /* renamed from: b */
        public n a(t0 t0Var, d0 d0Var) {
            n nVar = new n();
            t0Var.g();
            HashMap hashMap = null;
            while (t0Var.G0() == io.sentry.vendor.gson.stream.b.NAME) {
                String p02 = t0Var.p0();
                p02.hashCode();
                char c11 = 65535;
                switch (p02.hashCode()) {
                    case -1562235024:
                        if (p02.equals("thread_id")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case -1068784020:
                        if (p02.equals("module")) {
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
                    case 111972721:
                        if (p02.equals("value")) {
                            c11 = 3;
                            break;
                        }
                        break;
                    case 1225089881:
                        if (p02.equals("mechanism")) {
                            c11 = 4;
                            break;
                        }
                        break;
                    case 2055832509:
                        if (p02.equals("stacktrace")) {
                            c11 = 5;
                            break;
                        }
                        break;
                }
                switch (c11) {
                    case 0:
                        nVar.f32464d = t0Var.K1();
                        break;
                    case 1:
                        nVar.f32463c = t0Var.N1();
                        break;
                    case 2:
                        nVar.f32461a = t0Var.N1();
                        break;
                    case 3:
                        nVar.f32462b = t0Var.N1();
                        break;
                    case 4:
                        nVar.f32466f = (h) t0Var.M1(d0Var, new h.a());
                        break;
                    case 5:
                        nVar.f32465e = (t) t0Var.M1(d0Var, new t.a());
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        t0Var.P1(d0Var, hashMap, p02);
                        break;
                }
            }
            t0Var.C();
            nVar.o(hashMap);
            return nVar;
        }
    }

    public h g() {
        return this.f32466f;
    }

    public Long h() {
        return this.f32464d;
    }

    public String i() {
        return this.f32461a;
    }

    public void j(h hVar) {
        this.f32466f = hVar;
    }

    public void k(String str) {
        this.f32463c = str;
    }

    public void l(t tVar) {
        this.f32465e = tVar;
    }

    public void m(Long l11) {
        this.f32464d = l11;
    }

    public void n(String str) {
        this.f32461a = str;
    }

    public void o(Map<String, Object> map) {
        this.f32467g = map;
    }

    public void p(String str) {
        this.f32462b = str;
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.l();
        if (this.f32461a != null) {
            v0Var.P0("type").G0(this.f32461a);
        }
        if (this.f32462b != null) {
            v0Var.P0("value").G0(this.f32462b);
        }
        if (this.f32463c != null) {
            v0Var.P0("module").G0(this.f32463c);
        }
        if (this.f32464d != null) {
            v0Var.P0("thread_id").F0(this.f32464d);
        }
        if (this.f32465e != null) {
            v0Var.P0("stacktrace").Q0(d0Var, this.f32465e);
        }
        if (this.f32466f != null) {
            v0Var.P0("mechanism").Q0(d0Var, this.f32466f);
        }
        Map<String, Object> map = this.f32467g;
        if (map != null) {
            for (String str : map.keySet()) {
                v0Var.P0(str).Q0(d0Var, this.f32467g.get(str));
            }
        }
        v0Var.C();
    }
}