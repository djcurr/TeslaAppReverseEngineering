package e2;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final List<Float> f24530a;

    /* renamed from: b  reason: collision with root package name */
    private final float f24531b;

    public c(List<Float> coefficients, float f11) {
        s.g(coefficients, "coefficients");
        this.f24530a = coefficients;
        this.f24531b = f11;
    }

    public final List<Float> a() {
        return this.f24530a;
    }

    public final float b() {
        return this.f24531b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return s.c(this.f24530a, cVar.f24530a) && s.c(Float.valueOf(this.f24531b), Float.valueOf(cVar.f24531b));
        }
        return false;
    }

    public int hashCode() {
        return (this.f24530a.hashCode() * 31) + Float.hashCode(this.f24531b);
    }

    public String toString() {
        return "PolynomialFit(coefficients=" + this.f24530a + ", confidence=" + this.f24531b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}