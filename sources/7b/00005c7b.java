package com.stripe.android.view;

import java.util.Set;

/* loaded from: classes6.dex */
public interface CardValidCallback {

    /* loaded from: classes6.dex */
    public enum Fields {
        Number,
        Expiry,
        Cvc,
        Postal
    }

    void onInputChanged(boolean z11, Set<? extends Fields> set);
}