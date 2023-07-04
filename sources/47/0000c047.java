package y0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Set;

/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a  reason: collision with root package name */
    public static final c1 f57955a = new c1();

    /* renamed from: b  reason: collision with root package name */
    private static final l0.v0<Float> f57956b = new l0.v0<>(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);

    /* renamed from: c  reason: collision with root package name */
    private static final float f57957c = x2.g.f(125);

    private c1() {
    }

    public static /* synthetic */ w0 d(c1 c1Var, Set set, float f11, float f12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f11 = 10.0f;
        }
        if ((i11 & 4) != 0) {
            f12 = 10.0f;
        }
        return c1Var.c(set, f11, f12);
    }

    public final l0.v0<Float> a() {
        return f57956b;
    }

    public final float b() {
        return f57957c;
    }

    public final w0 c(Set<Float> anchors, float f11, float f12) {
        Float s02;
        Float u02;
        kotlin.jvm.internal.s.g(anchors, "anchors");
        if (anchors.size() <= 1) {
            return null;
        }
        s02 = wz.e0.s0(anchors);
        kotlin.jvm.internal.s.e(s02);
        float floatValue = s02.floatValue();
        u02 = wz.e0.u0(anchors);
        kotlin.jvm.internal.s.e(u02);
        return new w0(floatValue - u02.floatValue(), f11, f12);
    }
}