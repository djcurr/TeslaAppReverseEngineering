package v00;

import d10.c;
import g20.k;
import g20.o;
import g20.q;
import g20.r;
import g20.u;
import j20.n;
import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import n10.m;
import w00.x;
import w00.z;
import wz.w;

/* loaded from: classes5.dex */
public final class h extends g20.a {

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n storageManager, m finder, x moduleDescriptor, z notFoundClasses, x00.a additionalClassPartsProvider, x00.c platformDependentDeclarationFilter, k deserializationConfiguration, kotlin.reflect.jvm.internal.impl.types.checker.m kotlinTypeChecker, c20.a samConversionResolver) {
        super(storageManager, finder, moduleDescriptor);
        List l11;
        s.g(storageManager, "storageManager");
        s.g(finder, "finder");
        s.g(moduleDescriptor, "moduleDescriptor");
        s.g(notFoundClasses, "notFoundClasses");
        s.g(additionalClassPartsProvider, "additionalClassPartsProvider");
        s.g(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        s.g(deserializationConfiguration, "deserializationConfiguration");
        s.g(kotlinTypeChecker, "kotlinTypeChecker");
        s.g(samConversionResolver, "samConversionResolver");
        g20.n nVar = new g20.n(this);
        h20.a aVar = h20.a.f28772m;
        g20.d dVar = new g20.d(moduleDescriptor, notFoundClasses, aVar);
        u.a aVar2 = u.a.f27444a;
        q DO_NOTHING = q.f27438a;
        s.f(DO_NOTHING, "DO_NOTHING");
        c.a aVar3 = c.a.f23289a;
        r.a aVar4 = r.a.f27439a;
        l11 = w.l(new u00.a(storageManager, moduleDescriptor), new e(storageManager, moduleDescriptor, null, 4, null));
        i(new g20.j(storageManager, moduleDescriptor, deserializationConfiguration, nVar, dVar, this, aVar2, DO_NOTHING, aVar3, aVar4, l11, notFoundClasses, g20.i.f27393a.a(), additionalClassPartsProvider, platformDependentDeclarationFilter, aVar.e(), kotlinTypeChecker, samConversionResolver, null, 262144, null));
    }

    @Override // g20.a
    protected o d(u10.c fqName) {
        s.g(fqName, "fqName");
        InputStream a11 = f().a(fqName);
        if (a11 == null) {
            return null;
        }
        return h20.c.f28774n.a(fqName, h(), g(), a11, false);
    }
}