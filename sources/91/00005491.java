package com.stripe.android.payments.paymentlauncher;

import androidx.lifecycle.l0;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.core.authentication.PaymentAuthenticator;
import com.stripe.android.payments.core.authentication.PaymentAuthenticatorRegistry;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import com.stripe.android.view.AuthActivityStarterHost;
import h00.p;
import javax.inject.Provider;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.s;
import org.spongycastle.crypto.tls.CipherSuite;
import v20.o0;
import vz.b0;
import vz.q;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$handleNextActionForStripeIntent$1", f = "PaymentLauncherViewModel.kt", l = {CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class PaymentLauncherViewModel$handleNextActionForStripeIntent$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ String $clientSecret;
    final /* synthetic */ AuthActivityStarterHost $host;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PaymentLauncherViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentLauncherViewModel$handleNextActionForStripeIntent$1(PaymentLauncherViewModel paymentLauncherViewModel, String str, AuthActivityStarterHost authActivityStarterHost, d<? super PaymentLauncherViewModel$handleNextActionForStripeIntent$1> dVar) {
        super(2, dVar);
        this.this$0 = paymentLauncherViewModel;
        this.$clientSecret = str;
        this.$host = authActivityStarterHost;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        PaymentLauncherViewModel$handleNextActionForStripeIntent$1 paymentLauncherViewModel$handleNextActionForStripeIntent$1 = new PaymentLauncherViewModel$handleNextActionForStripeIntent$1(this.this$0, this.$clientSecret, this.$host, dVar);
        paymentLauncherViewModel$handleNextActionForStripeIntent$1.L$0 = obj;
        return paymentLauncherViewModel$handleNextActionForStripeIntent$1;
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((PaymentLauncherViewModel$handleNextActionForStripeIntent$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        Object b11;
        PaymentAuthenticatorRegistry paymentAuthenticatorRegistry;
        Provider provider;
        l0 l0Var;
        StripeRepository stripeRepository;
        Provider provider2;
        d11 = a00.d.d();
        int i11 = this.label;
        try {
        } catch (Throwable th2) {
            q.a aVar = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        if (i11 == 0) {
            r.b(obj);
            o0 o0Var = (o0) this.L$0;
            l0Var = this.this$0.savedStateHandle;
            l0Var.h(PaymentLauncherViewModel.KEY_HAS_STARTED, kotlin.coroutines.jvm.internal.b.a(true));
            PaymentLauncherViewModel paymentLauncherViewModel = this.this$0;
            String str = this.$clientSecret;
            q.a aVar2 = q.f54772b;
            stripeRepository = paymentLauncherViewModel.stripeApiRepository;
            provider2 = paymentLauncherViewModel.apiRequestOptionsProvider;
            Object obj2 = provider2.get();
            s.f(obj2, "apiRequestOptionsProvider.get()");
            this.label = 1;
            obj = StripeRepository.retrieveStripeIntent$payments_core_release$default(stripeRepository, str, (ApiRequest.Options) obj2, null, this, 4, null);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return b0.f54756a;
        } else {
            r.b(obj);
        }
        if (obj != null) {
            b11 = q.b((StripeIntent) obj);
            PaymentLauncherViewModel paymentLauncherViewModel2 = this.this$0;
            AuthActivityStarterHost authActivityStarterHost = this.$host;
            Throwable e11 = q.e(b11);
            if (e11 == null) {
                StripeIntent stripeIntent = (StripeIntent) b11;
                paymentAuthenticatorRegistry = paymentLauncherViewModel2.authenticatorRegistry;
                PaymentAuthenticator authenticator = paymentAuthenticatorRegistry.getAuthenticator(stripeIntent);
                provider = paymentLauncherViewModel2.apiRequestOptionsProvider;
                Object obj3 = provider.get();
                s.f(obj3, "apiRequestOptionsProvider.get()");
                this.label = 2;
                if (authenticator.authenticate(authActivityStarterHost, stripeIntent, (ApiRequest.Options) obj3, this) == d11) {
                    return d11;
                }
            } else {
                paymentLauncherViewModel2.getPaymentLauncherResult$payments_core_release().postValue(new PaymentResult.Failed(e11));
            }
            return b0.f54756a;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}