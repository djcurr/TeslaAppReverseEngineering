package com.stripe.android;

import com.stripe.android.IssuingCardPinService;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.InvalidRequestException;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.r;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.IssuingCardPinService$onUpdatePinError$2", f = "IssuingCardPinService.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class IssuingCardPinService$onUpdatePinError$2 extends l implements p<o0, zz.d<? super b0>, Object> {
    final /* synthetic */ IssuingCardPinService.IssuingCardPinUpdateListener $listener;
    final /* synthetic */ Throwable $throwable;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IssuingCardPinService$onUpdatePinError$2(Throwable th2, IssuingCardPinService.IssuingCardPinUpdateListener issuingCardPinUpdateListener, zz.d<? super IssuingCardPinService$onUpdatePinError$2> dVar) {
        super(2, dVar);
        this.$throwable = th2;
        this.$listener = issuingCardPinUpdateListener;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
        return new IssuingCardPinService$onUpdatePinError$2(this.$throwable, this.$listener, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
        return ((IssuingCardPinService$onUpdatePinError$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            Throwable th2 = this.$throwable;
            if (th2 instanceof InvalidRequestException) {
                StripeError stripeError = ((InvalidRequestException) th2).getStripeError();
                String code = stripeError == null ? null : stripeError.getCode();
                if (code != null) {
                    switch (code.hashCode()) {
                        case -1309235419:
                            if (code.equals("expired")) {
                                this.$listener.onError(IssuingCardPinService.CardPinActionError.ONE_TIME_CODE_EXPIRED, "The one-time code has expired.", null);
                                break;
                            }
                            break;
                        case -1266028985:
                            if (code.equals("incorrect_code")) {
                                this.$listener.onError(IssuingCardPinService.CardPinActionError.ONE_TIME_CODE_INCORRECT, "The one-time code was incorrect.", null);
                                break;
                            }
                            break;
                        case 830217595:
                            if (code.equals("too_many_attempts")) {
                                this.$listener.onError(IssuingCardPinService.CardPinActionError.ONE_TIME_CODE_TOO_MANY_ATTEMPTS, "The verification challenge was attempted too many times.", null);
                                break;
                            }
                            break;
                        case 1888170818:
                            if (code.equals("already_redeemed")) {
                                this.$listener.onError(IssuingCardPinService.CardPinActionError.ONE_TIME_CODE_ALREADY_REDEEMED, "The verification challenge was already redeemed.", null);
                                break;
                            }
                            break;
                    }
                }
                this.$listener.onError(IssuingCardPinService.CardPinActionError.UNKNOWN_ERROR, "The call to update the PIN failed, possibly an error with the verification.", this.$throwable);
            } else {
                this.$listener.onError(IssuingCardPinService.CardPinActionError.UNKNOWN_ERROR, "An error occurred while updating the PIN.", th2);
            }
            return b0.f54756a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}