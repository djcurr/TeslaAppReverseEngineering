package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import androidx.lifecycle.LiveData;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.model.ClientSecret;
import com.stripe.android.paymentsheet.model.PaymentIntentClientSecret;
import com.stripe.android.paymentsheet.model.SetupIntentClientSecret;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class USBankAccountFormFragment$clientSecret$2 extends u implements h00.a<ClientSecret> {
    final /* synthetic */ USBankAccountFormFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormFragment$clientSecret$2(USBankAccountFormFragment uSBankAccountFormFragment) {
        super(0);
        this.this$0 = uSBankAccountFormFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    /* renamed from: invoke */
    public final ClientSecret mo11invoke() {
        BaseSheetViewModel sheetViewModel;
        LiveData<StripeIntent> stripeIntent$paymentsheet_release;
        sheetViewModel = this.this$0.getSheetViewModel();
        StripeIntent value = (sheetViewModel == null || (stripeIntent$paymentsheet_release = sheetViewModel.getStripeIntent$paymentsheet_release()) == null) ? null : stripeIntent$paymentsheet_release.getValue();
        if (value instanceof PaymentIntent) {
            String clientSecret = ((PaymentIntent) value).getClientSecret();
            s.e(clientSecret);
            return new PaymentIntentClientSecret(clientSecret);
        } else if (value instanceof SetupIntent) {
            String clientSecret2 = ((SetupIntent) value).getClientSecret();
            s.e(clientSecret2);
            return new SetupIntentClientSecret(clientSecret2);
        } else {
            return null;
        }
    }
}