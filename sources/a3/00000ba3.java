package b1;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final float f7205a;

    /* renamed from: b  reason: collision with root package name */
    private final float f7206b;

    /* renamed from: c  reason: collision with root package name */
    private final float f7207c;

    /* renamed from: d  reason: collision with root package name */
    private final float f7208d;

    public f(float f11, float f12, float f13, float f14) {
        this.f7205a = f11;
        this.f7206b = f12;
        this.f7207c = f13;
        this.f7208d = f14;
    }

    public final float a() {
        return this.f7205a;
    }

    public final float b() {
        return this.f7206b;
    }

    public final float c() {
        return this.f7207c;
    }

    public final float d() {
        return this.f7208d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f7205a == fVar.f7205a) {
                if (this.f7206b == fVar.f7206b) {
                    if (this.f7207c == fVar.f7207c) {
                        return (this.f7208d > fVar.f7208d ? 1 : (this.f7208d == fVar.f7208d ? 0 : -1)) == 0;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f7205a) * 31) + Float.hashCode(this.f7206b)) * 31) + Float.hashCode(this.f7207c)) * 31) + Float.hashCode(this.f7208d);
    }

    public String toString() {
        return "RippleAlpha(draggedAlpha=" + this.f7205a + ", focusedAlpha=" + this.f7206b + ", hoveredAlpha=" + this.f7207c + ", pressedAlpha=" + this.f7208d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}