package com.stripe.android.view;

import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.stripe.android.databinding.StripeActivityBinding;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class StripeActivity$progressBar$2 extends kotlin.jvm.internal.u implements h00.a<LinearProgressIndicator> {
    final /* synthetic */ StripeActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeActivity$progressBar$2(StripeActivity stripeActivity) {
        super(0);
        this.this$0 = stripeActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final LinearProgressIndicator invoke() {
        StripeActivityBinding viewBinding;
        viewBinding = this.this$0.getViewBinding();
        return viewBinding.progressBar;
    }
}