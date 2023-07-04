package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a */
    private final View f1737a;

    /* renamed from: d */
    private s0 f1740d;

    /* renamed from: e */
    private s0 f1741e;

    /* renamed from: f */
    private s0 f1742f;

    /* renamed from: c */
    private int f1739c = -1;

    /* renamed from: b */
    private final i f1738b = i.b();

    public d(View view) {
        this.f1737a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f1742f == null) {
            this.f1742f = new s0();
        }
        s0 s0Var = this.f1742f;
        s0Var.a();
        ColorStateList v11 = androidx.core.view.a0.v(this.f1737a);
        if (v11 != null) {
            s0Var.f1925d = true;
            s0Var.f1922a = v11;
        }
        PorterDuff.Mode w11 = androidx.core.view.a0.w(this.f1737a);
        if (w11 != null) {
            s0Var.f1924c = true;
            s0Var.f1923b = w11;
        }
        if (s0Var.f1925d || s0Var.f1924c) {
            i.i(drawable, s0Var, this.f1737a.getDrawableState());
            return true;
        }
        return false;
    }

    private boolean k() {
        int i11 = Build.VERSION.SDK_INT;
        return i11 > 21 ? this.f1740d != null : i11 == 21;
    }

    public void b() {
        Drawable background = this.f1737a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            s0 s0Var = this.f1741e;
            if (s0Var != null) {
                i.i(background, s0Var, this.f1737a.getDrawableState());
                return;
            }
            s0 s0Var2 = this.f1740d;
            if (s0Var2 != null) {
                i.i(background, s0Var2, this.f1737a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        s0 s0Var = this.f1741e;
        if (s0Var != null) {
            return s0Var.f1922a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        s0 s0Var = this.f1741e;
        if (s0Var != null) {
            return s0Var.f1923b;
        }
        return null;
    }

    public void e(AttributeSet attributeSet, int i11) {
        Context context = this.f1737a.getContext();
        int[] iArr = g.j.A3;
        u0 v11 = u0.v(context, attributeSet, iArr, i11, 0);
        View view = this.f1737a;
        androidx.core.view.a0.u0(view, view.getContext(), iArr, attributeSet, v11.r(), i11, 0);
        try {
            int i12 = g.j.B3;
            if (v11.s(i12)) {
                this.f1739c = v11.n(i12, -1);
                ColorStateList f11 = this.f1738b.f(this.f1737a.getContext(), this.f1739c);
                if (f11 != null) {
                    h(f11);
                }
            }
            int i13 = g.j.C3;
            if (v11.s(i13)) {
                androidx.core.view.a0.A0(this.f1737a, v11.c(i13));
            }
            int i14 = g.j.D3;
            if (v11.s(i14)) {
                androidx.core.view.a0.B0(this.f1737a, c0.e(v11.k(i14, -1), null));
            }
        } finally {
            v11.w();
        }
    }

    public void f(Drawable drawable) {
        this.f1739c = -1;
        h(null);
        b();
    }

    public void g(int i11) {
        this.f1739c = i11;
        i iVar = this.f1738b;
        h(iVar != null ? iVar.f(this.f1737a.getContext(), i11) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1740d == null) {
                this.f1740d = new s0();
            }
            s0 s0Var = this.f1740d;
            s0Var.f1922a = colorStateList;
            s0Var.f1925d = true;
        } else {
            this.f1740d = null;
        }
        b();
    }

    public void i(ColorStateList colorStateList) {
        if (this.f1741e == null) {
            this.f1741e = new s0();
        }
        s0 s0Var = this.f1741e;
        s0Var.f1922a = colorStateList;
        s0Var.f1925d = true;
        b();
    }

    public void j(PorterDuff.Mode mode) {
        if (this.f1741e == null) {
            this.f1741e = new s0();
        }
        s0 s0Var = this.f1741e;
        s0Var.f1923b = mode;
        s0Var.f1924c = true;
        b();
    }
}