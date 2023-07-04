package io.sentry.protocol;

import com.stripe.android.model.Stripe3ds2AuthParams;
import ezvcard.property.Kind;
import io.sentry.d0;
import io.sentry.n0;
import io.sentry.protocol.a;
import io.sentry.protocol.b;
import io.sentry.protocol.e;
import io.sentry.protocol.f;
import io.sentry.protocol.j;
import io.sentry.protocol.q;
import io.sentry.t0;
import io.sentry.u3;
import io.sentry.v0;
import io.sentry.x0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class c extends ConcurrentHashMap<String, Object> implements x0 {

    /* loaded from: classes5.dex */
    public static final class a implements n0<c> {
        @Override // io.sentry.n0
        /* renamed from: b */
        public c a(t0 t0Var, d0 d0Var) {
            c cVar = new c();
            t0Var.g();
            while (t0Var.G0() == io.sentry.vendor.gson.stream.b.NAME) {
                String p02 = t0Var.p0();
                p02.hashCode();
                char c11 = 65535;
                switch (p02.hashCode()) {
                    case -1335157162:
                        if (p02.equals(Kind.DEVICE)) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case 3556:
                        if (p02.equals("os")) {
                            c11 = 1;
                            break;
                        }
                        break;
                    case 96801:
                        if (p02.equals(Stripe3ds2AuthParams.FIELD_APP)) {
                            c11 = 2;
                            break;
                        }
                        break;
                    case 102572:
                        if (p02.equals("gpu")) {
                            c11 = 3;
                            break;
                        }
                        break;
                    case 110620997:
                        if (p02.equals("trace")) {
                            c11 = 4;
                            break;
                        }
                        break;
                    case 150940456:
                        if (p02.equals("browser")) {
                            c11 = 5;
                            break;
                        }
                        break;
                    case 1550962648:
                        if (p02.equals("runtime")) {
                            c11 = 6;
                            break;
                        }
                        break;
                }
                switch (c11) {
                    case 0:
                        cVar.j(new e.a().a(t0Var, d0Var));
                        break;
                    case 1:
                        cVar.l(new j.a().a(t0Var, d0Var));
                        break;
                    case 2:
                        cVar.h(new a.C0598a().a(t0Var, d0Var));
                        break;
                    case 3:
                        cVar.k(new f.a().a(t0Var, d0Var));
                        break;
                    case 4:
                        cVar.n(new u3.a().a(t0Var, d0Var));
                        break;
                    case 5:
                        cVar.i(new b.a().a(t0Var, d0Var));
                        break;
                    case 6:
                        cVar.m(new q.a().a(t0Var, d0Var));
                        break;
                    default:
                        Object L1 = t0Var.L1();
                        if (L1 == null) {
                            break;
                        } else {
                            cVar.put(p02, L1);
                            break;
                        }
                }
            }
            t0Var.C();
            return cVar;
        }
    }

    public c() {
    }

    private <T> T o(String str, Class<T> cls) {
        Object obj = get(str);
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }

    public io.sentry.protocol.a a() {
        return (io.sentry.protocol.a) o(Stripe3ds2AuthParams.FIELD_APP, io.sentry.protocol.a.class);
    }

    public e b() {
        return (e) o(Kind.DEVICE, e.class);
    }

    public j c() {
        return (j) o("os", j.class);
    }

    public q e() {
        return (q) o("runtime", q.class);
    }

    public u3 f() {
        return (u3) o("trace", u3.class);
    }

    public void h(io.sentry.protocol.a aVar) {
        put(Stripe3ds2AuthParams.FIELD_APP, aVar);
    }

    public void i(b bVar) {
        put("browser", bVar);
    }

    public void j(e eVar) {
        put(Kind.DEVICE, eVar);
    }

    public void k(f fVar) {
        put("gpu", fVar);
    }

    public void l(j jVar) {
        put("os", jVar);
    }

    public void m(q qVar) {
        put("runtime", qVar);
    }

    public void n(u3 u3Var) {
        rz.j.a(u3Var, "traceContext is required");
        put("trace", u3Var);
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.l();
        ArrayList<String> list = Collections.list(keys());
        Collections.sort(list);
        for (String str : list) {
            Object obj = get(str);
            if (obj != null) {
                v0Var.P0(str).Q0(d0Var, obj);
            }
        }
        v0Var.C();
    }

    public c(c cVar) {
        for (Map.Entry<String, Object> entry : cVar.entrySet()) {
            if (entry != null) {
                Object value = entry.getValue();
                if (Stripe3ds2AuthParams.FIELD_APP.equals(entry.getKey()) && (value instanceof io.sentry.protocol.a)) {
                    h(new io.sentry.protocol.a((io.sentry.protocol.a) value));
                } else if ("browser".equals(entry.getKey()) && (value instanceof b)) {
                    i(new b((b) value));
                } else if (Kind.DEVICE.equals(entry.getKey()) && (value instanceof e)) {
                    j(new e((e) value));
                } else if ("os".equals(entry.getKey()) && (value instanceof j)) {
                    l(new j((j) value));
                } else if ("runtime".equals(entry.getKey()) && (value instanceof q)) {
                    m(new q((q) value));
                } else if ("gpu".equals(entry.getKey()) && (value instanceof f)) {
                    k(new f((f) value));
                } else if ("trace".equals(entry.getKey()) && (value instanceof u3)) {
                    n(new u3((u3) value));
                } else {
                    put(entry.getKey(), value);
                }
            }
        }
    }
}