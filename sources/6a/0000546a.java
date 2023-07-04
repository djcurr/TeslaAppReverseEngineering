package com.stripe.android.payments.financialconnections;

import androidx.fragment.app.Fragment;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import h00.a;
import h00.l;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes6.dex */
final class FinancialConnectionsPaymentsProxy$Companion$create$1 extends u implements a<DefaultFinancialConnectionsPaymentsProxy> {
    final /* synthetic */ Fragment $fragment;
    final /* synthetic */ l<FinancialConnectionsSheetResult, b0> $onComplete;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FinancialConnectionsPaymentsProxy$Companion$create$1(Fragment fragment, l<? super FinancialConnectionsSheetResult, b0> lVar) {
        super(0);
        this.$fragment = fragment;
        this.$onComplete = lVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final DefaultFinancialConnectionsPaymentsProxy invoke() {
        return new DefaultFinancialConnectionsPaymentsProxy(FinancialConnectionsSheet.Companion.create(this.$fragment, new FinancialConnectionsPaymentsProxy$sam$com_stripe_android_financialconnections_FinancialConnectionsSheetResultCallback$0(this.$onComplete)));
    }
}