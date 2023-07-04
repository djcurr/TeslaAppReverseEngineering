package com.stripe.android.payments.core.authentication.threeds2;

import android.app.Application;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class Stripe3ds2TransactionActivity$viewModelFactory$1 extends u implements h00.a<Application> {
    final /* synthetic */ Stripe3ds2TransactionActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Stripe3ds2TransactionActivity$viewModelFactory$1(Stripe3ds2TransactionActivity stripe3ds2TransactionActivity) {
        super(0);
        this.this$0 = stripe3ds2TransactionActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final Application invoke() {
        Application application = this.this$0.getApplication();
        s.f(application, "application");
        return application;
    }
}