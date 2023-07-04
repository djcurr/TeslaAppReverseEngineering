package y0;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class b0 implements p1 {

    /* renamed from: a  reason: collision with root package name */
    private final float f57902a;

    private b0(float f11) {
        this.f57902a = f11;
    }

    public /* synthetic */ b0(float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11);
    }

    @Override // y0.p1
    public float a(x2.d dVar, float f11, float f12) {
        kotlin.jvm.internal.s.g(dVar, "<this>");
        return f11 + (dVar.i0(this.f57902a) * Math.signum(f12 - f11));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && x2.g.h(this.f57902a, ((b0) obj).f57902a);
    }

    public int hashCode() {
        return x2.g.i(this.f57902a);
    }

    public String toString() {
        return "FixedThreshold(offset=" + ((Object) x2.g.k(this.f57902a)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}