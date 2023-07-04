package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$dispatchResult$2", f = "DefaultFlowController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class DefaultFlowController$dispatchResult$2 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ PaymentSheet.FlowController.ConfigCallback $callback;
    final /* synthetic */ FlowControllerInitializer.InitResult $result;
    int label;
    final /* synthetic */ DefaultFlowController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlowController$dispatchResult$2(FlowControllerInitializer.InitResult initResult, DefaultFlowController defaultFlowController, PaymentSheet.FlowController.ConfigCallback configCallback, d<? super DefaultFlowController$dispatchResult$2> dVar) {
        super(2, dVar);
        this.$result = initResult;
        this.this$0 = defaultFlowController;
        this.$callback = configCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new DefaultFlowController$dispatchResult$2(this.$result, this.this$0, this.$callback, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((DefaultFlowController$dispatchResult$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            FlowControllerInitializer.InitResult initResult = this.$result;
            if (initResult instanceof FlowControllerInitializer.InitResult.Success) {
                this.this$0.onInitSuccess(((FlowControllerInitializer.InitResult.Success) initResult).getInitData(), this.$callback);
            } else if (initResult instanceof FlowControllerInitializer.InitResult.Failure) {
                this.$callback.onConfigured(false, ((FlowControllerInitializer.InitResult.Failure) initResult).getThrowable());
            }
            return b0.f54756a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}