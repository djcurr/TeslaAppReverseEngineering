package io.sentry.protocol;

import io.sentry.d0;
import io.sentry.n0;
import io.sentry.t0;
import io.sentry.v0;
import io.sentry.x0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class s implements x0 {

    /* renamed from: a  reason: collision with root package name */
    private String f32488a;

    /* renamed from: b  reason: collision with root package name */
    private String f32489b;

    /* renamed from: c  reason: collision with root package name */
    private String f32490c;

    /* renamed from: d  reason: collision with root package name */
    private Integer f32491d;

    /* renamed from: e  reason: collision with root package name */
    private Integer f32492e;

    /* renamed from: f  reason: collision with root package name */
    private String f32493f;

    /* renamed from: g  reason: collision with root package name */
    private String f32494g;

    /* renamed from: h  reason: collision with root package name */
    private Boolean f32495h;

    /* renamed from: i  reason: collision with root package name */
    private String f32496i;

    /* renamed from: j  reason: collision with root package name */
    private Boolean f32497j;

    /* renamed from: k  reason: collision with root package name */
    private String f32498k;

    /* renamed from: l  reason: collision with root package name */
    private String f32499l;

    /* renamed from: m  reason: collision with root package name */
    private String f32500m;

    /* renamed from: n  reason: collision with root package name */
    private String f32501n;

    /* renamed from: o  reason: collision with root package name */
    private Map<String, Object> f32502o;

    /* renamed from: p  reason: collision with root package name */
    private String f32503p;

    /* loaded from: classes5.dex */
    public static final class a implements n0<s> {
        @Override // io.sentry.n0
        /* renamed from: b */
        public s a(t0 t0Var, d0 d0Var) {
            s sVar = new s();
            t0Var.g();
            ConcurrentHashMap concurrentHashMap = null;
            while (t0Var.G0() == io.sentry.vendor.gson.stream.b.NAME) {
                String p02 = t0Var.p0();
                p02.hashCode();
                char c11 = 65535;
                switch (p02.hashCode()) {
                    case -1443345323:
                        if (p02.equals("image_addr")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case -1184392185:
                        if (p02.equals("in_app")) {
                            c11 = 1;
                            break;
                        }
                        break;
                    case -1113875953:
                        if (p02.equals("raw_function")) {
                            c11 = 2;
                            break;
                        }
                        break;
                    case -1102671691:
                        if (p02.equals("lineno")) {
                            c11 = 3;
                            break;
                        }
                        break;
                    case -1068784020:
                        if (p02.equals("module")) {
                            c11 = 4;
                            break;
                        }
                        break;
                    case -1052618729:
                        if (p02.equals("native")) {
                            c11 = 5;
                            break;
                        }
                        break;
                    case -807062458:
                        if (p02.equals("package")) {
                            c11 = 6;
                            break;
                        }
                        break;
                    case -734768633:
                        if (p02.equals("filename")) {
                            c11 = 7;
                            break;
                        }
                        break;
                    case -330260936:
                        if (p02.equals("symbol_addr")) {
                            c11 = '\b';
                            break;
                        }
                        break;
                    case 94842689:
                        if (p02.equals("colno")) {
                            c11 = '\t';
                            break;
                        }
                        break;
                    case 410194178:
                        if (p02.equals("instruction_addr")) {
                            c11 = '\n';
                            break;
                        }
                        break;
                    case 1116694660:
                        if (p02.equals("context_line")) {
                            c11 = 11;
                            break;
                        }
                        break;
                    case 1380938712:
                        if (p02.equals("function")) {
                            c11 = '\f';
                            break;
                        }
                        break;
                    case 1713445842:
                        if (p02.equals("abs_path")) {
                            c11 = '\r';
                            break;
                        }
                        break;
                    case 1874684019:
                        if (p02.equals("platform")) {
                            c11 = 14;
                            break;
                        }
                        break;
                }
                switch (c11) {
                    case 0:
                        sVar.f32499l = t0Var.N1();
                        break;
                    case 1:
                        sVar.f32495h = t0Var.p1();
                        break;
                    case 2:
                        sVar.f32503p = t0Var.N1();
                        break;
                    case 3:
                        sVar.f32491d = t0Var.D1();
                        break;
                    case 4:
                        sVar.f32490c = t0Var.N1();
                        break;
                    case 5:
                        sVar.f32497j = t0Var.p1();
                        break;
                    case 6:
                        sVar.f32496i = t0Var.N1();
                        break;
                    case 7:
                        sVar.f32488a = t0Var.N1();
                        break;
                    case '\b':
                        sVar.f32500m = t0Var.N1();
                        break;
                    case '\t':
                        sVar.f32492e = t0Var.D1();
                        break;
                    case '\n':
                        sVar.f32501n = t0Var.N1();
                        break;
                    case 11:
                        sVar.f32494g = t0Var.N1();
                        break;
                    case '\f':
                        sVar.f32489b = t0Var.N1();
                        break;
                    case '\r':
                        sVar.f32493f = t0Var.N1();
                        break;
                    case 14:
                        sVar.f32498k = t0Var.N1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        t0Var.P1(d0Var, concurrentHashMap, p02);
                        break;
                }
            }
            sVar.v(concurrentHashMap);
            t0Var.C();
            return sVar;
        }
    }

    public void p(String str) {
        this.f32488a = str;
    }

    public void q(String str) {
        this.f32489b = str;
    }

    public void r(Boolean bool) {
        this.f32495h = bool;
    }

    public void s(Integer num) {
        this.f32491d = num;
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.l();
        if (this.f32488a != null) {
            v0Var.P0("filename").G0(this.f32488a);
        }
        if (this.f32489b != null) {
            v0Var.P0("function").G0(this.f32489b);
        }
        if (this.f32490c != null) {
            v0Var.P0("module").G0(this.f32490c);
        }
        if (this.f32491d != null) {
            v0Var.P0("lineno").F0(this.f32491d);
        }
        if (this.f32492e != null) {
            v0Var.P0("colno").F0(this.f32492e);
        }
        if (this.f32493f != null) {
            v0Var.P0("abs_path").G0(this.f32493f);
        }
        if (this.f32494g != null) {
            v0Var.P0("context_line").G0(this.f32494g);
        }
        if (this.f32495h != null) {
            v0Var.P0("in_app").D0(this.f32495h);
        }
        if (this.f32496i != null) {
            v0Var.P0("package").G0(this.f32496i);
        }
        if (this.f32497j != null) {
            v0Var.P0("native").D0(this.f32497j);
        }
        if (this.f32498k != null) {
            v0Var.P0("platform").G0(this.f32498k);
        }
        if (this.f32499l != null) {
            v0Var.P0("image_addr").G0(this.f32499l);
        }
        if (this.f32500m != null) {
            v0Var.P0("symbol_addr").G0(this.f32500m);
        }
        if (this.f32501n != null) {
            v0Var.P0("instruction_addr").G0(this.f32501n);
        }
        if (this.f32503p != null) {
            v0Var.P0("raw_function").G0(this.f32503p);
        }
        Map<String, Object> map = this.f32502o;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f32502o.get(str);
                v0Var.P0(str);
                v0Var.Q0(d0Var, obj);
            }
        }
        v0Var.C();
    }

    public void t(String str) {
        this.f32490c = str;
    }

    public void u(Boolean bool) {
        this.f32497j = bool;
    }

    public void v(Map<String, Object> map) {
        this.f32502o = map;
    }
}