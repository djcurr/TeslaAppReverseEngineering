package com.stripe.android.link;

import android.app.Application;
import androidx.activity.result.c;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.injection.Injectable;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.LinkActivityViewModel;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.confirmation.ConfirmationManager;
import com.stripe.android.link.injection.DaggerLinkViewModelFactoryComponent;
import com.stripe.android.link.injection.LinkViewModelFactoryComponent;
import com.stripe.android.link.injection.NonFallbackInjector;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.model.Navigator;
import com.stripe.android.link.ui.cardedit.CardEditViewModel;
import com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel;
import com.stripe.android.link.ui.signup.SignUpViewModel;
import com.stripe.android.link.ui.verification.VerificationViewModel;
import com.stripe.android.link.ui.wallet.WalletViewModel;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.StripeIntent;
import h00.a;
import java.util.Set;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.h0;
import vz.q;
import vz.r;

/* loaded from: classes6.dex */
public final class LinkActivityViewModel extends p0 {
    private final ConfirmationManager confirmationManager;
    public NonFallbackInjector injector;
    private final h0<LinkAccount> linkAccount;
    private final LinkAccountManager linkAccountManager;
    private final Navigator navigator;

    /* loaded from: classes6.dex */
    public static final class Factory implements s0.b, Injectable<FallbackInitializeParam> {
        private final a<Application> applicationSupplier;
        private NonFallbackInjector injector;
        private final a<LinkActivityContract.Args> starterArgsSupplier;
        public LinkActivityViewModel viewModel;

        /* loaded from: classes6.dex */
        public static final class FallbackInitializeParam {
            private final Application application;
            private final boolean enableLogging;
            private final Set<String> productUsage;
            private final String publishableKey;
            private final LinkActivityContract.Args starterArgs;
            private final String stripeAccountId;

            public FallbackInitializeParam(Application application, LinkActivityContract.Args starterArgs, boolean z11, String publishableKey, String str, Set<String> productUsage) {
                s.g(application, "application");
                s.g(starterArgs, "starterArgs");
                s.g(publishableKey, "publishableKey");
                s.g(productUsage, "productUsage");
                this.application = application;
                this.starterArgs = starterArgs;
                this.enableLogging = z11;
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
                this.productUsage = productUsage;
            }

            public static /* synthetic */ FallbackInitializeParam copy$default(FallbackInitializeParam fallbackInitializeParam, Application application, LinkActivityContract.Args args, boolean z11, String str, String str2, Set set, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    application = fallbackInitializeParam.application;
                }
                if ((i11 & 2) != 0) {
                    args = fallbackInitializeParam.starterArgs;
                }
                LinkActivityContract.Args args2 = args;
                if ((i11 & 4) != 0) {
                    z11 = fallbackInitializeParam.enableLogging;
                }
                boolean z12 = z11;
                if ((i11 & 8) != 0) {
                    str = fallbackInitializeParam.publishableKey;
                }
                String str3 = str;
                if ((i11 & 16) != 0) {
                    str2 = fallbackInitializeParam.stripeAccountId;
                }
                String str4 = str2;
                Set<String> set2 = set;
                if ((i11 & 32) != 0) {
                    set2 = fallbackInitializeParam.productUsage;
                }
                return fallbackInitializeParam.copy(application, args2, z12, str3, str4, set2);
            }

            public final Application component1() {
                return this.application;
            }

            public final LinkActivityContract.Args component2() {
                return this.starterArgs;
            }

            public final boolean component3() {
                return this.enableLogging;
            }

            public final String component4() {
                return this.publishableKey;
            }

            public final String component5() {
                return this.stripeAccountId;
            }

            public final Set<String> component6() {
                return this.productUsage;
            }

            public final FallbackInitializeParam copy(Application application, LinkActivityContract.Args starterArgs, boolean z11, String publishableKey, String str, Set<String> productUsage) {
                s.g(application, "application");
                s.g(starterArgs, "starterArgs");
                s.g(publishableKey, "publishableKey");
                s.g(productUsage, "productUsage");
                return new FallbackInitializeParam(application, starterArgs, z11, publishableKey, str, productUsage);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof FallbackInitializeParam) {
                    FallbackInitializeParam fallbackInitializeParam = (FallbackInitializeParam) obj;
                    return s.c(this.application, fallbackInitializeParam.application) && s.c(this.starterArgs, fallbackInitializeParam.starterArgs) && this.enableLogging == fallbackInitializeParam.enableLogging && s.c(this.publishableKey, fallbackInitializeParam.publishableKey) && s.c(this.stripeAccountId, fallbackInitializeParam.stripeAccountId) && s.c(this.productUsage, fallbackInitializeParam.productUsage);
                }
                return false;
            }

