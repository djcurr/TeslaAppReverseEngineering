package com.stripe.android;

/* loaded from: classes2.dex */
public final class CardUtils {
    public static final CardUtils INSTANCE = new CardUtils();

    private CardUtils() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.stripe.android.model.CardBrand getPossibleCardBrand(java.lang.String r2) {
        /*
            if (r2 == 0) goto Lb
            boolean r0 = kotlin.text.m.w(r2)
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            if (r0 == 0) goto L11
            com.stripe.android.model.CardBrand r2 = com.stripe.android.model.CardBrand.Unknown
            goto L20
        L11:
            com.stripe.android.model.CardBrand$Companion r0 = com.stripe.android.model.CardBrand.Companion
            com.stripe.android.cards.CardNumber$Unvalidated r1 = new com.stripe.android.cards.CardNumber$Unvalidated
            r1.<init>(r2)
            java.lang.String r2 = r1.getNormalized()
            com.stripe.android.model.CardBrand r2 = r0.fromCardNumber(r2)
        L20:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.CardUtils.getPossibleCardBrand(java.lang.String):com.stripe.android.model.CardBrand");
    }

    public final boolean isValidLuhnNumber(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length() - 1;
        int i11 = 0;
        if (length >= 0) {
            boolean z11 = true;
            while (true) {
                int i12 = length - 1;
                char charAt = str.charAt(length);
                if (!Character.isDigit(charAt)) {
                    return false;
                }
                int numericValue = Character.getNumericValue(charAt);
                z11 = !z11;
                if (z11) {
                    numericValue *= 2;
                }
                if (numericValue > 9) {
                    numericValue -= 9;
                }
                i11 += numericValue;
                if (i12 < 0) {
                    break;
                }
                length = i12;
            }
        }
        return i11 % 10 == 0;
    }
}