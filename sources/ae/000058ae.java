package com.stripe.android.stripe3ds2.transaction;

import android.app.Application;
import com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.observability.Stripe3ds2ErrorReporterConfig;
import com.stripe.android.stripe3ds2.security.DefaultMessageTransformer;
import com.stripe.android.stripe3ds2.transaction.StripeErrorRequestExecutor;
import java.security.cert.X509Certificate;
import java.util.List;
import kotlin.jvm.internal.s;
import zz.g;

/* loaded from: classes6.dex */
public final class InitChallengeRepositoryFactory {
    private final Application application;
    private final boolean enableLogging;
    private final boolean isLiveMode;
    private final List<X509Certificate> rootCerts;
    private final SdkTransactionId sdkTransactionId;
    private final StripeUiCustomization uiCustomization;
    private final g workContext;

    /* JADX WARN: Multi-variable type inference failed */
    public InitChallengeRepositoryFactory(Application application, boolean z11, SdkTransactionId sdkTransactionId, StripeUiCustomization uiCustomization, List<? extends X509Certificate> rootCerts, boolean z12, g workContext) {
        s.g(application, "application");
        s.g(sdkTransactionId, "sdkTransactionId");
        s.g(uiCustomization, "uiCustomization");
        s.g(rootCerts, "rootCerts");
        s.g(workContext, "workContext");
        this.application = application;
        this.isLiveMode = z11;
        this.sdkTransactionId = sdkTransactionId;
        this.uiCustomization = uiCustomization;
        this.rootCerts = rootCerts;
        this.enableLogging = z12;
        this.workContext = workContext;
    }

    public final InitChallengeRepository create() {
        Logger logger = Logger.Companion.get(this.enableLogging);
        DefaultErrorReporter defaultErrorReporter = new DefaultErrorReporter(this.application, new Stripe3ds2ErrorReporterConfig(this.sdkTransactionId), this.workContext, logger, null, null, null, 0, 240, null);
        return new DefaultInitChallengeRepository(this.sdkTransactionId, new MessageVersionRegistry(), new DefaultJwsValidator(this.isLiveMode, this.rootCerts, defaultErrorReporter), new DefaultMessageTransformer(this.isLiveMode), new DefaultAcsDataParser(defaultErrorReporter), new DefaultChallengeRequestResultRepository(defaultErrorReporter, this.workContext), new StripeErrorRequestExecutor.Factory(this.workContext), this.uiCustomization, defaultErrorReporter, logger);
    }
}