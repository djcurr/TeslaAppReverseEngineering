package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* loaded from: classes.dex */
public class n extends MultiAutoCompleteTextView implements androidx.core.view.y {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f1863c = {16843126};

    /* renamed from: a  reason: collision with root package name */
    private final d f1864a;

    /* renamed from: b  reason: collision with root package name */
    private final x f1865b;

    public n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.f27054p);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f1864a;
        if (dVar != null) {
            dVar.b();
        }
        x xVar = this.f1865b;
        if (xVar != null) {
            xVar.b();
        }
    }

    @Override // androidx.core.view.y
    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f1864a;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.y
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f1864a;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return k.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f1864a;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        d dVar = this.f1864a;
        if (dVar != null) {
            dVar.g(i11);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i11) {
        setDropDownBackgroundDrawable(h.a.d(getContext(), i11));
    }

    @Override // androidx.core.view.y
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f1864a;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.y
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f1864a;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        x xVar = this.f1865b;
        if (xVar != null) {
            xVar.q(context, i11);
        }
    }

    public n(Context context, AttributeSet attributeSet, int i11) {
        super(r0.b(context), attributeSet, i11);
        p0.a(this, getContext());
        u0 v11 = u0.v(getContext(), attributeSet, f1863c, i11, 0);
        if (v11.s(0)) {
            setDropDownBackgroundDrawable(v11.g(0));
        }
        v11.w();
        d dVar = new d(this);
        this.f1864a = dVar;
        dVar.e(attributeSet, i11);
        x xVar = new x(this);
        this.f1865b = xVar;
        xVar.m(attributeSet, i11);
        xVar.b();
    }
}