package io.sentry.protocol;

import io.sentry.d0;
import io.sentry.n0;
import io.sentry.t0;
import io.sentry.v0;
import io.sentry.x0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class i implements x0 {

    /* renamed from: a  reason: collision with root package name */
    private String f32431a;

    /* renamed from: b  reason: collision with root package name */
    private String f32432b;

    /* renamed from: c  reason: collision with root package name */
    private List<String> f32433c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, Object> f32434d;

    /* loaded from: classes5.dex */
    public static final class a implements n0<i> {
        @Override // io.sentry.n0
        /* renamed from: b */
        public i a(t0 t0Var, d0 d0Var) {
            t0Var.g();
            i iVar = new i();
            ConcurrentHashMap concurrentHashMap = null;
            while (t0Var.G0() == io.sentry.vendor.gson.stream.b.NAME) {
                String p02 = t0Var.p0();
                p02.hashCode();
                char c11 = 65535;
                switch (p02.hashCode()) {
                    case -995427962:
                        if (p02.equals("params")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case 954925063:
                        if (p02.equals("message")) {
                            c11 = 1;
                            break;
                        }
                        break;
                    case 1811591356:
                        if (p02.equals("formatted")) {
                            c11 = 2;
                            break;
                        }
                        break;
                }
                switch (c11) {
                    case 0:
                        List list = (List) t0Var.L1();
                        if (list == null) {
                            break;
                        } else {
                            iVar.f32433c = list;
                            break;
                        }
                    case 1:
                        iVar.f32432b = t0Var.N1();
                        break;
                    case 2:
                        iVar.f32431a = t0Var.N1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        t0Var.P1(d0Var, concurrentHashMap, p02);
                        break;
                }
            }
            iVar.d(concurrentHashMap);
            t0Var.C();
            return iVar;
        }
    }

    public void d(Map<String, Object> map) {
        this.f32434d = map;
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.l();
        if (this.f32431a != null) {
            v0Var.P0("formatted").G0(this.f32431a);
        }
        if (this.f32432b != null) {
            v0Var.P0("message").G0(this.f32432b);
        }
        List<String> list = this.f32433c;
        if (list != null && !list.isEmpty()) {
            v0Var.P0("params").Q0(d0Var, this.f32433c);
        }
        Map<String, Object> map = this.f32434d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f32434d.get(str);
                v0Var.P0(str);
                v0Var.Q0(d0Var, obj);
            }
        }
        v0Var.C();
    }
}