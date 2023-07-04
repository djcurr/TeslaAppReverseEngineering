package com.stripe.android.core.exception;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class MaxRetryReachedException extends StripeException {
    public MaxRetryReachedException() {
        this(null, 1, null);
    }

    public /* synthetic */ MaxRetryReachedException(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str);
    }

    public MaxRetryReachedException(String str) {
        super(null, null, 0, null, str, 15, null);
    }
}