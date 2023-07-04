package ln;

import java.util.Objects;

/* loaded from: classes2.dex */
final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final String f37238a;

    /* renamed from: b  reason: collision with root package name */
    private final String f37239b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f37238a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f37239b = str2;
    }

    @Override // ln.f
    public String b() {
        return this.f37238a;
    }

    @Override // ln.f
    public String c() {
        return this.f37239b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.f37238a.equals(fVar.b()) && this.f37239b.equals(fVar.c());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f37238a.hashCode() ^ 1000003) * 1000003) ^ this.f37239b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f37238a + ", version=" + this.f37239b + "}";
    }
}