package i20;

import i20.b;
import i20.g;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import w00.n0;

/* loaded from: classes5.dex */
public final class c extends y00.f implements b {
    private final p10.d O;
    private final r10.c P;
    private final r10.g Q;
    private final r10.i R;
    private final f T;
    private g.a Y;

    public /* synthetic */ c(w00.c cVar, kotlin.reflect.jvm.internal.impl.descriptors.d dVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z11, b.a aVar, p10.d dVar2, r10.c cVar2, r10.g gVar2, r10.i iVar, f fVar, n0 n0Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, dVar, gVar, z11, aVar, dVar2, cVar2, gVar2, iVar, fVar, (i11 & 1024) != 0 ? null : n0Var);
    }

    @Override // y00.p, kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean A() {
        return false;
    }

    @Override // i20.g
    public r10.g C() {
        return this.Q;
    }

    @Override // i20.g
    public List<r10.h> D0() {
        return b.a.a(this);
    }

    @Override // i20.g
    public r10.i F() {
        return this.R;
    }

    @Override // i20.g
    public r10.c G() {
        return this.P;
    }

    @Override // i20.g
    public f H() {
        return this.T;
    }

    @Override // y00.p, w00.u
    public boolean isExternal() {
        return false;
    }

    @Override // y00.p, kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean isInline() {
        return false;
    }

    @Override // y00.p, kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean isSuspend() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y00.f
    /* renamed from: n1 */
    public c j1(w00.i newOwner, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, b.a kind, u10.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations, n0 source) {
        s.g(newOwner, "newOwner");
        s.g(kind, "kind");
        s.g(annotations, "annotations");
        s.g(source, "source");
        c cVar = new c((w00.c) newOwner, (kotlin.reflect.jvm.internal.impl.descriptors.d) eVar, annotations, this.K, kind, b0(), G(), C(), F(), H(), source);
        cVar.U0(M0());
        cVar.q1(o1());
        return cVar;
    }

    public g.a o1() {
        return this.Y;
    }

    @Override // i20.g
    /* renamed from: p1 */
    public p10.d b0() {
        return this.O;
    }

    public void q1(g.a aVar) {
        s.g(aVar, "<set-?>");
        this.Y = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(w00.c containingDeclaration, kotlin.reflect.jvm.internal.impl.descriptors.d dVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations, boolean z11, b.a kind, p10.d proto, r10.c nameResolver, r10.g typeTable, r10.i versionRequirementTable, f fVar, n0 n0Var) {
        super(containingDeclaration, dVar, annotations, z11, kind, n0Var == null ? n0.f55303a : n0Var);
        s.g(containingDeclaration, "containingDeclaration");
        s.g(annotations, "annotations");
        s.g(kind, "kind");
        s.g(proto, "proto");
        s.g(nameResolver, "nameResolver");
        s.g(typeTable, "typeTable");
        s.g(versionRequirementTable, "versionRequirementTable");
        this.O = proto;
        this.P = nameResolver;
        this.Q = typeTable;
        this.R = versionRequirementTable;
        this.T = fVar;
        this.Y = g.a.COMPATIBLE;
    }
}