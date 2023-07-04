package y00;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import w00.v0;

/* loaded from: classes5.dex */
public class d0 extends b0 implements w00.j0 {

    /* renamed from: m  reason: collision with root package name */
    private k20.d0 f58783m;

    /* renamed from: n  reason: collision with root package name */
    private final w00.j0 f58784n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d0(w00.i0 i0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.f fVar, w00.q qVar, boolean z11, boolean z12, boolean z13, b.a aVar, w00.j0 j0Var, w00.n0 n0Var) {
        super(fVar, qVar, i0Var, gVar, u10.f.i("<get-" + i0Var.getName() + ">"), z11, z12, z13, aVar, n0Var);
        d0 d0Var;
        d0 d0Var2;
        if (i0Var == null) {
            w(0);
        }
        if (gVar == null) {
            w(1);
        }
        if (fVar == null) {
            w(2);
        }
        if (qVar == null) {
            w(3);
        }
        if (aVar == null) {
            w(4);
        }
        if (n0Var == null) {
            w(5);
        }
        if (j0Var != 0) {
            d0Var2 = this;
            d0Var = j0Var;
        } else {
            d0Var = this;
            d0Var2 = d0Var;
        }
        d0Var2.f58784n = d0Var;
    }

    private static /* synthetic */ void w(int i11) {
        String str = (i11 == 6 || i11 == 7 || i11 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 6 || i11 == 7 || i11 == 8) ? 2 : 3];
        switch (i11) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i11 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i11 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i11 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i11 != 6 && i11 != 7 && i11 != 8) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i11 != 6 && i11 != 7 && i11 != 8) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // y00.b0, y00.k
    /* renamed from: L0 */
    public w00.j0 d0() {
        w00.j0 j0Var = this.f58784n;
        if (j0Var == null) {
            w(8);
        }
        return j0Var;
    }

    public void M0(k20.d0 d0Var) {
        if (d0Var == null) {
            d0Var = U().getType();
        }
        this.f58783m = d0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.a
    public Collection<? extends w00.j0> d() {
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> H0 = super.H0(true);
        if (H0 == null) {
            w(6);
        }
        return H0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public k20.d0 getReturnType() {
        return this.f58783m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public List<v0> h() {
        List<v0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            w(7);
        }
        return emptyList;
    }

    @Override // w00.i
    public <R, D> R v0(w00.k<R, D> kVar, D d11) {
        return kVar.e(this, d11);
    }
}