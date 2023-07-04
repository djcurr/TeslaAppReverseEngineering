package com.adyen.threeds2;

/* loaded from: classes.dex */
public interface CompletionEvent {
    String getSDKTransactionID();

    String getTransactionStatus();
}