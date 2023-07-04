package com.stripe.android.core.exception;

import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.APIConnectionException;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONException;
import wz.e0;
import wz.w;

/* loaded from: classes2.dex */
public abstract class StripeException extends Exception {
    public static final Companion Companion = new Companion(null);
    private final boolean isClientError;
    private final String requestId;
    private final int statusCode;
    private final StripeError stripeError;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final StripeException create(Throwable throwable) {
            StripeException aPIException;
            s.g(throwable, "throwable");
            if (throwable instanceof StripeException) {
                return (StripeException) throwable;
            }
            if (throwable instanceof JSONException) {
                aPIException = new APIException(throwable);
            } else if (throwable instanceof IOException) {
                return APIConnectionException.Companion.create$default(APIConnectionException.Companion, (IOException) throwable, null, 2, null);
            } else {
                if (throwable instanceof IllegalArgumentException) {
                    aPIException = new InvalidRequestException(null, null, 0, throwable.getMessage(), throwable, 7, null);
                } else {
                    aPIException = new APIException(throwable);
                }
            }
            return aPIException;
        }
    }

    public StripeException() {
        this(null, null, 0, null, null, 31, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ StripeException(com.stripe.android.core.StripeError r5, java.lang.String r6, int r7, java.lang.Throwable r8, java.lang.String r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
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
            if (r5 == 0) goto L1b
            r3 = r0
            goto L1c
        L1b:
            r3 = r8
        L1c:
            r5 = r10 & 16
            if (r5 == 0) goto L29
            if (r11 != 0) goto L24
            r9 = r0
            goto L29
        L24:
            java.lang.String r5 = r11.getMessage()
            r9 = r5
        L29:
            r10 = r9
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.core.exception.StripeException.<init>(com.stripe.android.core.StripeError, java.lang.String, int, java.lang.Throwable, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private final boolean typedEquals(StripeException stripeException) {
        return s.c(this.stripeError, stripeException.stripeError) && s.c(this.requestId, stripeException.requestId) && this.statusCode == stripeException.statusCode && s.c(getMessage(), stripeException.getMessage());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StripeException) {
            return typedEquals((StripeException) obj);
        }
        return false;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final StripeError getStripeError() {
        return this.stripeError;
    }

    public int hashCode() {
        return Objects.hash(this.stripeError, this.requestId, Integer.valueOf(this.statusCode), getMessage());
    }

    public final boolean isClientError() {
        return this.isClientError;
    }

    @Override // java.lang.Throwable
    public String toString() {
        List n11;
        String l02;
        String[] strArr = new String[2];
        String str = this.requestId;
        strArr[0] = str == null ? null : s.p("Request-id: ", str);
        strArr[1] = super.toString();
        n11 = w.n(strArr);
        l02 = e0.l0(n11, "\n", null, null, 0, null, null, 62, null);
        return l02;
    }

    public StripeException(StripeError stripeError, String str, int i11, Throwable th2, String str2) {
        super(str2, th2);
        this.stripeError = stripeError;
        this.requestId = str;
        this.statusCode = i11;
        boolean z11 = false;
        if (400 <= i11 && i11 < 500) {
            z11 = true;
        }
        this.isClientError = z11;
    }
}