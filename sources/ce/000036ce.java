package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a0;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a  reason: collision with root package name */
    private int f15806a;

    /* loaded from: classes3.dex */
    class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f15807a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f15808b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ok.a f15809c;

        a(View view, int i11, ok.a aVar) {
            this.f15807a = view;
            this.f15808b = i11;
            this.f15809c = aVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f15807a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f15806a == this.f15808b) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                ok.a aVar = this.f15809c;
                expandableBehavior.H((View) aVar, this.f15807a, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f15806a = 0;
    }

    private boolean F(boolean z11) {
        if (!z11) {
            return this.f15806a == 1;
        }
        int i11 = this.f15806a;
        return i11 == 0 || i11 == 2;
    }

    protected ok.a G(CoordinatorLayout coordinatorLayout, View view) {
        List<View> r11 = coordinatorLayout.r(view);
        int size = r11.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view2 = r11.get(i11);
            if (e(coordinatorLayout, view, view2)) {
                return (ok.a) view2;
            }
        }
        return null;
    }

    protected abstract boolean H(View view, View view2, boolean z11, boolean z12);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        ok.a aVar = (ok.a) view2;
        if (F(aVar.a())) {
            this.f15806a = aVar.a() ? 1 : 2;
            return H((View) aVar, view, aVar.a(), true);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i11) {
        ok.a G;
        if (a0.a0(view) || (G = G(coordinatorLayout, view)) == null || !F(G.a())) {
            return false;
        }
        int i12 = G.a() ? 1 : 2;
        this.f15806a = i12;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i12, G));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15806a = 0;
    }
}