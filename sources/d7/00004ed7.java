package com.stripe.android.link;

import android.content.Context;
import androidx.activity.result.d;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.injection.Injectable;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.core.injection.UIContext;
import com.stripe.android.core.injection.WeakMapInjectorRegistry;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.LinkActivityViewModel;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.injection.DaggerLinkPaymentLauncherComponent;
import com.stripe.android.link.injection.LinkPaymentLauncherComponent;
import com.stripe.android.link.injection.NonFallbackInjectable;
import com.stripe.android.link.injection.NonFallbackInjector;
import com.stripe.android.link.model.AccountStatus;
import com.stripe.android.link.ui.cardedit.CardEditViewModel;
import com.stripe.android.link.ui.inline.InlineSignupViewModel;
import com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel;
import com.stripe.android.link.ui.signup.SignUpViewModel;
import com.stripe.android.link.ui.verification.VerificationViewModel;
import com.stripe.android.link.ui.wallet.WalletViewModel;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.ui.core.forms.resources.ResourceRepository;
import h00.a;
import java.util.Set;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.h0;
import vz.b0;
import zz.g;

/* loaded from: classes6.dex */
public final class LinkPaymentLauncher implements NonFallbackInjectable {
    public static final int $stable = 8;
    public h0<? extends AccountStatus> accountStatus;
    private LinkActivityContract.Args args;
    private final String customerEmail;
    private final boolean enableLogging;
    private NonFallbackInjector injector;
    private final String injectorKey;
    private final LinkPaymentLauncherComponent.Builder launcherComponentBuilder;
    public LinkAccountManager linkAccountManager;
    private final String merchantName;
    private final Set<String> productUsage;
    private final a<String> publishableKeyProvider;
    private final a<String> stripeAccountIdProvider;

