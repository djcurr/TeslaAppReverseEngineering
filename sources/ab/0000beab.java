package x2;

import ch.qos.logback.core.CoreConstants;
import x2.d;

/* loaded from: classes.dex */
final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private final float f56935a;

    /* renamed from: b  reason: collision with root package name */
    private final float f56936b;

    public e(float f11, float f12) {
        this.f56935a = f11;
        this.f56936b = f12;
    }

    @Override // x2.d
    public int G(float f11) {
        return d.a.b(this, f11);
    }

    @Override // x2.d
    public float M(long j11) {
        return d.a.d(this, j11);
    }

    @Override // x2.d
    public float b0(int i11) {
        return d.a.c(this, i11);
    }

    @Override // x2.d
    public float c0() {
        return this.f56936b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return kotlin.jvm.internal.s.c(Float.valueOf(getDensity()), Float.valueOf(eVar.getDensity())) && kotlin.jvm.internal.s.c(Float.valueOf(c0()), Float.valueOf(eVar.c0()));
        }
        return false;
    }

    @Override // x2.d
    public float getDensity() {
        return this.f56935a;
    }

    public int hashCode() {
        return (Float.hashCode(getDensity()) * 31) + Float.hashCode(c0());
    }

    @Override // x2.d
    public float i0(float f11) {
        return d.a.e(this, f11);
    }

    @Override // x2.d
    public int l0(long j11) {
        return d.a.a(this, j11);
    }

    @Override // x2.d
    public long p0(long j11) {
        return d.a.f(this, j11);
    }

    public String toString() {
        return "DensityImpl(density=" + getDensity() + ", fontScale=" + c0() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}