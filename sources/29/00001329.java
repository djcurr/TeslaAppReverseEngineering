package com.adyen.checkout.core.exception;

/* loaded from: classes.dex */
public class BadModelException extends CheckoutException {
    public BadModelException(Class<?> cls, Throwable th2) {
        super("ModelObject protocol requires a ModelObject.Serializer object called SERIALIZER on class " + cls.getSimpleName(), th2);
    }
}