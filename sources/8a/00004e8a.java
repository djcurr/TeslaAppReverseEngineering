package com.stripe.android.googlepaylauncher.injection;

import android.content.Context;
import com.stripe.android.core.Logger;
import com.stripe.android.googlepaylauncher.GooglePayEnvironment;
import com.stripe.android.googlepaylauncher.GooglePayRepository;
import h00.l;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class GooglePayLauncherModule {
    public static final int $stable = 0;

    public final l<GooglePayEnvironment, GooglePayRepository> provideGooglePayRepositoryFactory(Context appContext, Logger logger) {
        s.g(appContext, "appContext");
        s.g(logger, "logger");
        return new GooglePayLauncherModule$provideGooglePayRepositoryFactory$1(appContext, logger);
    }
}