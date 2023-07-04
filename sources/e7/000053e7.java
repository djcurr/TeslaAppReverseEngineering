package com.stripe.android.payments.core.authentication;

import android.content.Context;
import androidx.activity.result.b;
import androidx.activity.result.c;
import androidx.activity.result.d;
import com.stripe.android.PaymentRelayContract;
import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.injection.Injectable;
import com.stripe.android.core.injection.Injector;
import com.stripe.android.core.injection.WeakMapInjectorRegistry;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.model.Source;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModelFactory;
import com.stripe.android.payments.core.injection.AuthenticationComponent;
import com.stripe.android.payments.core.injection.DaggerAuthenticationComponent;
import com.stripe.android.payments.core.injection.IntentAuthenticatorMap;
import h00.a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import wz.w;
import wz.x;
import wz.x0;
import zz.g;

/* loaded from: classes6.dex */
public final class DefaultPaymentAuthenticatorRegistry implements PaymentAuthenticatorRegistry, Injector {
    public static final Companion Companion = new Companion(null);
    private final List<PaymentAuthenticator<? extends StripeModel>> allAuthenticators;
    public AuthenticationComponent authenticationComponent;
    private final NoOpIntentAuthenticator noOpIntentAuthenticator;
    private final Map<Class<? extends StripeIntent.NextActionData>, PaymentAuthenticator<StripeIntent>> paymentAuthenticatorMap;
    private d<PaymentBrowserAuthContract.Args> paymentBrowserAuthLauncher;
    private d<PaymentRelayStarter.Args> paymentRelayLauncher;
    private final SourceAuthenticator sourceAuthenticator;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PaymentAuthenticatorRegistry createInstance(Context context, StripeRepository stripeRepository, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean z11, g workContext, g uiContext, Map<String, String> threeDs1IntentReturnUrlMap, a<String> publishableKeyProvider, Set<String> productUsage, boolean z12) {
            s.g(context, "context");
            s.g(stripeRepository, "stripeRepository");
            s.g(analyticsRequestExecutor, "analyticsRequestExecutor");
            s.g(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
            s.g(workContext, "workContext");
            s.g(uiContext, "uiContext");
            s.g(threeDs1IntentReturnUrlMap, "threeDs1IntentReturnUrlMap");
            s.g(publishableKeyProvider, "publishableKeyProvider");
            s.g(productUsage, "productUsage");
            WeakMapInjectorRegistry weakMapInjectorRegistry = WeakMapInjectorRegistry.INSTANCE;
            String o11 = m0.b(PaymentAuthenticatorRegistry.class).o();
            if (o11 != null) {
                String nextKey = weakMapInjectorRegistry.nextKey(o11);
                AuthenticationComponent build = DaggerAuthenticationComponent.builder().context(context).stripeRepository(stripeRepository).analyticsRequestExecutor(analyticsRequestExecutor).analyticsRequestFactory(paymentAnalyticsRequestFactory).enableLogging(z11).workContext(workContext).uiContext(uiContext).threeDs1IntentReturnUrlMap(threeDs1IntentReturnUrlMap).injectorKey(nextKey).publishableKeyProvider(publishableKeyProvider).productUsage(productUsage).isInstantApp(z12).build();
                DefaultPaymentAuthenticatorRegistry registry = build.getRegistry();
                registry.setAuthenticationComponent(build);
                weakMapInjectorRegistry.register(registry, nextKey);
                return registry;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public DefaultPaymentAuthenticatorRegistry(NoOpIntentAuthenticator noOpIntentAuthenticator, SourceAuthenticator sourceAuthenticator, @IntentAuthenticatorMap Map<Class<? extends StripeIntent.NextActionData>, PaymentAuthenticator<StripeIntent>> paymentAuthenticatorMap) {
        List l11;
        Set i11;
        List<PaymentAuthenticator<? extends StripeModel>> v11;
        s.g(noOpIntentAuthenticator, "noOpIntentAuthenticator");
        s.g(sourceAuthenticator, "sourceAuthenticator");
        s.g(paymentAuthenticatorMap, "paymentAuthenticatorMap");
        this.noOpIntentAuthenticator = noOpIntentAuthenticator;
        this.sourceAuthenticator = sourceAuthenticator;
        this.paymentAuthenticatorMap = paymentAuthenticatorMap;
        l11 = w.l(noOpIntentAuthenticator, sourceAuthenticator);
        i11 = x0.i(l11, paymentAuthenticatorMap.values());
        v11 = x.v(i11);
        this.allAuthenticators = v11;
    }

    public static /* synthetic */ void getAllAuthenticators$payments_core_release$annotations() {
    }

    public final List<PaymentAuthenticator<? extends StripeModel>> getAllAuthenticators$payments_core_release() {
        return this.allAuthenticators;
    }

    public final AuthenticationComponent getAuthenticationComponent() {
        AuthenticationComponent authenticationComponent = this.authenticationComponent;
        if (authenticationComponent != null) {
            return authenticationComponent;
        }
        s.x("authenticationComponent");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // com.stripe.android.payments.core.authentication.PaymentAuthenticatorRegistry
    public <Authenticatable> PaymentAuthenticator<Authenticatable> getAuthenticator(Authenticatable authenticatable) {
        PaymentAuthenticator<Authenticatable> paymentAuthenticator;
        if (authenticatable instanceof StripeIntent) {
            StripeIntent stripeIntent = (StripeIntent) authenticatable;
            if (!stripeIntent.requiresAction()) {
                return this.noOpIntentAuthenticator;
            }
            StripeIntent.NextActionData nextActionData = stripeIntent.getNextActionData();
            if (nextActionData == null) {
                paymentAuthenticator = null;
            } else {
                PaymentAuthenticator<StripeIntent> paymentAuthenticator2 = this.paymentAuthenticatorMap.get(nextActionData.getClass());
                if (paymentAuthenticator2 == null) {
                    paymentAuthenticator2 = this.noOpIntentAuthenticator;
                }
                paymentAuthenticator = (PaymentAuthenticator) paymentAuthenticator2;
            }
            return paymentAuthenticator == null ? this.noOpIntentAuthenticator : paymentAuthenticator;
        } else if (authenticatable instanceof Source) {
            return this.sourceAuthenticator;
        } else {
            throw new IllegalStateException(s.p("No suitable PaymentAuthenticator for ", authenticatable).toString());
        }
    }

    public final d<PaymentBrowserAuthContract.Args> getPaymentBrowserAuthLauncher$payments_core_release() {
        return this.paymentBrowserAuthLauncher;
    }

    public final d<PaymentRelayStarter.Args> getPaymentRelayLauncher$payments_core_release() {
        return this.paymentRelayLauncher;
    }

    @Override // com.stripe.android.core.injection.Injector
    public void inject(Injectable<?> injectable) {
        s.g(injectable, "injectable");
        if (injectable instanceof Stripe3ds2TransactionViewModelFactory) {
            getAuthenticationComponent().inject((Stripe3ds2TransactionViewModelFactory) injectable);
            return;
        }
        throw new IllegalArgumentException("invalid Injectable " + injectable + " requested in " + this);
    }

    @Override // com.stripe.android.payments.core.ActivityResultLauncherHost
    public void onLauncherInvalidated() {
        Iterator<T> it2 = this.allAuthenticators.iterator();
        while (it2.hasNext()) {
            ((PaymentAuthenticator) it2.next()).onLauncherInvalidated();
        }
        d<PaymentRelayStarter.Args> dVar = this.paymentRelayLauncher;
        if (dVar != null) {
            dVar.d();
        }
        d<PaymentBrowserAuthContract.Args> dVar2 = this.paymentBrowserAuthLauncher;
        if (dVar2 != null) {
            dVar2.d();
        }
        this.paymentRelayLauncher = null;
        this.paymentBrowserAuthLauncher = null;
    }

    @Override // com.stripe.android.payments.core.ActivityResultLauncherHost
    public void onNewActivityResultCaller(c activityResultCaller, b<PaymentFlowResult.Unvalidated> activityResultCallback) {
        s.g(activityResultCaller, "activityResultCaller");
        s.g(activityResultCallback, "activityResultCallback");
        Iterator<T> it2 = this.allAuthenticators.iterator();
        while (it2.hasNext()) {
            ((PaymentAuthenticator) it2.next()).onNewActivityResultCaller(activityResultCaller, activityResultCallback);
        }
        this.paymentRelayLauncher = activityResultCaller.registerForActivityResult(new PaymentRelayContract(), activityResultCallback);
        this.paymentBrowserAuthLauncher = activityResultCaller.registerForActivityResult(new PaymentBrowserAuthContract(), activityResultCallback);
    }

    public final void setAuthenticationComponent(AuthenticationComponent authenticationComponent) {
        s.g(authenticationComponent, "<set-?>");
        this.authenticationComponent = authenticationComponent;
    }

    public final void setPaymentBrowserAuthLauncher$payments_core_release(d<PaymentBrowserAuthContract.Args> dVar) {
        this.paymentBrowserAuthLauncher = dVar;
    }

    public final void setPaymentRelayLauncher$payments_core_release(d<PaymentRelayStarter.Args> dVar) {
        this.paymentRelayLauncher = dVar;
    }
}