package io.sentry.protocol;

import io.sentry.d0;
import io.sentry.n0;
import io.sentry.t0;
import io.sentry.v0;
import io.sentry.x0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class b implements x0 {

    /* renamed from: a  reason: collision with root package name */
    private String f32384a;

    /* renamed from: b  reason: collision with root package name */
    private String f32385b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, Object> f32386c;

    /* loaded from: classes5.dex */
    public static final class a implements n0<b> {
        @Override // io.sentry.n0
        /* renamed from: b */
        public b a(t0 t0Var, d0 d0Var) {
            t0Var.g();
            b bVar = new b();
            ConcurrentHashMap concurrentHashMap = null;
            while (t0Var.G0() == io.sentry.vendor.gson.stream.b.NAME) {
                String p02 = t0Var.p0();
                p02.hashCode();
                if (p02.equals("name")) {
                    bVar.f32384a = t0Var.N1();
                } else if (p02.equals("version")) {
                    bVar.f32385b = t0Var.N1();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    t0Var.P1(d0Var, concurrentHashMap, p02);
                }
            }
            bVar.c(concurrentHashMap);
            t0Var.C();
            return bVar;
        }
    }

    public b() {
    }

    public void c(Map<String, Object> map) {
        this.f32386c = map;
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.l();
        if (this.f32384a != null) {
            v0Var.P0("name").G0(this.f32384a);
        }
        if (this.f32385b != null) {
            v0Var.P0("version").G0(this.f32385b);
        }
        Map<String, Object> map = this.f32386c;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f32386c.get(str);
                v0Var.P0(str);
                v0Var.Q0(d0Var, obj);
            }
        }
        v0Var.C();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(b bVar) {
        this.f32384a = bVar.f32384a;
        this.f32385b = bVar.f32385b;
        this.f32386c = rz.a.b(bVar.f32386c);
    }
}