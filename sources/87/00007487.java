package i20;

import i20.b;
import i20.g;
import java.util.List;
import java.util.Map;
import k20.d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import w00.l0;
import w00.n0;
import w00.q;
import w00.s0;
import w00.v0;
import y00.g0;
import y00.p;

/* loaded from: classes5.dex */
public final class k extends g0 implements b {
    private final p10.i K;
    private final r10.c L;
    private final r10.g O;
    private final r10.i P;
    private final f Q;
    private g.a R;

    public /* synthetic */ k(w00.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.h hVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, u10.f fVar, b.a aVar, p10.i iVar2, r10.c cVar, r10.g gVar2, r10.i iVar3, f fVar2, n0 n0Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, hVar, gVar, fVar, aVar, iVar2, cVar, gVar2, iVar3, fVar2, (i11 & 1024) != 0 ? null : n0Var);
    }

    @Override // i20.g
    public r10.g C() {
        return this.O;
    }

    @Override // i20.g
    public List<r10.h> D0() {
        return b.a.a(this);
    }

    @Override // i20.g
    public r10.i F() {
        return this.P;
    }

    @Override // i20.g
    public r10.c G() {
        return this.L;
    }

    @Override // i20.g
    public f H() {
        return this.Q;
    }

    @Override // y00.g0, y00.p
    protected p H0(w00.i newOwner, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, b.a kind, u10.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations, n0 source) {
        u10.f fVar2;
        s.g(newOwner, "newOwner");
        s.g(kind, "kind");
        s.g(annotations, "annotations");
        s.g(source, "source");
        kotlin.reflect.jvm.internal.impl.descriptors.h hVar = (kotlin.reflect.jvm.internal.impl.descriptors.h) eVar;
        if (fVar == null) {
            u10.f name = getName();
            s.f(name, "name");
            fVar2 = name;
        } else {
            fVar2 = fVar;
        }
        k kVar = new k(newOwner, hVar, annotations, fVar2, kind, b0(), G(), C(), F(), H(), source);
        kVar.U0(M0());
        kVar.R = l1();
        return kVar;
    }

    public g.a l1() {
        return this.R;
    }

    @Override // i20.g
    /* renamed from: m1 */
    public p10.i b0() {
        return this.K;
    }

    public final g0 n1(l0 l0Var, l0 l0Var2, List<? extends s0> typeParameters, List<? extends v0> unsubstitutedValueParameters, d0 d0Var, kotlin.reflect.jvm.internal.impl.descriptors.f fVar, q visibility, Map<? extends a.InterfaceC0649a<?>, ?> userDataMap, g.a isExperimentalCoroutineInReleaseEnvironment) {
        s.g(typeParameters, "typeParameters");
        s.g(unsubstitutedValueParameters, "unsubstitutedValueParameters");
        s.g(visibility, "visibility");
        s.g(userDataMap, "userDataMap");
        s.g(isExperimentalCoroutineInReleaseEnvironment, "isExperimentalCoroutineInReleaseEnvironment");
        g0 k12 = super.k1(l0Var, l0Var2, typeParameters, unsubstitutedValueParameters, d0Var, fVar, visibility, userDataMap);
        s.f(k12, "super.initialize(\n      …    userDataMap\n        )");
        this.R = isExperimentalCoroutineInReleaseEnvironment;
        return k12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(w00.i containingDeclaration, kotlin.reflect.jvm.internal.impl.descriptors.h hVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations, u10.f name, b.a kind, p10.i proto, r10.c nameResolver, r10.g typeTable, r10.i versionRequirementTable, f fVar, n0 n0Var) {
        super(containingDeclaration, hVar, annotations, name, kind, n0Var == null ? n0.f55303a : n0Var);
        s.g(containingDeclaration, "containingDeclaration");
        s.g(annotations, "annotations");
        s.g(name, "name");
        s.g(kind, "kind");
        s.g(proto, "proto");
        s.g(nameResolver, "nameResolver");
        s.g(typeTable, "typeTable");
        s.g(versionRequirementTable, "versionRequirementTable");
        this.K = proto;
        this.L = nameResolver;
        this.O = typeTable;
        this.P = versionRequirementTable;
        this.Q = fVar;
        this.R = g.a.COMPATIBLE;
    }
}