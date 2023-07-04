package com.stripe.android.googlepaylauncher;

/* loaded from: classes6.dex */
public enum GooglePayEnvironment {
    Production(1),
    Test(3);
    
    private final int value;

    GooglePayEnvironment(int i11) {
        this.value = i11;
    }

    public final int getValue$payments_core_release() {
        return this.value;
    }
}