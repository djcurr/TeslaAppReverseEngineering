package k0;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f34045a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final float[] f34046b;

    /* renamed from: c  reason: collision with root package name */
    private static final float[] f34047c;

    /* renamed from: k0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0628a {

        /* renamed from: a  reason: collision with root package name */
        private final float f34048a;

        /* renamed from: b  reason: collision with root package name */
        private final float f34049b;

        public C0628a(float f11, float f12) {
            this.f34048a = f11;
            this.f34049b = f12;
        }

        public final float a() {
            return this.f34048a;
        }

        public final float b() {
            return this.f34049b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0628a) {
                C0628a c0628a = (C0628a) obj;
                return kotlin.jvm.internal.s.c(Float.valueOf(this.f34048a), Float.valueOf(c0628a.f34048a)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f34049b), Float.valueOf(c0628a.f34049b));
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f34048a) * 31) + Float.hashCode(this.f34049b);
        }

        public String toString() {
            return "FlingResult(distanceCoefficient=" + this.f34048a + ", velocityCoefficient=" + this.f34049b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    static {
        float[] fArr = new float[101];
        f34046b = fArr;
        float[] fArr2 = new float[101];
        f34047c = fArr2;
        x.b(fArr, fArr2, 100);
    }

    private a() {
    }

    public final double a(float f11, float f12) {
        return Math.log((Math.abs(f11) * 0.35f) / f12);
    }

    public final C0628a b(float f11) {
        float f12;
        float f13;
        float f14 = 100;
        int i11 = (int) (f14 * f11);
        if (i11 < 100) {
            float f15 = i11 / f14;
            int i12 = i11 + 1;
            float f16 = i12 / f14;
            float[] fArr = f34046b;
            float f17 = fArr[i11];
            f13 = (fArr[i12] - f17) / (f16 - f15);
            f12 = f17 + ((f11 - f15) * f13);
        } else {
            f12 = 1.0f;
            f13 = BitmapDescriptorFactory.HUE_RED;
        }
        return new C0628a(f12, f13);
    }
}