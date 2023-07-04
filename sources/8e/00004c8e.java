package com.stripe.android.core.exception;

import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class InvalidSerializationException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidSerializationException(String type) {
        super("Serialization result " + type + " is not supported");
        s.g(type, "type");
    }
}