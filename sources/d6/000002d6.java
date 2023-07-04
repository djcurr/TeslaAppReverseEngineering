package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* loaded from: classes.dex */
public class z extends ToggleButton implements androidx.core.view.y {

    /* renamed from: a  reason: collision with root package name */
    private final d f2031a;

    /* renamed from: b  reason: collision with root package name */
    private final x f2032b;

    public z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f2031a;
        if (dVar != null) {
            dVar.b();
        }
        x xVar = this.f2032b;
        if (xVar != null) {
            xVar.b();
        }
    }

    @Override // androidx.core.view.y
    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f2031a;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.y
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f2031a;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f2031a;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        d dVar = this.f2031a;
        if (dVar != null) {
            dVar.g(i11);
        }
    }

    @Override // androidx.core.view.y
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f2031a;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.y
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f2031a;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    public z(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        p0.a(this, getContext());
        d dVar = new d(this);
        this.f2031a = dVar;
        dVar.e(attributeSet, i11);
        x xVar = new x(this);
        this.f2032b = xVar;
        xVar.m(attributeSet, i11);
    }
}