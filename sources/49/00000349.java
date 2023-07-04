package androidx.camera.core.impl;

import android.util.Size;
import java.util.Objects;

/* loaded from: classes.dex */
final class d extends k1 {

    /* renamed from: a  reason: collision with root package name */
    private final Size f2282a;

    /* renamed from: b  reason: collision with root package name */
    private final Size f2283b;

    /* renamed from: c  reason: collision with root package name */
    private final Size f2284c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Size size, Size size2, Size size3) {
        Objects.requireNonNull(size, "Null analysisSize");
        this.f2282a = size;
        Objects.requireNonNull(size2, "Null previewSize");
        this.f2283b = size2;
        Objects.requireNonNull(size3, "Null recordSize");
        this.f2284c = size3;
    }

    @Override // androidx.camera.core.impl.k1
    public Size b() {
        return this.f2282a;
    }

    @Override // androidx.camera.core.impl.k1
    public Size c() {
        return this.f2283b;
    }

    @Override // androidx.camera.core.impl.k1
    public Size d() {
        return this.f2284c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k1) {
            k1 k1Var = (k1) obj;
            return this.f2282a.equals(k1Var.b()) && this.f2283b.equals(k1Var.c()) && this.f2284c.equals(k1Var.d());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f2282a.hashCode() ^ 1000003) * 1000003) ^ this.f2283b.hashCode()) * 1000003) ^ this.f2284c.hashCode();
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f2282a + ", previewSize=" + this.f2283b + ", recordSize=" + this.f2284c + "}";
    }
}