package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.model.ClientSecret;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$configureInternal$1", f = "DefaultFlowController.kt", l = {195, 201, 204}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class DefaultFlowController$configureInternal$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ PaymentSheet.FlowController.ConfigCallback $callback;
    final /* synthetic */ ClientSecret $clientSecret;
    final /* synthetic */ PaymentSheet.Configuration $configuration;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DefaultFlowController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlowController$configureInternal$1(DefaultFlowController defaultFlowController, ClientSecret clientSecret, PaymentSheet.Configuration configuration, PaymentSheet.FlowController.ConfigCallback configCallback, d<? super DefaultFlowController$configureInternal$1> dVar) {
        super(2, dVar);
        this.this$0 = defaultFlowController;
        this.$clientSecret = clientSecret;
        this.$configuration = configuration;
        this.$callback = configCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        DefaultFlowController$configureInternal$1 defaultFlowController$configureInternal$1 = new DefaultFlowController$configureInternal$1(this.this$0, this.$clientSecret, this.$configuration, this.$callback, dVar);
        defaultFlowController$configureInternal$1.L$0 = obj;
        return defaultFlowController$configureInternal$1;
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((DefaultFlowController$configureInternal$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = a00.b.d()
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L32
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            vz.r.b(r9)
            goto L86
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            java.lang.Object r1 = r8.L$1
            com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer$InitResult r1 = (com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer.InitResult) r1
            java.lang.Object r3 = r8.L$0
            v20.o0 r3 = (v20.o0) r3
            vz.r.b(r9)
            goto L68
        L2a:
            java.lang.Object r1 = r8.L$0
            v20.o0 r1 = (v20.o0) r1
            vz.r.b(r9)
            goto L51
        L32:
            vz.r.b(r9)
            java.lang.Object r9 = r8.L$0
            v20.o0 r9 = (v20.o0) r9
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController r1 = r8.this$0
            com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer r1 = com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController.access$getFlowControllerInitializer$p(r1)
            com.stripe.android.paymentsheet.model.ClientSecret r5 = r8.$clientSecret
            com.stripe.android.paymentsheet.PaymentSheet$Configuration r6 = r8.$configuration
            r8.L$0 = r9
            r8.label = r4
            java.lang.Object r1 = r1.init(r5, r6, r8)
            if (r1 != r0) goto L4e
            return r0
        L4e:
            r7 = r1
            r1 = r9
            r9 = r7
        L51:
            com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer$InitResult r9 = (com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer.InitResult) r9
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController r4 = r8.this$0
            com.stripe.android.ui.core.forms.resources.ResourceRepository r4 = com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController.access$getResourceRepository$p(r4)
            r8.L$0 = r1
            r8.L$1 = r9
            r8.label = r3
            java.lang.Object r3 = r4.waitUntilLoaded(r8)
            if (r3 != r0) goto L66
            return r0
        L66:
            r3 = r1
            r1 = r9
        L68:
            boolean r9 = v20.p0.f(r3)
            r3 = 0
            if (r9 == 0) goto L80
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController r9 = r8.this$0
            com.stripe.android.paymentsheet.PaymentSheet$FlowController$ConfigCallback r4 = r8.$callback
            r8.L$0 = r3
            r8.L$1 = r3
            r8.label = r2
            java.lang.Object r9 = com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController.access$dispatchResult(r9, r1, r4, r8)
            if (r9 != r0) goto L86
            return r0
        L80:
            com.stripe.android.paymentsheet.PaymentSheet$FlowController$ConfigCallback r9 = r8.$callback
            r0 = 0
            r9.onConfigured(r0, r3)
        L86:
            vz.b0 r9 = vz.b0.f54756a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$configureInternal$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}