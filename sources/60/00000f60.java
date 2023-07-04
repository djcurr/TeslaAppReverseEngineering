package c10;

import d10.b;
import d10.c;
import d10.e;
import kotlin.jvm.internal.s;
import u10.f;
import w00.a0;
import w10.d;

/* loaded from: classes5.dex */
public final class a {
    public static final void a(c cVar, b from, w00.c scopeOwner, f name) {
        d10.a location;
        s.g(cVar, "<this>");
        s.g(from, "from");
        s.g(scopeOwner, "scopeOwner");
        s.g(name, "name");
        if (cVar == c.a.f23289a || (location = from.getLocation()) == null) {
            return;
        }
        e position = cVar.a() ? location.getPosition() : e.f23290c.a();
        String a11 = location.a();
        String b11 = d.m(scopeOwner).b();
        s.f(b11, "getFqName(scopeOwner).asString()");
        d10.f fVar = d10.f.CLASSIFIER;
        String b12 = name.b();
        s.f(b12, "name.asString()");
        cVar.b(a11, position, b11, fVar, b12);
    }

    public static final void b(c cVar, b from, a0 scopeOwner, f name) {
        s.g(cVar, "<this>");
        s.g(from, "from");
        s.g(scopeOwner, "scopeOwner");
        s.g(name, "name");
        String b11 = scopeOwner.e().b();
        s.f(b11, "scopeOwner.fqName.asString()");
        String b12 = name.b();
        s.f(b12, "name.asString()");
        c(cVar, from, b11, b12);
    }

    public static final void c(c cVar, b from, String packageFqName, String name) {
        d10.a location;
        s.g(cVar, "<this>");
        s.g(from, "from");
        s.g(packageFqName, "packageFqName");
        s.g(name, "name");
        if (cVar == c.a.f23289a || (location = from.getLocation()) == null) {
            return;
        }
        cVar.b(location.a(), cVar.a() ? location.getPosition() : e.f23290c.a(), packageFqName, d10.f.PACKAGE, name);
    }
}