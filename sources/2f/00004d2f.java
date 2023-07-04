package com.stripe.android.financialconnections;

import android.app.Application;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes2.dex */
final class FinancialConnectionsSheetActivity$viewModelFactory$1 extends u implements h00.a<Application> {
    final /* synthetic */ FinancialConnectionsSheetActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetActivity$viewModelFactory$1(FinancialConnectionsSheetActivity financialConnectionsSheetActivity) {
        super(0);
        this.this$0 = financialConnectionsSheetActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final Application invoke() {
        Application application = this.this$0.getApplication();
        s.f(application, "application");
        return application;
    }
}