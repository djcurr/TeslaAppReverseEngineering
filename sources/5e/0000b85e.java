package v00;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import k20.d0;
import k20.f1;
import kotlin.jvm.internal.s;
import t00.k;
import wz.w;
import wz.w0;
import wz.x0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a */
    public static final d f53803a = new d();

    private d() {
    }

    public static /* synthetic */ w00.c h(d dVar, u10.c cVar, t00.h hVar, Integer num, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            num = null;
        }
        return dVar.g(cVar, hVar, num);
    }

    public final w00.c a(w00.c mutable) {
        s.g(mutable, "mutable");
        u10.c p11 = c.f53787a.p(w10.d.m(mutable));
        if (p11 != null) {
            w00.c o11 = a20.a.g(mutable).o(p11);
            s.f(o11, "descriptor.builtIns.getB…Name(oppositeClassFqName)");
            return o11;
        }
        throw new IllegalArgumentException("Given class " + mutable + " is not a mutable collection");
    }

    public final w00.c b(w00.c readOnly) {
        s.g(readOnly, "readOnly");
        u10.c q11 = c.f53787a.q(w10.d.m(readOnly));
        if (q11 != null) {
            w00.c o11 = a20.a.g(readOnly).o(q11);
            s.f(o11, "descriptor.builtIns.getB…Name(oppositeClassFqName)");
            return o11;
        }
        throw new IllegalArgumentException("Given class " + readOnly + " is not a read-only collection");
    }

    public final boolean c(d0 type) {
        s.g(type, "type");
        w00.c g11 = f1.g(type);
        return g11 != null && d(g11);
    }

    public final boolean d(w00.c mutable) {
        s.g(mutable, "mutable");
        return c.f53787a.l(w10.d.m(mutable));
    }

    public final boolean e(d0 type) {
        s.g(type, "type");
        w00.c g11 = f1.g(type);
        return g11 != null && f(g11);
    }

    public final boolean f(w00.c readOnly) {
        s.g(readOnly, "readOnly");
        return c.f53787a.m(w10.d.m(readOnly));
    }

    public final w00.c g(u10.c fqName, t00.h builtIns, Integer num) {
        s.g(fqName, "fqName");
        s.g(builtIns, "builtIns");
        u10.b n11 = (num == null || !s.c(fqName, c.f53787a.i())) ? c.f53787a.n(fqName) : k.a(num.intValue());
        if (n11 != null) {
            return builtIns.o(n11.b());
        }
        return null;
    }

    public final Collection<w00.c> i(u10.c fqName, t00.h builtIns) {
        List l11;
        Set c11;
        Set d11;
        s.g(fqName, "fqName");
        s.g(builtIns, "builtIns");
        w00.c h11 = h(this, fqName, builtIns, null, 4, null);
        if (h11 == null) {
            d11 = x0.d();
            return d11;
        }
        u10.c q11 = c.f53787a.q(a20.a.j(h11));
        if (q11 == null) {
            c11 = w0.c(h11);
            return c11;
        }
        w00.c o11 = builtIns.o(q11);
        s.f(o11, "builtIns.getBuiltInClass…otlinMutableAnalogFqName)");
        l11 = w.l(h11, o11);
        return l11;
    }
}