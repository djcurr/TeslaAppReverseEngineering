package am;

import am.c0;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class y extends c0.b {

    /* renamed from: a  reason: collision with root package name */
    private final int f897a;

    /* renamed from: b  reason: collision with root package name */
    private final String f898b;

    /* renamed from: c  reason: collision with root package name */
    private final int f899c;

    /* renamed from: d  reason: collision with root package name */
    private final long f900d;

    /* renamed from: e  reason: collision with root package name */
    private final long f901e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f902f;

    /* renamed from: g  reason: collision with root package name */
    private final int f903g;

    /* renamed from: h  reason: collision with root package name */
    private final String f904h;

    /* renamed from: i  reason: collision with root package name */
    private final String f905i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(int i11, String str, int i12, long j11, long j12, boolean z11, int i13, String str2, String str3) {
        this.f897a = i11;
        Objects.requireNonNull(str, "Null model");
        this.f898b = str;
        this.f899c = i12;
        this.f900d = j11;
        this.f901e = j12;
        this.f902f = z11;
        this.f903g = i13;
        Objects.requireNonNull(str2, "Null manufacturer");
        this.f904h = str2;
        Objects.requireNonNull(str3, "Null modelClass");
        this.f905i = str3;
    }

    @Override // am.c0.b
    public int a() {
        return this.f897a;
    }

    @Override // am.c0.b
    public int b() {
        return this.f899c;
    }

    @Override // am.c0.b
    public long d() {
        return this.f901e;
    }

    @Override // am.c0.b
    public boolean e() {
        return this.f902f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0.b) {
            c0.b bVar = (c0.b) obj;
            return this.f897a == bVar.a() && this.f898b.equals(bVar.g()) && this.f899c == bVar.b() && this.f900d == bVar.j() && this.f901e == bVar.d() && this.f902f == bVar.e() && this.f903g == bVar.i() && this.f904h.equals(bVar.f()) && this.f905i.equals(bVar.h());
        }
        return false;
    }

    @Override // am.c0.b
    public String f() {
        return this.f904h;
    }

    @Override // am.c0.b
    public String g() {
        return this.f898b;
    }

    @Override // am.c0.b
    public String h() {
        return this.f905i;
    }

    public int hashCode() {
        long j11 = this.f900d;
        long j12 = this.f901e;
        return ((((((((((((((((this.f897a ^ 1000003) * 1000003) ^ this.f898b.hashCode()) * 1000003) ^ this.f899c) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003) ^ (this.f902f ? 1231 : 1237)) * 1000003) ^ this.f903g) * 1000003) ^ this.f904h.hashCode()) * 1000003) ^ this.f905i.hashCode();
    }

    @Override // am.c0.b
    public int i() {
        return this.f903g;
    }

    @Override // am.c0.b
    public long j() {
        return this.f900d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f897a + ", model=" + this.f898b + ", availableProcessors=" + this.f899c + ", totalRam=" + this.f900d + ", diskSpace=" + this.f901e + ", isEmulator=" + this.f902f + ", state=" + this.f903g + ", manufacturer=" + this.f904h + ", modelClass=" + this.f905i + "}";
    }
}