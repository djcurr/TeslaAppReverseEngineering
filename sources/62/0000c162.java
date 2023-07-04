package y10;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final u10.b f58966a;

    /* renamed from: b  reason: collision with root package name */
    private final int f58967b;

    public f(u10.b classId, int i11) {
        kotlin.jvm.internal.s.g(classId, "classId");
        this.f58966a = classId;
        this.f58967b = i11;
    }

    public final u10.b a() {
        return this.f58966a;
    }

    public final int b() {
        return this.f58967b;
    }

    public final int c() {
        return this.f58967b;
    }

    public final u10.b d() {
        return this.f58966a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return kotlin.jvm.internal.s.c(this.f58966a, fVar.f58966a) && this.f58967b == fVar.f58967b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f58966a.hashCode() * 31) + this.f58967b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int c11 = c();
        for (int i11 = 0; i11 < c11; i11++) {
            sb2.append("kotlin/Array<");
        }
        sb2.append(d());
        int c12 = c();
        for (int i12 = 0; i12 < c12; i12++) {
            sb2.append(">");
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.s.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}