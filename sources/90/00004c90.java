package com.stripe.android.core.exception;

import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.stripe.android.core.StripeError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class PermissionException extends StripeException {
    public /* synthetic */ PermissionException(StripeError stripeError, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(stripeError, (i11 & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionException(StripeError stripeError, String str) {
        super(stripeError, str, DownloaderService.STATUS_FORBIDDEN, null, null, 24, null);
        s.g(stripeError, "stripeError");
    }
}