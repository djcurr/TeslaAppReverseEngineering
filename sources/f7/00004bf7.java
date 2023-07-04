package com.stripe.android;

import com.stripe.android.core.model.StripeModel;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.q;
import vz.r;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.Stripe$executeAsync$1", f = "Stripe.kt", l = {1789, 1791}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class Stripe$executeAsync$1 extends l implements p<o0, zz.d<? super b0>, Object> {
    final /* synthetic */ h00.l<zz.d<? super T>, Object> $apiMethod;
    final /* synthetic */ ApiResultCallback<T> $callback;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ Stripe this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Stripe$executeAsync$1(Stripe stripe, ApiResultCallback<? super T> apiResultCallback, h00.l<? super zz.d<? super T>, ? extends Object> lVar, zz.d<? super Stripe$executeAsync$1> dVar) {
        super(2, dVar);
        this.this$0 = stripe;
        this.$callback = apiResultCallback;
        this.$apiMethod = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
        Stripe$executeAsync$1 stripe$executeAsync$1 = new Stripe$executeAsync$1(this.this$0, this.$callback, this.$apiMethod, dVar);
        stripe$executeAsync$1.L$0 = obj;
        return stripe$executeAsync$1;
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
        return ((Stripe$executeAsync$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        Object b11;
        Object dispatchResult;
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
            h00.l<zz.d<? super T>, Object> lVar = this.$apiMethod;
            q.a aVar2 = q.f54772b;
            this.label = 1;
            obj = lVar.invoke(this);
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
            b11 = q.b((StripeModel) obj);
            Stripe stripe = this.this$0;
            ApiResultCallback<T> apiResultCallback = this.$callback;
            this.label = 2;
            dispatchResult = stripe.dispatchResult(b11, apiResultCallback, this);
            if (dispatchResult == d11) {
                return d11;
            }
            return b0.f54756a;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}