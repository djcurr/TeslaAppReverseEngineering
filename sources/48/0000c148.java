package y00;

/* loaded from: classes5.dex */
public class q extends c {

    /* renamed from: d  reason: collision with root package name */
    private final w00.c f58893d;

    /* renamed from: e  reason: collision with root package name */
    private final e20.c f58894e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(w00.c cVar) {
        super(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b());
        if (cVar == null) {
            w(0);
        }
        this.f58893d = cVar;
        this.f58894e = new e20.c(cVar, null);
    }

    private static /* synthetic */ void w(int i11) {
        String str = (i11 == 1 || i11 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 1 || i11 == 2) ? 2 : 3];
        if (i11 == 1 || i11 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i11 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i11 == 1) {
            objArr[1] = "getValue";
        } else if (i11 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // w00.i
    public w00.i b() {
        w00.c cVar = this.f58893d;
        if (cVar == null) {
            w(2);
        }
        return cVar;
    }

    @Override // w00.l0
    public e20.d getValue() {
        e20.c cVar = this.f58894e;
        if (cVar == null) {
            w(1);
        }
        return cVar;
    }

    @Override // y00.j
    public String toString() {
        return "class " + this.f58893d.getName() + "::this";
    }
}