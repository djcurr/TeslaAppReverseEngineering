package com.stripe.android.payments.core.authentication;

import androidx.activity.result.b;
import androidx.activity.result.c;
import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.StripeIntentKtxKt;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.core.authentication.PaymentAuthenticator;
import com.stripe.android.view.AuthActivityStarterHost;
import h00.l;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.b0;
import vz.v;
import wz.r0;
import zz.d;

/* loaded from: classes6.dex */
public final class UnsupportedAuthenticator implements PaymentAuthenticator<StripeIntent> {
    private static final Map<Class<? extends StripeIntent.NextActionData>, String> ACTION_DEPENDENCY_MAP;
    public static final Companion Companion = new Companion(null);
    private final l<AuthActivityStarterHost, PaymentRelayStarter> paymentRelayStarterFactory;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Map<Class<? extends StripeIntent.NextActionData>, String> getACTION_DEPENDENCY_MAP() {
            return UnsupportedAuthenticator.ACTION_DEPENDENCY_MAP;
        }
    }

    static {
        Map<Class<? extends StripeIntent.NextActionData>, String> f11;
        f11 = r0.f(v.a(StripeIntent.NextActionData.WeChatPayRedirect.class, "com.stripe:stripe-wechatpay:20.5.0"));
        ACTION_DEPENDENCY_MAP = f11;
    }

    public UnsupportedAuthenticator(l<AuthActivityStarterHost, PaymentRelayStarter> paymentRelayStarterFactory) {
        s.g(paymentRelayStarterFactory, "paymentRelayStarterFactory");
        this.paymentRelayStarterFactory = paymentRelayStarterFactory;
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentAuthenticator
    public /* bridge */ /* synthetic */ Object authenticate(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, d dVar) {
        return authenticate2(authActivityStarterHost, stripeIntent, options, (d<b0>) dVar);
    }

    @Override // com.stripe.android.payments.core.ActivityResultLauncherHost
    public void onLauncherInvalidated() {
        PaymentAuthenticator.DefaultImpls.onLauncherInvalidated(this);
    }

    @Override // com.stripe.android.payments.core.ActivityResultLauncherHost
    public void onNewActivityResultCaller(c cVar, b<PaymentFlowResult.Unvalidated> bVar) {
        PaymentAuthenticator.DefaultImpls.onNewActivityResultCaller(this, cVar, bVar);
    }

    /* renamed from: authenticate  reason: avoid collision after fix types in other method */
    public Object authenticate2(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, d<b0> dVar) {
        StripeException create;
        StripeIntent.NextActionData nextActionData = stripeIntent.getNextActionData();
        if (nextActionData == null) {
            create = null;
        } else {
            Class<?> cls = nextActionData.getClass();
            StripeException.Companion companion = StripeException.Companion;
            create = companion.create(new IllegalArgumentException(((Object) cls.getSimpleName()) + " type is not supported, add " + ((Object) ACTION_DEPENDENCY_MAP.get(cls)) + " in build.gradle to support it"));
        }
        if (create == null) {
            create = StripeException.Companion.create(new IllegalArgumentException("stripeIntent.nextActionData is null"));
        }
        this.paymentRelayStarterFactory.invoke(authActivityStarterHost).start(new PaymentRelayStarter.Args.ErrorArgs(create, StripeIntentKtxKt.getRequestCode(stripeIntent)));
        return b0.f54756a;
    }
}