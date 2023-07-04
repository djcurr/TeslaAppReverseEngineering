package f2;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public final class g implements d {

    /* renamed from: b  reason: collision with root package name */
    private final float f25577b;

    public g(float f11) {
        this.f25577b = f11;
    }

    @Override // f2.d
    public long a(long j11, long j12) {
        float f11 = this.f25577b;
        return s0.a(f11, f11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && kotlin.jvm.internal.s.c(Float.valueOf(this.f25577b), Float.valueOf(((g) obj).f25577b));
    }

    public int hashCode() {
        return Float.hashCode(this.f25577b);
    }

    public String toString() {
        return "FixedScale(value=" + this.f25577b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}