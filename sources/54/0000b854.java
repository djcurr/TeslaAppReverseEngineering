package v0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    private final float f53780a;

    private d(float f11) {
        this.f53780a = f11;
    }

    public /* synthetic */ d(float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11);
    }

    @Override // v0.b
    public float a(long j11, x2.d density) {
        s.g(density, "density");
        return density.i0(this.f53780a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && x2.g.h(this.f53780a, ((d) obj).f53780a);
    }

    public int hashCode() {
        return x2.g.i(this.f53780a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f53780a + ".dp)";
    }
}