package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class u extends p {

    /* renamed from: d */
    private final SeekBar f1928d;

    /* renamed from: e */
    private Drawable f1929e;

    /* renamed from: f */
    private ColorStateList f1930f;

    /* renamed from: g */
    private PorterDuff.Mode f1931g;

    /* renamed from: h */
    private boolean f1932h;

    /* renamed from: i */
    private boolean f1933i;

    public u(SeekBar seekBar) {
        super(seekBar);
        this.f1930f = null;
        this.f1931g = null;
        this.f1932h = false;
        this.f1933i = false;
        this.f1928d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f1929e;
        if (drawable != null) {
            if (this.f1932h || this.f1933i) {
                Drawable r11 = n3.a.r(drawable.mutate());
                this.f1929e = r11;
                if (this.f1932h) {
                    n3.a.o(r11, this.f1930f);
                }
                if (this.f1933i) {
                    n3.a.p(this.f1929e, this.f1931g);
                }
                if (this.f1929e.isStateful()) {
                    this.f1929e.setState(this.f1928d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.p
    public void c(AttributeSet attributeSet, int i11) {
        super.c(attributeSet, i11);
        Context context = this.f1928d.getContext();
        int[] iArr = g.j.Q;
        u0 v11 = u0.v(context, attributeSet, iArr, i11, 0);
        SeekBar seekBar = this.f1928d;
        androidx.core.view.a0.u0(seekBar, seekBar.getContext(), iArr, attributeSet, v11.r(), i11, 0);
        Drawable h11 = v11.h(g.j.R);
        if (h11 != null) {
            this.f1928d.setThumb(h11);
        }
        j(v11.g(g.j.S));
        int i12 = g.j.U;
        if (v11.s(i12)) {
            this.f1931g = c0.e(v11.k(i12, -1), this.f1931g);
            this.f1933i = true;
        }
        int i13 = g.j.T;
        if (v11.s(i13)) {
            this.f1930f = v11.c(i13);
            this.f1932h = true;
        }
        v11.w();
        f();
    }

    public void g(Canvas canvas) {
        if (this.f1929e != null) {
            int max = this.f1928d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1929e.getIntrinsicWidth();
                int intrinsicHeight = this.f1929e.getIntrinsicHeight();
                int i11 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i12 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1929e.setBounds(-i11, -i12, i11, i12);
                float width = ((this.f1928d.getWidth() - this.f1928d.getPaddingLeft()) - this.f1928d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f1928d.getPaddingLeft(), this.f1928d.getHeight() / 2);
                for (int i13 = 0; i13 <= max; i13++) {
                    this.f1929e.draw(canvas);
                    canvas.translate(width, BitmapDescriptorFactory.HUE_RED);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    public void h() {
        Drawable drawable = this.f1929e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1928d.getDrawableState())) {
            this.f1928d.invalidateDrawable(drawable);
        }
    }

    public void i() {
        Drawable drawable = this.f1929e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f1929e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1929e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1928d);
            n3.a.m(drawable, androidx.core.view.a0.F(this.f1928d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1928d.getDrawableState());
            }
            f();
        }
        this.f1928d.invalidate();
    }
}