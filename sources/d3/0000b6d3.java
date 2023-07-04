package u10;

import java.util.List;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static final c f52986c = new c("");

    /* renamed from: a  reason: collision with root package name */
    private final d f52987a;

    /* renamed from: b  reason: collision with root package name */
    private transient c f52988b;

    public c(String str) {
        if (str == null) {
            a(1);
        }
        this.f52987a = new d(str, this);
    }

    private static /* synthetic */ void a(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i12 = 2;
                break;
            case 8:
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i11) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i11) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
                objArr[2] = "startsWith";
                break;
            case 13:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(format);
            case 8:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static c k(f fVar) {
        if (fVar == null) {
            a(13);
        }
        return new c(d.m(fVar));
    }

    public String b() {
        String b11 = this.f52987a.b();
        if (b11 == null) {
            a(4);
        }
        return b11;
    }

    public c c(f fVar) {
        if (fVar == null) {
            a(8);
        }
        return new c(this.f52987a.c(fVar), this);
    }

    public boolean d() {
        return this.f52987a.e();
    }

    public c e() {
        c cVar = this.f52988b;
        if (cVar != null) {
            if (cVar == null) {
                a(6);
            }
            return cVar;
        } else if (!d()) {
            c cVar2 = new c(this.f52987a.g());
            this.f52988b = cVar2;
            return cVar2;
        } else {
            throw new IllegalStateException("root");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f52987a.equals(((c) obj).f52987a);
    }

    public List<f> f() {
        List<f> h11 = this.f52987a.h();
        if (h11 == null) {
            a(11);
        }
        return h11;
    }

    public f g() {
        f i11 = this.f52987a.i();
        if (i11 == null) {
            a(9);
        }
        return i11;
    }

    public f h() {
        f j11 = this.f52987a.j();
        if (j11 == null) {
            a(10);
        }
        return j11;
    }

    public int hashCode() {
        return this.f52987a.hashCode();
    }

    public boolean i(f fVar) {
        if (fVar == null) {
            a(12);
        }
        return this.f52987a.k(fVar);
    }

    public d j() {
        d dVar = this.f52987a;
        if (dVar == null) {
            a(5);
        }
        return dVar;
    }

    public String toString() {
        return this.f52987a.toString();
    }

    public c(d dVar) {
        if (dVar == null) {
            a(2);
        }
        this.f52987a = dVar;
    }

    private c(d dVar, c cVar) {
        if (dVar == null) {
            a(3);
        }
        this.f52987a = dVar;
        this.f52988b = cVar;
    }
}