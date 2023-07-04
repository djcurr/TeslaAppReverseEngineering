package k0;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final float f34178a;

    /* renamed from: b  reason: collision with root package name */
    private final x2.d f34179b;

    /* renamed from: c  reason: collision with root package name */
    private final float f34180c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final float f34181a;

        /* renamed from: b  reason: collision with root package name */
        private final float f34182b;

        /* renamed from: c  reason: collision with root package name */
        private final long f34183c;

        public a(float f11, float f12, long j11) {
            this.f34181a = f11;
            this.f34182b = f12;
            this.f34183c = j11;
        }

        public final float a(long j11) {
            long j12 = this.f34183c;
            return this.f34182b * Math.signum(this.f34181a) * k0.a.f34045a.b(j12 > 0 ? ((float) j11) / ((float) j12) : 1.0f).a();
        }

        public final float b(long j11) {
            long j12 = this.f34183c;
            return (((k0.a.f34045a.b(j12 > 0 ? ((float) j11) / ((float) j12) : 1.0f).b() * Math.signum(this.f34181a)) * this.f34182b) / ((float) this.f34183c)) * 1000.0f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return kotlin.jvm.internal.s.c(Float.valueOf(this.f34181a), Float.valueOf(aVar.f34181a)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f34182b), Float.valueOf(aVar.f34182b)) && this.f34183c == aVar.f34183c;
            }
            return false;
        }

        public int hashCode() {
            return (((Float.hashCode(this.f34181a) * 31) + Float.hashCode(this.f34182b)) * 31) + Long.hashCode(this.f34183c);
        }

        public String toString() {
            return "FlingInfo(initialVelocity=" + this.f34181a + ", distance=" + this.f34182b + ", duration=" + this.f34183c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public q(float f11, x2.d density) {
        kotlin.jvm.internal.s.g(density, "density");
        this.f34178a = f11;
        this.f34179b = density;
        this.f34180c = a(density);
    }

    private final float a(x2.d dVar) {
        float c11;
        c11 = r.c(0.84f, dVar.getDensity());
        return c11;
    }

    private final double e(float f11) {
        return k0.a.f34045a.a(f11, this.f34178a * this.f34180c);
    }

    public final float b(float f11) {
        float f12;
        float f13;
        double e11 = e(f11);
        f12 = r.f34184a;
        double d11 = this.f34178a * this.f34180c;
        f13 = r.f34184a;
        return (float) (d11 * Math.exp((f13 / (f12 - 1.0d)) * e11));
    }

    public final long c(float f11) {
        float f12;
        double e11 = e(f11);
        f12 = r.f34184a;
        return (long) (Math.exp(e11 / (f12 - 1.0d)) * 1000.0d);
    }

    public final a d(float f11) {
        float f12;
        float f13;
        double e11 = e(f11);
        f12 = r.f34184a;
        double d11 = f12 - 1.0d;
        f13 = r.f34184a;
        return new a(f11, (float) (this.f34178a * this.f34180c * Math.exp((f13 / d11) * e11)), (long) (Math.exp(e11 / d11) * 1000.0d));
    }
}