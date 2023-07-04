package com.stripe.android.googlepaylauncher.injection;

import android.content.Context;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.core.Logger;
import com.stripe.android.googlepaylauncher.DefaultGooglePayRepository;
import com.stripe.android.googlepaylauncher.GooglePayEnvironment;
import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class GooglePayLauncherModule$provideGooglePayRepositoryFactory$1 extends u implements l<GooglePayEnvironment, DefaultGooglePayRepository> {
    final /* synthetic */ Context $appContext;
    final /* synthetic */ Logger $logger;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayLauncherModule$provideGooglePayRepositoryFactory$1(Context context, Logger logger) {
        super(1);
        this.$appContext = context;
        this.$logger = logger;
    }

    @Override // h00.l
    public final DefaultGooglePayRepository invoke(GooglePayEnvironment environment) {
        s.g(environment, "environment");
        return new DefaultGooglePayRepository(this.$appContext, environment, new GooglePayJsonFactory.BillingAddressParameters(false, null, false, 7, null), true, true, this.$logger);
    }
}