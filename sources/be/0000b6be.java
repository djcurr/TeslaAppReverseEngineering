package u1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class i extends c {

    /* renamed from: d  reason: collision with root package name */
    private static final float[] f52938d;

    /* renamed from: e  reason: collision with root package name */
    private static final float[] f52939e;

    /* renamed from: f  reason: collision with root package name */
    private static final float[] f52940f;

    /* renamed from: g  reason: collision with root package name */
    private static final float[] f52941g;

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
        float[] c11 = u1.a.f52887b.b().c();
        g gVar = g.f52932a;
        float[] k11 = d.k(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, d.e(c11, gVar.b().c(), gVar.e().c()));
        f52938d = k11;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f52939e = fArr;
        f52940f = d.j(k11);
        f52941g = d.j(fArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String name, int i11) {
        super(name, b.f52891a.a(), i11, null);
        s.g(name, "name");
    }

    @Override // u1.c
    public float[] a(float[] v11) {
        s.g(v11, "v");
        d.m(f52938d, v11);
        double d11 = 0.33333334f;
        v11[0] = (float) Math.pow(v11[0], d11);
        v11[1] = (float) Math.pow(v11[1], d11);
        v11[2] = (float) Math.pow(v11[2], d11);
        d.m(f52939e, v11);
        return v11;
    }

    @Override // u1.c
    public float d(int i11) {
        return i11 == 0 ? 1.0f : 2.0f;
    }

    @Override // u1.c
    public float e(int i11) {
        if (i11 == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return -2.0f;
    }

    @Override // u1.c
    public float[] i(float[] v11) {
        float l11;
        float l12;
        float l13;
        s.g(v11, "v");
        l11 = m00.l.l(v11[0], BitmapDescriptorFactory.HUE_RED, 1.0f);
        v11[0] = l11;
        l12 = m00.l.l(v11[1], -2.0f, 2.0f);
        v11[1] = l12;
        l13 = m00.l.l(v11[2], -2.0f, 2.0f);
        v11[2] = l13;
        d.m(f52941g, v11);
        double d11 = 3.0f;
        v11[0] = (float) Math.pow(v11[0], d11);
        v11[1] = (float) Math.pow(v11[1], d11);
        v11[2] = (float) Math.pow(v11[2], d11);
        d.m(f52940f, v11);
        return v11;
    }
}