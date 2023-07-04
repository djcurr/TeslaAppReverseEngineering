package com.stripe.android.ui.core.elements;

import kotlinx.coroutines.flow.h0;
import s2.k0;

/* loaded from: classes6.dex */
public interface TextFieldConfig {
    String convertFromRaw(String str);

    String convertToRaw(String str);

    TextFieldState determineState(String str);

    String filter(String str);

    /* renamed from: getCapitalization-IUNYP9k */
    int mo425getCapitalizationIUNYP9k();

    String getDebugLabel();

    /* renamed from: getKeyboard-PjHm6EE */
    int mo426getKeyboardPjHm6EE();

    int getLabel();

    h0<Boolean> getLoading();

    h0<TextFieldIcon> getTrailingIcon();

    k0 getVisualTransformation();
}