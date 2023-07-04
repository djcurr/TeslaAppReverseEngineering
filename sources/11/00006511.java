package d20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.s;
import w00.r0;
import wz.w;

/* loaded from: classes5.dex */
public final class f extends i {

    /* renamed from: b  reason: collision with root package name */
    private final h f23475b;

    public f(h workerScope) {
        s.g(workerScope, "workerScope");
        this.f23475b = workerScope;
    }

    @Override // d20.i, d20.h
    public Set<u10.f> b() {
        return this.f23475b.b();
    }

    @Override // d20.i, d20.h
    public Set<u10.f> d() {
        return this.f23475b.d();
    }

    @Override // d20.i, d20.k
    public w00.e e(u10.f name, d10.b location) {
        s.g(name, "name");
        s.g(location, "location");
        w00.e e11 = this.f23475b.e(name, location);
        if (e11 == null) {
            return null;
        }
        w00.c cVar = e11 instanceof w00.c ? (w00.c) e11 : null;
        if (cVar == null) {
            if (e11 instanceof r0) {
                return (r0) e11;
            }
            return null;
        }
        return cVar;
    }

    @Override // d20.i, d20.h
    public Set<u10.f> f() {
        return this.f23475b.f();
    }

    @Override // d20.i, d20.k
    /* renamed from: h */
    public List<w00.e> g(d kindFilter, h00.l<? super u10.f, Boolean> nameFilter) {
        List<w00.e> i11;
        s.g(kindFilter, "kindFilter");
        s.g(nameFilter, "nameFilter");
        d n11 = kindFilter.n(d.f23446c.c());
        if (n11 == null) {
            i11 = w.i();
            return i11;
        }
        Collection<w00.i> g11 = this.f23475b.g(n11, nameFilter);
        ArrayList arrayList = new ArrayList();
        for (Object obj : g11) {
            if (obj instanceof w00.f) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public String toString() {
        return s.p("Classes from ", this.f23475b);
    }
}