package u10;

import h00.l;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import wz.p;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: e */
    private static final f f52989e = f.i("<root>");

    /* renamed from: f */
    private static final Pattern f52990f = Pattern.compile("\\.");

    /* renamed from: g */
    private static final l<String, f> f52991g = new a();

    /* renamed from: a */
    private final String f52992a;

    /* renamed from: b */
    private transient c f52993b;

    /* renamed from: c */
    private transient d f52994c;

    /* renamed from: d */
    private transient f f52995d;

    /* loaded from: classes5.dex */
    static class a implements l<String, f> {
        a() {
        }

        @Override // h00.l
        /* renamed from: a */
        public f invoke(String str) {
            return f.e(str);
        }
    }

    public d(String str, c cVar) {
        if (str == null) {
            a(0);
        }
        if (cVar == null) {
            a(1);
        }
        this.f52992a = str;
        this.f52993b = cVar;
    }

    private static /* synthetic */ void a(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                i12 = 2;
                break;
            case 9:
            case 15:
            case 16:
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        if (i11 != 1) {
            switch (i11) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i11) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 17:
                objArr[1] = "toString";
                break;
        }
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                throw new IllegalStateException(format);
            case 9:
            case 15:
            case 16:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    private void d() {
        int lastIndexOf = this.f52992a.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.f52995d = f.e(this.f52992a.substring(lastIndexOf + 1));
            this.f52994c = new d(this.f52992a.substring(0, lastIndexOf));
            return;
        }
        this.f52995d = f.e(this.f52992a);
        this.f52994c = c.f52986c.j();
    }

    public static d m(f fVar) {
        if (fVar == null) {
            a(16);
        }
        return new d(fVar.b(), c.f52986c.j(), fVar);
    }

    public String b() {
        String str = this.f52992a;
        if (str == null) {
            a(4);
        }
        return str;
    }

    public d c(f fVar) {
        String str;
        if (fVar == null) {
            a(9);
        }
        if (e()) {
            str = fVar.b();
        } else {
            str = this.f52992a + "." + fVar.b();
        }
        return new d(str, this, fVar);
    }

    public boolean e() {
        return this.f52992a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f52992a.equals(((d) obj).f52992a);
    }

    public boolean f() {
        return this.f52993b != null || b().indexOf(60) < 0;
    }

    public d g() {
        d dVar = this.f52994c;
        if (dVar != null) {
            if (dVar == null) {
                a(7);
            }
            return dVar;
        } else if (!e()) {
            d();
            d dVar2 = this.f52994c;
            if (dVar2 == null) {
                a(8);
            }
            return dVar2;
        } else {
            throw new IllegalStateException("root");
        }
    }

    public List<f> h() {
        List<f> emptyList = e() ? Collections.emptyList() : p.c0(f52990f.split(this.f52992a), f52991g);
        if (emptyList == null) {
            a(14);
        }
        return emptyList;
    }

    public int hashCode() {
        return this.f52992a.hashCode();
    }

    public f i() {
        f fVar = this.f52995d;
        if (fVar != null) {
            if (fVar == null) {
                a(10);
            }
            return fVar;
        } else if (!e()) {
            d();
            f fVar2 = this.f52995d;
            if (fVar2 == null) {
                a(11);
            }
            return fVar2;
        } else {
            throw new IllegalStateException("root");
        }
    }

    public f j() {
        if (e()) {
            f fVar = f52989e;
            if (fVar == null) {
                a(12);
            }
            return fVar;
        }
        f i11 = i();
        if (i11 == null) {
            a(13);
        }
        return i11;
    }

    public boolean k(f fVar) {
        if (fVar == null) {
            a(15);
        }
        if (e()) {
            return false;
        }
        int indexOf = this.f52992a.indexOf(46);
        String str = this.f52992a;
        String b11 = fVar.b();
        if (indexOf == -1) {
            indexOf = this.f52992a.length();
        }
        return str.regionMatches(0, b11, 0, indexOf);
    }

    public c l() {
        c cVar = this.f52993b;
        if (cVar != null) {
            if (cVar == null) {
                a(5);
            }
            return cVar;
        }
        c cVar2 = new c(this);
        this.f52993b = cVar2;
        return cVar2;
    }

    public String toString() {
        String b11 = e() ? f52989e.b() : this.f52992a;
        if (b11 == null) {
            a(17);
        }
        return b11;
    }

    public d(String str) {
        if (str == null) {
            a(2);
        }
        this.f52992a = str;
    }

    private d(String str, d dVar, f fVar) {
        if (str == null) {
            a(3);
        }
        this.f52992a = str;
        this.f52994c = dVar;
        this.f52995d = fVar;
    }
}