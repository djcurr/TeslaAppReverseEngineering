package u10;

/* loaded from: classes5.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public static final f f53000a = f.i("<no name provided>");

    /* renamed from: b  reason: collision with root package name */
    public static final f f53001b;

    /* renamed from: c  reason: collision with root package name */
    public static final f f53002c;

    static {
        f.i("<root package>");
        f53001b = f.f("Companion");
        f53002c = f.f("no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40");
        f.i("<anonymous>");
    }

    private static /* synthetic */ void a(int i11) {
        String str = i11 != 1 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[i11 != 1 ? 2 : 3];
        if (i11 != 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/SpecialNames";
        } else {
            objArr[0] = "name";
        }
        if (i11 != 1) {
            objArr[1] = "safeIdentifier";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/SpecialNames";
        }
        if (i11 == 1) {
            objArr[2] = "isSafeIdentifier";
        }
        String format = String.format(str, objArr);
        if (i11 == 1) {
            throw new IllegalArgumentException(format);
        }
    }

    public static boolean b(f fVar) {
        if (fVar == null) {
            a(1);
        }
        return (fVar.b().isEmpty() || fVar.g()) ? false : true;
    }

    public static f c(f fVar) {
        if (fVar == null || fVar.g()) {
            fVar = f53002c;
        }
        if (fVar == null) {
            a(0);
        }
        return fVar;
    }
}