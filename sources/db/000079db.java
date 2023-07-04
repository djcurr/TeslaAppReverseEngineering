package io.sentry;

import com.stripe.android.networking.FraudDetectionData;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.ApiStatus;

/* loaded from: classes5.dex */
public final class q3 implements x0 {

    /* renamed from: a */
    private final Date f32557a;

    /* renamed from: b */
    private Date f32558b;

    /* renamed from: c */
    private final AtomicInteger f32559c;

    /* renamed from: d */
    private final String f32560d;

    /* renamed from: e */
    private final UUID f32561e;

    /* renamed from: f */
    private Boolean f32562f;

    /* renamed from: g */
    private b f32563g;

    /* renamed from: h */
    private Long f32564h;

    /* renamed from: i */
    private Double f32565i;

    /* renamed from: j */
    private final String f32566j;

    /* renamed from: k */
    private String f32567k;

    /* renamed from: l */
    private final String f32568l;

    /* renamed from: m */
    private final String f32569m;

    /* renamed from: n */
    private final Object f32570n;

    /* renamed from: o */
    private Map<String, Object> f32571o;

    /* loaded from: classes5.dex */
    public static final class a implements n0<q3> {
        private Exception c(String str, d0 d0Var) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            d0Var.b(f3.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // io.sentry.n0
        /* renamed from: b */
        public q3 a(t0 t0Var, d0 d0Var) {
            char c11;
            String str;
            boolean z11;
            t0Var.g();
            Integer num = null;
            b bVar = null;
            Date date = null;
            Date date2 = null;
            ConcurrentHashMap concurrentHashMap = null;
            String str2 = null;
            UUID uuid = null;
            Boolean bool = null;
            Long l11 = null;
            Double d11 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            while (true) {
                String str7 = str5;
                String str8 = str4;
                String str9 = str3;
                Double d12 = d11;
                if (t0Var.G0() != io.sentry.vendor.gson.stream.b.NAME) {
                    Long l12 = l11;
                    if (bVar != null) {
                        if (date != null) {
                            if (num != null) {
                                if (str6 != null) {
                                    q3 q3Var = new q3(bVar, date, date2, num.intValue(), str2, uuid, bool, l12, d12, str9, str8, str7, str6);
                                    q3Var.l(concurrentHashMap);
                                    t0Var.C();
                                    return q3Var;
                                }
                                throw c("release", d0Var);
                            }
                            throw c("errors", d0Var);
                        }
                        throw c("started", d0Var);
                    }
                    throw c(PermissionsResponse.STATUS_KEY, d0Var);
                }
                String p02 = t0Var.p0();
                p02.hashCode();
                Long l13 = l11;
                switch (p02.hashCode()) {
                    case -1992012396:
                        if (p02.equals("duration")) {
                            c11 = 0;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1897185151:
                        if (p02.equals("started")) {
                            c11 = 1;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1294635157:
                        if (p02.equals("errors")) {
                            c11 = 2;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -892481550:
                        if (p02.equals(PermissionsResponse.STATUS_KEY)) {
                            c11 = 3;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 99455:
                        if (p02.equals("did")) {
                            c11 = 4;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 113759:
                        if (p02.equals("seq")) {
                            c11 = 5;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 113870:
                        if (p02.equals("sid")) {
                            c11 = 6;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3237136:
                        if (p02.equals("init")) {
                            c11 = 7;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 55126294:
                        if (p02.equals(FraudDetectionData.KEY_TIMESTAMP)) {
                            c11 = '\b';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 93152418:
                        if (p02.equals("attrs")) {
                            c11 = '\t';
                            break;
                        }
                        c11 = 65535;
                        break;
                    default:
                        c11 = 65535;
                        break;
                }
                switch (c11) {
                    case 0:
                        d11 = t0Var.v1();
                        str5 = str7;
                        str4 = str8;
                        str3 = str9;
                        break;
                    case 1:
                        date = t0Var.t1(d0Var);
                        str5 = str7;
                        str4 = str8;
                        str3 = str9;
                        d11 = d12;
                        break;
                    case 2:
                        num = t0Var.D1();
                        str5 = str7;
                        str4 = str8;
                        str3 = str9;
                        d11 = d12;
                        break;
                    case 3:
                        String b11 = rz.m.b(t0Var.N1());
                        if (b11 != null) {
                            bVar = b.valueOf(b11);
                        }
                        str5 = str7;
                        str4 = str8;
                        str3 = str9;
                        d11 = d12;
                        break;
                    case 4:
                        str2 = t0Var.N1();
                        str5 = str7;
                        str4 = str8;
                        str3 = str9;
                        d11 = d12;
                        break;
                    case 5:
                        l11 = t0Var.K1();
                        str5 = str7;
                        str4 = str8;
                        str3 = str9;
                        d11 = d12;
                        continue;
                    case 6:
                        try {
                            str = t0Var.N1();
                            try {
                                uuid = UUID.fromString(str);
                            } catch (IllegalArgumentException unused) {
                                d0Var.c(f3.ERROR, "%s sid is not valid.", str);
                                str5 = str7;
                                str4 = str8;
                                str3 = str9;
                                d11 = d12;
                                l11 = l13;
                            }
                        } catch (IllegalArgumentException unused2) {
                            str = null;
                        }
                        str5 = str7;
                        str4 = str8;
                        str3 = str9;
                        d11 = d12;
                    case 7:
                        bool = t0Var.p1();
                        str5 = str7;
                        str4 = str8;
                        str3 = str9;
                        d11 = d12;
                        break;
                    case '\b':
                        date2 = t0Var.t1(d0Var);
                        str5 = str7;
                        str4 = str8;
                        str3 = str9;
                        d11 = d12;
                        break;
                    case '\t':
                        t0Var.g();
                        str4 = str8;
                        str3 = str9;
                        while (t0Var.G0() == io.sentry.vendor.gson.stream.b.NAME) {
                            String p03 = t0Var.p0();
                            p03.hashCode();
                            switch (p03.hashCode()) {
                                case -85904877:
                                    if (p03.equals("environment")) {
                                        z11 = false;
                                        break;
                                    }
                                    z11 = true;
                                    break;
                                case 1090594823:
                                    if (p03.equals("release")) {
                                        z11 = true;
                                        break;
                                    }
                                    z11 = true;
                                    break;
                                case 1480014044:
                                    if (p03.equals("ip_address")) {
                                        z11 = true;
                                        break;
                                    }
                                    z11 = true;
                                    break;
                                case 1917799825:
                                    if (p03.equals("user_agent")) {
                                        z11 = true;
                                        break;
                                    }
                                    z11 = true;
                                    break;
                                default:
                                    z11 = true;
                                    break;
                            }
                            switch (z11) {
                                case false:
                                    str7 = t0Var.N1();
                                    break;
                                case true:
                                    str6 = t0Var.N1();
                                    break;
                                case true:
                                    str3 = t0Var.N1();
                                    break;
                                case true:
                                    str4 = t0Var.N1();
                                    break;
                                default:
                                    t0Var.b1();
                                    break;
                            }
                        }
                        t0Var.C();
                        str5 = str7;
                        d11 = d12;
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        t0Var.P1(d0Var, concurrentHashMap, p02);
                        str5 = str7;
                        str4 = str8;
                        str3 = str9;
                        d11 = d12;
                        break;
                }
                l11 = l13;
            }
        }
    }

    /* loaded from: classes5.dex */
    public enum b {
        Ok,
        Exited,
        Crashed,
        Abnormal
    }

    public q3(b bVar, Date date, Date date2, int i11, String str, UUID uuid, Boolean bool, Long l11, Double d11, String str2, String str3, String str4, String str5) {
        this.f32570n = new Object();
        this.f32563g = bVar;
        this.f32557a = date;
        this.f32558b = date2;
        this.f32559c = new AtomicInteger(i11);
        this.f32560d = str;
        this.f32561e = uuid;
        this.f32562f = bool;
        this.f32564h = l11;
        this.f32565i = d11;
        this.f32566j = str2;
        this.f32567k = str3;
        this.f32568l = str4;
        this.f32569m = str5;
    }

    private double a(Date date) {
        return Math.abs(date.getTime() - this.f32557a.getTime()) / 1000.0d;
    }

    private long h(Date date) {
        long time = date.getTime();
        return time < 0 ? Math.abs(time) : time;
    }

    /* renamed from: b */
    public q3 clone() {
        return new q3(this.f32563g, this.f32557a, this.f32558b, this.f32559c.get(), this.f32560d, this.f32561e, this.f32562f, this.f32564h, this.f32565i, this.f32566j, this.f32567k, this.f32568l, this.f32569m);
    }

    public void c() {
        d(g.b());
    }

    public void d(Date date) {
        synchronized (this.f32570n) {
            this.f32562f = null;
            if (this.f32563g == b.Ok) {
                this.f32563g = b.Exited;
            }
            if (date != null) {
                this.f32558b = date;
            } else {
                this.f32558b = g.b();
            }
            Date date2 = this.f32558b;
            if (date2 != null) {
                this.f32565i = Double.valueOf(a(date2));
                this.f32564h = Long.valueOf(h(this.f32558b));
            }
        }
    }

    public int e() {
        return this.f32559c.get();
    }

    public Boolean f() {
        return this.f32562f;
    }

    public String g() {
        return this.f32569m;
    }

    public UUID i() {
        return this.f32561e;
    }

    public b j() {
        return this.f32563g;
    }

    @ApiStatus.Internal
    public void k() {
        this.f32562f = Boolean.TRUE;
    }

    public void l(Map<String, Object> map) {
        this.f32571o = map;
    }

    public boolean m(b bVar, String str, boolean z11) {
        boolean z12;
        synchronized (this.f32570n) {
            boolean z13 = false;
            z12 = true;
            if (bVar != null) {
                try {
                    this.f32563g = bVar;
                    z13 = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (str != null) {
                this.f32567k = str;
                z13 = true;
            }
            if (z11) {
                this.f32559c.addAndGet(1);
            } else {
                z12 = z13;
            }
            if (z12) {
                this.f32562f = null;
                Date b11 = g.b();
                this.f32558b = b11;
                if (b11 != null) {
                    this.f32564h = Long.valueOf(h(b11));
                }
            }
        }
        return z12;
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.l();
        if (this.f32561e != null) {
            v0Var.P0("sid").G0(this.f32561e.toString());
        }
        if (this.f32560d != null) {
            v0Var.P0("did").G0(this.f32560d);
        }
        if (this.f32562f != null) {
            v0Var.P0("init").D0(this.f32562f);
        }
        v0Var.P0("started").Q0(d0Var, this.f32557a);
        v0Var.P0(PermissionsResponse.STATUS_KEY).Q0(d0Var, this.f32563g.name().toLowerCase(Locale.ROOT));
        if (this.f32564h != null) {
            v0Var.P0("seq").F0(this.f32564h);
        }
        v0Var.P0("errors").C0(this.f32559c.intValue());
        if (this.f32565i != null) {
            v0Var.P0("duration").F0(this.f32565i);
        }
        if (this.f32558b != null) {
            v0Var.P0(FraudDetectionData.KEY_TIMESTAMP).Q0(d0Var, this.f32558b);
        }
        v0Var.P0("attrs");
        v0Var.l();
        v0Var.P0("release").Q0(d0Var, this.f32569m);
        if (this.f32568l != null) {
            v0Var.P0("environment").Q0(d0Var, this.f32568l);
        }
        if (this.f32566j != null) {
            v0Var.P0("ip_address").Q0(d0Var, this.f32566j);
        }
        if (this.f32567k != null) {
            v0Var.P0("user_agent").Q0(d0Var, this.f32567k);
        }
        v0Var.C();
        Map<String, Object> map = this.f32571o;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f32571o.get(str);
                v0Var.P0(str);
                v0Var.Q0(d0Var, obj);
            }
        }
        v0Var.C();
    }

    public q3(String str, io.sentry.protocol.w wVar, String str2, String str3) {
        this(b.Ok, g.b(), g.b(), 0, str, UUID.randomUUID(), Boolean.TRUE, null, null, wVar != null ? wVar.h() : null, null, str2, str3);
    }
}