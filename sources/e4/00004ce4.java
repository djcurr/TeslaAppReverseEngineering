package com.stripe.android.core.networking;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class RequestId {
    public static final Companion Companion = new Companion(null);
    private final String value;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0014  */
        /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.stripe.android.core.networking.RequestId fromString(java.lang.String r3) {
            /*
                r2 = this;
                if (r3 == 0) goto Lb
                boolean r0 = kotlin.text.m.w(r3)
                if (r0 == 0) goto L9
                goto Lb
            L9:
                r0 = 0
                goto Lc
            Lb:
                r0 = 1
            Lc:
                r1 = 0
                if (r0 != 0) goto L10
                goto L11
            L10:
                r3 = r1
            L11:
                if (r3 != 0) goto L14
                goto L19
            L14:
                com.stripe.android.core.networking.RequestId r1 = new com.stripe.android.core.networking.RequestId
                r1.<init>(r3)
            L19:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.core.networking.RequestId.Companion.fromString(java.lang.String):com.stripe.android.core.networking.RequestId");
        }
    }

    public RequestId(String value) {
        s.g(value, "value");
        this.value = value;
    }

    public static /* synthetic */ RequestId copy$default(RequestId requestId, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = requestId.value;
        }
        return requestId.copy(str);
    }

    public final String component1() {
        return this.value;
    }

    public final RequestId copy(String value) {
        s.g(value, "value");
        return new RequestId(value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RequestId) && s.c(this.value, ((RequestId) obj).value);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return this.value;
    }
}