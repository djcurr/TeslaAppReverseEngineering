package com.stripe.android.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.databinding.StripeCardFormViewBinding;
import com.stripe.android.databinding.StripeHorizontalDividerBinding;
import com.stripe.android.databinding.StripeVerticalDividerBinding;
import com.stripe.android.model.Address;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.ExpirationDate;
import com.stripe.android.view.CardValidCallback;
import com.stripe.android.view.PostalCodeEditText;
import com.stripe.android.view.StripeEditText;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wz.w0;
import wz.x0;

/* loaded from: classes6.dex */
public final class CardFormView extends LinearLayout {
    public static final String CARD_FORM_VIEW = "CardFormView";
    private static final String STATE_ENABLED = "state_enabled";
    private static final String STATE_SUPER_STATE = "state_super_state";
    private final MaterialCardView cardContainer;
    private final CardMultilineWidget cardMultilineWidget;
    private CardValidCallback cardValidCallback;
    private final CardFormView$cardValidTextWatcher$1 cardValidTextWatcher;
    private final CountryTextInputLayout countryLayout;
    private final View countryPostalDivider;
    private final TextView errors;
    private final Map<CardValidCallback.Fields, String> errorsMap;
    private final LayoutInflater layoutInflater;
    private final TextInputLayout postalCodeContainer;
    private final PostalCodeValidator postalCodeValidator;
    private final PostalCodeEditText postalCodeView;
    private Style style;
    private final StripeCardFormViewBinding viewBinding;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public enum Style {
        Standard(0),
        Borderless(1);
        
        private final int attrValue;

        Style(int i11) {
            this.attrValue = i11;
        }

        public final int getAttrValue$payments_core_release() {
            return this.attrValue;
        }
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Style.values().length];
            iArr[Style.Standard.ordinal()] = 1;
            iArr[Style.Borderless.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardFormView(Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardFormView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    public /* synthetic */ CardFormView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public static /* synthetic */ void a(CardFormView cardFormView, View view, boolean z11) {
        m510setupCountryAndPostal$lambda5(cardFormView, view, z11);
    }

    public static final /* synthetic */ CardMultilineWidget access$getCardMultilineWidget$p(CardFormView cardFormView) {
        return cardFormView.cardMultilineWidget;
    }

    public static final /* synthetic */ CardValidCallback access$getCardValidCallback$p(CardFormView cardFormView) {
        return cardFormView.cardValidCallback;
    }

    public static final /* synthetic */ Set access$getInvalidFields(CardFormView cardFormView) {
        return cardFormView.getInvalidFields();
    }

    public static final /* synthetic */ TextInputLayout access$getPostalCodeContainer$p(CardFormView cardFormView) {
        return cardFormView.postalCodeContainer;
    }

    public static final /* synthetic */ PostalCodeEditText access$getPostalCodeView$p(CardFormView cardFormView) {
        return cardFormView.postalCodeView;
    }

    public static final /* synthetic */ void access$onFieldError(CardFormView cardFormView, CardValidCallback.Fields fields, String str) {
        cardFormView.onFieldError(fields, str);
    }

    private final void applyBorderlessStyle() {
        this.cardMultilineWidget.getCardNumberTextInputLayout().addView(StripeHorizontalDividerBinding.inflate(this.layoutInflater, this.cardMultilineWidget, false).getRoot(), 1);
        this.cardMultilineWidget.getExpiryTextInputLayout().addView(StripeHorizontalDividerBinding.inflate(this.layoutInflater, this.cardMultilineWidget, false).getRoot(), 1);
        this.cardMultilineWidget.getCvcInputLayout().addView(StripeHorizontalDividerBinding.inflate(this.layoutInflater, this.cardMultilineWidget, false).getRoot(), 1);
        CountryTextInputLayout countryTextInputLayout = this.countryLayout;
        countryTextInputLayout.addView(StripeHorizontalDividerBinding.inflate(this.layoutInflater, countryTextInputLayout, false).getRoot());
        this.countryPostalDivider.setVisibility(8);
        this.cardContainer.setCardElevation(BitmapDescriptorFactory.HUE_RED);
    }

    private final void applyStandardStyle() {
        CardMultilineWidget cardMultilineWidget = this.cardMultilineWidget;
        cardMultilineWidget.addView(StripeHorizontalDividerBinding.inflate(this.layoutInflater, cardMultilineWidget, false).getRoot(), 1);
        this.cardMultilineWidget.getSecondRowLayout().addView(StripeVerticalDividerBinding.inflate(this.layoutInflater, this.cardMultilineWidget.getSecondRowLayout(), false).getRoot(), 1);
        CardMultilineWidget cardMultilineWidget2 = this.cardMultilineWidget;
        cardMultilineWidget2.addView(StripeHorizontalDividerBinding.inflate(this.layoutInflater, cardMultilineWidget2, false).getRoot(), this.cardMultilineWidget.getChildCount());
        this.cardContainer.setCardElevation(getResources().getDimension(R.dimen.stripe_card_form_view_card_elevation));
    }

    private final Collection<StripeEditText> getAllEditTextFields() {
        List l11;
        l11 = wz.w.l(this.cardMultilineWidget.getCardNumberEditText(), this.cardMultilineWidget.getExpiryDateEditText(), this.cardMultilineWidget.getCvcEditText(), this.postalCodeView);
        return l11;
    }

    public final Set<CardValidCallback.Fields> getInvalidFields() {
        List O0;
        List m11;
        List y02;
        Set<CardValidCallback.Fields> S0;
        O0 = wz.e0.O0(this.cardMultilineWidget.getInvalidFields$payments_core_release());
        CardValidCallback.Fields fields = CardValidCallback.Fields.Postal;
        if (!(!isPostalValid())) {
            fields = null;
        }
        m11 = wz.w.m(fields);
        y02 = wz.e0.y0(O0, m11);
        S0 = wz.e0.S0(y02);
        return S0;
    }

    private final boolean isPostalValid() {
        CountryCode selectedCountryCode$payments_core_release = this.countryLayout.getSelectedCountryCode$payments_core_release();
        if (selectedCountryCode$payments_core_release == null) {
            return false;
        }
        PostalCodeValidator postalCodeValidator = this.postalCodeValidator;
        String postalCode$payments_core_release = this.postalCodeView.getPostalCode$payments_core_release();
        if (postalCode$payments_core_release == null) {
            postalCode$payments_core_release = "";
        }
        return postalCodeValidator.isValid(postalCode$payments_core_release, selectedCountryCode$payments_core_release.getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0047 A[EDGE_INSN: B:46:0x0047->B:43:0x0047 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onFieldError(com.stripe.android.view.CardValidCallback.Fields r6, java.lang.String r7) {
        /*
            r5 = this;
            java.util.Map<com.stripe.android.view.CardValidCallback$Fields, java.lang.String> r0 = r5.errorsMap
            r0.put(r6, r7)
            com.stripe.android.view.CardValidCallback$Fields[] r6 = com.stripe.android.view.CardValidCallback.Fields.values()
            java.util.ArrayList r7 = new java.util.ArrayList
            int r0 = r6.length
            r7.<init>(r0)
            int r0 = r6.length
            r1 = 0
            r2 = r1
        L12:
            if (r2 >= r0) goto L24
            r3 = r6[r2]
            java.util.Map<com.stripe.android.view.CardValidCallback$Fields, java.lang.String> r4 = r5.errorsMap
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r7.add(r3)
            int r2 = r2 + 1
            goto L12
        L24:
            java.util.Iterator r6 = r7.iterator()
        L28:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L46
            java.lang.Object r7 = r6.next()
            r0 = r7
            java.lang.String r0 = (java.lang.String) r0
            r2 = 1
            if (r0 == 0) goto L41
            boolean r0 = kotlin.text.m.w(r0)
            if (r0 == 0) goto L3f
            goto L41
        L3f:
            r0 = r1
            goto L42
        L41:
            r0 = r2
        L42:
            r0 = r0 ^ r2
            if (r0 == 0) goto L28
            goto L47
        L46:
            r7 = 0
        L47:
            java.lang.String r7 = (java.lang.String) r7
            r5.updateErrorsView(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.CardFormView.onFieldError(com.stripe.android.view.CardValidCallback$Fields, java.lang.String):void");
    }

    private final void setupCardWidget() {
        Set<StripeEditText> i11;
        Set<TextInputLayout> i12;
        i11 = x0.i(this.cardMultilineWidget.getCardNumberEditText(), this.cardMultilineWidget.getExpiryDateEditText(), this.cardMultilineWidget.getCvcEditText());
        for (StripeEditText stripeEditText : i11) {
            stripeEditText.setTextSize(0, getResources().getDimension(R.dimen.stripe_card_form_view_textsize));
            stripeEditText.setTextColor(androidx.core.content.b.getColorStateList(getContext(), R.color.stripe_card_form_view_text_color));
            stripeEditText.setBackgroundResource(17170445);
            stripeEditText.setErrorColor(androidx.core.content.b.getColor(getContext(), R.color.stripe_card_form_view_form_error));
        }
        this.cardMultilineWidget.getExpiryDateEditText().setIncludeSeparatorGaps$payments_core_release(true);
        this.cardMultilineWidget.setExpirationDatePlaceholderRes$payments_core_release(null);
        this.cardMultilineWidget.getExpiryTextInputLayout().setHint(getContext().getString(R.string.stripe_paymentsheet_expiration_date_hint));
        this.cardMultilineWidget.getCardNumberTextInputLayout().setPlaceholderText(null);
        this.cardMultilineWidget.setCvcPlaceholderText("");
        this.cardMultilineWidget.getCvcEditText().setImeOptions(5);
        this.cardMultilineWidget.setBackgroundResource(R.drawable.stripe_card_form_view_text_input_layout_background);
        this.cardMultilineWidget.getCvcEditText().addTextChangedListener(new TextWatcher() { // from class: com.stripe.android.view.CardFormView$setupCardWidget$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if ((CardFormView.access$getPostalCodeContainer$p(CardFormView.this).getVisibility() == 0) && CardFormView.access$getCardMultilineWidget$p(CardFormView.this).getBrand$payments_core_release().isMaxCvc(String.valueOf(editable))) {
                    CardFormView.access$getPostalCodeView$p(CardFormView.this).requestFocus();
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
            }
        });
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.stripe_card_form_view_text_margin_horizontal);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.stripe_card_form_view_text_margin_vertical);
        i12 = x0.i(this.cardMultilineWidget.getCardNumberTextInputLayout(), this.cardMultilineWidget.getExpiryTextInputLayout(), this.cardMultilineWidget.getCvcInputLayout());
        for (TextInputLayout textInputLayout : i12) {
            ViewGroup.LayoutParams layoutParams = textInputLayout.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart(dimensionPixelSize);
            layoutParams2.setMarginEnd(dimensionPixelSize);
            layoutParams2.topMargin = dimensionPixelSize2;
            layoutParams2.bottomMargin = dimensionPixelSize2;
            textInputLayout.setLayoutParams(layoutParams2);
            textInputLayout.setErrorEnabled(false);
            textInputLayout.setError(null);
        }
        this.cardMultilineWidget.setCvcIcon(Integer.valueOf(R.drawable.stripe_ic_cvc));
        this.cardMultilineWidget.setCardNumberErrorListener$payments_core_release(new StripeEditText.ErrorMessageListener() { // from class: com.stripe.android.view.CardFormView$setupCardWidget$4
            @Override // com.stripe.android.view.StripeEditText.ErrorMessageListener
            public final void displayErrorMessage(String str) {
                CardFormView.access$onFieldError(CardFormView.this, CardValidCallback.Fields.Number, str);
            }
        });
        this.cardMultilineWidget.setExpirationDateErrorListener$payments_core_release(new StripeEditText.ErrorMessageListener() { // from class: com.stripe.android.view.CardFormView$setupCardWidget$5
            @Override // com.stripe.android.view.StripeEditText.ErrorMessageListener
            public final void displayErrorMessage(String str) {
                CardFormView.access$onFieldError(CardFormView.this, CardValidCallback.Fields.Expiry, str);
            }
        });
        this.cardMultilineWidget.setCvcErrorListener$payments_core_release(new StripeEditText.ErrorMessageListener() { // from class: com.stripe.android.view.CardFormView$setupCardWidget$6
            @Override // com.stripe.android.view.StripeEditText.ErrorMessageListener
            public final void displayErrorMessage(String str) {
                CardFormView.access$onFieldError(CardFormView.this, CardValidCallback.Fields.Cvc, str);
            }
        });
        this.cardMultilineWidget.setPostalCodeErrorListener$payments_core_release(null);
    }

    private final void setupCountryAndPostal() {
        updatePostalCodeViewLocale(this.countryLayout.getSelectedCountryCode$payments_core_release());
        this.postalCodeView.setErrorColor(androidx.core.content.b.getColor(getContext(), R.color.stripe_card_form_view_form_error));
        this.postalCodeView.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.f
            {
                CardFormView.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                CardFormView.a(CardFormView.this, view, z11);
            }
        });
        this.postalCodeView.addTextChangedListener(new TextWatcher() { // from class: com.stripe.android.view.CardFormView$setupCountryAndPostal$$inlined$doAfterTextChanged$1
            {
                CardFormView.this = this;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                CardFormView.access$onFieldError(CardFormView.this, CardValidCallback.Fields.Postal, null);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            }
        });
        this.postalCodeView.setErrorMessageListener(new StripeEditText.ErrorMessageListener() { // from class: com.stripe.android.view.CardFormView$setupCountryAndPostal$3
            @Override // com.stripe.android.view.StripeEditText.ErrorMessageListener
            public final void displayErrorMessage(String str) {
                CardFormView.access$onFieldError(CardFormView.this, CardValidCallback.Fields.Postal, str);
            }
        });
        this.countryLayout.setCountryCodeChangeCallback(new CardFormView$setupCountryAndPostal$4(this));
    }

    /* renamed from: setupCountryAndPostal$lambda-5 */
    public static final void m510setupCountryAndPostal$lambda5(CardFormView this$0, View view, boolean z11) {
        boolean w11;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        if (z11) {
            return;
        }
        PostalCodeEditText postalCodeEditText = this$0.postalCodeView;
        w11 = kotlin.text.v.w(postalCodeEditText.getFieldText$payments_core_release());
        boolean z12 = true;
        postalCodeEditText.setShouldShowError((!(w11 ^ true) || this$0.isPostalValid()) ? false : false);
        if (this$0.postalCodeView.getShouldShowError()) {
            this$0.showPostalError();
        } else {
            this$0.onFieldError(CardValidCallback.Fields.Postal, null);
        }
    }

    private final void showPostalError() {
        onFieldError(CardValidCallback.Fields.Postal, this.postalCodeView.getErrorMessage$payments_core_release());
    }

    private final void updateErrorsView(String str) {
        this.errors.setText(str);
        this.errors.setVisibility(str != null ? 0 : 8);
    }

    public final void updatePostalCodeViewLocale(CountryCode countryCode) {
        if (CountryCode.Companion.isUS(countryCode)) {
            this.postalCodeView.setConfig$payments_core_release(PostalCodeEditText.Config.US);
            this.postalCodeView.setErrorMessage(getResources().getString(R.string.address_zip_invalid));
            return;
        }
        this.postalCodeView.setConfig$payments_core_release(PostalCodeEditText.Config.Global);
        this.postalCodeView.setErrorMessage(getResources().getString(R.string.address_postal_code_invalid));
    }

    public final CardParams getCardParams() {
        Set c11;
        if (!this.cardMultilineWidget.validateAllFields()) {
            this.cardMultilineWidget.setShouldShowErrorIcon$payments_core_release(true);
            return null;
        }
        this.cardMultilineWidget.setShouldShowErrorIcon$payments_core_release(false);
        if (!isPostalValid()) {
            showPostalError();
            return null;
        }
        updateErrorsView(null);
        ExpirationDate.Validated validatedDate = this.cardMultilineWidget.getExpiryDateEditText().getValidatedDate();
        if (validatedDate != null) {
            CardBrand brand$payments_core_release = this.cardMultilineWidget.getBrand$payments_core_release();
            c11 = w0.c(CARD_FORM_VIEW);
            CardNumber.Validated validatedCardNumber$payments_core_release = this.cardMultilineWidget.getValidatedCardNumber$payments_core_release();
            String value = validatedCardNumber$payments_core_release == null ? null : validatedCardNumber$payments_core_release.getValue();
            if (value == null) {
                value = "";
            }
            String str = value;
            int month = validatedDate.getMonth();
            int year = validatedDate.getYear();
            Editable text = this.cardMultilineWidget.getCvcEditText().getText();
            String obj = text == null ? null : text.toString();
            Address.Builder countryCode = new Address.Builder().setCountryCode(this.countryLayout.getSelectedCountryCode$payments_core_release());
            Editable text2 = this.postalCodeView.getText();
            return new CardParams(brand$payments_core_release, c11, str, month, year, obj, null, countryCode.setPostalCode(text2 != null ? text2.toString() : null).build(), null, null, 832, null);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable(STATE_SUPER_STATE));
            setEnabled(bundle.getBoolean(STATE_ENABLED));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return r3.b.a(vz.v.a(STATE_SUPER_STATE, super.onSaveInstanceState()), vz.v.a(STATE_ENABLED, Boolean.valueOf(isEnabled())));
    }

    public final void setCardValidCallback(CardValidCallback cardValidCallback) {
        this.cardValidCallback = cardValidCallback;
        for (StripeEditText stripeEditText : getAllEditTextFields()) {
            stripeEditText.removeTextChangedListener(this.cardValidTextWatcher);
        }
        if (cardValidCallback != null) {
            for (StripeEditText stripeEditText2 : getAllEditTextFields()) {
                stripeEditText2.addTextChangedListener(this.cardValidTextWatcher);
            }
        }
        CardValidCallback cardValidCallback2 = this.cardValidCallback;
        if (cardValidCallback2 == null) {
            return;
        }
        cardValidCallback2.onInputChanged(getInvalidFields().isEmpty(), getInvalidFields());
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        this.cardContainer.setEnabled(z11);
        this.cardMultilineWidget.setEnabled(z11);
        this.countryLayout.setEnabled(z11);
        this.postalCodeContainer.setEnabled(z11);
        this.errors.setEnabled(z11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.stripe.android.view.CardFormView$cardValidTextWatcher$1] */
    public CardFormView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.s.g(context, "context");
        LayoutInflater from = LayoutInflater.from(context);
        this.layoutInflater = from;
        StripeCardFormViewBinding inflate = StripeCardFormViewBinding.inflate(from, this);
        kotlin.jvm.internal.s.f(inflate, "inflate(layoutInflater, this)");
        this.viewBinding = inflate;
        MaterialCardView materialCardView = inflate.cardMultilineWidgetContainer;
        kotlin.jvm.internal.s.f(materialCardView, "viewBinding.cardMultilineWidgetContainer");
        this.cardContainer = materialCardView;
        CardMultilineWidget cardMultilineWidget = inflate.cardMultilineWidget;
        kotlin.jvm.internal.s.f(cardMultilineWidget, "viewBinding.cardMultilineWidget");
        this.cardMultilineWidget = cardMultilineWidget;
        View view = inflate.countryPostalDivider;
        kotlin.jvm.internal.s.f(view, "viewBinding.countryPostalDivider");
        this.countryPostalDivider = view;
        TextInputLayout textInputLayout = inflate.postalCodeContainer;
        kotlin.jvm.internal.s.f(textInputLayout, "viewBinding.postalCodeContainer");
        this.postalCodeContainer = textInputLayout;
        TextView textView = inflate.errors;
        kotlin.jvm.internal.s.f(textView, "viewBinding.errors");
        this.errors = textView;
        PostalCodeEditText postalCodeEditText = inflate.postalCode;
        kotlin.jvm.internal.s.f(postalCodeEditText, "viewBinding.postalCode");
        this.postalCodeView = postalCodeEditText;
        CountryTextInputLayout countryTextInputLayout = inflate.countryLayout;
        kotlin.jvm.internal.s.f(countryTextInputLayout, "viewBinding.countryLayout");
        this.countryLayout = countryTextInputLayout;
        this.postalCodeValidator = new PostalCodeValidator();
        this.style = Style.Standard;
        this.errorsMap = new LinkedHashMap();
        this.cardValidTextWatcher = new StripeTextWatcher() { // from class: com.stripe.android.view.CardFormView$cardValidTextWatcher$1
            {
                CardFormView.this = this;
            }

            @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                super.afterTextChanged(editable);
                CardValidCallback access$getCardValidCallback$p = CardFormView.access$getCardValidCallback$p(CardFormView.this);
                if (access$getCardValidCallback$p == null) {
                    return;
                }
                access$getCardValidCallback$p.onInputChanged(CardFormView.access$getInvalidFields(CardFormView.this).isEmpty(), CardFormView.access$getInvalidFields(CardFormView.this));
            }
        };
        setOrientation(1);
        setupCountryAndPostal();
        setupCardWidget();
        int[] StripeCardFormView = R.styleable.StripeCardFormView;
        kotlin.jvm.internal.s.f(StripeCardFormView, "StripeCardFormView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, StripeCardFormView, 0, 0);
        kotlin.jvm.internal.s.f(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(R.styleable.StripeCardFormView_backgroundColorStateList);
        this.style = Style.values()[obtainStyledAttributes.getInt(R.styleable.StripeCardFormView_cardFormStyle, 0)];
        obtainStyledAttributes.recycle();
        if (colorStateList != null) {
            materialCardView.setCardBackgroundColor(colorStateList);
            cardMultilineWidget.setBackgroundColor(0);
            countryTextInputLayout.setBackgroundColor(0);
            textInputLayout.setBackgroundColor(0);
        }
        int i12 = WhenMappings.$EnumSwitchMapping$0[this.style.ordinal()];
        if (i12 == 1) {
            applyStandardStyle();
        } else if (i12 != 2) {
        } else {
            applyBorderlessStyle();
        }
    }
}