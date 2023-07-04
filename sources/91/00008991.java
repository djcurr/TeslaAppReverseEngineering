package n3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class e extends d {

    /* renamed from: h */
    private static Method f40433h;

    public e(Drawable drawable) {
        super(drawable);
        g();
    }

    private void g() {
        if (f40433h == null) {
            try {
                f40433h = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e11) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e11);
            }
        }
    }

    @Override // n3.d
    protected boolean c() {
        if (Build.VERSION.SDK_INT == 21) {
            Drawable drawable = this.f40432f;
            return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f40432f.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f40432f.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f40432f;
        if (drawable != null && (method = f40433h) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e11) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e11);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f11, float f12) {
        this.f40432f.setHotspot(f11, f12);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i11, int i12, int i13, int i14) {
        this.f40432f.setHotspotBounds(i11, i12, i13, i14);
    }

    @Override // n3.d, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (super.setState(iArr)) {
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // n3.d, android.graphics.drawable.Drawable, n3.b
    public void setTint(int i11) {
        if (c()) {
            super.setTint(i11);
        } else {
            this.f40432f.setTint(i11);
        }
    }

    @Override // n3.d, android.graphics.drawable.Drawable, n3.b
    public void setTintList(ColorStateList colorStateList) {
        if (c()) {
            super.setTintList(colorStateList);
        } else {
            this.f40432f.setTintList(colorStateList);
        }
    }

    @Override // n3.d, android.graphics.drawable.Drawable, n3.b
    public void setTintMode(PorterDuff.Mode mode) {
        if (c()) {
            super.setTintMode(mode);
        } else {
            this.f40432f.setTintMode(mode);
        }
    }

    public e(f fVar, Resources resources) {
        super(fVar, resources);
        g();
    }
}