package io.sentry;

import expo.modules.interfaces.permissions.PermissionsResponse;
import io.sentry.protocol.o;
import io.sentry.w3;
import io.sentry.x3;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

/* loaded from: classes5.dex */
public class u3 implements x0 {

    /* renamed from: a */
    private final io.sentry.protocol.o f32648a;

    /* renamed from: b */
    private final w3 f32649b;

    /* renamed from: c */
    private final w3 f32650c;

    /* renamed from: d */
    private transient Boolean f32651d;

    /* renamed from: e */
    protected String f32652e;

    /* renamed from: f */
    protected String f32653f;

    /* renamed from: g */
    protected x3 f32654g;

    /* renamed from: h */
    protected Map<String, String> f32655h;

    /* renamed from: i */
    private Map<String, Object> f32656i;

    /* loaded from: classes5.dex */
    public static final class a implements n0<u3> {
        @Override // io.sentry.n0
        /* renamed from: b */
        public u3 a(t0 t0Var, d0 d0Var) {
            t0Var.g();
            ConcurrentHashMap concurrentHashMap = null;
            io.sentry.protocol.o oVar = null;
            w3 w3Var = null;
            String str = null;
            w3 w3Var2 = null;
            String str2 = null;
            x3 x3Var = null;
            Map<String, String> map = null;
            while (t0Var.G0() == io.sentry.vendor.gson.stream.b.NAME) {
                String p02 = t0Var.p0();
                p02.hashCode();
                char c11 = 65535;
                switch (p02.hashCode()) {
                    case -2011840976:
                        if (p02.equals("span_id")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case -1757797477:
                        if (p02.equals("parent_span_id")) {
                            c11 = 1;
                            break;
                        }
                        break;
                    case -1724546052:
                        if (p02.equals("description")) {
                            c11 = 2;
                            break;
                        }
                        break;
                    case -892481550:
                        if (p02.equals(PermissionsResponse.STATUS_KEY)) {
                            c11 = 3;
                            break;
                        }
                        break;
                    case 3553:
                        if (p02.equals("op")) {
                            c11 = 4;
                            break;
                        }
                        break;
                    case 3552281:
                        if (p02.equals("tags")) {
                            c11 = 5;
                            break;
                        }
                        break;
                    case 1270300245:
                        if (p02.equals("trace_id")) {
                            c11 = 6;
                            break;
                        }
                        break;
                }
                switch (c11) {
                    case 0:
                        w3Var = new w3.a().a(t0Var, d0Var);
                        break;
                    case 1:
                        w3Var2 = (w3) t0Var.M1(d0Var, new w3.a());
                        break;
                    case 2:
                        str2 = t0Var.D0();
                        break;
                    case 3:
                        x3Var = (x3) t0Var.M1(d0Var, new x3.a());
                        break;
                    case 4:
                        str = t0Var.D0();
                        break;
                    case 5:
                        map = rz.a.b((Map) t0Var.L1());
                        break;
                    case 6:
                        oVar = new o.a().a(t0Var, d0Var);
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        t0Var.P1(d0Var, concurrentHashMap, p02);
                        break;
                }
            }
            if (oVar == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
                d0Var.b(f3.ERROR, "Missing required field \"trace_id\"", illegalStateException);
                throw illegalStateException;
            } else if (w3Var == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"span_id\"");
                d0Var.b(f3.ERROR, "Missing required field \"span_id\"", illegalStateException2);
                throw illegalStateException2;
            } else if (str != null) {
                u3 u3Var = new u3(oVar, w3Var, str, w3Var2, null);
                u3Var.i(str2);
                u3Var.k(x3Var);
                if (map != null) {
                    u3Var.f32655h = map;
                }
                u3Var.l(concurrentHashMap);
                t0Var.C();
                return u3Var;
            } else {
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"op\"");
                d0Var.b(f3.ERROR, "Missing required field \"op\"", illegalStateException3);
                throw illegalStateException3;
            }
        }
    }

    public u3(String str) {
        this(new io.sentry.protocol.o(), new w3(), str, null, null);
    }

    public String a() {
        return this.f32653f;
    }

    public String b() {
        return this.f32652e;
    }

    public w3 c() {
        return this.f32650c;
    }

    public Boolean d() {
        return this.f32651d;
    }

    public w3 e() {
        return this.f32649b;
    }

    public x3 f() {
        return this.f32654g;
    }

    public Map<String, String> g() {
        return this.f32655h;
    }

    public io.sentry.protocol.o h() {
        return this.f32648a;
    }

    public void i(String str) {
        this.f32653f = str;
    }

    @ApiStatus.Internal
    public void j(Boolean bool) {
        this.f32651d = bool;
    }

    public void k(x3 x3Var) {
        this.f32654g = x3Var;
    }

    public void l(Map<String, Object> map) {
        this.f32656i = map;
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.l();
        v0Var.P0("trace_id");
        this.f32648a.serialize(v0Var, d0Var);
        v0Var.P0("span_id");
        this.f32649b.serialize(v0Var, d0Var);
        if (this.f32650c != null) {
            v0Var.P0("parent_span_id");
            this.f32650c.serialize(v0Var, d0Var);
        }
        v0Var.P0("op").G0(this.f32652e);
        if (this.f32653f != null) {
            v0Var.P0("description").G0(this.f32653f);
        }
        if (this.f32654g != null) {
            v0Var.P0(PermissionsResponse.STATUS_KEY).Q0(d0Var, this.f32654g);
        }
        if (!this.f32655h.isEmpty()) {
            v0Var.P0("tags").Q0(d0Var, this.f32655h);
        }
        Map<String, Object> map = this.f32656i;
        if (map != null) {
            for (String str : map.keySet()) {
                v0Var.P0(str).Q0(d0Var, this.f32656i.get(str));
            }
        }
        v0Var.C();
    }

    public u3(io.sentry.protocol.o oVar, w3 w3Var, String str, w3 w3Var2, Boolean bool) {
        this(oVar, w3Var, w3Var2, str, null, bool, null);
    }

    @ApiStatus.Internal
    public u3(io.sentry.protocol.o oVar, w3 w3Var, w3 w3Var2, String str, String str2, Boolean bool, x3 x3Var) {
        this.f32655h = new ConcurrentHashMap();
        this.f32648a = (io.sentry.protocol.o) rz.j.a(oVar, "traceId is required");
        this.f32649b = (w3) rz.j.a(w3Var, "spanId is required");
        this.f32652e = (String) rz.j.a(str, "operation is required");
        this.f32650c = w3Var2;
        this.f32651d = bool;
        this.f32653f = str2;
        this.f32654g = x3Var;
    }

    public u3(u3 u3Var) {
        this.f32655h = new ConcurrentHashMap();
        this.f32648a = u3Var.f32648a;
        this.f32649b = u3Var.f32649b;
        this.f32650c = u3Var.f32650c;
        this.f32651d = u3Var.f32651d;
        this.f32652e = u3Var.f32652e;
        this.f32653f = u3Var.f32653f;
        this.f32654g = u3Var.f32654g;
        Map<String, String> b11 = rz.a.b(u3Var.f32655h);
        if (b11 != null) {
            this.f32655h = b11;
        }
    }
}