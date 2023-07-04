package com.adyen.checkout.card.ui;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class SecurityCodeInput extends CardNumberInput {
    public SecurityCodeInput(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SecurityCodeInput(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        b(4);
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{"creditCardSecurityCode"});
        }
    }
}