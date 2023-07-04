package n3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class d extends Drawable implements Drawable.Callback, c, b {

    /* renamed from: g */
    static final PorterDuff.Mode f40426g = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    private int f40427a;

    /* renamed from: b */
    private PorterDuff.Mode f40428b;

    /* renamed from: c */
    private boolean f40429c;

    /* renamed from: d */
    f f40430d;

    /* renamed from: e */
    private boolean f40431e;

    /* renamed from: f */
    Drawable f40432f;

    public d(f fVar, Resources resources) {
        this.f40430d = fVar;
        e(resources);
    }

    private f d() {
        return new f(this.f40430d);
    }

    private void e(Resources resources) {
        Drawable.ConstantState constantState;
        f fVar = this.f40430d;
        if (fVar == null || (constantState = fVar.f40435b) == null) {
            return;
        }
        b(constantState.newDrawable(resources));
    }

    private boolean f(int[] iArr) {
        if (c()) {
            f fVar = this.f40430d;
            ColorStateList colorStateList = fVar.f40436c;
            PorterDuff.Mode mode = fVar.f40437d;
            if (colorStateList != null && mode != null) {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!this.f40429c || colorForState != this.f40427a || mode != this.f40428b) {
                    setColorFilter(colorForState, mode);
                    this.f40427a = colorForState;
                    this.f40428b = mode;
                    this.f40429c = true;
                    return true;
                }
            } else {
                this.f40429c = false;
                clearColorFilter();
            }
            return false;
        }
        return false;
    }

    @Override // n3.c
    public final Drawable a() {
        return this.f40432f;
    }

    @Override // n3.c
    public final void b(Drawable drawable) {
        Drawable drawable2 = this.f40432f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f40432f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            f fVar = this.f40430d;
            if (fVar != null) {
                fVar.f40435b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    protected boolean c() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f40432f.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        f fVar = this.f40430d;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.f40432f.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        f fVar = this.f40430d;
        if (fVar == null || !fVar.a()) {
            return null;
        }
        this.f40430d.f40434a = getChangingConfigurations();
        return this.f40430d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f40432f.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f40432f.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f40432f.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return a.f(this.f40432f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f40432f.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f40432f.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f40432f.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f40432f.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f40432f.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f40432f.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return a.h(this.f40432f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        f fVar;
        ColorStateList colorStateList = (!c() || (fVar = this.f40430d) == null) ? null : fVar.f40436c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f40432f.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f40432f.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f40431e && super.mutate() == this) {
            this.f40430d = d();
            Drawable drawable = this.f40432f;
            if (drawable != null) {
                drawable.mutate();
            }
            f fVar = this.f40430d;
            if (fVar != null) {
                Drawable drawable2 = this.f40432f;
                fVar.f40435b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f40431e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f40432f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i11) {
        return a.m(this.f40432f, i11);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i11) {
        return this.f40432f.setLevel(i11);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
        scheduleSelf(runnable, j11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f40432f.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z11) {
        a.j(this.f40432f, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i11) {
        this.f40432f.setChangingConfigurations(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f40432f.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z11) {
        this.f40432f.setDither(z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z11) {
        this.f40432f.setFilterBitmap(z11);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return f(iArr) || this.f40432f.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, n3.b
    public void setTint(int i11) {
        setTintList(ColorStateList.valueOf(i11));
    }

    @Override // android.graphics.drawable.Drawable, n3.b
    public void setTintList(ColorStateList colorStateList) {
        this.f40430d.f40436c = colorStateList;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable, n3.b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f40430d.f40437d = mode;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        return super.setVisible(z11, z12) || this.f40432f.setVisible(z11, z12);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public d(Drawable drawable) {
        this.f40430d = d();
        b(drawable);
    }
}