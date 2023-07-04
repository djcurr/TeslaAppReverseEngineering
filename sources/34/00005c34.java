package com.stripe.android.view;

import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.core.model.CountryUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class CardFormView$setupCountryAndPostal$4 extends kotlin.jvm.internal.u implements h00.l<CountryCode, vz.b0> {
    final /* synthetic */ CardFormView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardFormView$setupCountryAndPostal$4(CardFormView cardFormView) {
        super(1);
        this.this$0 = cardFormView;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ vz.b0 invoke(CountryCode countryCode) {
        invoke2(countryCode);
        return vz.b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CountryCode countryCode) {
        TextInputLayout textInputLayout;
        PostalCodeEditText postalCodeEditText;
        PostalCodeEditText postalCodeEditText2;
        kotlin.jvm.internal.s.g(countryCode, "countryCode");
        this.this$0.updatePostalCodeViewLocale(countryCode);
        textInputLayout = this.this$0.postalCodeContainer;
        textInputLayout.setVisibility(CountryUtils.INSTANCE.doesCountryUsePostalCode(countryCode) ? 0 : 8);
        postalCodeEditText = this.this$0.postalCodeView;
        postalCodeEditText.setShouldShowError(false);
        postalCodeEditText2 = this.this$0.postalCodeView;
        postalCodeEditText2.setText((CharSequence) null);
    }
}