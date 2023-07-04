package com.stripe.android.ui.core.elements;

import com.stripe.android.ui.core.R;
import com.stripe.android.ui.core.elements.TextFieldIcon;
import com.stripe.android.ui.core.elements.TextFieldStateConstants;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.i;
import kotlin.text.v;
import kotlin.text.y;
import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.u;
import m00.c;
import n2.a;
import org.spongycastle.pqc.math.linearalgebra.Matrix;
import s2.i0;
import s2.k0;
import s2.r;
import s2.s;
import s2.t;
import wz.e0;
import wz.p;

/* loaded from: classes6.dex */
public final class IbanConfig implements TextFieldConfig {
    @Deprecated
    public static final int MAX_LENGTH = 34;
    @Deprecated
    public static final int MIN_LENGTH = 8;
    @Deprecated
    private static final List<Character> VALID_INPUT_RANGES;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final int capitalization = r.f50134a.a();
    private final String debugLabel = "iban";
    private final int label = R.string.iban;
    private final int keyboard = s.f50139b.a();
    private final u<TextFieldIcon> trailingIcon = j0.a(new TextFieldIcon.Trailing(R.drawable.stripe_ic_bank_generic, null, true, 2, null));
    private final h0<Boolean> loading = j0.a(Boolean.FALSE);
    private final k0 visualTransformation = new k0() { // from class: com.stripe.android.ui.core.elements.IbanConfig$visualTransformation$1
        @Override // s2.k0
        public final i0 filter(a text) {
            kotlin.jvm.internal.s.g(text, "text");
            StringBuilder sb2 = new StringBuilder();
            String g11 = text.g();
            int i11 = 0;
            int i12 = 0;
            while (i11 < g11.length()) {
                int i13 = i12 + 1;
                sb2.append(g11.charAt(i11));
                if (i12 % 4 == 3 && i12 < 33) {
                    sb2.append(" ");
                }
                i11++;
                i12 = i13;
            }
            String sb3 = sb2.toString();
            kotlin.jvm.internal.s.f(sb3, "output.toString()");
            return new i0(new a(sb3, null, null, 6, null), new t() { // from class: com.stripe.android.ui.core.elements.IbanConfig$visualTransformation$1$filter$2
                @Override // s2.t
                public int originalToTransformed(int i14) {
                    return i14 + (i14 / 4);
                }

                @Override // s2.t
                public int transformedToOriginal(int i14) {
                    return i14 - (i14 / 5);
                }
            });
        }
    };

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Character> getVALID_INPUT_RANGES() {
            return IbanConfig.VALID_INPUT_RANGES;
        }
    }

    static {
        List w02;
        List<Character> y02;
        w02 = e0.w0(new c('0', '9'), new c('a', 'z'));
        y02 = e0.y0(w02, new c('A', Matrix.MATRIX_TYPE_ZERO));
        VALID_INPUT_RANGES = y02;
    }

    private final boolean isIbanValid(String str) {
        String j12;
        String i12;
        j12 = y.j1(str, str.length() - 4);
        i12 = y.i1(str, 4);
        String upperCase = kotlin.jvm.internal.s.p(j12, i12).toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.s.f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return new BigInteger(new i("[A-Z]").h(upperCase, IbanConfig$isIbanValid$1.INSTANCE)).mod(new BigInteger("97")).equals(BigInteger.ONE);
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
        boolean z11;
        boolean D;
        kotlin.jvm.internal.s.g(input, "input");
        w11 = v.w(input);
        if (w11) {
            return TextFieldStateConstants.Error.Blank.INSTANCE;
        }
        i12 = y.i1(input, 2);
        String upperCase = i12.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.s.f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        int i11 = 0;
        while (true) {
            if (i11 >= upperCase.length()) {
                z11 = false;
                break;
            } else if (Character.isDigit(upperCase.charAt(i11))) {
                z11 = true;
                break;
            } else {
                i11++;
            }
        }
        if (z11) {
            return new TextFieldStateConstants.Error.Invalid(R.string.iban_invalid_start, null, 2, null);
        }
        if (upperCase.length() < 2) {
            return new TextFieldStateConstants.Error.Incomplete(R.string.iban_incomplete);
        }
        String[] iSOCountries = Locale.getISOCountries();
        kotlin.jvm.internal.s.f(iSOCountries, "getISOCountries()");
        D = p.D(iSOCountries, upperCase);
        if (!D) {
            return new TextFieldStateConstants.Error.Invalid(R.string.iban_invalid_country, new String[]{upperCase});
        }
        if (input.length() < 8) {
            return new TextFieldStateConstants.Error.Incomplete(R.string.iban_incomplete);
        }
        if (isIbanValid(input)) {
            if (input.length() == 34) {
                return TextFieldStateConstants.Valid.Full.INSTANCE;
            }
            return TextFieldStateConstants.Valid.Limitless.INSTANCE;
        }
        return new TextFieldStateConstants.Error.Incomplete(R.string.iban_invalid);
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldConfig
    public String filter(String userTyped) {
        String i12;
        kotlin.jvm.internal.s.g(userTyped, "userTyped");
        StringBuilder sb2 = new StringBuilder();
        int length = userTyped.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = userTyped.charAt(i11);
            if (VALID_INPUT_RANGES.contains(Character.valueOf(charAt))) {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.s.f(sb3, "filterTo(StringBuilder(), predicate).toString()");
        i12 = y.i1(sb3, 34);
        String upperCase = i12.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.s.f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
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