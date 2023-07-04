package y00;

import k20.b1;
import k20.d1;
import k20.f1;
import w00.r0;

/* loaded from: classes5.dex */
public abstract class a extends t {

    /* renamed from: b  reason: collision with root package name */
    private final u10.f f58728b;

    /* renamed from: c  reason: collision with root package name */
    protected final j20.i<k20.k0> f58729c;

    /* renamed from: d  reason: collision with root package name */
    private final j20.i<d20.h> f58730d;

    /* renamed from: e  reason: collision with root package name */
    private final j20.i<w00.l0> f58731e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y00.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C1335a implements h00.a<k20.k0> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: y00.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public class C1336a implements h00.l<kotlin.reflect.jvm.internal.impl.types.checker.h, k20.k0> {
            C1336a() {
            }

            @Override // h00.l
            /* renamed from: a */
            public k20.k0 invoke(kotlin.reflect.jvm.internal.impl.types.checker.h hVar) {
                w00.e e11 = hVar.e(a.this);
                if (e11 == null) {
                    return a.this.f58729c.invoke();
                }
                if (e11 instanceof r0) {
                    return k20.e0.b((r0) e11, f1.h(e11.i().getParameters()));
                }
                if (e11 instanceof t) {
                    return f1.u(e11.i().m(hVar), ((t) e11).M(hVar), this);
                }
                return e11.n();
            }
        }

        C1335a() {
        }

        @Override // h00.a
        /* renamed from: a */
        public k20.k0 invoke() {
            a aVar = a.this;
            return f1.v(aVar, aVar.V(), new C1336a());
        }
    }

    /* loaded from: classes5.dex */
    class b implements h00.a<d20.h> {
        b() {
        }

        @Override // h00.a
        /* renamed from: a */
        public d20.h invoke() {
            return new d20.f(a.this.V());
        }
    }

    /* loaded from: classes5.dex */
    class c implements h00.a<w00.l0> {
        c() {
        }

        @Override // h00.a
        /* renamed from: a */
        public w00.l0 invoke() {
            return new q(a.this);
        }
    }

    public a(j20.n nVar, u10.f fVar) {
        if (nVar == null) {
            d0(0);
        }
        if (fVar == null) {
            d0(1);
        }
        this.f58728b = fVar;
        this.f58729c = nVar.b(new C1335a());
        this.f58730d = nVar.b(new b());
        this.f58731e = nVar.b(new c());
    }

    private static /* synthetic */ void d0(int i11) {
        String str = (i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5 || i11 == 8 || i11 == 11 || i11 == 13 || i11 == 15 || i11 == 16 || i11 == 18 || i11 == 19) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5 || i11 == 8 || i11 == 11 || i11 == 13 || i11 == 15 || i11 == 16 || i11 == 18 || i11 == 19) ? 2 : 3];
        switch (i11) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 6:
            case 12:
                objArr[0] = "typeArguments";
                break;
            case 7:
            case 10:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 9:
            case 14:
                objArr[0] = "typeSubstitution";
                break;
            case 17:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i11 == 2) {
            objArr[1] = "getName";
        } else if (i11 == 3) {
            objArr[1] = "getOriginal";
        } else if (i11 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i11 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i11 == 8 || i11 == 11 || i11 == 13 || i11 == 15) {
            objArr[1] = "getMemberScope";
        } else if (i11 == 16) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i11 == 18) {
            objArr[1] = "substitute";
        } else if (i11 != 19) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i11) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 19:
                break;
            case 6:
            case 7:
            case 9:
            case 10:
            case 12:
            case 14:
                objArr[2] = "getMemberScope";
                break;
            case 17:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 != 2 && i11 != 3 && i11 != 4 && i11 != 5 && i11 != 8 && i11 != 11 && i11 != 13 && i11 != 15 && i11 != 16 && i11 != 18 && i11 != 19) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // w00.c
    public w00.l0 E0() {
        w00.l0 invoke = this.f58731e.invoke();
        if (invoke == null) {
            d0(5);
        }
        return invoke;
    }

    @Override // w00.p0
    /* renamed from: F0 */
    public w00.c c(d1 d1Var) {
        if (d1Var == null) {
            d0(17);
        }
        return d1Var.k() ? this : new s(this, d1Var);
    }

    @Override // w00.c
    public d20.h I(b1 b1Var) {
        if (b1Var == null) {
            d0(14);
        }
        d20.h w11 = w(b1Var, a20.a.k(w10.d.g(this)));
        if (w11 == null) {
            d0(15);
        }
        return w11;
    }

    @Override // w00.c
    public d20.h S() {
        d20.h invoke = this.f58730d.invoke();
        if (invoke == null) {
            d0(4);
        }
        return invoke;
    }

    @Override // w00.c
    public d20.h V() {
        d20.h M = M(a20.a.k(w10.d.g(this)));
        if (M == null) {
            d0(16);
        }
        return M;
    }

    @Override // w00.i
    public w00.c a() {
        return this;
    }

    @Override // w00.y
    public u10.f getName() {
        u10.f fVar = this.f58728b;
        if (fVar == null) {
            d0(2);
        }
        return fVar;
    }

    @Override // w00.c, w00.e
    public k20.k0 n() {
        k20.k0 invoke = this.f58729c.invoke();
        if (invoke == null) {
            d0(19);
        }
        return invoke;
    }

    @Override // w00.i
    public <R, D> R v0(w00.k<R, D> kVar, D d11) {
        return kVar.g(this, d11);
    }

    @Override // y00.t
    public d20.h w(b1 b1Var, kotlin.reflect.jvm.internal.impl.types.checker.h hVar) {
        if (b1Var == null) {
            d0(9);
        }
        if (hVar == null) {
            d0(10);
        }
        if (!b1Var.f()) {
            return new d20.m(M(hVar), d1.g(b1Var));
        }
        d20.h M = M(hVar);
        if (M == null) {
            d0(11);
        }
        return M;
    }
}