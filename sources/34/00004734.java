package com.plaid.link.exception;

import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class LinkException extends Throwable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkException(String message) {
        super(message);
        s.g(message, "message");
    }
}