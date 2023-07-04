package a10;

import ch.qos.logback.core.CoreConstants;
import d20.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.s;
import n10.o;
import o10.a;
import wz.e0;
import wz.v;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final n10.e f111a;

    /* renamed from: b  reason: collision with root package name */
    private final g f112b;

    /* renamed from: c  reason: collision with root package name */
    private final ConcurrentHashMap<u10.b, d20.h> f113c;

    public a(n10.e resolver, g kotlinClassFinder) {
        s.g(resolver, "resolver");
        s.g(kotlinClassFinder, "kotlinClassFinder");
        this.f111a = resolver;
        this.f112b = kotlinClassFinder;
        this.f113c = new ConcurrentHashMap<>();
    }

    public final d20.h a(f fileClass) {
        Collection<o> d11;
        List O0;
        s.g(fileClass, "fileClass");
        ConcurrentHashMap<u10.b, d20.h> concurrentHashMap = this.f113c;
        u10.b j11 = fileClass.j();
        d20.h hVar = concurrentHashMap.get(j11);
        if (hVar == null) {
            u10.c h11 = fileClass.j().h();
            s.f(h11, "fileClass.classId.packageFqName");
            if (fileClass.a().c() == a.EnumC0828a.MULTIFILE_CLASS) {
                List<String> f11 = fileClass.a().f();
                d11 = new ArrayList();
                for (String str : f11) {
                    u10.b m11 = u10.b.m(b20.d.d(str).e());
                    s.f(m11, "topLevel(JvmClassName.by…velClassMaybeWithDollars)");
                    o b11 = n10.n.b(this.f112b, m11);
                    if (b11 != null) {
                        d11.add(b11);
                    }
                }
            } else {
                d11 = v.d(fileClass);
            }
            y00.m mVar = new y00.m(this.f111a.e().p(), h11);
            ArrayList arrayList = new ArrayList();
            for (o oVar : d11) {
                d20.h c11 = this.f111a.c(mVar, oVar);
                if (c11 != null) {
                    arrayList.add(c11);
                }
            }
            O0 = e0.O0(arrayList);
            b.a aVar = d20.b.f23440d;
            d20.h a11 = aVar.a("package " + h11 + " (" + fileClass + CoreConstants.RIGHT_PARENTHESIS_CHAR, O0);
            d20.h putIfAbsent = concurrentHashMap.putIfAbsent(j11, a11);
            hVar = putIfAbsent != null ? putIfAbsent : a11;
        }
        s.f(hVar, "cache.getOrPut(fileClass…ileClass)\", scopes)\n    }");
        return hVar;
    }
}