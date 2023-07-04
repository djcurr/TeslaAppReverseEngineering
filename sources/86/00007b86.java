package je;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class m extends g implements j {

    /* renamed from: e  reason: collision with root package name */
    b f33392e;

    /* renamed from: f  reason: collision with root package name */
    private final RectF f33393f;

    /* renamed from: g  reason: collision with root package name */
    private RectF f33394g;

    /* renamed from: h  reason: collision with root package name */
    private Matrix f33395h;

    /* renamed from: i  reason: collision with root package name */
    private final float[] f33396i;

    /* renamed from: j  reason: collision with root package name */
    final float[] f33397j;

    /* renamed from: k  reason: collision with root package name */
    final Paint f33398k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f33399l;

    /* renamed from: m  reason: collision with root package name */
    private float f33400m;

    /* renamed from: n  reason: collision with root package name */
    private int f33401n;

    /* renamed from: o  reason: collision with root package name */
    private int f33402o;

    /* renamed from: p  reason: collision with root package name */
    private float f33403p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f33404q;

    /* renamed from: t  reason: collision with root package name */
    private boolean f33405t;

    /* renamed from: w  reason: collision with root package name */
    private final Path f33406w;

    /* renamed from: x  reason: collision with root package name */
    private final Path f33407x;

    /* renamed from: y  reason: collision with root package name */
    private final RectF f33408y;

    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f33409a;

        static {
            int[] iArr = new int[b.values().length];
            f33409a = iArr;
            try {
                iArr[b.CLIPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33409a[b.OVERLAY_COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public enum b {
        OVERLAY_COLOR,
        CLIPPING
    }

    public m(Drawable drawable) {
        super((Drawable) md.k.g(drawable));
        this.f33392e = b.OVERLAY_COLOR;
        this.f33393f = new RectF();
        this.f33396i = new float[8];
        this.f33397j = new float[8];
        this.f33398k = new Paint(1);
        this.f33399l = false;
        this.f33400m = BitmapDescriptorFactory.HUE_RED;
        this.f33401n = 0;
        this.f33402o = 0;
        this.f33403p = BitmapDescriptorFactory.HUE_RED;
        this.f33404q = false;
        this.f33405t = false;
        this.f33406w = new Path();
        this.f33407x = new Path();
        this.f33408y = new RectF();
    }

    private void z() {
        float[] fArr;
        this.f33406w.reset();
        this.f33407x.reset();
        this.f33408y.set(getBounds());
        RectF rectF = this.f33408y;
        float f11 = this.f33403p;
        rectF.inset(f11, f11);
        if (this.f33392e == b.OVERLAY_COLOR) {
            this.f33406w.addRect(this.f33408y, Path.Direction.CW);
        }
        if (this.f33399l) {
            this.f33406w.addCircle(this.f33408y.centerX(), this.f33408y.centerY(), Math.min(this.f33408y.width(), this.f33408y.height()) / 2.0f, Path.Direction.CW);
        } else {
            this.f33406w.addRoundRect(this.f33408y, this.f33396i, Path.Direction.CW);
        }
        RectF rectF2 = this.f33408y;
        float f12 = this.f33403p;
        rectF2.inset(-f12, -f12);
        RectF rectF3 = this.f33408y;
        float f13 = this.f33400m;
        rectF3.inset(f13 / 2.0f, f13 / 2.0f);
        if (this.f33399l) {
            this.f33407x.addCircle(this.f33408y.centerX(), this.f33408y.centerY(), Math.min(this.f33408y.width(), this.f33408y.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i11 = 0;
            while (true) {
                fArr = this.f33397j;
                if (i11 >= fArr.length) {
                    break;
                }
                fArr[i11] = (this.f33396i[i11] + this.f33403p) - (this.f33400m / 2.0f);
                i11++;
            }
            this.f33407x.addRoundRect(this.f33408y, fArr, Path.Direction.CW);
        }
        RectF rectF4 = this.f33408y;
        float f14 = this.f33400m;
        rectF4.inset((-f14) / 2.0f, (-f14) / 2.0f);
    }

    @Override // je.j
    public void b(int i11, float f11) {
        this.f33401n = i11;
        this.f33400m = f11;
        z();
        invalidateSelf();
    }

    @Override // je.j
    public void c(boolean z11) {
        this.f33399l = z11;
        z();
        invalidateSelf();
    }

    @Override // je.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f33393f.set(getBounds());
        int i11 = a.f33409a[this.f33392e.ordinal()];
        if (i11 == 1) {
            int save = canvas.save();
            canvas.clipPath(this.f33406w);
            super.draw(canvas);
            canvas.restoreToCount(save);
        } else if (i11 == 2) {
            if (this.f33404q) {
                RectF rectF = this.f33394g;
                if (rectF == null) {
                    this.f33394g = new RectF(this.f33393f);
                    this.f33395h = new Matrix();
                } else {
                    rectF.set(this.f33393f);
                }
                RectF rectF2 = this.f33394g;
                float f11 = this.f33400m;
                rectF2.inset(f11, f11);
                this.f33395h.setRectToRect(this.f33393f, this.f33394g, Matrix.ScaleToFit.FILL);
                int save2 = canvas.save();
                canvas.clipRect(this.f33393f);
                canvas.concat(this.f33395h);
                super.draw(canvas);
                canvas.restoreToCount(save2);
            } else {
                super.draw(canvas);
            }
            this.f33398k.setStyle(Paint.Style.FILL);
            this.f33398k.setColor(this.f33402o);
            this.f33398k.setStrokeWidth(BitmapDescriptorFactory.HUE_RED);
            this.f33398k.setFilterBitmap(x());
            this.f33406w.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f33406w, this.f33398k);
            if (this.f33399l) {
                float width = ((this.f33393f.width() - this.f33393f.height()) + this.f33400m) / 2.0f;
                float height = ((this.f33393f.height() - this.f33393f.width()) + this.f33400m) / 2.0f;
                if (width > BitmapDescriptorFactory.HUE_RED) {
                    RectF rectF3 = this.f33393f;
                    float f12 = rectF3.left;
                    canvas.drawRect(f12, rectF3.top, f12 + width, rectF3.bottom, this.f33398k);
                    RectF rectF4 = this.f33393f;
                    float f13 = rectF4.right;
                    canvas.drawRect(f13 - width, rectF4.top, f13, rectF4.bottom, this.f33398k);
                }
                if (height > BitmapDescriptorFactory.HUE_RED) {
                    RectF rectF5 = this.f33393f;
                    float f14 = rectF5.left;
                    float f15 = rectF5.top;
                    canvas.drawRect(f14, f15, rectF5.right, f15 + height, this.f33398k);
                    RectF rectF6 = this.f33393f;
                    float f16 = rectF6.left;
                    float f17 = rectF6.bottom;
                    canvas.drawRect(f16, f17 - height, rectF6.right, f17, this.f33398k);
                }
            }
        }
        if (this.f33401n != 0) {
            this.f33398k.setStyle(Paint.Style.STROKE);
            this.f33398k.setColor(this.f33401n);
            this.f33398k.setStrokeWidth(this.f33400m);
            this.f33406w.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f33407x, this.f33398k);
        }
    }

    @Override // je.j
    public void i(float f11) {
        this.f33403p = f11;
        z();
        invalidateSelf();
    }

    @Override // je.j
    public void j(float f11) {
        Arrays.fill(this.f33396i, f11);
        z();
        invalidateSelf();
    }

    @Override // je.j
    public void m(boolean z11) {
        if (this.f33405t != z11) {
            this.f33405t = z11;
            invalidateSelf();
        }
    }

    @Override // je.j
    public void n(boolean z11) {
        this.f33404q = z11;
        z();
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.g, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        z();
    }

    @Override // je.j
    public void s(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f33396i, (float) BitmapDescriptorFactory.HUE_RED);
        } else {
            md.k.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f33396i, 0, 8);
        }
        z();
        invalidateSelf();
    }

    public boolean x() {
        return this.f33405t;
    }

    public void y(int i11) {
        this.f33402o = i11;
        invalidateSelf();
    }
}