    public LinkPaymentLauncher(String merchantName, String str, Context context, Set<String> productUsage, a<String> publishableKeyProvider, a<String> stripeAccountIdProvider, boolean z11, @IOContext g ioContext, @UIContext g uiContext, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, AnalyticsRequestExecutor analyticsRequestExecutor, StripeRepository stripeRepository, ResourceRepository resourceRepository) {
        s.g(merchantName, "merchantName");
        s.g(context, "context");
        s.g(productUsage, "productUsage");
        s.g(publishableKeyProvider, "publishableKeyProvider");
        s.g(stripeAccountIdProvider, "stripeAccountIdProvider");
        s.g(ioContext, "ioContext");
        s.g(uiContext, "uiContext");
        s.g(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        s.g(analyticsRequestExecutor, "analyticsRequestExecutor");
        s.g(stripeRepository, "stripeRepository");
        s.g(resourceRepository, "resourceRepository");
        this.merchantName = merchantName;
        this.customerEmail = str;
        this.productUsage = productUsage;
        this.publishableKeyProvider = publishableKeyProvider;
        this.stripeAccountIdProvider = stripeAccountIdProvider;
        this.enableLogging = z11;
        this.launcherComponentBuilder = DaggerLinkPaymentLauncherComponent.builder().merchantName(merchantName).customerEmail(str).context(context).ioContext(ioContext).uiContext(uiContext).analyticsRequestFactory(paymentAnalyticsRequestFactory).analyticsRequestExecutor(analyticsRequestExecutor).stripeRepository(stripeRepository).resourceRepository(resourceRepository).enableLogging(z11).publishableKeyProvider(publishableKeyProvider).stripeAccountIdProvider(stripeAccountIdProvider).productUsage(productUsage);
        WeakMapInjectorRegistry weakMapInjectorRegistry = WeakMapInjectorRegistry.INSTANCE;
        String o11 = m0.b(LinkPaymentLauncher.class).o();
        if (o11 != null) {
            this.injectorKey = weakMapInjectorRegistry.nextKey(o11);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @InjectorKey
    private static /* synthetic */ void getInjectorKey$annotations() {
    }

    private final LinkPaymentLauncherComponent setupDependencies(StripeIntent stripeIntent, boolean z11) {
        LinkActivityContract.Args args = new LinkActivityContract.Args(stripeIntent, z11, this.merchantName, this.customerEmail, new LinkActivityContract.Args.InjectionParams(this.injectorKey, this.productUsage, this.enableLogging, this.publishableKeyProvider.invoke(), this.stripeAccountIdProvider.invoke()));
        final LinkPaymentLauncherComponent build = this.launcherComponentBuilder.starterArgs(args).build();
        NonFallbackInjector nonFallbackInjector = new NonFallbackInjector() { // from class: com.stripe.android.link.LinkPaymentLauncher$setupDependencies$injector$1
            @Override // com.stripe.android.core.injection.Injector
            public void inject(Injectable<?> injectable) {
                s.g(injectable, "injectable");
                if (injectable instanceof LinkActivityViewModel.Factory) {
                    LinkPaymentLauncherComponent.this.inject((LinkActivityViewModel.Factory) injectable);
                } else if (injectable instanceof SignUpViewModel.Factory) {
                    LinkPaymentLauncherComponent.this.inject((SignUpViewModel.Factory) injectable);
                } else if (injectable instanceof VerificationViewModel.Factory) {
                    LinkPaymentLauncherComponent.this.inject((VerificationViewModel.Factory) injectable);
                } else if (injectable instanceof WalletViewModel.Factory) {
                    LinkPaymentLauncherComponent.this.inject((WalletViewModel.Factory) injectable);
                } else if (injectable instanceof InlineSignupViewModel.Factory) {
                    LinkPaymentLauncherComponent.this.inject((InlineSignupViewModel.Factory) injectable);
                } else if (injectable instanceof PaymentMethodViewModel.Factory) {
                    LinkPaymentLauncherComponent.this.inject((PaymentMethodViewModel.Factory) injectable);
                } else if (injectable instanceof CardEditViewModel.Factory) {
                    LinkPaymentLauncherComponent.this.inject((CardEditViewModel.Factory) injectable);
                } else {
                    throw new IllegalArgumentException("invalid Injectable " + injectable + " requested in " + this);
                }
            }
        };
        WeakMapInjectorRegistry.INSTANCE.register(nonFallbackInjector, this.injectorKey);
        this.args = args;
        this.injector = nonFallbackInjector;
        return build;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* renamed from: attachNewCardToAccount-gIAlu-s  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m155attachNewCardToAccountgIAlus(com.stripe.android.model.PaymentMethodCreateParams r5, zz.d<? super vz.q<com.stripe.android.link.LinkPaymentDetails>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.stripe.android.link.LinkPaymentLauncher$attachNewCardToAccount$1
            if (r0 == 0) goto L13
            r0 = r6
            com.stripe.android.link.LinkPaymentLauncher$attachNewCardToAccount$1 r0 = (com.stripe.android.link.LinkPaymentLauncher$attachNewCardToAccount$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.link.LinkPaymentLauncher$attachNewCardToAccount$1 r0 = new com.stripe.android.link.LinkPaymentLauncher$attachNewCardToAccount$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            vz.r.b(r6)
            vz.q r6 = (vz.q) r6
            java.lang.Object r5 = r6.j()
            goto L4c
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            vz.r.b(r6)
            com.stripe.android.link.account.LinkAccountManager r6 = r4.getLinkAccountManager$link_release()
            com.stripe.android.link.ui.paymentmethod.SupportedPaymentMethod$Card r2 = new com.stripe.android.link.ui.paymentmethod.SupportedPaymentMethod$Card
            r2.<init>()
            r0.label = r3
            java.lang.Object r5 = r6.m159createPaymentDetails0E7RQCE(r2, r5, r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.LinkPaymentLauncher.m155attachNewCardToAccountgIAlus(com.stripe.android.model.PaymentMethodCreateParams, zz.d):java.lang.Object");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.stripe.android.core.injection.Injectable
    public Void fallbackInitialize(b0 b0Var) {
        return NonFallbackInjectable.DefaultImpls.fallbackInitialize(this, b0Var);
    }

    public final h0<AccountStatus> getAccountStatus() {
        h0 h0Var = this.accountStatus;
        if (h0Var != null) {
            return h0Var;
        }
        s.x("accountStatus");
        return null;
    }

    public final NonFallbackInjector getInjector$link_release() {
        return this.injector;
    }

    public final LinkAccountManager getLinkAccountManager$link_release() {
        LinkAccountManager linkAccountManager = this.linkAccountManager;
        if (linkAccountManager != null) {
            return linkAccountManager;
        }
        s.x("linkAccountManager");
        return null;
    }

    public final void present(d<LinkActivityContract.Args> activityResultLauncher) {
        s.g(activityResultLauncher, "activityResultLauncher");
        LinkActivityContract.Args args = this.args;
        if (args != null) {
            activityResultLauncher.b(args);
            return;
        }
        throw new IllegalArgumentException("Must call setup before presenting".toString());
    }

    public final void setAccountStatus(h0<? extends AccountStatus> h0Var) {
        s.g(h0Var, "<set-?>");
        this.accountStatus = h0Var;
    }

    public final void setInjector$link_release(NonFallbackInjector nonFallbackInjector) {
        this.injector = nonFallbackInjector;
    }

    public final void setLinkAccountManager$link_release(LinkAccountManager linkAccountManager) {
        s.g(linkAccountManager, "<set-?>");
        this.linkAccountManager = linkAccountManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object setup(com.stripe.android.model.StripeIntent r5, boolean r6, v20.o0 r7, zz.d<? super com.stripe.android.link.model.AccountStatus> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.stripe.android.link.LinkPaymentLauncher$setup$1
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.link.LinkPaymentLauncher$setup$1 r0 = (com.stripe.android.link.LinkPaymentLauncher$setup$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.link.LinkPaymentLauncher$setup$1 r0 = new com.stripe.android.link.LinkPaymentLauncher$setup$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r5 = r0.L$2
            com.stripe.android.link.LinkPaymentLauncher r5 = (com.stripe.android.link.LinkPaymentLauncher) r5
            java.lang.Object r6 = r0.L$1
            com.stripe.android.link.injection.LinkPaymentLauncherComponent r6 = (com.stripe.android.link.injection.LinkPaymentLauncherComponent) r6
            java.lang.Object r7 = r0.L$0
            com.stripe.android.link.LinkPaymentLauncher r7 = (com.stripe.android.link.LinkPaymentLauncher) r7
            vz.r.b(r8)
            goto L5d
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3d:
            vz.r.b(r8)
            com.stripe.android.link.injection.LinkPaymentLauncherComponent r6 = r4.setupDependencies(r5, r6)
            com.stripe.android.link.account.LinkAccountManager r5 = r6.getLinkAccountManager()
            kotlinx.coroutines.flow.e r5 = r5.getAccountStatus()
            r0.L$0 = r4
            r0.L$1 = r6
            r0.L$2 = r4
            r0.label = r3
            java.lang.Object r8 = kotlinx.coroutines.flow.g.D(r5, r7, r0)
            if (r8 != r1) goto L5b
            return r1
        L5b:
            r5 = r4
            r7 = r5
        L5d:
            kotlinx.coroutines.flow.h0 r8 = (kotlinx.coroutines.flow.h0) r8
            r5.setAccountStatus(r8)
            com.stripe.android.link.account.LinkAccountManager r5 = r6.getLinkAccountManager()
            r7.setLinkAccountManager$link_release(r5)
            kotlinx.coroutines.flow.h0 r5 = r7.getAccountStatus()
            java.lang.Object r5 = r5.getValue()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.LinkPaymentLauncher.setup(com.stripe.android.model.StripeIntent, boolean, v20.o0, zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* renamed from: signInWithUserInput-gIAlu-s  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m156signInWithUserInputgIAlus(com.stripe.android.link.ui.inline.UserInput r5, zz.d<? super vz.q<java.lang.Boolean>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.stripe.android.link.LinkPaymentLauncher$signInWithUserInput$1
            if (r0 == 0) goto L13
            r0 = r6
            com.stripe.android.link.LinkPaymentLauncher$signInWithUserInput$1 r0 = (com.stripe.android.link.LinkPaymentLauncher$signInWithUserInput$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.link.LinkPaymentLauncher$signInWithUserInput$1 r0 = new com.stripe.android.link.LinkPaymentLauncher$signInWithUserInput$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            vz.r.b(r6)
            vz.q r6 = (vz.q) r6
            java.lang.Object r5 = r6.j()
            goto L47
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            vz.r.b(r6)
            com.stripe.android.link.account.LinkAccountManager r6 = r4.getLinkAccountManager$link_release()
            r0.label = r3
            java.lang.Object r5 = r6.m161signInWithUserInputgIAlus(r5, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            boolean r6 = vz.q.h(r5)
            if (r6 == 0) goto L55
            vz.q$a r6 = vz.q.f54772b
            com.stripe.android.link.model.LinkAccount r5 = (com.stripe.android.link.model.LinkAccount) r5
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r3)
        L55:
            java.lang.Object r5 = vz.q.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.LinkPaymentLauncher.m156signInWithUserInputgIAlus(com.stripe.android.link.ui.inline.UserInput, zz.d):java.lang.Object");
    }
}