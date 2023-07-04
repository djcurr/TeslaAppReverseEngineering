package com.stripe.android.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.databinding.CardMultilineWidgetBinding;
import com.stripe.android.model.Address;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.ExpirationDate;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.view.CardInputListener;
import com.stripe.android.view.CardMultilineWidget;
import com.stripe.android.view.PostalCodeEditText;
import com.stripe.android.view.StripeEditText;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import wz.w0;
import wz.x0;

/* loaded from: classes6.dex */
public final class CardMultilineWidget extends LinearLayout implements CardWidget {
    @Deprecated
    private static final String CARD_MULTILINE_TOKEN = "CardMultilineView";
    private CardBrand cardBrand;
    private final kotlin.properties.c cardBrandIconSupplier$delegate;
    private CardInputListener cardInputListener;
    private final CardNumberEditText cardNumberEditText;
    private final kotlin.properties.c cardNumberErrorListener$delegate;
    private final CardNumberTextInputLayout cardNumberTextInputLayout;
    private CardValidCallback cardValidCallback;
    private final CardMultilineWidget$cardValidTextWatcher$1 cardValidTextWatcher;
    private String customCvcLabel;
    private String customCvcPlaceholderText;
    private final CvcEditText cvcEditText;
    private final kotlin.properties.c cvcErrorListener$delegate;
    private final TextInputLayout cvcInputLayout;
    private final kotlin.properties.c expirationDateErrorListener$delegate;
    private final kotlin.properties.c expirationDatePlaceholderRes$delegate;
    private final ExpiryDateEditText expiryDateEditText;
    private final TextInputLayout expiryTextInputLayout;
    private boolean isEnabled;
    private final PostalCodeEditText postalCodeEditText;
    private final kotlin.properties.c postalCodeErrorListener$delegate;
    private boolean postalCodeRequired;
    private final TextInputLayout postalInputLayout;
    private final LinearLayout secondRowLayout;
    private boolean shouldShowErrorIcon;
    private boolean shouldShowPostalCode;
    private boolean showCvcIconInCvcField;
    private final List<TextInputLayout> textInputLayouts;
    private final kotlin.properties.c usZipCodeRequired$delegate;
    private final CardMultilineWidgetBinding viewBinding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {kotlin.jvm.internal.m0.f(new kotlin.jvm.internal.z(CardMultilineWidget.class, "usZipCodeRequired", "getUsZipCodeRequired()Z", 0)), kotlin.jvm.internal.m0.f(new kotlin.jvm.internal.z(CardMultilineWidget.class, "expirationDatePlaceholderRes", "getExpirationDatePlaceholderRes$payments_core_release()Ljava/lang/Integer;", 0)), kotlin.jvm.internal.m0.f(new kotlin.jvm.internal.z(CardMultilineWidget.class, "cardBrandIconSupplier", "getCardBrandIconSupplier$payments_core_release()Lcom/stripe/android/view/CardMultilineWidget$CardBrandIconSupplier;", 0)), kotlin.jvm.internal.m0.f(new kotlin.jvm.internal.z(CardMultilineWidget.class, "cardNumberErrorListener", "getCardNumberErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0)), kotlin.jvm.internal.m0.f(new kotlin.jvm.internal.z(CardMultilineWidget.class, "expirationDateErrorListener", "getExpirationDateErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0)), kotlin.jvm.internal.m0.f(new kotlin.jvm.internal.z(CardMultilineWidget.class, "cvcErrorListener", "getCvcErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0)), kotlin.jvm.internal.m0.f(new kotlin.jvm.internal.z(CardMultilineWidget.class, "postalCodeErrorListener", "getPostalCodeErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0))};
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    @Deprecated
    private static final CardBrandIconSupplier DEFAULT_CARD_BRAND_ICON_SUPPLIER = new CardBrandIconSupplier() { // from class: com.stripe.android.view.CardMultilineWidget$Companion$DEFAULT_CARD_BRAND_ICON_SUPPLIER$1
        @Override // com.stripe.android.view.CardMultilineWidget.CardBrandIconSupplier
        public final CardMultilineWidget.CardBrandIcon get(CardBrand cardBrand) {
            kotlin.jvm.internal.s.g(cardBrand, "cardBrand");
            return new CardMultilineWidget.CardBrandIcon(cardBrand.getIcon());
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.view.CardMultilineWidget$2 */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends kotlin.jvm.internal.u implements h00.a<vz.b0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2() {
            super(0);
            CardMultilineWidget.this = r1;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            CardMultilineWidget.this.getExpiryDateEditText().requestFocus();
            CardInputListener cardInputListener = CardMultilineWidget.this.cardInputListener;
            if (cardInputListener == null) {
                return;
            }
            cardInputListener.onCardComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.view.CardMultilineWidget$3 */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass3 extends kotlin.jvm.internal.u implements h00.l<CardBrand, vz.b0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3() {
            super(1);
            CardMultilineWidget.this = r1;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(CardBrand cardBrand) {
            invoke2(cardBrand);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2(CardBrand brand) {
            kotlin.jvm.internal.s.g(brand, "brand");
            CardMultilineWidget.this.cardBrand = brand;
            CardMultilineWidget.this.updateBrandUi();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.view.CardMultilineWidget$4 */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass4 extends kotlin.jvm.internal.u implements h00.a<vz.b0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4() {
            super(0);
            CardMultilineWidget.this = r1;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            CardMultilineWidget.this.getCvcEditText().requestFocus();
            CardInputListener cardInputListener = CardMultilineWidget.this.cardInputListener;
            if (cardInputListener == null) {
                return;
            }
            cardInputListener.onExpirationComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.view.CardMultilineWidget$8 */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass8 extends kotlin.jvm.internal.u implements h00.l<Boolean, vz.b0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass8() {
            super(1);
            CardMultilineWidget.this = r1;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return vz.b0.f54756a;
        }

        public final void invoke(boolean z11) {
            CardMultilineWidget.this.getCardNumberTextInputLayout().setLoading$payments_core_release(z11);
        }
    }

    /* loaded from: classes6.dex */
    public static final class CardBrandIcon {
        private final int iconResourceId;

        public CardBrandIcon(int i11) {
            this.iconResourceId = i11;
        }

        public static /* synthetic */ CardBrandIcon copy$default(CardBrandIcon cardBrandIcon, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = cardBrandIcon.iconResourceId;
            }
            return cardBrandIcon.copy(i11);
        }

        public final int component1() {
            return this.iconResourceId;
        }

        public final CardBrandIcon copy(int i11) {
            return new CardBrandIcon(i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CardBrandIcon) && this.iconResourceId == ((CardBrandIcon) obj).iconResourceId;
        }

        public final int getIconResourceId() {
            return this.iconResourceId;
        }

        public int hashCode() {
            return Integer.hashCode(this.iconResourceId);
        }

        public String toString() {
            return "CardBrandIcon(iconResourceId=" + this.iconResourceId + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes6.dex */
    public interface CardBrandIconSupplier {
        CardBrandIcon get(CardBrand cardBrand);
    }

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardMultilineWidget(Context context) {
        this(context, null, 0, false, 14, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardMultilineWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false, 12, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardMultilineWidget(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, false, 8, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    public /* synthetic */ CardMultilineWidget(Context context, AttributeSet attributeSet, int i11, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? true : z11);
    }

    public static /* synthetic */ void a(CardMultilineWidget cardMultilineWidget, View view, boolean z11) {
        m518initFocusChangeListeners$lambda29(cardMultilineWidget, view, z11);
    }

    public static final /* synthetic */ CardValidCallback access$getCardValidCallback$p(CardMultilineWidget cardMultilineWidget) {
        return cardMultilineWidget.cardValidCallback;
    }

    public static final /* synthetic */ void access$updateBrandUi(CardMultilineWidget cardMultilineWidget) {
        cardMultilineWidget.updateBrandUi();
    }

    private final void adjustViewForPostalCodeAttribute(boolean z11) {
        int i11;
        if (z11) {
            i11 = R.string.expiry_label_short;
        } else {
            i11 = R.string.acc_label_expiry_date;
        }
        this.expiryTextInputLayout.setHint(getResources().getString(i11));
        int i12 = z11 ? R.id.et_postal_code : -1;
        this.cvcEditText.setNextFocusForwardId(i12);
        this.cvcEditText.setNextFocusDownId(i12);
        int i13 = z11 ? 0 : 8;
        this.postalInputLayout.setVisibility(i13);
        this.cvcEditText.setImeOptions(i13 == 8 ? 6 : 5);
        TextInputLayout textInputLayout = this.cvcInputLayout;
        ViewGroup.LayoutParams layoutParams = textInputLayout.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginEnd(z11 ? getResources().getDimensionPixelSize(R.dimen.stripe_add_card_expiry_middle_margin) : 0);
        textInputLayout.setLayoutParams(layoutParams2);
    }

    public static /* synthetic */ void b(CardMultilineWidget cardMultilineWidget, View view, boolean z11) {
        m516initFocusChangeListeners$lambda27(cardMultilineWidget, view, z11);
    }

    public static /* synthetic */ void c(CardMultilineWidget cardMultilineWidget, View view, boolean z11) {
        m517initFocusChangeListeners$lambda28(cardMultilineWidget, view, z11);
    }

    private final void checkAttributeSet(AttributeSet attributeSet) {
        Context context = getContext();
        kotlin.jvm.internal.s.f(context, "context");
        int[] CardElement = R.styleable.CardElement;
        kotlin.jvm.internal.s.f(CardElement, "CardElement");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CardElement, 0, 0);
        kotlin.jvm.internal.s.f(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        this.shouldShowPostalCode = obtainStyledAttributes.getBoolean(R.styleable.CardElement_shouldShowPostalCode, this.shouldShowPostalCode);
        setPostalCodeRequired(obtainStyledAttributes.getBoolean(R.styleable.CardElement_shouldRequirePostalCode, getPostalCodeRequired()));
        setUsZipCodeRequired(obtainStyledAttributes.getBoolean(R.styleable.CardElement_shouldRequireUsZipCode, getUsZipCodeRequired()));
        obtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void d(CardMultilineWidget cardMultilineWidget, View view, boolean z11) {
        m515initFocusChangeListeners$lambda26(cardMultilineWidget, view, z11);
    }

    public final void flipToCvcIconIfNotFinished() {
        if (this.cardBrand.isMaxCvc(this.cvcEditText.getFieldText$payments_core_release())) {
            return;
        }
        if (this.shouldShowErrorIcon) {
            updateEndIcon(this.cardNumberEditText, this.cardBrand.getErrorIcon());
            return;
        }
        updateEndIcon(this.cardNumberEditText, this.cardBrand.getCvcIcon());
    }

    private final Collection<StripeEditText> getAllFields() {
        Set i11;
        i11 = x0.i(this.cardNumberEditText, this.expiryDateEditText, this.cvcEditText, this.postalCodeEditText);
        return i11;
    }

    private final ExpirationDate.Validated getExpirationDate() {
        return this.expiryDateEditText.getValidatedDate();
    }

    public static /* synthetic */ void getShouldShowErrorIcon$payments_core_release$annotations() {
    }

    private final void initDeleteEmptyListeners() {
        this.expiryDateEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(this.cardNumberEditText));
        this.cvcEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(this.expiryDateEditText));
        this.postalCodeEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(this.cvcEditText));
    }

    private final void initFocusChangeListeners() {
        this.cardNumberEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.n
            {
                CardMultilineWidget.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                CardMultilineWidget.d(CardMultilineWidget.this, view, z11);
            }
        });
        this.expiryDateEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.l
            {
                CardMultilineWidget.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                CardMultilineWidget.b(CardMultilineWidget.this, view, z11);
            }
        });
        this.cvcEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.m
            {
                CardMultilineWidget.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                CardMultilineWidget.c(CardMultilineWidget.this, view, z11);
            }
        });
        this.postalCodeEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.k
            {
                CardMultilineWidget.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                CardMultilineWidget.a(CardMultilineWidget.this, view, z11);
            }
        });
    }

    /* renamed from: initFocusChangeListeners$lambda-26 */
    public static final void m515initFocusChangeListeners$lambda26(CardMultilineWidget this$0, View view, boolean z11) {
        CardInputListener cardInputListener;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        if (!z11 || (cardInputListener = this$0.cardInputListener) == null) {
            return;
        }
        cardInputListener.onFocusChange(CardInputListener.FocusField.CardNumber);
    }

    /* renamed from: initFocusChangeListeners$lambda-27 */
    public static final void m516initFocusChangeListeners$lambda27(CardMultilineWidget this$0, View view, boolean z11) {
        CardInputListener cardInputListener;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        if (!z11 || (cardInputListener = this$0.cardInputListener) == null) {
            return;
        }
        cardInputListener.onFocusChange(CardInputListener.FocusField.ExpiryDate);
    }

    /* renamed from: initFocusChangeListeners$lambda-28 */
    public static final void m517initFocusChangeListeners$lambda28(CardMultilineWidget this$0, View view, boolean z11) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        if (z11) {
            if (!this$0.showCvcIconInCvcField) {
                this$0.flipToCvcIconIfNotFinished();
            }
            CardInputListener cardInputListener = this$0.cardInputListener;
            if (cardInputListener == null) {
                return;
            }
            cardInputListener.onFocusChange(CardInputListener.FocusField.Cvc);
            return;
        }
        this$0.updateBrandUi();
    }

    /* renamed from: initFocusChangeListeners$lambda-29 */
    public static final void m518initFocusChangeListeners$lambda29(CardMultilineWidget this$0, View view, boolean z11) {
        CardInputListener cardInputListener;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        if (this$0.shouldShowPostalCode && z11 && (cardInputListener = this$0.cardInputListener) != null) {
            cardInputListener.onFocusChange(CardInputListener.FocusField.PostalCode);
        }
    }

    private final void initTextInputLayoutErrorHandlers() {
        this.cardNumberEditText.setErrorMessageListener(getCardNumberErrorListener$payments_core_release());
        this.expiryDateEditText.setErrorMessageListener(getExpirationDateErrorListener$payments_core_release());
        this.cvcEditText.setErrorMessageListener(getCvcErrorListener$payments_core_release());
        this.postalCodeEditText.setErrorMessageListener(getPostalCodeErrorListener$payments_core_release());
    }

    public final boolean isPostalRequired() {
        return (this.postalCodeRequired || getUsZipCodeRequired()) && this.shouldShowPostalCode;
    }

    public final void updateBrandUi() {
        updateCvc();
        if (this.shouldShowErrorIcon) {
            updateEndIcon(this.cardNumberEditText, this.cardBrand.getErrorIcon());
            return;
        }
        updateEndIcon(this.cardNumberEditText, getCardBrandIconSupplier$payments_core_release().get(this.cardBrand).getIconResourceId());
    }

    private final void updateCvc() {
        this.cvcEditText.updateBrand$payments_core_release(this.cardBrand, this.customCvcLabel, this.customCvcPlaceholderText, this.cvcInputLayout);
    }

    private final void updateEndIcon(StripeEditText stripeEditText, int i11) {
        Drawable drawable = androidx.core.content.b.getDrawable(getContext(), i11);
        if (drawable == null) {
            return;
        }
        stripeEditText.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
    }

    @Override // com.stripe.android.view.CardWidget
    public void clear() {
        this.cardNumberEditText.setText("");
        this.expiryDateEditText.setText("");
        this.cvcEditText.setText("");
        this.postalCodeEditText.setText("");
        this.cardNumberEditText.setShouldShowError(false);
        this.expiryDateEditText.setShouldShowError(false);
        this.cvcEditText.setShouldShowError(false);
        this.postalCodeEditText.setShouldShowError(false);
        this.cardBrand = CardBrand.Unknown;
        updateBrandUi();
    }

    public final CardBrand getBrand() {
        return getBrand$payments_core_release();
    }

    public final /* synthetic */ CardBrand getBrand$payments_core_release() {
        return this.cardBrand;
    }

    public final CardBrandIconSupplier getCardBrandIconSupplier$payments_core_release() {
        return (CardBrandIconSupplier) this.cardBrandIconSupplier$delegate.getValue(this, $$delegatedProperties[2]);
    }

    public final CardNumberEditText getCardNumberEditText() {
        return this.cardNumberEditText;
    }

    public final StripeEditText.ErrorMessageListener getCardNumberErrorListener$payments_core_release() {
        return (StripeEditText.ErrorMessageListener) this.cardNumberErrorListener$delegate.getValue(this, $$delegatedProperties[3]);
    }

    public final CardNumberTextInputLayout getCardNumberTextInputLayout() {
        return this.cardNumberTextInputLayout;
    }

    @Override // com.stripe.android.view.CardWidget
    public CardParams getCardParams() {
        Set c11;
        boolean w11;
        boolean z11 = true;
        if (!validateAllFields()) {
            setShouldShowErrorIcon$payments_core_release(true);
            return null;
        }
        setShouldShowErrorIcon$payments_core_release(false);
        ExpirationDate.Validated validatedDate = this.expiryDateEditText.getValidatedDate();
        if (validatedDate != null) {
            Editable text = this.cvcEditText.getText();
            String obj = text == null ? null : text.toString();
            Editable text2 = this.postalCodeEditText.getText();
            String obj2 = text2 == null ? null : text2.toString();
            if (!this.shouldShowPostalCode) {
                obj2 = null;
            }
            CardBrand brand$payments_core_release = getBrand$payments_core_release();
            c11 = w0.c(CARD_MULTILINE_TOKEN);
            CardNumber.Validated validatedCardNumber$payments_core_release = getValidatedCardNumber$payments_core_release();
            String value = validatedCardNumber$payments_core_release == null ? null : validatedCardNumber$payments_core_release.getValue();
            if (value == null) {
                value = "";
            }
            String str = value;
            int month = validatedDate.getMonth();
            int year = validatedDate.getYear();
            Address.Builder builder = new Address.Builder();
            if (obj2 != null) {
                w11 = kotlin.text.v.w(obj2);
                if (!w11) {
                    z11 = false;
                }
            }
            return new CardParams(brand$payments_core_release, c11, str, month, year, obj, null, builder.setPostalCode(z11 ? null : obj2).build(), null, null, 832, null);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final CvcEditText getCvcEditText() {
        return this.cvcEditText;
    }

    public final StripeEditText.ErrorMessageListener getCvcErrorListener$payments_core_release() {
        return (StripeEditText.ErrorMessageListener) this.cvcErrorListener$delegate.getValue(this, $$delegatedProperties[5]);
    }

    public final TextInputLayout getCvcInputLayout() {
        return this.cvcInputLayout;
    }

    public final StripeEditText.ErrorMessageListener getExpirationDateErrorListener$payments_core_release() {
        return (StripeEditText.ErrorMessageListener) this.expirationDateErrorListener$delegate.getValue(this, $$delegatedProperties[4]);
    }

    public final Integer getExpirationDatePlaceholderRes$payments_core_release() {
        return (Integer) this.expirationDatePlaceholderRes$delegate.getValue(this, $$delegatedProperties[1]);
    }

    public final ExpiryDateEditText getExpiryDateEditText() {
        return this.expiryDateEditText;
    }

    public final TextInputLayout getExpiryTextInputLayout() {
        return this.expiryTextInputLayout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x005b, code lost:
        if (r6 == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Set<com.stripe.android.view.CardValidCallback.Fields> getInvalidFields$payments_core_release() {
        /*
            r7 = this;
            r0 = 4
            com.stripe.android.view.CardValidCallback$Fields[] r0 = new com.stripe.android.view.CardValidCallback.Fields[r0]
            com.stripe.android.view.CardValidCallback$Fields r1 = com.stripe.android.view.CardValidCallback.Fields.Number
            com.stripe.android.cards.CardNumber$Validated r2 = r7.getValidatedCardNumber$payments_core_release()
            r3 = 1
            r4 = 0
            if (r2 != 0) goto Lf
            r2 = r3
            goto L10
        Lf:
            r2 = r4
        L10:
            r5 = 0
            if (r2 == 0) goto L14
            goto L15
        L14:
            r1 = r5
        L15:
            r0[r4] = r1
            com.stripe.android.view.CardValidCallback$Fields r1 = com.stripe.android.view.CardValidCallback.Fields.Expiry
            com.stripe.android.model.ExpirationDate$Validated r2 = r7.getExpirationDate()
            if (r2 != 0) goto L21
            r2 = r3
            goto L22
        L21:
            r2 = r4
        L22:
            if (r2 == 0) goto L25
            goto L26
        L25:
            r1 = r5
        L26:
            r0[r3] = r1
            r1 = 2
            com.stripe.android.view.CardValidCallback$Fields r2 = com.stripe.android.view.CardValidCallback.Fields.Cvc
            com.stripe.android.view.CvcEditText r6 = r7.getCvcEditText()
            com.stripe.android.cards.Cvc$Validated r6 = r6.getCvc$payments_core_release()
            if (r6 != 0) goto L37
            r6 = r3
            goto L38
        L37:
            r6 = r4
        L38:
            if (r6 == 0) goto L3b
            goto L3c
        L3b:
            r2 = r5
        L3c:
            r0[r1] = r2
            r1 = 3
            com.stripe.android.view.CardValidCallback$Fields r2 = com.stripe.android.view.CardValidCallback.Fields.Postal
            boolean r6 = r7.isPostalRequired()
            if (r6 == 0) goto L5e
            com.stripe.android.view.PostalCodeEditText r6 = r7.getPostalCodeEditText$payments_core_release()
            java.lang.String r6 = r6.getPostalCode$payments_core_release()
            if (r6 == 0) goto L5a
            boolean r6 = kotlin.text.m.w(r6)
            if (r6 == 0) goto L58
            goto L5a
        L58:
            r6 = r4
            goto L5b
        L5a:
            r6 = r3
        L5b:
            if (r6 == 0) goto L5e
            goto L5f
        L5e:
            r3 = r4
        L5f:
            if (r3 == 0) goto L62
            r5 = r2
        L62:
            r0[r1] = r5
            java.util.List r0 = wz.u.n(r0)
            java.util.Set r0 = wz.u.S0(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.CardMultilineWidget.getInvalidFields$payments_core_release():java.util.Set");
    }

    public final PaymentMethod.BillingDetails getPaymentMethodBillingDetails() {
        PaymentMethod.BillingDetails.Builder paymentMethodBillingDetailsBuilder = getPaymentMethodBillingDetailsBuilder();
        if (paymentMethodBillingDetailsBuilder == null) {
            return null;
        }
        return paymentMethodBillingDetailsBuilder.build();
    }

    public final PaymentMethod.BillingDetails.Builder getPaymentMethodBillingDetailsBuilder() {
        if (this.shouldShowPostalCode && validateAllFields()) {
            return new PaymentMethod.BillingDetails.Builder().setAddress(new Address.Builder().setPostalCode(this.postalCodeEditText.getPostalCode$payments_core_release()).build());
        }
        return null;
    }

    @Override // com.stripe.android.view.CardWidget
    public PaymentMethodCreateParams.Card getPaymentMethodCard() {
        CardParams cardParams = getCardParams();
        if (cardParams == null) {
            return null;
        }
        String number$payments_core_release = cardParams.getNumber$payments_core_release();
        String cvc$payments_core_release = cardParams.getCvc$payments_core_release();
        int expMonth$payments_core_release = cardParams.getExpMonth$payments_core_release();
        int expYear$payments_core_release = cardParams.getExpYear$payments_core_release();
        return new PaymentMethodCreateParams.Card(number$payments_core_release, Integer.valueOf(expMonth$payments_core_release), Integer.valueOf(expYear$payments_core_release), cvc$payments_core_release, null, cardParams.getAttribution(), 16, null);
    }

    @Override // com.stripe.android.view.CardWidget
    public PaymentMethodCreateParams getPaymentMethodCreateParams() {
        PaymentMethodCreateParams.Card paymentMethodCard = getPaymentMethodCard();
        if (paymentMethodCard == null) {
            return null;
        }
        return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.Companion, paymentMethodCard, getPaymentMethodBillingDetails(), (Map) null, 4, (Object) null);
    }

    public final PostalCodeEditText getPostalCodeEditText$payments_core_release() {
        return this.postalCodeEditText;
    }

    public final StripeEditText.ErrorMessageListener getPostalCodeErrorListener$payments_core_release() {
        return (StripeEditText.ErrorMessageListener) this.postalCodeErrorListener$delegate.getValue(this, $$delegatedProperties[6]);
    }

    public final boolean getPostalCodeRequired() {
        return this.postalCodeRequired;
    }

    public final TextInputLayout getPostalInputLayout$payments_core_release() {
        return this.postalInputLayout;
    }

    public final LinearLayout getSecondRowLayout() {
        return this.secondRowLayout;
    }

    public final boolean getShouldShowErrorIcon$payments_core_release() {
        return this.shouldShowErrorIcon;
    }

    public final boolean getUsZipCodeRequired() {
        return ((Boolean) this.usZipCodeRequired$delegate.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final CardNumber.Validated getValidatedCardNumber$payments_core_release() {
        return this.cardNumberEditText.getValidatedCardNumber$payments_core_release();
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.isEnabled;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.cvcEditText.setHint((CharSequence) null);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z11) {
        super.onWindowFocusChanged(z11);
        if (z11) {
            updateBrandUi();
        }
    }

    public final void populate(PaymentMethodCreateParams.Card card) {
        View findFocus;
        if (card == null) {
            return;
        }
        View findFocus2 = findFocus();
        getCardNumberEditText().setText(card.getNumber$payments_core_release());
        getCvcEditText().setText(card.getCvc$payments_core_release());
        getExpiryDateEditText().setText$payments_core_release(card.getExpiryMonth$payments_core_release(), card.getExpiryYear$payments_core_release());
        if ((findFocus2 == null ? null : Boolean.valueOf(findFocus2.requestFocus())) != null || (findFocus = findFocus()) == null) {
            return;
        }
        findFocus.clearFocus();
        vz.b0 b0Var = vz.b0.f54756a;
    }

    public final void setCardBrandIconSupplier$payments_core_release(CardBrandIconSupplier cardBrandIconSupplier) {
        kotlin.jvm.internal.s.g(cardBrandIconSupplier, "<set-?>");
        this.cardBrandIconSupplier$delegate.setValue(this, $$delegatedProperties[2], cardBrandIconSupplier);
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCardHint(String cardHint) {
        kotlin.jvm.internal.s.g(cardHint, "cardHint");
        this.cardNumberTextInputLayout.setPlaceholderText(cardHint);
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCardInputListener(CardInputListener cardInputListener) {
        this.cardInputListener = cardInputListener;
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCardNumber(String str) {
        this.cardNumberEditText.setText(str);
    }

    public final void setCardNumberErrorListener(StripeEditText.ErrorMessageListener listener) {
        kotlin.jvm.internal.s.g(listener, "listener");
        setCardNumberErrorListener$payments_core_release(listener);
    }

    public final void setCardNumberErrorListener$payments_core_release(StripeEditText.ErrorMessageListener errorMessageListener) {
        kotlin.jvm.internal.s.g(errorMessageListener, "<set-?>");
        this.cardNumberErrorListener$delegate.setValue(this, $$delegatedProperties[3], errorMessageListener);
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCardNumberTextWatcher(TextWatcher textWatcher) {
        this.cardNumberEditText.addTextChangedListener(textWatcher);
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCardValidCallback(CardValidCallback cardValidCallback) {
        this.cardValidCallback = cardValidCallback;
        for (StripeEditText stripeEditText : getAllFields()) {
            stripeEditText.removeTextChangedListener(this.cardValidTextWatcher);
        }
        if (cardValidCallback != null) {
            for (StripeEditText stripeEditText2 : getAllFields()) {
                stripeEditText2.addTextChangedListener(this.cardValidTextWatcher);
            }
        }
        CardValidCallback cardValidCallback2 = this.cardValidCallback;
        if (cardValidCallback2 == null) {
            return;
        }
        cardValidCallback2.onInputChanged(getInvalidFields$payments_core_release().isEmpty(), getInvalidFields$payments_core_release());
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCvcCode(String str) {
        this.cvcEditText.setText(str);
    }

    public final void setCvcErrorListener(StripeEditText.ErrorMessageListener listener) {
        kotlin.jvm.internal.s.g(listener, "listener");
        setCvcErrorListener$payments_core_release(listener);
    }

    public final void setCvcErrorListener$payments_core_release(StripeEditText.ErrorMessageListener errorMessageListener) {
        kotlin.jvm.internal.s.g(errorMessageListener, "<set-?>");
        this.cvcErrorListener$delegate.setValue(this, $$delegatedProperties[5], errorMessageListener);
    }

    public final /* synthetic */ void setCvcIcon(Integer num) {
        if (num != null) {
            updateEndIcon(this.cvcEditText, num.intValue());
        }
        this.showCvcIconInCvcField = num != null;
    }

    public final void setCvcLabel(String str) {
        this.customCvcLabel = str;
        updateCvc();
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCvcNumberTextWatcher(TextWatcher textWatcher) {
        this.cvcEditText.addTextChangedListener(textWatcher);
    }

    public final void setCvcPlaceholderText(String str) {
        this.customCvcPlaceholderText = str;
        updateCvc();
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        for (TextInputLayout textInputLayout : this.textInputLayouts) {
            textInputLayout.setEnabled(z11);
        }
        this.isEnabled = z11;
    }

    public final void setExpirationDateErrorListener(StripeEditText.ErrorMessageListener listener) {
        kotlin.jvm.internal.s.g(listener, "listener");
        setExpirationDateErrorListener$payments_core_release(listener);
    }

    public final void setExpirationDateErrorListener$payments_core_release(StripeEditText.ErrorMessageListener errorMessageListener) {
        kotlin.jvm.internal.s.g(errorMessageListener, "<set-?>");
        this.expirationDateErrorListener$delegate.setValue(this, $$delegatedProperties[4], errorMessageListener);
    }

    public final void setExpirationDatePlaceholderRes(Integer num) {
        setExpirationDatePlaceholderRes$payments_core_release(num);
    }

    public final void setExpirationDatePlaceholderRes$payments_core_release(Integer num) {
        this.expirationDatePlaceholderRes$delegate.setValue(this, $$delegatedProperties[1], num);
    }

    @Override // com.stripe.android.view.CardWidget
    public void setExpiryDate(int i11, int i12) {
        this.expiryDateEditText.setText(new ExpirationDate.Unvalidated(i11, i12).getDisplayString());
    }

    @Override // com.stripe.android.view.CardWidget
    public void setExpiryDateTextWatcher(TextWatcher textWatcher) {
        this.expiryDateEditText.addTextChangedListener(textWatcher);
    }

    public final void setPostalCodeErrorListener(StripeEditText.ErrorMessageListener errorMessageListener) {
        setPostalCodeErrorListener$payments_core_release(errorMessageListener);
    }

    public final void setPostalCodeErrorListener$payments_core_release(StripeEditText.ErrorMessageListener errorMessageListener) {
        this.postalCodeErrorListener$delegate.setValue(this, $$delegatedProperties[6], errorMessageListener);
    }

    public final void setPostalCodeRequired(boolean z11) {
        this.postalCodeRequired = z11;
    }

    @Override // com.stripe.android.view.CardWidget
    public void setPostalCodeTextWatcher(TextWatcher textWatcher) {
        this.postalCodeEditText.addTextChangedListener(textWatcher);
    }

    public final void setShouldShowErrorIcon$payments_core_release(boolean z11) {
        boolean z12 = this.shouldShowErrorIcon != z11;
        this.shouldShowErrorIcon = z11;
        if (z12) {
            updateBrandUi();
        }
    }

    public final void setShouldShowPostalCode(boolean z11) {
        this.shouldShowPostalCode = z11;
        adjustViewForPostalCodeAttribute(z11);
    }

    public final void setUsZipCodeRequired(boolean z11) {
        this.usZipCodeRequired$delegate.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z11));
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0076 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean validateAllFields() {
        /*
            r8 = this;
            com.stripe.android.cards.CardNumber$Validated r0 = r8.getValidatedCardNumber$payments_core_release()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r1
        Lb:
            com.stripe.android.model.ExpirationDate$Validated r3 = r8.getExpirationDate()
            if (r3 == 0) goto L13
            r3 = r2
            goto L14
        L13:
            r3 = r1
        L14:
            com.stripe.android.view.CvcEditText r4 = r8.cvcEditText
            com.stripe.android.cards.Cvc$Validated r4 = r4.getCvc$payments_core_release()
            if (r4 == 0) goto L1e
            r4 = r2
            goto L1f
        L1e:
            r4 = r1
        L1f:
            com.stripe.android.view.CardNumberEditText r5 = r8.cardNumberEditText
            r6 = r0 ^ 1
            r5.setShouldShowError(r6)
            com.stripe.android.view.ExpiryDateEditText r5 = r8.expiryDateEditText
            r6 = r3 ^ 1
            r5.setShouldShowError(r6)
            com.stripe.android.view.CvcEditText r5 = r8.cvcEditText
            r6 = r4 ^ 1
            r5.setShouldShowError(r6)
            com.stripe.android.view.PostalCodeEditText r5 = r8.postalCodeEditText
            boolean r6 = r8.postalCodeRequired
            if (r6 != 0) goto L40
            boolean r6 = r8.getUsZipCodeRequired()
            if (r6 == 0) goto L56
        L40:
            com.stripe.android.view.PostalCodeEditText r6 = r8.postalCodeEditText
            java.lang.String r6 = r6.getPostalCode$payments_core_release()
            if (r6 == 0) goto L51
            boolean r6 = kotlin.text.m.w(r6)
            if (r6 == 0) goto L4f
            goto L51
        L4f:
            r6 = r1
            goto L52
        L51:
            r6 = r2
        L52:
            if (r6 == 0) goto L56
            r6 = r2
            goto L57
        L56:
            r6 = r1
        L57:
            r5.setShouldShowError(r6)
            java.util.Collection r5 = r8.getAllFields()
            java.util.Iterator r5 = r5.iterator()
        L62:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L76
            java.lang.Object r6 = r5.next()
            r7 = r6
            com.stripe.android.view.StripeEditText r7 = (com.stripe.android.view.StripeEditText) r7
            boolean r7 = r7.getShouldShowError()
            if (r7 == 0) goto L62
            goto L77
        L76:
            r6 = 0
        L77:
            com.stripe.android.view.StripeEditText r6 = (com.stripe.android.view.StripeEditText) r6
            if (r6 != 0) goto L7c
            goto L7f
        L7c:
            r6.requestFocus()
        L7f:
            if (r0 == 0) goto L8e
            if (r3 == 0) goto L8e
            if (r4 == 0) goto L8e
            com.stripe.android.view.PostalCodeEditText r0 = r8.postalCodeEditText
            boolean r0 = r0.getShouldShowError()
            if (r0 != 0) goto L8e
            r1 = r2
        L8e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.CardMultilineWidget.validateAllFields():boolean");
    }

    public final boolean validateCardNumber() {
        boolean z11 = getValidatedCardNumber$payments_core_release() != null;
        this.cardNumberEditText.setShouldShowError(!z11);
        return z11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.stripe.android.view.CardMultilineWidget$cardValidTextWatcher$1] */
    public CardMultilineWidget(Context context, AttributeSet attributeSet, int i11, boolean z11) {
        super(context, attributeSet, i11);
        List<TextInputLayout> l11;
        kotlin.jvm.internal.s.g(context, "context");
        this.shouldShowPostalCode = z11;
        CardMultilineWidgetBinding inflate = CardMultilineWidgetBinding.inflate(LayoutInflater.from(context), this);
        kotlin.jvm.internal.s.f(inflate, "inflate(\n        LayoutI…text),\n        this\n    )");
        this.viewBinding = inflate;
        CardNumberEditText cardNumberEditText = inflate.etCardNumber;
        kotlin.jvm.internal.s.f(cardNumberEditText, "viewBinding.etCardNumber");
        this.cardNumberEditText = cardNumberEditText;
        ExpiryDateEditText expiryDateEditText = inflate.etExpiry;
        kotlin.jvm.internal.s.f(expiryDateEditText, "viewBinding.etExpiry");
        this.expiryDateEditText = expiryDateEditText;
        CvcEditText cvcEditText = inflate.etCvc;
        kotlin.jvm.internal.s.f(cvcEditText, "viewBinding.etCvc");
        this.cvcEditText = cvcEditText;
        PostalCodeEditText postalCodeEditText = inflate.etPostalCode;
        kotlin.jvm.internal.s.f(postalCodeEditText, "viewBinding.etPostalCode");
        this.postalCodeEditText = postalCodeEditText;
        LinearLayout linearLayout = inflate.secondRowLayout;
        kotlin.jvm.internal.s.f(linearLayout, "viewBinding.secondRowLayout");
        this.secondRowLayout = linearLayout;
        CardNumberTextInputLayout cardNumberTextInputLayout = inflate.tlCardNumber;
        kotlin.jvm.internal.s.f(cardNumberTextInputLayout, "viewBinding.tlCardNumber");
        this.cardNumberTextInputLayout = cardNumberTextInputLayout;
        TextInputLayout textInputLayout = inflate.tlExpiry;
        kotlin.jvm.internal.s.f(textInputLayout, "viewBinding.tlExpiry");
        this.expiryTextInputLayout = textInputLayout;
        TextInputLayout textInputLayout2 = inflate.tlCvc;
        kotlin.jvm.internal.s.f(textInputLayout2, "viewBinding.tlCvc");
        this.cvcInputLayout = textInputLayout2;
        TextInputLayout textInputLayout3 = inflate.tlPostalCode;
        kotlin.jvm.internal.s.f(textInputLayout3, "viewBinding.tlPostalCode");
        this.postalInputLayout = textInputLayout3;
        l11 = wz.w.l(cardNumberTextInputLayout, textInputLayout, textInputLayout2, textInputLayout3);
        this.textInputLayouts = l11;
        this.cardValidTextWatcher = new StripeTextWatcher() { // from class: com.stripe.android.view.CardMultilineWidget$cardValidTextWatcher$1
            {
                CardMultilineWidget.this = this;
            }

            @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                super.afterTextChanged(editable);
                CardValidCallback access$getCardValidCallback$p = CardMultilineWidget.access$getCardValidCallback$p(CardMultilineWidget.this);
                if (access$getCardValidCallback$p == null) {
                    return;
                }
                access$getCardValidCallback$p.onInputChanged(CardMultilineWidget.this.getInvalidFields$payments_core_release().isEmpty(), CardMultilineWidget.this.getInvalidFields$payments_core_release());
            }
        };
        this.cardBrand = CardBrand.Unknown;
        kotlin.properties.a aVar = kotlin.properties.a.f34932a;
        this.usZipCodeRequired$delegate = new kotlin.properties.b<Boolean>(Boolean.FALSE) { // from class: com.stripe.android.view.CardMultilineWidget$special$$inlined$observable$1
            @Override // kotlin.properties.b
            protected void afterChange(n00.m<?> property, Boolean bool, Boolean bool2) {
                kotlin.jvm.internal.s.g(property, "property");
                boolean booleanValue = bool2.booleanValue();
                bool.booleanValue();
                if (booleanValue) {
                    this.getPostalCodeEditText$payments_core_release().setConfig$payments_core_release(PostalCodeEditText.Config.US);
                } else {
                    this.getPostalCodeEditText$payments_core_release().setConfig$payments_core_release(PostalCodeEditText.Config.Global);
                }
            }
        };
        this.expirationDatePlaceholderRes$delegate = new kotlin.properties.b<Integer>(Integer.valueOf(R.string.expiry_date_hint)) { // from class: com.stripe.android.view.CardMultilineWidget$special$$inlined$observable$2
            @Override // kotlin.properties.b
            protected void afterChange(n00.m<?> property, Integer num, Integer num2) {
                String string;
                kotlin.jvm.internal.s.g(property, "property");
                Integer num3 = num2;
                TextInputLayout expiryTextInputLayout = this.getExpiryTextInputLayout();
                if (num3 == null) {
                    string = null;
                } else {
                    string = this.getResources().getString(num3.intValue());
                }
                if (string == null) {
                    string = "";
                }
                expiryTextInputLayout.setPlaceholderText(string);
            }
        };
        this.cardBrandIconSupplier$delegate = new kotlin.properties.b<CardBrandIconSupplier>(DEFAULT_CARD_BRAND_ICON_SUPPLIER) { // from class: com.stripe.android.view.CardMultilineWidget$special$$inlined$observable$3
            @Override // kotlin.properties.b
            protected void afterChange(n00.m<?> property, CardMultilineWidget.CardBrandIconSupplier cardBrandIconSupplier, CardMultilineWidget.CardBrandIconSupplier cardBrandIconSupplier2) {
                kotlin.jvm.internal.s.g(property, "property");
                CardMultilineWidget.access$updateBrandUi(this);
            }
        };
        this.cardNumberErrorListener$delegate = new kotlin.properties.b<StripeEditText.ErrorMessageListener>(new ErrorListener(cardNumberTextInputLayout)) { // from class: com.stripe.android.view.CardMultilineWidget$special$$inlined$observable$4
            @Override // kotlin.properties.b
            protected void afterChange(n00.m<?> property, StripeEditText.ErrorMessageListener errorMessageListener, StripeEditText.ErrorMessageListener errorMessageListener2) {
                kotlin.jvm.internal.s.g(property, "property");
                this.getCardNumberEditText().setErrorMessageListener(errorMessageListener2);
            }
        };
        this.expirationDateErrorListener$delegate = new kotlin.properties.b<StripeEditText.ErrorMessageListener>(new ErrorListener(textInputLayout)) { // from class: com.stripe.android.view.CardMultilineWidget$special$$inlined$observable$5
            @Override // kotlin.properties.b
            protected void afterChange(n00.m<?> property, StripeEditText.ErrorMessageListener errorMessageListener, StripeEditText.ErrorMessageListener errorMessageListener2) {
                kotlin.jvm.internal.s.g(property, "property");
                this.getExpiryDateEditText().setErrorMessageListener(errorMessageListener2);
            }
        };
        this.cvcErrorListener$delegate = new kotlin.properties.b<StripeEditText.ErrorMessageListener>(new ErrorListener(textInputLayout2)) { // from class: com.stripe.android.view.CardMultilineWidget$special$$inlined$observable$6
            @Override // kotlin.properties.b
            protected void afterChange(n00.m<?> property, StripeEditText.ErrorMessageListener errorMessageListener, StripeEditText.ErrorMessageListener errorMessageListener2) {
                kotlin.jvm.internal.s.g(property, "property");
                this.getCvcEditText().setErrorMessageListener(errorMessageListener2);
            }
        };
        this.postalCodeErrorListener$delegate = new kotlin.properties.b<StripeEditText.ErrorMessageListener>(new ErrorListener(textInputLayout3)) { // from class: com.stripe.android.view.CardMultilineWidget$special$$inlined$observable$7
            @Override // kotlin.properties.b
            protected void afterChange(n00.m<?> property, StripeEditText.ErrorMessageListener errorMessageListener, StripeEditText.ErrorMessageListener errorMessageListener2) {
                kotlin.jvm.internal.s.g(property, "property");
                this.getPostalCodeEditText$payments_core_release().setErrorMessageListener(errorMessageListener2);
            }
        };
        setOrientation(1);
        Iterator<T> it2 = l11.iterator();
        while (true) {
            ColorStateList colorStateList = null;
            if (!it2.hasNext()) {
                break;
            }
            TextInputLayout textInputLayout4 = (TextInputLayout) it2.next();
            EditText editText = textInputLayout4.getEditText();
            if (editText != null) {
                colorStateList = editText.getHintTextColors();
            }
            textInputLayout4.setPlaceholderTextColor(colorStateList);
        }
        checkAttributeSet(attributeSet);
        initTextInputLayoutErrorHandlers();
        initFocusChangeListeners();
        initDeleteEmptyListeners();
        this.cardNumberEditText.setCompletionCallback$payments_core_release(new AnonymousClass2());
        this.cardNumberEditText.setBrandChangeCallback$payments_core_release(new AnonymousClass3());
        this.expiryDateEditText.setCompletionCallback$payments_core_release(new AnonymousClass4());
        this.cvcEditText.setAfterTextChangedListener(new StripeEditText.AfterTextChangedListener() { // from class: com.stripe.android.view.CardMultilineWidget.5
            {
                CardMultilineWidget.this = this;
            }

            @Override // com.stripe.android.view.StripeEditText.AfterTextChangedListener
            public final void onTextChanged(String text) {
                kotlin.jvm.internal.s.g(text, "text");
                if (CardMultilineWidget.this.cardBrand.isMaxCvc(text)) {
                    CardMultilineWidget.this.updateBrandUi();
                    if (CardMultilineWidget.this.shouldShowPostalCode) {
                        CardMultilineWidget.this.getPostalCodeEditText$payments_core_release().requestFocus();
                    }
                    CardInputListener cardInputListener = CardMultilineWidget.this.cardInputListener;
                    if (cardInputListener != null) {
                        cardInputListener.onCvcComplete();
                    }
                } else if (!CardMultilineWidget.this.showCvcIconInCvcField) {
                    CardMultilineWidget.this.flipToCvcIconIfNotFinished();
                }
                CardMultilineWidget.this.getCvcEditText().setShouldShowError(false);
            }
        });
        this.postalCodeEditText.setAfterTextChangedListener(new StripeEditText.AfterTextChangedListener() { // from class: com.stripe.android.view.CardMultilineWidget.6
            {
                CardMultilineWidget.this = this;
            }

            @Override // com.stripe.android.view.StripeEditText.AfterTextChangedListener
            public final void onTextChanged(String it3) {
                CardInputListener cardInputListener;
                kotlin.jvm.internal.s.g(it3, "it");
                if (CardMultilineWidget.this.isPostalRequired() && CardMultilineWidget.this.getPostalCodeEditText$payments_core_release().hasValidPostal$payments_core_release() && (cardInputListener = CardMultilineWidget.this.cardInputListener) != null) {
                    cardInputListener.onPostalCodeComplete();
                }
            }
        });
        adjustViewForPostalCodeAttribute(this.shouldShowPostalCode);
        CardNumberEditText.updateLengthFilter$payments_core_release$default(this.cardNumberEditText, 0, 1, null);
        this.cardBrand = CardBrand.Unknown;
        updateBrandUi();
        for (StripeEditText stripeEditText : getAllFields()) {
            stripeEditText.addTextChangedListener(new TextWatcher() { // from class: com.stripe.android.view.CardMultilineWidget$_init_$lambda-18$$inlined$doAfterTextChanged$1
                {
                    CardMultilineWidget.this = this;
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    CardMultilineWidget.this.setShouldShowErrorIcon$payments_core_release(false);
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
                }
            });
        }
        this.cardNumberEditText.setLoadingCallback$payments_core_release(new AnonymousClass8());
        this.postalCodeEditText.setConfig$payments_core_release(PostalCodeEditText.Config.Global);
        this.isEnabled = true;
    }
}