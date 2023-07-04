package com.plaid.internal;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class qa extends RecyclerView.o {

    /* renamed from: a  reason: collision with root package name */
    public final int f19324a;

    public qa(int i11) {
        this.f19324a = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.b0 state) {
        kotlin.jvm.internal.s.g(outRect, "outRect");
        kotlin.jvm.internal.s.g(view, "view");
        kotlin.jvm.internal.s.g(parent, "parent");
        kotlin.jvm.internal.s.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int i11 = this.f19324a;
        outRect.set(i11, i11, i11, i11);
    }
}