package g20;

import ch.qos.logback.core.CoreConstants;
import java.util.List;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final j f27417a;

    /* renamed from: b  reason: collision with root package name */
    private final r10.c f27418b;

    /* renamed from: c  reason: collision with root package name */
    private final w00.i f27419c;

    /* renamed from: d  reason: collision with root package name */
    private final r10.g f27420d;

    /* renamed from: e  reason: collision with root package name */
    private final r10.i f27421e;

    /* renamed from: f  reason: collision with root package name */
    private final r10.a f27422f;

    /* renamed from: g  reason: collision with root package name */
    private final i20.f f27423g;

    /* renamed from: h  reason: collision with root package name */
    private final c0 f27424h;

    /* renamed from: i  reason: collision with root package name */
    private final v f27425i;

    public l(j components, r10.c nameResolver, w00.i containingDeclaration, r10.g typeTable, r10.i versionRequirementTable, r10.a metadataVersion, i20.f fVar, c0 c0Var, List<p10.s> typeParameters) {
        String a11;
        kotlin.jvm.internal.s.g(components, "components");
        kotlin.jvm.internal.s.g(nameResolver, "nameResolver");
        kotlin.jvm.internal.s.g(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.s.g(typeTable, "typeTable");
        kotlin.jvm.internal.s.g(versionRequirementTable, "versionRequirementTable");
        kotlin.jvm.internal.s.g(metadataVersion, "metadataVersion");
        kotlin.jvm.internal.s.g(typeParameters, "typeParameters");
        this.f27417a = components;
        this.f27418b = nameResolver;
        this.f27419c = containingDeclaration;
        this.f27420d = typeTable;
        this.f27421e = versionRequirementTable;
        this.f27422f = metadataVersion;
        this.f27423g = fVar;
        this.f27424h = new c0(this, c0Var, typeParameters, "Deserializer for \"" + containingDeclaration.getName() + CoreConstants.DOUBLE_QUOTE_CHAR, (fVar == null || (a11 = fVar.a()) == null) ? "[container not found]" : a11, false, 32, null);
        this.f27425i = new v(this);
    }

    public static /* synthetic */ l b(l lVar, w00.i iVar, List list, r10.c cVar, r10.g gVar, r10.i iVar2, r10.a aVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            cVar = lVar.f27418b;
        }
        r10.c cVar2 = cVar;
        if ((i11 & 8) != 0) {
            gVar = lVar.f27420d;
        }
        r10.g gVar2 = gVar;
        if ((i11 & 16) != 0) {
            iVar2 = lVar.f27421e;
        }
        r10.i iVar3 = iVar2;
        if ((i11 & 32) != 0) {
            aVar = lVar.f27422f;
        }
        return lVar.a(iVar, list, cVar2, gVar2, iVar3, aVar);
    }

    public final l a(w00.i descriptor, List<p10.s> typeParameterProtos, r10.c nameResolver, r10.g typeTable, r10.i iVar, r10.a metadataVersion) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        kotlin.jvm.internal.s.g(typeParameterProtos, "typeParameterProtos");
        kotlin.jvm.internal.s.g(nameResolver, "nameResolver");
        kotlin.jvm.internal.s.g(typeTable, "typeTable");
        r10.i versionRequirementTable = iVar;
        kotlin.jvm.internal.s.g(versionRequirementTable, "versionRequirementTable");
        kotlin.jvm.internal.s.g(metadataVersion, "metadataVersion");
        j jVar = this.f27417a;
        if (!r10.j.b(metadataVersion)) {
            versionRequirementTable = this.f27421e;
        }
        return new l(jVar, nameResolver, descriptor, typeTable, versionRequirementTable, metadataVersion, this.f27423g, this.f27424h, typeParameterProtos);
    }

    public final j c() {
        return this.f27417a;
    }

    public final i20.f d() {
        return this.f27423g;
    }

    public final w00.i e() {
        return this.f27419c;
    }

    public final v f() {
        return this.f27425i;
    }

    public final r10.c g() {
        return this.f27418b;
    }

    public final j20.n h() {
        return this.f27417a.u();
    }

    public final c0 i() {
        return this.f27424h;
    }

    public final r10.g j() {
        return this.f27420d;
    }

    public final r10.i k() {
        return this.f27421e;
    }
}