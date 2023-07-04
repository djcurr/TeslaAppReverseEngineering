package com.facebook.react.views.view;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import androidx.core.view.a0;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private e f12830a;

    /* renamed from: b  reason: collision with root package name */
    private View f12831b;

    public f(View view) {
        this.f12831b = view;
    }

    private e a() {
        if (this.f12830a == null) {
            this.f12830a = new e(this.f12831b.getContext());
            Drawable background = this.f12831b.getBackground();
            a0.z0(this.f12831b, null);
            if (background == null) {
                a0.z0(this.f12831b, this.f12830a);
            } else {
                a0.z0(this.f12831b, new LayerDrawable(new Drawable[]{this.f12830a, background}));
            }
        }
        return this.f12830a;
    }

    public void b(int i11) {
        if (i11 == 0 && this.f12830a == null) {
            return;
        }
        a().x(i11);
    }

    public void c(int i11, float f11, float f12) {
        a().t(i11, f11, f12);
    }

    public void d(float f11) {
        a().y(f11);
    }

    public void e(float f11, int i11) {
        a().z(f11, i11);
    }

    public void f(String str) {
        a().v(str);
    }

    public void g(int i11, float f11) {
        a().w(i11, f11);
    }
}