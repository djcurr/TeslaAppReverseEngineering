package androidx.camera.core.impl;

import androidx.camera.core.impl.j1;
import java.util.Objects;

/* loaded from: classes.dex */
final class c extends j1 {

    /* renamed from: a  reason: collision with root package name */
    private final j1.b f2276a;

    /* renamed from: b  reason: collision with root package name */
    private final j1.a f2277b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(j1.b bVar, j1.a aVar) {
        Objects.requireNonNull(bVar, "Null configType");
        this.f2276a = bVar;
        Objects.requireNonNull(aVar, "Null configSize");
        this.f2277b = aVar;
    }

    @Override // androidx.camera.core.impl.j1
    public j1.a b() {
        return this.f2277b;
    }

    @Override // androidx.camera.core.impl.j1
    public j1.b c() {
        return this.f2276a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j1) {
            j1 j1Var = (j1) obj;
            return this.f2276a.equals(j1Var.c()) && this.f2277b.equals(j1Var.b());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f2276a.hashCode() ^ 1000003) * 1000003) ^ this.f2277b.hashCode();
    }

    public String toString() {
        return "SurfaceConfig{configType=" + this.f2276a + ", configSize=" + this.f2277b + "}";
    }
}