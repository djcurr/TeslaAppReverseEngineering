package com.stripe.android.view;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.s0;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.AnalyticsRequest;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization;
import java.util.Map;
import java.util.Set;
import v20.e1;
import wz.w0;

/* loaded from: classes6.dex */
public final class PaymentAuthWebViewActivityViewModel extends androidx.lifecycle.p0 {
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final PaymentBrowserAuthContract.Args args;
    private final /* synthetic */ String buttonText;
    private final vz.k extraHeaders$delegate;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final /* synthetic */ String toolbarBackgroundColor;
    private final /* synthetic */ ToolbarTitleData toolbarTitle;

    /* loaded from: classes6.dex */
    public static final class Factory implements s0.b {
        private final Application application;
        private final PaymentBrowserAuthContract.Args args;
        private final Logger logger;

        public Factory(Application application, Logger logger, PaymentBrowserAuthContract.Args args) {
            kotlin.jvm.internal.s.g(application, "application");
            kotlin.jvm.internal.s.g(logger, "logger");
            kotlin.jvm.internal.s.g(args, "args");
            this.application = application;
            this.logger = logger;
            this.args = args;
        }

        @Override // androidx.lifecycle.s0.b
        public <T extends androidx.lifecycle.p0> T create(Class<T> modelClass) {
            Set c11;
            kotlin.jvm.internal.s.g(modelClass, "modelClass");
            PaymentBrowserAuthContract.Args args = this.args;
            DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor = new DefaultAnalyticsRequestExecutor(this.logger, e1.b());
            Application application = this.application;
            String publishableKey = this.args.getPublishableKey();
            c11 = w0.c("PaymentAuthWebViewActivity");
            return new PaymentAuthWebViewActivityViewModel(args, defaultAnalyticsRequestExecutor, new PaymentAnalyticsRequestFactory(application, publishableKey, c11));
        }
    }

    /* loaded from: classes6.dex */
    public static final class ToolbarTitleData {
        private final String text;
        private final StripeToolbarCustomization toolbarCustomization;

        public ToolbarTitleData(String text, StripeToolbarCustomization toolbarCustomization) {
            kotlin.jvm.internal.s.g(text, "text");
            kotlin.jvm.internal.s.g(toolbarCustomization, "toolbarCustomization");
            this.text = text;
            this.toolbarCustomization = toolbarCustomization;
        }

        public static /* synthetic */ ToolbarTitleData copy$default(ToolbarTitleData toolbarTitleData, String str, StripeToolbarCustomization stripeToolbarCustomization, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = toolbarTitleData.text;
            }
            if ((i11 & 2) != 0) {
                stripeToolbarCustomization = toolbarTitleData.toolbarCustomization;
            }
            return toolbarTitleData.copy(str, stripeToolbarCustomization);
        }

        public final String component1$payments_core_release() {
            return this.text;
        }

        public final StripeToolbarCustomization component2$payments_core_release() {
            return this.toolbarCustomization;
        }

