package io.sentry.protocol;

import io.sentry.d0;
import io.sentry.n0;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.l;
import io.sentry.t0;
import io.sentry.v0;
import io.sentry.x0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class d implements x0 {

    /* renamed from: a  reason: collision with root package name */
    private l f32387a;

    /* renamed from: b  reason: collision with root package name */
    private List<DebugImage> f32388b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, Object> f32389c;

    /* loaded from: classes5.dex */
    public static final class a implements n0<d> {
        @Override // io.sentry.n0
        /* renamed from: b */
        public d a(t0 t0Var, d0 d0Var) {
            d dVar = new d();
            t0Var.g();
            HashMap hashMap = null;
            while (t0Var.G0() == io.sentry.vendor.gson.stream.b.NAME) {
                String p02 = t0Var.p0();
                p02.hashCode();
                if (p02.equals("images")) {
                    dVar.f32388b = t0Var.F1(d0Var, new DebugImage.a());
                } else if (p02.equals("sdk_info")) {
                    dVar.f32387a = (l) t0Var.M1(d0Var, new l.a());
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    t0Var.P1(d0Var, hashMap, p02);
                }
            }
            t0Var.C();
            dVar.e(hashMap);
            return dVar;
        }
    }

    public List<DebugImage> c() {
        return this.f32388b;
    }

    public void d(List<DebugImage> list) {
        this.f32388b = list != null ? new ArrayList(list) : null;
    }

    public void e(Map<String, Object> map) {
        this.f32389c = map;
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.l();
        if (this.f32387a != null) {
            v0Var.P0("sdk_info").Q0(d0Var, this.f32387a);
        }
        if (this.f32388b != null) {
            v0Var.P0("images").Q0(d0Var, this.f32388b);
        }
        Map<String, Object> map = this.f32389c;
        if (map != null) {
            for (String str : map.keySet()) {
                v0Var.P0(str).Q0(d0Var, this.f32389c.get(str));
            }
        }
        v0Var.C();
    }
}