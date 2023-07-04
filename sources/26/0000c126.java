package y00;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import w00.v0;

/* loaded from: classes5.dex */
public class e0 extends b0 implements w00.k0 {

    /* renamed from: m  reason: collision with root package name */
    private v0 f58799m;

    /* renamed from: n  reason: collision with root package name */
    private final w00.k0 f58800n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e0(w00.i0 i0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.f fVar, w00.q qVar, boolean z11, boolean z12, boolean z13, b.a aVar, w00.k0 k0Var, w00.n0 n0Var) {
        super(fVar, qVar, i0Var, gVar, u10.f.i("<set-" + i0Var.getName() + ">"), z11, z12, z13, aVar, n0Var);
        e0 e0Var;
        e0 e0Var2;
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
        if (k0Var != 0) {
            e0Var2 = this;
            e0Var = k0Var;
        } else {
            e0Var = this;
            e0Var2 = e0Var;
        }
        e0Var2.f58800n = e0Var;
    }

    public static l0 L0(w00.k0 k0Var, k20.d0 d0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        if (k0Var == null) {
            w(7);
        }
        if (d0Var == null) {
            w(8);
        }
        if (gVar == null) {
            w(9);
        }
        return new l0(k0Var, null, 0, gVar, u10.f.i("<set-?>"), d0Var, false, false, false, null, w00.n0.f55303a);
    }

    private static /* synthetic */ void w(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 10:
            case 11:
            case 12:
            case 13:
                i12 = 2;
                break;
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
            case 9:
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
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i11) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i11) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // y00.b0, y00.k
    /* renamed from: M0 */
    public w00.k0 mo238d0() {
        w00.k0 k0Var = this.f58800n;
        if (k0Var == null) {
            w(13);
        }
        return k0Var;
    }

    public void N0(v0 v0Var) {
        if (v0Var == null) {
            w(6);
        }
        this.f58799m = v0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.a
    public Collection<? extends w00.k0> d() {
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> H0 = super.H0(false);
        if (H0 == null) {
            w(10);
        }
        return H0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public k20.d0 getReturnType() {
        k20.k0 Z = a20.a.g(this).Z();
        if (Z == null) {
            w(12);
        }
        return Z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public List<v0> h() {
        v0 v0Var = this.f58799m;
        if (v0Var != null) {
            List<v0> singletonList = Collections.singletonList(v0Var);
            if (singletonList == null) {
                w(11);
            }
            return singletonList;
        }
        throw new IllegalStateException();
    }

    @Override // w00.i
    public <R, D> R v0(w00.k<R, D> kVar, D d11) {
        return kVar.j(this, d11);
    }
}