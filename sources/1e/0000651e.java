package d20;

import d20.k;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import k20.b1;
import k20.d1;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import w00.i0;
import w00.p0;

/* loaded from: classes5.dex */
public final class m implements h {

    /* renamed from: b  reason: collision with root package name */
    private final h f23487b;

    /* renamed from: c  reason: collision with root package name */
    private final d1 f23488c;

    /* renamed from: d  reason: collision with root package name */
    private Map<w00.i, w00.i> f23489d;

    /* renamed from: e  reason: collision with root package name */
    private final vz.k f23490e;

    /* loaded from: classes5.dex */
    static final class a extends u implements h00.a<Collection<? extends w00.i>> {
        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final Collection<w00.i> invoke() {
            m mVar = m.this;
            return mVar.k(k.a.a(mVar.f23487b, null, null, 3, null));
        }
    }

    public m(h workerScope, d1 givenSubstitutor) {
        vz.k a11;
        s.g(workerScope, "workerScope");
        s.g(givenSubstitutor, "givenSubstitutor");
        this.f23487b = workerScope;
        b1 j11 = givenSubstitutor.j();
        s.f(j11, "givenSubstitutor.substitution");
        this.f23488c = x10.d.f(j11, false, 1, null).c();
        a11 = vz.m.a(new a());
        this.f23490e = a11;
    }

    private final Collection<w00.i> j() {
        return (Collection) this.f23490e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends w00.i> Collection<D> k(Collection<? extends D> collection) {
        if (this.f23488c.k() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet g11 = s20.a.g(collection.size());
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            g11.add(l((w00.i) it2.next()));
        }
        return g11;
    }

    private final <D extends w00.i> D l(D d11) {
        if (this.f23488c.k()) {
            return d11;
        }
        if (this.f23489d == null) {
            this.f23489d = new HashMap();
        }
        Map<w00.i, w00.i> map = this.f23489d;
        s.e(map);
        w00.i iVar = map.get(d11);
        if (iVar == null) {
            if (!(d11 instanceof p0)) {
                throw new IllegalStateException(s.p("Unknown descriptor in scope: ", d11).toString());
            }
            iVar = ((p0) d11).c(this.f23488c);
            if (iVar != null) {
                map.put(d11, iVar);
            } else {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d11 + " substitution fails");
            }
        }
        return (D) iVar;
    }

    @Override // d20.h
    public Collection<? extends i0> a(u10.f name, d10.b location) {
        s.g(name, "name");
        s.g(location, "location");
        return k(this.f23487b.a(name, location));
    }

    @Override // d20.h
    public Set<u10.f> b() {
        return this.f23487b.b();
    }

    @Override // d20.h
    public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h> c(u10.f name, d10.b location) {
        s.g(name, "name");
        s.g(location, "location");
        return k(this.f23487b.c(name, location));
    }

    @Override // d20.h
    public Set<u10.f> d() {
        return this.f23487b.d();
    }

    @Override // d20.k
    public w00.e e(u10.f name, d10.b location) {
        s.g(name, "name");
        s.g(location, "location");
        w00.e e11 = this.f23487b.e(name, location);
        if (e11 == null) {
            return null;
        }
        return (w00.e) l(e11);
    }

    @Override // d20.h
    public Set<u10.f> f() {
        return this.f23487b.f();
    }

    @Override // d20.k
    public Collection<w00.i> g(d kindFilter, h00.l<? super u10.f, Boolean> nameFilter) {
        s.g(kindFilter, "kindFilter");
        s.g(nameFilter, "nameFilter");
        return j();
    }
}