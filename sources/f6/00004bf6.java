package com.stripe.android;

import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.model.StripeModel;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.q;
import vz.r;

@f(c = "com.stripe.android.Stripe$dispatchResult$2", f = "Stripe.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class Stripe$dispatchResult$2 extends l implements p<o0, zz.d<? super b0>, Object> {
    final /* synthetic */ ApiResultCallback<T> $callback;
    final /* synthetic */ Object $result;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Stripe$dispatchResult$2(Object obj, ApiResultCallback<? super T> apiResultCallback, zz.d<? super Stripe$dispatchResult$2> dVar) {
        super(2, dVar);
        this.$result = obj;
        this.$callback = apiResultCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
        return new Stripe$dispatchResult$2(this.$result, this.$callback, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
        return ((Stripe$dispatchResult$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            Object obj2 = this.$result;
            ApiResultCallback<T> apiResultCallback = this.$callback;
            Throwable e11 = q.e(obj2);
            if (e11 == null) {
                apiResultCallback.onSuccess((StripeModel) obj2);
            } else {
                apiResultCallback.onError(StripeException.Companion.create(e11));
            }
            return b0.f54756a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}