package com.stripe.android.view;

import android.view.ViewStub;
import com.stripe.android.databinding.StripeActivityBinding;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class StripeActivity$viewStub$2 extends kotlin.jvm.internal.u implements h00.a<ViewStub> {
    final /* synthetic */ StripeActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeActivity$viewStub$2(StripeActivity stripeActivity) {
        super(0);
        this.this$0 = stripeActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final ViewStub invoke() {
        StripeActivityBinding viewBinding;
        viewBinding = this.this$0.getViewBinding();
        ViewStub viewStub = viewBinding.viewStub;
        kotlin.jvm.internal.s.f(viewStub, "viewBinding.viewStub");
        return viewStub;
    }
}