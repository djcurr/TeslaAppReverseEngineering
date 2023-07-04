package wk;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private final m[] f56048a = new m[4];

    /* renamed from: b  reason: collision with root package name */
    private final Matrix[] f56049b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    private final Matrix[] f56050c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    private final PointF f56051d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    private final Path f56052e = new Path();

    /* renamed from: f  reason: collision with root package name */
    private final Path f56053f = new Path();

    /* renamed from: g  reason: collision with root package name */
    private final m f56054g = new m();

    /* renamed from: h  reason: collision with root package name */
    private final float[] f56055h = new float[2];

    /* renamed from: i  reason: collision with root package name */
    private final float[] f56056i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    private final Path f56057j = new Path();

    /* renamed from: k  reason: collision with root package name */
    private final Path f56058k = new Path();

    /* renamed from: l  reason: collision with root package name */
    private boolean f56059l = true;

    /* loaded from: classes3.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        static final l f56060a = new l();
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(m mVar, Matrix matrix, int i11);

        void b(m mVar, Matrix matrix, int i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final k f56061a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f56062b;

        /* renamed from: c  reason: collision with root package name */
        public final RectF f56063c;

        /* renamed from: d  reason: collision with root package name */
        public final b f56064d;

        /* renamed from: e  reason: collision with root package name */
        public final float f56065e;

        c(k kVar, float f11, RectF rectF, b bVar, Path path) {
            this.f56064d = bVar;
            this.f56061a = kVar;
            this.f56065e = f11;
            this.f56063c = rectF;
            this.f56062b = path;
        }
    }

    public l() {
        for (int i11 = 0; i11 < 4; i11++) {
            this.f56048a[i11] = new m();
            this.f56049b[i11] = new Matrix();
            this.f56050c[i11] = new Matrix();
        }
    }

    private float a(int i11) {
        return (i11 + 1) * 90;
    }

    private void b(c cVar, int i11) {
        this.f56055h[0] = this.f56048a[i11].k();
        this.f56055h[1] = this.f56048a[i11].l();
        this.f56049b[i11].mapPoints(this.f56055h);
        if (i11 == 0) {
            Path path = cVar.f56062b;
            float[] fArr = this.f56055h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f56062b;
            float[] fArr2 = this.f56055h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f56048a[i11].d(this.f56049b[i11], cVar.f56062b);
        b bVar = cVar.f56064d;
        if (bVar != null) {
            bVar.b(this.f56048a[i11], this.f56049b[i11], i11);
        }
    }

    private void c(c cVar, int i11) {
        int i12 = (i11 + 1) % 4;
        this.f56055h[0] = this.f56048a[i11].i();
        this.f56055h[1] = this.f56048a[i11].j();
        this.f56049b[i11].mapPoints(this.f56055h);
        this.f56056i[0] = this.f56048a[i12].k();
        this.f56056i[1] = this.f56048a[i12].l();
        this.f56049b[i12].mapPoints(this.f56056i);
        float[] fArr = this.f56055h;
        float f11 = fArr[0];
        float[] fArr2 = this.f56056i;
        float max = Math.max(((float) Math.hypot(f11 - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, (float) BitmapDescriptorFactory.HUE_RED);
        float i13 = i(cVar.f56063c, i11);
        this.f56054g.n(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        f j11 = j(i11, cVar.f56061a);
        j11.b(max, i13, cVar.f56065e, this.f56054g);
        this.f56057j.reset();
        this.f56054g.d(this.f56050c[i11], this.f56057j);
        if (this.f56059l && Build.VERSION.SDK_INT >= 19 && (j11.a() || l(this.f56057j, i11) || l(this.f56057j, i12))) {
            Path path = this.f56057j;
            path.op(path, this.f56053f, Path.Op.DIFFERENCE);
            this.f56055h[0] = this.f56054g.k();
            this.f56055h[1] = this.f56054g.l();
            this.f56050c[i11].mapPoints(this.f56055h);
            Path path2 = this.f56052e;
            float[] fArr3 = this.f56055h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f56054g.d(this.f56050c[i11], this.f56052e);
        } else {
            this.f56054g.d(this.f56050c[i11], cVar.f56062b);
        }
        b bVar = cVar.f56064d;
        if (bVar != null) {
            bVar.a(this.f56054g, this.f56050c[i11], i11);
        }
    }

    private void f(int i11, RectF rectF, PointF pointF) {
        if (i11 == 1) {
            pointF.set(rectF.right, rectF.bottom);
        } else if (i11 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i11 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private wk.c g(int i11, k kVar) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return kVar.t();
                }
                return kVar.r();
            }
            return kVar.j();
        }
        return kVar.l();
    }

    private d h(int i11, k kVar) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return kVar.s();
                }
                return kVar.q();
            }
            return kVar.i();
        }
        return kVar.k();
    }

    private float i(RectF rectF, int i11) {
        float[] fArr = this.f56055h;
        m[] mVarArr = this.f56048a;
        fArr[0] = mVarArr[i11].f56068c;
        fArr[1] = mVarArr[i11].f56069d;
        this.f56049b[i11].mapPoints(fArr);
        if (i11 != 1 && i11 != 3) {
            return Math.abs(rectF.centerY() - this.f56055h[1]);
        }
        return Math.abs(rectF.centerX() - this.f56055h[0]);
    }

    private f j(int i11, k kVar) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return kVar.o();
                }
                return kVar.p();
            }
            return kVar.n();
        }
        return kVar.h();
    }

    public static l k() {
        return a.f56060a;
    }

    private boolean l(Path path, int i11) {
        this.f56058k.reset();
        this.f56048a[i11].d(this.f56049b[i11], this.f56058k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f56058k.computeBounds(rectF, true);
        path.op(this.f56058k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private void m(c cVar, int i11) {
        h(i11, cVar.f56061a).b(this.f56048a[i11], 90.0f, cVar.f56065e, cVar.f56063c, g(i11, cVar.f56061a));
        float a11 = a(i11);
        this.f56049b[i11].reset();
        f(i11, cVar.f56063c, this.f56051d);
        Matrix matrix = this.f56049b[i11];
        PointF pointF = this.f56051d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f56049b[i11].preRotate(a11);
    }

    private void n(int i11) {
        this.f56055h[0] = this.f56048a[i11].i();
        this.f56055h[1] = this.f56048a[i11].j();
        this.f56049b[i11].mapPoints(this.f56055h);
        float a11 = a(i11);
        this.f56050c[i11].reset();
        Matrix matrix = this.f56050c[i11];
        float[] fArr = this.f56055h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f56050c[i11].preRotate(a11);
    }

    public void d(k kVar, float f11, RectF rectF, Path path) {
        e(kVar, f11, rectF, null, path);
    }

    public void e(k kVar, float f11, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f56052e.rewind();
        this.f56053f.rewind();
        this.f56053f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(kVar, f11, rectF, bVar, path);
        for (int i11 = 0; i11 < 4; i11++) {
            m(cVar, i11);
            n(i11);
        }
        for (int i12 = 0; i12 < 4; i12++) {
            b(cVar, i12);
            c(cVar, i12);
        }
        path.close();
        this.f56052e.close();
        if (Build.VERSION.SDK_INT < 19 || this.f56052e.isEmpty()) {
            return;
        }
        path.op(this.f56052e, Path.Op.UNION);
    }
}