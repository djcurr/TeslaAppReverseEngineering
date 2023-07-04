package t1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class c0 {
    /* JADX WARN: Removed duplicated region for block: B:108:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long a(float r9, float r10, float r11, float r12, u1.c r13) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.c0.a(float, float, float, float, u1.c):long");
    }

    public static final long b(int i11) {
        return a0.i(vz.y.b(vz.y.b(i11) << 32));
    }

    public static final long c(long j11) {
        return a0.i(vz.y.b(vz.y.b(vz.y.b(j11) & 4294967295L) << 32));
    }

    public static final /* synthetic */ float[] d(long j11) {
        return f(j11);
    }

    public static final long e(long j11, long j12) {
        long j13 = a0.j(j11, a0.q(j12));
        float o11 = a0.o(j12);
        float o12 = a0.o(j13);
        float f11 = 1.0f - o12;
        float f12 = (o11 * f11) + o12;
        float s11 = a0.s(j13);
        float s12 = a0.s(j12);
        float f13 = BitmapDescriptorFactory.HUE_RED;
        int i11 = (f12 > BitmapDescriptorFactory.HUE_RED ? 1 : (f12 == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
        float f14 = i11 == 0 ? 0.0f : ((s11 * o12) + ((s12 * o11) * f11)) / f12;
        float r11 = i11 == 0 ? 0.0f : ((a0.r(j13) * o12) + ((a0.r(j12) * o11) * f11)) / f12;
        float p11 = a0.p(j13);
        float p12 = a0.p(j12);
        if (!(i11 == 0)) {
            f13 = ((p11 * o12) + ((p12 * o11) * f11)) / f12;
        }
        return a(f14, r11, f13, f12, a0.q(j12));
    }

    public static final float[] f(long j11) {
        return new float[]{a0.s(j11), a0.r(j11), a0.p(j11), a0.o(j11)};
    }

    public static final long g(long j11, long j12, float f11) {
        u1.c p11 = u1.e.f52899a.p();
        long j13 = a0.j(j11, p11);
        long j14 = a0.j(j12, p11);
        float o11 = a0.o(j13);
        float s11 = a0.s(j13);
        float r11 = a0.r(j13);
        float p12 = a0.p(j13);
        float o12 = a0.o(j14);
        float s12 = a0.s(j14);
        float r12 = a0.r(j14);
        float p13 = a0.p(j14);
        return a0.j(a(y2.a.a(s11, s12, f11), y2.a.a(r11, r12, f11), y2.a.a(p12, p13, f11), y2.a.a(o11, o12, f11), p11), a0.q(j12));
    }

    public static final float h(long j11) {
        u1.c q11 = a0.q(j11);
        if (u1.b.e(q11.f(), u1.b.f52891a.b())) {
            h00.l<Double, Double> l11 = ((u1.k) q11).l();
            return i((float) ((l11.invoke(Double.valueOf(a0.s(j11))).doubleValue() * 0.2126d) + (l11.invoke(Double.valueOf(a0.r(j11))).doubleValue() * 0.7152d) + (l11.invoke(Double.valueOf(a0.p(j11))).doubleValue() * 0.0722d)));
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.s.p("The specified color must be encoded in an RGB color space. The supplied color space is ", u1.b.h(q11.f())).toString());
    }

    private static final float i(float f11) {
        if (f11 <= BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (f11 >= 1.0f) {
            return 1.0f;
        }
        return f11;
    }

    public static final int j(long j11) {
        u1.c q11 = a0.q(j11);
        if (q11.h()) {
            return (int) vz.y.b(j11 >>> 32);
        }
        float[] f11 = f(j11);
        u1.d.i(q11, null, 0, 3, null).a(f11);
        return ((int) ((f11[2] * 255.0f) + 0.5f)) | (((int) ((f11[3] * 255.0f) + 0.5f)) << 24) | (((int) ((f11[0] * 255.0f) + 0.5f)) << 16) | (((int) ((f11[1] * 255.0f) + 0.5f)) << 8);
    }
}