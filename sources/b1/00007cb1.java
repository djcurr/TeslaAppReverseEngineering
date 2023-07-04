package k0;

import ch.qos.logback.core.CoreConstants;
import l0.c0;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final float f34176a;

    /* renamed from: b  reason: collision with root package name */
    private final c0<Float> f34177b;

    public p(float f11, c0<Float> animationSpec) {
        kotlin.jvm.internal.s.g(animationSpec, "animationSpec");
        this.f34176a = f11;
        this.f34177b = animationSpec;
    }

    public final float a() {
        return this.f34176a;
    }

    public final c0<Float> b() {
        return this.f34177b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return kotlin.jvm.internal.s.c(Float.valueOf(this.f34176a), Float.valueOf(pVar.f34176a)) && kotlin.jvm.internal.s.c(this.f34177b, pVar.f34177b);
        }
        return false;
    }

    public int hashCode() {
        return (Float.hashCode(this.f34176a) * 31) + this.f34177b.hashCode();
    }

    public String toString() {
        return "Fade(alpha=" + this.f34176a + ", animationSpec=" + this.f34177b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}