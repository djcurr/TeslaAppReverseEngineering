package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.e1;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f extends e1.f {

    /* renamed from: a  reason: collision with root package name */
    private final int f2218a;

    /* renamed from: b  reason: collision with root package name */
    private final Surface f2219b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(int i11, Surface surface) {
        this.f2218a = i11;
        Objects.requireNonNull(surface, "Null surface");
        this.f2219b = surface;
    }

    @Override // androidx.camera.core.e1.f
    public int a() {
        return this.f2218a;
    }

    @Override // androidx.camera.core.e1.f
    public Surface b() {
        return this.f2219b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e1.f) {
            e1.f fVar = (e1.f) obj;
            return this.f2218a == fVar.a() && this.f2219b.equals(fVar.b());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f2218a ^ 1000003) * 1000003) ^ this.f2219b.hashCode();
    }

    public String toString() {
        return "Result{resultCode=" + this.f2218a + ", surface=" + this.f2219b + "}";
    }
}