package d20;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.s;
import w00.i0;

/* loaded from: classes5.dex */
public abstract class a implements h {
    @Override // d20.h
    public Collection<i0> a(u10.f name, d10.b location) {
        s.g(name, "name");
        s.g(location, "location");
        return i().a(name, location);
    }

    @Override // d20.h
    public Set<u10.f> b() {
        return i().b();
    }

    @Override // d20.h
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> c(u10.f name, d10.b location) {
        s.g(name, "name");
        s.g(location, "location");
        return i().c(name, location);
    }

    @Override // d20.h
    public Set<u10.f> d() {
        return i().d();
    }

    @Override // d20.k
    public w00.e e(u10.f name, d10.b location) {
        s.g(name, "name");
        s.g(location, "location");
        return i().e(name, location);
    }

    @Override // d20.h
    public Set<u10.f> f() {
        return i().f();
    }

    @Override // d20.k
    public Collection<w00.i> g(d kindFilter, h00.l<? super u10.f, Boolean> nameFilter) {
        s.g(kindFilter, "kindFilter");
        s.g(nameFilter, "nameFilter");
        return i().g(kindFilter, nameFilter);
    }

    public final h h() {
        if (i() instanceof a) {
            return ((a) i()).h();
        }
        return i();
    }

    protected abstract h i();
}