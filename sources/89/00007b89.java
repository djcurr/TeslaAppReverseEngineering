package je;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class n extends Drawable implements j, r {
    Matrix A;
    private s H;

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f33410a;

    /* renamed from: k  reason: collision with root package name */
    float[] f33420k;

    /* renamed from: p  reason: collision with root package name */
    RectF f33425p;

    /* renamed from: z  reason: collision with root package name */
    Matrix f33431z;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f33411b = false;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f33412c = false;

    /* renamed from: d  reason: collision with root package name */
    protected float f33413d = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: e  reason: collision with root package name */
    protected final Path f33414e = new Path();

    /* renamed from: f  reason: collision with root package name */
    protected boolean f33415f = true;

    /* renamed from: g  reason: collision with root package name */
    protected int f33416g = 0;

    /* renamed from: h  reason: collision with root package name */
    protected final Path f33417h = new Path();

    /* renamed from: i  reason: collision with root package name */
    private final float[] f33418i = new float[8];

    /* renamed from: j  reason: collision with root package name */
    final float[] f33419j = new float[8];

    /* renamed from: l  reason: collision with root package name */
    final RectF f33421l = new RectF();

    /* renamed from: m  reason: collision with root package name */
    final RectF f33422m = new RectF();

    /* renamed from: n  reason: collision with root package name */
    final RectF f33423n = new RectF();

    /* renamed from: o  reason: collision with root package name */
    final RectF f33424o = new RectF();

    /* renamed from: q  reason: collision with root package name */
    final Matrix f33426q = new Matrix();

    /* renamed from: t  reason: collision with root package name */
    final Matrix f33427t = new Matrix();

    /* renamed from: w  reason: collision with root package name */
    final Matrix f33428w = new Matrix();

    /* renamed from: x  reason: collision with root package name */
    final Matrix f33429x = new Matrix();

    /* renamed from: y  reason: collision with root package name */
    final Matrix f33430y = new Matrix();
    final Matrix B = new Matrix();
    private float C = BitmapDescriptorFactory.HUE_RED;
    private boolean E = false;
    private boolean F = false;
    private boolean G = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(Drawable drawable) {
        this.f33410a = drawable;
    }

    public boolean a() {
        return this.F;
    }

    @Override // je.j
    public void b(int i11, float f11) {
        if (this.f33416g == i11 && this.f33413d == f11) {
            return;
        }
        this.f33416g = i11;
        this.f33413d = f11;
        this.G = true;
        invalidateSelf();
    }

    @Override // je.j
    public void c(boolean z11) {
        this.f33411b = z11;
        this.G = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f33410a.clearColorFilter();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return this.f33411b || this.f33412c || this.f33413d > BitmapDescriptorFactory.HUE_RED;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (tf.b.d()) {
            tf.b.a("RoundedDrawable#draw");
        }
        this.f33410a.draw(canvas);
        if (tf.b.d()) {
            tf.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        float[] fArr;
        if (this.G) {
            this.f33417h.reset();
            RectF rectF = this.f33421l;
            float f11 = this.f33413d;
            rectF.inset(f11 / 2.0f, f11 / 2.0f);
            if (this.f33411b) {
                this.f33417h.addCircle(this.f33421l.centerX(), this.f33421l.centerY(), Math.min(this.f33421l.width(), this.f33421l.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i11 = 0;
                while (true) {
                    fArr = this.f33419j;
                    if (i11 >= fArr.length) {
                        break;
                    }
                    fArr[i11] = (this.f33418i[i11] + this.C) - (this.f33413d / 2.0f);
                    i11++;
                }
                this.f33417h.addRoundRect(this.f33421l, fArr, Path.Direction.CW);
            }
            RectF rectF2 = this.f33421l;
            float f12 = this.f33413d;
            rectF2.inset((-f12) / 2.0f, (-f12) / 2.0f);
            this.f33414e.reset();
            float f13 = this.C + (this.E ? this.f33413d : BitmapDescriptorFactory.HUE_RED);
            this.f33421l.inset(f13, f13);
            if (this.f33411b) {
                this.f33414e.addCircle(this.f33421l.centerX(), this.f33421l.centerY(), Math.min(this.f33421l.width(), this.f33421l.height()) / 2.0f, Path.Direction.CW);
            } else if (this.E) {
                if (this.f33420k == null) {
                    this.f33420k = new float[8];
                }
                for (int i12 = 0; i12 < this.f33419j.length; i12++) {
                    this.f33420k[i12] = this.f33418i[i12] - this.f33413d;
                }
                this.f33414e.addRoundRect(this.f33421l, this.f33420k, Path.Direction.CW);
            } else {
                this.f33414e.addRoundRect(this.f33421l, this.f33418i, Path.Direction.CW);
            }
            float f14 = -f13;
            this.f33421l.inset(f14, f14);
            this.f33414e.setFillType(Path.FillType.WINDING);
            this.G = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f() {
        Matrix matrix;
        s sVar = this.H;
        if (sVar != null) {
            sVar.d(this.f33428w);
            this.H.o(this.f33421l);
        } else {
            this.f33428w.reset();
            this.f33421l.set(getBounds());
        }
        this.f33423n.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getIntrinsicWidth(), getIntrinsicHeight());
        this.f33424o.set(this.f33410a.getBounds());
        this.f33426q.setRectToRect(this.f33423n, this.f33424o, Matrix.ScaleToFit.FILL);
        if (this.E) {
            RectF rectF = this.f33425p;
            if (rectF == null) {
                this.f33425p = new RectF(this.f33421l);
            } else {
                rectF.set(this.f33421l);
            }
            RectF rectF2 = this.f33425p;
            float f11 = this.f33413d;
            rectF2.inset(f11, f11);
            if (this.f33431z == null) {
                this.f33431z = new Matrix();
            }
            this.f33431z.setRectToRect(this.f33421l, this.f33425p, Matrix.ScaleToFit.FILL);
        } else {
            Matrix matrix2 = this.f33431z;
            if (matrix2 != null) {
                matrix2.reset();
            }
        }
        if (!this.f33428w.equals(this.f33429x) || !this.f33426q.equals(this.f33427t) || ((matrix = this.f33431z) != null && !matrix.equals(this.A))) {
            this.f33415f = true;
            this.f33428w.invert(this.f33430y);
            this.B.set(this.f33428w);
            if (this.E) {
                this.B.postConcat(this.f33431z);
            }
            this.B.preConcat(this.f33426q);
            this.f33429x.set(this.f33428w);
            this.f33427t.set(this.f33426q);
            if (this.E) {
                Matrix matrix3 = this.A;
                if (matrix3 == null) {
                    this.A = new Matrix(this.f33431z);
                } else {
                    matrix3.set(this.f33431z);
                }
            } else {
                Matrix matrix4 = this.A;
                if (matrix4 != null) {
                    matrix4.reset();
                }
            }
        }
        if (this.f33421l.equals(this.f33422m)) {
            return;
        }
        this.G = true;
        this.f33422m.set(this.f33421l);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f33410a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f33410a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f33410a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f33410a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f33410a.getOpacity();
    }

    @Override // je.j
    public void i(float f11) {
        if (this.C != f11) {
            this.C = f11;
            this.G = true;
            invalidateSelf();
        }
    }

    @Override // je.j
    public void j(float f11) {
        int i11 = (f11 > BitmapDescriptorFactory.HUE_RED ? 1 : (f11 == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
        md.k.i(i11 >= 0);
        Arrays.fill(this.f33418i, f11);
        this.f33412c = i11 != 0;
        this.G = true;
        invalidateSelf();
    }

    @Override // je.r
    public void k(s sVar) {
        this.H = sVar;
    }

    @Override // je.j
    public void m(boolean z11) {
        if (this.F != z11) {
            this.F = z11;
            invalidateSelf();
        }
    }

    @Override // je.j
    public void n(boolean z11) {
        if (this.E != z11) {
            this.E = z11;
            this.G = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f33410a.setBounds(rect);
    }

    @Override // je.j
    public void s(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f33418i, (float) BitmapDescriptorFactory.HUE_RED);
            this.f33412c = false;
        } else {
            md.k.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f33418i, 0, 8);
            this.f33412c = false;
            for (int i11 = 0; i11 < 8; i11++) {
                this.f33412c |= fArr[i11] > BitmapDescriptorFactory.HUE_RED;
            }
        }
        this.G = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f33410a.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i11, PorterDuff.Mode mode) {
        this.f33410a.setColorFilter(i11, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f33410a.setColorFilter(colorFilter);
    }
}