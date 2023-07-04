package com.stripe.android.core.injection;

import v20.e1;
import zz.g;

/* loaded from: classes2.dex */
public final class CoroutineContextModule {
    @UIContext
    public final g provideUIContext() {
        return e1.c();
    }

    @IOContext
    public final g provideWorkContext() {
        return e1.b();
    }
}