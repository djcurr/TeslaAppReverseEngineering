package androidx.camera.core;

import android.graphics.Rect;
import androidx.camera.core.e1;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g extends e1.g {

    /* renamed from: a  reason: collision with root package name */
    private final Rect f2234a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2235b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2236c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Rect rect, int i11, int i12) {
        Objects.requireNonNull(rect, "Null cropRect");
        this.f2234a = rect;
        this.f2235b = i11;
        this.f2236c = i12;
    }

    @Override // androidx.camera.core.e1.g
    public Rect a() {
        return this.f2234a;
    }

    @Override // androidx.camera.core.e1.g
    public int b() {
        return this.f2235b;
    }

    @Override // androidx.camera.core.e1.g
    public int c() {
        return this.f2236c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e1.g) {
            e1.g gVar = (e1.g) obj;
            return this.f2234a.equals(gVar.a()) && this.f2235b == gVar.b() && this.f2236c == gVar.c();
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f2234a.hashCode() ^ 1000003) * 1000003) ^ this.f2235b) * 1000003) ^ this.f2236c;
    }

    public String toString() {
        return "TransformationInfo{cropRect=" + this.f2234a + ", rotationDegrees=" + this.f2235b + ", targetRotation=" + this.f2236c + "}";
    }
}