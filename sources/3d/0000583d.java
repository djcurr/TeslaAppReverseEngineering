package com.stripe.android.stripe3ds2.observability;

import java.io.Serializable;

/* loaded from: classes6.dex */
public interface ErrorReporter extends Serializable {
    void reportError(Throwable th2);
}