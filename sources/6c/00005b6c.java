package com.stripe.android.ui.core.elements;

import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import s2.k0;

/* loaded from: classes6.dex */
public interface TextFieldController extends InputController {

    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static boolean getEnabled(TextFieldController textFieldController) {
            s.g(textFieldController, "this");
            return true;
        }
    }

    /* renamed from: getCapitalization-IUNYP9k */
    int mo432getCapitalizationIUNYP9k();

    e<String> getContentDescription();

    String getDebugLabel();

    boolean getEnabled();

    e<TextFieldState> getFieldState();

    @Override // com.stripe.android.ui.core.elements.InputController
    e<String> getFieldValue();

    /* renamed from: getKeyboardType-PjHm6EE */
    int mo433getKeyboardTypePjHm6EE();

    @Override // com.stripe.android.ui.core.elements.InputController
    e<Integer> getLabel();

    e<Boolean> getLoading();

    @Override // com.stripe.android.ui.core.elements.InputController
    boolean getShowOptionalLabel();

    e<TextFieldIcon> getTrailingIcon();

    e<Boolean> getVisibleError();

    k0 getVisualTransformation();

    void onFocusChange(boolean z11);

    TextFieldState onValueChange(String str);
}