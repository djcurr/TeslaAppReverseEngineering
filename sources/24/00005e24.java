package com.swmansion.reanimated.transitions;

import android.view.ViewGroup;
import androidx.transition.e0;
import androidx.transition.v;
import androidx.transition.y;

/* loaded from: classes6.dex */
public class SaneSidePropagation extends v {
    @Override // androidx.transition.v, androidx.transition.b0
    public long getStartDelay(ViewGroup viewGroup, y yVar, e0 e0Var, e0 e0Var2) {
        long startDelay = super.getStartDelay(viewGroup, yVar, e0Var, e0Var2);
        return startDelay != 0 ? (e0Var2 == null || getViewVisibility(e0Var) == 0) ? -startDelay : startDelay : startDelay;
    }
}