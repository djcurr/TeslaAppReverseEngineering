package y0;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a  reason: collision with root package name */
    private final float f58710a;

    /* renamed from: b  reason: collision with root package name */
    private final float f58711b;

    /* renamed from: c  reason: collision with root package name */
    private final float f58712c;

    public w0(float f11, float f12, float f13) {
        this.f58710a = f11;
        this.f58711b = f12;
        this.f58712c = f13;
    }

    public final float a(float f11) {
        float l11;
        float f12 = f11 < BitmapDescriptorFactory.HUE_RED ? this.f58711b : this.f58712c;
        if (f12 == BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        l11 = m00.l.l(f11 / this.f58710a, -1.0f, 1.0f);
        return (this.f58710a / f12) * ((float) Math.sin((l11 * 3.1415927f) / 2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            if (this.f58710a == w0Var.f58710a) {
                if (this.f58711b == w0Var.f58711b) {
                    return (this.f58712c > w0Var.f58712c ? 1 : (this.f58712c == w0Var.f58712c ? 0 : -1)) == 0;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f58710a) * 31) + Float.hashCode(this.f58711b)) * 31) + Float.hashCode(this.f58712c);
    }

    public String toString() {
        return "ResistanceConfig(basis=" + this.f58710a + ", factorAtMin=" + this.f58711b + ", factorAtMax=" + this.f58712c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}