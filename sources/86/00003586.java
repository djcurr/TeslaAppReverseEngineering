package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class c<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    private d f14876a;

    /* renamed from: b  reason: collision with root package name */
    private int f14877b;

    /* renamed from: c  reason: collision with root package name */
    private int f14878c;

    public c() {
        this.f14877b = 0;
        this.f14878c = 0;
    }

    public int E() {
        d dVar = this.f14876a;
        if (dVar != null) {
            return dVar.b();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void F(CoordinatorLayout coordinatorLayout, V v11, int i11) {
        coordinatorLayout.I(v11, i11);
    }

    public boolean G(int i11) {
        d dVar = this.f14876a;
        if (dVar != null) {
            return dVar.e(i11);
        }
        this.f14877b = i11;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v11, int i11) {
        F(coordinatorLayout, v11, i11);
        if (this.f14876a == null) {
            this.f14876a = new d(v11);
        }
        this.f14876a.c();
        this.f14876a.a();
        int i12 = this.f14877b;
        if (i12 != 0) {
            this.f14876a.e(i12);
            this.f14877b = 0;
        }
        int i13 = this.f14878c;
        if (i13 != 0) {
            this.f14876a.d(i13);
            this.f14878c = 0;
            return true;
        }
        return true;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14877b = 0;
        this.f14878c = 0;
    }
}