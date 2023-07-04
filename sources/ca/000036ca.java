package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.view.a0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import fk.f;
import fk.h;
import fk.k;
import wk.g;
import wk.i;

/* loaded from: classes3.dex */
class b extends ConstraintLayout {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f15798a;

    /* renamed from: b  reason: collision with root package name */
    private int f15799b;

    /* renamed from: c  reason: collision with root package name */
    private g f15800c;

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.g();
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private Drawable c() {
        g gVar = new g();
        this.f15800c = gVar;
        gVar.W(new i(0.5f));
        this.f15800c.Y(ColorStateList.valueOf(-1));
        return this.f15800c;
    }

    private static boolean f(View view) {
        return "skip".equals(view.getTag());
    }

    private void h() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f15798a);
            handler.post(this.f15798a);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i11, layoutParams);
        if (view.getId() == -1) {
            view.setId(a0.n());
        }
        h();
    }

    public int d() {
        return this.f15799b;
    }

    public void e(int i11) {
        this.f15799b = i11;
        g();
    }

    protected void g() {
        int childCount = getChildCount();
        int i11 = 1;
        for (int i12 = 0; i12 < childCount; i12++) {
            if (f(getChildAt(i12))) {
                i11++;
            }
        }
        d dVar = new d();
        dVar.n(this);
        float f11 = BitmapDescriptorFactory.HUE_RED;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            int id2 = childAt.getId();
            int i14 = f.f26431b;
            if (id2 != i14 && !f(childAt)) {
                dVar.q(childAt.getId(), i14, this.f15799b, f11);
                f11 += 360.0f / (childCount - i11);
            }
        }
        dVar.i(this);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        g();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        h();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        this.f15800c.Y(ColorStateList.valueOf(i11));
    }

    public b(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        LayoutInflater.from(context).inflate(h.f26467i, this);
        a0.z0(this, c());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.O2, i11, 0);
        this.f15799b = obtainStyledAttributes.getDimensionPixelSize(k.P2, 0);
        this.f15798a = new a();
        obtainStyledAttributes.recycle();
    }
}