package com.adyen.threeds2;

/* loaded from: classes.dex */
public interface ErrorMessage {
    String getErrorCode();

    String getErrorDescription();

    String getErrorDetails();

    String getTransactionID();
}