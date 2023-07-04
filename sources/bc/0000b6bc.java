package u1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class h extends c {

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String name, int i11) {
        super(name, b.f52891a.a(), i11, null);
        s.g(name, "name");
    }

    @Override // u1.c
    public float[] a(float[] v11) {
        float l11;
        float l12;
        float l13;
        s.g(v11, "v");
        float f11 = v11[0];
        g gVar = g.f52932a;
        float f12 = f11 / gVar.c()[0];
        float f13 = v11[1] / gVar.c()[1];
        float f14 = v11[2] / gVar.c()[2];
        float pow = f12 > 0.008856452f ? (float) Math.pow(f12, 0.33333334f) : (f12 * 7.787037f) + 0.13793103f;
        float pow2 = f13 > 0.008856452f ? (float) Math.pow(f13, 0.33333334f) : (f13 * 7.787037f) + 0.13793103f;
        float pow3 = f14 > 0.008856452f ? (float) Math.pow(f14, 0.33333334f) : (f14 * 7.787037f) + 0.13793103f;
        l11 = m00.l.l((116.0f * pow2) - 16.0f, BitmapDescriptorFactory.HUE_RED, 100.0f);
        v11[0] = l11;
        l12 = m00.l.l((pow - pow2) * 500.0f, -128.0f, 128.0f);
        v11[1] = l12;
        l13 = m00.l.l((pow2 - pow3) * 200.0f, -128.0f, 128.0f);
        v11[2] = l13;
        return v11;
    }

    @Override // u1.c
    public float d(int i11) {
        return i11 == 0 ? 100.0f : 128.0f;
    }

    @Override // u1.c
    public float e(int i11) {
        if (i11 == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return -128.0f;
    }

    @Override // u1.c
    public float[] i(float[] v11) {
        float l11;
        float l12;
        float l13;
        s.g(v11, "v");
        l11 = m00.l.l(v11[0], BitmapDescriptorFactory.HUE_RED, 100.0f);
        v11[0] = l11;
        l12 = m00.l.l(v11[1], -128.0f, 128.0f);
        v11[1] = l12;
        l13 = m00.l.l(v11[2], -128.0f, 128.0f);
        v11[2] = l13;
        float f11 = (v11[0] + 16.0f) / 116.0f;
        float f12 = (v11[1] * 0.002f) + f11;
        float f13 = f11 - (v11[2] * 0.005f);
        float f14 = f12 > 0.20689656f ? f12 * f12 * f12 : (f12 - 0.13793103f) * 0.12841855f;
        float f15 = f11 > 0.20689656f ? f11 * f11 * f11 : (f11 - 0.13793103f) * 0.12841855f;
        float f16 = f13 > 0.20689656f ? f13 * f13 * f13 : (f13 - 0.13793103f) * 0.12841855f;
        g gVar = g.f52932a;
        v11[0] = f14 * gVar.c()[0];
        v11[1] = f15 * gVar.c()[1];
        v11[2] = f16 * gVar.c()[2];
        return v11;
    }
}