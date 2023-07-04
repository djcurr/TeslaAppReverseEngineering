package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
class f extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private float f2680a;

    /* renamed from: c  reason: collision with root package name */
    private final RectF f2682c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f2683d;

    /* renamed from: e  reason: collision with root package name */
    private float f2684e;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f2687h;

    /* renamed from: i  reason: collision with root package name */
    private PorterDuffColorFilter f2688i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f2689j;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2685f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2686g = true;

    /* renamed from: k  reason: collision with root package name */
    private PorterDuff.Mode f2690k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f2681b = new Paint(5);

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(ColorStateList colorStateList, float f11) {
        this.f2680a = f11;
        e(colorStateList);
        this.f2682c = new RectF();
        this.f2683d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f2687h = colorStateList;
        this.f2681b.setColor(colorStateList.getColorForState(getState(), this.f2687h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f2682c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f2683d.set(rect);
        if (this.f2685f) {
            float d11 = g.d(this.f2684e, this.f2680a, this.f2686g);
            this.f2683d.inset((int) Math.ceil(g.c(this.f2684e, this.f2680a, this.f2686g)), (int) Math.ceil(d11));
            this.f2682c.set(this.f2683d);
        }
    }

    public ColorStateList b() {
        return this.f2687h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float c() {
        return this.f2684e;
    }

    public float d() {
        return this.f2680a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z11;
        Paint paint = this.f2681b;
        if (this.f2688i == null || paint.getColorFilter() != null) {
            z11 = false;
        } else {
            paint.setColorFilter(this.f2688i);
            z11 = true;
        }
        RectF rectF = this.f2682c;
        float f11 = this.f2680a;
        canvas.drawRoundRect(rectF, f11, f11, paint);
        if (z11) {
            paint.setColorFilter(null);
        }
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(float f11, boolean z11, boolean z12) {
        if (f11 == this.f2684e && this.f2685f == z11 && this.f2686g == z12) {
            return;
        }
        this.f2684e = f11;
        this.f2685f = z11;
        this.f2686g = z12;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f2683d, this.f2680a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(float f11) {
        if (f11 == this.f2680a) {
            return;
        }
        this.f2680a = f11;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f2689j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f2687h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f2687h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z11 = colorForState != this.f2681b.getColor();
        if (z11) {
            this.f2681b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f2689j;
        if (colorStateList2 == null || (mode = this.f2690k) == null) {
            return z11;
        }
        this.f2688i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f2681b.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2681b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f2689j = colorStateList;
        this.f2688i = a(colorStateList, this.f2690k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f2690k = mode;
        this.f2688i = a(this.f2689j, mode);
        invalidateSelf();
    }
}