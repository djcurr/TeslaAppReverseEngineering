package com.stripe.android.stripe3ds2.security;

/* loaded from: classes6.dex */
public enum Algorithm {
    EC("EC"),
    RSA("RSA");
    
    private final String key;

    Algorithm(String str) {
        this.key = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.key;
    }
}