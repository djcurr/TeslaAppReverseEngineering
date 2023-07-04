package y00;

import com.stripe.android.model.Stripe3ds2AuthParams;

/* loaded from: classes5.dex */
public abstract class g extends a {

    /* renamed from: f  reason: collision with root package name */
    private final w00.i f58803f;

    /* renamed from: g  reason: collision with root package name */
    private final w00.n0 f58804g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f58805h;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j20.n nVar, w00.i iVar, u10.f fVar, w00.n0 n0Var, boolean z11) {
        super(nVar, fVar);
        if (nVar == null) {
            d0(0);
        }
        if (iVar == null) {
            d0(1);
        }
        if (fVar == null) {
            d0(2);
        }
        if (n0Var == null) {
            d0(3);
        }
        this.f58803f = iVar;
        this.f58804g = n0Var;
        this.f58805h = z11;
    }

    private static /* synthetic */ void d0(int i11) {
        String str = (i11 == 4 || i11 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 4 || i11 == 5) ? 2 : 3];
        if (i11 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i11 == 2) {
            objArr[0] = "name";
        } else if (i11 == 3) {
            objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
        } else if (i11 == 4 || i11 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i11 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i11 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i11 != 4 && i11 != 5) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i11 != 4 && i11 != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // w00.c, w00.j, w00.i
    public w00.i b() {
        w00.i iVar = this.f58803f;
        if (iVar == null) {
            d0(4);
        }
        return iVar;
    }

    @Override // w00.l
    public w00.n0 f() {
        w00.n0 n0Var = this.f58804g;
        if (n0Var == null) {
            d0(5);
        }
        return n0Var;
    }

    public boolean isExternal() {
        return this.f58805h;
    }
}