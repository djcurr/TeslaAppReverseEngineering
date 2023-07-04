package y00;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.ArrayList;
import java.util.List;
import k20.k1;
import w00.q0;
import w00.s0;

/* loaded from: classes5.dex */
public class k0 extends e {

    /* renamed from: k  reason: collision with root package name */
    private final h00.l<k20.d0, Void> f58821k;

    /* renamed from: l  reason: collision with root package name */
    private final List<k20.d0> f58822l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f58823m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private k0(w00.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z11, k1 k1Var, u10.f fVar, int i11, w00.n0 n0Var, h00.l<k20.d0, Void> lVar, q0 q0Var, j20.n nVar) {
        super(nVar, iVar, gVar, fVar, k1Var, z11, i11, n0Var, q0Var);
        if (iVar == null) {
            w(19);
        }
        if (gVar == null) {
            w(20);
        }
        if (k1Var == null) {
            w(21);
        }
        if (fVar == null) {
            w(22);
        }
        if (n0Var == null) {
            w(23);
        }
        if (q0Var == null) {
            w(24);
        }
        if (nVar == null) {
            w(25);
        }
        this.f58822l = new ArrayList(1);
        this.f58823m = false;
        this.f58821k = lVar;
    }

    private void J0() {
        if (this.f58823m) {
            return;
        }
        throw new IllegalStateException("Type parameter descriptor is not initialized: " + P0());
    }

    private void K0() {
        if (this.f58823m) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + P0());
        }
    }

    public static k0 L0(w00.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z11, k1 k1Var, u10.f fVar, int i11, w00.n0 n0Var, h00.l<k20.d0, Void> lVar, q0 q0Var, j20.n nVar) {
        if (iVar == null) {
            w(12);
        }
        if (gVar == null) {
            w(13);
        }
        if (k1Var == null) {
            w(14);
        }
        if (fVar == null) {
            w(15);
        }
        if (n0Var == null) {
            w(16);
        }
        if (q0Var == null) {
            w(17);
        }
        if (nVar == null) {
            w(18);
        }
        return new k0(iVar, gVar, z11, k1Var, fVar, i11, n0Var, lVar, q0Var, nVar);
    }

    public static k0 M0(w00.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z11, k1 k1Var, u10.f fVar, int i11, w00.n0 n0Var, j20.n nVar) {
        if (iVar == null) {
            w(6);
        }
        if (gVar == null) {
            w(7);
        }
        if (k1Var == null) {
            w(8);
        }
        if (fVar == null) {
            w(9);
        }
        if (n0Var == null) {
            w(10);
        }
        if (nVar == null) {
            w(11);
        }
        return L0(iVar, gVar, z11, k1Var, fVar, i11, n0Var, null, q0.a.f55322a, nVar);
    }

    public static s0 N0(w00.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z11, k1 k1Var, u10.f fVar, int i11, j20.n nVar) {
        if (iVar == null) {
            w(0);
        }
        if (gVar == null) {
            w(1);
        }
        if (k1Var == null) {
            w(2);
        }
        if (fVar == null) {
            w(3);
        }
        if (nVar == null) {
            w(4);
        }
        k0 M0 = M0(iVar, gVar, z11, k1Var, fVar, i11, w00.n0.f55303a, nVar);
        M0.I0(a20.a.g(iVar).y());
        M0.Q0();
        return M0;
    }

    private void O0(k20.d0 d0Var) {
        if (k20.f0.a(d0Var)) {
            return;
        }
        this.f58822l.add(d0Var);
    }

    private String P0() {
        return getName() + " declared in " + w10.d.m(mo223b());
    }

    private static /* synthetic */ void w(int i11) {
        String str = (i11 == 5 || i11 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 5 || i11 == 28) ? 2 : 3];
        switch (i11) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i11 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i11 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i11) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 != 5 && i11 != 28) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // y00.e
    protected void G0(k20.d0 d0Var) {
        if (d0Var == null) {
            w(27);
        }
        h00.l<k20.d0, Void> lVar = this.f58821k;
        if (lVar == null) {
            return;
        }
        lVar.mo12invoke(d0Var);
    }

    @Override // y00.e
    protected List<k20.d0> H0() {
        J0();
        List<k20.d0> list = this.f58822l;
        if (list == null) {
            w(28);
        }
        return list;
    }

    public void I0(k20.d0 d0Var) {
        if (d0Var == null) {
            w(26);
        }
        K0();
        O0(d0Var);
    }

    public void Q0() {
        K0();
        this.f58823m = true;
    }
}