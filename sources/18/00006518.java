package d20;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.s;
import w00.i0;
import wz.w;

/* loaded from: classes5.dex */
public abstract class i implements h {
    @Override // d20.h
    public Collection<? extends i0> a(u10.f name, d10.b location) {
        List i11;
        s.g(name, "name");
        s.g(location, "location");
        i11 = w.i();
        return i11;
    }

    @Override // d20.h
    public Set<u10.f> b() {
        Collection<w00.i> g11 = g(d.f23461r, s20.d.a());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : g11) {
            if (obj instanceof kotlin.reflect.jvm.internal.impl.descriptors.h) {
                u10.f name = ((kotlin.reflect.jvm.internal.impl.descriptors.h) obj).getName();
                s.f(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // d20.h
    public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h> c(u10.f name, d10.b location) {
        List i11;
        s.g(name, "name");
        s.g(location, "location");
        i11 = w.i();
        return i11;
    }

    @Override // d20.h
    public Set<u10.f> d() {
        Collection<w00.i> g11 = g(d.f23462s, s20.d.a());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : g11) {
            if (obj instanceof kotlin.reflect.jvm.internal.impl.descriptors.h) {
                u10.f name = ((kotlin.reflect.jvm.internal.impl.descriptors.h) obj).getName();
                s.f(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // d20.k
    public w00.e e(u10.f name, d10.b location) {
        s.g(name, "name");
        s.g(location, "location");
        return null;
    }

    @Override // d20.h
    public Set<u10.f> f() {
        return null;
    }

    @Override // d20.k
    public Collection<w00.i> g(d kindFilter, h00.l<? super u10.f, Boolean> nameFilter) {
        List i11;
        s.g(kindFilter, "kindFilter");
        s.g(nameFilter, "nameFilter");
        i11 = w.i();
        return i11;
    }
}