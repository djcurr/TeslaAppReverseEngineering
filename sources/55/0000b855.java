package v0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.s;
import s1.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    private final float f53781a;

    public e(float f11) {
        this.f53781a = f11;
        if (f11 < BitmapDescriptorFactory.HUE_RED || f11 > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // v0.b
    public float a(long j11, x2.d density) {
        s.g(density, "density");
        return l.h(j11) * (this.f53781a / 100.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && s.c(Float.valueOf(this.f53781a), Float.valueOf(((e) obj).f53781a));
    }

    public int hashCode() {
        return Float.hashCode(this.f53781a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f53781a + "%)";
    }
}