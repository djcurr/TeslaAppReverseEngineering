package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.h;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import na.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g<Transcode> {

    /* renamed from: a  reason: collision with root package name */
    private final List<n.a<?>> f10567a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final List<ha.b> f10568b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private com.bumptech.glide.e f10569c;

    /* renamed from: d  reason: collision with root package name */
    private Object f10570d;

    /* renamed from: e  reason: collision with root package name */
    private int f10571e;

    /* renamed from: f  reason: collision with root package name */
    private int f10572f;

    /* renamed from: g  reason: collision with root package name */
    private Class<?> f10573g;

    /* renamed from: h  reason: collision with root package name */
    private h.e f10574h;

    /* renamed from: i  reason: collision with root package name */
    private ha.e f10575i;

    /* renamed from: j  reason: collision with root package name */
    private Map<Class<?>, ha.h<?>> f10576j;

    /* renamed from: k  reason: collision with root package name */
    private Class<Transcode> f10577k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f10578l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f10579m;

    /* renamed from: n  reason: collision with root package name */
    private ha.b f10580n;

    /* renamed from: o  reason: collision with root package name */
    private com.bumptech.glide.h f10581o;

    /* renamed from: p  reason: collision with root package name */
    private ja.a f10582p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f10583q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f10584r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f10569c = null;
        this.f10570d = null;
        this.f10580n = null;
        this.f10573g = null;
        this.f10577k = null;
        this.f10575i = null;
        this.f10581o = null;
        this.f10576j = null;
        this.f10582p = null;
        this.f10567a.clear();
        this.f10578l = false;
        this.f10568b.clear();
        this.f10579m = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ka.b b() {
        return this.f10569c.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<ha.b> c() {
        if (!this.f10579m) {
            this.f10579m = true;
            this.f10568b.clear();
            List<n.a<?>> g11 = g();
            int size = g11.size();
            for (int i11 = 0; i11 < size; i11++) {
                n.a<?> aVar = g11.get(i11);
                if (!this.f10568b.contains(aVar.f40733a)) {
                    this.f10568b.add(aVar.f40733a);
                }
                for (int i12 = 0; i12 < aVar.f40734b.size(); i12++) {
                    if (!this.f10568b.contains(aVar.f40734b.get(i12))) {
                        this.f10568b.add(aVar.f40734b.get(i12));
                    }
                }
            }
        }
        return this.f10568b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public la.a d() {
        return this.f10574h.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ja.a e() {
        return this.f10582p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f10572f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<n.a<?>> g() {
        if (!this.f10578l) {
            this.f10578l = true;
            this.f10567a.clear();
            List i11 = this.f10569c.i().i(this.f10570d);
            int size = i11.size();
            for (int i12 = 0; i12 < size; i12++) {
                n.a<?> b11 = ((na.n) i11.get(i12)).b(this.f10570d, this.f10571e, this.f10572f, this.f10575i);
                if (b11 != null) {
                    this.f10567a.add(b11);
                }
            }
        }
        return this.f10567a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <Data> q<Data, ?, Transcode> h(Class<Data> cls) {
        return this.f10569c.i().h(cls, this.f10573g, this.f10577k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Class<?> i() {
        return this.f10570d.getClass();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<na.n<File, ?>> j(File file) {
        return this.f10569c.i().i(file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ha.e k() {
        return this.f10575i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.bumptech.glide.h l() {
        return this.f10581o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Class<?>> m() {
        return this.f10569c.i().j(this.f10570d.getClass(), this.f10573g, this.f10577k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <Z> ha.g<Z> n(ja.c<Z> cVar) {
        return this.f10569c.i().k(cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ha.b o() {
        return this.f10580n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <X> ha.a<X> p(X x11) {
        return this.f10569c.i().m(x11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Class<?> q() {
        return (Class<Transcode>) this.f10577k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <Z> ha.h<Z> r(Class<Z> cls) {
        ha.h<Z> hVar = (ha.h<Z>) this.f10576j.get(cls);
        if (hVar == null) {
            Iterator<Map.Entry<Class<?>, ha.h<?>>> it2 = this.f10576j.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, ha.h<?>> next = it2.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    hVar = (ha.h<Z>) next.getValue();
                    break;
                }
            }
        }
        if (hVar == null) {
            if (this.f10576j.isEmpty() && this.f10583q) {
                throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
            }
            return pa.c.c();
        }
        return hVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int s() {
        return this.f10571e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean t(Class<?> cls) {
        return h(cls) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public <R> void u(com.bumptech.glide.e eVar, Object obj, ha.b bVar, int i11, int i12, ja.a aVar, Class<?> cls, Class<R> cls2, com.bumptech.glide.h hVar, ha.e eVar2, Map<Class<?>, ha.h<?>> map, boolean z11, boolean z12, h.e eVar3) {
        this.f10569c = eVar;
        this.f10570d = obj;
        this.f10580n = bVar;
        this.f10571e = i11;
        this.f10572f = i12;
        this.f10582p = aVar;
        this.f10573g = cls;
        this.f10574h = eVar3;
        this.f10577k = cls2;
        this.f10581o = hVar;
        this.f10575i = eVar2;
        this.f10576j = map;
        this.f10583q = z11;
        this.f10584r = z12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean v(ja.c<?> cVar) {
        return this.f10569c.i().n(cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean w() {
        return this.f10584r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x(ha.b bVar) {
        List<n.a<?>> g11 = g();
        int size = g11.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (g11.get(i11).f40733a.equals(bVar)) {
                return true;
            }
        }
        return false;
    }
}