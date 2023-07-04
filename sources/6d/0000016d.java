package am;

import am.c0;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class z extends c0.c {

    /* renamed from: a  reason: collision with root package name */
    private final String f906a;

    /* renamed from: b  reason: collision with root package name */
    private final String f907b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f908c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(String str, String str2, boolean z11) {
        Objects.requireNonNull(str, "Null osRelease");
        this.f906a = str;
        Objects.requireNonNull(str2, "Null osCodeName");
        this.f907b = str2;
        this.f908c = z11;
    }

    @Override // am.c0.c
    public boolean b() {
        return this.f908c;
    }

    @Override // am.c0.c
    public String c() {
        return this.f907b;
    }

    @Override // am.c0.c
    public String d() {
        return this.f906a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0.c) {
            c0.c cVar = (c0.c) obj;
            return this.f906a.equals(cVar.d()) && this.f907b.equals(cVar.c()) && this.f908c == cVar.b();
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f906a.hashCode() ^ 1000003) * 1000003) ^ this.f907b.hashCode()) * 1000003) ^ (this.f908c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f906a + ", osCodeName=" + this.f907b + ", isRooted=" + this.f908c + "}";
    }
}