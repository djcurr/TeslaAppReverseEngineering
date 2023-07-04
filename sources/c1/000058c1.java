package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.transactions.ErrorData;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class ProtocolErrorEventFactory {
    public final ProtocolErrorEvent create(ErrorData errorData) {
        s.g(errorData, "errorData");
        String acsTransId = errorData.getAcsTransId();
        if (acsTransId == null) {
            acsTransId = "";
        }
        return new ProtocolErrorEvent(errorData.getSdkTransId(), new ErrorMessage(acsTransId, errorData.getErrorCode(), errorData.getErrorDescription(), errorData.getErrorDetail()));
    }
}