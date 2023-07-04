package com.stripe.android.ui.core.elements;

import com.stripe.android.ui.core.R;
import com.stripe.android.ui.core.elements.TextFieldStateConstants;
import java.util.Calendar;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.u;
import kotlin.text.v;
import kotlin.text.y;
import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.j0;
import s2.r;
import s2.s;

/* loaded from: classes6.dex */
public final class DateConfig implements TextFieldConfig {
    public static final Companion Companion = new Companion(null);
    private final int capitalization = r.f50134a.b();
    private final String debugLabel = "date";
    private final int label = R.string.stripe_paymentsheet_expiration_date_hint;
    private final int keyboard = s.f50139b.d();
    private final ExpiryDateVisualTransformation visualTransformation = new ExpiryDateVisualTransformation();
    private final h0<TextFieldIcon> trailingIcon = j0.a(null);
    private final h0<Boolean> loading = j0.a(Boolean.FALSE);

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TextFieldState determineTextFieldState(int i11, int i12, int i13, int i14) {
            int i15 = i12 - (i14 % 100);
            if (i15 < 0) {
                return new TextFieldStateConstants.Error.Invalid(R.string.invalid_expiry_year, null, 2, null);
            }
            if (i15 > 50) {
                return new TextFieldStateConstants.Error.Invalid(R.string.invalid_expiry_year, null, 2, null);
            }
            if (i15 != 0 || i13 <= i11) {
                boolean z11 = false;
                if (1 <= i11 && i11 < 13) {
                    z11 = true;
                }
                if (!z11) {
                    return new TextFieldStateConstants.Error.Incomplete(R.string.invalid_expiry_month);
                }
                return TextFieldStateConstants.Valid.Full.INSTANCE;
            }
            return new TextFieldStateConstants.Error.Invalid(R.string.invalid_expiry_month, null, 2, null);
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
        String i12;
        Integer n11;
        String j12;
        Integer n12;
        kotlin.jvm.internal.s.g(input, "input");
        w11 = v.w(input);
        if (w11) {
            return TextFieldStateConstants.Error.Blank.INSTANCE;
        }
        String convertTo4DigitDate = DateUtilsKt.convertTo4DigitDate(input);
        if (convertTo4DigitDate.length() < 4) {
            return new TextFieldStateConstants.Error.Incomplete(R.string.incomplete_expiry_date);
        }
        if (convertTo4DigitDate.length() > 4) {
            return new TextFieldStateConstants.Error.Invalid(R.string.incomplete_expiry_date, null, 2, null);
        }
        Companion companion = Companion;
        i12 = y.i1(convertTo4DigitDate, 2);
        n11 = u.n(i12);
        if (n11 != null) {
            int intValue = n11.intValue();
            j12 = y.j1(convertTo4DigitDate, 2);
            n12 = u.n(j12);
            if (n12 != null) {
                return companion.determineTextFieldState(intValue, n12.intValue(), Calendar.getInstance().get(2) + 1, Calendar.getInstance().get(1));
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldConfig
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
    public h0<TextFieldIcon> getTrailingIcon() {
        return this.trailingIcon;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldConfig
    public ExpiryDateVisualTransformation getVisualTransformation() {
        return this.visualTransformation;
    }
}