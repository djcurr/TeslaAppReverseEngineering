package com.stripe.android.paymentsheet;

import com.stripe.android.model.StripeIntent;
import v20.o0;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.paymentsheet.PaymentSheetViewModel$updatePaymentMethods$1", f = "PaymentSheetViewModel.kt", l = {271}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class PaymentSheetViewModel$updatePaymentMethods$1 extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {
    final /* synthetic */ StripeIntent $stripeIntent;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PaymentSheetViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetViewModel$updatePaymentMethods$1(PaymentSheetViewModel paymentSheetViewModel, StripeIntent stripeIntent, zz.d<? super PaymentSheetViewModel$updatePaymentMethods$1> dVar) {
        super(2, dVar);
        this.this$0 = paymentSheetViewModel;
        this.$stripeIntent = stripeIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        PaymentSheetViewModel$updatePaymentMethods$1 paymentSheetViewModel$updatePaymentMethods$1 = new PaymentSheetViewModel$updatePaymentMethods$1(this.this$0, this.$stripeIntent, dVar);
        paymentSheetViewModel$updatePaymentMethods$1.L$0 = obj;
        return paymentSheetViewModel$updatePaymentMethods$1;
    }

    @Override // h00.p
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object mo160invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
        return ((PaymentSheetViewModel$updatePaymentMethods$1) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac A[Catch: all -> 0x00b5, TryCatch #0 {all -> 0x00b5, blocks: (B:6:0x0010, B:22:0x0076, B:23:0x0081, B:25:0x0087, B:27:0x0094, B:29:0x00a6, B:31:0x00ac, B:32:0x00b0, B:11:0x0027, B:14:0x0032, B:15:0x0051, B:17:0x0057, B:18:0x0065), top: B:42:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = a00.b.d()
            int r1 = r9.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            if (r1 != r2) goto L14
            java.lang.Object r0 = r9.L$0
            com.stripe.android.paymentsheet.PaymentSheetViewModel r0 = (com.stripe.android.paymentsheet.PaymentSheetViewModel) r0
            vz.r.b(r10)     // Catch: java.lang.Throwable -> Lb5
            goto L76
        L14:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1c:
            vz.r.b(r10)
            java.lang.Object r10 = r9.L$0
            v20.o0 r10 = (v20.o0) r10
            com.stripe.android.paymentsheet.PaymentSheetViewModel r10 = r9.this$0
            com.stripe.android.model.StripeIntent r1 = r9.$stripeIntent
            vz.q$a r4 = vz.q.f54772b     // Catch: java.lang.Throwable -> Lb5
            com.stripe.android.paymentsheet.PaymentSheet$CustomerConfiguration r4 = r10.getCustomerConfig$paymentsheet_release()     // Catch: java.lang.Throwable -> Lb5
            if (r4 != 0) goto L32
            r1 = r3
            goto Laa
        L32:
            com.stripe.android.paymentsheet.PaymentSheet$Configuration r5 = r10.getConfig$paymentsheet_release()     // Catch: java.lang.Throwable -> Lb5
            com.stripe.android.ui.core.forms.resources.ResourceRepository r6 = r10.getResourceRepository()     // Catch: java.lang.Throwable -> Lb5
            com.stripe.android.ui.core.forms.resources.LpmRepository r6 = r6.getLpmRepository()     // Catch: java.lang.Throwable -> Lb5
            java.util.List r1 = com.stripe.android.paymentsheet.model.SupportedPaymentMethodKtxKt.getSupportedSavedCustomerPMs(r1, r5, r6)     // Catch: java.lang.Throwable -> Lb5
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb5
            r6 = 10
            int r6 = wz.u.t(r1, r6)     // Catch: java.lang.Throwable -> Lb5
            r5.<init>(r6)     // Catch: java.lang.Throwable -> Lb5
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lb5
        L51:
            boolean r6 = r1.hasNext()     // Catch: java.lang.Throwable -> Lb5
            if (r6 == 0) goto L65
            java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> Lb5
            com.stripe.android.ui.core.forms.resources.LpmRepository$SupportedPaymentMethod r6 = (com.stripe.android.ui.core.forms.resources.LpmRepository.SupportedPaymentMethod) r6     // Catch: java.lang.Throwable -> Lb5
            com.stripe.android.model.PaymentMethod$Type r6 = r6.getType()     // Catch: java.lang.Throwable -> Lb5
            r5.add(r6)     // Catch: java.lang.Throwable -> Lb5
            goto L51
        L65:
            com.stripe.android.paymentsheet.repositories.CustomerRepository r1 = com.stripe.android.paymentsheet.PaymentSheetViewModel.access$getCustomerRepository(r10)     // Catch: java.lang.Throwable -> Lb5
            r9.L$0 = r10     // Catch: java.lang.Throwable -> Lb5
            r9.label = r2     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r1 = r1.getPaymentMethods(r4, r5, r9)     // Catch: java.lang.Throwable -> Lb5
            if (r1 != r0) goto L74
            return r0
        L74:
            r0 = r10
            r10 = r1
        L76:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> Lb5
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb5
            r1.<init>()     // Catch: java.lang.Throwable -> Lb5
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> Lb5
        L81:
            boolean r4 = r10.hasNext()     // Catch: java.lang.Throwable -> Lb5
            if (r4 == 0) goto Laa
            java.lang.Object r4 = r10.next()     // Catch: java.lang.Throwable -> Lb5
            r5 = r4
            com.stripe.android.model.PaymentMethod r5 = (com.stripe.android.model.PaymentMethod) r5     // Catch: java.lang.Throwable -> Lb5
            boolean r6 = r5.hasExpectedDetails()     // Catch: java.lang.Throwable -> Lb5
            if (r6 != 0) goto La4
            com.stripe.android.core.Logger r7 = com.stripe.android.paymentsheet.PaymentSheetViewModel.access$getLogger(r0)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r8 = "Discarding invalid payment method "
            java.lang.String r5 = r5.f20932id     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r5 = kotlin.jvm.internal.s.p(r8, r5)     // Catch: java.lang.Throwable -> Lb5
            r8 = 2
            com.stripe.android.core.Logger.DefaultImpls.error$default(r7, r5, r3, r8, r3)     // Catch: java.lang.Throwable -> Lb5
        La4:
            if (r6 == 0) goto L81
            r1.add(r4)     // Catch: java.lang.Throwable -> Lb5
            goto L81
        Laa:
            if (r1 != 0) goto Lb0
            java.util.List r1 = wz.u.i()     // Catch: java.lang.Throwable -> Lb5
        Lb0:
            java.lang.Object r10 = vz.q.b(r1)     // Catch: java.lang.Throwable -> Lb5
            goto Lc0
        Lb5:
            r10 = move-exception
            vz.q$a r0 = vz.q.f54772b
            java.lang.Object r10 = vz.r.a(r10)
            java.lang.Object r10 = vz.q.b(r10)
        Lc0:
            com.stripe.android.paymentsheet.PaymentSheetViewModel r0 = r9.this$0
            com.stripe.android.model.StripeIntent r1 = r9.$stripeIntent
            java.lang.Throwable r4 = vz.q.e(r10)
            if (r4 != 0) goto Ldc
            java.util.List r10 = (java.util.List) r10
            androidx.lifecycle.l0 r4 = r0.getSavedStateHandle()
            java.lang.String r5 = "customer_payment_methods"
            r4.h(r5, r10)
            r0.setStripeIntent(r1)
            com.stripe.android.paymentsheet.PaymentSheetViewModel.resetViewState$default(r0, r3, r2, r3)
            goto Ldf
        Ldc:
            r0.onFatal(r4)
        Ldf:
            vz.b0 r10 = vz.b0.f54756a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.PaymentSheetViewModel$updatePaymentMethods$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}