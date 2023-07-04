package com.reactnativestripesdk;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/reactnativestripesdk/PaymentMethodCreateParamsException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", "<init>", "(Ljava/lang/String;)V", "stripe_stripe-react-native_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class PaymentMethodCreateParamsException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodCreateParamsException(String message) {
        super(message);
        kotlin.jvm.internal.s.g(message, "message");
    }
}