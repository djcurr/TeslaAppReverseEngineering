package com.stripe.android.core.exception;

import com.stripe.android.core.StripeError;
import com.stripe.android.core.networking.NetworkConstantsKt;

/* loaded from: classes2.dex */
public final class RateLimitException extends StripeException {
    public RateLimitException() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ RateLimitException(com.stripe.android.core.StripeError r2, java.lang.String r3, java.lang.String r4, java.lang.Throwable r5, int r6, kotlin.jvm.internal.DefaultConstructorMarker r7) {
        /*
            r1 = this;
            r7 = r6 & 1
            r0 = 0
            if (r7 == 0) goto L6
            r2 = r0
        L6:
            r7 = r6 & 2
            if (r7 == 0) goto Lb
            r3 = r0
        Lb:
            r7 = r6 & 4
            if (r7 == 0) goto L17
            if (r2 != 0) goto L13
            r4 = r0
            goto L17
        L13:
            java.lang.String r4 = r2.getMessage()
        L17:
            r6 = r6 & 8
            if (r6 == 0) goto L1c
            r5 = r0
        L1c:
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.core.exception.RateLimitException.<init>(com.stripe.android.core.StripeError, java.lang.String, java.lang.String, java.lang.Throwable, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public RateLimitException(StripeError stripeError, String str, String str2, Throwable th2) {
        super(stripeError, str, NetworkConstantsKt.HTTP_TOO_MANY_REQUESTS, th2, str2);
    }
}