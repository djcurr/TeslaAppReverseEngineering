package i10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import n10.o;
import w00.i0;
import wz.b0;
import wz.p;
import wz.x0;

/* loaded from: classes5.dex */
public final class d implements d20.h {

    /* renamed from: f  reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f29565f = {m0.j(new f0(m0.b(d.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: b  reason: collision with root package name */
    private final h10.h f29566b;

    /* renamed from: c  reason: collision with root package name */
    private final h f29567c;

    /* renamed from: d  reason: collision with root package name */
    private final i f29568d;

    /* renamed from: e  reason: collision with root package name */
    private final j20.i f29569e;

    /* loaded from: classes5.dex */
    static final class a extends u implements h00.a<MemberScope[]> {
        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final d20.h[] mo11invoke() {
            Collection<o> values = d.this.f29567c.I0().values();
            d dVar = d.this;
            ArrayList arrayList = new ArrayList();
            for (o oVar : values) {
                d20.h c11 = dVar.f29566b.a().b().c(dVar.f29567c, oVar);
                if (c11 != null) {
                    arrayList.add(c11);
                }
            }
            Object[] array = r20.a.b(arrayList).toArray(new d20.h[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return (d20.h[]) array;
        }
    }

    public d(h10.h c11, l10.u jPackage, h packageFragment) {
        s.g(c11, "c");
        s.g(jPackage, "jPackage");
        s.g(packageFragment, "packageFragment");
        this.f29566b = c11;
        this.f29567c = packageFragment;
        this.f29568d = new i(c11, jPackage, packageFragment);
        this.f29569e = c11.e().b(new a());
    }

    private final d20.h[] k() {
        return (d20.h[]) j20.m.a(this.f29569e, this, f29565f[0]);
    }

    @Override // d20.h
    public Collection<i0> a(u10.f name, d10.b location) {
        Set d11;
        s.g(name, "name");
        s.g(location, "location");
        l(name, location);
        i iVar = this.f29568d;
        d20.h[] k11 = k();
        Collection<? extends i0> a11 = iVar.a(name, location);
        int length = k11.length;
        int i11 = 0;
        Collection collection = a11;
        while (i11 < length) {
            d20.h hVar = k11[i11];
            i11++;
            collection = r20.a.a(collection, hVar.a(name, location));
        }
        if (collection == null) {
            d11 = x0.d();
            return d11;
        }
        return collection;
    }

    @Override // d20.h
    public Set<u10.f> b() {
        d20.h[] k11 = k();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (d20.h hVar : k11) {
            b0.z(linkedHashSet, hVar.b());
        }
        linkedHashSet.addAll(j().b());
        return linkedHashSet;
    }

    @Override // d20.h
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> c(u10.f name, d10.b location) {
        Set d11;
        s.g(name, "name");
        s.g(location, "location");
        l(name, location);
        i iVar = this.f29568d;
        d20.h[] k11 = k();
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h> c11 = iVar.c(name, location);
        int length = k11.length;
        int i11 = 0;
        Collection collection = c11;
        while (i11 < length) {
            d20.h hVar = k11[i11];
            i11++;
            collection = r20.a.a(collection, hVar.c(name, location));
        }
        if (collection == null) {
            d11 = x0.d();
            return d11;
        }
        return collection;
    }

    @Override // d20.h
    public Set<u10.f> d() {
        d20.h[] k11 = k();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (d20.h hVar : k11) {
            b0.z(linkedHashSet, hVar.d());
        }
        linkedHashSet.addAll(j().d());
        return linkedHashSet;
    }

    @Override // d20.k
    /* renamed from: e */
    public w00.e mo137e(u10.f name, d10.b location) {
        s.g(name, "name");
        s.g(location, "location");
        l(name, location);
        w00.c e11 = this.f29568d.e(name, location);
        if (e11 != null) {
            return e11;
        }
        d20.h[] k11 = k();
        w00.e eVar = null;
        int i11 = 0;
        int length = k11.length;
        while (i11 < length) {
            d20.h hVar = k11[i11];
            i11++;
            w00.e mo137e = hVar.mo137e(name, location);
            if (mo137e != null) {
                if (!(mo137e instanceof w00.f) || !((w00.f) mo137e).g0()) {
                    return mo137e;
                }
                if (eVar == null) {
                    eVar = mo137e;
                }
            }
        }
        return eVar;
    }

    @Override // d20.h
    public Set<u10.f> f() {
        Iterable A;
        A = p.A(k());
        Set<u10.f> a11 = d20.j.a(A);
        if (a11 == null) {
            return null;
        }
        a11.addAll(j().f());
        return a11;
    }

    @Override // d20.k
    public Collection<w00.i> g(d20.d kindFilter, h00.l<? super u10.f, Boolean> nameFilter) {
        Set d11;
        s.g(kindFilter, "kindFilter");
        s.g(nameFilter, "nameFilter");
        i iVar = this.f29568d;
        d20.h[] k11 = k();
        Collection<w00.i> g11 = iVar.g(kindFilter, nameFilter);
        int length = k11.length;
        int i11 = 0;
        while (i11 < length) {
            d20.h hVar = k11[i11];
            i11++;
            g11 = r20.a.a(g11, hVar.g(kindFilter, nameFilter));
        }
        if (g11 == null) {
            d11 = x0.d();
            return d11;
        }
        return g11;
    }

    public final i j() {
        return this.f29568d;
    }

    public void l(u10.f name, d10.b location) {
        s.g(name, "name");
        s.g(location, "location");
        c10.a.b(this.f29566b.a().l(), location, this.f29567c, name);
    }

    public String toString() {
        return s.p("scope for ", this.f29567c);
    }
}