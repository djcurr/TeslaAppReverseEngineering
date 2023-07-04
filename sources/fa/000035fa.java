package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
class q extends LinearLayoutManager {

    /* loaded from: classes3.dex */
    class a extends androidx.recyclerview.widget.p {
        a(q qVar, Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.p
        protected float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(Context context, int i11, boolean z11) {
        super(context, i11, z11);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i11) {
        a aVar = new a(this, recyclerView.getContext());
        aVar.p(i11);
        startSmoothScroll(aVar);
    }
}