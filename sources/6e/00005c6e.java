package com.stripe.android.view;

import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.R;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.cards.CardAccountRangeService;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.cards.DefaultCardAccountRangeRepositoryFactory;
import com.stripe.android.cards.DefaultStaticCardAccountRanges;
import com.stripe.android.cards.StaticCardAccountRanges;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.CardBrand;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Collection;
import java.util.Set;
import javax.inject.Provider;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v20.a2;
import v20.e1;

/* loaded from: classes6.dex */
public final class CardNumberEditText extends StripeEditText {
    public static final int $stable = 8;
    private final CardAccountRangeService accountRangeService;
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private /* synthetic */ h00.l<? super CardBrand, vz.b0> brandChangeCallback;
    private final CardAccountRangeRepository cardAccountRangeRepository;
    private CardBrand cardBrand;
    private /* synthetic */ h00.a<vz.b0> completionCallback;
    private boolean isCardNumberValid;
    private /* synthetic */ h00.l<? super Boolean, vz.b0> isLoadingCallback;
    private a2 loadingJob;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final StaticCardAccountRanges staticCardAccountRanges;
    private zz.g workContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.view.CardNumberEditText$1 */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.u implements h00.a<String> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // h00.a
        public final String invoke() {
            return PaymentConfiguration.Companion.getInstance(this.$context).getPublishableKey();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public final class CardNumberTextWatcher extends StripeTextWatcher {
        private CardNumber.Unvalidated beforeCardNumber;
        private String formattedNumber;
        private boolean isPastedPan;
        private int latestChangeStart;
        private int latestInsertionSize;
        private Integer newCursorPosition;
        final /* synthetic */ CardNumberEditText this$0;

        public CardNumberTextWatcher(CardNumberEditText this$0) {
            kotlin.jvm.internal.s.g(this$0, "this$0");
            this.this$0 = this$0;
            this.beforeCardNumber = this$0.getUnvalidatedCardNumber();
        }

        private final boolean getDigitsAdded() {
            return this.this$0.getUnvalidatedCardNumber().getLength() > this.beforeCardNumber.getLength();
        }

        private final boolean getShouldUpdateAfterChange() {
            return (getDigitsAdded() || !this.this$0.isLastKeyDelete()) && this.formattedNumber != null;
        }

        private final boolean isComplete(boolean z11) {
            return !z11 && (this.this$0.getUnvalidatedCardNumber().isMaxLength() || (this.this$0.isValid() && this.this$0.getAccountRangeService().getAccountRange() != null));
        }

        private final boolean isPastedPan(int i11, int i12, int i13, CardNumber.Unvalidated unvalidated) {
            return i13 > i12 && i11 == 0 && unvalidated.getNormalized().length() >= 14;
        }

        @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int m11;
            if (getShouldUpdateAfterChange()) {
                this.this$0.setTextSilent$payments_core_release(this.formattedNumber);
                Integer num = this.newCursorPosition;
                if (num != null) {
                    CardNumberEditText cardNumberEditText = this.this$0;
                    m11 = m00.l.m(num.intValue(), 0, cardNumberEditText.getFieldText$payments_core_release().length());
                    cardNumberEditText.setSelection(m11);
                }
            }
            this.formattedNumber = null;
            this.newCursorPosition = null;
            if (this.this$0.getUnvalidatedCardNumber().getLength() != this.this$0.getPanLength$payments_core_release()) {
                if (this.this$0.getUnvalidatedCardNumber().isPartialEntry(this.this$0.getPanLength$payments_core_release()) && !this.this$0.getUnvalidatedCardNumber().isPossibleCardBrand()) {
                    CardNumberEditText cardNumberEditText2 = this.this$0;
                    cardNumberEditText2.isCardNumberValid = cardNumberEditText2.isValid();
                    this.this$0.setShouldShowError(true);
                    return;
                }
                CardNumberEditText cardNumberEditText3 = this.this$0;
                cardNumberEditText3.isCardNumberValid = cardNumberEditText3.isValid();
                this.this$0.setShouldShowError(false);
                return;
            }
            boolean isCardNumberValid = this.this$0.isCardNumberValid();
            CardNumberEditText cardNumberEditText4 = this.this$0;
            cardNumberEditText4.isCardNumberValid = cardNumberEditText4.isValid();
            CardNumberEditText cardNumberEditText5 = this.this$0;
            cardNumberEditText5.setShouldShowError(!cardNumberEditText5.isValid());
            if (this.this$0.getAccountRangeService().getAccountRange() == null && this.this$0.getUnvalidatedCardNumber().isValidLuhn()) {
                this.this$0.onCardMetadataLoadedTooSlow$payments_core_release();
            }
            if (isComplete(isCardNumberValid)) {
                this.this$0.getCompletionCallback$payments_core_release().invoke();
            }
        }

        @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            this.isPastedPan = false;
            this.beforeCardNumber = this.this$0.getUnvalidatedCardNumber();
            this.latestChangeStart = i11;
            this.latestInsertionSize = i13;
        }

