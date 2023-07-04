package k20;

import org.slf4j.Marker;

/* loaded from: classes5.dex */
public abstract class z0 implements y0 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y0) {
            y0 y0Var = (y0) obj;
            return a() == y0Var.a() && b() == y0Var.b() && getType().equals(y0Var.getType());
        }
        return false;
    }

    public int hashCode() {
        int hashCode = b().hashCode();
        if (f1.w(getType())) {
            return (hashCode * 31) + 19;
        }
        return (hashCode * 31) + (a() ? 17 : getType().hashCode());
    }

    public String toString() {
        if (a()) {
            return Marker.ANY_MARKER;
        }
        if (b() == k1.INVARIANT) {
            return getType().toString();
        }
        return b() + " " + getType();
    }
}