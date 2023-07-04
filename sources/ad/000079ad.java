package io.sentry.protocol;

import com.stripe.android.model.parsers.AccountRangeJsonParser;
import io.sentry.d0;
import io.sentry.n0;
import io.sentry.t0;
import io.sentry.v0;
import io.sentry.x0;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class e implements x0 {
    private Float A;
    private Integer B;
    private Date C;
    private TimeZone E;
    private String F;
    @Deprecated
    private String G;
    private String H;
    private String K;
    private Float L;
    private Map<String, Object> O;

    /* renamed from: a  reason: collision with root package name */
    private String f32390a;

    /* renamed from: b  reason: collision with root package name */
    private String f32391b;

    /* renamed from: c  reason: collision with root package name */
    private String f32392c;

    /* renamed from: d  reason: collision with root package name */
    private String f32393d;

    /* renamed from: e  reason: collision with root package name */
    private String f32394e;

    /* renamed from: f  reason: collision with root package name */
    private String f32395f;

    /* renamed from: g  reason: collision with root package name */
    private String[] f32396g;

    /* renamed from: h  reason: collision with root package name */
    private Float f32397h;

    /* renamed from: i  reason: collision with root package name */
    private Boolean f32398i;

    /* renamed from: j  reason: collision with root package name */
    private Boolean f32399j;

    /* renamed from: k  reason: collision with root package name */
    private b f32400k;

    /* renamed from: l  reason: collision with root package name */
    private Boolean f32401l;

    /* renamed from: m  reason: collision with root package name */
    private Long f32402m;

    /* renamed from: n  reason: collision with root package name */
    private Long f32403n;

    /* renamed from: o  reason: collision with root package name */
    private Long f32404o;

    /* renamed from: p  reason: collision with root package name */
    private Boolean f32405p;

    /* renamed from: q  reason: collision with root package name */
    private Long f32406q;

    /* renamed from: t  reason: collision with root package name */
    private Long f32407t;

    /* renamed from: w  reason: collision with root package name */
    private Long f32408w;

    /* renamed from: x  reason: collision with root package name */
    private Long f32409x;

    /* renamed from: y  reason: collision with root package name */
    private Integer f32410y;

    /* renamed from: z  reason: collision with root package name */
    private Integer f32411z;

    /* loaded from: classes5.dex */
    public static final class a implements n0<e> {
        @Override // io.sentry.n0
        /* renamed from: b */
        public e a(t0 t0Var, d0 d0Var) {
            t0Var.g();
            e eVar = new e();
            ConcurrentHashMap concurrentHashMap = null;
            while (t0Var.G0() == io.sentry.vendor.gson.stream.b.NAME) {
                String p02 = t0Var.p0();
                p02.hashCode();
                char c11 = 65535;
                switch (p02.hashCode()) {
                    case -2076227591:
                        if (p02.equals("timezone")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case -2012489734:
                        if (p02.equals("boot_time")) {
                            c11 = 1;
                            break;
                        }
                        break;
                    case -1981332476:
                        if (p02.equals("simulator")) {
                            c11 = 2;
                            break;
                        }
                        break;
                    case -1969347631:
                        if (p02.equals("manufacturer")) {
                            c11 = 3;
                            break;
                        }
                        break;
                    case -1613589672:
                        if (p02.equals("language")) {
                            c11 = 4;
                            break;
                        }
                        break;
                    case -1439500848:
                        if (p02.equals("orientation")) {
                            c11 = 5;
                            break;
                        }
                        break;
                    case -1410521534:
                        if (p02.equals("battery_temperature")) {
                            c11 = 6;
                            break;
                        }
                        break;
                    case -1281860764:
                        if (p02.equals("family")) {
                            c11 = 7;
                            break;
                        }
                        break;
                    case -1097462182:
                        if (p02.equals("locale")) {
                            c11 = '\b';
                            break;
                        }
                        break;
                    case -1012222381:
                        if (p02.equals("online")) {
                            c11 = '\t';
                            break;
                        }
                        break;
                    case -877252910:
                        if (p02.equals("battery_level")) {
                            c11 = '\n';
                            break;
                        }
                        break;
                    case -619038223:
                        if (p02.equals("model_id")) {
                            c11 = 11;
                            break;
                        }
                        break;
                    case -568274923:
                        if (p02.equals("screen_density")) {
                            c11 = '\f';
                            break;
                        }
                        break;
                    case -417046774:
                        if (p02.equals("screen_dpi")) {
                            c11 = '\r';
                            break;
                        }
                        break;
                    case -136523212:
                        if (p02.equals("free_memory")) {
                            c11 = 14;
                            break;
                        }
                        break;
                    case 3355:
                        if (p02.equals("id")) {
                            c11 = 15;
                            break;
                        }
                        break;
                    case 3373707:
                        if (p02.equals("name")) {
                            c11 = 16;
                            break;
                        }
                        break;
                    case 59142220:
                        if (p02.equals("low_memory")) {
                            c11 = 17;
                            break;
                        }
                        break;
                    case 93076189:
                        if (p02.equals("archs")) {
                            c11 = 18;
                            break;
                        }
                        break;
                    case 93997959:
                        if (p02.equals(AccountRangeJsonParser.FIELD_BRAND)) {
                            c11 = 19;
                            break;
                        }
                        break;
                    case 104069929:
                        if (p02.equals("model")) {
                            c11 = 20;
                            break;
                        }
                        break;
                    case 731866107:
                        if (p02.equals("connection_type")) {
                            c11 = 21;
                            break;
                        }
                        break;
                    case 817830969:
                        if (p02.equals("screen_width_pixels")) {
                            c11 = 22;
                            break;
                        }
                        break;
                    case 823882553:
                        if (p02.equals("external_storage_size")) {
                            c11 = 23;
                            break;
                        }
                        break;
                    case 897428293:
                        if (p02.equals("storage_size")) {
                            c11 = 24;
                            break;
                        }
                        break;
                    case 1331465768:
                        if (p02.equals("usable_memory")) {
                            c11 = 25;
                            break;
                        }
                        break;
                    case 1418777727:
                        if (p02.equals("memory_size")) {
                            c11 = 26;
                            break;
                        }
                        break;
                    case 1436115569:
                        if (p02.equals("charging")) {
                            c11 = 27;
                            break;
                        }
                        break;
                    case 1450613660:
                        if (p02.equals("external_free_storage")) {
                            c11 = 28;
                            break;
                        }
                        break;
                    case 1524159400:
                        if (p02.equals("free_storage")) {
                            c11 = 29;
                            break;
                        }
                        break;
                    case 1556284978:
                        if (p02.equals("screen_height_pixels")) {
                            c11 = 30;
                            break;
                        }
                        break;
                }
                switch (c11) {
                    case 0:
                        eVar.E = t0Var.O1(d0Var);
                        break;
                    case 1:
                        if (t0Var.G0() != io.sentry.vendor.gson.stream.b.STRING) {
                            break;
                        } else {
                            eVar.C = t0Var.t1(d0Var);
                            break;
                        }
                    case 2:
                        eVar.f32401l = t0Var.p1();
                        break;
                    case 3:
                        eVar.f32391b = t0Var.N1();
                        break;
                    case 4:
                        eVar.G = t0Var.N1();
                        break;
                    case 5:
                        eVar.f32400k = (b) t0Var.M1(d0Var, new b.a());
                        break;
                    case 6:
                        eVar.L = t0Var.z1();
                        break;
                    case 7:
                        eVar.f32393d = t0Var.N1();
                        break;
                    case '\b':
                        eVar.H = t0Var.N1();
                        break;
                    case '\t':
                        eVar.f32399j = t0Var.p1();
                        break;
                    case '\n':
                        eVar.f32397h = t0Var.z1();
                        break;
                    case 11:
                        eVar.f32395f = t0Var.N1();
                        break;
                    case '\f':
                        eVar.A = t0Var.z1();
                        break;
                    case '\r':
                        eVar.B = t0Var.D1();
                        break;
                    case 14:
                        eVar.f32403n = t0Var.K1();
                        break;
                    case 15:
                        eVar.F = t0Var.N1();
                        break;
                    case 16:
                        eVar.f32390a = t0Var.N1();
                        break;
                    case 17:
                        eVar.f32405p = t0Var.p1();
                        break;
                    case 18:
                        List list = (List) t0Var.L1();
                        if (list == null) {
                            break;
                        } else {
                            String[] strArr = new String[list.size()];
                            list.toArray(strArr);
                            eVar.f32396g = strArr;
                            break;
                        }
                    case 19:
                        eVar.f32392c = t0Var.N1();
                        break;
                    case 20:
                        eVar.f32394e = t0Var.N1();
                        break;
                    case 21:
                        eVar.K = t0Var.N1();
                        break;
                    case 22:
                        eVar.f32410y = t0Var.D1();
                        break;
                    case 23:
                        eVar.f32408w = t0Var.K1();
                        break;
                    case 24:
                        eVar.f32406q = t0Var.K1();
                        break;
                    case 25:
                        eVar.f32404o = t0Var.K1();
                        break;
                    case 26:
                        eVar.f32402m = t0Var.K1();
                        break;
                    case 27:
                        eVar.f32398i = t0Var.p1();
                        break;
                    case 28:
                        eVar.f32409x = t0Var.K1();
                        break;
                    case 29:
                        eVar.f32407t = t0Var.K1();
                        break;
                    case 30:
                        eVar.f32411z = t0Var.D1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        t0Var.P1(d0Var, concurrentHashMap, p02);
                        break;
                }
            }
            eVar.n0(concurrentHashMap);
            t0Var.C();
            return eVar;
        }
    }

    /* loaded from: classes5.dex */
    public enum b implements x0 {
        PORTRAIT,
        LANDSCAPE;

        /* loaded from: classes5.dex */
        public static final class a implements n0<b> {
            @Override // io.sentry.n0
            /* renamed from: b */
            public b a(t0 t0Var, d0 d0Var) {
                return b.valueOf(t0Var.D0().toUpperCase(Locale.ROOT));
            }
        }

        @Override // io.sentry.x0
        public void serialize(v0 v0Var, d0 d0Var) {
            v0Var.G0(toString().toLowerCase(Locale.ROOT));
        }
    }

    public e() {
    }

    public String F() {
        return this.K;
    }

    public String G() {
        return this.F;
    }

    public String H() {
        return this.G;
    }

    public String I() {
        return this.H;
    }

    public void J(String[] strArr) {
        this.f32396g = strArr;
    }

    public void K(Float f11) {
        this.f32397h = f11;
    }

    public void L(Float f11) {
        this.L = f11;
    }

    public void M(Date date) {
        this.C = date;
    }

    public void N(String str) {
        this.f32392c = str;
    }

    public void O(Boolean bool) {
        this.f32398i = bool;
    }

    public void P(String str) {
        this.K = str;
    }

    public void Q(Long l11) {
        this.f32409x = l11;
    }

    public void R(Long l11) {
        this.f32408w = l11;
    }

    public void S(String str) {
        this.f32393d = str;
    }

    public void T(Long l11) {
        this.f32403n = l11;
    }

    public void U(Long l11) {
        this.f32407t = l11;
    }

    public void V(String str) {
        this.F = str;
    }

    public void W(String str) {
        this.G = str;
    }

    public void X(String str) {
        this.H = str;
    }

    public void Y(Boolean bool) {
        this.f32405p = bool;
    }

    public void Z(String str) {
        this.f32391b = str;
    }

    public void a0(Long l11) {
        this.f32402m = l11;
    }

    public void b0(String str) {
        this.f32394e = str;
    }

    public void c0(String str) {
        this.f32395f = str;
    }

    public void d0(String str) {
        this.f32390a = str;
    }

    public void e0(Boolean bool) {
        this.f32399j = bool;
    }

    public void f0(b bVar) {
        this.f32400k = bVar;
    }

    public void g0(Float f11) {
        this.A = f11;
    }

    public void h0(Integer num) {
        this.B = num;
    }

    public void i0(Integer num) {
        this.f32411z = num;
    }

    public void j0(Integer num) {
        this.f32410y = num;
    }

    public void k0(Boolean bool) {
        this.f32401l = bool;
    }

    public void l0(Long l11) {
        this.f32406q = l11;
    }

    public void m0(TimeZone timeZone) {
        this.E = timeZone;
    }

    public void n0(Map<String, Object> map) {
        this.O = map;
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.l();
        if (this.f32390a != null) {
            v0Var.P0("name").G0(this.f32390a);
        }
        if (this.f32391b != null) {
            v0Var.P0("manufacturer").G0(this.f32391b);
        }
        if (this.f32392c != null) {
            v0Var.P0(AccountRangeJsonParser.FIELD_BRAND).G0(this.f32392c);
        }
        if (this.f32393d != null) {
            v0Var.P0("family").G0(this.f32393d);
        }
        if (this.f32394e != null) {
            v0Var.P0("model").G0(this.f32394e);
        }
        if (this.f32395f != null) {
            v0Var.P0("model_id").G0(this.f32395f);
        }
        if (this.f32396g != null) {
            v0Var.P0("archs").Q0(d0Var, this.f32396g);
        }
        if (this.f32397h != null) {
            v0Var.P0("battery_level").F0(this.f32397h);
        }
        if (this.f32398i != null) {
            v0Var.P0("charging").D0(this.f32398i);
        }
        if (this.f32399j != null) {
            v0Var.P0("online").D0(this.f32399j);
        }
        if (this.f32400k != null) {
            v0Var.P0("orientation").Q0(d0Var, this.f32400k);
        }
        if (this.f32401l != null) {
            v0Var.P0("simulator").D0(this.f32401l);
        }
        if (this.f32402m != null) {
            v0Var.P0("memory_size").F0(this.f32402m);
        }
        if (this.f32403n != null) {
            v0Var.P0("free_memory").F0(this.f32403n);
        }
        if (this.f32404o != null) {
            v0Var.P0("usable_memory").F0(this.f32404o);
        }
        if (this.f32405p != null) {
            v0Var.P0("low_memory").D0(this.f32405p);
        }
        if (this.f32406q != null) {
            v0Var.P0("storage_size").F0(this.f32406q);
        }
        if (this.f32407t != null) {
            v0Var.P0("free_storage").F0(this.f32407t);
        }
        if (this.f32408w != null) {
            v0Var.P0("external_storage_size").F0(this.f32408w);
        }
        if (this.f32409x != null) {
            v0Var.P0("external_free_storage").F0(this.f32409x);
        }
        if (this.f32410y != null) {
            v0Var.P0("screen_width_pixels").F0(this.f32410y);
        }
        if (this.f32411z != null) {
            v0Var.P0("screen_height_pixels").F0(this.f32411z);
        }
        if (this.A != null) {
            v0Var.P0("screen_density").F0(this.A);
        }
        if (this.B != null) {
            v0Var.P0("screen_dpi").F0(this.B);
        }
        if (this.C != null) {
            v0Var.P0("boot_time").Q0(d0Var, this.C);
        }
        if (this.E != null) {
            v0Var.P0("timezone").Q0(d0Var, this.E);
        }
        if (this.F != null) {
            v0Var.P0("id").G0(this.F);
        }
        if (this.G != null) {
            v0Var.P0("language").G0(this.G);
        }
        if (this.K != null) {
            v0Var.P0("connection_type").G0(this.K);
        }
        if (this.L != null) {
            v0Var.P0("battery_temperature").F0(this.L);
        }
        if (this.H != null) {
            v0Var.P0("locale").G0(this.H);
        }
        Map<String, Object> map = this.O;
        if (map != null) {
            for (String str : map.keySet()) {
                v0Var.P0(str).Q0(d0Var, this.O.get(str));
            }
        }
        v0Var.C();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(e eVar) {
        this.f32390a = eVar.f32390a;
        this.f32391b = eVar.f32391b;
        this.f32392c = eVar.f32392c;
        this.f32393d = eVar.f32393d;
        this.f32394e = eVar.f32394e;
        this.f32395f = eVar.f32395f;
        this.f32398i = eVar.f32398i;
        this.f32399j = eVar.f32399j;
        this.f32400k = eVar.f32400k;
        this.f32401l = eVar.f32401l;
        this.f32402m = eVar.f32402m;
        this.f32403n = eVar.f32403n;
        this.f32404o = eVar.f32404o;
        this.f32405p = eVar.f32405p;
        this.f32406q = eVar.f32406q;
        this.f32407t = eVar.f32407t;
        this.f32408w = eVar.f32408w;
        this.f32409x = eVar.f32409x;
        this.f32410y = eVar.f32410y;
        this.f32411z = eVar.f32411z;
        this.A = eVar.A;
        this.B = eVar.B;
        this.C = eVar.C;
        this.F = eVar.F;
        this.G = eVar.G;
        this.K = eVar.K;
        this.L = eVar.L;
        this.f32397h = eVar.f32397h;
        String[] strArr = eVar.f32396g;
        this.f32396g = strArr != null ? (String[]) strArr.clone() : null;
        this.H = eVar.H;
        TimeZone timeZone = eVar.E;
        this.E = timeZone != null ? (TimeZone) timeZone.clone() : null;
        this.O = rz.a.b(eVar.O);
    }
}