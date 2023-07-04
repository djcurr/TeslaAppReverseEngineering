package mz;

import ch.qos.logback.core.CoreConstants;
import io.sentry.d0;
import io.sentry.f3;
import io.sentry.n0;
import io.sentry.t0;
import io.sentry.v0;
import io.sentry.x0;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class f implements x0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f39658a;

    /* renamed from: b  reason: collision with root package name */
    private final String f39659b;

    /* renamed from: c  reason: collision with root package name */
    private final Long f39660c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, Object> f39661d;

    /* loaded from: classes5.dex */
    public static final class a implements n0<f> {
        private Exception c(String str, d0 d0Var) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            d0Var.b(f3.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.n0
        /* renamed from: b */
        public f a(t0 t0Var, d0 d0Var) {
            t0Var.g();
            String str = null;
            String str2 = null;
            Long l11 = null;
            HashMap hashMap = null;
            while (t0Var.G0() == io.sentry.vendor.gson.stream.b.NAME) {
                String p02 = t0Var.p0();
                p02.hashCode();
                char c11 = 65535;
                switch (p02.hashCode()) {
                    case -1285004149:
                        if (p02.equals("quantity")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case -934964668:
                        if (p02.equals("reason")) {
                            c11 = 1;
                            break;
                        }
                        break;
                    case 50511102:
                        if (p02.equals("category")) {
                            c11 = 2;
                            break;
                        }
                        break;
                }
                switch (c11) {
                    case 0:
                        l11 = t0Var.K1();
                        break;
                    case 1:
                        str = t0Var.N1();
                        break;
                    case 2:
                        str2 = t0Var.N1();
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
            if (str != null) {
                if (str2 != null) {
                    if (l11 != null) {
                        f fVar = new f(str, str2, l11);
                        fVar.d(hashMap);
                        return fVar;
                    }
                    throw c("quantity", d0Var);
                }
                throw c("category", d0Var);
            }
            throw c("reason", d0Var);
        }
    }

    public f(String str, String str2, Long l11) {
        this.f39658a = str;
        this.f39659b = str2;
        this.f39660c = l11;
    }

    public String a() {
        return this.f39659b;
    }

    public Long b() {
        return this.f39660c;
    }

    public String c() {
        return this.f39658a;
    }

    public void d(Map<String, Object> map) {
        this.f39661d = map;
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.l();
        v0Var.P0("reason").G0(this.f39658a);
        v0Var.P0("category").G0(this.f39659b);
        v0Var.P0("quantity").F0(this.f39660c);
        Map<String, Object> map = this.f39661d;
        if (map != null) {
            for (String str : map.keySet()) {
                v0Var.P0(str).Q0(d0Var, this.f39661d.get(str));
            }
        }
        v0Var.C();
    }

    public String toString() {
        return "DiscardedEvent{reason='" + this.f39658a + CoreConstants.SINGLE_QUOTE_CHAR + ", category='" + this.f39659b + CoreConstants.SINGLE_QUOTE_CHAR + ", quantity=" + this.f39660c + CoreConstants.CURLY_RIGHT;
    }
}