package com.stripe.android.core.exception;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class APIConnectionException extends StripeException {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ APIConnectionException create$default(Companion companion, IOException iOException, String str, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str = null;
            }
            return companion.create(iOException, str);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
            if (r15 != false) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final /* synthetic */ com.stripe.android.core.exception.APIConnectionException create(java.io.IOException r14, java.lang.String r15) {
            /*
                r13 = this;
                java.lang.String r0 = "e"
                kotlin.jvm.internal.s.g(r14, r0)
                r0 = 2
                java.lang.String[] r0 = new java.lang.String[r0]
                java.lang.String r1 = "Stripe"
                r2 = 0
                r0[r2] = r1
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r3 = 40
                r1.append(r3)
                r1.append(r15)
                r3 = 41
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                r3 = 1
                if (r15 == 0) goto L2c
                boolean r15 = kotlin.text.m.w(r15)
                if (r15 == 0) goto L2d
            L2c:
                r2 = r3
            L2d:
                if (r2 != 0) goto L30
                goto L31
            L30:
                r1 = 0
            L31:
                r0[r3] = r1
                java.util.List r4 = wz.u.n(r0)
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 62
                r12 = 0
                java.lang.String r5 = " "
                java.lang.String r15 = wz.u.l0(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                com.stripe.android.core.exception.APIConnectionException r0 = new com.stripe.android.core.exception.APIConnectionException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "IOException during API request to "
                r1.append(r2)
                r1.append(r15)
                java.lang.String r15 = ": "
                r1.append(r15)
                java.lang.String r15 = r14.getMessage()
                r1.append(r15)
                java.lang.String r15 = ". Please check your internet connection and try again. If this problem persists, you should check Stripe's service status at https://twitter.com/stripestatus, or let us know at support@stripe.com."
                r1.append(r15)
                java.lang.String r15 = r1.toString()
                r0.<init>(r15, r14)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.core.exception.APIConnectionException.Companion.create(java.io.IOException, java.lang.String):com.stripe.android.core.exception.APIConnectionException");
        }
    }

    public APIConnectionException() {
        this(null, null, 3, null);
    }

    public /* synthetic */ APIConnectionException(String str, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : th2);
    }

    public APIConnectionException(String str, Throwable th2) {
        super(null, null, 0, th2, str, 7, null);
    }
}