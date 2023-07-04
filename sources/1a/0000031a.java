package androidx.camera.core;

import androidx.camera.core.impl.l1;
import java.util.Objects;

/* loaded from: classes.dex */
final class e extends m0 {

    /* renamed from: a  reason: collision with root package name */
    private final l1 f2192a;

    /* renamed from: b  reason: collision with root package name */
    private final long f2193b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2194c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(l1 l1Var, long j11, int i11) {
        Objects.requireNonNull(l1Var, "Null tagBundle");
        this.f2192a = l1Var;
        this.f2193b = j11;
        this.f2194c = i11;
    }

    @Override // androidx.camera.core.m0, z.j0
    public l1 a() {
        return this.f2192a;
    }

    @Override // androidx.camera.core.m0, z.j0
    public int c() {
        return this.f2194c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m0) {
            m0 m0Var = (m0) obj;
            return this.f2192a.equals(m0Var.a()) && this.f2193b == m0Var.getTimestamp() && this.f2194c == m0Var.c();
        }
        return false;
    }

    @Override // androidx.camera.core.m0, z.j0
    public long getTimestamp() {
        return this.f2193b;
    }

    public int hashCode() {
        long j11 = this.f2193b;
        return ((((this.f2192a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f2194c;
    }

    public String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f2192a + ", timestamp=" + this.f2193b + ", rotationDegrees=" + this.f2194c + "}";
    }
}