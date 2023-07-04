package com.stripe.android.ui.core.elements;

import com.stripe.android.ui.core.R;
import com.stripe.android.ui.core.elements.TextFieldStateConstants;
import com.stripe.android.view.BecsDebitBanks;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.v;
import kotlin.text.y;
import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.j0;
import m00.c;
import n2.a;
import s2.i0;
import s2.k0;
import s2.r;
import s2.t;

/* loaded from: classes6.dex */
public final class BsbConfig implements TextFieldConfig {
    @Deprecated
    public static final int LENGTH = 6;
    private final List<BecsDebitBanks.Bank> banks;
    private final int capitalization;
    private final String debugLabel;
    private final int keyboard;
    private final int label;
    private final h0<Boolean> loading;
    private final h0<TextFieldIcon> trailingIcon;
    private final k0 visualTransformation;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    @Deprecated
    private static final c VALID_INPUT_RANGES = new c('0', '9');

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c getVALID_INPUT_RANGES() {
            return BsbConfig.VALID_INPUT_RANGES;
        }
    }

    public BsbConfig(List<BecsDebitBanks.Bank> banks) {
        s.g(banks, "banks");
        this.banks = banks;
        this.capitalization = r.f50134a.b();
        this.debugLabel = "bsb";
        this.trailingIcon = j0.a(null);
        this.loading = j0.a(Boolean.FALSE);
        this.label = R.string.becs_widget_bsb;
        this.keyboard = s2.s.f50139b.c();
        this.visualTransformation = new k0() { // from class: com.stripe.android.ui.core.elements.BsbConfig$visualTransformation$1
            @Override // s2.k0
            public final i0 filter(a text) {
                s.g(text, "text");
                StringBuilder sb2 = new StringBuilder();
                String g11 = text.g();
                int i11 = 0;
                int i12 = 0;
                while (i11 < g11.length()) {
                    int i13 = i12 + 1;
                    sb2.append(g11.charAt(i11));
                    if (i12 == 2) {
                        sb2.append(" - ");
                    }
                    i11++;
                    i12 = i13;
                }
                String sb3 = sb2.toString();
                s.f(sb3, "output.toString()");
                return new i0(new a(sb3, null, null, 6, null), new t() { // from class: com.stripe.android.ui.core.elements.BsbConfig$visualTransformation$1$filter$2
                    @Override // s2.t
                    public int originalToTransformed(int i14) {
                        return i14 <= 2 ? i14 : i14 + r1.length();
                    }

                    @Override // s2.t
                    public int transformedToOriginal(int i14) {
                        return i14 <= 3 ? i14 : i14 - r1.length();
                    }
                });
            }
        };
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldConfig
    public String convertFromRaw(String rawValue) {
        s.g(rawValue, "rawValue");
        return rawValue;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldConfig
    public String convertToRaw(String displayName) {
        s.g(displayName, "displayName");
        return displayName;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldConfig
    public TextFieldState determineState(String input) {
        boolean w11;
        Object obj;
        boolean H;
        s.g(input, "input");
        w11 = v.w(input);
        if (w11) {
            return TextFieldStateConstants.Error.Blank.INSTANCE;
        }
        if (input.length() < 6) {
            return new TextFieldStateConstants.Error.Incomplete(R.string.becs_widget_bsb_incomplete);
        }
        Iterator<T> it2 = this.banks.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            H = v.H(input, ((BecsDebitBanks.Bank) obj).getPrefix(), false, 2, null);
            if (H) {
                break;
            }
        }
        if (((BecsDebitBanks.Bank) obj) != null && input.length() <= 6) {
            return TextFieldStateConstants.Valid.Full.INSTANCE;
        }
        return new TextFieldStateConstants.Error.Invalid(R.string.becs_widget_bsb_invalid, null, 2, null);
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldConfig
    public String filter(String userTyped) {
        String i12;
        s.g(userTyped, "userTyped");
        StringBuilder sb2 = new StringBuilder();
        int length = userTyped.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = userTyped.charAt(i11);
            if (VALID_INPUT_RANGES.h(charAt)) {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        s.f(sb3, "filterTo(StringBuilder(), predicate).toString()");
        i12 = y.i1(sb3, 6);
        return i12;
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
    public k0 getVisualTransformation() {
        return this.visualTransformation;
    }
}