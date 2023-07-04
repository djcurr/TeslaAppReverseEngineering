package g20;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import x00.a;
import x00.c;
import x00.e;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final j20.n f27396a;

    /* renamed from: b  reason: collision with root package name */
    private final w00.x f27397b;

    /* renamed from: c  reason: collision with root package name */
    private final k f27398c;

    /* renamed from: d  reason: collision with root package name */
    private final g f27399d;

    /* renamed from: e  reason: collision with root package name */
    private final c<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, y10.g<?>> f27400e;

    /* renamed from: f  reason: collision with root package name */
    private final w00.b0 f27401f;

    /* renamed from: g  reason: collision with root package name */
    private final u f27402g;

    /* renamed from: h  reason: collision with root package name */
    private final q f27403h;

    /* renamed from: i  reason: collision with root package name */
    private final d10.c f27404i;

    /* renamed from: j  reason: collision with root package name */
    private final r f27405j;

    /* renamed from: k  reason: collision with root package name */
    private final Iterable<x00.b> f27406k;

    /* renamed from: l  reason: collision with root package name */
    private final w00.z f27407l;

    /* renamed from: m  reason: collision with root package name */
    private final i f27408m;

    /* renamed from: n  reason: collision with root package name */
    private final x00.a f27409n;

    /* renamed from: o  reason: collision with root package name */
    private final x00.c f27410o;

    /* renamed from: p  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.f f27411p;

    /* renamed from: q  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.types.checker.m f27412q;

    /* renamed from: r  reason: collision with root package name */
    private final c20.a f27413r;

    /* renamed from: s  reason: collision with root package name */
    private final x00.e f27414s;

    /* renamed from: t  reason: collision with root package name */
    private final h f27415t;

    /* JADX WARN: Multi-variable type inference failed */
    public j(j20.n storageManager, w00.x moduleDescriptor, k configuration, g classDataFinder, c<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, ? extends y10.g<?>> annotationAndConstantLoader, w00.b0 packageFragmentProvider, u localClassifierTypeSettings, q errorReporter, d10.c lookupTracker, r flexibleTypeDeserializer, Iterable<? extends x00.b> fictitiousClassDescriptorFactories, w00.z notFoundClasses, i contractDeserializer, x00.a additionalClassPartsProvider, x00.c platformDependentDeclarationFilter, kotlin.reflect.jvm.internal.impl.protobuf.f extensionRegistryLite, kotlin.reflect.jvm.internal.impl.types.checker.m kotlinTypeChecker, c20.a samConversionResolver, x00.e platformDependentTypeTransformer) {
        kotlin.jvm.internal.s.g(storageManager, "storageManager");
        kotlin.jvm.internal.s.g(moduleDescriptor, "moduleDescriptor");
        kotlin.jvm.internal.s.g(configuration, "configuration");
        kotlin.jvm.internal.s.g(classDataFinder, "classDataFinder");
        kotlin.jvm.internal.s.g(annotationAndConstantLoader, "annotationAndConstantLoader");
        kotlin.jvm.internal.s.g(packageFragmentProvider, "packageFragmentProvider");
        kotlin.jvm.internal.s.g(localClassifierTypeSettings, "localClassifierTypeSettings");
        kotlin.jvm.internal.s.g(errorReporter, "errorReporter");
        kotlin.jvm.internal.s.g(lookupTracker, "lookupTracker");
        kotlin.jvm.internal.s.g(flexibleTypeDeserializer, "flexibleTypeDeserializer");
        kotlin.jvm.internal.s.g(fictitiousClassDescriptorFactories, "fictitiousClassDescriptorFactories");
        kotlin.jvm.internal.s.g(notFoundClasses, "notFoundClasses");
        kotlin.jvm.internal.s.g(contractDeserializer, "contractDeserializer");
        kotlin.jvm.internal.s.g(additionalClassPartsProvider, "additionalClassPartsProvider");
        kotlin.jvm.internal.s.g(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        kotlin.jvm.internal.s.g(extensionRegistryLite, "extensionRegistryLite");
        kotlin.jvm.internal.s.g(kotlinTypeChecker, "kotlinTypeChecker");
        kotlin.jvm.internal.s.g(samConversionResolver, "samConversionResolver");
        kotlin.jvm.internal.s.g(platformDependentTypeTransformer, "platformDependentTypeTransformer");
        this.f27396a = storageManager;
        this.f27397b = moduleDescriptor;
        this.f27398c = configuration;
        this.f27399d = classDataFinder;
        this.f27400e = annotationAndConstantLoader;
        this.f27401f = packageFragmentProvider;
        this.f27402g = localClassifierTypeSettings;
        this.f27403h = errorReporter;
        this.f27404i = lookupTracker;
        this.f27405j = flexibleTypeDeserializer;
        this.f27406k = fictitiousClassDescriptorFactories;
        this.f27407l = notFoundClasses;
        this.f27408m = contractDeserializer;
        this.f27409n = additionalClassPartsProvider;
        this.f27410o = platformDependentDeclarationFilter;
        this.f27411p = extensionRegistryLite;
        this.f27412q = kotlinTypeChecker;
        this.f27413r = samConversionResolver;
        this.f27414s = platformDependentTypeTransformer;
        this.f27415t = new h(this);
    }

    public final l a(w00.a0 descriptor, r10.c nameResolver, r10.g typeTable, r10.i versionRequirementTable, r10.a metadataVersion, i20.f fVar) {
        List i11;
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        kotlin.jvm.internal.s.g(nameResolver, "nameResolver");
        kotlin.jvm.internal.s.g(typeTable, "typeTable");
        kotlin.jvm.internal.s.g(versionRequirementTable, "versionRequirementTable");
        kotlin.jvm.internal.s.g(metadataVersion, "metadataVersion");
        i11 = wz.w.i();
        return new l(this, nameResolver, descriptor, typeTable, versionRequirementTable, metadataVersion, fVar, null, i11);
    }

    public final w00.c b(u10.b classId) {
        kotlin.jvm.internal.s.g(classId, "classId");
        return h.e(this.f27415t, classId, null, 2, null);
    }

    public final x00.a c() {
        return this.f27409n;
    }

    public final c<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, y10.g<?>> d() {
        return this.f27400e;
    }

    public final g e() {
        return this.f27399d;
    }

    public final h f() {
        return this.f27415t;
    }

    public final k g() {
        return this.f27398c;
    }

    public final i h() {
        return this.f27408m;
    }

    public final q i() {
        return this.f27403h;
    }

    public final kotlin.reflect.jvm.internal.impl.protobuf.f j() {
        return this.f27411p;
    }

    public final Iterable<x00.b> k() {
        return this.f27406k;
    }

    public final r l() {
        return this.f27405j;
    }

    public final kotlin.reflect.jvm.internal.impl.types.checker.m m() {
        return this.f27412q;
    }

    public final u n() {
        return this.f27402g;
    }

    public final d10.c o() {
        return this.f27404i;
    }

    public final w00.x p() {
        return this.f27397b;
    }

    public final w00.z q() {
        return this.f27407l;
    }

    public final w00.b0 r() {
        return this.f27401f;
    }

    public final x00.c s() {
        return this.f27410o;
    }

    public final x00.e t() {
        return this.f27414s;
    }

    public final j20.n u() {
        return this.f27396a;
    }

    public /* synthetic */ j(j20.n nVar, w00.x xVar, k kVar, g gVar, c cVar, w00.b0 b0Var, u uVar, q qVar, d10.c cVar2, r rVar, Iterable iterable, w00.z zVar, i iVar, x00.a aVar, x00.c cVar3, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, kotlin.reflect.jvm.internal.impl.types.checker.m mVar, c20.a aVar2, x00.e eVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, xVar, kVar, gVar, cVar, b0Var, uVar, qVar, cVar2, rVar, iterable, zVar, iVar, (i11 & PKIFailureInfo.certRevoked) != 0 ? a.C1295a.f56634a : aVar, (i11 & 16384) != 0 ? c.a.f56635a : cVar3, fVar, (65536 & i11) != 0 ? kotlin.reflect.jvm.internal.impl.types.checker.m.f35169b.a() : mVar, aVar2, (i11 & 262144) != 0 ? e.a.f56638a : eVar);
    }
}