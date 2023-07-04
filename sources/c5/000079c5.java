package io.sentry.protocol;

import io.sentry.d0;
import io.sentry.f3;
import io.sentry.n0;
import io.sentry.t0;
import io.sentry.v0;
import io.sentry.x0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class p implements x0 {

    /* renamed from: a  reason: collision with root package name */
    private String f32470a;

    /* renamed from: b  reason: collision with root package name */
    private String f32471b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, Object> f32472c;

    /* loaded from: classes5.dex */
    public static final class a implements n0<p> {
        @Override // io.sentry.n0
        /* renamed from: b */
        public p a(t0 t0Var, d0 d0Var) {
            t0Var.g();
            String str = null;
            String str2 = null;
            HashMap hashMap = null;
            while (t0Var.G0() == io.sentry.vendor.gson.stream.b.NAME) {
                String p02 = t0Var.p0();
                p02.hashCode();
                if (p02.equals("name")) {
                    str = t0Var.D0();
                } else if (!p02.equals("version")) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    t0Var.P1(d0Var, hashMap, p02);
                } else {
                    str2 = t0Var.D0();
                }
            }
            t0Var.C();
            if (str == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                d0Var.b(f3.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            } else if (str2 != null) {
                p pVar = new p(str, str2);
                pVar.c(hashMap);
                return pVar;
            } else {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
                d0Var.b(f3.ERROR, "Missing required field \"version\"", illegalStateException2);
                throw illegalStateException2;
            }
        }
    }

    public p(String str, String str2) {
        this.f32470a = (String) rz.j.a(str, "name is required.");
        this.f32471b = (String) rz.j.a(str2, "version is required.");
    }

    public String a() {
        return this.f32470a;
    }

    public String b() {
        return this.f32471b;
    }

    public void c(Map<String, Object> map) {
        this.f32472c = map;
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.l();
        v0Var.P0("name").G0(this.f32470a);
        v0Var.P0("version").G0(this.f32471b);
        Map<String, Object> map = this.f32472c;
        if (map != null) {
            for (String str : map.keySet()) {
                v0Var.P0(str).Q0(d0Var, this.f32472c.get(str));
            }
        }
        v0Var.C();
    }
}