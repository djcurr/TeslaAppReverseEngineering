package f8;

import android.graphics.Color;
import android.graphics.PointF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import g8.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class s {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f26104a = c.a.a("x", "y");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f26105a;

        static {
            int[] iArr = new int[c.b.values().length];
            f26105a = iArr;
            try {
                iArr[c.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26105a[c.b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26105a[c.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static PointF a(g8.c cVar, float f11) {
        cVar.g();
        float D = (float) cVar.D();
        float D2 = (float) cVar.D();
        while (cVar.e0() != c.b.END_ARRAY) {
            cVar.u0();
        }
        cVar.l();
        return new PointF(D * f11, D2 * f11);
    }

    private static PointF b(g8.c cVar, float f11) {
        float D = (float) cVar.D();
        float D2 = (float) cVar.D();
        while (cVar.p()) {
            cVar.u0();
        }
        return new PointF(D * f11, D2 * f11);
    }

    private static PointF c(g8.c cVar, float f11) {
        cVar.j();
        float f12 = BitmapDescriptorFactory.HUE_RED;
        float f13 = 0.0f;
        while (cVar.p()) {
            int p02 = cVar.p0(f26104a);
            if (p02 == 0) {
                f12 = g(cVar);
            } else if (p02 != 1) {
                cVar.t0();
                cVar.u0();
            } else {
                f13 = g(cVar);
            }
        }
        cVar.m();
        return new PointF(f12 * f11, f13 * f11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(g8.c cVar) {
        cVar.g();
        int D = (int) (cVar.D() * 255.0d);
        int D2 = (int) (cVar.D() * 255.0d);
        int D3 = (int) (cVar.D() * 255.0d);
        while (cVar.p()) {
            cVar.u0();
        }
        cVar.l();
        return Color.argb(255, D, D2, D3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PointF e(g8.c cVar, float f11) {
        int i11 = a.f26105a[cVar.e0().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return c(cVar, f11);
                }
                throw new IllegalArgumentException("Unknown point starts with " + cVar.e0());
            }
            return a(cVar, f11);
        }
        return b(cVar, f11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<PointF> f(g8.c cVar, float f11) {
        ArrayList arrayList = new ArrayList();
        cVar.g();
        while (cVar.e0() == c.b.BEGIN_ARRAY) {
            cVar.g();
            arrayList.add(e(cVar, f11));
            cVar.l();
        }
        cVar.l();
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float g(g8.c cVar) {
        c.b e02 = cVar.e0();
        int i11 = a.f26105a[e02.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                cVar.g();
                float D = (float) cVar.D();
                while (cVar.p()) {
                    cVar.u0();
                }
                cVar.l();
                return D;
            }
            throw new IllegalArgumentException("Unknown value for token of type " + e02);
        }
        return (float) cVar.D();
    }
}