package com.stripe.android.payments.bankaccount.ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.d;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;
import androidx.lifecycle.w;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewEffect;
import com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel;
import com.stripe.android.payments.financialconnections.FinancialConnectionsPaymentsProxy;
import com.stripe.android.payments.financialconnections.IsFinancialConnectionsAvailable;
import h00.a;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import vz.k;
import vz.m;

/* loaded from: classes6.dex */
public final class CollectBankAccountActivity extends d {
    private FinancialConnectionsPaymentsProxy financialConnectionsPaymentsProxy;
    private final k starterArgs$delegate;
    private final k viewModel$delegate;
    private s0.b viewModelFactory;

    public CollectBankAccountActivity() {
        k a11;
        a11 = m.a(new CollectBankAccountActivity$starterArgs$2(this));
        this.starterArgs$delegate = a11;
        CollectBankAccountActivity$viewModelFactory$1 collectBankAccountActivity$viewModelFactory$1 = new CollectBankAccountActivity$viewModelFactory$1(this);
        CollectBankAccountActivity$viewModelFactory$2 collectBankAccountActivity$viewModelFactory$2 = new CollectBankAccountActivity$viewModelFactory$2(this);
        Intent intent = getIntent();
        this.viewModelFactory = new CollectBankAccountViewModel.Factory(collectBankAccountActivity$viewModelFactory$1, collectBankAccountActivity$viewModelFactory$2, this, intent == null ? null : intent.getExtras());
        this.viewModel$delegate = new r0(m0.b(CollectBankAccountViewModel.class), new CollectBankAccountActivity$special$$inlined$viewModels$2(this), new CollectBankAccountActivity$viewModel$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CollectBankAccountContract.Args getStarterArgs() {
        return (CollectBankAccountContract.Args) this.starterArgs$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CollectBankAccountViewModel getViewModel() {
        return (CollectBankAccountViewModel) this.viewModel$delegate.getValue();
    }

    private final void initConnectionsPaymentsProxy() {
        this.financialConnectionsPaymentsProxy = FinancialConnectionsPaymentsProxy.Companion.create$default(FinancialConnectionsPaymentsProxy.Companion, this, new CollectBankAccountActivity$initConnectionsPaymentsProxy$1(getViewModel()), (a) null, (IsFinancialConnectionsAvailable) null, 12, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launch(CollectBankAccountViewEffect.OpenConnectionsFlow openConnectionsFlow) {
        FinancialConnectionsPaymentsProxy financialConnectionsPaymentsProxy = this.financialConnectionsPaymentsProxy;
        if (financialConnectionsPaymentsProxy == null) {
            s.x("financialConnectionsPaymentsProxy");
            financialConnectionsPaymentsProxy = null;
        }
        financialConnectionsPaymentsProxy.present(openConnectionsFlow.getFinancialConnectionsSessionSecret(), openConnectionsFlow.getPublishableKey());
    }

    public final s0.b getViewModelFactory$payments_core_release() {
        return this.viewModelFactory;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initConnectionsPaymentsProxy();
        w.a(this).e(new CollectBankAccountActivity$onCreate$1(this, null));
    }

    public final void setViewModelFactory$payments_core_release(s0.b bVar) {
        s.g(bVar, "<set-?>");
        this.viewModelFactory = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launch(CollectBankAccountViewEffect.FinishWithResult finishWithResult) {
        setResult(-1, new Intent().putExtras(new CollectBankAccountContract.Result(finishWithResult.getResult()).toBundle()));
        finish();
    }
}