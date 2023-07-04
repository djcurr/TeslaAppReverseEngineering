package com.plaid.link.exception;

import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class LinkInvalidResultCodeException extends IllegalStateException {
    public LinkInvalidResultCodeException(int i11) {
        super(s.p("Unknown result code: ", Integer.valueOf(i11)));
    }
}