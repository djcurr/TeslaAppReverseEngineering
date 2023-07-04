package g10;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.List;
import java.util.Map;
import k20.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import vz.p;
import w00.l0;
import w00.n0;
import w00.q;
import w00.s0;
import w00.v0;
import y00.g0;

/* loaded from: classes5.dex */
public class e extends g0 implements g10.a {
    public static final a.InterfaceC0649a<v0> O = new a();
    private b K;
    private final boolean L;

    /* loaded from: classes5.dex */
    static class a implements a.InterfaceC0649a<v0> {
        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public enum b {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);
        
        public final boolean isStable;
        public final boolean isSynthesized;

        private static /* synthetic */ void $$$reportNull$$$0(int i11) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus", "get"));
        }

        b(boolean z11, boolean z12) {
            this.isStable = z11;
            this.isSynthesized = z12;
        }

        public static b get(boolean z11, boolean z12) {
            b bVar;
            if (z11) {
                bVar = z12 ? STABLE_SYNTHESIZED : STABLE_DECLARED;
            } else {
                bVar = z12 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            }
            if (bVar == null) {
                $$$reportNull$$$0(0);
            }
            return bVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected e(w00.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.h hVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, u10.f fVar, b.a aVar, n0 n0Var, boolean z11) {
        super(iVar, hVar, gVar, fVar, aVar, n0Var);
        if (iVar == null) {
            w(0);
        }
        if (gVar == null) {
            w(1);
        }
        if (fVar == null) {
            w(2);
        }
        if (aVar == null) {
            w(3);
        }
        if (n0Var == null) {
            w(4);
        }
        this.K = null;
        this.L = z11;
    }

    public static e l1(w00.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, u10.f fVar, n0 n0Var, boolean z11) {
        if (iVar == null) {
            w(5);
        }
        if (gVar == null) {
            w(6);
        }
        if (fVar == null) {
            w(7);
        }
        if (n0Var == null) {
            w(8);
        }
        return new e(iVar, null, gVar, fVar, b.a.DECLARATION, n0Var, z11);
    }

    private static /* synthetic */ void w(int i11) {
        String str = (i11 == 12 || i11 == 17 || i11 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 12 || i11 == 17 || i11 == 20) ? 2 : 3];
        switch (i11) {
            case 1:
            case 6:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 14:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 16:
                objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "typeParameters";
                break;
            case 10:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
                objArr[0] = "visibility";
                break;
            case 12:
            case 17:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 18:
                objArr[0] = "enhancedValueParametersData";
                break;
            case 19:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i11 == 12) {
            objArr[1] = "initialize";
        } else if (i11 == 17) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i11 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i11) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
                objArr[2] = "initialize";
                break;
            case 12:
            case 17:
            case 20:
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 18:
            case 19:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 != 12 && i11 != 17 && i11 != 20) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // y00.p
    public boolean M0() {
        return this.K.isStable;
    }

    @Override // y00.p, kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean c0() {
        return this.K.isSynthesized;
    }

    @Override // y00.g0
    public g0 k1(l0 l0Var, l0 l0Var2, List<? extends s0> list, List<v0> list2, d0 d0Var, kotlin.reflect.jvm.internal.impl.descriptors.f fVar, q qVar, Map<? extends a.InterfaceC0649a<?>, ?> map) {
        if (list == null) {
            w(9);
        }
        if (list2 == null) {
            w(10);
        }
        if (qVar == null) {
            w(11);
        }
        g0 k12 = super.k1(l0Var, l0Var2, list, list2, d0Var, fVar, qVar, map);
        b1(p20.i.f45917a.a(k12).a());
        if (k12 == null) {
            w(12);
        }
        return k12;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y00.g0, y00.p
    /* renamed from: m1 */
    public e H0(w00.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, b.a aVar, u10.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, n0 n0Var) {
        if (iVar == null) {
            w(13);
        }
        if (aVar == null) {
            w(14);
        }
        if (gVar == null) {
            w(15);
        }
        if (n0Var == null) {
            w(16);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h hVar = (kotlin.reflect.jvm.internal.impl.descriptors.h) eVar;
        if (fVar == null) {
            fVar = getName();
        }
        e eVar2 = new e(iVar, hVar, gVar, fVar, aVar, n0Var, this.L);
        eVar2.o1(M0(), c0());
        return eVar2;
    }

    @Override // g10.a
    /* renamed from: n1 */
    public e T(d0 d0Var, List<i> list, d0 d0Var2, p<a.InterfaceC0649a<?>, ?> pVar) {
        if (list == null) {
            w(18);
        }
        if (d0Var2 == null) {
            w(19);
        }
        e eVar = (e) s().mo242c(h.a(list, h(), this)).mo246g(d0Var2).mo255p(d0Var == null ? null : w10.c.f(this, d0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b())).mo240a().mo248i().build();
        if (pVar != null) {
            eVar.Q0(pVar.c(), pVar.d());
        }
        if (eVar == null) {
            w(20);
        }
        return eVar;
    }

    public void o1(boolean z11, boolean z12) {
        this.K = b.get(z11, z12);
    }
}