package y00;

/* loaded from: classes5.dex */
public abstract class j extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.b implements w00.i {

    /* renamed from: b  reason: collision with root package name */
    private final u10.f f58816b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, u10.f fVar) {
        super(gVar);
        if (gVar == null) {
            w(0);
        }
        if (fVar == null) {
            w(1);
        }
        this.f58816b = fVar;
    }

    public static String M(w00.i iVar) {
        if (iVar == null) {
            w(4);
        }
        try {
            String str = kotlin.reflect.jvm.internal.impl.renderer.c.f35081c.q(iVar) + "[" + iVar.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(iVar)) + "]";
            if (str == null) {
                w(5);
            }
            return str;
        } catch (Throwable unused) {
            String str2 = iVar.getClass().getSimpleName() + " " + iVar.getName();
            if (str2 == null) {
                w(6);
            }
            return str2;
        }
    }

    private static /* synthetic */ void w(int i11) {
        String str = (i11 == 2 || i11 == 3 || i11 == 5 || i11 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 2 || i11 == 3 || i11 == 5 || i11 == 6) ? 2 : 3];
        switch (i11) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i11 == 2) {
            objArr[1] = "getName";
        } else if (i11 == 3) {
            objArr[1] = "getOriginal";
        } else if (i11 == 5 || i11 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i11 != 2 && i11 != 3) {
            if (i11 == 4) {
                objArr[2] = "toString";
            } else if (i11 != 5 && i11 != 6) {
                objArr[2] = "<init>";
            }
        }
        String format = String.format(str, objArr);
        if (i11 != 2 && i11 != 3 && i11 != 5 && i11 != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public w00.i a() {
        return this;
    }

    @Override // w00.y
    public u10.f getName() {
        u10.f fVar = this.f58816b;
        if (fVar == null) {
            w(2);
        }
        return fVar;
    }

    public String toString() {
        return M(this);
    }
}