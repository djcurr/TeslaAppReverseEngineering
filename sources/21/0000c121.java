package y00;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import k20.k1;
import k20.w0;
import w00.q0;
import w00.s0;

/* loaded from: classes5.dex */
public abstract class e extends k implements s0 {

    /* renamed from: e  reason: collision with root package name */
    private final k1 f58785e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f58786f;

    /* renamed from: g  reason: collision with root package name */
    private final int f58787g;

    /* renamed from: h  reason: collision with root package name */
    private final j20.i<w0> f58788h;

    /* renamed from: i  reason: collision with root package name */
    private final j20.i<k20.k0> f58789i;

    /* renamed from: j  reason: collision with root package name */
    private final j20.n f58790j;

    /* loaded from: classes5.dex */
    class a implements h00.a<w0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j20.n f58791a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q0 f58792b;

        a(j20.n nVar, q0 q0Var) {
            this.f58791a = nVar;
            this.f58792b = q0Var;
        }

        @Override // h00.a
        /* renamed from: a */
        public w0 invoke() {
            return new c(e.this, this.f58791a, this.f58792b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class b implements h00.a<k20.k0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u10.f f58794a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public class a implements h00.a<d20.h> {
            a() {
            }

            @Override // h00.a
            /* renamed from: a */
            public d20.h invoke() {
                return d20.n.j("Scope for type parameter " + b.this.f58794a.b(), e.this.getUpperBounds());
            }
        }

        b(u10.f fVar) {
            this.f58794a = fVar;
        }

        @Override // h00.a
        /* renamed from: a */
        public k20.k0 invoke() {
            return k20.e0.j(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b(), e.this.i(), Collections.emptyList(), false, new d20.g(new a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class c extends k20.h {

        /* renamed from: d  reason: collision with root package name */
        private final q0 f58797d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f58798e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e eVar, j20.n nVar, q0 q0Var) {
            super(nVar);
            if (nVar == null) {
                t(0);
            }
            this.f58798e = eVar;
            this.f58797d = q0Var;
        }

        private static /* synthetic */ void t(int i11) {
            String str = (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5 || i11 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5 || i11 == 8) ? 2 : 3];
            switch (i11) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i11 == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i11 == 2) {
                objArr[1] = "getParameters";
            } else if (i11 == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i11 == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i11 == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i11 != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i11) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4 && i11 != 5 && i11 != 8) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @Override // k20.k
        protected boolean d(w00.e eVar) {
            if (eVar == null) {
                t(9);
            }
            return (eVar instanceof s0) && w10.b.f55369a.f(this.f58798e, (s0) eVar, true);
        }

        @Override // k20.h
        protected Collection<k20.d0> g() {
            List<k20.d0> H0 = this.f58798e.H0();
            if (H0 == null) {
                t(1);
            }
            return H0;
        }

        @Override // k20.w0
        public List<s0> getParameters() {
            List<s0> emptyList = Collections.emptyList();
            if (emptyList == null) {
                t(2);
            }
            return emptyList;
        }

        @Override // k20.h
        protected k20.d0 h() {
            return k20.v.j("Cyclic upper bounds");
        }

        @Override // k20.h
        protected q0 k() {
            q0 q0Var = this.f58797d;
            if (q0Var == null) {
                t(5);
            }
            return q0Var;
        }

        @Override // k20.w0
        public t00.h l() {
            t00.h g11 = a20.a.g(this.f58798e);
            if (g11 == null) {
                t(4);
            }
            return g11;
        }

        @Override // k20.k, k20.w0
        public w00.e n() {
            e eVar = this.f58798e;
            if (eVar == null) {
                t(3);
            }
            return eVar;
        }

        @Override // k20.w0
        public boolean o() {
            return true;
        }

        @Override // k20.h
        protected List<k20.d0> q(List<k20.d0> list) {
            if (list == null) {
                t(7);
            }
            List<k20.d0> F0 = this.f58798e.F0(list);
            if (F0 == null) {
                t(8);
            }
            return F0;
        }

        @Override // k20.h
        protected void s(k20.d0 d0Var) {
            if (d0Var == null) {
                t(6);
            }
            this.f58798e.G0(d0Var);
        }

        public String toString() {
            return this.f58798e.getName().toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j20.n nVar, w00.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, u10.f fVar, k1 k1Var, boolean z11, int i11, w00.n0 n0Var, q0 q0Var) {
        super(iVar, gVar, fVar, n0Var);
        if (nVar == null) {
            w(0);
        }
        if (iVar == null) {
            w(1);
        }
        if (gVar == null) {
            w(2);
        }
        if (fVar == null) {
            w(3);
        }
        if (k1Var == null) {
            w(4);
        }
        if (n0Var == null) {
            w(5);
        }
        if (q0Var == null) {
            w(6);
        }
        this.f58785e = k1Var;
        this.f58786f = z11;
        this.f58787g = i11;
        this.f58788h = nVar.b(new a(nVar, q0Var));
        this.f58789i = nVar.b(new b(fVar));
        this.f58790j = nVar;
    }

    private static /* synthetic */ void w(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i12 = 2;
                break;
            case 12:
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i11) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i11) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    protected List<k20.d0> F0(List<k20.d0> list) {
        if (list == null) {
            w(12);
        }
        if (list == null) {
            w(13);
        }
        return list;
    }

    protected abstract void G0(k20.d0 d0Var);

    protected abstract List<k20.d0> H0();

    @Override // w00.s0
    public j20.n K() {
        j20.n nVar = this.f58790j;
        if (nVar == null) {
            w(14);
        }
        return nVar;
    }

    @Override // w00.s0
    public boolean P() {
        return false;
    }

    @Override // w00.s0
    public int getIndex() {
        return this.f58787g;
    }

    @Override // w00.s0
    public List<k20.d0> getUpperBounds() {
        List<k20.d0> a11 = ((c) i()).a();
        if (a11 == null) {
            w(8);
        }
        return a11;
    }

    @Override // w00.s0, w00.e
    public final w0 i() {
        w0 invoke = this.f58788h.invoke();
        if (invoke == null) {
            w(9);
        }
        return invoke;
    }

    @Override // w00.s0
    public k1 k() {
        k1 k1Var = this.f58785e;
        if (k1Var == null) {
            w(7);
        }
        return k1Var;
    }

    @Override // w00.e
    public k20.k0 n() {
        k20.k0 invoke = this.f58789i.invoke();
        if (invoke == null) {
            w(10);
        }
        return invoke;
    }

    @Override // w00.s0
    public boolean v() {
        return this.f58786f;
    }

    @Override // w00.i
    public <R, D> R v0(w00.k<R, D> kVar, D d11) {
        return kVar.c(this, d11);
    }

    @Override // y00.k
    /* renamed from: a */
    public s0 d0() {
        s0 s0Var = (s0) super.a();
        if (s0Var == null) {
            w(11);
        }
        return s0Var;
    }
}