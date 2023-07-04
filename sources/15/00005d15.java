package com.stripe.android.view;

import android.content.Context;
import android.os.Build;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R;
import com.stripe.android.core.model.Country;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.core.model.CountryUtils;
import com.stripe.android.databinding.AddressWidgetBinding;
import com.stripe.android.model.Address;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class ShippingInfoWidget extends LinearLayout {
    public static final int $stable = 8;
    private final StripeEditText addressEditText;
    private final StripeEditText addressEditText2;
    private final TextInputLayout addressLine1TextInputLayout;
    private final TextInputLayout addressLine2TextInputLayout;
    private final StripeEditText cityEditText;
    private final TextInputLayout cityTextInputLayout;
    private final CountryTextInputLayout countryAutoCompleteTextView;
    private List<? extends CustomizableShippingField> hiddenFields;
    private final StripeEditText nameEditText;
    private final TextInputLayout nameTextInputLayout;
    private List<? extends CustomizableShippingField> optionalFields;
    private final StripeEditText phoneNumberEditText;
    private final TextInputLayout phoneNumberTextInputLayout;
    private final StripeEditText postalCodeEditText;
    private final TextInputLayout postalCodeTextInputLayout;
    private final PostalCodeValidator postalCodeValidator;
    private final StripeEditText stateEditText;
    private final TextInputLayout stateTextInputLayout;
    private final vz.k viewBinding$delegate;

    /* loaded from: classes6.dex */
    public enum CustomizableShippingField {
        Line1,
        Line2,
        City,
        PostalCode,
        State,
        Phone
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShippingInfoWidget(Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShippingInfoWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    public /* synthetic */ ShippingInfoWidget(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final ShippingInformation getRawShippingInformation() {
        Address.Builder city = new Address.Builder().setCity(this.cityEditText.getFieldText$payments_core_release());
        Country selectedCountry$payments_core_release = this.countryAutoCompleteTextView.getSelectedCountry$payments_core_release();
        return new ShippingInformation(city.setCountryCode(selectedCountry$payments_core_release == null ? null : selectedCountry$payments_core_release.getCode()).setLine1(this.addressEditText.getFieldText$payments_core_release()).setLine2(this.addressEditText2.getFieldText$payments_core_release()).setPostalCode(this.postalCodeEditText.getFieldText$payments_core_release()).setState(this.stateEditText.getFieldText$payments_core_release()).build(), this.nameEditText.getFieldText$payments_core_release(), this.phoneNumberEditText.getFieldText$payments_core_release());
    }

    private final AddressWidgetBinding getViewBinding() {
        return (AddressWidgetBinding) this.viewBinding$delegate.getValue();
    }

    private final void hideHiddenFields() {
        if (isFieldHidden(CustomizableShippingField.Line1)) {
            this.addressLine1TextInputLayout.setVisibility(8);
        }
        if (isFieldHidden(CustomizableShippingField.Line2)) {
            this.addressLine2TextInputLayout.setVisibility(8);
        }
        if (isFieldHidden(CustomizableShippingField.State)) {
            this.stateTextInputLayout.setVisibility(8);
        }
        if (isFieldHidden(CustomizableShippingField.City)) {
            this.cityTextInputLayout.setVisibility(8);
        }
        if (isFieldHidden(CustomizableShippingField.PostalCode)) {
            this.postalCodeTextInputLayout.setVisibility(8);
        }
        if (isFieldHidden(CustomizableShippingField.Phone)) {
            this.phoneNumberTextInputLayout.setVisibility(8);
        }
    }

    private final void initView() {
        this.countryAutoCompleteTextView.setCountryChangeCallback$payments_core_release(new ShippingInfoWidget$initView$1(this));
        this.phoneNumberEditText.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
        setupErrorHandling();
        renderLabels();
        Country selectedCountry$payments_core_release = this.countryAutoCompleteTextView.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release == null) {
            return;
        }
        updateConfigForCountry(selectedCountry$payments_core_release);
    }

    private final boolean isFieldHidden(CustomizableShippingField customizableShippingField) {
        return this.hiddenFields.contains(customizableShippingField);
    }

    private final boolean isFieldOptional(CustomizableShippingField customizableShippingField) {
        return this.optionalFields.contains(customizableShippingField);
    }

    private final boolean isFieldRequired(CustomizableShippingField customizableShippingField) {
        return (isFieldOptional(customizableShippingField) || isFieldHidden(customizableShippingField)) ? false : true;
    }

    private final void populateAddressFields(Address address) {
        this.cityEditText.setText(address.getCity());
        String country = address.getCountry();
        if (country != null) {
            if (country.length() > 0) {
                this.countryAutoCompleteTextView.setCountrySelected$payments_core_release(country);
            }
        }
        this.addressEditText.setText(address.getLine1());
        this.addressEditText2.setText(address.getLine2());
        this.postalCodeEditText.setText(address.getPostalCode());
        this.stateEditText.setText(address.getState());
    }

    private final void renderCanadianForm() {
        String string;
        String string2;
        String string3;
        TextInputLayout textInputLayout = this.addressLine1TextInputLayout;
        if (isFieldOptional(CustomizableShippingField.Line1)) {
            string = getResources().getString(R.string.address_label_address_optional);
        } else {
            string = getResources().getString(R.string.address_label_address);
        }
        textInputLayout.setHint(string);
        this.addressLine2TextInputLayout.setHint(getResources().getString(R.string.address_label_apt_optional));
        TextInputLayout textInputLayout2 = this.postalCodeTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.PostalCode)) {
            string2 = getResources().getString(R.string.address_label_postal_code_optional);
        } else {
            string2 = getResources().getString(R.string.address_label_postal_code);
        }
        textInputLayout2.setHint(string2);
        TextInputLayout textInputLayout3 = this.stateTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.State)) {
            string3 = getResources().getString(R.string.address_label_province_optional);
        } else {
            string3 = getResources().getString(R.string.address_label_province);
        }
        textInputLayout3.setHint(string3);
        this.postalCodeEditText.setErrorMessage(getResources().getString(R.string.address_postal_code_invalid));
        this.stateEditText.setErrorMessage(getResources().getString(R.string.address_province_required));
    }

    private final void renderGreatBritainForm() {
        String string;
        String string2;
        String string3;
        TextInputLayout textInputLayout = this.addressLine1TextInputLayout;
        if (isFieldOptional(CustomizableShippingField.Line1)) {
            string = getResources().getString(R.string.address_label_address_line1_optional);
        } else {
            string = getResources().getString(R.string.address_label_address_line1);
        }
        textInputLayout.setHint(string);
        this.addressLine2TextInputLayout.setHint(getResources().getString(R.string.address_label_address_line2_optional));
        TextInputLayout textInputLayout2 = this.postalCodeTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.PostalCode)) {
            string2 = getResources().getString(R.string.address_label_postcode_optional);
        } else {
            string2 = getResources().getString(R.string.address_label_postcode);
        }
        textInputLayout2.setHint(string2);
        TextInputLayout textInputLayout3 = this.stateTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.State)) {
            string3 = getResources().getString(R.string.address_label_county_optional);
        } else {
            string3 = getResources().getString(R.string.address_label_county);
        }
        textInputLayout3.setHint(string3);
        this.postalCodeEditText.setErrorMessage(getResources().getString(R.string.address_postcode_invalid));
        this.stateEditText.setErrorMessage(getResources().getString(R.string.address_county_required));
    }

    private final void renderInternationalForm() {
        String string;
        String string2;
        String string3;
        TextInputLayout textInputLayout = this.addressLine1TextInputLayout;
        if (isFieldOptional(CustomizableShippingField.Line1)) {
            string = getResources().getString(R.string.address_label_address_line1_optional);
        } else {
            string = getResources().getString(R.string.address_label_address_line1);
        }
        textInputLayout.setHint(string);
        this.addressLine2TextInputLayout.setHint(getResources().getString(R.string.address_label_address_line2_optional));
        TextInputLayout textInputLayout2 = this.postalCodeTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.PostalCode)) {
            string2 = getResources().getString(R.string.address_label_zip_postal_code_optional);
        } else {
            string2 = getResources().getString(R.string.address_label_zip_postal_code);
        }
        textInputLayout2.setHint(string2);
        TextInputLayout textInputLayout3 = this.stateTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.State)) {
            string3 = getResources().getString(R.string.address_label_region_generic_optional);
        } else {
            string3 = getResources().getString(R.string.address_label_region_generic);
        }
        textInputLayout3.setHint(string3);
        this.postalCodeEditText.setErrorMessage(getResources().getString(R.string.address_zip_postal_invalid));
        this.stateEditText.setErrorMessage(getResources().getString(R.string.address_region_generic_required));
    }

    private final void renderLabels() {
        String string;
        String string2;
        this.nameTextInputLayout.setHint(getResources().getString(R.string.address_label_name));
        TextInputLayout textInputLayout = this.cityTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.City)) {
            string = getResources().getString(R.string.address_label_city_optional);
        } else {
            string = getResources().getString(R.string.address_label_city);
        }
        textInputLayout.setHint(string);
        TextInputLayout textInputLayout2 = this.phoneNumberTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.Phone)) {
            string2 = getResources().getString(R.string.address_label_phone_number_optional);
        } else {
            string2 = getResources().getString(R.string.address_label_phone_number);
        }
        textInputLayout2.setHint(string2);
        hideHiddenFields();
    }

    private final void renderUSForm() {
        String string;
        String string2;
        String string3;
        TextInputLayout textInputLayout = this.addressLine1TextInputLayout;
        if (isFieldOptional(CustomizableShippingField.Line1)) {
            string = getResources().getString(R.string.address_label_address_optional);
        } else {
            string = getResources().getString(R.string.address_label_address);
        }
        textInputLayout.setHint(string);
        this.addressLine2TextInputLayout.setHint(getResources().getString(R.string.address_label_apt_optional));
        TextInputLayout textInputLayout2 = this.postalCodeTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.PostalCode)) {
            string2 = getResources().getString(R.string.address_label_zip_code_optional);
        } else {
            string2 = getResources().getString(R.string.address_label_zip_code);
        }
        textInputLayout2.setHint(string2);
        TextInputLayout textInputLayout3 = this.stateTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.State)) {
            string3 = getResources().getString(R.string.address_label_state_optional);
        } else {
            string3 = getResources().getString(R.string.address_label_state);
        }
        textInputLayout3.setHint(string3);
        this.postalCodeEditText.setErrorMessage(getResources().getString(R.string.address_zip_invalid));
        this.stateEditText.setErrorMessage(getResources().getString(R.string.address_state_required));
    }

    private final void setupErrorHandling() {
        this.addressEditText.setErrorMessageListener(new ErrorListener(this.addressLine1TextInputLayout));
        this.cityEditText.setErrorMessageListener(new ErrorListener(this.cityTextInputLayout));
        this.nameEditText.setErrorMessageListener(new ErrorListener(this.nameTextInputLayout));
        this.postalCodeEditText.setErrorMessageListener(new ErrorListener(this.postalCodeTextInputLayout));
        this.stateEditText.setErrorMessageListener(new ErrorListener(this.stateTextInputLayout));
        this.phoneNumberEditText.setErrorMessageListener(new ErrorListener(this.phoneNumberTextInputLayout));
        this.addressEditText.setErrorMessage(getResources().getString(R.string.address_required));
        this.cityEditText.setErrorMessage(getResources().getString(R.string.address_city_required));
        this.nameEditText.setErrorMessage(getResources().getString(R.string.address_name_required));
        this.phoneNumberEditText.setErrorMessage(getResources().getString(R.string.address_phone_number_required));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateConfigForCountry(Country country) {
        String value = country.getCode().getValue();
        if (kotlin.jvm.internal.s.c(value, Locale.US.getCountry())) {
            renderUSForm();
        } else if (kotlin.jvm.internal.s.c(value, Locale.UK.getCountry())) {
            renderGreatBritainForm();
        } else if (kotlin.jvm.internal.s.c(value, Locale.CANADA.getCountry())) {
            renderCanadianForm();
        } else {
            renderInternationalForm();
        }
        updatePostalCodeInputFilter(country);
        this.postalCodeTextInputLayout.setVisibility((!CountryUtils.INSTANCE.doesCountryUsePostalCode(country.getCode()) || isFieldHidden(CustomizableShippingField.PostalCode)) ? 8 : 0);
    }

    private final void updatePostalCodeInputFilter(Country country) {
        this.postalCodeEditText.setFilters(kotlin.jvm.internal.s.c(country.getCode().getValue(), Locale.CANADA.getCountry()) ? new InputFilter[]{new InputFilter.AllCaps()} : new InputFilter[0]);
    }

    public final List<CustomizableShippingField> getHiddenFields() {
        return this.hiddenFields;
    }

    public final List<CustomizableShippingField> getOptionalFields() {
        return this.optionalFields;
    }

    public final ShippingInformation getShippingInformation() {
        if (validateAllFields()) {
            return getRawShippingInformation();
        }
        return null;
    }

    public final void populateShippingInfo(ShippingInformation shippingInformation) {
        if (shippingInformation == null) {
            return;
        }
        Address address = shippingInformation.getAddress();
        if (address != null) {
            populateAddressFields(address);
        }
        this.nameEditText.setText(shippingInformation.getName());
        this.phoneNumberEditText.setText(shippingInformation.getPhone());
    }

    public final void setAllowedCountryCodes(Set<String> allowedCountryCodes) {
        kotlin.jvm.internal.s.g(allowedCountryCodes, "allowedCountryCodes");
        this.countryAutoCompleteTextView.setAllowedCountryCodes$payments_core_release(allowedCountryCodes);
    }

    public final void setHiddenFields(List<? extends CustomizableShippingField> value) {
        kotlin.jvm.internal.s.g(value, "value");
        this.hiddenFields = value;
        renderLabels();
        Country selectedCountry$payments_core_release = this.countryAutoCompleteTextView.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release == null) {
            return;
        }
        updateConfigForCountry(selectedCountry$payments_core_release);
    }

    public final void setOptionalFields(List<? extends CustomizableShippingField> value) {
        kotlin.jvm.internal.s.g(value, "value");
        this.optionalFields = value;
        renderLabels();
        Country selectedCountry$payments_core_release = this.countryAutoCompleteTextView.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release == null) {
            return;
        }
        updateConfigForCountry(selectedCountry$payments_core_release);
    }

    public final boolean validateAllFields() {
        CountryCode code;
        Editable text = this.addressEditText.getText();
        String str = null;
        String obj = text == null ? null : text.toString();
        if (obj == null) {
            return false;
        }
        Editable text2 = this.nameEditText.getText();
        String obj2 = text2 == null ? null : text2.toString();
        if (obj2 == null) {
            return false;
        }
        Editable text3 = this.cityEditText.getText();
        String obj3 = text3 == null ? null : text3.toString();
        if (obj3 == null) {
            return false;
        }
        Editable text4 = this.stateEditText.getText();
        String obj4 = text4 == null ? null : text4.toString();
        if (obj4 == null) {
            return false;
        }
        Editable text5 = this.postalCodeEditText.getText();
        String obj5 = text5 == null ? null : text5.toString();
        if (obj5 == null) {
            return false;
        }
        Editable text6 = this.phoneNumberEditText.getText();
        String obj6 = text6 == null ? null : text6.toString();
        if (obj6 == null) {
            return false;
        }
        this.countryAutoCompleteTextView.validateCountry$payments_core_release();
        Country selectedCountry$payments_core_release = this.countryAutoCompleteTextView.getSelectedCountry$payments_core_release();
        PostalCodeValidator postalCodeValidator = this.postalCodeValidator;
        if (selectedCountry$payments_core_release != null && (code = selectedCountry$payments_core_release.getCode()) != null) {
            str = code.getValue();
        }
        boolean isValid$payments_core_release = postalCodeValidator.isValid$payments_core_release(obj5, str, this.optionalFields, this.hiddenFields);
        this.postalCodeEditText.setShouldShowError(!isValid$payments_core_release);
        boolean z11 = (obj.length() == 0) && isFieldRequired(CustomizableShippingField.Line1);
        this.addressEditText.setShouldShowError(z11);
        boolean z12 = (obj3.length() == 0) && isFieldRequired(CustomizableShippingField.City);
        this.cityEditText.setShouldShowError(z12);
        boolean z13 = obj2.length() == 0;
        this.nameEditText.setShouldShowError(z13);
        boolean z14 = (obj4.length() == 0) && isFieldRequired(CustomizableShippingField.State);
        this.stateEditText.setShouldShowError(z14);
        boolean z15 = (obj6.length() == 0) && isFieldRequired(CustomizableShippingField.Phone);
        this.phoneNumberEditText.setShouldShowError(z15);
        return (!isValid$payments_core_release || z11 || z12 || z14 || z13 || z15 || selectedCountry$payments_core_release == null) ? false : true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShippingInfoWidget(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        vz.k a11;
        List<? extends CustomizableShippingField> i12;
        List<? extends CustomizableShippingField> i13;
        kotlin.jvm.internal.s.g(context, "context");
        a11 = vz.m.a(new ShippingInfoWidget$viewBinding$2(context, this));
        this.viewBinding$delegate = a11;
        this.postalCodeValidator = new PostalCodeValidator();
        i12 = wz.w.i();
        this.optionalFields = i12;
        i13 = wz.w.i();
        this.hiddenFields = i13;
        CountryTextInputLayout countryTextInputLayout = getViewBinding().countryAutocompleteAaw;
        kotlin.jvm.internal.s.f(countryTextInputLayout, "viewBinding.countryAutocompleteAaw");
        this.countryAutoCompleteTextView = countryTextInputLayout;
        TextInputLayout textInputLayout = getViewBinding().tlAddressLine1Aaw;
        kotlin.jvm.internal.s.f(textInputLayout, "viewBinding.tlAddressLine1Aaw");
        this.addressLine1TextInputLayout = textInputLayout;
        TextInputLayout textInputLayout2 = getViewBinding().tlAddressLine2Aaw;
        kotlin.jvm.internal.s.f(textInputLayout2, "viewBinding.tlAddressLine2Aaw");
        this.addressLine2TextInputLayout = textInputLayout2;
        TextInputLayout textInputLayout3 = getViewBinding().tlCityAaw;
        kotlin.jvm.internal.s.f(textInputLayout3, "viewBinding.tlCityAaw");
        this.cityTextInputLayout = textInputLayout3;
        TextInputLayout textInputLayout4 = getViewBinding().tlNameAaw;
        kotlin.jvm.internal.s.f(textInputLayout4, "viewBinding.tlNameAaw");
        this.nameTextInputLayout = textInputLayout4;
        TextInputLayout textInputLayout5 = getViewBinding().tlPostalCodeAaw;
        kotlin.jvm.internal.s.f(textInputLayout5, "viewBinding.tlPostalCodeAaw");
        this.postalCodeTextInputLayout = textInputLayout5;
        TextInputLayout textInputLayout6 = getViewBinding().tlStateAaw;
        kotlin.jvm.internal.s.f(textInputLayout6, "viewBinding.tlStateAaw");
        this.stateTextInputLayout = textInputLayout6;
        TextInputLayout textInputLayout7 = getViewBinding().tlPhoneNumberAaw;
        kotlin.jvm.internal.s.f(textInputLayout7, "viewBinding.tlPhoneNumberAaw");
        this.phoneNumberTextInputLayout = textInputLayout7;
        StripeEditText stripeEditText = getViewBinding().etAddressLineOneAaw;
        kotlin.jvm.internal.s.f(stripeEditText, "viewBinding.etAddressLineOneAaw");
        this.addressEditText = stripeEditText;
        StripeEditText stripeEditText2 = getViewBinding().etAddressLineTwoAaw;
        kotlin.jvm.internal.s.f(stripeEditText2, "viewBinding.etAddressLineTwoAaw");
        this.addressEditText2 = stripeEditText2;
        StripeEditText stripeEditText3 = getViewBinding().etCityAaw;
        kotlin.jvm.internal.s.f(stripeEditText3, "viewBinding.etCityAaw");
        this.cityEditText = stripeEditText3;
        StripeEditText stripeEditText4 = getViewBinding().etNameAaw;
        kotlin.jvm.internal.s.f(stripeEditText4, "viewBinding.etNameAaw");
        this.nameEditText = stripeEditText4;
        StripeEditText stripeEditText5 = getViewBinding().etPostalCodeAaw;
        kotlin.jvm.internal.s.f(stripeEditText5, "viewBinding.etPostalCodeAaw");
        this.postalCodeEditText = stripeEditText5;
        StripeEditText stripeEditText6 = getViewBinding().etStateAaw;
        kotlin.jvm.internal.s.f(stripeEditText6, "viewBinding.etStateAaw");
        this.stateEditText = stripeEditText6;
        StripeEditText stripeEditText7 = getViewBinding().etPhoneNumberAaw;
        kotlin.jvm.internal.s.f(stripeEditText7, "viewBinding.etPhoneNumberAaw");
        this.phoneNumberEditText = stripeEditText7;
        setOrientation(1);
        if (Build.VERSION.SDK_INT >= 26) {
            stripeEditText4.setAutofillHints(new String[]{"name"});
            textInputLayout.setAutofillHints(new String[]{"postalAddress"});
            stripeEditText5.setAutofillHints(new String[]{"postalCode"});
            stripeEditText7.setAutofillHints(new String[]{PaymentMethod.BillingDetails.PARAM_PHONE});
        }
        initView();
    }
}