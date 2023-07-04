package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.a0;
import com.google.android.material.internal.k;
import fk.j;
import wk.g;
import wk.h;

/* loaded from: classes3.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: g2  reason: collision with root package name */
    private static final int f14860g2 = j.f26517u;
    private Integer Q1;
    private boolean V1;

    /* renamed from: b2  reason: collision with root package name */
    private boolean f14861b2;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fk.b.Q);
    }

    private Pair<Integer, Integer> P(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i11 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i11 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i11 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void Q(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            gVar.Y(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.O(context);
            gVar.X(a0.z(this));
            a0.z0(this, gVar);
        }
    }

    private void R(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i11 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i12 = measuredWidth2 + i11;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i11, 0), Math.max(i12 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i11 += max;
            i12 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i12 - i11, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i11, view.getTop(), i12, view.getBottom());
    }

    private void S() {
        if (this.V1 || this.f14861b2) {
            TextView c11 = k.c(this);
            TextView a11 = k.a(this);
            if (c11 == null && a11 == null) {
                return;
            }
            Pair<Integer, Integer> P = P(c11, a11);
            if (this.V1 && c11 != null) {
                R(c11, P);
            }
            if (!this.f14861b2 || a11 == null) {
                return;
            }
            R(a11, P);
        }
    }

    private Drawable T(Drawable drawable) {
        if (drawable == null || this.Q1 == null) {
            return drawable;
        }
        Drawable r11 = n3.a.r(drawable.mutate());
        n3.a.n(r11, this.Q1.intValue());
        return r11;
    }

    public Integer getNavigationIconTint() {
        return this.Q1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        S();
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        h.d(this, f11);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(T(drawable));
    }

    public void setNavigationIconTint(int i11) {
        this.Q1 = Integer.valueOf(i11);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z11) {
        if (this.f14861b2 != z11) {
            this.f14861b2 = z11;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z11) {
        if (this.V1 != z11) {
            this.V1 = z11;
            requestLayout();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialToolbar(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.appbar.MaterialToolbar.f14860g2
            android.content.Context r8 = yk.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = fk.k.K2
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.j.h(r0, r1, r2, r3, r4, r5)
            int r10 = fk.k.L2
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L29
            r0 = -1
            int r10 = r9.getColor(r10, r0)
            r7.setNavigationIconTint(r10)
        L29:
            int r10 = fk.k.N2
            boolean r10 = r9.getBoolean(r10, r6)
            r7.V1 = r10
            int r10 = fk.k.M2
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f14861b2 = r10
            r9.recycle()
            r7.Q(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}