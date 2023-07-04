package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
class g extends Drawable {

    /* renamed from: q  reason: collision with root package name */
    private static final double f2691q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r  reason: collision with root package name */
    static a f2692r;

    /* renamed from: a  reason: collision with root package name */
    private final int f2693a;

    /* renamed from: c  reason: collision with root package name */
    private Paint f2695c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f2696d;

    /* renamed from: e  reason: collision with root package name */
    private final RectF f2697e;

    /* renamed from: f  reason: collision with root package name */
    private float f2698f;

    /* renamed from: g  reason: collision with root package name */
    private Path f2699g;

    /* renamed from: h  reason: collision with root package name */
    private float f2700h;

    /* renamed from: i  reason: collision with root package name */
    private float f2701i;

    /* renamed from: j  reason: collision with root package name */
    private float f2702j;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f2703k;

    /* renamed from: m  reason: collision with root package name */
    private final int f2705m;

    /* renamed from: n  reason: collision with root package name */
    private final int f2706n;

    /* renamed from: l  reason: collision with root package name */
    private boolean f2704l = true;

    /* renamed from: o  reason: collision with root package name */
    private boolean f2707o = true;

    /* renamed from: p  reason: collision with root package name */
    private boolean f2708p = false;

    /* renamed from: b  reason: collision with root package name */
    private Paint f2694b = new Paint(5);

    /* loaded from: classes.dex */
    interface a {
        void a(Canvas canvas, RectF rectF, float f11, Paint paint);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Resources resources, ColorStateList colorStateList, float f11, float f12, float f13) {
        this.f2705m = resources.getColor(j0.b.f33011d);
        this.f2706n = resources.getColor(j0.b.f33010c);
        this.f2693a = resources.getDimensionPixelSize(j0.c.f33012a);
        n(colorStateList);
        Paint paint = new Paint(5);
        this.f2695c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f2698f = (int) (f11 + 0.5f);
        this.f2697e = new RectF();
        Paint paint2 = new Paint(this.f2695c);
        this.f2696d = paint2;
        paint2.setAntiAlias(false);
        s(f12, f13);
    }

    private void a(Rect rect) {
        float f11 = this.f2700h;
        float f12 = 1.5f * f11;
        this.f2697e.set(rect.left + f11, rect.top + f12, rect.right - f11, rect.bottom - f12);
        b();
    }

