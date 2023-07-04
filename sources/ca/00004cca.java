package com.stripe.android.core.networking;

import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.IOContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import v20.e1;
import v20.i;
import v20.p0;
import zz.g;

/* loaded from: classes2.dex */
public final class DefaultAnalyticsRequestExecutor implements AnalyticsRequestExecutor {
    public static final Companion Companion = new Companion(null);
    public static final String FIELD_EVENT = "event";
    private final Logger logger;
    private final StripeNetworkClient stripeNetworkClient;
    private final g workContext;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DefaultAnalyticsRequestExecutor(StripeNetworkClient stripeNetworkClient, @IOContext g workContext, Logger logger) {
        s.g(stripeNetworkClient, "stripeNetworkClient");
        s.g(workContext, "workContext");
        s.g(logger, "logger");
        this.stripeNetworkClient = stripeNetworkClient;
        this.workContext = workContext;
        this.logger = logger;
    }

    @Override // com.stripe.android.core.networking.AnalyticsRequestExecutor
    public void executeAsync(AnalyticsRequest request) {
        s.g(request, "request");
        this.logger.info(s.p("Event: ", request.getParams().get("event")));
        i.d(p0.a(this.workContext), null, null, new DefaultAnalyticsRequestExecutor$executeAsync$1(this, request, null), 3, null);
    }

    public DefaultAnalyticsRequestExecutor() {
        this(Logger.Companion.noop(), e1.b());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultAnalyticsRequestExecutor(Logger logger, @IOContext g workContext) {
        this(new DefaultStripeNetworkClient(workContext, null, null, 0, logger, 14, null), workContext, logger);
        s.g(logger, "logger");
        s.g(workContext, "workContext");
    }
}