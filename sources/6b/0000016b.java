package am;

import am.c0;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class x extends c0.a {

    /* renamed from: a */
    private final String f891a;

    /* renamed from: b */
    private final String f892b;

    /* renamed from: c */
    private final String f893c;

    /* renamed from: d */
    private final String f894d;

    /* renamed from: e */
    private final int f895e;

    /* renamed from: f */
    private final wl.e f896f;

    public x(String str, String str2, String str3, String str4, int i11, wl.e eVar) {
        Objects.requireNonNull(str, "Null appIdentifier");
        this.f891a = str;
        Objects.requireNonNull(str2, "Null versionCode");
        this.f892b = str2;
        Objects.requireNonNull(str3, "Null versionName");
        this.f893c = str3;
        Objects.requireNonNull(str4, "Null installUuid");
        this.f894d = str4;
        this.f895e = i11;
        Objects.requireNonNull(eVar, "Null developmentPlatformProvider");
        this.f896f = eVar;
    }

    @Override // am.c0.a
    public String a() {
        return this.f891a;
    }

    @Override // am.c0.a
    public int c() {
        return this.f895e;
    }

    @Override // am.c0.a
    public wl.e d() {
        return this.f896f;
    }

    @Override // am.c0.a
    public String e() {
        return this.f894d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0.a) {
            c0.a aVar = (c0.a) obj;
            return this.f891a.equals(aVar.a()) && this.f892b.equals(aVar.f()) && this.f893c.equals(aVar.g()) && this.f894d.equals(aVar.e()) && this.f895e == aVar.c() && this.f896f.equals(aVar.d());
        }
        return false;
    }

    @Override // am.c0.a
    public String f() {
        return this.f892b;
    }

    @Override // am.c0.a
    public String g() {
        return this.f893c;
    }

    public int hashCode() {
        return ((((((((((this.f891a.hashCode() ^ 1000003) * 1000003) ^ this.f892b.hashCode()) * 1000003) ^ this.f893c.hashCode()) * 1000003) ^ this.f894d.hashCode()) * 1000003) ^ this.f895e) * 1000003) ^ this.f896f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f891a + ", versionCode=" + this.f892b + ", versionName=" + this.f893c + ", installUuid=" + this.f894d + ", deliveryMechanism=" + this.f895e + ", developmentPlatformProvider=" + this.f896f + "}";
    }
}