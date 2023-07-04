package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R;
import com.stripe.android.cards.Cvc;
import com.stripe.android.model.CardBrand;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class CvcEditText extends StripeEditText {
    public static final int $stable = 8;
    private CardBrand cardBrand;
    private /* synthetic */ h00.a<vz.b0> completionCallback;

    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardBrand.values().length];
            iArr[CardBrand.AmericanExpress.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CvcEditText(Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CvcEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    public /* synthetic */ CvcEditText(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? g.a.A : i11);
    }

    /* renamed from: _init_$lambda-1 */
    public static final void m523_init_$lambda1(CvcEditText this$0, View view, boolean z11) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        if (z11 || !this$0.getUnvalidatedCvc().isPartialEntry(this$0.cardBrand.getMaxCvcLength())) {
            return;
        }
        this$0.setShouldShowError(true);
    }

    public static /* synthetic */ void c(CvcEditText cvcEditText, View view, boolean z11) {
        m523_init_$lambda1(cvcEditText, view, z11);
    }

    private final InputFilter[] createFilters(CardBrand cardBrand) {
        return new InputFilter[]{new InputFilter.LengthFilter(cardBrand.getMaxCvcLength())};
    }

    public final Cvc.Unvalidated getUnvalidatedCvc() {
        return new Cvc.Unvalidated(getFieldText$payments_core_release());
    }

    public static /* synthetic */ void updateBrand$payments_core_release$default(CvcEditText cvcEditText, CardBrand cardBrand, String str, String str2, TextInputLayout textInputLayout, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        if ((i11 & 8) != 0) {
            textInputLayout = null;
        }
        cvcEditText.updateBrand$payments_core_release(cardBrand, str, str2, textInputLayout);
    }

    @Override // com.stripe.android.view.StripeEditText
    protected String getAccessibilityText() {
        String string = getResources().getString(R.string.acc_label_cvc_node, getText());
        kotlin.jvm.internal.s.f(string, "resources.getString(R.st…acc_label_cvc_node, text)");
        return string;
    }

    public final h00.a<vz.b0> getCompletionCallback$payments_core_release() {
        return this.completionCallback;
    }

    public final Cvc.Validated getCvc$payments_core_release() {
        return getUnvalidatedCvc().validate(this.cardBrand.getMaxCvcLength());
    }

    public final void setCompletionCallback$payments_core_release(h00.a<vz.b0> aVar) {
        kotlin.jvm.internal.s.g(aVar, "<set-?>");
        this.completionCallback = aVar;
    }

    public final /* synthetic */ void updateBrand$payments_core_release(CardBrand cardBrand, String str, String str2, TextInputLayout textInputLayout) {
        int i11;
        kotlin.jvm.internal.s.g(cardBrand, "cardBrand");
        this.cardBrand = cardBrand;
        setFilters(createFilters(cardBrand));
        if (str == null) {
            if (cardBrand == CardBrand.AmericanExpress) {
                str = getResources().getString(R.string.cvc_amex_hint);
            } else {
                str = getResources().getString(R.string.cvc_number_hint);
            }
            kotlin.jvm.internal.s.f(str, "if (cardBrand == CardBra…umber_hint)\n            }");
        }
        if (getUnvalidatedCvc().getNormalized$payments_core_release().length() > 0) {
            setShouldShowError(getUnvalidatedCvc().validate(cardBrand.getMaxCvcLength()) == null);
        }
        if (textInputLayout != null) {
            textInputLayout.setHint(str);
            if (str2 == null) {
                Resources resources = getResources();
                if (WhenMappings.$EnumSwitchMapping$0[cardBrand.ordinal()] == 1) {
                    i11 = R.string.cvc_multiline_helper_amex;
                } else {
                    i11 = R.string.cvc_multiline_helper;
                }
                str2 = resources.getString(i11);
            }
            textInputLayout.setPlaceholderText(str2);
            return;
        }
        setHint(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CvcEditText(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.s.g(context, "context");
        CardBrand cardBrand = CardBrand.Unknown;
        this.cardBrand = cardBrand;
        this.completionCallback = CvcEditText$completionCallback$1.INSTANCE;
        setErrorMessage(getResources().getString(R.string.invalid_cvc));
        setHint(R.string.cvc_number_hint);
        setMaxLines(1);
        setFilters(createFilters(cardBrand));
        setNumberOnlyInputType();
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{"creditCardSecurityCode"});
        }
        addTextChangedListener(new TextWatcher() { // from class: com.stripe.android.view.CvcEditText$special$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                CardBrand cardBrand2;
                Cvc.Unvalidated unvalidatedCvc;
                CvcEditText.this.setShouldShowError(false);
                cardBrand2 = CvcEditText.this.cardBrand;
                unvalidatedCvc = CvcEditText.this.getUnvalidatedCvc();
                if (cardBrand2.isMaxCvc(unvalidatedCvc.getNormalized$payments_core_release())) {
                    CvcEditText.this.getCompletionCallback$payments_core_release().invoke();
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
            }
        });
        getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.s
            {
                CvcEditText.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                CvcEditText.c(CvcEditText.this, view, z11);
            }
        });
        setLayoutDirection(0);
    }
}