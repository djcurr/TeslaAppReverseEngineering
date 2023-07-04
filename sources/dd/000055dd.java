package com.stripe.android.paymentsheet.analytics;

import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import v20.i;
import v20.p0;
import zz.g;

/* loaded from: classes6.dex */
public final class DefaultEventReporter implements EventReporter {
    public static final Companion Companion = new Companion(null);
    public static final String FIELD_DEVICE_ID = "device_id";
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final DeviceIdRepository deviceIdRepository;
    private final EventReporter.Mode mode;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final g workContext;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DefaultEventReporter(EventReporter.Mode mode, DeviceIdRepository deviceIdRepository, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, @IOContext g workContext) {
        s.g(mode, "mode");
        s.g(deviceIdRepository, "deviceIdRepository");
        s.g(analyticsRequestExecutor, "analyticsRequestExecutor");
        s.g(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        s.g(workContext, "workContext");
        this.mode = mode;
        this.deviceIdRepository = deviceIdRepository;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.workContext = workContext;
    }

    private final void fireEvent(PaymentSheetEvent paymentSheetEvent) {
        i.d(p0.a(this.workContext), null, null, new DefaultEventReporter$fireEvent$1(this, paymentSheetEvent, null), 3, null);
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onDismiss() {
        fireEvent(new PaymentSheetEvent.Dismiss(this.mode));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onInit(PaymentSheet.Configuration configuration) {
        fireEvent(new PaymentSheetEvent.Init(this.mode, configuration));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onPaymentFailure(PaymentSelection paymentSelection) {
        fireEvent(new PaymentSheetEvent.Payment(this.mode, PaymentSheetEvent.Payment.Result.Failure, paymentSelection));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onPaymentSuccess(PaymentSelection paymentSelection) {
        fireEvent(new PaymentSheetEvent.Payment(this.mode, PaymentSheetEvent.Payment.Result.Success, paymentSelection));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onSelectPaymentOption(PaymentSelection paymentSelection) {
        s.g(paymentSelection, "paymentSelection");
        fireEvent(new PaymentSheetEvent.SelectPaymentOption(this.mode, paymentSelection));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onShowExistingPaymentOptions() {
        fireEvent(new PaymentSheetEvent.ShowExistingPaymentOptions(this.mode));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onShowNewPaymentOptionForm() {
        fireEvent(new PaymentSheetEvent.ShowNewPaymentOptionForm(this.mode));
    }
}