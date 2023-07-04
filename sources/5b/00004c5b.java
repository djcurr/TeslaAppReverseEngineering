package com.stripe.android.cards;

import android.content.Context;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.model.AccountRange;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeApiRepository;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.g;
import vz.q;
import vz.r;
import zz.d;

/* loaded from: classes2.dex */
public final class DefaultCardAccountRangeRepositoryFactory implements CardAccountRangeRepository.Factory {
    public static final int $stable = 8;
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final Context appContext;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class NullCardAccountRangeSource implements CardAccountRangeSource {
        private final e<Boolean> loading = g.x(Boolean.FALSE);

        @Override // com.stripe.android.cards.CardAccountRangeSource
        public Object getAccountRange(CardNumber.Unvalidated unvalidated, d<? super AccountRange> dVar) {
            return null;
        }

        @Override // com.stripe.android.cards.CardAccountRangeSource
        public e<Boolean> getLoading() {
            return this.loading;
        }
    }

    public DefaultCardAccountRangeRepositoryFactory(Context context, AnalyticsRequestExecutor analyticsRequestExecutor) {
        s.g(context, "context");
        s.g(analyticsRequestExecutor, "analyticsRequestExecutor");
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.appContext = context.getApplicationContext();
    }

    private final CardAccountRangeSource createRemoteCardAccountRangeSource() {
        Object obj;
        try {
            q.a aVar = q.f54772b;
            PaymentConfiguration.Companion companion = PaymentConfiguration.Companion;
            Context appContext = this.appContext;
            s.f(appContext, "appContext");
            obj = q.b(companion.getInstance(appContext).getPublishableKey());
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            obj = q.b(r.a(th2));
        }
        if (q.h(obj)) {
            fireAnalyticsEvent((String) obj, PaymentAnalyticsEvent.CardMetadataPublishableKeyAvailable);
        }
        if (q.e(obj) != null) {
            fireAnalyticsEvent(ApiRequest.Options.UNDEFINED_PUBLISHABLE_KEY, PaymentAnalyticsEvent.CardMetadataPublishableKeyUnavailable);
        }
        if (q.e(obj) == null) {
            String str = (String) obj;
            Context appContext2 = this.appContext;
            s.f(appContext2, "appContext");
            StripeApiRepository stripeApiRepository = new StripeApiRepository(appContext2, new DefaultCardAccountRangeRepositoryFactory$createRemoteCardAccountRangeSource$4$1(str), null, null, null, null, null, null, null, null, null, null, null, null, 16380, null);
            ApiRequest.Options options = new ApiRequest.Options(str, null, null, 6, null);
            Context appContext3 = this.appContext;
            s.f(appContext3, "appContext");
            DefaultCardAccountRangeStore defaultCardAccountRangeStore = new DefaultCardAccountRangeStore(appContext3);
            DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor = new DefaultAnalyticsRequestExecutor();
            Context appContext4 = this.appContext;
            s.f(appContext4, "appContext");
            return new RemoteCardAccountRangeSource(stripeApiRepository, options, defaultCardAccountRangeStore, defaultAnalyticsRequestExecutor, new PaymentAnalyticsRequestFactory(appContext4, str, (Set) null, 4, (DefaultConstructorMarker) null));
        }
        return new NullCardAccountRangeSource();
    }

    private final void fireAnalyticsEvent(String str, PaymentAnalyticsEvent paymentAnalyticsEvent) {
        AnalyticsRequestExecutor analyticsRequestExecutor = this.analyticsRequestExecutor;
        Context appContext = this.appContext;
        s.f(appContext, "appContext");
        analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(new PaymentAnalyticsRequestFactory(appContext, str, (Set) null, 4, (DefaultConstructorMarker) null), paymentAnalyticsEvent, null, null, null, null, 30, null));
    }

    @Override // com.stripe.android.cards.CardAccountRangeRepository.Factory
    public CardAccountRangeRepository create() {
        Context appContext = this.appContext;
        s.f(appContext, "appContext");
        DefaultCardAccountRangeStore defaultCardAccountRangeStore = new DefaultCardAccountRangeStore(appContext);
        return new DefaultCardAccountRangeRepository(new InMemoryCardAccountRangeSource(defaultCardAccountRangeStore), createRemoteCardAccountRangeSource(), new StaticCardAccountRangeSource(null, 1, null), defaultCardAccountRangeStore);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultCardAccountRangeRepositoryFactory(Context context) {
        this(context, new DefaultAnalyticsRequestExecutor());
        s.g(context, "context");
    }
}