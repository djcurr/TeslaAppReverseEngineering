package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class d implements p0 {

    /* renamed from: n  reason: collision with root package name */
    public static final Set<String> f11354n = md.h.b("id", "uri_source");

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.imagepipeline.request.a f11355a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11356b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11357c;

    /* renamed from: d  reason: collision with root package name */
    private final r0 f11358d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f11359e;

    /* renamed from: f  reason: collision with root package name */
    private final a.c f11360f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, Object> f11361g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f11362h;

    /* renamed from: i  reason: collision with root package name */
    private com.facebook.imagepipeline.common.a f11363i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f11364j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f11365k;

    /* renamed from: l  reason: collision with root package name */
    private final List<q0> f11366l;

    /* renamed from: m  reason: collision with root package name */
    private final jf.j f11367m;

    public d(com.facebook.imagepipeline.request.a aVar, String str, r0 r0Var, Object obj, a.c cVar, boolean z11, boolean z12, com.facebook.imagepipeline.common.a aVar2, jf.j jVar) {
        this(aVar, str, null, r0Var, obj, cVar, z11, z12, aVar2, jVar);
    }

    public static void q(List<q0> list) {
        if (list == null) {
            return;
        }
        for (q0 q0Var : list) {
            q0Var.b();
        }
    }

    public static void r(List<q0> list) {
        if (list == null) {
            return;
        }
        for (q0 q0Var : list) {
            q0Var.a();
        }
    }

    public static void s(List<q0> list) {
        if (list == null) {
            return;
        }
        for (q0 q0Var : list) {
            q0Var.d();
        }
    }

    public static void t(List<q0> list) {
        if (list == null) {
            return;
        }
        for (q0 q0Var : list) {
            q0Var.c();
        }
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public Object a() {
        return this.f11359e;
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public void b(String str, Object obj) {
        if (f11354n.contains(str)) {
            return;
        }
        this.f11361g.put(str, obj);
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public void c(q0 q0Var) {
        boolean z11;
        synchronized (this) {
            this.f11366l.add(q0Var);
            z11 = this.f11365k;
        }
        if (z11) {
            q0Var.b();
        }
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public jf.j d() {
        return this.f11367m;
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public void e(String str, String str2) {
        this.f11361g.put(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, str);
        this.f11361g.put("origin_sub", str2);
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public String f() {
        return this.f11357c;
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public void g(String str) {
        e(str, "default");
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public Map<String, Object> getExtras() {
        return this.f11361g;
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public String getId() {
        return this.f11356b;
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public r0 h() {
        return this.f11358d;
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public synchronized boolean i() {
        return this.f11364j;
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public synchronized com.facebook.imagepipeline.common.a j() {
        return this.f11363i;
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public void k(nf.f fVar) {
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public com.facebook.imagepipeline.request.a l() {
        return this.f11355a;
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public void m(Map<String, ?> map) {
        if (map == null) {
            return;
        }
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            b(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public synchronized boolean n() {
        return this.f11362h;
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public <T> T o(String str) {
        return (T) this.f11361g.get(str);
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public a.c p() {
        return this.f11360f;
    }

    public void u() {
        q(v());
    }

    public synchronized List<q0> v() {
        if (this.f11365k) {
            return null;
        }
        this.f11365k = true;
        return new ArrayList(this.f11366l);
    }

    public synchronized List<q0> w(boolean z11) {
        if (z11 == this.f11364j) {
            return null;
        }
        this.f11364j = z11;
        return new ArrayList(this.f11366l);
    }

    public synchronized List<q0> x(boolean z11) {
        if (z11 == this.f11362h) {
            return null;
        }
        this.f11362h = z11;
        return new ArrayList(this.f11366l);
    }

    public synchronized List<q0> y(com.facebook.imagepipeline.common.a aVar) {
        if (aVar == this.f11363i) {
            return null;
        }
        this.f11363i = aVar;
        return new ArrayList(this.f11366l);
    }

    public d(com.facebook.imagepipeline.request.a aVar, String str, String str2, r0 r0Var, Object obj, a.c cVar, boolean z11, boolean z12, com.facebook.imagepipeline.common.a aVar2, jf.j jVar) {
        nf.f fVar = nf.f.NOT_SET;
        this.f11355a = aVar;
        this.f11356b = str;
        HashMap hashMap = new HashMap();
        this.f11361g = hashMap;
        hashMap.put("id", str);
        hashMap.put("uri_source", aVar == null ? "null-request" : aVar.s());
        this.f11357c = str2;
        this.f11358d = r0Var;
        this.f11359e = obj;
        this.f11360f = cVar;
        this.f11362h = z11;
        this.f11363i = aVar2;
        this.f11364j = z12;
        this.f11365k = false;
        this.f11366l = new ArrayList();
        this.f11367m = jVar;
    }
}