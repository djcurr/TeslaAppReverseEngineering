package y00;

import java.util.List;
import java.util.Objects;
import k20.d1;
import k20.k1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import w00.r0;
import w00.v0;

/* loaded from: classes5.dex */
public final class j0 extends p implements i0 {
    private final j20.n K;
    private final r0 L;
    private w00.b O;
    static final /* synthetic */ KProperty<Object>[] Q = {kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(j0.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};
    public static final a P = new a(null);

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final d1 c(r0 r0Var) {
            if (r0Var.q() == null) {
                return null;
            }
            return d1.f(r0Var.E());
        }

        public final i0 b(j20.n storageManager, r0 typeAliasDescriptor, w00.b constructor) {
            w00.b mo156c;
            kotlin.jvm.internal.s.g(storageManager, "storageManager");
            kotlin.jvm.internal.s.g(typeAliasDescriptor, "typeAliasDescriptor");
            kotlin.jvm.internal.s.g(constructor, "constructor");
            d1 c11 = c(typeAliasDescriptor);
            if (c11 == null || (mo156c = constructor.mo156c(c11)) == null) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g mo140getAnnotations = constructor.mo140getAnnotations();
            b.a kind = constructor.getKind();
            kotlin.jvm.internal.s.f(kind, "constructor.kind");
            w00.n0 f11 = typeAliasDescriptor.f();
            kotlin.jvm.internal.s.f(f11, "typeAliasDescriptor.source");
            j0 j0Var = new j0(storageManager, typeAliasDescriptor, mo156c, null, mo140getAnnotations, kind, f11, null);
            List<v0> K0 = p.K0(j0Var, constructor.h(), c11);
            if (K0 == null) {
                return null;
            }
            k20.k0 c12 = k20.a0.c(mo156c.getReturnType().K0());
            k20.k0 n11 = typeAliasDescriptor.n();
            kotlin.jvm.internal.s.f(n11, "typeAliasDescriptor.defaultType");
            k20.k0 j11 = k20.n0.j(c12, n11);
            w00.l0 J = constructor.J();
            j0Var.N0(J != null ? w10.c.f(j0Var, c11.n(J.getType(), k1.INVARIANT), kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b()) : null, null, typeAliasDescriptor.o(), K0, j11, kotlin.reflect.jvm.internal.impl.descriptors.f.FINAL, typeAliasDescriptor.getVisibility());
            return j0Var;
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.a<j0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ w00.b f58818b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(w00.b bVar) {
            super(0);
            this.f58818b = bVar;
        }

        @Override // h00.a
        /* renamed from: a */
        public final j0 mo11invoke() {
            j20.n K = j0.this.K();
            r0 k12 = j0.this.k1();
            w00.b bVar = this.f58818b;
            j0 j0Var = j0.this;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g mo140getAnnotations = bVar.mo140getAnnotations();
            b.a kind = this.f58818b.getKind();
            kotlin.jvm.internal.s.f(kind, "underlyingConstructorDescriptor.kind");
            w00.n0 f11 = j0.this.k1().f();
            kotlin.jvm.internal.s.f(f11, "typeAliasDescriptor.source");
            j0 j0Var2 = new j0(K, k12, bVar, j0Var, mo140getAnnotations, kind, f11, null);
            j0 j0Var3 = j0.this;
            w00.b bVar2 = this.f58818b;
            d1 c11 = j0.P.c(j0Var3.k1());
            if (c11 == null) {
                return null;
            }
            w00.l0 J = bVar2.J();
            j0Var2.N0(null, J == null ? null : J.mo156c(c11), j0Var3.k1().o(), j0Var3.h(), j0Var3.getReturnType(), kotlin.reflect.jvm.internal.impl.descriptors.f.FINAL, j0Var3.k1().getVisibility());
            return j0Var2;
        }
    }

    private j0(j20.n nVar, r0 r0Var, w00.b bVar, i0 i0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, b.a aVar, w00.n0 n0Var) {
        super(r0Var, i0Var, gVar, u10.f.i("<init>"), aVar, n0Var);
        this.K = nVar;
        this.L = r0Var;
        R0(k1().W());
        nVar.i(new b(bVar));
        this.O = bVar;
    }

    public /* synthetic */ j0(j20.n nVar, r0 r0Var, w00.b bVar, i0 i0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, b.a aVar, w00.n0 n0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, r0Var, bVar, i0Var, gVar, aVar, n0Var);
    }

    public final j20.n K() {
        return this.K;
    }

    @Override // y00.i0
    public w00.b Q() {
        return this.O;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean Y() {
        return Q().Y();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public w00.c Z() {
        w00.c Z = Q().Z();
        kotlin.jvm.internal.s.f(Z, "underlyingConstructorDescriptor.constructedClass");
        return Z;
    }

    @Override // y00.p, kotlin.reflect.jvm.internal.impl.descriptors.b
    /* renamed from: g1 */
    public i0 mo164z0(w00.i newOwner, kotlin.reflect.jvm.internal.impl.descriptors.f modality, w00.q visibility, b.a kind, boolean z11) {
        kotlin.jvm.internal.s.g(newOwner, "newOwner");
        kotlin.jvm.internal.s.g(modality, "modality");
        kotlin.jvm.internal.s.g(visibility, "visibility");
        kotlin.jvm.internal.s.g(kind, "kind");
        kotlin.reflect.jvm.internal.impl.descriptors.e build = s().mo245f(newOwner).mo247h(modality).mo241b(visibility).mo256q(kind).mo250k(z11).build();
        Objects.requireNonNull(build, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (i0) build;
    }

    @Override // y00.p, kotlin.reflect.jvm.internal.impl.descriptors.a
    public k20.d0 getReturnType() {
        k20.d0 returnType = super.getReturnType();
        kotlin.jvm.internal.s.e(returnType);
        kotlin.jvm.internal.s.f(returnType, "super.getReturnType()!!");
        return returnType;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y00.p
    /* renamed from: h1 */
    public j0 H0(w00.i newOwner, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, b.a kind, u10.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations, w00.n0 source) {
        kotlin.jvm.internal.s.g(newOwner, "newOwner");
        kotlin.jvm.internal.s.g(kind, "kind");
        kotlin.jvm.internal.s.g(annotations, "annotations");
        kotlin.jvm.internal.s.g(source, "source");
        b.a aVar = b.a.DECLARATION;
        if (kind != aVar) {
            b.a aVar2 = b.a.SYNTHESIZED;
        }
        return new j0(this.K, k1(), Q(), this, annotations, aVar, source);
    }

    @Override // y00.k, w00.i
    /* renamed from: i1 */
    public r0 mo223b() {
        return k1();
    }

    @Override // y00.p, y00.k
    /* renamed from: j1 */
    public i0 mo238d0() {
        return (i0) super.d0();
    }

    public r0 k1() {
        return this.L;
    }

    @Override // y00.p, w00.p0
    /* renamed from: l1 */
    public i0 mo156c(d1 substitutor) {
        kotlin.jvm.internal.s.g(substitutor, "substitutor");
        kotlin.reflect.jvm.internal.impl.descriptors.e mo156c = super.mo156c(substitutor);
        Objects.requireNonNull(mo156c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        j0 j0Var = (j0) mo156c;
        d1 f11 = d1.f(j0Var.getReturnType());
        kotlin.jvm.internal.s.f(f11, "create(substitutedTypeAliasConstructor.returnType)");
        w00.b mo156c2 = Q().a().mo156c(f11);
        if (mo156c2 == null) {
            return null;
        }
        j0Var.O = mo156c2;
        return j0Var;
    }
}