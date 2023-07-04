package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
import androidx.core.view.a0;

/* loaded from: classes3.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Rect f15170a;

    /* renamed from: b  reason: collision with root package name */
    private final ColorStateList f15171b;

    /* renamed from: c  reason: collision with root package name */
    private final ColorStateList f15172c;

    /* renamed from: d  reason: collision with root package name */
    private final ColorStateList f15173d;

    /* renamed from: e  reason: collision with root package name */
    private final int f15174e;

    /* renamed from: f  reason: collision with root package name */
    private final wk.k f15175f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i11, wk.k kVar, Rect rect) {
        v3.h.d(rect.left);
        v3.h.d(rect.top);
        v3.h.d(rect.right);
        v3.h.d(rect.bottom);
        this.f15170a = rect;
        this.f15171b = colorStateList2;
        this.f15172c = colorStateList;
        this.f15173d = colorStateList3;
        this.f15174e = i11;
        this.f15175f = kVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b a(Context context, int i11) {
        v3.h.b(i11 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i11, fk.k.Y1);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(fk.k.Z1, 0), obtainStyledAttributes.getDimensionPixelOffset(fk.k.f26527b2, 0), obtainStyledAttributes.getDimensionPixelOffset(fk.k.f26521a2, 0), obtainStyledAttributes.getDimensionPixelOffset(fk.k.f26533c2, 0));
        ColorStateList a11 = tk.c.a(context, obtainStyledAttributes, fk.k.f26539d2);
        ColorStateList a12 = tk.c.a(context, obtainStyledAttributes, fk.k.f26569i2);
        ColorStateList a13 = tk.c.a(context, obtainStyledAttributes, fk.k.f26557g2);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(fk.k.f26563h2, 0);
        wk.k m11 = wk.k.b(context, obtainStyledAttributes.getResourceId(fk.k.f26545e2, 0), obtainStyledAttributes.getResourceId(fk.k.f26551f2, 0)).m();
        obtainStyledAttributes.recycle();
        return new b(a11, a12, a13, dimensionPixelSize, m11, rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f15170a.bottom;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f15170a.top;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(TextView textView) {
        wk.g gVar = new wk.g();
        wk.g gVar2 = new wk.g();
        gVar.setShapeAppearanceModel(this.f15175f);
        gVar2.setShapeAppearanceModel(this.f15175f);
        gVar.Y(this.f15172c);
        gVar.g0(this.f15174e, this.f15173d);
        textView.setTextColor(this.f15171b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f15171b.withAlpha(30), gVar, gVar2) : gVar;
        Rect rect = this.f15170a;
        a0.z0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}