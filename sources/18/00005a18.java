package com.stripe.android.ui.core.elements;

import com.stripe.android.model.CardBrand;
import s2.k0;

/* loaded from: classes6.dex */
public interface CardDetailsTextFieldConfig {
    String convertFromRaw(String str);

    String convertToRaw(String str);

    TextFieldState determineState(CardBrand cardBrand, String str, int i11);

    String filter(String str);

    /* renamed from: getCapitalization-IUNYP9k  reason: not valid java name */
    int mo430getCapitalizationIUNYP9k();

    String getDebugLabel();

    /* renamed from: getKeyboard-PjHm6EE  reason: not valid java name */
    int mo431getKeyboardPjHm6EE();

    int getLabel();

    k0 getVisualTransformation();
}