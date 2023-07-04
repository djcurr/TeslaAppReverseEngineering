package com.stripe.android.ui.core.elements;

import com.stripe.android.ui.core.R;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.v;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.u;
import s2.k0;
import s2.r;
import s2.s;
import wz.x0;

/* loaded from: classes6.dex */
public final class SimpleTextFieldConfig implements TextFieldConfig {
    private final int capitalization;
    private final String debugLabel;
    private final int keyboard;
    private final int label;
    private final u<Boolean> loading;
    private final u<TextFieldIcon> trailingIcon;
    private final k0 visualTransformation;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final SimpleTextFieldConfig NAME = new SimpleTextFieldConfig(R.string.address_label_name, r.f50134a.d(), s.f50139b.g(), null);

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SimpleTextFieldConfig getNAME() {
            return SimpleTextFieldConfig.NAME;
        }
    }

    private SimpleTextFieldConfig(int i11, int i12, int i13) {
        this.label = i11;
        this.capitalization = i12;
        this.keyboard = i13;
        this.debugLabel = "generic_text";
        this.trailingIcon = j0.a(null);
        this.loading = j0.a(Boolean.FALSE);
    }

    public /* synthetic */ SimpleTextFieldConfig(int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, i13);
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
    public TextFieldState determineState(final String input) {
        kotlin.jvm.internal.s.g(input, "input");
        return new TextFieldState() { // from class: com.stripe.android.ui.core.elements.SimpleTextFieldConfig$determineState$1
            @Override // com.stripe.android.ui.core.elements.TextFieldState
            public FieldError getError() {
                return null;
            }

            @Override // com.stripe.android.ui.core.elements.TextFieldState
            public boolean isBlank() {
                boolean w11;
                w11 = v.w(input);
                return w11;
            }

            @Override // com.stripe.android.ui.core.elements.TextFieldState
            public boolean isFull() {
                return false;
            }

            @Override // com.stripe.android.ui.core.elements.TextFieldState
            public boolean isValid() {
                boolean w11;
                w11 = v.w(input);
                return !w11;
            }

            @Override // com.stripe.android.ui.core.elements.TextFieldState
            public boolean shouldShowError(boolean z11) {
                return false;
            }
        };
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldConfig
    public String filter(String userTyped) {
        Set i11;
        kotlin.jvm.internal.s.g(userTyped, "userTyped");
        s.a aVar = s.f50139b;
        i11 = x0.i(s.i(aVar.c()), s.i(aVar.d()));
        if (i11.contains(s.i(mo426getKeyboardPjHm6EE()))) {
            StringBuilder sb2 = new StringBuilder();
            int length = userTyped.length();
            for (int i12 = 0; i12 < length; i12++) {
                char charAt = userTyped.charAt(i12);
                if (Character.isDigit(charAt)) {
                    sb2.append(charAt);
                }
            }
            String sb3 = sb2.toString();
            kotlin.jvm.internal.s.f(sb3, "filterTo(StringBuilder(), predicate).toString()");
            return sb3;
        }
        return userTyped;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldConfig
    /* renamed from: getCapitalization-IUNYP9k */
    public int mo425getCapitalizationIUNYP9k() {
        return this.capitalization;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldConfig
    public String getDebugLabel() {
        return this.debugLabel;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldConfig
    /* renamed from: getKeyboard-PjHm6EE */
    public int mo426getKeyboardPjHm6EE() {
        return this.keyboard;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldConfig
    public int getLabel() {
        return this.label;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldConfig
    public k0 getVisualTransformation() {
        return this.visualTransformation;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldConfig
    public u<Boolean> getLoading() {
        return this.loading;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldConfig
    public u<TextFieldIcon> getTrailingIcon() {
        return this.trailingIcon;
    }

    public /* synthetic */ SimpleTextFieldConfig(int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i14 & 2) != 0 ? r.f50134a.d() : i12, (i14 & 4) != 0 ? s.f50139b.g() : i13, null);
    }
}