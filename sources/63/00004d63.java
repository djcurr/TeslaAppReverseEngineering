package com.stripe.android.financialconnections.analytics;

import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import v20.k;
import v20.p0;
import vz.v;
import wz.r0;
import wz.s0;
import zz.g;

/* loaded from: classes2.dex */
public final class DefaultFinancialConnectionsEventReporter implements FinancialConnectionsEventReporter {
    public static final Companion Companion = new Companion(null);
    public static final String PARAM_CLIENT_SECRET = "las_client_secret";
    public static final String PARAM_SESSION_RESULT = "session_result";
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final AnalyticsRequestFactory analyticsRequestFactory;
    private final g workContext;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DefaultFinancialConnectionsEventReporter(AnalyticsRequestExecutor analyticsRequestExecutor, AnalyticsRequestFactory analyticsRequestFactory, @IOContext g workContext) {
        s.g(analyticsRequestExecutor, "analyticsRequestExecutor");
        s.g(analyticsRequestFactory, "analyticsRequestFactory");
        s.g(workContext, "workContext");
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.analyticsRequestFactory = analyticsRequestFactory;
        this.workContext = workContext;
    }

    private final void fireEvent(FinancialConnectionsAnalyticsEvent financialConnectionsAnalyticsEvent) {
        k.d(p0.a(this.workContext), null, null, new DefaultFinancialConnectionsEventReporter$fireEvent$1(this, financialConnectionsAnalyticsEvent, null), 3, null);
    }

    @Override // com.stripe.android.financialconnections.analytics.FinancialConnectionsEventReporter
    public void onPresented(FinancialConnectionsSheet.Configuration configuration) {
        Map f11;
        s.g(configuration, "configuration");
        FinancialConnectionsAnalyticsEvent.Code code = FinancialConnectionsAnalyticsEvent.Code.SheetPresented;
        f11 = r0.f(v.a(PARAM_CLIENT_SECRET, configuration.getFinancialConnectionsSessionClientSecret()));
        fireEvent(new FinancialConnectionsAnalyticsEvent(code, f11));
    }

    @Override // com.stripe.android.financialconnections.analytics.FinancialConnectionsEventReporter
    public void onResult(FinancialConnectionsSheet.Configuration configuration, FinancialConnectionsSheetActivityResult financialConnectionsSheetResult) {
        FinancialConnectionsAnalyticsEvent financialConnectionsAnalyticsEvent;
        Map l11;
        Map l12;
        Map l13;
        s.g(configuration, "configuration");
        s.g(financialConnectionsSheetResult, "financialConnectionsSheetResult");
        if (financialConnectionsSheetResult instanceof FinancialConnectionsSheetActivityResult.Completed) {
            FinancialConnectionsAnalyticsEvent.Code code = FinancialConnectionsAnalyticsEvent.Code.SheetClosed;
            l13 = s0.l(v.a(PARAM_CLIENT_SECRET, configuration.getFinancialConnectionsSessionClientSecret()), v.a(PARAM_SESSION_RESULT, "completed"));
            financialConnectionsAnalyticsEvent = new FinancialConnectionsAnalyticsEvent(code, l13);
        } else if (financialConnectionsSheetResult instanceof FinancialConnectionsSheetActivityResult.Canceled) {
            FinancialConnectionsAnalyticsEvent.Code code2 = FinancialConnectionsAnalyticsEvent.Code.SheetClosed;
            l12 = s0.l(v.a(PARAM_CLIENT_SECRET, configuration.getFinancialConnectionsSessionClientSecret()), v.a(PARAM_SESSION_RESULT, "cancelled"));
            financialConnectionsAnalyticsEvent = new FinancialConnectionsAnalyticsEvent(code2, l12);
        } else if (financialConnectionsSheetResult instanceof FinancialConnectionsSheetActivityResult.Failed) {
            FinancialConnectionsAnalyticsEvent.Code code3 = FinancialConnectionsAnalyticsEvent.Code.SheetFailed;
            l11 = s0.l(v.a(PARAM_CLIENT_SECRET, configuration.getFinancialConnectionsSessionClientSecret()), v.a(PARAM_SESSION_RESULT, "failure"));
            financialConnectionsAnalyticsEvent = new FinancialConnectionsAnalyticsEvent(code3, l11);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        fireEvent(financialConnectionsAnalyticsEvent);
    }
}