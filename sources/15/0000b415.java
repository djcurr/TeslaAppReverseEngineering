package t1;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import t1.f1;
import t1.g1;

/* loaded from: classes.dex */
public final class i {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f51449a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f51450b;

        static {
            new int[Paint.Style.values().length][Paint.Style.STROKE.ordinal()] = 1;
            int[] iArr = new int[Paint.Cap.values().length];
            iArr[Paint.Cap.BUTT.ordinal()] = 1;
            iArr[Paint.Cap.ROUND.ordinal()] = 2;
            iArr[Paint.Cap.SQUARE.ordinal()] = 3;
            f51449a = iArr;
            int[] iArr2 = new int[Paint.Join.values().length];
            iArr2[Paint.Join.MITER.ordinal()] = 1;
            iArr2[Paint.Join.BEVEL.ordinal()] = 2;
            iArr2[Paint.Join.ROUND.ordinal()] = 3;
            f51450b = iArr2;
        }
    }

    public static final o0 a() {
        return new h();
    }

    public static final float b(Paint paint) {
        kotlin.jvm.internal.s.g(paint, "<this>");
        return paint.getAlpha() / 255.0f;
    }

    public static final long c(Paint paint) {
        kotlin.jvm.internal.s.g(paint, "<this>");
        return c0.b(paint.getColor());
    }

    public static final int d(Paint paint) {
        kotlin.jvm.internal.s.g(paint, "<this>");
        if (!paint.isFilterBitmap()) {
            return d0.f51387a.b();
        }
        return d0.f51387a.a();
    }

    public static final int e(Paint paint) {
        kotlin.jvm.internal.s.g(paint, "<this>");
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i11 = strokeCap == null ? -1 : a.f51449a[strokeCap.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return f1.f51429b.a();
                }
                return f1.f51429b.c();
            }
            return f1.f51429b.b();
        }
        return f1.f51429b.a();
    }

    public static final int f(Paint paint) {
        kotlin.jvm.internal.s.g(paint, "<this>");
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i11 = strokeJoin == null ? -1 : a.f51450b[strokeJoin.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return g1.f51434b.b();
                }
                return g1.f51434b.c();
            }
            return g1.f51434b.a();
        }
        return g1.f51434b.b();
    }

    public static final float g(Paint paint) {
        kotlin.jvm.internal.s.g(paint, "<this>");
        return paint.getStrokeMiter();
    }

    public static final float h(Paint paint) {
        kotlin.jvm.internal.s.g(paint, "<this>");
        return paint.getStrokeWidth();
    }

    public static final Paint i() {
        return new Paint(7);
    }

    public static final void j(Paint paint, float f11) {
        kotlin.jvm.internal.s.g(paint, "<this>");
        paint.setAlpha((int) Math.rint(f11 * 255.0f));
    }

    public static final void k(Paint setNativeBlendMode, int i11) {
        kotlin.jvm.internal.s.g(setNativeBlendMode, "$this$setNativeBlendMode");
        if (Build.VERSION.SDK_INT >= 29) {
            j1.f51462a.a(setNativeBlendMode, i11);
        } else {
            setNativeBlendMode.setXfermode(new PorterDuffXfermode(t1.a.b(i11)));
        }
    }

    public static final void l(Paint setNativeColor, long j11) {
        kotlin.jvm.internal.s.g(setNativeColor, "$this$setNativeColor");
        setNativeColor.setColor(c0.j(j11));
    }

    public static final void m(Paint paint, b0 b0Var) {
        kotlin.jvm.internal.s.g(paint, "<this>");
        paint.setColorFilter(b0Var == null ? null : d.b(b0Var));
    }

    public static final void n(Paint setNativeFilterQuality, int i11) {
        kotlin.jvm.internal.s.g(setNativeFilterQuality, "$this$setNativeFilterQuality");
        setNativeFilterQuality.setFilterBitmap(!d0.d(i11, d0.f51387a.b()));
    }

    public static final void o(Paint paint, r0 r0Var) {
        kotlin.jvm.internal.s.g(paint, "<this>");
        k kVar = (k) r0Var;
        paint.setPathEffect(kVar == null ? null : kVar.a());
    }

    public static final void p(Paint paint, Shader shader) {
        kotlin.jvm.internal.s.g(paint, "<this>");
        paint.setShader(shader);
    }

    public static final void q(Paint setNativeStrokeCap, int i11) {
        Paint.Cap cap;
        kotlin.jvm.internal.s.g(setNativeStrokeCap, "$this$setNativeStrokeCap");
        f1.a aVar = f1.f51429b;
        if (f1.g(i11, aVar.c())) {
            cap = Paint.Cap.SQUARE;
        } else if (f1.g(i11, aVar.b())) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = f1.g(i11, aVar.a()) ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        setNativeStrokeCap.setStrokeCap(cap);
    }

    public static final void r(Paint setNativeStrokeJoin, int i11) {
        Paint.Join join;
        kotlin.jvm.internal.s.g(setNativeStrokeJoin, "$this$setNativeStrokeJoin");
        g1.a aVar = g1.f51434b;
        if (g1.g(i11, aVar.b())) {
            join = Paint.Join.MITER;
        } else if (g1.g(i11, aVar.a())) {
            join = Paint.Join.BEVEL;
        } else {
            join = g1.g(i11, aVar.c()) ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        setNativeStrokeJoin.setStrokeJoin(join);
    }

    public static final void s(Paint paint, float f11) {
        kotlin.jvm.internal.s.g(paint, "<this>");
        paint.setStrokeMiter(f11);
    }

    public static final void t(Paint paint, float f11) {
        kotlin.jvm.internal.s.g(paint, "<this>");
        paint.setStrokeWidth(f11);
    }

    public static final void u(Paint setNativeStyle, int i11) {
        kotlin.jvm.internal.s.g(setNativeStyle, "$this$setNativeStyle");
        setNativeStyle.setStyle(p0.d(i11, p0.f51496a.b()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}