    private void b() {
        float f11 = this.f2698f;
        RectF rectF = new RectF(-f11, -f11, f11, f11);
        RectF rectF2 = new RectF(rectF);
        float f12 = this.f2701i;
        rectF2.inset(-f12, -f12);
        Path path = this.f2699g;
        if (path == null) {
            this.f2699g = new Path();
        } else {
            path.reset();
        }
        this.f2699g.setFillType(Path.FillType.EVEN_ODD);
        this.f2699g.moveTo(-this.f2698f, BitmapDescriptorFactory.HUE_RED);
        this.f2699g.rLineTo(-this.f2701i, BitmapDescriptorFactory.HUE_RED);
        this.f2699g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f2699g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f2699g.close();
        float f13 = this.f2698f;
        float f14 = f13 / (this.f2701i + f13);
        Paint paint = this.f2695c;
        float f15 = this.f2698f + this.f2701i;
        int i11 = this.f2705m;
        paint.setShader(new RadialGradient((float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, f15, new int[]{i11, i11, this.f2706n}, new float[]{BitmapDescriptorFactory.HUE_RED, f14, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f2696d;
        float f16 = this.f2698f;
        float f17 = this.f2701i;
        int i12 = this.f2705m;
        paint2.setShader(new LinearGradient((float) BitmapDescriptorFactory.HUE_RED, (-f16) + f17, (float) BitmapDescriptorFactory.HUE_RED, (-f16) - f17, new int[]{i12, i12, this.f2706n}, new float[]{BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f2696d.setAntiAlias(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float c(float f11, float f12, boolean z11) {
        return z11 ? (float) (f11 + ((1.0d - f2691q) * f12)) : f11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float d(float f11, float f12, boolean z11) {
        return z11 ? (float) ((f11 * 1.5f) + ((1.0d - f2691q) * f12)) : f11 * 1.5f;
    }

    private void e(Canvas canvas) {
        float f11 = this.f2698f;
        float f12 = (-f11) - this.f2701i;
        float f13 = f11 + this.f2693a + (this.f2702j / 2.0f);
        float f14 = f13 * 2.0f;
        boolean z11 = this.f2697e.width() - f14 > BitmapDescriptorFactory.HUE_RED;
        boolean z12 = this.f2697e.height() - f14 > BitmapDescriptorFactory.HUE_RED;
        int save = canvas.save();
        RectF rectF = this.f2697e;
        canvas.translate(rectF.left + f13, rectF.top + f13);
        canvas.drawPath(this.f2699g, this.f2695c);
        if (z11) {
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, f12, this.f2697e.width() - f14, -this.f2698f, this.f2696d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f2697e;
        canvas.translate(rectF2.right - f13, rectF2.bottom - f13);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f2699g, this.f2695c);
        if (z11) {
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, f12, this.f2697e.width() - f14, (-this.f2698f) + this.f2701i, this.f2696d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f2697e;
        canvas.translate(rectF3.left + f13, rectF3.bottom - f13);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f2699g, this.f2695c);
        if (z12) {
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, f12, this.f2697e.height() - f14, -this.f2698f, this.f2696d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f2697e;
        canvas.translate(rectF4.right - f13, rectF4.top + f13);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f2699g, this.f2695c);
        if (z12) {
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, f12, this.f2697e.height() - f14, -this.f2698f, this.f2696d);
        }
        canvas.restoreToCount(save4);
    }

    private void n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f2703k = colorStateList;
        this.f2694b.setColor(colorStateList.getColorForState(getState(), this.f2703k.getDefaultColor()));
    }

    private void s(float f11, float f12) {
        if (f11 < BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("Invalid shadow size " + f11 + ". Must be >= 0");
        } else if (f12 >= BitmapDescriptorFactory.HUE_RED) {
            float t11 = t(f11);
            float t12 = t(f12);
            if (t11 > t12) {
                if (!this.f2708p) {
                    this.f2708p = true;
                }
                t11 = t12;
            }
            if (this.f2702j == t11 && this.f2700h == t12) {
                return;
            }
            this.f2702j = t11;
            this.f2700h = t12;
            this.f2701i = (int) ((t11 * 1.5f) + this.f2693a + 0.5f);
            this.f2704l = true;
            invalidateSelf();
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + f12 + ". Must be >= 0");
        }
    }

    private int t(float f11) {
        int i11 = (int) (f11 + 0.5f);
        return i11 % 2 == 1 ? i11 - 1 : i11;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f2704l) {
            a(getBounds());
            this.f2704l = false;
        }
        canvas.translate(BitmapDescriptorFactory.HUE_RED, this.f2702j / 2.0f);
        e(canvas);
        canvas.translate(BitmapDescriptorFactory.HUE_RED, (-this.f2702j) / 2.0f);
        f2692r.a(canvas, this.f2697e, this.f2698f, this.f2694b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList f() {
        return this.f2703k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float g() {
        return this.f2698f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(d(this.f2700h, this.f2698f, this.f2707o));
        int ceil2 = (int) Math.ceil(c(this.f2700h, this.f2698f, this.f2707o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(Rect rect) {
        getPadding(rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float i() {
        return this.f2700h;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f2703k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float j() {
        float f11 = this.f2700h;
        return (Math.max(f11, this.f2698f + this.f2693a + ((f11 * 1.5f) / 2.0f)) * 2.0f) + (((this.f2700h * 1.5f) + this.f2693a) * 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float k() {
        float f11 = this.f2700h;
        return (Math.max(f11, this.f2698f + this.f2693a + (f11 / 2.0f)) * 2.0f) + ((this.f2700h + this.f2693a) * 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float l() {
        return this.f2702j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(boolean z11) {
        this.f2707o = z11;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(ColorStateList colorStateList) {
        n(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f2704l = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f2703k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f2694b.getColor() == colorForState) {
            return false;
        }
        this.f2694b.setColor(colorForState);
        this.f2704l = true;
        invalidateSelf();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(float f11) {
        if (f11 >= BitmapDescriptorFactory.HUE_RED) {
            float f12 = (int) (f11 + 0.5f);
            if (this.f2698f == f12) {
                return;
            }
            this.f2698f = f12;
            this.f2704l = true;
            invalidateSelf();
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f11 + ". Must be >= 0");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(float f11) {
        s(this.f2702j, f11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(float f11) {
        s(f11, this.f2700h);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f2694b.setAlpha(i11);
        this.f2695c.setAlpha(i11);
        this.f2696d.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2694b.setColorFilter(colorFilter);
    }
}