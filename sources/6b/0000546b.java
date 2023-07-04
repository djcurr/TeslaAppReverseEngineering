package com.stripe.android.payments.financialconnections;

import androidx.appcompat.app.d;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import h00.a;
import h00.l;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class FinancialConnectionsPaymentsProxy$Companion$create$2 extends u implements a<DefaultFinancialConnectionsPaymentsProxy> {
    final /* synthetic */ d $activity;
    final /* synthetic */ l<FinancialConnectionsSheetResult, b0> $onComplete;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FinancialConnectionsPaymentsProxy$Companion$create$2(d dVar, l<? super FinancialConnectionsSheetResult, b0> lVar) {
        super(0);
        this.$activity = dVar;
        this.$onComplete = lVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final DefaultFinancialConnectionsPaymentsProxy invoke() {
        return new DefaultFinancialConnectionsPaymentsProxy(FinancialConnectionsSheet.Companion.create(this.$activity, new FinancialConnectionsPaymentsProxy$sam$com_stripe_android_financialconnections_FinancialConnectionsSheetResultCallback$0(this.$onComplete)));
    }
}