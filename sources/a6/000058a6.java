package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transactions.ErrorData;

/* loaded from: classes6.dex */
public interface ErrorRequestExecutor {

    /* loaded from: classes6.dex */
    public interface Factory {
        ErrorRequestExecutor create(String str, ErrorReporter errorReporter);
    }

    void executeAsync(ErrorData errorData);
}