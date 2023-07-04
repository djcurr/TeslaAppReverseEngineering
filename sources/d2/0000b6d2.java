package u10;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final c f52983a;

    /* renamed from: b  reason: collision with root package name */
    private final c f52984b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f52985c;

    public b(c cVar, c cVar2, boolean z11) {
        if (cVar == null) {
            a(1);
        }
        if (cVar2 == null) {
            a(2);
        }
        this.f52983a = cVar;
        this.f52984b = cVar2;
        this.f52985c = z11;
    }

    private static /* synthetic */ void a(int i11) {
        String str = (i11 == 5 || i11 == 6 || i11 == 7 || i11 == 9 || i11 == 13 || i11 == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 5 || i11 == 6 || i11 == 7 || i11 == 9 || i11 == 13 || i11 == 14) ? 2 : 3];
        switch (i11) {
            case 1:
            case 3:
                objArr[0] = "packageFqName";
                break;
            case 2:
                objArr[0] = "relativeClassName";
                break;
            case 4:
                objArr[0] = "topLevelName";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 10:
                objArr[0] = "segment";
                break;
            case 11:
            case 12:
                objArr[0] = "string";
                break;
            default:
                objArr[0] = "topLevelFqName";
                break;
        }
        if (i11 == 5) {
            objArr[1] = "getPackageFqName";
        } else if (i11 == 6) {
            objArr[1] = "getRelativeClassName";
        } else if (i11 == 7) {
            objArr[1] = "getShortClassName";
        } else if (i11 == 9) {
            objArr[1] = "asSingleFqName";
        } else if (i11 == 13 || i11 == 14) {
            objArr[1] = "asString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
        }
        switch (i11) {
            case 1:
            case 2:
            case 3:
            case 4:
                objArr[2] = "<init>";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
                break;
            case 8:
                objArr[2] = "createNestedClassId";
                break;
            case 10:
                objArr[2] = "startsWith";
                break;
            case 11:
            case 12:
                objArr[2] = "fromString";
                break;
            default:
                objArr[2] = "topLevel";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 != 5 && i11 != 6 && i11 != 7 && i11 != 9 && i11 != 13 && i11 != 14) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static b e(String str) {
        if (str == null) {
            a(11);
        }
        return f(str, false);
    }

    public static b f(String str, boolean z11) {
        String str2;
        if (str == null) {
            a(12);
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            str2 = "";
        } else {
            String replace = str.substring(0, lastIndexOf).replace('/', CoreConstants.DOT);
            str = str.substring(lastIndexOf + 1);
            str2 = replace;
        }
        return new b(new c(str2), new c(str), z11);
    }

    public static b m(c cVar) {
        if (cVar == null) {
            a(0);
        }
        return new b(cVar.e(), cVar.g());
    }

    public c b() {
        if (this.f52983a.d()) {
            c cVar = this.f52984b;
            if (cVar == null) {
                a(9);
            }
            return cVar;
        }
        return new c(this.f52983a.b() + "." + this.f52984b.b());
    }

    public String c() {
        if (this.f52983a.d()) {
            String b11 = this.f52984b.b();
            if (b11 == null) {
                a(13);
            }
            return b11;
        }
        String str = this.f52983a.b().replace(CoreConstants.DOT, '/') + "/" + this.f52984b.b();
        if (str == null) {
            a(14);
        }
        return str;
    }

    public b d(f fVar) {
        if (fVar == null) {
            a(8);
        }
        return new b(h(), this.f52984b.c(fVar), this.f52985c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f52983a.equals(bVar.f52983a) && this.f52984b.equals(bVar.f52984b) && this.f52985c == bVar.f52985c;
    }

    public b g() {
        c e11 = this.f52984b.e();
        if (e11.d()) {
            return null;
        }
        return new b(h(), e11, this.f52985c);
    }

    public c h() {
        c cVar = this.f52983a;
        if (cVar == null) {
            a(5);
        }
        return cVar;
    }

    public int hashCode() {
        return (((this.f52983a.hashCode() * 31) + this.f52984b.hashCode()) * 31) + Boolean.valueOf(this.f52985c).hashCode();
    }

    public c i() {
        c cVar = this.f52984b;
        if (cVar == null) {
            a(6);
        }
        return cVar;
    }

    public f j() {
        f g11 = this.f52984b.g();
        if (g11 == null) {
            a(7);
        }
        return g11;
    }

    public boolean k() {
        return this.f52985c;
    }

    public boolean l() {
        return !this.f52984b.e().d();
    }

    public String toString() {
        if (this.f52983a.d()) {
            return "/" + c();
        }
        return c();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(c cVar, f fVar) {
        this(cVar, c.k(fVar), false);
        if (cVar == null) {
            a(3);
        }
        if (fVar == null) {
            a(4);
        }
    }
}