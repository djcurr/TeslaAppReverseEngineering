package com.stripe.android.payments.bankaccount.ui;

import androidx.lifecycle.l0;
import com.stripe.android.core.Logger;
import com.stripe.android.payments.bankaccount.domain.AttachFinancialConnectionsSession;
import com.stripe.android.payments.bankaccount.domain.CreateFinancialConnectionsSession;
import com.stripe.android.payments.bankaccount.domain.RetrieveStripeIntent;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import javax.inject.Provider;
import kotlinx.coroutines.flow.t;
import tw.e;

/* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel_Factory  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1424CollectBankAccountViewModel_Factory implements e<CollectBankAccountViewModel> {
    private final Provider<t<CollectBankAccountViewEffect>> _viewEffectProvider;
    private final Provider<CollectBankAccountContract.Args> argsProvider;
    private final Provider<AttachFinancialConnectionsSession> attachFinancialConnectionsSessionProvider;
    private final Provider<CreateFinancialConnectionsSession> createFinancialConnectionsSessionProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<RetrieveStripeIntent> retrieveStripeIntentProvider;
    private final Provider<l0> savedStateHandleProvider;

    public C1424CollectBankAccountViewModel_Factory(Provider<CollectBankAccountContract.Args> provider, Provider<t<CollectBankAccountViewEffect>> provider2, Provider<CreateFinancialConnectionsSession> provider3, Provider<AttachFinancialConnectionsSession> provider4, Provider<RetrieveStripeIntent> provider5, Provider<l0> provider6, Provider<Logger> provider7) {
        this.argsProvider = provider;
        this._viewEffectProvider = provider2;
        this.createFinancialConnectionsSessionProvider = provider3;
        this.attachFinancialConnectionsSessionProvider = provider4;
        this.retrieveStripeIntentProvider = provider5;
        this.savedStateHandleProvider = provider6;
        this.loggerProvider = provider7;
    }

    public static C1424CollectBankAccountViewModel_Factory create(Provider<CollectBankAccountContract.Args> provider, Provider<t<CollectBankAccountViewEffect>> provider2, Provider<CreateFinancialConnectionsSession> provider3, Provider<AttachFinancialConnectionsSession> provider4, Provider<RetrieveStripeIntent> provider5, Provider<l0> provider6, Provider<Logger> provider7) {
        return new C1424CollectBankAccountViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static CollectBankAccountViewModel newInstance(CollectBankAccountContract.Args args, t<CollectBankAccountViewEffect> tVar, CreateFinancialConnectionsSession createFinancialConnectionsSession, AttachFinancialConnectionsSession attachFinancialConnectionsSession, RetrieveStripeIntent retrieveStripeIntent, l0 l0Var, Logger logger) {
        return new CollectBankAccountViewModel(args, tVar, createFinancialConnectionsSession, attachFinancialConnectionsSession, retrieveStripeIntent, l0Var, logger);
    }

    @Override // javax.inject.Provider
    public CollectBankAccountViewModel get() {
        return newInstance(this.argsProvider.get(), this._viewEffectProvider.get(), this.createFinancialConnectionsSessionProvider.get(), this.attachFinancialConnectionsSessionProvider.get(), this.retrieveStripeIntentProvider.get(), this.savedStateHandleProvider.get(), this.loggerProvider.get());
    }
}