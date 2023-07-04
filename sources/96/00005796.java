package com.stripe.android.paymentsheet.ui;

import androidx.lifecycle.f0;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.core.model.CountryUtils;
import com.stripe.android.model.Address;
import com.stripe.android.paymentsheet.ui.BillingAddressView;
import com.stripe.android.view.PostalCodeValidator;
import java.util.Locale;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class BillingAddressView$newCountryCodeCallback$1 extends u implements h00.l<CountryCode, b0> {
    final /* synthetic */ BillingAddressView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingAddressView$newCountryCodeCallback$1(BillingAddressView billingAddressView) {
        super(1);
        this.this$0 = billingAddressView;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(CountryCode countryCode) {
        invoke2(countryCode);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CountryCode newCountryCode) {
        f0 f0Var;
        Address createAddress;
        PostalCodeValidator postalCodeValidator;
        String value;
        Locale locale;
        s.g(newCountryCode, "newCountryCode");
        this.this$0.updateStateView(newCountryCode);
        this.this$0.updatePostalCodeView(newCountryCode);
        f0Var = this.this$0._address;
        createAddress = this.this$0.createAddress();
        f0Var.setValue(createAddress);
        postalCodeValidator = this.this$0.postalCodeValidator;
        BillingAddressView billingAddressView = this.this$0;
        value = billingAddressView.getValue(billingAddressView.getPostalCodeView$paymentsheet_release());
        if (value == null) {
            value = "";
        }
        boolean isValid = postalCodeValidator.isValid(value, newCountryCode.getValue());
        BillingAddressView billingAddressView2 = this.this$0;
        BillingAddressView.PostalCodeViewListener postalCodeViewListener$paymentsheet_release = billingAddressView2.getPostalCodeViewListener$paymentsheet_release();
        if (postalCodeViewListener$paymentsheet_release != null) {
            CountryUtils countryUtils = CountryUtils.INSTANCE;
            locale = billingAddressView2.getLocale();
            postalCodeViewListener$paymentsheet_release.onCountryChanged(countryUtils.getCountryByCode(newCountryCode, locale), isValid);
        }
        billingAddressView2.getPostalCodeView$paymentsheet_release().setShouldShowError(!isValid);
    }
}