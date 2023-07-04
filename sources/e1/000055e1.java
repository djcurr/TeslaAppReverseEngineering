package com.stripe.android.paymentsheet.analytics;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class DeviceId {
    private final String value;

    public DeviceId(String value) {
        s.g(value, "value");
        this.value = value;
    }

    public static /* synthetic */ DeviceId copy$default(DeviceId deviceId, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = deviceId.value;
        }
        return deviceId.copy(str);
    }

    public final String component1() {
        return this.value;
    }

    public final DeviceId copy(String value) {
        s.g(value, "value");
        return new DeviceId(value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeviceId) && s.c(this.value, ((DeviceId) obj).value);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "DeviceId(value=" + this.value + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DeviceId() {
        /*
            r2 = this;
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "randomUUID().toString()"
            kotlin.jvm.internal.s.f(r0, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.analytics.DeviceId.<init>():void");
    }
}