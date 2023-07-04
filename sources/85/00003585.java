package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a0;
import androidx.core.view.l0;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class b extends c<View> {

    /* renamed from: d  reason: collision with root package name */
    final Rect f14872d;

    /* renamed from: e  reason: collision with root package name */
    final Rect f14873e;

    /* renamed from: f  reason: collision with root package name */
    private int f14874f;

    /* renamed from: g  reason: collision with root package name */
    private int f14875g;

    public b() {
        this.f14872d = new Rect();
        this.f14873e = new Rect();
        this.f14874f = 0;
    }

    private static int N(int i11) {
        if (i11 == 0) {
            return 8388659;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.appbar.c
    public void F(CoordinatorLayout coordinatorLayout, View view, int i11) {
        View H = H(coordinatorLayout.r(view));
        if (H != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.f14872d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, H.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + H.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
            l0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && a0.C(coordinatorLayout) && !a0.C(view)) {
                rect.left += lastWindowInsets.k();
                rect.right -= lastWindowInsets.l();
            }
            Rect rect2 = this.f14873e;
            androidx.core.view.e.a(N(fVar.f4233c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i11);
            int I = I(H);
            view.layout(rect2.left, rect2.top - I, rect2.right, rect2.bottom - I);
            this.f14874f = rect2.top - H.getBottom();
            return;
        }
        super.F(coordinatorLayout, view, i11);
        this.f14874f = 0;
    }

    abstract View H(List<View> list);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int I(View view) {
        if (this.f14875g == 0) {
            return 0;
        }
        float J = J(view);
        int i11 = this.f14875g;
        return p3.a.b((int) (J * i11), 0, i11);
    }

    abstract float J(View view);

    public final int K() {
        return this.f14875g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int L(View view) {
        return view.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int M() {
        return this.f14874f;
    }

    public final void O(int i11) {
        this.f14875g = i11;
    }

    protected boolean P() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i11, int i12, int i13, int i14) {
        View H;
        l0 lastWindowInsets;
        int i15 = view.getLayoutParams().height;
        if ((i15 == -1 || i15 == -2) && (H = H(coordinatorLayout.r(view))) != null) {
            int size = View.MeasureSpec.getSize(i13);
            if (size > 0) {
                if (a0.C(H) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.m() + lastWindowInsets.j();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int L = size + L(H);
            int measuredHeight = H.getMeasuredHeight();
            if (P()) {
                view.setTranslationY(-measuredHeight);
            } else {
                L -= measuredHeight;
            }
            coordinatorLayout.J(view, i11, i12, View.MeasureSpec.makeMeasureSpec(L, i15 == -1 ? 1073741824 : Integer.MIN_VALUE), i14);
            return true;
        }
        return false;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14872d = new Rect();
        this.f14873e = new Rect();
        this.f14874f = 0;
    }
}