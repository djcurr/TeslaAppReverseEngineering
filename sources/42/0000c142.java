package y00;

import com.stripe.android.model.Stripe3ds2AuthParams;

/* loaded from: classes5.dex */
public abstract class n0 extends m0 {

    /* renamed from: f  reason: collision with root package name */
    private final boolean f58846f;

    /* renamed from: g  reason: collision with root package name */
    protected j20.j<y10.g<?>> f58847g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(w00.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, u10.f fVar, k20.d0 d0Var, boolean z11, w00.n0 n0Var) {
        super(iVar, gVar, fVar, d0Var, n0Var);
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
        this.f58846f = z11;
    }

    private static /* synthetic */ void w(int i11) {
        Object[] objArr = new Object[3];
        if (i11 == 1) {
            objArr[0] = "annotations";
        } else if (i11 == 2) {
            objArr[0] = "name";
        } else if (i11 == 3) {
            objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
        } else if (i11 != 4) {
            objArr[0] = "containingDeclaration";
        } else {
            objArr[0] = "compileTimeInitializer";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i11 != 4) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public void G0(j20.j<y10.g<?>> jVar) {
        if (jVar == null) {
            w(4);
        }
        this.f58847g = jVar;
    }

    @Override // w00.w0
    public boolean L() {
        return this.f58846f;
    }

    @Override // w00.w0
    public y10.g<?> j0() {
        j20.j<y10.g<?>> jVar = this.f58847g;
        if (jVar != null) {
            return jVar.invoke();
        }
        return null;
    }
}