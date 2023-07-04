package com.stripe.android.googlepaylauncher;

import androidx.lifecycle.b0;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.networking.StripeRepository;
import h00.p;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.q;
import vz.r;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.googlepaylauncher.StripeGooglePayViewModel$createPaymentMethod$1", f = "StripeGooglePayViewModel.kt", l = {74}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class StripeGooglePayViewModel$createPaymentMethod$1 extends l implements p<b0<q<? extends PaymentMethod>>, zz.d<? super vz.b0>, Object> {
    final /* synthetic */ PaymentMethodCreateParams $params;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StripeGooglePayViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.googlepaylauncher.StripeGooglePayViewModel$createPaymentMethod$1$1", f = "StripeGooglePayViewModel.kt", l = {78, 75}, m = "invokeSuspend")
    /* renamed from: com.stripe.android.googlepaylauncher.StripeGooglePayViewModel$createPaymentMethod$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends l implements p<o0, zz.d<? super vz.b0>, Object> {
        final /* synthetic */ b0<q<PaymentMethod>> $$this$liveData;
        final /* synthetic */ PaymentMethodCreateParams $params;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ StripeGooglePayViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(b0<q<PaymentMethod>> b0Var, StripeGooglePayViewModel stripeGooglePayViewModel, PaymentMethodCreateParams paymentMethodCreateParams, zz.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$$this$liveData = b0Var;
            this.this$0 = stripeGooglePayViewModel;
            this.$params = paymentMethodCreateParams;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$liveData, this.this$0, this.$params, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((AnonymousClass1) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.b0] */
        /* JADX WARN: Type inference failed for: r1v8 */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            Object b11;
            b0<q<PaymentMethod>> b0Var;
            StripeRepository stripeRepository;
            String str;
            String str2;
            b0<q<PaymentMethod>> b0Var2;
            d11 = a00.d.d();
            int i11 = this.label;
            try {
            } catch (Throwable th2) {
                q.a aVar = q.f54772b;
                b11 = q.b(r.a(th2));
                b0Var = i11;
            }
            if (i11 == 0) {
                r.b(obj);
                o0 o0Var = (o0) this.L$0;
                b0<q<PaymentMethod>> b0Var3 = this.$$this$liveData;
                StripeGooglePayViewModel stripeGooglePayViewModel = this.this$0;
                PaymentMethodCreateParams paymentMethodCreateParams = this.$params;
                q.a aVar2 = q.f54772b;
                stripeRepository = stripeGooglePayViewModel.stripeRepository;
                str = stripeGooglePayViewModel.publishableKey;
                str2 = stripeGooglePayViewModel.stripeAccountId;
                ApiRequest.Options options = new ApiRequest.Options(str, str2, null, 4, null);
                this.L$0 = b0Var3;
                this.label = 1;
                obj = stripeRepository.createPaymentMethod(paymentMethodCreateParams, options, this);
                b0Var2 = b0Var3;
                if (obj == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return vz.b0.f54756a;
            } else {
                b0<q<PaymentMethod>> b0Var4 = (b0) this.L$0;
                r.b(obj);
                b0Var2 = b0Var4;
            }
            if (obj != null) {
                b11 = q.b((PaymentMethod) obj);
                b0Var = b0Var2;
                q a11 = q.a(b11);
                this.L$0 = null;
                this.label = 2;
                if (b0Var.emit(a11, this) == d11) {
                    return d11;
                }
                return vz.b0.f54756a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeGooglePayViewModel$createPaymentMethod$1(StripeGooglePayViewModel stripeGooglePayViewModel, PaymentMethodCreateParams paymentMethodCreateParams, zz.d<? super StripeGooglePayViewModel$createPaymentMethod$1> dVar) {
        super(2, dVar);
        this.this$0 = stripeGooglePayViewModel;
        this.$params = paymentMethodCreateParams;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        StripeGooglePayViewModel$createPaymentMethod$1 stripeGooglePayViewModel$createPaymentMethod$1 = new StripeGooglePayViewModel$createPaymentMethod$1(this.this$0, this.$params, dVar);
        stripeGooglePayViewModel$createPaymentMethod$1.L$0 = obj;
        return stripeGooglePayViewModel$createPaymentMethod$1;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(b0<q<PaymentMethod>> b0Var, zz.d<? super vz.b0> dVar) {
        return ((StripeGooglePayViewModel$createPaymentMethod$1) create(b0Var, dVar)).invokeSuspend(vz.b0.f54756a);
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ Object invoke(b0<q<? extends PaymentMethod>> b0Var, zz.d<? super vz.b0> dVar) {
        return invoke2((b0<q<PaymentMethod>>) b0Var, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        zz.g gVar;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            gVar = this.this$0.workContext;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((b0) this.L$0, this.this$0, this.$params, null);
            this.label = 1;
            if (v20.i.g(gVar, anonymousClass1, this) == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
        }
        return vz.b0.f54756a;
    }
}