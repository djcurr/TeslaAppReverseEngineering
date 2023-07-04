package u10;

/* loaded from: classes5.dex */
public final class f implements Comparable<f> {

    /* renamed from: a  reason: collision with root package name */
    private final String f52997a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f52998b;

    private f(String str, boolean z11) {
        if (str == null) {
            a(0);
        }
        this.f52997a = str;
        this.f52998b = z11;
    }

    private static /* synthetic */ void a(int i11) {
        String str = (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) ? 2 : 3];
        if (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i11 == 1) {
            objArr[1] = "asString";
        } else if (i11 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i11 == 3 || i11 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i11) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "special";
                break;
            case 8:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static f e(String str) {
        if (str == null) {
            a(8);
        }
        if (str.startsWith("<")) {
            return i(str);
        }
        return f(str);
    }

    public static f f(String str) {
        if (str == null) {
            a(5);
        }
        return new f(str, false);
    }

    public static boolean h(String str) {
        if (str == null) {
            a(6);
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (charAt == '.' || charAt == '/' || charAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static f i(String str) {
        if (str == null) {
            a(7);
        }
        if (str.startsWith("<")) {
            return new f(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': " + str);
    }

    public String b() {
        String str = this.f52997a;
        if (str == null) {
            a(1);
        }
        return str;
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public int compareTo(f fVar) {
        return this.f52997a.compareTo(fVar.f52997a);
    }

    public String d() {
        if (!this.f52998b) {
            String b11 = b();
            if (b11 == null) {
                a(2);
            }
            return b11;
        }
        throw new IllegalStateException("not identifier: " + this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.f52998b == fVar.f52998b && this.f52997a.equals(fVar.f52997a);
        }
        return false;
    }

    public boolean g() {
        return this.f52998b;
    }

    public int hashCode() {
        return (this.f52997a.hashCode() * 31) + (this.f52998b ? 1 : 0);
    }

    public String toString() {
        return this.f52997a;
    }
}