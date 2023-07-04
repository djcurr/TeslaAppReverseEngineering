package com.stripe.android.link.ui;

import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.link.R;
import com.stripe.android.link.ui.ErrorMessage;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class ErrorMessageKt {
    public static final ErrorMessage getErrorMessage(Throwable th2) {
        s.g(th2, "<this>");
        if (th2 instanceof APIConnectionException) {
            return new ErrorMessage.FromResources(R.string.stripe_failure_connection_error);
        }
        String localizedMessage = th2.getLocalizedMessage();
        ErrorMessage.Raw raw = localizedMessage == null ? null : new ErrorMessage.Raw(localizedMessage);
        return raw == null ? new ErrorMessage.FromResources(R.string.stripe_internal_error) : raw;
    }
}