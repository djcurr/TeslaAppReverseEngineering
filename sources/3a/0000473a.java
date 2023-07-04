package com.plaid.link.exception;

import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class LinkUnsupportedSdkVersionException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkUnsupportedSdkVersionException(String message) {
        super(message);
        s.g(message, "message");
    }
}