package d20;

import d20.h;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import w00.i0;
import wz.b0;
import wz.p;
import wz.w;
import wz.x0;

/* loaded from: classes5.dex */
public final class b implements h {

    /* renamed from: d  reason: collision with root package name */
    public static final a f23440d = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private final String f23441b;

    /* renamed from: c  reason: collision with root package name */
    private final h[] f23442c;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(String debugName, Iterable<? extends h> scopes) {
            s.g(debugName, "debugName");
            s.g(scopes, "scopes");
            s20.e eVar = new s20.e();
            for (h hVar : scopes) {
                if (hVar != h.b.f23482b) {
                    if (hVar instanceof b) {
                        b0.A(eVar, ((b) hVar).f23442c);
                    } else {
                        eVar.add(hVar);
                    }
                }
            }
            return b(debugName, eVar);
        }

        public final h b(String debugName, List<? extends h> scopes) {
            s.g(debugName, "debugName");
            s.g(scopes, "scopes");
            int size = scopes.size();
            if (size != 0) {
                if (size != 1) {
                    Object[] array = scopes.toArray(new h[0]);
                    Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                    return new b(debugName, (h[]) array, null);
                }
                return scopes.get(0);
            }
            return h.b.f23482b;
        }
    }

    private b(String str, h[] hVarArr) {
        this.f23441b = str;
        this.f23442c = hVarArr;
    }

    public /* synthetic */ b(String str, h[] hVarArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, hVarArr);
    }

    @Override // d20.h
    public Collection<i0> a(u10.f name, d10.b location) {
        List i11;
        Set d11;
        s.g(name, "name");
        s.g(location, "location");
        h[] hVarArr = this.f23442c;
        int length = hVarArr.length;
        if (length == 0) {
            i11 = w.i();
            return i11;
        }
        int i12 = 0;
        if (length != 1) {
            Collection<i0> collection = null;
            int length2 = hVarArr.length;
            while (i12 < length2) {
                h hVar = hVarArr[i12];
                i12++;
                collection = r20.a.a(collection, hVar.a(name, location));
            }
            if (collection == null) {
                d11 = x0.d();
                return d11;
            }
            return collection;
        }
        return hVarArr[0].a(name, location);
    }

    @Override // d20.h
    public Set<u10.f> b() {
        h[] hVarArr = this.f23442c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (h hVar : hVarArr) {
            b0.z(linkedHashSet, hVar.b());
        }
        return linkedHashSet;
    }

    @Override // d20.h
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> c(u10.f name, d10.b location) {
        List i11;
        Set d11;
        s.g(name, "name");
        s.g(location, "location");
        h[] hVarArr = this.f23442c;
        int length = hVarArr.length;
        if (length == 0) {
            i11 = w.i();
            return i11;
        }
        int i12 = 0;
        if (length != 1) {
            Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> collection = null;
            int length2 = hVarArr.length;
            while (i12 < length2) {
                h hVar = hVarArr[i12];
                i12++;
                collection = r20.a.a(collection, hVar.c(name, location));
            }
            if (collection == null) {
                d11 = x0.d();
                return d11;
            }
            return collection;
        }
        return hVarArr[0].c(name, location);
    }

    @Override // d20.h
    public Set<u10.f> d() {
        h[] hVarArr = this.f23442c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (h hVar : hVarArr) {
            b0.z(linkedHashSet, hVar.d());
        }
        return linkedHashSet;
    }

    @Override // d20.k
    public w00.e e(u10.f name, d10.b location) {
        s.g(name, "name");
        s.g(location, "location");
        h[] hVarArr = this.f23442c;
        int length = hVarArr.length;
        w00.e eVar = null;
        int i11 = 0;
        while (i11 < length) {
            h hVar = hVarArr[i11];
            i11++;
            w00.e e11 = hVar.e(name, location);
            if (e11 != null) {
                if (!(e11 instanceof w00.f) || !((w00.f) e11).g0()) {
                    return e11;
                }
                if (eVar == null) {
                    eVar = e11;
                }
            }
        }
        return eVar;
    }

    @Override // d20.h
    public Set<u10.f> f() {
        Iterable A;
        A = p.A(this.f23442c);
        return j.a(A);
    }

    @Override // d20.k
    public Collection<w00.i> g(d kindFilter, h00.l<? super u10.f, Boolean> nameFilter) {
        List i11;
        Set d11;
        s.g(kindFilter, "kindFilter");
        s.g(nameFilter, "nameFilter");
        h[] hVarArr = this.f23442c;
        int length = hVarArr.length;
        if (length == 0) {
            i11 = w.i();
            return i11;
        }
        int i12 = 0;
        if (length != 1) {
            Collection<w00.i> collection = null;
            int length2 = hVarArr.length;
            while (i12 < length2) {
                h hVar = hVarArr[i12];
                i12++;
                collection = r20.a.a(collection, hVar.g(kindFilter, nameFilter));
            }
            if (collection == null) {
                d11 = x0.d();
                return d11;
            }
            return collection;
        }
        return hVarArr[0].g(kindFilter, nameFilter);
    }

    public String toString() {
        return this.f23441b;
    }
}