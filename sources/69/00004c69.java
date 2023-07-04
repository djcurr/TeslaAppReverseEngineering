package com.stripe.android.core;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class ApiKeyValidator {
    public static final Companion Companion = new Companion(null);
    private static final ApiKeyValidator DEFAULT = new ApiKeyValidator();

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ApiKeyValidator get() {
            return ApiKeyValidator.DEFAULT;
        }
    }

    public static final ApiKeyValidator get() {
        return Companion.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String requireValid(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            if (r6 == 0) goto Ld
            boolean r2 = kotlin.text.m.w(r6)
            if (r2 == 0) goto Lb
            goto Ld
        Lb:
            r2 = r0
            goto Le
        Ld:
            r2 = r1
        Le:
            r2 = r2 ^ r1
            if (r2 == 0) goto L29
            r2 = 2
            r3 = 0
            java.lang.String r4 = "sk_"
            boolean r0 = kotlin.text.m.H(r6, r4, r0, r2, r3)
            r0 = r0 ^ r1
            if (r0 == 0) goto L1d
            return r6
        L1d:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid Publishable Key: You are using a secret key instead of a publishable one. For more info, see https://stripe.com/docs/keys"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L29:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid Publishable Key: You must use a valid Stripe API key to make a Stripe API request. For more info, see https://stripe.com/docs/keys"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.core.ApiKeyValidator.requireValid(java.lang.String):java.lang.String");
    }
}