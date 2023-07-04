package com.plaid.link.exception;

import com.plaid.internal.r5;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class LinkInvalidResultException extends r5 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkInvalidResultException(String message) {
        super(message);
        s.g(message, "message");
    }
}