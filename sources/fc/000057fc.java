package com.stripe.android.stripe3ds2.exceptions;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class SDKRuntimeException extends RuntimeException {
    public /* synthetic */ SDKRuntimeException(String str, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SDKRuntimeException(String message, Throwable th2) {
        super(message, th2);
        s.g(message, "message");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SDKRuntimeException(java.lang.Throwable r2) {
        /*
            r1 = this;
            java.lang.String r0 = "t"
            kotlin.jvm.internal.s.g(r2, r0)
            java.lang.String r0 = r2.getMessage()
            if (r0 != 0) goto Ld
            java.lang.String r0 = ""
        Ld:
            java.lang.Throwable r2 = r2.getCause()
            r1.<init>(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException.<init>(java.lang.Throwable):void");
    }
}