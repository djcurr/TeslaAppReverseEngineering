package io.sentry;

import com.adyen.checkout.components.model.payments.response.SdkAction;
import io.sentry.c;
import io.sentry.exception.ExceptionMechanismException;
import io.sentry.protocol.c;
import io.sentry.protocol.k;
import io.sentry.protocol.m;
import io.sentry.protocol.o;
import io.sentry.protocol.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;

/* loaded from: classes5.dex */
public abstract class d2 {

    /* renamed from: a  reason: collision with root package name */
    private io.sentry.protocol.o f32231a;

    /* renamed from: b  reason: collision with root package name */
    private final io.sentry.protocol.c f32232b;

    /* renamed from: c  reason: collision with root package name */
    private io.sentry.protocol.m f32233c;

    /* renamed from: d  reason: collision with root package name */
    private io.sentry.protocol.k f32234d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, String> f32235e;

    /* renamed from: f  reason: collision with root package name */
    private String f32236f;

    /* renamed from: g  reason: collision with root package name */
    private String f32237g;

    /* renamed from: h  reason: collision with root package name */
    private String f32238h;

    /* renamed from: i  reason: collision with root package name */
    private io.sentry.protocol.w f32239i;

    /* renamed from: j  reason: collision with root package name */
    protected transient Throwable f32240j;

    /* renamed from: k  reason: collision with root package name */
    private String f32241k;

    /* renamed from: l  reason: collision with root package name */
    private String f32242l;

    /* renamed from: m  reason: collision with root package name */
    private List<c> f32243m;

    /* renamed from: n  reason: collision with root package name */
    private Map<String, Object> f32244n;

