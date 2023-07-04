package com.stripe.android.view;

import android.content.res.Resources;
import android.text.ParcelableSpan;
import android.text.SpannableString;
import com.stripe.android.R;
import com.stripe.android.model.PaymentMethod;

/* loaded from: classes6.dex */
public final class CardDisplayTextFactory {
    private final Resources resources;
    private final ThemeConfig themeConfig;

    public CardDisplayTextFactory(Resources resources, ThemeConfig themeConfig) {
        kotlin.jvm.internal.s.g(resources, "resources");
        kotlin.jvm.internal.s.g(themeConfig, "themeConfig");
        this.resources = resources;
        this.themeConfig = themeConfig;
    }

    private final void setSpan(SpannableString spannableString, ParcelableSpan parcelableSpan, int i11, int i12) {
        spannableString.setSpan(parcelableSpan, i11, i12, 33);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ android.text.SpannableString createStyled$payments_core_release(com.stripe.android.model.CardBrand r17, java.lang.String r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r7 = r19
            java.lang.String r1 = "brand"
            r2 = r17
            kotlin.jvm.internal.s.g(r2, r1)
            java.lang.String r14 = r17.getDisplayName()
            int r1 = r14.length()
            r2 = 1
            r15 = 0
            if (r18 == 0) goto L20
            boolean r3 = kotlin.text.m.w(r18)
            if (r3 == 0) goto L1e
            goto L20
        L1e:
            r3 = r15
            goto L21
        L20:
            r3 = r2
        L21:
            java.lang.String r13 = "sans-serif-medium"
            if (r3 == 0) goto L33
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r14)
            android.text.style.TypefaceSpan r3 = new android.text.style.TypefaceSpan
            r3.<init>(r13)
            r0.setSpan(r2, r3, r15, r1)
            return r2
        L33:
            android.content.res.Resources r1 = r0.resources
            int r3 = com.stripe.android.R.string.card_ending_in
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r15] = r14
            r4[r2] = r18
            java.lang.String r12 = r1.getString(r3, r4)
            java.lang.String r1 = "resources.getString(R.st…ing_in, brandText, last4)"
            kotlin.jvm.internal.s.f(r12, r1)
            int r11 = r12.length()
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r12
            r2 = r18
            int r1 = kotlin.text.m.Z(r1, r2, r3, r4, r5, r6)
            int r2 = r18.length()
            int r2 = r2 + r1
            r10 = 0
            r4 = 6
            r5 = 0
            r8 = r12
            r9 = r14
            r6 = r11
            r11 = r3
            r3 = r12
            r12 = r4
            r4 = r13
            r13 = r5
            int r5 = kotlin.text.m.Z(r8, r9, r10, r11, r12, r13)
            int r8 = r14.length()
            int r8 = r8 + r5
            com.stripe.android.view.ThemeConfig r9 = r0.themeConfig
            int r9 = r9.getTextColor$payments_core_release(r7)
            com.stripe.android.view.ThemeConfig r10 = r0.themeConfig
            int r7 = r10.getTextAlphaColor$payments_core_release(r7)
            android.text.SpannableString r10 = new android.text.SpannableString
            r10.<init>(r3)
            android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan
            r3.<init>(r7)
            r0.setSpan(r10, r3, r15, r6)
            android.text.style.TypefaceSpan r3 = new android.text.style.TypefaceSpan
            r3.<init>(r4)
            r0.setSpan(r10, r3, r5, r8)
            android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan
            r3.<init>(r9)
            r0.setSpan(r10, r3, r5, r8)
            android.text.style.TypefaceSpan r3 = new android.text.style.TypefaceSpan
            r3.<init>(r4)
            r0.setSpan(r10, r3, r1, r2)
            android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan
            r3.<init>(r9)
            r0.setSpan(r10, r3, r1, r2)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.CardDisplayTextFactory.createStyled$payments_core_release(com.stripe.android.model.CardBrand, java.lang.String, boolean):android.text.SpannableString");
    }

    public final /* synthetic */ String createUnstyled$payments_core_release(PaymentMethod.Card card) {
        kotlin.jvm.internal.s.g(card, "card");
        String string = this.resources.getString(R.string.card_ending_in, card.brand.getDisplayName(), card.last4);
        kotlin.jvm.internal.s.f(string, "resources.getString(\n   …     card.last4\n        )");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CardDisplayTextFactory(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.s.g(r3, r0)
            android.content.res.Resources r0 = r3.getResources()
            java.lang.String r1 = "context.resources"
            kotlin.jvm.internal.s.f(r0, r1)
            com.stripe.android.view.ThemeConfig r1 = new com.stripe.android.view.ThemeConfig
            r1.<init>(r3)
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.CardDisplayTextFactory.<init>(android.content.Context):void");
    }
}