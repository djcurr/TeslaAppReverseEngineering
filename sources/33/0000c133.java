package y00;

import com.stripe.android.model.Stripe3ds2AuthParams;

/* loaded from: classes5.dex */
public abstract class k extends j implements w00.j {

    /* renamed from: c  reason: collision with root package name */
    private final w00.i f58819c;

    /* renamed from: d  reason: collision with root package name */
    private final w00.n0 f58820d;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(w00.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, u10.f fVar, w00.n0 n0Var) {
        super(gVar, fVar);
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
        this.f58819c = iVar;
        this.f58820d = n0Var;
    }

    private static /* synthetic */ void w(int i11) {
        String str = (i11 == 4 || i11 == 5 || i11 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 4 || i11 == 5 || i11 == 6) ? 2 : 3];
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
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i11 == 4) {
            objArr[1] = "getOriginal";
        } else if (i11 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i11 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i11 != 4 && i11 != 5 && i11 != 6) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i11 != 4 && i11 != 5 && i11 != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public w00.i b() {
        w00.i iVar = this.f58819c;
        if (iVar == null) {
            w(5);
        }
        return iVar;
    }

    @Override // y00.j, w00.i
    /* renamed from: d0 */
    public w00.l a() {
        w00.l lVar = (w00.l) super.a();
        if (lVar == null) {
            w(4);
        }
        return lVar;
    }

    public w00.n0 f() {
        w00.n0 n0Var = this.f58820d;
        if (n0Var == null) {
            w(6);
        }
        return n0Var;
    }
}