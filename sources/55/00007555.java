package p001if;

import ud.a;

/* renamed from: if.e  reason: invalid package */
/* loaded from: classes3.dex */
public class e {

    /* renamed from: c  reason: collision with root package name */
    private static final e f30389c = new e(-1, false);

    /* renamed from: d  reason: collision with root package name */
    private static final e f30390d = new e(-2, false);

    /* renamed from: e  reason: collision with root package name */
    private static final e f30391e = new e(-1, true);

    /* renamed from: a  reason: collision with root package name */
    private final int f30392a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f30393b;

    private e(int i11, boolean z11) {
        this.f30392a = i11;
        this.f30393b = z11;
    }

    public static e a() {
        return f30389c;
    }

    public static e b() {
        return f30391e;
    }

    public static e d() {
        return f30390d;
    }

    public boolean c() {
        return this.f30393b;
    }

    public int e() {
        if (!g()) {
            return this.f30392a;
        }
        throw new IllegalStateException("Rotation is set to use EXIF");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f30392a == eVar.f30392a && this.f30393b == eVar.f30393b;
        }
        return false;
    }

    public boolean f() {
        return this.f30392a != -2;
    }

    public boolean g() {
        return this.f30392a == -1;
    }

    public int hashCode() {
        return a.c(Integer.valueOf(this.f30392a), Boolean.valueOf(this.f30393b));
    }

    public String toString() {
        return String.format(null, "%d defer:%b", Integer.valueOf(this.f30392a), Boolean.valueOf(this.f30393b));
    }
}