package com.adyen.threeds2;

/* loaded from: classes.dex */
public interface ProtocolErrorEvent {
    ErrorMessage getErrorMessage();

    String getSDKTransactionID();
}