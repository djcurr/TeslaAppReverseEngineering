package com.withpersona.sdk.inquiry.internal;

/* loaded from: classes6.dex */
public enum a {
    PRODUCTION("production"),
    SANDBOX("sandbox");
    
    private final String lowercase;

    a(String str) {
        this.lowercase = str;
    }

    public final String getLowercase$inquiry_internal_productionRelease() {
        return this.lowercase;
    }
}