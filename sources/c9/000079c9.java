package io.sentry.protocol;

import com.stripe.android.networking.FraudDetectionData;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import expo.modules.interfaces.permissions.PermissionsResponse;
import io.sentry.d0;
import io.sentry.f3;
import io.sentry.n0;
import io.sentry.protocol.o;
import io.sentry.t0;
import io.sentry.t3;
import io.sentry.v0;
import io.sentry.w3;
import io.sentry.x0;
import io.sentry.x3;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class r implements x0 {

    /* renamed from: a  reason: collision with root package name */
    private final Double f32477a;

    /* renamed from: b  reason: collision with root package name */
    private final Double f32478b;

    /* renamed from: c  reason: collision with root package name */
    private final o f32479c;

    /* renamed from: d  reason: collision with root package name */
    private final w3 f32480d;

    /* renamed from: e  reason: collision with root package name */
    private final w3 f32481e;

    /* renamed from: f  reason: collision with root package name */
    private final String f32482f;

    /* renamed from: g  reason: collision with root package name */
    private final String f32483g;

    /* renamed from: h  reason: collision with root package name */
    private final x3 f32484h;

    /* renamed from: i  reason: collision with root package name */
    private final Map<String, String> f32485i;

    /* renamed from: j  reason: collision with root package name */
    private final Map<String, Object> f32486j;

    /* renamed from: k  reason: collision with root package name */
    private Map<String, Object> f32487k;

    /* loaded from: classes5.dex */
    public static final class a implements n0<r> {
        private Exception c(String str, d0 d0Var) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            d0Var.b(f3.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.n0
        /* renamed from: b */
        public r a(t0 t0Var, d0 d0Var) {
            t0Var.g();
            Map map = null;
            Double d11 = null;
            Double d12 = null;
            o oVar = null;
            w3 w3Var = null;
            w3 w3Var2 = null;
            String str = null;
            String str2 = null;
            x3 x3Var = null;
            Map map2 = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (true) {
                Map map3 = map2;
                x3 x3Var2 = x3Var;
                String str3 = str2;
                if (t0Var.G0() != io.sentry.vendor.gson.stream.b.NAME) {
                    if (d11 != null) {
                        if (oVar != null) {
                            if (w3Var != null) {
                                if (str != null) {
                                    r rVar = new r(d11, d12, oVar, w3Var, w3Var2, str, str3, x3Var2, map == null ? new HashMap() : map, map3);
                                    rVar.c(concurrentHashMap);
                                    t0Var.C();
                                    return rVar;
                                }
                                throw c("op", d0Var);
                            }
                            throw c("span_id", d0Var);
                        }
                        throw c("trace_id", d0Var);
                    }
                    throw c("start_timestamp", d0Var);
                }
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
                    case -1526966919:
                        if (p02.equals("start_timestamp")) {
                            c11 = 3;
                            break;
                        }
                        break;
                    case -892481550:
                        if (p02.equals(PermissionsResponse.STATUS_KEY)) {
                            c11 = 4;
                            break;
                        }
                        break;
                    case 3553:
                        if (p02.equals("op")) {
                            c11 = 5;
                            break;
                        }
                        break;
                    case 3076010:
                        if (p02.equals(MessageExtension.FIELD_DATA)) {
                            c11 = 6;
                            break;
                        }
                        break;
                    case 3552281:
                        if (p02.equals("tags")) {
                            c11 = 7;
                            break;
                        }
                        break;
                    case 55126294:
                        if (p02.equals(FraudDetectionData.KEY_TIMESTAMP)) {
                            c11 = '\b';
                            break;
                        }
                        break;
                    case 1270300245:
                        if (p02.equals("trace_id")) {
                            c11 = '\t';
                            break;
                        }
                        break;
                }
                switch (c11) {
                    case 0:
                        w3Var = new w3.a().a(t0Var, d0Var);
                        map2 = map3;
                        x3Var = x3Var2;
                        break;
                    case 1:
                        w3Var2 = (w3) t0Var.M1(d0Var, new w3.a());
                        map2 = map3;
                        x3Var = x3Var2;
                        break;
                    case 2:
                        str2 = t0Var.N1();
                        map2 = map3;
                        x3Var = x3Var2;
                        continue;
                    case 3:
                        try {
                            d11 = t0Var.v1();
                        } catch (NumberFormatException unused) {
                            Date t12 = t0Var.t1(d0Var);
                            d11 = t12 != null ? Double.valueOf(io.sentry.g.a(t12)) : null;
                        }
                        map2 = map3;
                        x3Var = x3Var2;
                        break;
                    case 4:
                        x3Var = (x3) t0Var.M1(d0Var, new x3.a());
                        map2 = map3;
                        break;
                    case 5:
                        str = t0Var.N1();
                        map2 = map3;
                        x3Var = x3Var2;
                        break;
                    case 6:
                        map2 = (Map) t0Var.L1();
                        x3Var = x3Var2;
                        break;
                    case 7:
                        map = (Map) t0Var.L1();
                        map2 = map3;
                        x3Var = x3Var2;
                        break;
                    case '\b':
                        try {
                            d12 = t0Var.v1();
                        } catch (NumberFormatException unused2) {
                            Date t13 = t0Var.t1(d0Var);
                            d12 = t13 != null ? Double.valueOf(io.sentry.g.a(t13)) : null;
                        }
                        map2 = map3;
                        x3Var = x3Var2;
                        break;
                    case '\t':
                        oVar = new o.a().a(t0Var, d0Var);
                        map2 = map3;
                        x3Var = x3Var2;
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        t0Var.P1(d0Var, concurrentHashMap, p02);
                        map2 = map3;
                        x3Var = x3Var2;
                        break;
                }
                str2 = str3;
            }
        }
    }

    public r(t3 t3Var) {
        this(t3Var, t3Var.j());
    }

    private BigDecimal a(Double d11) {
        return BigDecimal.valueOf(d11.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public String b() {
        return this.f32482f;
    }

    public void c(Map<String, Object> map) {
        this.f32487k = map;
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.l();
        v0Var.P0("start_timestamp").Q0(d0Var, a(this.f32477a));
        if (this.f32478b != null) {
            v0Var.P0(FraudDetectionData.KEY_TIMESTAMP).Q0(d0Var, a(this.f32478b));
        }
        v0Var.P0("trace_id").Q0(d0Var, this.f32479c);
        v0Var.P0("span_id").Q0(d0Var, this.f32480d);
        if (this.f32481e != null) {
            v0Var.P0("parent_span_id").Q0(d0Var, this.f32481e);
        }
        v0Var.P0("op").G0(this.f32482f);
        if (this.f32483g != null) {
            v0Var.P0("description").G0(this.f32483g);
        }
        if (this.f32484h != null) {
            v0Var.P0(PermissionsResponse.STATUS_KEY).Q0(d0Var, this.f32484h);
        }
        if (!this.f32485i.isEmpty()) {
            v0Var.P0("tags").Q0(d0Var, this.f32485i);
        }
        if (this.f32486j != null) {
            v0Var.P0(MessageExtension.FIELD_DATA).Q0(d0Var, this.f32486j);
        }
        Map<String, Object> map = this.f32487k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f32487k.get(str);
                v0Var.P0(str);
                v0Var.Q0(d0Var, obj);
            }
        }
        v0Var.C();
    }

    @ApiStatus.Internal
    public r(t3 t3Var, Map<String, Object> map) {
        rz.j.a(t3Var, "span is required");
        this.f32483g = t3Var.k();
        this.f32482f = t3Var.p();
        this.f32480d = t3Var.r();
        this.f32481e = t3Var.q();
        this.f32479c = t3Var.v();
        this.f32484h = t3Var.getStatus();
        Map<String, String> b11 = rz.a.b(t3Var.t());
        this.f32485i = b11 == null ? new ConcurrentHashMap<>() : b11;
        this.f32478b = t3Var.n();
        this.f32477a = Double.valueOf(io.sentry.g.a(t3Var.s()));
        this.f32486j = map;
    }

    @ApiStatus.Internal
    public r(Double d11, Double d12, o oVar, w3 w3Var, w3 w3Var2, String str, String str2, x3 x3Var, Map<String, String> map, Map<String, Object> map2) {
        this.f32477a = d11;
        this.f32478b = d12;
        this.f32479c = oVar;
        this.f32480d = w3Var;
        this.f32481e = w3Var2;
        this.f32482f = str;
        this.f32483g = str2;
        this.f32484h = x3Var;
        this.f32485i = map;
        this.f32486j = map2;
    }
}