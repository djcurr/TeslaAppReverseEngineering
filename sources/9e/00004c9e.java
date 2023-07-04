package com.stripe.android.core.injection;

import com.stripe.android.core.Logger;

/* loaded from: classes2.dex */
public final class LoggingModule {
    public final Logger provideLogger(boolean z11) {
        return Logger.Companion.getInstance(z11);
    }
}