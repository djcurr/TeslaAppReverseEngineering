package com.stripe.android.payments.bankaccount.ui;

import android.app.Application;
import h00.a;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class CollectBankAccountActivity$viewModelFactory$1 extends u implements a<Application> {
    final /* synthetic */ CollectBankAccountActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectBankAccountActivity$viewModelFactory$1(CollectBankAccountActivity collectBankAccountActivity) {
        super(0);
        this.this$0 = collectBankAccountActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final Application invoke() {
        Application application = this.this$0.getApplication();
        s.f(application, "application");
        return application;
    }
}