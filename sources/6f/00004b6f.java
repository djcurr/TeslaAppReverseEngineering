package com.stripe.android;

import com.stripe.android.EphemeralOperation;
import com.stripe.android.IssuingCardPinService;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.networking.StripeRepository;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import org.spongycastle.crypto.tls.CipherSuite;
import v20.e1;
import v20.i;
import v20.l2;
import v20.o0;
import vz.b0;
import vz.q;
import vz.r;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.IssuingCardPinService$fireRetrievePinRequest$1", f = "IssuingCardPinService.kt", l = {147, CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class IssuingCardPinService$fireRetrievePinRequest$1 extends l implements p<o0, zz.d<? super b0>, Object> {
    final /* synthetic */ EphemeralKey $ephemeralKey;
    final /* synthetic */ IssuingCardPinService.IssuingCardPinRetrievalListener $listener;
    final /* synthetic */ EphemeralOperation.Issuing.RetrievePin $operation;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IssuingCardPinService this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IssuingCardPinService$fireRetrievePinRequest$1(IssuingCardPinService issuingCardPinService, EphemeralOperation.Issuing.RetrievePin retrievePin, EphemeralKey ephemeralKey, IssuingCardPinService.IssuingCardPinRetrievalListener issuingCardPinRetrievalListener, zz.d<? super IssuingCardPinService$fireRetrievePinRequest$1> dVar) {
        super(2, dVar);
        this.this$0 = issuingCardPinService;
        this.$operation = retrievePin;
        this.$ephemeralKey = ephemeralKey;
        this.$listener = issuingCardPinRetrievalListener;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
        IssuingCardPinService$fireRetrievePinRequest$1 issuingCardPinService$fireRetrievePinRequest$1 = new IssuingCardPinService$fireRetrievePinRequest$1(this.this$0, this.$operation, this.$ephemeralKey, this.$listener, dVar);
        issuingCardPinService$fireRetrievePinRequest$1.L$0 = obj;
        return issuingCardPinService$fireRetrievePinRequest$1;
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
        return ((IssuingCardPinService$fireRetrievePinRequest$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        Object b11;
        Object onRetrievePinError;
        StripeRepository stripeRepository;
        String str;
        Object retrieveIssuingCardPin$payments_core_release;
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
            IssuingCardPinService issuingCardPinService = this.this$0;
            EphemeralOperation.Issuing.RetrievePin retrievePin = this.$operation;
            EphemeralKey ephemeralKey = this.$ephemeralKey;
            q.a aVar2 = q.f54772b;
            stripeRepository = issuingCardPinService.stripeRepository;
            String cardId = retrievePin.getCardId();
            String verificationId = retrievePin.getVerificationId();
            String userOneTimeCode = retrievePin.getUserOneTimeCode();
            String secret = ephemeralKey.getSecret();
            str = issuingCardPinService.stripeAccountId;
            ApiRequest.Options options = new ApiRequest.Options(secret, str, null, 4, null);
            this.label = 1;
            retrieveIssuingCardPin$payments_core_release = stripeRepository.retrieveIssuingCardPin$payments_core_release(cardId, verificationId, userOneTimeCode, options, this);
            if (retrieveIssuingCardPin$payments_core_release == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            if (i11 != 2 && i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return b0.f54756a;
        } else {
            r.b(obj);
            retrieveIssuingCardPin$payments_core_release = obj;
        }
        if (retrieveIssuingCardPin$payments_core_release != null) {
            b11 = q.b((String) retrieveIssuingCardPin$payments_core_release);
            IssuingCardPinService.IssuingCardPinRetrievalListener issuingCardPinRetrievalListener = this.$listener;
            IssuingCardPinService issuingCardPinService2 = this.this$0;
            Throwable e11 = q.e(b11);
            if (e11 == null) {
                l2 c11 = e1.c();
                IssuingCardPinService$fireRetrievePinRequest$1$2$1 issuingCardPinService$fireRetrievePinRequest$1$2$1 = new IssuingCardPinService$fireRetrievePinRequest$1$2$1(issuingCardPinRetrievalListener, (String) b11, null);
                this.label = 2;
                if (i.g(c11, issuingCardPinService$fireRetrievePinRequest$1$2$1, this) == d11) {
                    return d11;
                }
            } else {
                this.label = 3;
                onRetrievePinError = issuingCardPinService2.onRetrievePinError(e11, issuingCardPinRetrievalListener, this);
                if (onRetrievePinError == d11) {
                    return d11;
                }
            }
            return b0.f54756a;
        }
        throw new IllegalArgumentException("Could not retrieve issuing card PIN.".toString());
    }
}