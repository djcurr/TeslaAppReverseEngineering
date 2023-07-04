package com.stripe.android.view;

import android.content.Intent;
import com.stripe.android.view.AddPaymentMethodActivityStarter;

/* loaded from: classes6.dex */
final class AddPaymentMethodActivity$args$2 extends kotlin.jvm.internal.u implements h00.a<AddPaymentMethodActivityStarter.Args> {
    final /* synthetic */ AddPaymentMethodActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodActivity$args$2(AddPaymentMethodActivity addPaymentMethodActivity) {
        super(0);
        this.this$0 = addPaymentMethodActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final AddPaymentMethodActivityStarter.Args invoke() {
        AddPaymentMethodActivityStarter.Args.Companion companion = AddPaymentMethodActivityStarter.Args.Companion;
        Intent intent = this.this$0.getIntent();
        kotlin.jvm.internal.s.f(intent, "intent");
        return companion.create$payments_core_release(intent);
    }
}