        public final ToolbarTitleData copy(String text, StripeToolbarCustomization toolbarCustomization) {
            kotlin.jvm.internal.s.g(text, "text");
            kotlin.jvm.internal.s.g(toolbarCustomization, "toolbarCustomization");
            return new ToolbarTitleData(text, toolbarCustomization);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ToolbarTitleData) {
                ToolbarTitleData toolbarTitleData = (ToolbarTitleData) obj;
                return kotlin.jvm.internal.s.c(this.text, toolbarTitleData.text) && kotlin.jvm.internal.s.c(this.toolbarCustomization, toolbarTitleData.toolbarCustomization);
            }
            return false;
        }

        public final String getText$payments_core_release() {
            return this.text;
        }

        public final StripeToolbarCustomization getToolbarCustomization$payments_core_release() {
            return this.toolbarCustomization;
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + this.toolbarCustomization.hashCode();
        }

        public String toString() {
            return "ToolbarTitleData(text=" + this.text + ", toolbarCustomization=" + this.toolbarCustomization + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        if (r2 != false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
        if (r3 != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PaymentAuthWebViewActivityViewModel(com.stripe.android.auth.PaymentBrowserAuthContract.Args r5, com.stripe.android.core.networking.AnalyticsRequestExecutor r6, com.stripe.android.networking.PaymentAnalyticsRequestFactory r7) {
        /*
            r4 = this;
            java.lang.String r0 = "args"
            kotlin.jvm.internal.s.g(r5, r0)
            java.lang.String r0 = "analyticsRequestExecutor"
            kotlin.jvm.internal.s.g(r6, r0)
            java.lang.String r0 = "paymentAnalyticsRequestFactory"
            kotlin.jvm.internal.s.g(r7, r0)
            r4.<init>()
            r4.args = r5
            r4.analyticsRequestExecutor = r6
            r4.paymentAnalyticsRequestFactory = r7
            com.stripe.android.view.PaymentAuthWebViewActivityViewModel$extraHeaders$2 r6 = com.stripe.android.view.PaymentAuthWebViewActivityViewModel$extraHeaders$2.INSTANCE
            vz.k r6 = vz.l.a(r6)
            r4.extraHeaders$delegate = r6
            com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization r6 = r5.getToolbarCustomization()
            r7 = 0
            r0 = 1
            r1 = 0
            if (r6 != 0) goto L2b
        L29:
            r6 = r1
            goto L3d
        L2b:
            java.lang.String r6 = r6.getButtonText()
            if (r6 == 0) goto L3a
            boolean r2 = kotlin.text.m.w(r6)
            if (r2 == 0) goto L38
            goto L3a
        L38:
            r2 = r7
            goto L3b
        L3a:
            r2 = r0
        L3b:
            if (r2 != 0) goto L29
        L3d:
            r4.buttonText = r6
            com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization r6 = r5.getToolbarCustomization()
            if (r6 != 0) goto L47
        L45:
            r7 = r1
            goto L60
        L47:
            java.lang.String r2 = r6.getHeaderText()
            if (r2 == 0) goto L53
            boolean r3 = kotlin.text.m.w(r2)
            if (r3 == 0) goto L54
        L53:
            r7 = r0
        L54:
            if (r7 != 0) goto L57
            goto L58
        L57:
            r2 = r1
        L58:
            if (r2 != 0) goto L5b
            goto L45
        L5b:
            com.stripe.android.view.PaymentAuthWebViewActivityViewModel$ToolbarTitleData r7 = new com.stripe.android.view.PaymentAuthWebViewActivityViewModel$ToolbarTitleData
            r7.<init>(r2, r6)
        L60:
            r4.toolbarTitle = r7
            com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization r5 = r5.getToolbarCustomization()
            if (r5 != 0) goto L69
            goto L6d
        L69:
            java.lang.String r1 = r5.getBackgroundColor()
        L6d:
            r4.toolbarBackgroundColor = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.PaymentAuthWebViewActivityViewModel.<init>(com.stripe.android.auth.PaymentBrowserAuthContract$Args, com.stripe.android.core.networking.AnalyticsRequestExecutor, com.stripe.android.networking.PaymentAnalyticsRequestFactory):void");
    }

    private final void fireAnalytics(AnalyticsRequest analyticsRequest) {
        this.analyticsRequestExecutor.executeAsync(analyticsRequest);
    }

    public final String getButtonText$payments_core_release() {
        return this.buttonText;
    }

    public final /* synthetic */ Intent getCancellationResult$payments_core_release() {
        Intent putExtras = new Intent().putExtras(PaymentFlowResult.Unvalidated.copy$default(getPaymentResult$payments_core_release(), null, this.args.getShouldCancelIntentOnUserNavigation() ? 3 : 1, null, this.args.getShouldCancelSource(), null, null, null, 117, null).toBundle());
        kotlin.jvm.internal.s.f(putExtras, "Intent().putExtras(\n    ….toBundle()\n            )");
        return putExtras;
    }

    public final Map<String, String> getExtraHeaders() {
        return (Map) this.extraHeaders$delegate.getValue();
    }

    public final /* synthetic */ PaymentFlowResult.Unvalidated getPaymentResult$payments_core_release() {
        String clientSecret = this.args.getClientSecret();
        String lastPathSegment = Uri.parse(this.args.getUrl()).getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        return new PaymentFlowResult.Unvalidated(clientSecret, 0, null, false, lastPathSegment, null, this.args.getStripeAccountId(), 46, null);
    }

    public final String getToolbarBackgroundColor$payments_core_release() {
        return this.toolbarBackgroundColor;
    }

    public final ToolbarTitleData getToolbarTitle$payments_core_release() {
        return this.toolbarTitle;
    }

    public final void logComplete() {
        fireAnalytics(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds1ChallengeComplete, null, null, null, null, 30, null));
    }

    public final void logError() {
        fireAnalytics(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds1ChallengeError, null, null, null, null, 30, null));
    }

    public final void logStart() {
        fireAnalytics(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds1ChallengeStart, null, null, null, null, 30, null));
        fireAnalytics(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.AuthWithWebView, null, null, null, null, 30, null));
    }
}