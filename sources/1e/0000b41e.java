package t1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class k0 {

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    public static float[] a(float[] values) {
        kotlin.jvm.internal.s.g(values, "values");
        return values;
    }

    public static /* synthetic */ float[] b(float[] fArr, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 1) != 0) {
            fArr = new float[]{1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f};
        }
        return a(fArr);
    }

    public static final long c(float[] arg0, long j11) {
        kotlin.jvm.internal.s.g(arg0, "arg0");
        float l11 = s1.f.l(j11);
        float m11 = s1.f.m(j11);
        float f11 = (arg0[3] * l11) + (arg0[7] * m11) + arg0[15];
        float f12 = BitmapDescriptorFactory.HUE_RED;
        if (!(f11 == BitmapDescriptorFactory.HUE_RED)) {
            f12 = 1.0f / f11;
        }
        return s1.g.a(((arg0[0] * l11) + (arg0[4] * m11) + arg0[12]) * f12, f12 * ((arg0[1] * l11) + (arg0[5] * m11) + arg0[13]));
    }

    public static final void d(float[] arg0, s1.d rect) {
        kotlin.jvm.internal.s.g(arg0, "arg0");
        kotlin.jvm.internal.s.g(rect, "rect");
        long c11 = c(arg0, s1.g.a(rect.b(), rect.d()));
        long c12 = c(arg0, s1.g.a(rect.b(), rect.a()));
        long c13 = c(arg0, s1.g.a(rect.c(), rect.d()));
        long c14 = c(arg0, s1.g.a(rect.c(), rect.a()));
        rect.i(Math.min(Math.min(s1.f.l(c11), s1.f.l(c12)), Math.min(s1.f.l(c13), s1.f.l(c14))));
        rect.k(Math.min(Math.min(s1.f.m(c11), s1.f.m(c12)), Math.min(s1.f.m(c13), s1.f.m(c14))));
        rect.j(Math.max(Math.max(s1.f.l(c11), s1.f.l(c12)), Math.max(s1.f.l(c13), s1.f.l(c14))));
        rect.h(Math.max(Math.max(s1.f.m(c11), s1.f.m(c12)), Math.max(s1.f.m(c13), s1.f.m(c14))));
    }

    public static final void e(float[] arg0) {
        kotlin.jvm.internal.s.g(arg0, "arg0");
        int i11 = 0;
        while (i11 < 4) {
            int i12 = i11 + 1;
            int i13 = 0;
            while (i13 < 4) {
                int i14 = i13 + 1;
                arg0[(i13 * 4) + i11] = i11 == i13 ? 1.0f : BitmapDescriptorFactory.HUE_RED;
                i13 = i14;
            }
            i11 = i12;
        }
    }

    public static final void f(float[] arg0, float f11) {
        kotlin.jvm.internal.s.g(arg0, "arg0");
        double d11 = (f11 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d11);
        float sin = (float) Math.sin(d11);
        float f12 = arg0[0];
        float f13 = arg0[4];
        float f14 = -sin;
        float f15 = arg0[1];
        float f16 = arg0[5];
        float f17 = arg0[2];
        float f18 = arg0[6];
        float f19 = arg0[3];
        float f21 = arg0[7];
        arg0[0] = (cos * f12) + (sin * f13);
        arg0[1] = (cos * f15) + (sin * f16);
        arg0[2] = (cos * f17) + (sin * f18);
        arg0[3] = (cos * f19) + (sin * f21);
        arg0[4] = (f12 * f14) + (f13 * cos);
        arg0[5] = (f15 * f14) + (f16 * cos);
        arg0[6] = (f17 * f14) + (f18 * cos);
        arg0[7] = (f14 * f19) + (cos * f21);
    }

    public static final void g(float[] arg0, float f11, float f12, float f13) {
        kotlin.jvm.internal.s.g(arg0, "arg0");
        arg0[0] = arg0[0] * f11;
        arg0[1] = arg0[1] * f11;
        arg0[2] = arg0[2] * f11;
        arg0[3] = arg0[3] * f11;
        arg0[4] = arg0[4] * f12;
        arg0[5] = arg0[5] * f12;
        arg0[6] = arg0[6] * f12;
        arg0[7] = arg0[7] * f12;
        arg0[8] = arg0[8] * f13;
        arg0[9] = arg0[9] * f13;
        arg0[10] = arg0[10] * f13;
        arg0[11] = arg0[11] * f13;
    }

    public static final void h(float[] arg0, float f11, float f12, float f13) {
        kotlin.jvm.internal.s.g(arg0, "arg0");
        float f14 = (arg0[0] * f11) + (arg0[4] * f12) + (arg0[8] * f13) + arg0[12];
        float f15 = (arg0[1] * f11) + (arg0[5] * f12) + (arg0[9] * f13) + arg0[13];
        float f16 = (arg0[2] * f11) + (arg0[6] * f12) + (arg0[10] * f13) + arg0[14];
        arg0[12] = f14;
        arg0[13] = f15;
        arg0[14] = f16;
        arg0[15] = (arg0[3] * f11) + (arg0[7] * f12) + (arg0[11] * f13) + arg0[15];
    }

    public static /* synthetic */ void i(float[] fArr, float f11, float f12, float f13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 2) != 0) {
            f12 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            f13 = 0.0f;
        }
        h(fArr, f11, f12, f13);
    }
}