package com.stripe.android.model;

/* loaded from: classes6.dex */
public enum MicrodepositType {
    AMOUNTS("amounts"),
    DESCRIPTOR_CODE("descriptor_code"),
    UNKNOWN("unknown");
    
    private final String value;

    MicrodepositType(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}