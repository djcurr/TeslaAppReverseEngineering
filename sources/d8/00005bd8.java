package com.stripe.android.view;

import com.stripe.android.R;
import com.stripe.android.view.AddPaymentMethodActivityStarter;

/* loaded from: classes6.dex */
final class AddPaymentMethodActivity$addPaymentMethodView$2 extends kotlin.jvm.internal.u implements h00.a<AddPaymentMethodView> {
    final /* synthetic */ AddPaymentMethodActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodActivity$addPaymentMethodView$2(AddPaymentMethodActivity addPaymentMethodActivity) {
        super(0);
        this.this$0 = addPaymentMethodActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final AddPaymentMethodView invoke() {
        AddPaymentMethodActivityStarter.Args args;
        AddPaymentMethodView createPaymentMethodView;
        AddPaymentMethodActivity addPaymentMethodActivity = this.this$0;
        args = addPaymentMethodActivity.getArgs();
        createPaymentMethodView = addPaymentMethodActivity.createPaymentMethodView(args);
        createPaymentMethodView.setId(R.id.stripe_add_payment_method_form);
        return createPaymentMethodView;
    }
}