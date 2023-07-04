package y00;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import k20.d1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w00.v0;
import w00.w0;

/* loaded from: classes5.dex */
public class l0 extends m0 implements v0 {

    /* renamed from: l  reason: collision with root package name */
    public static final a f58824l = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private final int f58825f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f58826g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f58827h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f58828i;

    /* renamed from: j  reason: collision with root package name */
    private final k20.d0 f58829j;

    /* renamed from: k  reason: collision with root package name */
    private final v0 f58830k;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l0 a(kotlin.reflect.jvm.internal.impl.descriptors.a containingDeclaration, v0 v0Var, int i11, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations, u10.f name, k20.d0 outType, boolean z11, boolean z12, boolean z13, k20.d0 d0Var, w00.n0 source, h00.a<? extends List<? extends w0>> aVar) {
            kotlin.jvm.internal.s.g(containingDeclaration, "containingDeclaration");
            kotlin.jvm.internal.s.g(annotations, "annotations");
            kotlin.jvm.internal.s.g(name, "name");
            kotlin.jvm.internal.s.g(outType, "outType");
            kotlin.jvm.internal.s.g(source, "source");
            if (aVar == null) {
                return new l0(containingDeclaration, v0Var, i11, annotations, name, outType, z11, z12, z13, d0Var, source);
            }
            return new b(containingDeclaration, v0Var, i11, annotations, name, outType, z11, z12, z13, d0Var, source, aVar);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends l0 {

        /* renamed from: m  reason: collision with root package name */
        private final vz.k f58831m;

        /* loaded from: classes5.dex */
        static final class a extends kotlin.jvm.internal.u implements h00.a<List<? extends w0>> {
            a() {
                super(0);
            }

            @Override // h00.a
            public final List<? extends w0> invoke() {
                return b.this.J0();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.reflect.jvm.internal.impl.descriptors.a containingDeclaration, v0 v0Var, int i11, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations, u10.f name, k20.d0 outType, boolean z11, boolean z12, boolean z13, k20.d0 d0Var, w00.n0 source, h00.a<? extends List<? extends w0>> destructuringVariables) {
            super(containingDeclaration, v0Var, i11, annotations, name, outType, z11, z12, z13, d0Var, source);
            vz.k a11;
            kotlin.jvm.internal.s.g(containingDeclaration, "containingDeclaration");
            kotlin.jvm.internal.s.g(annotations, "annotations");
            kotlin.jvm.internal.s.g(name, "name");
            kotlin.jvm.internal.s.g(outType, "outType");
            kotlin.jvm.internal.s.g(source, "source");
            kotlin.jvm.internal.s.g(destructuringVariables, "destructuringVariables");
            a11 = vz.m.a(destructuringVariables);
            this.f58831m = a11;
        }

        @Override // y00.l0, w00.v0
        public v0 B0(kotlin.reflect.jvm.internal.impl.descriptors.a newOwner, u10.f newName, int i11) {
            kotlin.jvm.internal.s.g(newOwner, "newOwner");
            kotlin.jvm.internal.s.g(newName, "newName");
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = getAnnotations();
            kotlin.jvm.internal.s.f(annotations, "annotations");
            k20.d0 type = getType();
            kotlin.jvm.internal.s.f(type, "type");
            boolean u02 = u0();
            boolean m02 = m0();
            boolean k02 = k0();
            k20.d0 q02 = q0();
            w00.n0 NO_SOURCE = w00.n0.f55303a;
            kotlin.jvm.internal.s.f(NO_SOURCE, "NO_SOURCE");
            return new b(newOwner, null, i11, annotations, newName, type, u02, m02, k02, q02, NO_SOURCE, new a());
        }

        public final List<w0> J0() {
            return (List) this.f58831m.getValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(kotlin.reflect.jvm.internal.impl.descriptors.a containingDeclaration, v0 v0Var, int i11, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations, u10.f name, k20.d0 outType, boolean z11, boolean z12, boolean z13, k20.d0 d0Var, w00.n0 source) {
        super(containingDeclaration, annotations, name, outType, source);
        kotlin.jvm.internal.s.g(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.s.g(annotations, "annotations");
        kotlin.jvm.internal.s.g(name, "name");
        kotlin.jvm.internal.s.g(outType, "outType");
        kotlin.jvm.internal.s.g(source, "source");
        this.f58825f = i11;
        this.f58826g = z11;
        this.f58827h = z12;
        this.f58828i = z13;
        this.f58829j = d0Var;
        this.f58830k = v0Var == null ? this : v0Var;
    }

    public static final l0 G0(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, v0 v0Var, int i11, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, u10.f fVar, k20.d0 d0Var, boolean z11, boolean z12, boolean z13, k20.d0 d0Var2, w00.n0 n0Var, h00.a<? extends List<? extends w0>> aVar2) {
        return f58824l.a(aVar, v0Var, i11, gVar, fVar, d0Var, z11, z12, z13, d0Var2, n0Var, aVar2);
    }

    @Override // w00.v0
    public v0 B0(kotlin.reflect.jvm.internal.impl.descriptors.a newOwner, u10.f newName, int i11) {
        kotlin.jvm.internal.s.g(newOwner, "newOwner");
        kotlin.jvm.internal.s.g(newName, "newName");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = getAnnotations();
        kotlin.jvm.internal.s.f(annotations, "annotations");
        k20.d0 type = getType();
        kotlin.jvm.internal.s.f(type, "type");
        boolean u02 = u0();
        boolean m02 = m0();
        boolean k02 = k0();
        k20.d0 q02 = q0();
        w00.n0 NO_SOURCE = w00.n0.f55303a;
        kotlin.jvm.internal.s.f(NO_SOURCE, "NO_SOURCE");
        return new l0(newOwner, null, i11, annotations, newName, type, u02, m02, k02, q02, NO_SOURCE);
    }

    public Void H0() {
        return null;
    }

    @Override // w00.p0
    /* renamed from: I0 */
    public v0 c(d1 substitutor) {
        kotlin.jvm.internal.s.g(substitutor, "substitutor");
        if (substitutor.k()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // w00.w0
    public boolean L() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public Collection<v0> d() {
        int t11;
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.a> d11 = b().d();
        kotlin.jvm.internal.s.f(d11, "containingDeclaration.overriddenDescriptors");
        t11 = wz.x.t(d11, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (kotlin.reflect.jvm.internal.impl.descriptors.a aVar : d11) {
            arrayList.add(aVar.h().get(getIndex()));
        }
        return arrayList;
    }

    @Override // w00.v0
    public int getIndex() {
        return this.f58825f;
    }

    @Override // w00.m, w00.u
    public w00.q getVisibility() {
        w00.q LOCAL = w00.p.f55310f;
        kotlin.jvm.internal.s.f(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override // w00.w0
    public /* bridge */ /* synthetic */ y10.g j0() {
        return (y10.g) H0();
    }

    @Override // w00.v0
    public boolean k0() {
        return this.f58828i;
    }

    @Override // w00.v0
    public boolean m0() {
        return this.f58827h;
    }

    @Override // w00.v0
    public k20.d0 q0() {
        return this.f58829j;
    }

    @Override // w00.v0
    public boolean u0() {
        return this.f58826g && ((kotlin.reflect.jvm.internal.impl.descriptors.b) b()).getKind().isReal();
    }

    @Override // w00.i
    public <R, D> R v0(w00.k<R, D> visitor, D d11) {
        kotlin.jvm.internal.s.g(visitor, "visitor");
        return visitor.b(this, d11);
    }

    @Override // y00.k, w00.i
    public kotlin.reflect.jvm.internal.impl.descriptors.a b() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.a) super.b();
    }

    @Override // y00.k
    /* renamed from: a */
    public v0 d0() {
        v0 v0Var = this.f58830k;
        return v0Var == this ? this : v0Var.a();
    }
}