package com.stripe.android.financialconnections.analytics;

import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.financialconnections.analytics.DefaultFinancialConnectionsEventReporter$fireEvent$1", f = "DefaultFinancialConnectionsEventReporter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class DefaultFinancialConnectionsEventReporter$fireEvent$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ FinancialConnectionsAnalyticsEvent $event;
    int label;
    final /* synthetic */ DefaultFinancialConnectionsEventReporter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFinancialConnectionsEventReporter$fireEvent$1(DefaultFinancialConnectionsEventReporter defaultFinancialConnectionsEventReporter, FinancialConnectionsAnalyticsEvent financialConnectionsAnalyticsEvent, d<? super DefaultFinancialConnectionsEventReporter$fireEvent$1> dVar) {
        super(2, dVar);
        this.this$0 = defaultFinancialConnectionsEventReporter;
        this.$event = financialConnectionsAnalyticsEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new DefaultFinancialConnectionsEventReporter$fireEvent$1(this.this$0, this.$event, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((DefaultFinancialConnectionsEventReporter$fireEvent$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AnalyticsRequestExecutor analyticsRequestExecutor;
        AnalyticsRequestFactory analyticsRequestFactory;
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            analyticsRequestExecutor = this.this$0.analyticsRequestExecutor;
            analyticsRequestFactory = this.this$0.analyticsRequestFactory;
            FinancialConnectionsAnalyticsEvent financialConnectionsAnalyticsEvent = this.$event;
            analyticsRequestExecutor.executeAsync(analyticsRequestFactory.createRequest(financialConnectionsAnalyticsEvent, financialConnectionsAnalyticsEvent.getAdditionalParams()));
            return b0.f54756a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}