package je;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public class g extends Drawable implements Drawable.Callback, s, r, c {

    /* renamed from: d  reason: collision with root package name */
    private static final Matrix f33364d = new Matrix();

    /* renamed from: a  reason: collision with root package name */
    private Drawable f33365a;

    /* renamed from: b  reason: collision with root package name */
    private final d f33366b = new d();

    /* renamed from: c  reason: collision with root package name */
    protected s f33367c;

    public g(Drawable drawable) {
        this.f33365a = drawable;
        e.d(drawable, this, this);
    }

    @Override // je.s
    public void d(Matrix matrix) {
        t(matrix);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f33365a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // je.c
    public Drawable g(Drawable drawable) {
        return v(drawable);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f33365a;
        if (drawable == null) {
            return super.getConstantState();
        }
        return drawable.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f33365a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f33365a;
        if (drawable == null) {
            return super.getIntrinsicHeight();
        }
        return drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f33365a;
        if (drawable == null) {
            return super.getIntrinsicWidth();
        }
        return drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f33365a;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f33365a;
        if (drawable == null) {
            return super.getPadding(rect);
        }
        return drawable.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f33365a;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    @Override // je.r
    public void k(s sVar) {
        this.f33367c = sVar;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f33365a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // je.s
    public void o(RectF rectF) {
        s sVar = this.f33367c;
        if (sVar != null) {
            sVar.o(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f33365a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i11) {
        Drawable drawable = this.f33365a;
        if (drawable == null) {
            return super.onLevelChange(i11);
        }
        return drawable.setLevel(i11);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f33365a;
        if (drawable == null) {
            return super.onStateChange(iArr);
        }
        return drawable.setState(iArr);
    }

    @Override // je.c
    public Drawable r() {
        return getCurrent();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
        scheduleSelf(runnable, j11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f33366b.b(i11);
        Drawable drawable = this.f33365a;
        if (drawable != null) {
            drawable.setAlpha(i11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f33366b.c(colorFilter);
        Drawable drawable = this.f33365a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z11) {
        this.f33366b.d(z11);
        Drawable drawable = this.f33365a;
        if (drawable != null) {
            drawable.setDither(z11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z11) {
        this.f33366b.e(z11);
        Drawable drawable = this.f33365a;
        if (drawable != null) {
            drawable.setFilterBitmap(z11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f11, float f12) {
        Drawable drawable = this.f33365a;
        if (drawable != null) {
            drawable.setHotspot(f11, f12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        boolean visible = super.setVisible(z11, z12);
        Drawable drawable = this.f33365a;
        return drawable == null ? visible : drawable.setVisible(z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void t(Matrix matrix) {
        s sVar = this.f33367c;
        if (sVar != null) {
            sVar.d(matrix);
        } else {
            matrix.reset();
        }
    }

    public void u(RectF rectF) {
        Matrix matrix = f33364d;
        t(matrix);
        rectF.set(getBounds());
        matrix.mapRect(rectF);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public Drawable v(Drawable drawable) {
        Drawable w11 = w(drawable);
        invalidateSelf();
        return w11;
    }

    protected Drawable w(Drawable drawable) {
        Drawable drawable2 = this.f33365a;
        e.d(drawable2, null, null);
        e.d(drawable, null, null);
        e.e(drawable, this.f33366b);
        e.a(drawable, this);
        e.d(drawable, this, this);
        this.f33365a = drawable;
        return drawable2;
    }
}