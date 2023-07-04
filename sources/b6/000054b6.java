package com.stripe.android.paymentsheet;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes6.dex */
public final class BasePaymentMethodsListFragment$setupRecyclerView$layoutManager$1 extends LinearLayoutManager {
    private boolean canScroll;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BasePaymentMethodsListFragment$setupRecyclerView$layoutManager$1(androidx.fragment.app.h hVar) {
        super(hVar, 0, false);
        this.canScroll = true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollHorizontally() {
        return this.canScroll && super.canScrollHorizontally();
    }

    public final boolean getCanScroll() {
        return this.canScroll;
    }

    public final void setCanScroll(boolean z11) {
        this.canScroll = z11;
    }
}