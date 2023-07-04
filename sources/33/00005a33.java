package com.stripe.android.ui.core.elements;

import com.stripe.android.model.CardBrand;
import kotlin.jvm.internal.s;
import n2.a;
import s2.i0;
import s2.k0;
import s2.t;

/* loaded from: classes6.dex */
public final class CardNumberVisualTransformation implements k0 {
    private Integer binBasedMaxPan;
    private final char separator;

    public CardNumberVisualTransformation(char c11) {
        this.separator = c11;
    }

    private final i0 space4and11(a aVar) {
        int length = aVar.length();
        int i11 = 0;
        String str = "";
        while (i11 < length) {
            int i12 = i11 + 1;
            String p11 = s.p(str, Character.valueOf(aVar.charAt(i11)));
            str = (i11 == 3 || i11 == 9) ? s.p(p11, Character.valueOf(this.separator)) : p11;
            i11 = i12;
        }
        return new i0(new a(str, null, null, 6, null), new t() { // from class: com.stripe.android.ui.core.elements.CardNumberVisualTransformation$space4and11$creditCardOffsetTranslator$1
            @Override // s2.t
            public int originalToTransformed(int i13) {
                return i13 <= 3 ? i13 : i13 <= 9 ? i13 + 1 : i13 + 2;
            }

            @Override // s2.t
            public int transformedToOriginal(int i13) {
                return i13 <= 4 ? i13 : i13 <= 11 ? i13 - 1 : i13 - 2;
            }
        });
    }

    private final i0 space4and9and14(a aVar) {
        int length = aVar.length();
        int i11 = 0;
        String str = "";
        while (i11 < length) {
            int i12 = i11 + 1;
            str = s.p(str, Character.valueOf(aVar.charAt(i11)));
            if (i11 % 4 == 3 && i11 < 15) {
                str = s.p(str, Character.valueOf(this.separator));
            }
            i11 = i12;
        }
        return new i0(new a(str, null, null, 6, null), new t() { // from class: com.stripe.android.ui.core.elements.CardNumberVisualTransformation$space4and9and14$creditCardOffsetTranslator$1
            @Override // s2.t
            public int originalToTransformed(int i13) {
                return i13 <= 3 ? i13 : i13 <= 7 ? i13 + 1 : i13 <= 11 ? i13 + 2 : i13 + 3;
            }

            @Override // s2.t
            public int transformedToOriginal(int i13) {
                return i13 <= 4 ? i13 : i13 <= 9 ? i13 - 1 : i13 <= 14 ? i13 - 2 : i13 - 3;
            }
        });
    }

    private final i0 space4and9and14and19(a aVar) {
        int length = aVar.length();
        int i11 = 0;
        String str = "";
        while (i11 < length) {
            int i12 = i11 + 1;
            str = s.p(str, Character.valueOf(aVar.charAt(i11)));
            if (i11 % 4 == 3 && i11 < 19) {
                str = s.p(str, Character.valueOf(this.separator));
            }
            i11 = i12;
        }
        return new i0(new a(str, null, null, 6, null), new t() { // from class: com.stripe.android.ui.core.elements.CardNumberVisualTransformation$space4and9and14and19$creditCardOffsetTranslator$1
            @Override // s2.t
            public int originalToTransformed(int i13) {
                return i13 <= 3 ? i13 : i13 <= 7 ? i13 + 1 : i13 <= 11 ? i13 + 2 : i13 <= 15 ? i13 + 3 : i13 + 4;
            }

            @Override // s2.t
            public int transformedToOriginal(int i13) {
                return i13 <= 4 ? i13 : i13 <= 9 ? i13 - 1 : i13 <= 14 ? i13 - 2 : i13 <= 19 ? i13 - 3 : i13 - 4;
            }
        });
    }

    @Override // s2.k0
    public i0 filter(a text) {
        s.g(text, "text");
        CardBrand fromCardNumber = CardBrand.Companion.fromCardNumber(text.g());
        Integer num = this.binBasedMaxPan;
        int maxLengthForCardNumber = num == null ? fromCardNumber.getMaxLengthForCardNumber(text.g()) : num.intValue();
        if (maxLengthForCardNumber != 19) {
            switch (maxLengthForCardNumber) {
                case 14:
                case 15:
                    return space4and11(text);
                case 16:
                    return space4and9and14(text);
                default:
                    return space4and9and14(text);
            }
        }
        return space4and9and14and19(text);
    }

    public final Integer getBinBasedMaxPan$payments_ui_core_release() {
        return this.binBasedMaxPan;
    }

    public final void setBinBasedMaxPan$payments_ui_core_release(Integer num) {
        this.binBasedMaxPan = num;
    }
}