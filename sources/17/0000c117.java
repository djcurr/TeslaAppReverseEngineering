package y00;

import com.stripe.android.model.Stripe3ds2AuthParams;
import k20.k1;
import w00.q0;

/* loaded from: classes5.dex */
public abstract class b extends e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j20.n nVar, w00.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, u10.f fVar, k1 k1Var, boolean z11, int i11, w00.n0 n0Var, q0 q0Var) {
        super(nVar, iVar, gVar, fVar, k1Var, z11, i11, n0Var, q0Var);
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
    }

    private static /* synthetic */ void w(int i11) {
        Object[] objArr = new Object[3];
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
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // y00.j
    public String toString() {
        Object[] objArr = new Object[3];
        String str = "";
        objArr[0] = v() ? "reified " : "";
        if (k() != k1.INVARIANT) {
            str = k() + " ";
        }
        objArr[1] = str;
        objArr[2] = getName();
        return String.format("%s%s%s", objArr);
    }
}