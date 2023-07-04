package b20;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes5.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final String f7357a;

    private d(String str) {
        if (str == null) {
            a(5);
        }
        this.f7357a = str;
    }

    private static /* synthetic */ void a(int i11) {
        String str = (i11 == 3 || i11 == 6 || i11 == 7 || i11 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 3 || i11 == 6 || i11 == 7 || i11 == 8) ? 2 : 3];
        switch (i11) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 5:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i11 == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i11 == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i11 == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i11 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i11) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 != 3 && i11 != 6 && i11 != 7 && i11 != 8) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static d b(u10.b bVar) {
        if (bVar == null) {
            a(1);
        }
        u10.c h11 = bVar.h();
        String replace = bVar.i().b().replace(CoreConstants.DOT, CoreConstants.DOLLAR);
        if (h11.d()) {
            return new d(replace);
        }
        return new d(h11.b().replace(CoreConstants.DOT, '/') + "/" + replace);
    }

    public static d c(u10.c cVar) {
        if (cVar == null) {
            a(2);
        }
        return new d(cVar.b().replace(CoreConstants.DOT, '/'));
    }

    public static d d(String str) {
        if (str == null) {
            a(0);
        }
        return new d(str);
    }

    public u10.c e() {
        return new u10.c(this.f7357a.replace('/', CoreConstants.DOT));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f7357a.equals(((d) obj).f7357a);
    }

    public String f() {
        String str = this.f7357a;
        if (str == null) {
            a(8);
        }
        return str;
    }

    public u10.c g() {
        int lastIndexOf = this.f7357a.lastIndexOf("/");
        if (lastIndexOf == -1) {
            u10.c cVar = u10.c.f52986c;
            if (cVar == null) {
                a(7);
            }
            return cVar;
        }
        return new u10.c(this.f7357a.substring(0, lastIndexOf).replace('/', CoreConstants.DOT));
    }

    public int hashCode() {
        return this.f7357a.hashCode();
    }

    public String toString() {
        return this.f7357a;
    }
}