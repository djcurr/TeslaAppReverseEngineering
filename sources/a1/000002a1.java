package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a */
    private final ImageView f1851a;

    /* renamed from: b */
    private s0 f1852b;

    /* renamed from: c */
    private s0 f1853c;

    /* renamed from: d */
    private s0 f1854d;

    public m(ImageView imageView) {
        this.f1851a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f1854d == null) {
            this.f1854d = new s0();
        }
        s0 s0Var = this.f1854d;
        s0Var.a();
        ColorStateList a11 = androidx.core.widget.i.a(this.f1851a);
        if (a11 != null) {
            s0Var.f1925d = true;
            s0Var.f1922a = a11;
        }
        PorterDuff.Mode b11 = androidx.core.widget.i.b(this.f1851a);
        if (b11 != null) {
            s0Var.f1924c = true;
            s0Var.f1923b = b11;
        }
        if (s0Var.f1925d || s0Var.f1924c) {
            i.i(drawable, s0Var, this.f1851a.getDrawableState());
            return true;
        }
        return false;
    }

    private boolean j() {
        int i11 = Build.VERSION.SDK_INT;
        return i11 > 21 ? this.f1852b != null : i11 == 21;
    }

    public void b() {
        Drawable drawable = this.f1851a.getDrawable();
        if (drawable != null) {
            c0.b(drawable);
        }
        if (drawable != null) {
            if (j() && a(drawable)) {
                return;
            }
            s0 s0Var = this.f1853c;
            if (s0Var != null) {
                i.i(drawable, s0Var, this.f1851a.getDrawableState());
                return;
            }
            s0 s0Var2 = this.f1852b;
            if (s0Var2 != null) {
                i.i(drawable, s0Var2, this.f1851a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        s0 s0Var = this.f1853c;
        if (s0Var != null) {
            return s0Var.f1922a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        s0 s0Var = this.f1853c;
        if (s0Var != null) {
            return s0Var.f1923b;
        }
        return null;
    }

    public boolean e() {
        return Build.VERSION.SDK_INT < 21 || !(this.f1851a.getBackground() instanceof RippleDrawable);
    }

    public void f(AttributeSet attributeSet, int i11) {
        int n11;
        Context context = this.f1851a.getContext();
        int[] iArr = g.j.M;
        u0 v11 = u0.v(context, attributeSet, iArr, i11, 0);
        ImageView imageView = this.f1851a;
        androidx.core.view.a0.u0(imageView, imageView.getContext(), iArr, attributeSet, v11.r(), i11, 0);
        try {
            Drawable drawable = this.f1851a.getDrawable();
            if (drawable == null && (n11 = v11.n(g.j.N, -1)) != -1 && (drawable = h.a.d(this.f1851a.getContext(), n11)) != null) {
                this.f1851a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                c0.b(drawable);
            }
            int i12 = g.j.O;
            if (v11.s(i12)) {
                androidx.core.widget.i.c(this.f1851a, v11.c(i12));
            }
            int i13 = g.j.P;
            if (v11.s(i13)) {
                androidx.core.widget.i.d(this.f1851a, c0.e(v11.k(i13, -1), null));
            }
        } finally {
            v11.w();
        }
    }

    public void g(int i11) {
        if (i11 != 0) {
            Drawable d11 = h.a.d(this.f1851a.getContext(), i11);
            if (d11 != null) {
                c0.b(d11);
            }
            this.f1851a.setImageDrawable(d11);
        } else {
            this.f1851a.setImageDrawable(null);
        }
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (this.f1853c == null) {
            this.f1853c = new s0();
        }
        s0 s0Var = this.f1853c;
        s0Var.f1922a = colorStateList;
        s0Var.f1925d = true;
        b();
    }

    public void i(PorterDuff.Mode mode) {
        if (this.f1853c == null) {
            this.f1853c = new s0();
        }
        s0 s0Var = this.f1853c;
        s0Var.f1923b = mode;
        s0Var.f1924c = true;
        b();
    }
}