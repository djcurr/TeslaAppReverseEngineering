package a10;

import ch.qos.logback.core.CoreConstants;
import e10.o;
import java.util.Set;
import kotlin.jvm.internal.s;
import kotlin.text.v;
import l10.u;

/* loaded from: classes5.dex */
public final class d implements o {

    /* renamed from: a  reason: collision with root package name */
    private final ClassLoader f116a;

    public d(ClassLoader classLoader) {
        s.g(classLoader, "classLoader");
        this.f116a = classLoader;
    }

    @Override // e10.o
    public Set<String> a(u10.c packageFqName) {
        s.g(packageFqName, "packageFqName");
        return null;
    }

    @Override // e10.o
    public u b(u10.c fqName) {
        s.g(fqName, "fqName");
        return new b10.u(fqName);
    }

    @Override // e10.o
    public l10.g c(o.a request) {
        String C;
        s.g(request, "request");
        u10.b a11 = request.a();
        u10.c h11 = a11.h();
        s.f(h11, "classId.packageFqName");
        String b11 = a11.i().b();
        s.f(b11, "classId.relativeClassName.asString()");
        C = v.C(b11, CoreConstants.DOT, CoreConstants.DOLLAR, false, 4, null);
        if (!h11.d()) {
            C = h11.b() + CoreConstants.DOT + C;
        }
        Class<?> a12 = e.a(this.f116a, C);
        if (a12 != null) {
            return new b10.j(a12);
        }
        return null;
    }
}