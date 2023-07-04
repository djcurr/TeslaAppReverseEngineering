package z;

import android.graphics.PointF;
import android.util.Rational;

/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a  reason: collision with root package name */
    private Rational f59977a;

    public m0() {
        this(null);
    }

    public static float d() {
        return 0.15f;
    }

    protected abstract PointF a(float f11, float f12);

    public final l0 b(float f11, float f12) {
        return c(f11, f12, d());
    }

    public final l0 c(float f11, float f12, float f13) {
        PointF a11 = a(f11, f12);
        return new l0(a11.x, a11.y, f13, this.f59977a);
    }

    public m0(Rational rational) {
        this.f59977a = rational;
    }
}