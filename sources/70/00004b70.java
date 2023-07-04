package com.stripe.android;

import com.stripe.android.IssuingCardPinService;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.r;

@f(c = "com.stripe.android.IssuingCardPinService$fireRetrievePinRequest$1$2$1", f = "IssuingCardPinService.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class IssuingCardPinService$fireRetrievePinRequest$1$2$1 extends l implements p<o0, zz.d<? super b0>, Object> {
    final /* synthetic */ IssuingCardPinService.IssuingCardPinRetrievalListener $listener;
    final /* synthetic */ String $pin;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IssuingCardPinService$fireRetrievePinRequest$1$2$1(IssuingCardPinService.IssuingCardPinRetrievalListener issuingCardPinRetrievalListener, String str, zz.d<? super IssuingCardPinService$fireRetrievePinRequest$1$2$1> dVar) {
        super(2, dVar);
        this.$listener = issuingCardPinRetrievalListener;
        this.$pin = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
        return new IssuingCardPinService$fireRetrievePinRequest$1$2$1(this.$listener, this.$pin, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
        return ((IssuingCardPinService$fireRetrievePinRequest$1$2$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            this.$listener.onIssuingCardPinRetrieved(this.$pin);
            return b0.f54756a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}