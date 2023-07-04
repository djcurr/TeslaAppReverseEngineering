package com.stripe.android.link.ui.wallet;

import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import com.stripe.android.core.Logger;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.LinkPaymentDetails;
import com.stripe.android.link.LinkScreen;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.confirmation.ConfirmStripeIntentParamsFactory;
import com.stripe.android.link.confirmation.ConfirmationManager;
import com.stripe.android.link.injection.NonFallbackInjectable;
import com.stripe.android.link.injection.NonFallbackInjector;
import com.stripe.android.link.injection.SignedInViewModelSubcomponent;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.model.Navigator;
import com.stripe.android.link.repositories.LinkRepository;
import com.stripe.android.link.ui.ErrorMessage;
import com.stripe.android.link.ui.ErrorMessageKt;
import com.stripe.android.link.ui.cardedit.CardEditViewModel;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.StripeIntent;
import h00.p;
import java.util.List;
import javax.inject.Provider;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.u;
import v20.k;
import v20.o0;
import vz.b0;
import vz.r;
import wz.w;
import zz.d;

/* loaded from: classes6.dex */
public final class WalletViewModel extends p0 {
    private final u<ErrorMessage> _errorMessage;
    private final u<Boolean> _isProcessing;
    private final u<List<ConsumerPaymentDetails.PaymentDetails>> _paymentDetails;
    private final LinkActivityContract.Args args;
    private final ConfirmationManager confirmationManager;
    private final h0<ErrorMessage> errorMessage;
    private final h0<Boolean> isProcessing;
    private final LinkAccount linkAccount;
    private final LinkAccountManager linkAccountManager;
    private final LinkRepository linkRepository;
    private final Logger logger;
    private final Navigator navigator;
    private final h0<List<ConsumerPaymentDetails.PaymentDetails>> paymentDetails;
    private final StripeIntent stripeIntent;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "com.stripe.android.link.ui.wallet.WalletViewModel$1", f = "WalletViewModel.kt", l = {57}, m = "invokeSuspend")
    /* renamed from: com.stripe.android.link.ui.wallet.WalletViewModel$1 */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends l implements p<o0, d<? super b0>, Object> {
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            WalletViewModel.this = r1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<b0> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, d<? super b0> dVar) {
            return ((AnonymousClass1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.label;
            if (i11 == 0) {
                r.b(obj);
                e resultFlow = WalletViewModel.this.navigator.getResultFlow(CardEditViewModel.Result.KEY);
                if (resultFlow != null) {
                    final WalletViewModel walletViewModel = WalletViewModel.this;
                    kotlinx.coroutines.flow.f<CardEditViewModel.Result> fVar = new kotlinx.coroutines.flow.f<CardEditViewModel.Result>() { // from class: com.stripe.android.link.ui.wallet.WalletViewModel.1.1
                        @Override // kotlinx.coroutines.flow.f
                        public /* bridge */ /* synthetic */ Object emit(CardEditViewModel.Result result, d dVar) {
                            return emit2(result, (d<? super b0>) dVar);
                        }

                        /* renamed from: emit */
                        public final Object emit2(CardEditViewModel.Result result, d<? super b0> dVar) {
                            if (s.c(result, CardEditViewModel.Result.Success.INSTANCE)) {
                                walletViewModel.loadPaymentDetails();
                            } else if (!s.c(result, CardEditViewModel.Result.Cancelled.INSTANCE) && (result instanceof CardEditViewModel.Result.Failure)) {
                                walletViewModel.onError(((CardEditViewModel.Result.Failure) result).getError());
                            }
                            return b0.f54756a;
                        }
                    };
                    this.label = 1;
                    if (resultFlow.collect(fVar, this) == d11) {
                        return d11;
                    }
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                r.b(obj);
            }
            return b0.f54756a;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Factory implements s0.b, NonFallbackInjectable {
        private final NonFallbackInjector injector;
        private final LinkAccount linkAccount;
        public Provider<SignedInViewModelSubcomponent.Builder> subComponentBuilderProvider;

        public Factory(LinkAccount linkAccount, NonFallbackInjector injector) {
            s.g(linkAccount, "linkAccount");
            s.g(injector, "injector");
            this.linkAccount = linkAccount;
            this.injector = injector;
        }

        @Override // androidx.lifecycle.s0.b
        public <T extends p0> T create(Class<T> modelClass) {
            s.g(modelClass, "modelClass");
            this.injector.inject(this);
            return getSubComponentBuilderProvider().get().linkAccount(this.linkAccount).build().getWalletViewModel();
        }

        @Override // com.stripe.android.core.injection.Injectable
        public Void fallbackInitialize(b0 b0Var) {
            return NonFallbackInjectable.DefaultImpls.fallbackInitialize(this, b0Var);
        }

        public final Provider<SignedInViewModelSubcomponent.Builder> getSubComponentBuilderProvider() {
            Provider<SignedInViewModelSubcomponent.Builder> provider = this.subComponentBuilderProvider;
            if (provider != null) {
                return provider;
            }
            s.x("subComponentBuilderProvider");
            return null;
        }

        public final void setSubComponentBuilderProvider(Provider<SignedInViewModelSubcomponent.Builder> provider) {
            s.g(provider, "<set-?>");
            this.subComponentBuilderProvider = provider;
        }
    }

    public WalletViewModel(LinkActivityContract.Args args, LinkAccount linkAccount, LinkRepository linkRepository, LinkAccountManager linkAccountManager, Navigator navigator, ConfirmationManager confirmationManager, Logger logger) {
        List i11;
        s.g(args, "args");
        s.g(linkAccount, "linkAccount");
        s.g(linkRepository, "linkRepository");
        s.g(linkAccountManager, "linkAccountManager");
        s.g(navigator, "navigator");
        s.g(confirmationManager, "confirmationManager");
        s.g(logger, "logger");
        this.args = args;
        this.linkAccount = linkAccount;
        this.linkRepository = linkRepository;
        this.linkAccountManager = linkAccountManager;
        this.navigator = navigator;
        this.confirmationManager = confirmationManager;
        this.logger = logger;
        this.stripeIntent = args.getStripeIntent$link_release();
        i11 = w.i();
        u<List<ConsumerPaymentDetails.PaymentDetails>> a11 = j0.a(i11);
        this._paymentDetails = a11;
        this.paymentDetails = a11;
        u<Boolean> a12 = j0.a(Boolean.FALSE);
        this._isProcessing = a12;
        this.isProcessing = a12;
        u<ErrorMessage> a13 = j0.a(null);
        this._errorMessage = a13;
        this.errorMessage = a13;
        loadPaymentDetails();
        k.d(q0.a(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public static /* synthetic */ void addNewPaymentMethod$default(WalletViewModel walletViewModel, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        walletViewModel.addNewPaymentMethod(z11);
    }

    private final void clearError() {
        this._errorMessage.setValue(null);
    }

    public final void loadPaymentDetails() {
        this._isProcessing.setValue(Boolean.TRUE);
        k.d(q0.a(this), null, null, new WalletViewModel$loadPaymentDetails$1(this, null), 3, null);
    }

    public final void onError(Throwable th2) {
        ErrorMessage errorMessage = ErrorMessageKt.getErrorMessage(th2);
        this.logger.error("Error: ", th2);
        onError(errorMessage);
    }

    public final void addNewPaymentMethod(boolean z11) {
        this.navigator.navigateTo(LinkScreen.PaymentMethod.INSTANCE, z11);
    }

    public final void deletePaymentMethod(ConsumerPaymentDetails.PaymentDetails paymentDetails) {
        s.g(paymentDetails, "paymentDetails");
        this._isProcessing.setValue(Boolean.TRUE);
        clearError();
        k.d(q0.a(this), null, null, new WalletViewModel$deletePaymentMethod$1(this, paymentDetails, null), 3, null);
    }

    public final void editPaymentMethod(ConsumerPaymentDetails.PaymentDetails paymentDetails) {
        s.g(paymentDetails, "paymentDetails");
        clearError();
        Navigator.navigateTo$default(this.navigator, new LinkScreen.CardEdit(paymentDetails.getId()), false, 2, null);
    }

    public final LinkActivityContract.Args getArgs() {
        return this.args;
    }

    public final h0<ErrorMessage> getErrorMessage() {
        return this.errorMessage;
    }

    public final LinkAccount getLinkAccount() {
        return this.linkAccount;
    }

    public final h0<List<ConsumerPaymentDetails.PaymentDetails>> getPaymentDetails() {
        return this.paymentDetails;
    }

    public final h0<Boolean> isProcessing() {
        return this.isProcessing;
    }

    public final void onSelectedPaymentDetails(ConsumerPaymentDetails.PaymentDetails selectedPaymentDetails) {
        s.g(selectedPaymentDetails, "selectedPaymentDetails");
        clearError();
        this._isProcessing.setValue(Boolean.TRUE);
        if (this.args.getCompletePayment$link_release()) {
            ConfirmStripeIntentParamsFactory<ConfirmStripeIntentParams> createFactory = ConfirmStripeIntentParamsFactory.Companion.createFactory(this.stripeIntent);
            this.confirmationManager.confirmStripeIntent(createFactory.createConfirmStripeIntentParams(ConfirmStripeIntentParamsFactory.createPaymentMethodCreateParams$default(createFactory, this.linkAccount.getClientSecret(), selectedPaymentDetails, null, 4, null)), new WalletViewModel$onSelectedPaymentDetails$1(this));
            return;
        }
        this.navigator.dismiss(new LinkActivityResult.Success.Selected(new LinkPaymentDetails(selectedPaymentDetails, ConfirmStripeIntentParamsFactory.createPaymentMethodCreateParams$default(ConfirmStripeIntentParamsFactory.Companion.createFactory(this.stripeIntent), this.linkAccount.getClientSecret(), selectedPaymentDetails, null, 4, null))));
    }

    public final void payAnotherWay() {
        Navigator.dismiss$default(this.navigator, null, 1, null);
        this.linkAccountManager.logout();
    }

    public final void onError(ErrorMessage errorMessage) {
        this._isProcessing.setValue(Boolean.FALSE);
        this._errorMessage.setValue(errorMessage);
    }
}