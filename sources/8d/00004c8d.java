package com.stripe.android.core.exception;

import com.stripe.android.core.StripeError;

/* loaded from: classes2.dex */
public final class InvalidResponseException extends StripeException {
    public InvalidResponseException() {
        this(null, null, 0, null, null, 31, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ InvalidResponseException(com.stripe.android.core.StripeError r5, java.lang.String r6, int r7, java.lang.String r8, java.lang.Throwable r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L7
            r11 = r0
            goto L8
        L7:
            r11 = r5
        L8:
            r5 = r10 & 2
            if (r5 == 0) goto Le
            r1 = r0
            goto Lf
        Le:
            r1 = r6
        Lf:
            r5 = r10 & 4
            if (r5 == 0) goto L14
            r7 = 0
        L14:
            r2 = r7
            r5 = r10 & 8
            if (r5 == 0) goto L22
            if (r11 != 0) goto L1d
            r8 = r0
            goto L22
        L1d:
            java.lang.String r5 = r11.getMessage()
            r8 = r5
        L22:
            r3 = r8
            r5 = r10 & 16
            if (r5 == 0) goto L29
            r10 = r0
            goto L2a
        L29:
            r10 = r9
        L2a:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.core.exception.InvalidResponseException.<init>(com.stripe.android.core.StripeError, java.lang.String, int, java.lang.String, java.lang.Throwable, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public InvalidResponseException(StripeError stripeError, String str, int i11, String str2, Throwable th2) {
        super(stripeError, str, i11, th2, str2);
    }
}