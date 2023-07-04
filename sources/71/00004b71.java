package com.stripe.android;

import androidx.recyclerview.widget.l;
import com.stripe.android.EphemeralOperation;
import com.stripe.android.IssuingCardPinService;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.networking.StripeRepository;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import v20.e1;
import v20.i;
import v20.l2;
import v20.o0;
import vz.b0;
import vz.q;
import vz.r;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.IssuingCardPinService$fireUpdatePinRequest$1", f = "IssuingCardPinService.kt", l = {233, 245, l.f.DEFAULT_SWIPE_ANIMATION_DURATION}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class IssuingCardPinService$fireUpdatePinRequest$1 extends kotlin.coroutines.jvm.internal.l implements p<o0, zz.d<? super b0>, Object> {
    final /* synthetic */ EphemeralKey $ephemeralKey;
    final /* synthetic */ IssuingCardPinService.IssuingCardPinUpdateListener $listener;
    final /* synthetic */ EphemeralOperation.Issuing.UpdatePin $operation;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IssuingCardPinService this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IssuingCardPinService$fireUpdatePinRequest$1(IssuingCardPinService issuingCardPinService, EphemeralOperation.Issuing.UpdatePin updatePin, EphemeralKey ephemeralKey, IssuingCardPinService.IssuingCardPinUpdateListener issuingCardPinUpdateListener, zz.d<? super IssuingCardPinService$fireUpdatePinRequest$1> dVar) {
        super(2, dVar);
        this.this$0 = issuingCardPinService;
        this.$operation = updatePin;
        this.$ephemeralKey = ephemeralKey;
        this.$listener = issuingCardPinUpdateListener;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
        IssuingCardPinService$fireUpdatePinRequest$1 issuingCardPinService$fireUpdatePinRequest$1 = new IssuingCardPinService$fireUpdatePinRequest$1(this.this$0, this.$operation, this.$ephemeralKey, this.$listener, dVar);
        issuingCardPinService$fireUpdatePinRequest$1.L$0 = obj;
        return issuingCardPinService$fireUpdatePinRequest$1;
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
        return ((IssuingCardPinService$fireUpdatePinRequest$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        Object b11;
        Object onUpdatePinError;
        StripeRepository stripeRepository;
        String str;
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
            EphemeralOperation.Issuing.UpdatePin updatePin = this.$operation;
            EphemeralKey ephemeralKey = this.$ephemeralKey;
            q.a aVar2 = q.f54772b;
            stripeRepository = issuingCardPinService.stripeRepository;
            String cardId = updatePin.getCardId();
            String newPin = updatePin.getNewPin();
            String verificationId = updatePin.getVerificationId();
            String userOneTimeCode = updatePin.getUserOneTimeCode();
            String secret = ephemeralKey.getSecret();
            str = issuingCardPinService.stripeAccountId;
            ApiRequest.Options options = new ApiRequest.Options(secret, str, null, 4, null);
            this.label = 1;
            if (stripeRepository.updateIssuingCardPin$payments_core_release(cardId, newPin, verificationId, userOneTimeCode, options, this) == d11) {
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
        }
        b11 = q.b(b0.f54756a);
        IssuingCardPinService.IssuingCardPinUpdateListener issuingCardPinUpdateListener = this.$listener;
        IssuingCardPinService issuingCardPinService2 = this.this$0;
        Throwable e11 = q.e(b11);
        if (e11 == null) {
            b0 b0Var = (b0) b11;
            l2 c11 = e1.c();
            IssuingCardPinService$fireUpdatePinRequest$1$2$1 issuingCardPinService$fireUpdatePinRequest$1$2$1 = new IssuingCardPinService$fireUpdatePinRequest$1$2$1(issuingCardPinUpdateListener, null);
            this.label = 2;
            if (i.g(c11, issuingCardPinService$fireUpdatePinRequest$1$2$1, this) == d11) {
                return d11;
            }
        } else {
            this.label = 3;
            onUpdatePinError = issuingCardPinService2.onUpdatePinError(e11, issuingCardPinUpdateListener, this);
            if (onUpdatePinError == d11) {
                return d11;
            }
        }
        return b0.f54756a;
    }
}