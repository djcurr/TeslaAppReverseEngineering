package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import android.os.Parcelable;
import com.stripe.android.paymentsheet.paymentdatacollection.ComposeFormDataCollectionFragment;
import com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class USBankAccountFormFragment$formArgs$2 extends u implements h00.a<FormFragmentArguments> {
    final /* synthetic */ USBankAccountFormFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormFragment$formArgs$2(USBankAccountFormFragment uSBankAccountFormFragment) {
        super(0);
        this.this$0 = uSBankAccountFormFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final FormFragmentArguments invoke() {
        Parcelable parcelable = this.this$0.requireArguments().getParcelable(ComposeFormDataCollectionFragment.EXTRA_CONFIG);
        if (parcelable != null) {
            return (FormFragmentArguments) parcelable;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}