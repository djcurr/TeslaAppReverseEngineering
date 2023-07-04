package com.adyen.threeds2;

/* loaded from: classes.dex */
public interface AuthenticationRequestParameters {
    String getDeviceData();

    String getMessageVersion();

    String getSDKAppID();

    String getSDKEphemeralPublicKey();

    String getSDKReferenceNumber();

    String getSDKTransactionID();
}