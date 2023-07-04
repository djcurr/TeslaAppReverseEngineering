package f8;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import g8.c;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class t {

    /* renamed from: b  reason: collision with root package name */
    private static androidx.collection.h<WeakReference<Interpolator>> f26107b;

    /* renamed from: a  reason: collision with root package name */
    private static final Interpolator f26106a = new LinearInterpolator();

    /* renamed from: c  reason: collision with root package name */
    static c.a f26108c = c.a.a("t", "s", "e", "o", IntegerTokenConverter.CONVERTER_KEY, "h", "to", "ti");

    /* renamed from: d  reason: collision with root package name */
    static c.a f26109d = c.a.a("x", "y");

    t() {
    }

    private static WeakReference<Interpolator> a(int i11) {
        WeakReference<Interpolator> g11;
        synchronized (t.class) {
            g11 = g().g(i11);
        }
        return g11;
    }

    private static Interpolator b(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = h8.g.c(pointF.x, -1.0f, 1.0f);
        pointF.y = h8.g.c(pointF.y, -100.0f, 100.0f);
        pointF2.x = h8.g.c(pointF2.x, -1.0f, 1.0f);
        float c11 = h8.g.c(pointF2.y, -100.0f, 100.0f);
        pointF2.y = c11;
        int i11 = h8.h.i(pointF.x, pointF.y, pointF2.x, c11);
        WeakReference<Interpolator> a11 = a(i11);
        Interpolator interpolator = a11 != null ? a11.get() : null;
        if (a11 == null || interpolator == null) {
            try {
                linearInterpolator = x3.b.a(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e11) {
                if ("The Path cannot loop back on itself.".equals(e11.getMessage())) {
                    linearInterpolator = x3.b.a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, (float) BitmapDescriptorFactory.HUE_RED), pointF2.y);
                } else {
                    linearInterpolator = new LinearInterpolator();
                }
            }
            interpolator = linearInterpolator;
            try {
                h(i11, new WeakReference(interpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> i8.a<T> c(g8.c cVar, v7.d dVar, float f11, m0<T> m0Var, boolean z11, boolean z12) {
        if (z11 && z12) {
            return e(dVar, cVar, f11, m0Var);
        }
        if (z11) {
            return d(dVar, cVar, f11, m0Var);
        }
        return f(cVar, f11, m0Var);
    }

    private static <T> i8.a<T> d(v7.d dVar, g8.c cVar, float f11, m0<T> m0Var) {
        Interpolator interpolator;
        Interpolator interpolator2;
        T t11;
        cVar.j();
        PointF pointF = null;
        boolean z11 = false;
        T t12 = null;
        T t13 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        float f12 = 0.0f;
        PointF pointF4 = null;
        while (cVar.p()) {
            switch (cVar.p0(f26108c)) {
                case 0:
                    f12 = (float) cVar.D();
                    break;
                case 1:
                    t13 = m0Var.a(cVar, f11);
                    break;
                case 2:
                    t12 = m0Var.a(cVar, f11);
                    break;
                case 3:
                    pointF = s.e(cVar, 1.0f);
                    break;
                case 4:
                    pointF4 = s.e(cVar, 1.0f);
                    break;
                case 5:
                    if (cVar.J() != 1) {
                        z11 = false;
                        break;
                    } else {
                        z11 = true;
                        break;
                    }
                case 6:
                    pointF2 = s.e(cVar, f11);
                    break;
                case 7:
                    pointF3 = s.e(cVar, f11);
                    break;
                default:
                    cVar.u0();
                    break;
            }
        }
        cVar.m();
        if (z11) {
            interpolator2 = f26106a;
            t11 = t13;
        } else {
            if (pointF != null && pointF4 != null) {
                interpolator = b(pointF, pointF4);
            } else {
                interpolator = f26106a;
            }
            interpolator2 = interpolator;
            t11 = t12;
        }
        i8.a<T> aVar = new i8.a<>(dVar, t13, t11, interpolator2, f12, null);
        aVar.f30201o = pointF2;
        aVar.f30202p = pointF3;
        return aVar;
    }

    private static <T> i8.a<T> e(v7.d dVar, g8.c cVar, float f11, m0<T> m0Var) {
        Interpolator interpolator;
        Interpolator b11;
        Interpolator b12;
        T t11;
        PointF pointF;
        i8.a<T> aVar;
        PointF pointF2;
        float f12;
        PointF pointF3;
        cVar.j();
        PointF pointF4 = null;
        boolean z11 = false;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        T t12 = null;
        PointF pointF8 = null;
        PointF pointF9 = null;
        PointF pointF10 = null;
        float f13 = BitmapDescriptorFactory.HUE_RED;
        PointF pointF11 = null;
        T t13 = null;
        while (cVar.p()) {
            switch (cVar.p0(f26108c)) {
                case 0:
                    pointF2 = pointF4;
                    f13 = (float) cVar.D();
                    break;
                case 1:
                    pointF2 = pointF4;
                    t12 = m0Var.a(cVar, f11);
                    break;
                case 2:
                    pointF2 = pointF4;
                    t13 = m0Var.a(cVar, f11);
                    break;
                case 3:
                    pointF2 = pointF4;
                    f12 = f13;
                    PointF pointF12 = pointF11;
                    if (cVar.e0() == c.b.BEGIN_OBJECT) {
                        cVar.j();
                        float f14 = BitmapDescriptorFactory.HUE_RED;
                        float f15 = BitmapDescriptorFactory.HUE_RED;
                        float f16 = BitmapDescriptorFactory.HUE_RED;
                        float f17 = BitmapDescriptorFactory.HUE_RED;
                        while (cVar.p()) {
                            int p02 = cVar.p0(f26109d);
                            if (p02 == 0) {
                                c.b e02 = cVar.e0();
                                c.b bVar = c.b.NUMBER;
                                if (e02 == bVar) {
                                    f16 = (float) cVar.D();
                                    f14 = f16;
                                } else {
                                    cVar.g();
                                    f14 = (float) cVar.D();
                                    f16 = cVar.e0() == bVar ? (float) cVar.D() : f14;
                                    cVar.l();
                                }
                            } else if (p02 != 1) {
                                cVar.u0();
                            } else {
                                c.b e03 = cVar.e0();
                                c.b bVar2 = c.b.NUMBER;
                                if (e03 == bVar2) {
                                    f17 = (float) cVar.D();
                                    f15 = f17;
                                } else {
                                    cVar.g();
                                    f15 = (float) cVar.D();
                                    f17 = cVar.e0() == bVar2 ? (float) cVar.D() : f15;
                                    cVar.l();
                                }
                            }
                        }
                        PointF pointF13 = new PointF(f14, f15);
                        PointF pointF14 = new PointF(f16, f17);
                        cVar.m();
                        pointF8 = pointF14;
                        pointF7 = pointF13;
                        pointF11 = pointF12;
                        f13 = f12;
                        break;
                    } else {
                        pointF5 = s.e(cVar, f11);
                        f13 = f12;
                        pointF11 = pointF12;
                        break;
                    }
                case 4:
                    if (cVar.e0() == c.b.BEGIN_OBJECT) {
                        cVar.j();
                        float f18 = BitmapDescriptorFactory.HUE_RED;
                        float f19 = BitmapDescriptorFactory.HUE_RED;
                        float f21 = BitmapDescriptorFactory.HUE_RED;
                        float f22 = BitmapDescriptorFactory.HUE_RED;
                        while (cVar.p()) {
                            PointF pointF15 = pointF11;
                            int p03 = cVar.p0(f26109d);
                            if (p03 != 0) {
                                pointF3 = pointF4;
                                if (p03 != 1) {
                                    cVar.u0();
                                } else {
                                    c.b e04 = cVar.e0();
                                    c.b bVar3 = c.b.NUMBER;
                                    if (e04 == bVar3) {
                                        f22 = (float) cVar.D();
                                        f13 = f13;
                                        f19 = f22;
                                    } else {
                                        float f23 = f13;
                                        cVar.g();
                                        float D = (float) cVar.D();
                                        float D2 = cVar.e0() == bVar3 ? (float) cVar.D() : D;
                                        cVar.l();
                                        f13 = f23;
                                        pointF11 = pointF15;
                                        pointF4 = pointF3;
                                        f22 = D2;
                                        f19 = D;
                                    }
                                }
                            } else {
                                pointF3 = pointF4;
                                float f24 = f13;
                                c.b e05 = cVar.e0();
                                c.b bVar4 = c.b.NUMBER;
                                if (e05 == bVar4) {
                                    f21 = (float) cVar.D();
                                    f13 = f24;
                                    f18 = f21;
                                } else {
                                    cVar.g();
                                    f18 = (float) cVar.D();
                                    f21 = cVar.e0() == bVar4 ? (float) cVar.D() : f18;
                                    cVar.l();
                                    f13 = f24;
                                }
                            }
                            pointF11 = pointF15;
                            pointF4 = pointF3;
                        }
                        pointF2 = pointF4;
                        f12 = f13;
                        PointF pointF16 = new PointF(f18, f19);
                        PointF pointF17 = new PointF(f21, f22);
                        cVar.m();
                        pointF10 = pointF17;
                        pointF9 = pointF16;
                        f13 = f12;
                        break;
                    } else {
                        pointF2 = pointF4;
                        pointF6 = s.e(cVar, f11);
                        break;
                    }
                case 5:
                    if (cVar.J() == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                        continue;
                    }
                case 6:
                    pointF11 = s.e(cVar, f11);
                    continue;
                case 7:
                    pointF4 = s.e(cVar, f11);
                    continue;
                default:
                    pointF2 = pointF4;
                    cVar.u0();
                    break;
            }
            pointF4 = pointF2;
        }
        PointF pointF18 = pointF4;
        float f25 = f13;
        PointF pointF19 = pointF11;
        cVar.m();
        if (z11) {
            interpolator = f26106a;
            t11 = t12;
        } else {
            if (pointF5 != null && pointF6 != null) {
                interpolator = b(pointF5, pointF6);
            } else if (pointF7 != null && pointF8 != null && pointF9 != null && pointF10 != null) {
                b11 = b(pointF7, pointF9);
                b12 = b(pointF8, pointF10);
                t11 = t13;
                interpolator = null;
                if (b11 == null && b12 != null) {
                    pointF = pointF19;
                    aVar = new i8.a<>(dVar, t12, t11, b11, b12, f25, null);
                } else {
                    pointF = pointF19;
                    aVar = new i8.a<>(dVar, t12, t11, interpolator, f25, null);
                }
                aVar.f30201o = pointF;
                aVar.f30202p = pointF18;
                return aVar;
            } else {
                interpolator = f26106a;
            }
            t11 = t13;
        }
        b11 = null;
        b12 = null;
        if (b11 == null) {
        }
        pointF = pointF19;
        aVar = new i8.a<>(dVar, t12, t11, interpolator, f25, null);
        aVar.f30201o = pointF;
        aVar.f30202p = pointF18;
        return aVar;
    }

    private static <T> i8.a<T> f(g8.c cVar, float f11, m0<T> m0Var) {
        return new i8.a<>(m0Var.a(cVar, f11));
    }

    private static androidx.collection.h<WeakReference<Interpolator>> g() {
        if (f26107b == null) {
            f26107b = new androidx.collection.h<>();
        }
        return f26107b;
    }

    private static void h(int i11, WeakReference<Interpolator> weakReference) {
        synchronized (t.class) {
            f26107b.l(i11, weakReference);
        }
    }
}