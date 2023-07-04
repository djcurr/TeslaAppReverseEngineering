package com.stripe.android.paymentsheet.paymentdatacollection.ach.di;

import android.content.Context;
import com.stripe.android.PaymentConfiguration;
import h00.a;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class USBankAccountFormViewModelModule$providePublishableKey$1 extends u implements a<String> {
    final /* synthetic */ Context $appContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormViewModelModule$providePublishableKey$1(Context context) {
        super(0);
        this.$appContext = context;
    }

    @Override // h00.a
    public final String invoke() {
        return PaymentConfiguration.Companion.getInstance(this.$appContext).getPublishableKey();
    }
}