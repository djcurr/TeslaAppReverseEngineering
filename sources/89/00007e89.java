package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* loaded from: classes5.dex */
public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final g f34933a;

    public b(g gVar) {
        if (gVar == null) {
            w(0);
        }
        this.f34933a = gVar;
    }

    private static /* synthetic */ void w(int i11) {
        String str = i11 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i11 != 1 ? 3 : 2];
        if (i11 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i11 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i11 != 1) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i11 == 1) {
            throw new IllegalStateException(format);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public g getAnnotations() {
        g gVar = this.f34933a;
        if (gVar == null) {
            w(1);
        }
        return gVar;
    }
}