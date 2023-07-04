package y00;

/* loaded from: classes5.dex */
public class f0 extends c {

    /* renamed from: d  reason: collision with root package name */
    private final w00.i f58801d;

    /* renamed from: e  reason: collision with root package name */
    private e20.d f58802e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(w00.i iVar, e20.d dVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        super(gVar);
        if (iVar == null) {
            w(0);
        }
        if (dVar == null) {
            w(1);
        }
        if (gVar == null) {
            w(2);
        }
        this.f58801d = iVar;
        this.f58802e = dVar;
    }

    private static /* synthetic */ void w(int i11) {
        String str = (i11 == 3 || i11 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 3 || i11 == 4) ? 2 : 3];
        switch (i11) {
            case 1:
                objArr[0] = "value";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 5:
                objArr[0] = "newOwner";
                break;
            case 6:
                objArr[0] = "outType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i11 == 3) {
            objArr[1] = "getValue";
        } else if (i11 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i11 != 3 && i11 != 4) {
            if (i11 == 5) {
                objArr[2] = "copy";
            } else if (i11 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "setOutType";
            }
        }
        String format = String.format(str, objArr);
        if (i11 != 3 && i11 != 4) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // w00.i
    public w00.i b() {
        w00.i iVar = this.f58801d;
        if (iVar == null) {
            w(4);
        }
        return iVar;
    }

    @Override // w00.l0
    public e20.d getValue() {
        e20.d dVar = this.f58802e;
        if (dVar == null) {
            w(3);
        }
        return dVar;
    }
}