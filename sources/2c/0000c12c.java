package y00;

import d20.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import wz.x0;

/* loaded from: classes5.dex */
public class h0 extends d20.i {

    /* renamed from: b  reason: collision with root package name */
    private final w00.x f58812b;

    /* renamed from: c  reason: collision with root package name */
    private final u10.c f58813c;

    public h0(w00.x moduleDescriptor, u10.c fqName) {
        kotlin.jvm.internal.s.g(moduleDescriptor, "moduleDescriptor");
        kotlin.jvm.internal.s.g(fqName, "fqName");
        this.f58812b = moduleDescriptor;
        this.f58813c = fqName;
    }

    @Override // d20.i, d20.h
    public Set<u10.f> f() {
        Set<u10.f> d11;
        d11 = x0.d();
        return d11;
    }

    @Override // d20.i, d20.k
    public Collection<w00.i> g(d20.d kindFilter, h00.l<? super u10.f, Boolean> nameFilter) {
        List i11;
        List i12;
        kotlin.jvm.internal.s.g(kindFilter, "kindFilter");
        kotlin.jvm.internal.s.g(nameFilter, "nameFilter");
        if (!kindFilter.a(d20.d.f23446c.f())) {
            i12 = wz.w.i();
            return i12;
        } else if (this.f58813c.d() && kindFilter.l().contains(c.b.f23445a)) {
            i11 = wz.w.i();
            return i11;
        } else {
            Collection<u10.c> r11 = this.f58812b.r(this.f58813c, nameFilter);
            ArrayList arrayList = new ArrayList(r11.size());
            for (u10.c cVar : r11) {
                u10.f g11 = cVar.g();
                kotlin.jvm.internal.s.f(g11, "subFqName.shortName()");
                if (nameFilter.invoke(g11).booleanValue()) {
                    s20.a.a(arrayList, h(g11));
                }
            }
            return arrayList;
        }
    }

    protected final w00.f0 h(u10.f name) {
        kotlin.jvm.internal.s.g(name, "name");
        if (name.g()) {
            return null;
        }
        w00.x xVar = this.f58812b;
        u10.c c11 = this.f58813c.c(name);
        kotlin.jvm.internal.s.f(c11, "fqName.child(name)");
        w00.f0 R = xVar.R(c11);
        if (R.isEmpty()) {
            return null;
        }
        return R;
    }

    public String toString() {
        return "subpackages of " + this.f58813c + " from " + this.f58812b;
    }
}