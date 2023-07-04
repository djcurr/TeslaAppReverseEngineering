package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.s;
import v20.o0;
import vz.b0;
import vz.q;
import vz.r;
import zz.d;

@f(c = "com.stripe.android.stripe3ds2.transaction.StripeErrorRequestExecutor$executeAsync$3$1", f = "StripeErrorRequestExecutor.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class StripeErrorRequestExecutor$executeAsync$3$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ String $requestBody;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StripeErrorRequestExecutor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeErrorRequestExecutor$executeAsync$3$1(StripeErrorRequestExecutor stripeErrorRequestExecutor, String str, d<? super StripeErrorRequestExecutor$executeAsync$3$1> dVar) {
        super(2, dVar);
        this.this$0 = stripeErrorRequestExecutor;
        this.$requestBody = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        StripeErrorRequestExecutor$executeAsync$3$1 stripeErrorRequestExecutor$executeAsync$3$1 = new StripeErrorRequestExecutor$executeAsync$3$1(this.this$0, this.$requestBody, dVar);
        stripeErrorRequestExecutor$executeAsync$3$1.L$0 = obj;
        return stripeErrorRequestExecutor$executeAsync$3$1;
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((StripeErrorRequestExecutor$executeAsync$3$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        Object b11;
        ErrorReporter errorReporter;
        HttpClient httpClient;
        d11 = a00.d.d();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                r.b(obj);
                o0 o0Var = (o0) this.L$0;
                StripeErrorRequestExecutor stripeErrorRequestExecutor = this.this$0;
                String requestBody = this.$requestBody;
                q.a aVar = q.f54772b;
                httpClient = stripeErrorRequestExecutor.httpClient;
                s.f(requestBody, "requestBody");
                this.label = 1;
                obj = httpClient.doPostRequest(requestBody, "application/json; charset=utf-8", this);
                if (obj == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                r.b(obj);
            }
            b11 = q.b((HttpResponse) obj);
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        StripeErrorRequestExecutor stripeErrorRequestExecutor2 = this.this$0;
        Throwable e11 = q.e(b11);
        if (e11 != null) {
            errorReporter = stripeErrorRequestExecutor2.errorReporter;
            errorReporter.reportError(e11);
        }
        return b0.f54756a;
    }
}