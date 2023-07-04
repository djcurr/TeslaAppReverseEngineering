package com.adyen.checkout.core.exception;

import org.json.JSONException;

/* loaded from: classes.dex */
public class ModelSerializationException extends CheckoutException {
    public ModelSerializationException(Class cls, JSONException jSONException) {
        super("Unexpected exception while serializing " + cls.getSimpleName() + ".", jSONException);
    }
}