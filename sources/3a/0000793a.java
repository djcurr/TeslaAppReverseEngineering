package io.sentry;

import com.stripe.android.networking.FraudDetectionData;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import io.sentry.f3;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

/* loaded from: classes5.dex */
public final class c implements x0 {

    /* renamed from: a  reason: collision with root package name */
    private final Date f32199a;

    /* renamed from: b  reason: collision with root package name */
    private String f32200b;

    /* renamed from: c  reason: collision with root package name */
    private String f32201c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, Object> f32202d;

    /* renamed from: e  reason: collision with root package name */
    private String f32203e;

    /* renamed from: f  reason: collision with root package name */
    private f3 f32204f;

    /* renamed from: g  reason: collision with root package name */
    private Map<String, Object> f32205g;

    /* loaded from: classes5.dex */
    public static final class a implements n0<c> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v4, types: [java.util.Map] */
        @Override // io.sentry.n0
        /* renamed from: b */
        public c a(t0 t0Var, d0 d0Var) {
            t0Var.g();
            Date b11 = g.b();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            String str = null;
            String str2 = null;
            String str3 = null;
            f3 f3Var = null;
            ConcurrentHashMap concurrentHashMap2 = null;
            while (t0Var.G0() == io.sentry.vendor.gson.stream.b.NAME) {
                String p02 = t0Var.p0();
                p02.hashCode();
                char c11 = 65535;
                switch (p02.hashCode()) {
                    case 3076010:
                        if (p02.equals(MessageExtension.FIELD_DATA)) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case 3575610:
                        if (p02.equals("type")) {
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
                    case 55126294:
                        if (p02.equals(FraudDetectionData.KEY_TIMESTAMP)) {
                            c11 = 3;
                            break;
                        }
                        break;
                    case 102865796:
                        if (p02.equals("level")) {
                            c11 = 4;
                            break;
                        }
                        break;
                    case 954925063:
                        if (p02.equals("message")) {
                            c11 = 5;
                            break;
                        }
                        break;
                }
                switch (c11) {
                    case 0:
                        ?? b12 = rz.a.b((Map) t0Var.L1());
                        if (b12 == 0) {
                            break;
                        } else {
                            concurrentHashMap = b12;
                            break;
                        }
                    case 1:
                        str2 = t0Var.N1();
                        break;
                    case 2:
                        str3 = t0Var.N1();
                        break;
                    case 3:
                        Date t12 = t0Var.t1(d0Var);
                        if (t12 == null) {
                            break;
                        } else {
                            b11 = t12;
                            break;
                        }
                    case 4:
                        try {
                            f3Var = new f3.a().a(t0Var, d0Var);
                            break;
                        } catch (Exception e11) {
                            d0Var.a(f3.ERROR, e11, "Error when deserializing SentryLevel", new Object[0]);
                            break;
                        }
                    case 5:
                        str = t0Var.N1();
                        break;
                    default:
                        if (concurrentHashMap2 == null) {
                            concurrentHashMap2 = new ConcurrentHashMap();
                        }
                        t0Var.P1(d0Var, concurrentHashMap2, p02);
                        break;
                }
            }
            c cVar = new c(b11);
            cVar.f32200b = str;
            cVar.f32201c = str2;
            cVar.f32202d = concurrentHashMap;
            cVar.f32203e = str3;
            cVar.f32204f = f3Var;
            cVar.q(concurrentHashMap2);
            t0Var.C();
            return cVar;
        }
    }

    public c(Date date) {
        this.f32202d = new ConcurrentHashMap();
        this.f32199a = date;
    }

    public static c r(String str, String str2, String str3, Map<String, Object> map) {
        c cVar = new c();
        cVar.p("user");
        cVar.l("ui." + str);
        if (str2 != null) {
            cVar.m("view.id", str2);
        }
        if (str3 != null) {
            cVar.m("view.class", str3);
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            cVar.g().put(entry.getKey(), entry.getValue());
        }
        cVar.n(f3.INFO);
        return cVar;
    }

    public String f() {
        return this.f32203e;
    }

    @ApiStatus.Internal
    public Map<String, Object> g() {
        return this.f32202d;
    }

    public f3 h() {
        return this.f32204f;
    }

    public String i() {
        return this.f32200b;
    }

    public Date j() {
        return (Date) this.f32199a.clone();
    }

    public String k() {
        return this.f32201c;
    }

    public void l(String str) {
        this.f32203e = str;
    }

    public void m(String str, Object obj) {
        this.f32202d.put(str, obj);
    }

    public void n(f3 f3Var) {
        this.f32204f = f3Var;
    }

    public void o(String str) {
        this.f32200b = str;
    }

    public void p(String str) {
        this.f32201c = str;
    }

    public void q(Map<String, Object> map) {
        this.f32205g = map;
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.l();
        v0Var.P0(FraudDetectionData.KEY_TIMESTAMP).Q0(d0Var, this.f32199a);
        if (this.f32200b != null) {
            v0Var.P0("message").G0(this.f32200b);
        }
        if (this.f32201c != null) {
            v0Var.P0("type").G0(this.f32201c);
        }
        v0Var.P0(MessageExtension.FIELD_DATA).Q0(d0Var, this.f32202d);
        if (this.f32203e != null) {
            v0Var.P0("category").G0(this.f32203e);
        }
        if (this.f32204f != null) {
            v0Var.P0("level").Q0(d0Var, this.f32204f);
        }
        Map<String, Object> map = this.f32205g;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f32205g.get(str);
                v0Var.P0(str);
                v0Var.Q0(d0Var, obj);
            }
        }
        v0Var.C();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(c cVar) {
        this.f32202d = new ConcurrentHashMap();
        this.f32199a = cVar.f32199a;
        this.f32200b = cVar.f32200b;
        this.f32201c = cVar.f32201c;
        this.f32203e = cVar.f32203e;
        Map<String, Object> b11 = rz.a.b(cVar.f32202d);
        if (b11 != null) {
            this.f32202d = b11;
        }
        this.f32205g = rz.a.b(cVar.f32205g);
        this.f32204f = cVar.f32204f;
    }

    public c() {
        this(g.b());
    }
}