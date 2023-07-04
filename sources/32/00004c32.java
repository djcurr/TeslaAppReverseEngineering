package com.stripe.android;

import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.view.AuthActivityStarterHost;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.r;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.StripePaymentController$handleError$2", f = "StripePaymentController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class StripePaymentController$handleError$2 extends l implements p<o0, zz.d<? super b0>, Object> {
    final /* synthetic */ AuthActivityStarterHost $host;
    final /* synthetic */ int $requestCode;
    final /* synthetic */ Throwable $throwable;
    int label;
    final /* synthetic */ StripePaymentController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripePaymentController$handleError$2(StripePaymentController stripePaymentController, AuthActivityStarterHost authActivityStarterHost, Throwable th2, int i11, zz.d<? super StripePaymentController$handleError$2> dVar) {
        super(2, dVar);
        this.this$0 = stripePaymentController;
        this.$host = authActivityStarterHost;
        this.$throwable = th2;
        this.$requestCode = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
        return new StripePaymentController$handleError$2(this.this$0, this.$host, this.$throwable, this.$requestCode, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
        return ((StripePaymentController$handleError$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        h00.l lVar;
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            lVar = this.this$0.paymentRelayStarterFactory;
            ((PaymentRelayStarter) lVar.invoke(this.$host)).start(new PaymentRelayStarter.Args.ErrorArgs(StripeException.Companion.create(this.$throwable), this.$requestCode));
            return b0.f54756a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}