    /* loaded from: classes5.dex */
    public static final class a {
        public boolean a(d2 d2Var, String str, t0 t0Var, d0 d0Var) {
            str.hashCode();
            char c11 = 65535;
            switch (str.hashCode()) {
                case -758770169:
                    if (str.equals("server_name")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -567312220:
                    if (str.equals("contexts")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case -85904877:
                    if (str.equals("environment")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case -51457840:
                    if (str.equals("breadcrumbs")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case 113722:
                    if (str.equals(SdkAction.ACTION_TYPE)) {
                        c11 = 4;
                        break;
                    }
                    break;
                case 3083686:
                    if (str.equals("dist")) {
                        c11 = 5;
                        break;
                    }
                    break;
                case 3552281:
                    if (str.equals("tags")) {
                        c11 = 6;
                        break;
                    }
                    break;
                case 3599307:
                    if (str.equals("user")) {
                        c11 = 7;
                        break;
                    }
                    break;
                case 96965648:
                    if (str.equals("extra")) {
                        c11 = '\b';
                        break;
                    }
                    break;
                case 278118624:
                    if (str.equals("event_id")) {
                        c11 = '\t';
                        break;
                    }
                    break;
                case 1090594823:
                    if (str.equals("release")) {
                        c11 = '\n';
                        break;
                    }
                    break;
                case 1095692943:
                    if (str.equals("request")) {
                        c11 = 11;
                        break;
                    }
                    break;
                case 1874684019:
                    if (str.equals("platform")) {
                        c11 = '\f';
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    d2Var.f32241k = t0Var.N1();
                    return true;
                case 1:
                    d2Var.f32232b.putAll(new c.a().a(t0Var, d0Var));
                    return true;
                case 2:
                    d2Var.f32237g = t0Var.N1();
                    return true;
                case 3:
                    d2Var.f32243m = t0Var.F1(d0Var, new c.a());
                    return true;
                case 4:
                    d2Var.f32233c = (io.sentry.protocol.m) t0Var.M1(d0Var, new m.a());
                    return true;
                case 5:
                    d2Var.f32242l = t0Var.N1();
                    return true;
                case 6:
                    d2Var.f32235e = rz.a.b((Map) t0Var.L1());
                    return true;
                case 7:
                    d2Var.f32239i = (io.sentry.protocol.w) t0Var.M1(d0Var, new w.a());
                    return true;
                case '\b':
                    d2Var.f32244n = rz.a.b((Map) t0Var.L1());
                    return true;
                case '\t':
                    d2Var.f32231a = (io.sentry.protocol.o) t0Var.M1(d0Var, new o.a());
                    return true;
                case '\n':
                    d2Var.f32236f = t0Var.N1();
                    return true;
                case 11:
                    d2Var.f32234d = (io.sentry.protocol.k) t0Var.M1(d0Var, new k.a());
                    return true;
                case '\f':
                    d2Var.f32238h = t0Var.N1();
                    return true;
                default:
                    return false;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {
        public void a(d2 d2Var, v0 v0Var, d0 d0Var) {
            if (d2Var.f32231a != null) {
                v0Var.P0("event_id").Q0(d0Var, d2Var.f32231a);
            }
            v0Var.P0("contexts").Q0(d0Var, d2Var.f32232b);
            if (d2Var.f32233c != null) {
                v0Var.P0(SdkAction.ACTION_TYPE).Q0(d0Var, d2Var.f32233c);
            }
            if (d2Var.f32234d != null) {
                v0Var.P0("request").Q0(d0Var, d2Var.f32234d);
            }
            if (d2Var.f32235e != null && !d2Var.f32235e.isEmpty()) {
                v0Var.P0("tags").Q0(d0Var, d2Var.f32235e);
            }
            if (d2Var.f32236f != null) {
                v0Var.P0("release").G0(d2Var.f32236f);
            }
            if (d2Var.f32237g != null) {
                v0Var.P0("environment").G0(d2Var.f32237g);
            }
            if (d2Var.f32238h != null) {
                v0Var.P0("platform").G0(d2Var.f32238h);
            }
            if (d2Var.f32239i != null) {
                v0Var.P0("user").Q0(d0Var, d2Var.f32239i);
            }
            if (d2Var.f32241k != null) {
                v0Var.P0("server_name").G0(d2Var.f32241k);
            }
            if (d2Var.f32242l != null) {
                v0Var.P0("dist").G0(d2Var.f32242l);
            }
            if (d2Var.f32243m != null && !d2Var.f32243m.isEmpty()) {
                v0Var.P0("breadcrumbs").Q0(d0Var, d2Var.f32243m);
            }
            if (d2Var.f32244n == null || d2Var.f32244n.isEmpty()) {
                return;
            }
            v0Var.P0("extra").Q0(d0Var, d2Var.f32244n);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d2(io.sentry.protocol.o oVar) {
        this.f32232b = new io.sentry.protocol.c();
        this.f32231a = oVar;
    }

    public List<c> A() {
        return this.f32243m;
    }

    public io.sentry.protocol.c B() {
        return this.f32232b;
    }

    public String C() {
        return this.f32242l;
    }

    public String D() {
        return this.f32237g;
    }

    public io.sentry.protocol.o E() {
        return this.f32231a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, Object> F() {
        return this.f32244n;
    }

    public String G() {
        return this.f32238h;
    }

    public String H() {
        return this.f32236f;
    }

    public io.sentry.protocol.k I() {
        return this.f32234d;
    }

    public io.sentry.protocol.m J() {
        return this.f32233c;
    }

    public String K() {
        return this.f32241k;
    }

    @ApiStatus.Internal
    public Map<String, String> L() {
        return this.f32235e;
    }

    public Throwable M() {
        Throwable th2 = this.f32240j;
        return th2 instanceof ExceptionMechanismException ? ((ExceptionMechanismException) th2).c() : th2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Throwable N() {
        return this.f32240j;
    }

    public io.sentry.protocol.w O() {
        return this.f32239i;
    }

    public void P(List<c> list) {
        this.f32243m = rz.a.a(list);
    }

    public void Q(String str) {
        this.f32242l = str;
    }

    public void R(String str) {
        this.f32237g = str;
    }

    public void S(String str, Object obj) {
        if (this.f32244n == null) {
            this.f32244n = new HashMap();
        }
        this.f32244n.put(str, obj);
    }

    public void T(Map<String, Object> map) {
        this.f32244n = rz.a.c(map);
    }

    public void U(String str) {
        this.f32238h = str;
    }

    public void V(String str) {
        this.f32236f = str;
    }

    public void W(io.sentry.protocol.k kVar) {
        this.f32234d = kVar;
    }

    public void X(io.sentry.protocol.m mVar) {
        this.f32233c = mVar;
    }

    public void Y(String str) {
        this.f32241k = str;
    }

    public void Z(String str, String str2) {
        if (this.f32235e == null) {
            this.f32235e = new HashMap();
        }
        this.f32235e.put(str, str2);
    }

    public void a0(Map<String, String> map) {
        this.f32235e = rz.a.c(map);
    }

    public void b0(io.sentry.protocol.w wVar) {
        this.f32239i = wVar;
    }

    public void z(c cVar) {
        if (this.f32243m == null) {
            this.f32243m = new ArrayList();
        }
        this.f32243m.add(cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d2() {
        this(new io.sentry.protocol.o());
    }
}