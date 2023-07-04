package com.stripe.android.payments.core.authentication;

import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.model.Source;
import com.stripe.android.view.AuthActivityStarterHost;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.payments.core.authentication.SourceAuthenticator$bypassAuth$2", f = "SourceAuthenticator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class SourceAuthenticator$bypassAuth$2 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ AuthActivityStarterHost $host;
    final /* synthetic */ Source $source;
    final /* synthetic */ String $stripeAccountId;
    int label;
    final /* synthetic */ SourceAuthenticator this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourceAuthenticator$bypassAuth$2(SourceAuthenticator sourceAuthenticator, AuthActivityStarterHost authActivityStarterHost, Source source, String str, d<SourceAuthenticator$bypassAuth$2> dVar) {
        super(2, dVar);
        this.this$0 = sourceAuthenticator;
        this.$host = authActivityStarterHost;
        this.$source = source;
        this.$stripeAccountId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new SourceAuthenticator$bypassAuth$2(this.this$0, this.$host, this.$source, this.$stripeAccountId, dVar);
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, d<? super b0> dVar) {
        return invoke2(o0Var, (d<b0>) dVar);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(o0 o0Var, d<b0> dVar) {
        return ((SourceAuthenticator$bypassAuth$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        h00.l lVar;
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            lVar = this.this$0.paymentRelayStarterFactory;
            ((PaymentRelayStarter) lVar.invoke(this.$host)).start(new PaymentRelayStarter.Args.SourceArgs(this.$source, this.$stripeAccountId));
            return b0.f54756a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}