            public final Application getApplication() {
                return this.application;
            }

            public final boolean getEnableLogging() {
                return this.enableLogging;
            }

            public final Set<String> getProductUsage() {
                return this.productUsage;
            }

            public final String getPublishableKey() {
                return this.publishableKey;
            }

            public final LinkActivityContract.Args getStarterArgs() {
                return this.starterArgs;
            }

            public final String getStripeAccountId() {
                return this.stripeAccountId;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int hashCode = ((this.application.hashCode() * 31) + this.starterArgs.hashCode()) * 31;
                boolean z11 = this.enableLogging;
                int i11 = z11;
                if (z11 != 0) {
                    i11 = 1;
                }
                int hashCode2 = (((hashCode + i11) * 31) + this.publishableKey.hashCode()) * 31;
                String str = this.stripeAccountId;
                return ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.productUsage.hashCode();
            }

            public String toString() {
                return "FallbackInitializeParam(application=" + this.application + ", starterArgs=" + this.starterArgs + ", enableLogging=" + this.enableLogging + ", publishableKey=" + this.publishableKey + ", stripeAccountId=" + ((Object) this.stripeAccountId) + ", productUsage=" + this.productUsage + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Factory(a<? extends Application> applicationSupplier, a<LinkActivityContract.Args> starterArgsSupplier) {
            s.g(applicationSupplier, "applicationSupplier");
            s.g(starterArgsSupplier, "starterArgsSupplier");
            this.applicationSupplier = applicationSupplier;
            this.starterArgsSupplier = starterArgsSupplier;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
        @Override // androidx.lifecycle.s0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public <T extends androidx.lifecycle.p0> T create(java.lang.Class<T> r12) {
            /*
                r11 = this;
                java.lang.Class<com.stripe.android.link.LinkActivityViewModel$Factory> r0 = com.stripe.android.link.LinkActivityViewModel.Factory.class
                java.lang.String r1 = "modelClass"
                kotlin.jvm.internal.s.g(r12, r1)
                com.stripe.android.core.Logger$Companion r12 = com.stripe.android.core.Logger.Companion
                r1 = 0
                com.stripe.android.core.Logger r12 = r12.getInstance(r1)
                h00.a<com.stripe.android.link.LinkActivityContract$Args> r2 = r11.starterArgsSupplier
                java.lang.Object r2 = r2.invoke()
                r5 = r2
                com.stripe.android.link.LinkActivityContract$Args r5 = (com.stripe.android.link.LinkActivityContract.Args) r5
                com.stripe.android.link.LinkActivityContract$Args$InjectionParams r2 = r5.getInjectionParams$link_release()
                r10 = 0
                if (r2 != 0) goto L20
            L1e:
                r2 = r10
                goto L4f
            L20:
                java.lang.String r2 = r2.getInjectorKey()
                if (r2 != 0) goto L27
                goto L1e
            L27:
                com.stripe.android.core.injection.WeakMapInjectorRegistry r3 = com.stripe.android.core.injection.WeakMapInjectorRegistry.INSTANCE
                com.stripe.android.core.injection.Injector r2 = r3.retrieve(r2)
                if (r2 != 0) goto L30
                goto L1e
            L30:
                boolean r3 = r2 instanceof com.stripe.android.link.injection.NonFallbackInjector
                if (r3 == 0) goto L37
                com.stripe.android.link.injection.NonFallbackInjector r2 = (com.stripe.android.link.injection.NonFallbackInjector) r2
                goto L38
            L37:
                r2 = r10
            L38:
                if (r2 != 0) goto L3b
                goto L1e
            L3b:
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = "Injector available, injecting dependencies into "
                java.lang.String r3 = kotlin.jvm.internal.s.p(r4, r3)
                r12.info(r3)
                r11.injector = r2
                r2.inject(r11)
                vz.b0 r2 = vz.b0.f54756a
            L4f:
                if (r2 != 0) goto Ld2
                java.lang.String r0 = r0.getCanonicalName()
                java.lang.String r2 = "Injector unavailable, initializing dependencies of "
                java.lang.String r0 = kotlin.jvm.internal.s.p(r2, r0)
                r12.info(r0)
                com.stripe.android.link.LinkActivityViewModel$Factory$FallbackInitializeParam r12 = new com.stripe.android.link.LinkActivityViewModel$Factory$FallbackInitializeParam
                h00.a<android.app.Application> r0 = r11.applicationSupplier
                java.lang.Object r0 = r0.invoke()
                r4 = r0
                android.app.Application r4 = (android.app.Application) r4
                com.stripe.android.link.LinkActivityContract$Args$InjectionParams r0 = r5.getInjectionParams$link_release()
                if (r0 != 0) goto L70
                goto L74
            L70:
                boolean r1 = r0.getEnableLogging()
            L74:
                r6 = r1
                com.stripe.android.link.LinkActivityContract$Args$InjectionParams r0 = r5.getInjectionParams$link_release()
                if (r0 != 0) goto L7d
                r0 = r10
                goto L81
            L7d:
                java.lang.String r0 = r0.getPublishableKey()
            L81:
                if (r0 != 0) goto L95
                com.stripe.android.PaymentConfiguration$Companion r0 = com.stripe.android.PaymentConfiguration.Companion
                h00.a<android.app.Application> r1 = r11.applicationSupplier
                java.lang.Object r1 = r1.invoke()
                android.content.Context r1 = (android.content.Context) r1
                com.stripe.android.PaymentConfiguration r0 = r0.getInstance(r1)
                java.lang.String r0 = r0.getPublishableKey()
            L95:
                r7 = r0
                com.stripe.android.link.LinkActivityContract$Args$InjectionParams r0 = r5.getInjectionParams$link_release()
                if (r0 == 0) goto La5
                com.stripe.android.link.LinkActivityContract$Args$InjectionParams r0 = r5.getInjectionParams$link_release()
                java.lang.String r0 = r0.getStripeAccountId()
                goto Lb7
            La5:
                com.stripe.android.PaymentConfiguration$Companion r0 = com.stripe.android.PaymentConfiguration.Companion
                h00.a<android.app.Application> r1 = r11.applicationSupplier
                java.lang.Object r1 = r1.invoke()
                android.content.Context r1 = (android.content.Context) r1
                com.stripe.android.PaymentConfiguration r0 = r0.getInstance(r1)
                java.lang.String r0 = r0.getStripeAccountId()
            Lb7:
                r8 = r0
                com.stripe.android.link.LinkActivityContract$Args$InjectionParams r0 = r5.getInjectionParams$link_release()
                if (r0 != 0) goto Lc0
                r0 = r10
                goto Lc4
            Lc0:
                java.util.Set r0 = r0.getProductUsage()
            Lc4:
                if (r0 != 0) goto Lca
                java.util.Set r0 = wz.v0.d()
            Lca:
                r9 = r0
                r3 = r12
                r3.<init>(r4, r5, r6, r7, r8, r9)
                r11.fallbackInitialize(r12)
            Ld2:
                com.stripe.android.link.LinkActivityViewModel r12 = r11.getViewModel()
                com.stripe.android.link.injection.NonFallbackInjector r0 = r11.injector
                if (r0 != 0) goto Le0
                java.lang.String r0 = "injector"
                kotlin.jvm.internal.s.x(r0)
                goto Le1
            Le0:
                r10 = r0
            Le1:
                r12.setInjector(r10)
                com.stripe.android.link.LinkActivityViewModel r12 = r11.getViewModel()
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.LinkActivityViewModel.Factory.create(java.lang.Class):androidx.lifecycle.p0");
        }

        public final LinkActivityViewModel getViewModel() {
            LinkActivityViewModel linkActivityViewModel = this.viewModel;
            if (linkActivityViewModel != null) {
                return linkActivityViewModel;
            }
            s.x("viewModel");
            return null;
        }

        public final void setViewModel(LinkActivityViewModel linkActivityViewModel) {
            s.g(linkActivityViewModel, "<set-?>");
            this.viewModel = linkActivityViewModel;
        }

        @Override // com.stripe.android.core.injection.Injectable
        public void fallbackInitialize(FallbackInitializeParam arg) {
            s.g(arg, "arg");
            final LinkViewModelFactoryComponent build = DaggerLinkViewModelFactoryComponent.builder().context(arg.getApplication()).enableLogging(arg.getEnableLogging()).publishableKeyProvider(new LinkActivityViewModel$Factory$fallbackInitialize$viewModelComponent$1(arg)).stripeAccountIdProvider(new LinkActivityViewModel$Factory$fallbackInitialize$viewModelComponent$2(arg)).productUsage(arg.getProductUsage()).starterArgs(arg.getStarterArgs()).build();
            this.injector = new NonFallbackInjector() { // from class: com.stripe.android.link.LinkActivityViewModel$Factory$fallbackInitialize$1
                @Override // com.stripe.android.core.injection.Injector
                public void inject(Injectable<?> injectable) {
                    s.g(injectable, "injectable");
                    if (injectable instanceof LinkActivityViewModel.Factory) {
                        LinkViewModelFactoryComponent.this.inject((LinkActivityViewModel.Factory) injectable);
                    } else if (injectable instanceof SignUpViewModel.Factory) {
                        LinkViewModelFactoryComponent.this.inject((SignUpViewModel.Factory) injectable);
                    } else if (injectable instanceof VerificationViewModel.Factory) {
                        LinkViewModelFactoryComponent.this.inject((VerificationViewModel.Factory) injectable);
                    } else if (injectable instanceof WalletViewModel.Factory) {
                        LinkViewModelFactoryComponent.this.inject((WalletViewModel.Factory) injectable);
                    } else if (injectable instanceof PaymentMethodViewModel.Factory) {
                        LinkViewModelFactoryComponent.this.inject((PaymentMethodViewModel.Factory) injectable);
                    } else if (injectable instanceof CardEditViewModel.Factory) {
                        LinkViewModelFactoryComponent.this.inject((CardEditViewModel.Factory) injectable);
                    } else {
                        throw new IllegalArgumentException("invalid Injectable " + injectable + " requested in " + this);
                    }
                }
            };
            build.inject(this);
        }
    }

    public LinkActivityViewModel(LinkActivityContract.Args args, LinkAccountManager linkAccountManager, Navigator navigator, ConfirmationManager confirmationManager) {
        s.g(args, "args");
        s.g(linkAccountManager, "linkAccountManager");
        s.g(navigator, "navigator");
        s.g(confirmationManager, "confirmationManager");
        this.linkAccountManager = linkAccountManager;
        this.navigator = navigator;
        this.confirmationManager = confirmationManager;
        this.linkAccount = linkAccountManager.getLinkAccount();
        assertStripeIntentIsValid(args.getStripeIntent$link_release());
    }

    private final void assertStripeIntentIsValid(StripeIntent stripeIntent) {
        Object b11;
        try {
            q.a aVar = q.f54772b;
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        if (stripeIntent.getId() != null) {
            if (stripeIntent.getClientSecret() != null) {
                String str = null;
                if ((stripeIntent instanceof PaymentIntent ? (PaymentIntent) stripeIntent : null) != null) {
                    if (((PaymentIntent) stripeIntent).getAmount() != null) {
                        str = ((PaymentIntent) stripeIntent).getCurrency();
                        if (str == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                b11 = q.b(str);
                Throwable e11 = q.e(b11);
                if (e11 != null) {
                    getNavigator().dismiss(new LinkActivityResult.Failed(e11));
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final NonFallbackInjector getInjector() {
        NonFallbackInjector nonFallbackInjector = this.injector;
        if (nonFallbackInjector != null) {
            return nonFallbackInjector;
        }
        s.x("injector");
        return null;
    }

    public final h0<LinkAccount> getLinkAccount() {
        return this.linkAccount;
    }

    public final LinkAccountManager getLinkAccountManager() {
        return this.linkAccountManager;
    }

    public final Navigator getNavigator() {
        return this.navigator;
    }

    public final void setInjector(NonFallbackInjector nonFallbackInjector) {
        s.g(nonFallbackInjector, "<set-?>");
        this.injector = nonFallbackInjector;
    }

    public final void setupPaymentLauncher(c activityResultCaller) {
        s.g(activityResultCaller, "activityResultCaller");
        this.confirmationManager.setupPaymentLauncher(activityResultCaller);
    }

    public final void unregisterFromActivity() {
        this.confirmationManager.invalidatePaymentLauncher();
    }
}