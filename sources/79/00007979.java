package io.sentry;

import ch.qos.logback.core.CoreConstants;
import io.sentry.protocol.o;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class i4 implements x0 {

    /* renamed from: a  reason: collision with root package name */
    private final io.sentry.protocol.o f32292a;

    /* renamed from: b  reason: collision with root package name */
    private String f32293b;

    /* renamed from: c  reason: collision with root package name */
    private String f32294c;

    /* renamed from: d  reason: collision with root package name */
    private String f32295d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, Object> f32296e;

    /* loaded from: classes5.dex */
    public static final class a implements n0<i4> {
        @Override // io.sentry.n0
        /* renamed from: b */
        public i4 a(t0 t0Var, d0 d0Var) {
            t0Var.g();
            io.sentry.protocol.o oVar = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            HashMap hashMap = null;
            while (t0Var.G0() == io.sentry.vendor.gson.stream.b.NAME) {
                String p02 = t0Var.p0();
                p02.hashCode();
                char c11 = 65535;
                switch (p02.hashCode()) {
                    case -602415628:
                        if (p02.equals("comments")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case 3373707:
                        if (p02.equals("name")) {
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
                    case 278118624:
                        if (p02.equals("event_id")) {
                            c11 = 3;
                            break;
                        }
                        break;
                }
                switch (c11) {
                    case 0:
                        str3 = t0Var.N1();
                        break;
                    case 1:
                        str = t0Var.N1();
                        break;
                    case 2:
                        str2 = t0Var.N1();
                        break;
                    case 3:
                        oVar = new o.a().a(t0Var, d0Var);
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
            if (oVar != null) {
                i4 i4Var = new i4(oVar, str, str2, str3);
                i4Var.a(hashMap);
                return i4Var;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"event_id\"");
            d0Var.b(f3.ERROR, "Missing required field \"event_id\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public i4(io.sentry.protocol.o oVar, String str, String str2, String str3) {
        this.f32292a = oVar;
        this.f32293b = str;
        this.f32294c = str2;
        this.f32295d = str3;
    }

    public void a(Map<String, Object> map) {
        this.f32296e = map;
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.l();
        v0Var.P0("event_id");
        this.f32292a.serialize(v0Var, d0Var);
        if (this.f32293b != null) {
            v0Var.P0("name").G0(this.f32293b);
        }
        if (this.f32294c != null) {
            v0Var.P0("email").G0(this.f32294c);
        }
        if (this.f32295d != null) {
            v0Var.P0("comments").G0(this.f32295d);
        }
        Map<String, Object> map = this.f32296e;
        if (map != null) {
            for (String str : map.keySet()) {
                v0Var.P0(str).Q0(d0Var, this.f32296e.get(str));
            }
        }
        v0Var.C();
    }

    public String toString() {
        return "UserFeedback{eventId=" + this.f32292a + ", name='" + this.f32293b + CoreConstants.SINGLE_QUOTE_CHAR + ", email='" + this.f32294c + CoreConstants.SINGLE_QUOTE_CHAR + ", comments='" + this.f32295d + CoreConstants.SINGLE_QUOTE_CHAR + CoreConstants.CURLY_RIGHT;
    }
}