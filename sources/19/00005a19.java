package com.stripe.android.ui.core.elements;

import com.stripe.android.CardUtils;
import com.stripe.android.model.CardBrand;
import com.stripe.android.ui.core.R;
import com.stripe.android.ui.core.elements.TextFieldStateConstants;
import kotlin.text.v;
import s2.k0;
import s2.r;
import s2.s;

/* loaded from: classes6.dex */
public final class CardNumberConfig implements CardDetailsTextFieldConfig {
    private final int capitalization = r.f50134a.b();
    private final String debugLabel = "Card number";
    private final int label = R.string.acc_label_card_number;
    private final int keyboard = s.f50139b.d();
    private final k0 visualTransformation = new CardNumberVisualTransformation(' ');

    @Override // com.stripe.android.ui.core.elements.CardDetailsTextFieldConfig
    public String convertFromRaw(String rawValue) {
        kotlin.jvm.internal.s.g(rawValue, "rawValue");
        return rawValue;
    }

    @Override // com.stripe.android.ui.core.elements.CardDetailsTextFieldConfig
    public String convertToRaw(String displayName) {
        kotlin.jvm.internal.s.g(displayName, "displayName");
        return displayName;
    }

    @Override // com.stripe.android.ui.core.elements.CardDetailsTextFieldConfig
    public TextFieldState determineState(CardBrand brand, String number, int i11) {
        boolean w11;
        kotlin.jvm.internal.s.g(brand, "brand");
        kotlin.jvm.internal.s.g(number, "number");
        boolean isValidLuhnNumber = CardUtils.INSTANCE.isValidLuhnNumber(number);
        boolean z11 = brand.getMaxLengthForCardNumber(number) != -1;
        w11 = v.w(number);
        if (w11) {
            return TextFieldStateConstants.Error.Blank.INSTANCE;
        }
        if (brand == CardBrand.Unknown) {
            return new TextFieldStateConstants.Error.Invalid(R.string.invalid_card_number, null, 2, null);
        }
        if (!z11 || number.length() >= i11) {
            if (!isValidLuhnNumber) {
                return new TextFieldStateConstants.Error.Invalid(R.string.invalid_card_number, null, 2, null);
            }
            if (z11 && number.length() == i11) {
                return TextFieldStateConstants.Valid.Full.INSTANCE;
            }
            return new TextFieldStateConstants.Error.Invalid(R.string.invalid_card_number, null, 2, null);
        }
        return new TextFieldStateConstants.Error.Incomplete(R.string.invalid_card_number);
    }

    @Override // com.stripe.android.ui.core.elements.CardDetailsTextFieldConfig
    public String filter(String userTyped) {
        kotlin.jvm.internal.s.g(userTyped, "userTyped");
        StringBuilder sb2 = new StringBuilder();
        int length = userTyped.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = userTyped.charAt(i11);
            if (Character.isDigit(charAt)) {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.s.f(sb3, "filterTo(StringBuilder(), predicate).toString()");
        return sb3;
    }

    @Override // com.stripe.android.ui.core.elements.CardDetailsTextFieldConfig
    /* renamed from: getCapitalization-IUNYP9k */
    public int mo430getCapitalizationIUNYP9k() {
        return this.capitalization;
    }

    @Override // com.stripe.android.ui.core.elements.CardDetailsTextFieldConfig
    public String getDebugLabel() {
        return this.debugLabel;
    }

    @Override // com.stripe.android.ui.core.elements.CardDetailsTextFieldConfig
    /* renamed from: getKeyboard-PjHm6EE */
    public int mo431getKeyboardPjHm6EE() {
        return this.keyboard;
    }

    @Override // com.stripe.android.ui.core.elements.CardDetailsTextFieldConfig
    public int getLabel() {
        return this.label;
    }

    @Override // com.stripe.android.ui.core.elements.CardDetailsTextFieldConfig
    public k0 getVisualTransformation() {
        return this.visualTransformation;
    }
}