        @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            int panLength$payments_core_release;
            String obj = charSequence == null ? null : charSequence.toString();
            if (obj == null) {
                obj = "";
            }
            CardNumber.Unvalidated unvalidated = new CardNumber.Unvalidated(obj);
            this.this$0.getAccountRangeService().onCardNumberChanged(unvalidated);
            boolean isPastedPan = isPastedPan(i11, i12, i13, unvalidated);
            this.isPastedPan = isPastedPan;
            if (isPastedPan) {
                this.this$0.updateLengthFilter$payments_core_release(unvalidated.getFormatted(unvalidated.getLength()).length());
            }
            if (this.isPastedPan) {
                panLength$payments_core_release = unvalidated.getLength();
            } else {
                panLength$payments_core_release = this.this$0.getPanLength$payments_core_release();
            }
            CardNumberEditText cardNumberEditText = this.this$0;
            String formatted = unvalidated.getFormatted(panLength$payments_core_release);
            this.newCursorPosition = Integer.valueOf(cardNumberEditText.calculateCursorPosition$payments_core_release(formatted.length(), this.latestChangeStart, this.latestInsertionSize, panLength$payments_core_release));
            this.formattedNumber = formatted;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardNumberEditText(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardNumberEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    public /* synthetic */ CardNumberEditText(Context context, AttributeSet attributeSet, int i11, zz.g gVar, CardAccountRangeRepository cardAccountRangeRepository, StaticCardAccountRanges staticCardAccountRanges, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? g.a.A : i11, gVar, cardAccountRangeRepository, (i12 & 32) != 0 ? new DefaultStaticCardAccountRanges() : staticCardAccountRanges, analyticsRequestExecutor, paymentAnalyticsRequestFactory);
    }

    /* renamed from: _init_$lambda-0 */
    public static final String m519_init_$lambda0(h00.a tmp0) {
        kotlin.jvm.internal.s.g(tmp0, "$tmp0");
        return (String) tmp0.invoke();
    }

