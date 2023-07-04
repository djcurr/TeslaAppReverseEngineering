package com.stripe.android.paymentsheet.viewmodels;

import com.stripe.android.link.LinkPaymentDetails;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.model.PaymentMethodCreateParams;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.q;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$createLinkPaymentDetails$1", f = "BaseSheetViewModel.kt", l = {504}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class BaseSheetViewModel$createLinkPaymentDetails$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ PaymentMethodCreateParams $paymentMethodCreateParams;
    Object L$0;
    int label;
    final /* synthetic */ BaseSheetViewModel<TransitionTargetType> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSheetViewModel$createLinkPaymentDetails$1(BaseSheetViewModel<TransitionTargetType> baseSheetViewModel, PaymentMethodCreateParams paymentMethodCreateParams, d<? super BaseSheetViewModel$createLinkPaymentDetails$1> dVar) {
        super(2, dVar);
        this.this$0 = baseSheetViewModel;
        this.$paymentMethodCreateParams = paymentMethodCreateParams;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new BaseSheetViewModel$createLinkPaymentDetails$1(this.this$0, this.$paymentMethodCreateParams, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((BaseSheetViewModel$createLinkPaymentDetails$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        BaseSheetViewModel baseSheetViewModel;
        Object obj2;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            BaseSheetViewModel baseSheetViewModel2 = this.this$0;
            LinkPaymentLauncher linkLauncher = baseSheetViewModel2.getLinkLauncher();
            PaymentMethodCreateParams paymentMethodCreateParams = this.$paymentMethodCreateParams;
            this.L$0 = baseSheetViewModel2;
            this.label = 1;
            Object m155attachNewCardToAccountgIAlus = linkLauncher.m155attachNewCardToAccountgIAlus(paymentMethodCreateParams, this);
            if (m155attachNewCardToAccountgIAlus == d11) {
                return d11;
            }
            baseSheetViewModel = baseSheetViewModel2;
            obj2 = m155attachNewCardToAccountgIAlus;
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            baseSheetViewModel = (BaseSheetViewModel) this.L$0;
            r.b(obj);
            obj2 = ((q) obj).j();
        }
        if (q.g(obj2)) {
            obj2 = null;
        }
        baseSheetViewModel.onLinkPaymentDetailsCollected((LinkPaymentDetails) obj2);
        return b0.f54756a;
    }
}