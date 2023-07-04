package io.sentry.protocol;

import io.sentry.d0;
import io.sentry.n0;
import io.sentry.protocol.s;
import io.sentry.t0;
import io.sentry.v0;
import io.sentry.x0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class t implements x0 {

    /* renamed from: a  reason: collision with root package name */
    private List<s> f32504a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f32505b;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f32506c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, Object> f32507d;

    /* loaded from: classes5.dex */
    public static final class a implements n0<t> {
        @Override // io.sentry.n0
        /* renamed from: b */
        public t a(t0 t0Var, d0 d0Var) {
            t tVar = new t();
            t0Var.g();
            ConcurrentHashMap concurrentHashMap = null;
            while (t0Var.G0() == io.sentry.vendor.gson.stream.b.NAME) {
                String p02 = t0Var.p0();
                p02.hashCode();
                char c11 = 65535;
                switch (p02.hashCode()) {
                    case -1266514778:
                        if (p02.equals("frames")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case 78226992:
                        if (p02.equals("registers")) {
                            c11 = 1;
                            break;
                        }
                        break;
                    case 284874180:
                        if (p02.equals("snapshot")) {
                            c11 = 2;
                            break;
                        }
                        break;
                }
                switch (c11) {
                    case 0:
                        tVar.f32504a = t0Var.F1(d0Var, new s.a());
                        break;
                    case 1:
                        tVar.f32505b = rz.a.b((Map) t0Var.L1());
                        break;
                    case 2:
                        tVar.f32506c = t0Var.p1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        t0Var.P1(d0Var, concurrentHashMap, p02);
                        break;
                }
            }
            tVar.e(concurrentHashMap);
            t0Var.C();
            return tVar;
        }
    }

    public t() {
    }

    public void d(Boolean bool) {
        this.f32506c = bool;
    }

    public void e(Map<String, Object> map) {
        this.f32507d = map;
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.l();
        if (this.f32504a != null) {
            v0Var.P0("frames").Q0(d0Var, this.f32504a);
        }
        if (this.f32505b != null) {
            v0Var.P0("registers").Q0(d0Var, this.f32505b);
        }
        if (this.f32506c != null) {
            v0Var.P0("snapshot").D0(this.f32506c);
        }
        Map<String, Object> map = this.f32507d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f32507d.get(str);
                v0Var.P0(str);
                v0Var.Q0(d0Var, obj);
            }
        }
        v0Var.C();
    }

    public t(List<s> list) {
        this.f32504a = list;
    }
}