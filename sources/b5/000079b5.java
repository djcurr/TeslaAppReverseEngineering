package io.sentry.protocol;

import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import io.sentry.d0;
import io.sentry.n0;
import io.sentry.t0;
import io.sentry.v0;
import io.sentry.x0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class h implements x0 {

    /* renamed from: a  reason: collision with root package name */
    private String f32423a;

    /* renamed from: b  reason: collision with root package name */
    private String f32424b;

    /* renamed from: c  reason: collision with root package name */
    private String f32425c;

    /* renamed from: d  reason: collision with root package name */
    private Boolean f32426d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, Object> f32427e;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, Object> f32428f;

    /* renamed from: g  reason: collision with root package name */
    private Boolean f32429g;

    /* renamed from: h  reason: collision with root package name */
    private Map<String, Object> f32430h;

    /* loaded from: classes5.dex */
    public static final class a implements n0<h> {
        @Override // io.sentry.n0
        /* renamed from: b */
        public h a(t0 t0Var, d0 d0Var) {
            h hVar = new h();
            t0Var.g();
            HashMap hashMap = null;
            while (t0Var.G0() == io.sentry.vendor.gson.stream.b.NAME) {
                String p02 = t0Var.p0();
                p02.hashCode();
                char c11 = 65535;
                switch (p02.hashCode()) {
                    case -1724546052:
                        if (p02.equals("description")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case 3076010:
                        if (p02.equals(MessageExtension.FIELD_DATA)) {
                            c11 = 1;
                            break;
                        }
                        break;
                    case 3347973:
                        if (p02.equals("meta")) {
                            c11 = 2;
                            break;
                        }
                        break;
                    case 3575610:
                        if (p02.equals("type")) {
                            c11 = 3;
                            break;
                        }
                        break;
                    case 692803388:
                        if (p02.equals("handled")) {
                            c11 = 4;
                            break;
                        }
                        break;
                    case 989128517:
                        if (p02.equals("synthetic")) {
                            c11 = 5;
                            break;
                        }
                        break;
                    case 1297152568:
                        if (p02.equals("help_link")) {
                            c11 = 6;
                            break;
                        }
                        break;
                }
                switch (c11) {
                    case 0:
                        hVar.f32424b = t0Var.N1();
                        break;
                    case 1:
                        hVar.f32428f = rz.a.b((Map) t0Var.L1());
                        break;
                    case 2:
                        hVar.f32427e = rz.a.b((Map) t0Var.L1());
                        break;
                    case 3:
                        hVar.f32423a = t0Var.N1();
                        break;
                    case 4:
                        hVar.f32426d = t0Var.p1();
                        break;
                    case 5:
                        hVar.f32429g = t0Var.p1();
                        break;
                    case 6:
                        hVar.f32425c = t0Var.N1();
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
            hVar.k(hashMap);
            return hVar;
        }
    }

    public h() {
        this(null);
    }

    public Boolean h() {
        return this.f32426d;
    }

    public void i(Boolean bool) {
        this.f32426d = bool;
    }

    public void j(String str) {
        this.f32423a = str;
    }

    public void k(Map<String, Object> map) {
        this.f32430h = map;
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.l();
        if (this.f32423a != null) {
            v0Var.P0("type").G0(this.f32423a);
        }
        if (this.f32424b != null) {
            v0Var.P0("description").G0(this.f32424b);
        }
        if (this.f32425c != null) {
            v0Var.P0("help_link").G0(this.f32425c);
        }
        if (this.f32426d != null) {
            v0Var.P0("handled").D0(this.f32426d);
        }
        if (this.f32427e != null) {
            v0Var.P0("meta").Q0(d0Var, this.f32427e);
        }
        if (this.f32428f != null) {
            v0Var.P0(MessageExtension.FIELD_DATA).Q0(d0Var, this.f32428f);
        }
        if (this.f32429g != null) {
            v0Var.P0("synthetic").D0(this.f32429g);
        }
        Map<String, Object> map = this.f32430h;
        if (map != null) {
            for (String str : map.keySet()) {
                v0Var.P0(str).Q0(d0Var, this.f32430h.get(str));
            }
        }
        v0Var.C();
    }

    public h(Thread thread) {
    }
}