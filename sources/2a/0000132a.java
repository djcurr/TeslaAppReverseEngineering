package com.adyen.checkout.core.exception;

/* loaded from: classes.dex */
public class CheckoutException extends RuntimeException {
    public CheckoutException(String str) {
        this(str, null);
    }

    public CheckoutException(String str, Throwable th2) {
        super(str, th2);
    }
}