package com.stripe.android.paymentsheet.paymentdatacollection;

import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class ComposeFormDataCollectionFragment$paymentMethodCode$2 extends u implements h00.a<String> {
    final /* synthetic */ ComposeFormDataCollectionFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeFormDataCollectionFragment$paymentMethodCode$2(ComposeFormDataCollectionFragment composeFormDataCollectionFragment) {
        super(0);
        this.this$0 = composeFormDataCollectionFragment;
    }

    @Override // h00.a
    public final String invoke() {
        FormFragmentArguments formFragmentArguments = (FormFragmentArguments) this.this$0.requireArguments().getParcelable(ComposeFormDataCollectionFragment.EXTRA_CONFIG);
        String paymentMethodCode = formFragmentArguments == null ? null : formFragmentArguments.getPaymentMethodCode();
        if (paymentMethodCode != null) {
            return paymentMethodCode;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}