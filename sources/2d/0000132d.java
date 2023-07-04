package com.adyen.checkout.core.exception;

/* loaded from: classes.dex */
public class NoConstructorException extends IllegalStateException {
    public NoConstructorException() {
        super("No instances allowed.");
    }
}