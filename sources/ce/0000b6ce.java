package u1;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final float f52976a;

    /* renamed from: b  reason: collision with root package name */
    private final float f52977b;

    public m(float f11, float f12) {
        this.f52976a = f11;
        this.f52977b = f12;
    }

    public final float a() {
        return this.f52976a;
    }

    public final float b() {
        return this.f52977b;
    }

    public final float[] c() {
        float f11 = this.f52976a;
        float f12 = this.f52977b;
        return new float[]{f11 / f12, 1.0f, ((1.0f - f11) - f12) / f12};
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return s.c(Float.valueOf(this.f52976a), Float.valueOf(mVar.f52976a)) && s.c(Float.valueOf(this.f52977b), Float.valueOf(mVar.f52977b));
        }
        return false;
    }

    public int hashCode() {
        return (Float.hashCode(this.f52976a) * 31) + Float.hashCode(this.f52977b);
    }

    public String toString() {
        return "WhitePoint(x=" + this.f52976a + ", y=" + this.f52977b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}