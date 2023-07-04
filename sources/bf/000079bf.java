package io.sentry.protocol;

import io.sentry.d0;
import io.sentry.f3;
import io.sentry.n0;
import io.sentry.protocol.p;
import io.sentry.t0;
import io.sentry.v0;
import io.sentry.x0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class m implements x0 {

    /* renamed from: a */
    private String f32456a;

    /* renamed from: b */
    private String f32457b;

    /* renamed from: c */
    private List<p> f32458c;

    /* renamed from: d */
    private List<String> f32459d;

    /* renamed from: e */
    private Map<String, Object> f32460e;

    /* loaded from: classes5.dex */
    public static final class a implements n0<m> {
        @Override // io.sentry.n0
        /* renamed from: b */
        public m a(t0 t0Var, d0 d0Var) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            t0Var.g();
            String str = null;
            String str2 = null;
            HashMap hashMap = null;
            while (t0Var.G0() == io.sentry.vendor.gson.stream.b.NAME) {
                String p02 = t0Var.p0();
                p02.hashCode();
                char c11 = 65535;
                switch (p02.hashCode()) {
                    case 3373707:
                        if (p02.equals("name")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case 351608024:
                        if (p02.equals("version")) {
                            c11 = 1;
                            break;
                        }
                        break;
                    case 750867693:
                        if (p02.equals("packages")) {
                            c11 = 2;
                            break;
                        }
                        break;
                    case 1487029535:
                        if (p02.equals("integrations")) {
                            c11 = 3;
                            break;
                        }
                        break;
                }
                switch (c11) {
                    case 0:
                        str = t0Var.D0();
                        break;
                    case 1:
                        str2 = t0Var.D0();
                        break;
                    case 2:
                        List F1 = t0Var.F1(d0Var, new p.a());
                        if (F1 == null) {
                            break;
                        } else {
                            arrayList.addAll(F1);
                            break;
                        }
                    case 3:
                        List list = (List) t0Var.L1();
                        if (list == null) {
                            break;
                        } else {
                            arrayList2.addAll(list);
                            break;
                        }
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        t0Var.P1(d0Var, hashMap, p02);
                        break;
                }
            }
            t0Var.C();
            if (str == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                d0Var.b(f3.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            } else if (str2 != null) {
                m mVar = new m(str, str2);
                mVar.f32458c = arrayList;
                mVar.f32459d = arrayList2;
                mVar.j(hashMap);
                return mVar;
            } else {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
                d0Var.b(f3.ERROR, "Missing required field \"version\"", illegalStateException2);
                throw illegalStateException2;
            }
        }
    }

    public m(String str, String str2) {
        this.f32456a = (String) rz.j.a(str, "name is required.");
        this.f32457b = (String) rz.j.a(str2, "version is required.");
    }

    public static m l(m mVar, String str, String str2) {
        rz.j.a(str, "name is required.");
        rz.j.a(str2, "version is required.");
        if (mVar == null) {
            return new m(str, str2);
        }
        mVar.i(str);
        mVar.k(str2);
        return mVar;
    }

    public void c(String str) {
        rz.j.a(str, "integration is required.");
        if (this.f32459d == null) {
            this.f32459d = new ArrayList();
        }
        this.f32459d.add(str);
    }

    public void d(String str, String str2) {
        rz.j.a(str, "name is required.");
        rz.j.a(str2, "version is required.");
        p pVar = new p(str, str2);
        if (this.f32458c == null) {
            this.f32458c = new ArrayList();
        }
        this.f32458c.add(pVar);
    }

    public List<String> e() {
        return this.f32459d;
    }

    public String f() {
        return this.f32456a;
    }

    public List<p> g() {
        return this.f32458c;
    }

    public String h() {
        return this.f32457b;
    }

    public void i(String str) {
        this.f32456a = (String) rz.j.a(str, "name is required.");
    }

    public void j(Map<String, Object> map) {
        this.f32460e = map;
    }

    public void k(String str) {
        this.f32457b = (String) rz.j.a(str, "version is required.");
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.l();
        v0Var.P0("name").G0(this.f32456a);
        v0Var.P0("version").G0(this.f32457b);
        List<p> list = this.f32458c;
        if (list != null && !list.isEmpty()) {
            v0Var.P0("packages").Q0(d0Var, this.f32458c);
        }
        List<String> list2 = this.f32459d;
        if (list2 != null && !list2.isEmpty()) {
            v0Var.P0("integrations").Q0(d0Var, this.f32459d);
        }
        Map<String, Object> map = this.f32460e;
        if (map != null) {
            for (String str : map.keySet()) {
                v0Var.P0(str).Q0(d0Var, this.f32460e.get(str));
            }
        }
        v0Var.C();
    }
}