package q00;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import q00.d0;
import w00.s0;

/* loaded from: classes5.dex */
public final class z implements n00.q, j {

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ n00.m[] f47289d = {kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(z.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};

    /* renamed from: a  reason: collision with root package name */
    private final d0.a f47290a;

    /* renamed from: b  reason: collision with root package name */
    private final a0 f47291b;

    /* renamed from: c  reason: collision with root package name */
    private final s0 f47292c;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<List<? extends x>> {
        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<? extends x> mo11invoke() {
            int t11;
            List<k20.d0> upperBounds = z.this.getDescriptor().getUpperBounds();
            kotlin.jvm.internal.s.f(upperBounds, "descriptor.upperBounds");
            t11 = wz.x.t(upperBounds, 10);
            ArrayList arrayList = new ArrayList(t11);
            for (k20.d0 d0Var : upperBounds) {
                arrayList.add(new x(d0Var, null, 2, null));
            }
            return arrayList;
        }
    }

    public z(a0 a0Var, s0 descriptor) {
        h<?> hVar;
        Object v02;
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        this.f47292c = descriptor;
        this.f47290a = d0.c(new a());
        if (a0Var == null) {
            w00.i mo223b = getDescriptor().mo223b();
            kotlin.jvm.internal.s.f(mo223b, "descriptor.containingDeclaration");
            if (mo223b instanceof w00.c) {
                v02 = d((w00.c) mo223b);
            } else if (mo223b instanceof kotlin.reflect.jvm.internal.impl.descriptors.b) {
                w00.i mo223b2 = ((kotlin.reflect.jvm.internal.impl.descriptors.b) mo223b).mo223b();
                kotlin.jvm.internal.s.f(mo223b2, "declaration.containingDeclaration");
                if (mo223b2 instanceof w00.c) {
                    hVar = d((w00.c) mo223b2);
                } else {
                    i20.g gVar = (i20.g) (!(mo223b instanceof i20.g) ? null : mo223b);
                    if (gVar != null) {
                        n00.d e11 = g00.a.e(b(gVar));
                        Objects.requireNonNull(e11, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                        hVar = (h) e11;
                    } else {
                        throw new b0("Non-class callable descriptor must be deserialized: " + mo223b);
                    }
                }
                v02 = mo223b.v0(new q00.a(hVar), vz.b0.f54756a);
            } else {
                throw new b0("Unknown type parameter container: " + mo223b);
            }
            kotlin.jvm.internal.s.f(v02, "when (val declaration = … $declaration\")\n        }");
            a0Var = (a0) v02;
        }
        this.f47291b = a0Var;
    }

    private final Class<?> b(i20.g gVar) {
        Class<?> d11;
        i20.f H = gVar.H();
        if (!(H instanceof n10.i)) {
            H = null;
        }
        n10.i iVar = (n10.i) H;
        n10.o f11 = iVar != null ? iVar.f() : null;
        a10.f fVar = f11 instanceof a10.f ? f11 : null;
        if (fVar == null || (d11 = fVar.d()) == null) {
            throw new b0("Container of deserialized member is not resolved: " + gVar);
        }
        return d11;
    }

    private final h<?> d(w00.c cVar) {
        Class<?> p11 = l0.p(cVar);
        h<?> hVar = (h) (p11 != null ? g00.a.e(p11) : null);
        if (hVar != null) {
            return hVar;
        }
        throw new b0("Type parameter container is not resolved: " + cVar.mo223b());
    }

    @Override // q00.j
    /* renamed from: c */
    public s0 mo211getDescriptor() {
        return this.f47292c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (kotlin.jvm.internal.s.c(this.f47291b, zVar.f47291b) && kotlin.jvm.internal.s.c(getName(), zVar.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // n00.q
    public String getName() {
        String b11 = getDescriptor().getName().b();
        kotlin.jvm.internal.s.f(b11, "descriptor.name.asString()");
        return b11;
    }

    @Override // n00.q
    public List<n00.p> getUpperBounds() {
        return (List) this.f47290a.b(this, f47289d[0]);
    }

    public int hashCode() {
        return (this.f47291b.hashCode() * 31) + getName().hashCode();
    }

    @Override // n00.q
    public n00.s k() {
        int i11 = y.f47288a[getDescriptor().k().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return n00.s.OUT;
                }
                throw new NoWhenBranchMatchedException();
            }
            return n00.s.IN;
        }
        return n00.s.INVARIANT;
    }

    public String toString() {
        return kotlin.jvm.internal.s0.f34923a.a(this);
    }
}