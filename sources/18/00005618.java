package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer;
import com.stripe.android.paymentsheet.model.ClientSecret;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import zz.d;

@f(c = "com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$init$2", f = "DefaultFlowControllerInitializer.kt", l = {43, 45, 51}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class DefaultFlowControllerInitializer$init$2 extends l implements p<o0, d<? super FlowControllerInitializer.InitResult>, Object> {
    final /* synthetic */ ClientSecret $clientSecret;
    final /* synthetic */ PaymentSheet.Configuration $paymentSheetConfiguration;
    boolean Z$0;
    int label;
    final /* synthetic */ DefaultFlowControllerInitializer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlowControllerInitializer$init$2(DefaultFlowControllerInitializer defaultFlowControllerInitializer, PaymentSheet.Configuration configuration, ClientSecret clientSecret, d<? super DefaultFlowControllerInitializer$init$2> dVar) {
        super(2, dVar);
        this.this$0 = defaultFlowControllerInitializer;
        this.$paymentSheetConfiguration = configuration;
        this.$clientSecret = clientSecret;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new DefaultFlowControllerInitializer$init$2(this.this$0, this.$paymentSheetConfiguration, this.$clientSecret, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super FlowControllerInitializer.InitResult> dVar) {
        return ((DefaultFlowControllerInitializer$init$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = a00.b.d()
            int r1 = r11.label
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L28
            if (r1 == r5) goto L24
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            vz.r.b(r12)
            goto L71
        L16:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1e:
            boolean r1 = r11.Z$0
            vz.r.b(r12)
            goto L5d
        L24:
            vz.r.b(r12)
            goto L38
        L28:
            vz.r.b(r12)
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer r12 = r11.this$0
            com.stripe.android.paymentsheet.PaymentSheet$Configuration r1 = r11.$paymentSheetConfiguration
            r11.label = r5
            java.lang.Object r12 = com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer.access$isGooglePayReady(r12, r1, r11)
            if (r12 != r0) goto L38
            return r0
        L38:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r1 = r12.booleanValue()
            com.stripe.android.paymentsheet.PaymentSheet$Configuration r12 = r11.$paymentSheetConfiguration
            if (r12 != 0) goto L43
            goto L60
        L43:
            com.stripe.android.paymentsheet.PaymentSheet$CustomerConfiguration r7 = r12.getCustomer()
            if (r7 != 0) goto L4a
            goto L60
        L4a:
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer r5 = r11.this$0
            com.stripe.android.paymentsheet.model.ClientSecret r6 = r11.$clientSecret
            com.stripe.android.paymentsheet.PaymentSheet$Configuration r8 = r11.$paymentSheetConfiguration
            r11.Z$0 = r1
            r11.label = r4
            r9 = r1
            r10 = r11
            java.lang.Object r12 = com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer.access$createWithCustomer(r5, r6, r7, r8, r9, r10)
            if (r12 != r0) goto L5d
            return r0
        L5d:
            r2 = r12
            com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer$InitResult r2 = (com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer.InitResult) r2
        L60:
            if (r2 != 0) goto L74
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer r12 = r11.this$0
            com.stripe.android.paymentsheet.model.ClientSecret r2 = r11.$clientSecret
            com.stripe.android.paymentsheet.PaymentSheet$Configuration r4 = r11.$paymentSheetConfiguration
            r11.label = r3
            java.lang.Object r12 = com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer.access$createWithoutCustomer(r12, r2, r4, r1, r11)
            if (r12 != r0) goto L71
            return r0
        L71:
            r2 = r12
            com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer$InitResult r2 = (com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer.InitResult) r2
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$init$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}