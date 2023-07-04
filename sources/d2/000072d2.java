package h8;

import android.graphics.Path;
import android.graphics.PointF;
import c8.m;
import java.util.List;
import x7.k;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static final PointF f28988a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static double b(double d11, double d12, double d13) {
        return Math.max(d12, Math.min(d13, d11));
    }

    public static float c(float f11, float f12, float f13) {
        return Math.max(f12, Math.min(f13, f11));
    }

    public static int d(int i11, int i12, int i13) {
        return Math.max(i12, Math.min(i13, i11));
    }

    public static boolean e(float f11, float f12, float f13) {
        return f11 >= f12 && f11 <= f13;
    }

    private static int f(int i11, int i12) {
        int i13 = i11 / i12;
        return (((i11 ^ i12) >= 0) || i11 % i12 == 0) ? i13 : i13 - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(float f11, float f12) {
        return h((int) f11, (int) f12);
    }

    private static int h(int i11, int i12) {
        return i11 - (i12 * f(i11, i12));
    }

    public static void i(m mVar, Path path) {
        path.reset();
        PointF b11 = mVar.b();
        path.moveTo(b11.x, b11.y);
        f28988a.set(b11.x, b11.y);
        for (int i11 = 0; i11 < mVar.a().size(); i11++) {
            a8.a aVar = mVar.a().get(i11);
            PointF a11 = aVar.a();
            PointF b12 = aVar.b();
            PointF c11 = aVar.c();
            PointF pointF = f28988a;
            if (a11.equals(pointF) && b12.equals(c11)) {
                path.lineTo(c11.x, c11.y);
            } else {
                path.cubicTo(a11.x, a11.y, b12.x, b12.y, c11.x, c11.y);
            }
            pointF.set(c11.x, c11.y);
        }
        if (mVar.d()) {
            path.close();
        }
    }

    public static double j(double d11, double d12, double d13) {
        return d11 + (d13 * (d12 - d11));
    }

    public static float k(float f11, float f12, float f13) {
        return f11 + (f13 * (f12 - f11));
    }

    public static int l(int i11, int i12, float f11) {
        return (int) (i11 + (f11 * (i12 - i11)));
    }

    public static void m(a8.e eVar, int i11, List<a8.e> list, a8.e eVar2, k kVar) {
        if (eVar.c(kVar.getName(), i11)) {
            list.add(eVar2.a(kVar.getName()).i(kVar));
        }
    }
}