    /* renamed from: _init_$lambda-1 */
    public static final void m520_init_$lambda1(CardNumberEditText this$0, View view, boolean z11) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        if (z11 || !this$0.getUnvalidatedCardNumber().isPartialEntry(this$0.getPanLength$payments_core_release())) {
            return;
        }
        this$0.setShouldShowError(true);
    }

    public static /* synthetic */ String c(h00.a aVar) {
        return m519_init_$lambda0(aVar);
    }

    public static /* synthetic */ int calculateCursorPosition$payments_core_release$default(CardNumberEditText cardNumberEditText, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            i14 = cardNumberEditText.getPanLength$payments_core_release();
        }
        return cardNumberEditText.calculateCursorPosition$payments_core_release(i11, i12, i13, i14);
    }

    public static /* synthetic */ void d(CardNumberEditText cardNumberEditText, View view, boolean z11) {
        m520_init_$lambda1(cardNumberEditText, view, z11);
    }

    public static /* synthetic */ void getAccountRangeService$annotations() {
    }

    public static /* synthetic */ void getCardBrand$annotations() {
    }

    private final int getFormattedPanLength() {
        return getPanLength$payments_core_release() + CardNumber.Companion.getSpacePositions(getPanLength$payments_core_release()).size();
    }

    public final CardNumber.Unvalidated getUnvalidatedCardNumber() {
        return new CardNumber.Unvalidated(getFieldText$payments_core_release());
    }

    public final boolean isValid() {
        return getValidatedCardNumber$payments_core_release() != null;
    }

    public static /* synthetic */ void updateLengthFilter$payments_core_release$default(CardNumberEditText cardNumberEditText, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = cardNumberEditText.getFormattedPanLength();
        }
        cardNumberEditText.updateLengthFilter$payments_core_release(i11);
    }

    public final /* synthetic */ int calculateCursorPosition$payments_core_release(int i11, int i12, int i13, int i14) {
        int i15;
        boolean z11;
        Set<Integer> spacePositions = CardNumber.Companion.getSpacePositions(i14);
        boolean z12 = spacePositions instanceof Collection;
        boolean z13 = true;
        if (z12 && spacePositions.isEmpty()) {
            i15 = 0;
        } else {
            i15 = 0;
            for (Number number : spacePositions) {
                int intValue = number.intValue();
                if ((i12 <= intValue && i12 + i13 >= intValue) && (i15 = i15 + 1) < 0) {
                    wz.w.r();
                }
            }
        }
        if (!z12 || !spacePositions.isEmpty()) {
            for (Number number2 : spacePositions) {
                int intValue2 = number2.intValue();
                if (i13 == 0 && i12 == intValue2 + 1) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (z11) {
                    break;
                }
            }
        }
        z13 = false;
        int i16 = i12 + i13 + i15;
        if (z13 && i16 > 0) {
            i16--;
        }
        return i16 <= i11 ? i16 : i11;
    }

    @Override // com.stripe.android.view.StripeEditText
    protected String getAccessibilityText() {
        String string = getResources().getString(R.string.acc_label_card_number_node, getText());
        kotlin.jvm.internal.s.f(string, "resources.getString(R.st…l_card_number_node, text)");
        return string;
    }

    public final CardAccountRangeService getAccountRangeService() {
        return this.accountRangeService;
    }

    public final h00.l<CardBrand, vz.b0> getBrandChangeCallback$payments_core_release() {
        return this.brandChangeCallback;
    }

    public final CardBrand getCardBrand() {
        return this.cardBrand;
    }

    public final h00.a<vz.b0> getCompletionCallback$payments_core_release() {
        return this.completionCallback;
    }

    public final int getPanLength$payments_core_release() {
        AccountRange accountRange = this.accountRangeService.getAccountRange();
        Integer valueOf = accountRange == null ? null : Integer.valueOf(accountRange.getPanLength());
        if (valueOf == null) {
            AccountRange first = this.accountRangeService.getStaticCardAccountRanges().first(getUnvalidatedCardNumber());
            if (first == null) {
                return 16;
            }
            return first.getPanLength();
        }
        return valueOf.intValue();
    }

    public final CardNumber.Validated getValidatedCardNumber$payments_core_release() {
        return getUnvalidatedCardNumber().validate(getPanLength$payments_core_release());
    }

    public final zz.g getWorkContext() {
        return this.workContext;
    }

    public final boolean isCardNumberValid() {
        return this.isCardNumberValid;
    }

    public final h00.l<Boolean, vz.b0> isLoadingCallback$payments_core_release() {
        return this.isLoadingCallback;
    }

    @Override // com.google.android.material.textfield.TextInputEditText, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        a2 d11;
        super.onAttachedToWindow();
        d11 = v20.k.d(v20.p0.a(this.workContext), null, null, new CardNumberEditText$onAttachedToWindow$1(this, null), 3, null);
        this.loadingJob = d11;
    }

    public final /* synthetic */ void onCardMetadataLoadedTooSlow$payments_core_release() {
        this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.CardMetadataLoadedTooSlow, null, null, null, null, 30, null));
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        a2 a2Var = this.loadingJob;
        if (a2Var != null) {
            a2.a.a(a2Var, null, 1, null);
        }
        this.loadingJob = null;
        this.accountRangeService.cancelAccountRangeRepositoryJob();
        super.onDetachedFromWindow();
    }

    public final void setBrandChangeCallback$payments_core_release(h00.l<? super CardBrand, vz.b0> callback) {
        kotlin.jvm.internal.s.g(callback, "callback");
        this.brandChangeCallback = callback;
        callback.invoke(this.cardBrand);
    }

    public final void setCardBrand$payments_core_release(CardBrand value) {
        kotlin.jvm.internal.s.g(value, "value");
        CardBrand cardBrand = this.cardBrand;
        this.cardBrand = value;
        if (value != cardBrand) {
            this.brandChangeCallback.invoke(value);
            updateLengthFilter$payments_core_release$default(this, 0, 1, null);
        }
    }

    public final void setCompletionCallback$payments_core_release(h00.a<vz.b0> aVar) {
        kotlin.jvm.internal.s.g(aVar, "<set-?>");
        this.completionCallback = aVar;
    }

    public final void setLoadingCallback$payments_core_release(h00.l<? super Boolean, vz.b0> lVar) {
        kotlin.jvm.internal.s.g(lVar, "<set-?>");
        this.isLoadingCallback = lVar;
    }

    public final void setWorkContext(zz.g gVar) {
        kotlin.jvm.internal.s.g(gVar, "<set-?>");
        this.workContext = gVar;
    }

    public final /* synthetic */ void updateLengthFilter$payments_core_release(int i11) {
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i11)});
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardNumberEditText(Context context, AttributeSet attributeSet, int i11, zz.g workContext, CardAccountRangeRepository cardAccountRangeRepository, StaticCardAccountRanges staticCardAccountRanges, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(workContext, "workContext");
        kotlin.jvm.internal.s.g(cardAccountRangeRepository, "cardAccountRangeRepository");
        kotlin.jvm.internal.s.g(staticCardAccountRanges, "staticCardAccountRanges");
        kotlin.jvm.internal.s.g(analyticsRequestExecutor, "analyticsRequestExecutor");
        kotlin.jvm.internal.s.g(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        this.workContext = workContext;
        this.cardAccountRangeRepository = cardAccountRangeRepository;
        this.staticCardAccountRanges = staticCardAccountRanges;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.cardBrand = CardBrand.Unknown;
        this.brandChangeCallback = CardNumberEditText$brandChangeCallback$1.INSTANCE;
        this.completionCallback = CardNumberEditText$completionCallback$1.INSTANCE;
        this.accountRangeService = new CardAccountRangeService(cardAccountRangeRepository, this.workContext, staticCardAccountRanges, new CardAccountRangeService.AccountRangeResultListener() { // from class: com.stripe.android.view.CardNumberEditText$accountRangeService$1
            @Override // com.stripe.android.cards.CardAccountRangeService.AccountRangeResultListener
            public void onAccountRangeResult(AccountRange accountRange) {
                CardNumberEditText.updateLengthFilter$payments_core_release$default(CardNumberEditText.this, 0, 1, null);
                CardNumberEditText cardNumberEditText = CardNumberEditText.this;
                CardBrand brand = accountRange != null ? accountRange.getBrand() : null;
                if (brand == null) {
                    brand = CardBrand.Unknown;
                }
                cardNumberEditText.setCardBrand$payments_core_release(brand);
            }
        });
        this.isLoadingCallback = CardNumberEditText$isLoadingCallback$1.INSTANCE;
        setNumberOnlyInputType();
        setErrorMessage(getResources().getString(R.string.invalid_card_number));
        addTextChangedListener(new CardNumberTextWatcher(this));
        getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.o
            {
                CardNumberEditText.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                CardNumberEditText.d(CardNumberEditText.this, view, z11);
            }
        });
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{"creditCardNumber"});
        }
        updateLengthFilter$payments_core_release$default(this, 0, 1, null);
        setLayoutDirection(0);
    }

    public /* synthetic */ CardNumberEditText(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? g.a.A : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardNumberEditText(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, e1.b(), new AnonymousClass1(context));
        kotlin.jvm.internal.s.g(context, "context");
    }

    private CardNumberEditText(Context context, AttributeSet attributeSet, int i11, zz.g gVar, final h00.a<String> aVar) {
        this(context, attributeSet, i11, gVar, new DefaultCardAccountRangeRepositoryFactory(context).create(), new DefaultStaticCardAccountRanges(), new DefaultAnalyticsRequestExecutor(), new PaymentAnalyticsRequestFactory(context, new Provider() { // from class: com.stripe.android.view.p
            @Override // javax.inject.Provider
            public final Object get() {
                return CardNumberEditText.c(aVar);
            }
        }));
    }
}