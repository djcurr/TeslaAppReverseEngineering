package com.stripe.android.paymentsheet.flowcontroller;

import com.google.android.gms.wallet.WalletConstants;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import com.stripe.android.paymentsheet.PaymentSheetResult;
import com.stripe.android.paymentsheet.PaymentSheetResultCallback;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.i;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;
import zz.g;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$onPaymentResult$1", f = "DefaultFlowController.kt", l = {WalletConstants.ERROR_CODE_INVALID_TRANSACTION}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class DefaultFlowController$onPaymentResult$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ PaymentResult $paymentResult;
    Object L$0;
    int label;
    final /* synthetic */ DefaultFlowController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$onPaymentResult$1$1", f = "DefaultFlowController.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$onPaymentResult$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends l implements p<o0, d<? super PaymentSheetResult>, Object> {
        final /* synthetic */ PaymentResult $paymentResult;
        int label;
        final /* synthetic */ DefaultFlowController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DefaultFlowController defaultFlowController, PaymentResult paymentResult, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = defaultFlowController;
            this.$paymentResult = paymentResult;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<b0> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$paymentResult, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, d<? super PaymentSheetResult> dVar) {
            return ((AnonymousClass1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            PaymentSheetResult createPaymentSheetResult;
            a00.d.d();
            if (this.label == 0) {
                r.b(obj);
                createPaymentSheetResult = this.this$0.createPaymentSheetResult(this.$paymentResult);
                return createPaymentSheetResult;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlowController$onPaymentResult$1(DefaultFlowController defaultFlowController, PaymentResult paymentResult, d<? super DefaultFlowController$onPaymentResult$1> dVar) {
        super(2, dVar);
        this.this$0 = defaultFlowController;
        this.$paymentResult = paymentResult;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new DefaultFlowController$onPaymentResult$1(this.this$0, this.$paymentResult, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((DefaultFlowController$onPaymentResult$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        PaymentSheetResultCallback paymentSheetResultCallback;
        g gVar;
        PaymentSheetResultCallback paymentSheetResultCallback2;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            paymentSheetResultCallback = this.this$0.paymentResultCallback;
            gVar = this.this$0.uiContext;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$paymentResult, null);
            this.L$0 = paymentSheetResultCallback;
            this.label = 1;
            Object g11 = i.g(gVar, anonymousClass1, this);
            if (g11 == d11) {
                return d11;
            }
            paymentSheetResultCallback2 = paymentSheetResultCallback;
            obj = g11;
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            paymentSheetResultCallback2 = (PaymentSheetResultCallback) this.L$0;
            r.b(obj);
        }
        paymentSheetResultCallback2.onPaymentSheetResult((PaymentSheetResult) obj);
        return b0.f54756a;
    }
}