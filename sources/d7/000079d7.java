package io.sentry;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class q1 implements x0 {
    private String A;
    private Map<String, Object> B;

    /* renamed from: a */
    private File f32533a;

    /* renamed from: b */
    private Callable<List<Integer>> f32534b;

    /* renamed from: c */
    private int f32535c;

    /* renamed from: d */
    private String f32536d;

    /* renamed from: e */
    private String f32537e;

    /* renamed from: f */
    private String f32538f;

    /* renamed from: g */
    private String f32539g;

    /* renamed from: h */
    private String f32540h;

    /* renamed from: i */
    private String f32541i;

    /* renamed from: j */
    private boolean f32542j;

    /* renamed from: k */
    private List<Integer> f32543k;

    /* renamed from: l */
    private String f32544l;

    /* renamed from: m */
    private String f32545m;

    /* renamed from: n */
    private String f32546n;

    /* renamed from: o */
    private String f32547o;

    /* renamed from: p */
    private String f32548p;

    /* renamed from: q */
    private String f32549q;

    /* renamed from: t */
    private String f32550t;

    /* renamed from: w */
    private String f32551w;

    /* renamed from: x */
    private String f32552x;

    /* renamed from: y */
    private String f32553y;

    /* renamed from: z */
    private String f32554z;

    /* loaded from: classes5.dex */
    public static final class b implements n0<q1> {
        @Override // io.sentry.n0
        /* renamed from: b */
        public q1 a(t0 t0Var, d0 d0Var) {
            t0Var.g();
            ConcurrentHashMap concurrentHashMap = null;
            q1 q1Var = new q1();
            while (t0Var.G0() == io.sentry.vendor.gson.stream.b.NAME) {
                String p02 = t0Var.p0();
                p02.hashCode();
                char c11 = 65535;
                switch (p02.hashCode()) {
                    case -2133529830:
                        if (p02.equals("device_manufacturer")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case -1981468849:
                        if (p02.equals("android_api_level")) {
                            c11 = 1;
                            break;
                        }
                        break;
                    case -1430655860:
                        if (p02.equals("build_id")) {
                            c11 = 2;
                            break;
                        }
                        break;
                    case -1172160413:
                        if (p02.equals("device_locale")) {
                            c11 = 3;
                            break;
                        }
                        break;
                    case -1102636175:
                        if (p02.equals("profile_id")) {
                            c11 = 4;
                            break;
                        }
                        break;
                    case -716656436:
                        if (p02.equals("device_os_build_number")) {
                            c11 = 5;
                            break;
                        }
                        break;
                    case -591076352:
                        if (p02.equals("device_model")) {
                            c11 = 6;
                            break;
                        }
                        break;
                    case -512511455:
                        if (p02.equals("device_is_emulator")) {
                            c11 = 7;
                            break;
                        }
                        break;
                    case -478065584:
                        if (p02.equals("duration_ns")) {
                            c11 = '\b';
                            break;
                        }
                        break;
                    case -332426004:
                        if (p02.equals("device_physical_memory_bytes")) {
                            c11 = '\t';
                            break;
                        }
                        break;
                    case -212264198:
                        if (p02.equals("device_cpu_frequencies")) {
                            c11 = '\n';
                            break;
                        }
                        break;
                    case -102985484:
                        if (p02.equals("version_code")) {
                            c11 = 11;
                            break;
                        }
                        break;
                    case -102670958:
                        if (p02.equals("version_name")) {
                            c11 = '\f';
                            break;
                        }
                        break;
                    case -85904877:
                        if (p02.equals("environment")) {
                            c11 = '\r';
                            break;
                        }
                        break;
                    case 508853068:
                        if (p02.equals("transaction_name")) {
                            c11 = 14;
                            break;
                        }
                        break;
                    case 796476189:
                        if (p02.equals("device_os_name")) {
                            c11 = 15;
                            break;
                        }
                        break;
                    case 1010584092:
                        if (p02.equals("transaction_id")) {
                            c11 = 16;
                            break;
                        }
                        break;
                    case 1052553990:
                        if (p02.equals("device_os_version")) {
                            c11 = 17;
                            break;
                        }
                        break;
                    case 1270300245:
                        if (p02.equals("trace_id")) {
                            c11 = 18;
                            break;
                        }
                        break;
                    case 1874684019:
                        if (p02.equals("platform")) {
                            c11 = 19;
                            break;
                        }
                        break;
                    case 1953158756:
                        if (p02.equals("sampled_profile")) {
                            c11 = 20;
                            break;
                        }
                        break;
                }
                switch (c11) {
                    case 0:
                        String N1 = t0Var.N1();
                        if (N1 == null) {
                            break;
                        } else {
                            q1Var.f32537e = N1;
                            break;
                        }
                    case 1:
                        Integer D1 = t0Var.D1();
                        if (D1 == null) {
                            break;
                        } else {
                            q1Var.f32535c = D1.intValue();
                            break;
                        }
                    case 2:
                        String N12 = t0Var.N1();
                        if (N12 == null) {
                            break;
                        } else {
                            q1Var.f32546n = N12;
                            break;
                        }
                    case 3:
                        String N13 = t0Var.N1();
                        if (N13 == null) {
                            break;
                        } else {
                            q1Var.f32536d = N13;
                            break;
                        }
                    case 4:
                        String N14 = t0Var.N1();
                        if (N14 == null) {
                            break;
                        } else {
                            q1Var.f32553y = N14;
                            break;
                        }
                    case 5:
                        String N15 = t0Var.N1();
                        if (N15 == null) {
                            break;
                        } else {
                            q1Var.f32539g = N15;
                            break;
                        }
                    case 6:
                        String N16 = t0Var.N1();
                        if (N16 == null) {
                            break;
                        } else {
                            q1Var.f32538f = N16;
                            break;
                        }
                    case 7:
                        Boolean p12 = t0Var.p1();
                        if (p12 == null) {
                            break;
                        } else {
                            q1Var.f32542j = p12.booleanValue();
                            break;
                        }
                    case '\b':
                        String N17 = t0Var.N1();
                        if (N17 == null) {
                            break;
                        } else {
                            q1Var.f32548p = N17;
                            break;
                        }
                    case '\t':
                        String N18 = t0Var.N1();
                        if (N18 == null) {
                            break;
                        } else {
                            q1Var.f32544l = N18;
                            break;
                        }
                    case '\n':
                        List list = (List) t0Var.L1();
                        if (list == null) {
                            break;
                        } else {
                            q1Var.f32543k = list;
                            break;
                        }
                    case 11:
                        String N19 = t0Var.N1();
                        if (N19 == null) {
                            break;
                        } else {
                            q1Var.f32550t = N19;
                            break;
                        }
                    case '\f':
                        String N110 = t0Var.N1();
                        if (N110 == null) {
                            break;
                        } else {
                            q1Var.f32549q = N110;
                            break;
                        }
                    case '\r':
                        String N111 = t0Var.N1();
                        if (N111 == null) {
                            break;
                        } else {
                            q1Var.f32554z = N111;
                            break;
                        }
                    case 14:
                        String N112 = t0Var.N1();
                        if (N112 == null) {
                            break;
                        } else {
                            q1Var.f32547o = N112;
                            break;
                        }
                    case 15:
                        String N113 = t0Var.N1();
                        if (N113 == null) {
                            break;
                        } else {
                            q1Var.f32540h = N113;
                            break;
                        }
                    case 16:
                        String N114 = t0Var.N1();
                        if (N114 == null) {
                            break;
                        } else {
                            q1Var.f32551w = N114;
                            break;
                        }
                    case 17:
                        String N115 = t0Var.N1();
                        if (N115 == null) {
                            break;
                        } else {
                            q1Var.f32541i = N115;
                            break;
                        }
                    case 18:
                        String N116 = t0Var.N1();
                        if (N116 == null) {
                            break;
                        } else {
                            q1Var.f32552x = N116;
                            break;
                        }
                    case 19:
                        String N117 = t0Var.N1();
                        if (N117 == null) {
                            break;
                        } else {
                            q1Var.f32545m = N117;
                            break;
                        }
                    case 20:
                        String N118 = t0Var.N1();
                        if (N118 == null) {
                            break;
                        } else {
                            q1Var.A = N118;
                            break;
                        }
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        t0Var.P1(d0Var, concurrentHashMap, p02);
                        break;
                }
            }
            q1Var.B(concurrentHashMap);
            t0Var.C();
            return q1Var;
        }
    }

    public static /* synthetic */ List a() {
        return y();
    }

    public static /* synthetic */ List y() {
        return new ArrayList();
    }

    public void A(String str) {
        this.A = str;
    }

    public void B(Map<String, Object> map) {
        this.B = map;
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.l();
        v0Var.P0("android_api_level").Q0(d0Var, Integer.valueOf(this.f32535c));
        v0Var.P0("device_locale").Q0(d0Var, this.f32536d);
        v0Var.P0("device_manufacturer").G0(this.f32537e);
        v0Var.P0("device_model").G0(this.f32538f);
        v0Var.P0("device_os_build_number").G0(this.f32539g);
        v0Var.P0("device_os_name").G0(this.f32540h);
        v0Var.P0("device_os_version").G0(this.f32541i);
        v0Var.P0("device_is_emulator").I0(this.f32542j);
        v0Var.P0("device_cpu_frequencies").Q0(d0Var, this.f32543k);
        v0Var.P0("device_physical_memory_bytes").G0(this.f32544l);
        v0Var.P0("platform").G0(this.f32545m);
        v0Var.P0("build_id").G0(this.f32546n);
        v0Var.P0("transaction_name").G0(this.f32547o);
        v0Var.P0("duration_ns").G0(this.f32548p);
        v0Var.P0("version_name").G0(this.f32549q);
        v0Var.P0("version_code").G0(this.f32550t);
        v0Var.P0("transaction_id").G0(this.f32551w);
        v0Var.P0("trace_id").G0(this.f32552x);
        v0Var.P0("profile_id").G0(this.f32553y);
        v0Var.P0("environment").G0(this.f32554z);
        if (this.A != null) {
            v0Var.P0("sampled_profile").G0(this.A);
        }
        Map<String, Object> map = this.B;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.B.get(str);
                v0Var.P0(str);
                v0Var.Q0(d0Var, obj);
            }
        }
        v0Var.C();
    }

    public File w() {
        return this.f32533a;
    }

    public String x() {
        return this.f32552x;
    }

    public void z() {
        try {
            Callable<List<Integer>> callable = this.f32534b;
            if (callable != null) {
                this.f32543k = callable.call();
            }
        } catch (Throwable unused) {
        }
    }

    private q1() {
        this(new File("dummy"), i1.i());
    }

    public q1(File file, j0 j0Var) {
        this(file, j0Var, "0", 0, new Callable() { // from class: io.sentry.p1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return q1.a();
            }
        }, null, null, null, null, null, null, null, null, null);
    }

    public q1(File file, j0 j0Var, String str, int i11, Callable<List<Integer>> callable, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, String str8, String str9) {
        this.f32543k = new ArrayList();
        this.A = null;
        this.f32533a = file;
        this.f32534b = callable;
        this.f32535c = i11;
        this.f32536d = Locale.getDefault().toString();
        this.f32537e = str2 == null ? "" : str2;
        this.f32538f = str3 == null ? "" : str3;
        this.f32541i = str4 == null ? "" : str4;
        this.f32542j = bool != null ? bool.booleanValue() : false;
        this.f32544l = str5 == null ? "0" : str5;
        this.f32539g = "";
        this.f32540h = "android";
        this.f32545m = "android";
        this.f32546n = str6 == null ? "" : str6;
        this.f32547o = j0Var.getName();
        this.f32548p = str;
        this.f32549q = str7 == null ? "" : str7;
        this.f32550t = str8 == null ? "" : str8;
        this.f32551w = j0Var.b().toString();
        this.f32552x = j0Var.h().h().toString();
        this.f32553y = UUID.randomUUID().toString();
        this.f32554z = str9 == null ? "" : str9;
    }
}