package com.stripe.android.googlepaylauncher;

import android.content.Context;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentsClient;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.core.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.u;
import vz.k;
import vz.m;
import vz.q;
import vz.r;

/* loaded from: classes6.dex */
public final class DefaultGooglePayRepository implements GooglePayRepository {
    private final boolean allowCreditCards;
    private final GooglePayJsonFactory.BillingAddressParameters billingAddressParameters;
    private final Context context;
    private final GooglePayEnvironment environment;
    private final boolean existingPaymentMethodRequired;
    private final GooglePayJsonFactory googlePayJsonFactory;
    private final Logger logger;
    private final k paymentsClient$delegate;

    public DefaultGooglePayRepository(Context context, GooglePayEnvironment environment, GooglePayJsonFactory.BillingAddressParameters billingAddressParameters, boolean z11, boolean z12, Logger logger) {
        k a11;
        s.g(context, "context");
        s.g(environment, "environment");
        s.g(billingAddressParameters, "billingAddressParameters");
        s.g(logger, "logger");
        this.context = context;
        this.environment = environment;
        this.billingAddressParameters = billingAddressParameters;
        this.existingPaymentMethodRequired = z11;
        this.allowCreditCards = z12;
        this.logger = logger;
        this.googlePayJsonFactory = new GooglePayJsonFactory(context, false, 2, (DefaultConstructorMarker) null);
        a11 = m.a(new DefaultGooglePayRepository$paymentsClient$2(this));
        this.paymentsClient$delegate = a11;
    }

    public static /* synthetic */ void a(DefaultGooglePayRepository defaultGooglePayRepository, u uVar, Task task) {
        m136isReady$lambda2(defaultGooglePayRepository, uVar, task);
    }

    private final PaymentsClient getPaymentsClient() {
        return (PaymentsClient) this.paymentsClient$delegate.getValue();
    }

    /* renamed from: isReady$lambda-2 */
    public static final void m136isReady$lambda2(DefaultGooglePayRepository this$0, u isReadyState, Task task) {
        Boolean b11;
        s.g(this$0, "this$0");
        s.g(isReadyState, "$isReadyState");
        s.g(task, "task");
        try {
            q.a aVar = q.f54772b;
            b11 = q.b(Boolean.valueOf(s.c(task.getResult(ApiException.class), Boolean.TRUE)));
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        Throwable e11 = q.e(b11);
        if (e11 != null) {
            this$0.logger.error("Google Pay check failed.", e11);
        }
        Boolean bool = Boolean.FALSE;
        if (q.g(b11)) {
            b11 = bool;
        }
        boolean booleanValue = ((Boolean) b11).booleanValue();
        this$0.logger.info(s.p("Google Pay ready? ", Boolean.valueOf(booleanValue)));
        isReadyState.setValue(Boolean.valueOf(booleanValue));
    }

    @Override // com.stripe.android.googlepaylauncher.GooglePayRepository
    public kotlinx.coroutines.flow.e<Boolean> isReady() {
        final u a11 = j0.a(null);
        IsReadyToPayRequest fromJson = IsReadyToPayRequest.fromJson(this.googlePayJsonFactory.createIsReadyToPayRequest(this.billingAddressParameters, Boolean.valueOf(this.existingPaymentMethodRequired), Boolean.valueOf(this.allowCreditCards)).toString());
        s.f(fromJson, "fromJson(\n            go…   ).toString()\n        )");
        getPaymentsClient().isReadyToPay(fromJson).addOnCompleteListener(new OnCompleteListener() { // from class: com.stripe.android.googlepaylauncher.a
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                DefaultGooglePayRepository.a(DefaultGooglePayRepository.this, a11, task);
            }
        });
        return kotlinx.coroutines.flow.g.p(a11);
    }

    public /* synthetic */ DefaultGooglePayRepository(Context context, GooglePayEnvironment googlePayEnvironment, GooglePayJsonFactory.BillingAddressParameters billingAddressParameters, boolean z11, boolean z12, Logger logger, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, googlePayEnvironment, billingAddressParameters, z11, z12, (i11 & 32) != 0 ? Logger.Companion.noop() : logger);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DefaultGooglePayRepository(android.content.Context r9, com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Config r10, com.stripe.android.core.Logger r11) {
        /*
            r8 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.s.g(r9, r0)
            java.lang.String r0 = "googlePayConfig"
            kotlin.jvm.internal.s.g(r10, r0)
            java.lang.String r0 = "logger"
            kotlin.jvm.internal.s.g(r11, r0)
            android.content.Context r2 = r9.getApplicationContext()
            java.lang.String r9 = "context.applicationContext"
            kotlin.jvm.internal.s.f(r2, r9)
            com.stripe.android.googlepaylauncher.GooglePayEnvironment r3 = r10.getEnvironment()
            com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$BillingAddressConfig r9 = r10.getBillingAddressConfig()
            com.stripe.android.GooglePayJsonFactory$BillingAddressParameters r4 = com.stripe.android.googlepaylauncher.GooglePayConfigConversionKtxKt.convert(r9)
            boolean r5 = r10.getExistingPaymentMethodRequired()
            boolean r6 = r10.getAllowCreditCards()
            r1 = r8
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.DefaultGooglePayRepository.<init>(android.content.Context, com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$Config, com.stripe.android.core.Logger):void");
    }
}