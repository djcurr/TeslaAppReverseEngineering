package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* loaded from: classes.dex */
public class f extends CheckBox implements androidx.core.widget.o, androidx.core.view.y {

    /* renamed from: a  reason: collision with root package name */
    private final h f1759a;

    /* renamed from: b  reason: collision with root package name */
    private final d f1760b;

    /* renamed from: c  reason: collision with root package name */
    private final x f1761c;

    public f(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f1760b;
        if (dVar != null) {
            dVar.b();
        }
        x xVar = this.f1761c;
        if (xVar != null) {
            xVar.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        h hVar = this.f1759a;
        return hVar != null ? hVar.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // androidx.core.view.y
    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f1760b;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.y
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f1760b;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.o
    public ColorStateList getSupportButtonTintList() {
        h hVar = this.f1759a;
        if (hVar != null) {
            return hVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        h hVar = this.f1759a;
        if (hVar != null) {
            return hVar.d();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f1760b;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        d dVar = this.f1760b;
        if (dVar != null) {
            dVar.g(i11);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        h hVar = this.f1759a;
        if (hVar != null) {
            hVar.f();
        }
    }

    @Override // androidx.core.view.y
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f1760b;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.y
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f1760b;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    @Override // androidx.core.widget.o
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        h hVar = this.f1759a;
        if (hVar != null) {
            hVar.g(colorStateList);
        }
    }

    @Override // androidx.core.widget.o
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        h hVar = this.f1759a;
        if (hVar != null) {
            hVar.h(mode);
        }
    }

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.f27056r);
    }

    public f(Context context, AttributeSet attributeSet, int i11) {
        super(r0.b(context), attributeSet, i11);
        p0.a(this, getContext());
        h hVar = new h(this);
        this.f1759a = hVar;
        hVar.e(attributeSet, i11);
        d dVar = new d(this);
        this.f1760b = dVar;
        dVar.e(attributeSet, i11);
        x xVar = new x(this);
        this.f1761c = xVar;
        xVar.m(attributeSet, i11);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i11) {
        setButtonDrawable(h.a.d(getContext(), i11));
    }
}