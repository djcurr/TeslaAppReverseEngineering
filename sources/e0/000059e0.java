package com.stripe.android.ui.core.elements;

import com.stripe.android.ui.core.R;
import com.stripe.android.ui.core.elements.TextFieldStateConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.v;
import kotlin.text.y;
import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.j0;
import m00.c;
import s2.k0;
import s2.r;
import s2.s;

/* loaded from: classes6.dex */
public final class AuBankAccountNumberConfig implements TextFieldConfig {
    @Deprecated
    public static final int LENGTH = 9;
    private final k0 visualTransformation;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    @Deprecated
    private static final c VALID_INPUT_RANGES = new c('0', '9');
    private final int capitalization = r.f50134a.b();
    private final String debugLabel = "au_bank_account_number";
    private final h0<TextFieldIcon> trailingIcon = j0.a(null);
    private final h0<Boolean> loading = j0.a(Boolean.FALSE);
    private final int label = R.string.becs_widget_account_number;
    private final int keyboard = s.f50139b.c();

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c getVALID_INPUT_RANGES() {
            return AuBankAccountNumberConfig.VALID_INPUT_RANGES;
        }
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldConfig
    public String convertFromRaw(String rawValue) {
        kotlin.jvm.internal.s.g(rawValue, "rawValue");
        return rawValue;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldConfig
    public String convertToRaw(String displayName) {
        kotlin.jvm.internal.s.g(displayName, "displayName");
        return displayName;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldConfig
    public TextFieldState determineState(String input) {
        boolean w11;
        kotlin.jvm.internal.s.g(input, "input");
        w11 = v.w(input);
        if (w11) {
            return TextFieldStateConstants.Error.Blank.INSTANCE;
        }
        if (input.length() < 9) {
            return new TextFieldStateConstants.Error.Incomplete(R.string.becs_widget_account_number_incomplete);
        }
        if (input.length() > 9) {
            return new TextFieldStateConstants.Error.Invalid(R.string.becs_widget_account_number_invalid, null, 2, null);
        }
        return TextFieldStateConstants.Valid.Full.INSTANCE;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldConfig
    public String filter(String userTyped) {
        String i12;
        kotlin.jvm.internal.s.g(userTyped, "userTyped");
        StringBuilder sb2 = new StringBuilder();
        int length = userTyped.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = userTyped.charAt(i11);
            if (VALID_INPUT_RANGES.h(charAt)) {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.s.f(sb3, "filterTo(StringBuilder(), predicate).toString()");
        i12 = y.i1(sb3, 9);
        return i12;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldConfig
    /* renamed from: getCapitalization-IUNYP9k  reason: not valid java name */
    public int mo425getCapitalizationIUNYP9k() {
        return this.capitalization;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldConfig
    public String getDebugLabel() {
        return this.debugLabel;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldConfig
    /* renamed from: getKeyboard-PjHm6EE  reason: not valid java name */
    public int mo426getKeyboardPjHm6EE() {
        return this.keyboard;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldConfig
    public int getLabel() {
        return this.label;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldConfig
    public h0<Boolean> getLoading() {
        return this.loading;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldConfig
    public h0<TextFieldIcon> getTrailingIcon() {
        return this.trailingIcon;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldConfig
    public k0 getVisualTransformation() {
        return this.visualTransformation;
    }
}