package com.stripe.android.ui.core.elements;

import com.stripe.android.ui.core.R;
import com.stripe.android.ui.core.elements.TextFieldStateConstants;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.i;
import kotlin.text.w;
import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.u;
import s2.k0;
import s2.r;
import s2.s;

/* loaded from: classes6.dex */
public final class EmailConfig implements TextFieldConfig {
    private static final Pattern PATTERN;
    private final k0 visualTransformation;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final int capitalization = r.f50134a.b();
    private final String debugLabel = "email";
    private final int label = R.string.email;
    private final int keyboard = s.f50139b.b();
    private final u<TextFieldIcon> trailingIcon = j0.a(null);
    private final h0<Boolean> loading = j0.a(Boolean.FALSE);

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Pattern getPATTERN() {
            return EmailConfig.PATTERN;
        }
    }

    static {
        Pattern compile = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");
        kotlin.jvm.internal.s.f(compile, "compile(\n            \"[a…           \")+\"\n        )");
        PATTERN = compile;
    }

    private final boolean containsNameAndDomain(String str) {
        boolean M;
        M = w.M(str, "@", false, 2, null);
        return M && new i(".*@.*\\..+").g(str);
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
        kotlin.jvm.internal.s.g(input, "input");
        return input.length() == 0 ? TextFieldStateConstants.Error.Blank.INSTANCE : PATTERN.matcher(input).matches() ? TextFieldStateConstants.Valid.Limitless.INSTANCE : containsNameAndDomain(input) ? new TextFieldStateConstants.Error.Invalid(R.string.email_is_invalid, null, 2, null) : new TextFieldStateConstants.Error.Incomplete(R.string.email_is_invalid);
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldConfig
    public String filter(String userTyped) {
        kotlin.jvm.internal.s.g(userTyped, "userTyped");
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
    public h0<Boolean> getLoading() {
        return this.loading;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldConfig
    public k0 getVisualTransformation() {
        return this.visualTransformation;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldConfig
    public u<TextFieldIcon> getTrailingIcon() {
        return this.trailingIcon;
    }
}