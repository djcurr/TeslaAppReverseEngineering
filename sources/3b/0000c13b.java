package y00;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Collections;
import java.util.List;
import w00.s0;
import w00.v0;
import w00.w0;

/* loaded from: classes5.dex */
public abstract class m0 extends k implements w0 {

    /* renamed from: e  reason: collision with root package name */
    protected k20.d0 f58833e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(w00.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, u10.f fVar, k20.d0 d0Var, w00.n0 n0Var) {
        super(iVar, gVar, fVar, n0Var);
        if (iVar == null) {
            w(0);
        }
        if (gVar == null) {
            w(1);
        }
        if (fVar == null) {
            w(2);
        }
        if (n0Var == null) {
            w(3);
        }
        this.f58833e = d0Var;
    }

    private static /* synthetic */ void w(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                i12 = 2;
                break;
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i11) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public void F0(k20.d0 d0Var) {
        this.f58833e = d0Var;
    }

    public w00.l0 J() {
        return null;
    }

    public w00.l0 N() {
        return null;
    }

    public boolean c0() {
        return false;
    }

    public k20.d0 getReturnType() {
        k20.d0 type = getType();
        if (type == null) {
            w(9);
        }
        return type;
    }

    @Override // w00.u0
    public k20.d0 getType() {
        k20.d0 d0Var = this.f58833e;
        if (d0Var == null) {
            w(4);
        }
        return d0Var;
    }

    public List<s0> getTypeParameters() {
        List<s0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            w(8);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public List<v0> h() {
        List<v0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            w(6);
        }
        return emptyList;
    }
}