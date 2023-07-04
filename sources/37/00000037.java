package a10;

import d10.c;
import e10.p;
import e10.v;
import f10.f;
import g20.k;
import h10.d;
import java.util.List;
import kotlin.jvm.internal.s;
import n10.u;
import w00.q0;
import w00.x;
import w00.z;
import wz.w;

/* loaded from: classes5.dex */
public final class l {

    /* loaded from: classes5.dex */
    public static final class a implements h10.b {
        a() {
        }

        @Override // h10.b
        public List<l10.a> a(u10.b classId) {
            s.g(classId, "classId");
            return null;
        }
    }

    public static final n10.d a(x module, j20.n storageManager, z notFoundClasses, h10.g lazyJavaPackageFragmentProvider, n10.m reflectKotlinClassFinder, n10.e deserializedDescriptorResolver) {
        s.g(module, "module");
        s.g(storageManager, "storageManager");
        s.g(notFoundClasses, "notFoundClasses");
        s.g(lazyJavaPackageFragmentProvider, "lazyJavaPackageFragmentProvider");
        s.g(reflectKotlinClassFinder, "reflectKotlinClassFinder");
        s.g(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        return new n10.d(storageManager, module, k.a.f27416a, new n10.f(reflectKotlinClassFinder, deserializedDescriptorResolver), new n10.b(module, notFoundClasses, storageManager, reflectKotlinClassFinder), lazyJavaPackageFragmentProvider, notFoundClasses, j.f123b, c.a.f23289a, g20.i.f27393a.a(), kotlin.reflect.jvm.internal.impl.types.checker.m.f35169b.a());
    }

    public static final h10.g b(ClassLoader classLoader, x module, j20.n storageManager, z notFoundClasses, n10.m reflectKotlinClassFinder, n10.e deserializedDescriptorResolver, h10.j singleModuleClassResolver, u packagePartProvider) {
        List i11;
        s.g(classLoader, "classLoader");
        s.g(module, "module");
        s.g(storageManager, "storageManager");
        s.g(notFoundClasses, "notFoundClasses");
        s.g(reflectKotlinClassFinder, "reflectKotlinClassFinder");
        s.g(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        s.g(singleModuleClassResolver, "singleModuleClassResolver");
        s.g(packagePartProvider, "packagePartProvider");
        v.b bVar = v.f24496d;
        e10.c cVar = new e10.c(storageManager, bVar.a());
        v a11 = bVar.a();
        d dVar = new d(classLoader);
        f10.j DO_NOTHING = f10.j.f25542a;
        s.f(DO_NOTHING, "DO_NOTHING");
        j jVar = j.f123b;
        f10.g EMPTY = f10.g.f25535a;
        s.f(EMPTY, "EMPTY");
        f.a aVar = f.a.f25534a;
        i11 = w.i();
        c20.b bVar2 = new c20.b(storageManager, i11);
        m mVar = m.f127a;
        q0.a aVar2 = q0.a.f55322a;
        c.a aVar3 = c.a.f23289a;
        t00.j jVar2 = new t00.j(module, notFoundClasses);
        v a12 = bVar.a();
        d.a aVar4 = d.a.f28572a;
        return new h10.g(new h10.c(storageManager, dVar, reflectKotlinClassFinder, deserializedDescriptorResolver, DO_NOTHING, jVar, EMPTY, aVar, bVar2, mVar, singleModuleClassResolver, packagePartProvider, aVar2, aVar3, module, jVar2, cVar, new m10.l(cVar, a12, new m10.d(aVar4)), p.a.f24477a, aVar4, kotlin.reflect.jvm.internal.impl.types.checker.m.f35169b.a(), a11, new a(), null, 8388608, null));
    }
}