package com.stripe.android.core.networking;

import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.networking.ConnectionFactory;
import h00.a;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import v20.e1;
import v20.i;
import vz.q;
import vz.r;
import zz.d;
import zz.g;

/* loaded from: classes2.dex */
public final class DefaultStripeNetworkClient implements StripeNetworkClient {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final int DEFAULT_MAX_RETRIES = 3;
    private final ConnectionFactory connectionFactory;
    private final Logger logger;
    private final int maxRetries;
    private final RetryDelaySupplier retryDelaySupplier;
    private final g workContext;

    /* loaded from: classes2.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DefaultStripeNetworkClient() {
        this(null, null, null, 0, null, 31, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultStripeNetworkClient(g workContext) {
        this(workContext, null, null, 0, null, 30, null);
        s.g(workContext, "workContext");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultStripeNetworkClient(g workContext, ConnectionFactory connectionFactory) {
        this(workContext, connectionFactory, null, 0, null, 28, null);
        s.g(workContext, "workContext");
        s.g(connectionFactory, "connectionFactory");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultStripeNetworkClient(g workContext, ConnectionFactory connectionFactory, RetryDelaySupplier retryDelaySupplier) {
        this(workContext, connectionFactory, retryDelaySupplier, 0, null, 24, null);
        s.g(workContext, "workContext");
        s.g(connectionFactory, "connectionFactory");
        s.g(retryDelaySupplier, "retryDelaySupplier");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultStripeNetworkClient(g workContext, ConnectionFactory connectionFactory, RetryDelaySupplier retryDelaySupplier, int i11) {
        this(workContext, connectionFactory, retryDelaySupplier, i11, null, 16, null);
        s.g(workContext, "workContext");
        s.g(connectionFactory, "connectionFactory");
        s.g(retryDelaySupplier, "retryDelaySupplier");
    }

    public DefaultStripeNetworkClient(g workContext, ConnectionFactory connectionFactory, RetryDelaySupplier retryDelaySupplier, int i11, Logger logger) {
        s.g(workContext, "workContext");
        s.g(connectionFactory, "connectionFactory");
        s.g(retryDelaySupplier, "retryDelaySupplier");
        s.g(logger, "logger");
        this.workContext = workContext;
        this.connectionFactory = connectionFactory;
        this.retryDelaySupplier = retryDelaySupplier;
        this.maxRetries = i11;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StripeResponse<String> makeRequest(StripeRequest stripeRequest) {
        return parseResponse(this.connectionFactory.create(stripeRequest), stripeRequest.getUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StripeResponse<File> makeRequestForFile(StripeRequest stripeRequest, File file) {
        return parseResponse(this.connectionFactory.createForFile(stripeRequest, file), stripeRequest.getUrl());
    }

    private final <BodyType> StripeResponse<BodyType> parseResponse(StripeConnection<BodyType> stripeConnection, String str) {
        Object b11;
        try {
            q.a aVar = q.f54772b;
            StripeResponse<BodyType> response = stripeConnection.getResponse();
            this.logger.info(response.toString());
            b11 = q.b(response);
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        Throwable e11 = q.e(b11);
        if (e11 == null) {
            return (StripeResponse) b11;
        }
        this.logger.error("Exception while making Stripe API request", e11);
        if (e11 instanceof IOException) {
            throw APIConnectionException.Companion.create((IOException) e11, str);
        }
        throw e11;
    }

    public final <BodyType> Object executeInternal$stripe_core_release(int i11, Iterable<Integer> iterable, a<StripeResponse<BodyType>> aVar, d<? super StripeResponse<BodyType>> dVar) {
        return i.g(this.workContext, new DefaultStripeNetworkClient$executeInternal$2(aVar, iterable, i11, this, null), dVar);
    }

    @Override // com.stripe.android.core.networking.StripeNetworkClient
    public Object executeRequest(StripeRequest stripeRequest, d<? super StripeResponse<String>> dVar) {
        return executeInternal$stripe_core_release(this.maxRetries, stripeRequest.getRetryResponseCodes(), new DefaultStripeNetworkClient$executeRequest$2(this, stripeRequest), dVar);
    }

    @Override // com.stripe.android.core.networking.StripeNetworkClient
    public Object executeRequestForFile(StripeRequest stripeRequest, File file, d<? super StripeResponse<File>> dVar) {
        return executeInternal$stripe_core_release(this.maxRetries, stripeRequest.getRetryResponseCodes(), new DefaultStripeNetworkClient$executeRequestForFile$2(this, stripeRequest, file), dVar);
    }

    public /* synthetic */ DefaultStripeNetworkClient(g gVar, ConnectionFactory connectionFactory, RetryDelaySupplier retryDelaySupplier, int i11, Logger logger, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? e1.b() : gVar, (i12 & 2) != 0 ? ConnectionFactory.Default.INSTANCE : connectionFactory, (i12 & 4) != 0 ? new RetryDelaySupplier() : retryDelaySupplier, (i12 & 8) != 0 ? 3 : i11, (i12 & 16) != 0 ? Logger.Companion.noop() : logger);
    }
}