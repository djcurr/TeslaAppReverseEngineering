package i20;

import i20.b;
import i20.g;
import java.util.List;
import kotlin.jvm.internal.s;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import vz.b0;
import w00.i0;
import w00.k0;
import w00.n0;
import w00.q;
import w00.r;
import y00.c0;
import y00.d0;

/* loaded from: classes5.dex */
public final class j extends c0 implements b {
    private final p10.n F;
    private final r10.c G;
    private final r10.g H;
    private final r10.i K;
    private final f L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(w00.i containingDeclaration, i0 i0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations, kotlin.reflect.jvm.internal.impl.descriptors.f modality, q visibility, boolean z11, u10.f name, b.a kind, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, p10.n proto, r10.c nameResolver, r10.g typeTable, r10.i versionRequirementTable, f fVar) {
        super(containingDeclaration, i0Var, annotations, modality, visibility, z11, name, kind, n0.f55303a, z12, z13, z16, false, z14, z15);
        s.g(containingDeclaration, "containingDeclaration");
        s.g(annotations, "annotations");
        s.g(modality, "modality");
        s.g(visibility, "visibility");
        s.g(name, "name");
        s.g(kind, "kind");
        s.g(proto, "proto");
        s.g(nameResolver, "nameResolver");
        s.g(typeTable, "typeTable");
        s.g(versionRequirementTable, "versionRequirementTable");
        this.F = proto;
        this.G = nameResolver;
        this.H = typeTable;
        this.K = versionRequirementTable;
        this.L = fVar;
        g.a aVar = g.a.COMPATIBLE;
    }

    @Override // i20.g
    public r10.g C() {
        return this.H;
    }

    @Override // i20.g
    public List<r10.h> D0() {
        return b.a.a(this);
    }

    @Override // i20.g
    public r10.i F() {
        return this.K;
    }

    @Override // i20.g
    public r10.c G() {
        return this.G;
    }

    @Override // i20.g
    public f H() {
        return this.L;
    }

    @Override // y00.c0
    protected c0 K0(w00.i newOwner, kotlin.reflect.jvm.internal.impl.descriptors.f newModality, q newVisibility, i0 i0Var, b.a kind, u10.f newName, n0 source) {
        s.g(newOwner, "newOwner");
        s.g(newModality, "newModality");
        s.g(newVisibility, "newVisibility");
        s.g(kind, "kind");
        s.g(newName, "newName");
        s.g(source, "source");
        return new j(newOwner, i0Var, getAnnotations(), newModality, newVisibility, L(), newName, kind, s0(), isConst(), isExternal(), z(), g0(), b0(), G(), C(), F(), H());
    }

    @Override // i20.g
    /* renamed from: X0 */
    public p10.n b0() {
        return this.F;
    }

    public final void Y0(d0 d0Var, k0 k0Var, r rVar, r rVar2, g.a isExperimentalCoroutineInReleaseEnvironment) {
        s.g(isExperimentalCoroutineInReleaseEnvironment, "isExperimentalCoroutineInReleaseEnvironment");
        super.Q0(d0Var, k0Var, rVar, rVar2);
        b0 b0Var = b0.f54756a;
    }

    @Override // y00.c0, w00.u
    public boolean isExternal() {
        Boolean d11 = r10.b.D.d(b0().N());
        s.f(d11, "IS_EXTERNAL_PROPERTY.get(proto.flags)");
        return d11.booleanValue();
    }
}