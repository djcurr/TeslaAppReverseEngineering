package n10;

import g20.u;
import java.util.List;
import x00.a;
import x00.c;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final g20.j f40192a;

    public d(j20.n storageManager, w00.x moduleDescriptor, g20.k configuration, f classDataFinder, b annotationAndConstantLoader, h10.g packageFragmentProvider, w00.z notFoundClasses, g20.q errorReporter, d10.c lookupTracker, g20.i contractDeserializer, kotlin.reflect.jvm.internal.impl.types.checker.m kotlinTypeChecker) {
        List i11;
        List i12;
        kotlin.jvm.internal.s.g(storageManager, "storageManager");
        kotlin.jvm.internal.s.g(moduleDescriptor, "moduleDescriptor");
        kotlin.jvm.internal.s.g(configuration, "configuration");
        kotlin.jvm.internal.s.g(classDataFinder, "classDataFinder");
        kotlin.jvm.internal.s.g(annotationAndConstantLoader, "annotationAndConstantLoader");
        kotlin.jvm.internal.s.g(packageFragmentProvider, "packageFragmentProvider");
        kotlin.jvm.internal.s.g(notFoundClasses, "notFoundClasses");
        kotlin.jvm.internal.s.g(errorReporter, "errorReporter");
        kotlin.jvm.internal.s.g(lookupTracker, "lookupTracker");
        kotlin.jvm.internal.s.g(contractDeserializer, "contractDeserializer");
        kotlin.jvm.internal.s.g(kotlinTypeChecker, "kotlinTypeChecker");
        t00.h l11 = moduleDescriptor.l();
        v00.f fVar = l11 instanceof v00.f ? (v00.f) l11 : null;
        u.a aVar = u.a.f27444a;
        g gVar = g.f40203a;
        i11 = wz.w.i();
        x00.a G0 = fVar == null ? null : fVar.G0();
        x00.a aVar2 = G0 == null ? a.C1295a.f56634a : G0;
        x00.c G02 = fVar != null ? fVar.G0() : null;
        x00.c cVar = G02 == null ? c.b.f56636a : G02;
        kotlin.reflect.jvm.internal.impl.protobuf.f a11 = t10.g.f51558a.a();
        i12 = wz.w.i();
        this.f40192a = new g20.j(storageManager, moduleDescriptor, configuration, classDataFinder, annotationAndConstantLoader, packageFragmentProvider, aVar, errorReporter, lookupTracker, gVar, i11, notFoundClasses, contractDeserializer, aVar2, cVar, a11, kotlinTypeChecker, new c20.b(storageManager, i12), null, 262144, null);
    }

    public final g20.j a() {
        return this.f40192a;
    }
}