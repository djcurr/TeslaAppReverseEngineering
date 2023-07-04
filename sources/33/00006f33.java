package g10;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.List;
import k20.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import vz.p;
import w00.n0;

/* loaded from: classes5.dex */
public class b extends y00.f implements a {
    private Boolean O;
    private Boolean P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected b(w00.c cVar, b bVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z11, b.a aVar, n0 n0Var) {
        super(cVar, bVar, gVar, z11, aVar, n0Var);
        if (cVar == null) {
            w(0);
        }
        if (gVar == null) {
            w(1);
        }
        if (aVar == null) {
            w(2);
        }
        if (n0Var == null) {
            w(3);
        }
        this.O = null;
        this.P = null;
    }

    public static b o1(w00.c cVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z11, n0 n0Var) {
        if (cVar == null) {
            w(4);
        }
        if (gVar == null) {
            w(5);
        }
        if (n0Var == null) {
            w(6);
        }
        return new b(cVar, null, gVar, z11, b.a.DECLARATION, n0Var);
    }

    private static /* synthetic */ void w(int i11) {
        String str = (i11 == 11 || i11 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 11 || i11 == 18) ? 2 : 3];
        switch (i11) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParametersData";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i11 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i11 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i11) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 != 11 && i11 != 18) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // y00.p
    public boolean M0() {
        return this.O.booleanValue();
    }

    @Override // y00.p
    public void U0(boolean z11) {
        this.O = Boolean.valueOf(z11);
    }

    @Override // y00.p
    public void V0(boolean z11) {
        this.P = Boolean.valueOf(z11);
    }

    @Override // y00.p, kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean c0() {
        return this.P.booleanValue();
    }

    protected b n1(w00.c cVar, b bVar, b.a aVar, n0 n0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        if (cVar == null) {
            w(12);
        }
        if (aVar == null) {
            w(13);
        }
        if (n0Var == null) {
            w(14);
        }
        if (gVar == null) {
            w(15);
        }
        return new b(cVar, bVar, gVar, this.K, aVar, n0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y00.f
    /* renamed from: p1 */
    public b j1(w00.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, b.a aVar, u10.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, n0 n0Var) {
        if (iVar == null) {
            w(7);
        }
        if (aVar == null) {
            w(8);
        }
        if (gVar == null) {
            w(9);
        }
        if (n0Var == null) {
            w(10);
        }
        if (aVar != b.a.DECLARATION && aVar != b.a.SYNTHESIZED) {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + iVar + "\nkind: " + aVar);
        }
        b n12 = n1((w00.c) iVar, (b) eVar, aVar, n0Var, gVar);
        n12.U0(M0());
        n12.V0(c0());
        return n12;
    }

    @Override // g10.a
    /* renamed from: q1 */
    public b T(d0 d0Var, List<i> list, d0 d0Var2, p<a.InterfaceC0649a<?>, ?> pVar) {
        if (list == null) {
            w(16);
        }
        if (d0Var2 == null) {
            w(17);
        }
        b j12 = j1(b(), null, getKind(), null, mo140getAnnotations(), f());
        j12.N0(d0Var == null ? null : w10.c.f(j12, d0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b()), J(), getTypeParameters(), h.a(list, h(), j12), d0Var2, p(), getVisibility());
        if (pVar != null) {
            j12.Q0(pVar.c(), pVar.d());
        }
        return j12;
    }
}