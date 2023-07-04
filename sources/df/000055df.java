package com.stripe.android.paymentsheet.analytics;

import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import h00.p;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.r;
import vz.v;
import wz.s0;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.paymentsheet.analytics.DefaultEventReporter$fireEvent$1", f = "DefaultEventReporter.kt", l = {87}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class DefaultEventReporter$fireEvent$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ PaymentSheetEvent $event;
    int label;
    final /* synthetic */ DefaultEventReporter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultEventReporter$fireEvent$1(DefaultEventReporter defaultEventReporter, PaymentSheetEvent paymentSheetEvent, d<? super DefaultEventReporter$fireEvent$1> dVar) {
        super(2, dVar);
        this.this$0 = defaultEventReporter;
        this.$event = paymentSheetEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new DefaultEventReporter$fireEvent$1(this.this$0, this.$event, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((DefaultEventReporter$fireEvent$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        DeviceIdRepository deviceIdRepository;
        AnalyticsRequestExecutor analyticsRequestExecutor;
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
        Map<String, ? extends Object> q11;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            deviceIdRepository = this.this$0.deviceIdRepository;
            this.label = 1;
            obj = deviceIdRepository.get(this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
        }
        analyticsRequestExecutor = this.this$0.analyticsRequestExecutor;
        paymentAnalyticsRequestFactory = this.this$0.paymentAnalyticsRequestFactory;
        PaymentSheetEvent paymentSheetEvent = this.$event;
        q11 = s0.q(paymentSheetEvent.getAdditionalParams(), v.a(DefaultEventReporter.FIELD_DEVICE_ID, ((DeviceId) obj).getValue()));
        analyticsRequestExecutor.executeAsync(paymentAnalyticsRequestFactory.createRequest(paymentSheetEvent, q11));
        return b0.f54756a;
    }
}