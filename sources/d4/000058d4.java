package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.q;
import vz.r;
import zz.d;

@f(c = "com.stripe.android.stripe3ds2.transaction.StripeHttpClient$doPostRequest$2", f = "StripeHttpClient.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class StripeHttpClient$doPostRequest$2 extends l implements p<o0, d<? super HttpResponse>, Object> {
    final /* synthetic */ String $contentType;
    final /* synthetic */ String $requestBody;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StripeHttpClient this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeHttpClient$doPostRequest$2(StripeHttpClient stripeHttpClient, String str, String str2, d<? super StripeHttpClient$doPostRequest$2> dVar) {
        super(2, dVar);
        this.this$0 = stripeHttpClient;
        this.$requestBody = str;
        this.$contentType = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        StripeHttpClient$doPostRequest$2 stripeHttpClient$doPostRequest$2 = new StripeHttpClient$doPostRequest$2(this.this$0, this.$requestBody, this.$contentType, dVar);
        stripeHttpClient$doPostRequest$2.L$0 = obj;
        return stripeHttpClient$doPostRequest$2;
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super HttpResponse> dVar) {
        return ((StripeHttpClient$doPostRequest$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object b11;
        ErrorReporter errorReporter;
        HttpResponse doPostRequestInternal;
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            o0 o0Var = (o0) this.L$0;
            StripeHttpClient stripeHttpClient = this.this$0;
            String str = this.$requestBody;
            String str2 = this.$contentType;
            try {
                q.a aVar = q.f54772b;
                doPostRequestInternal = stripeHttpClient.doPostRequestInternal(str, str2);
                b11 = q.b(doPostRequestInternal);
            } catch (Throwable th2) {
                q.a aVar2 = q.f54772b;
                b11 = q.b(r.a(th2));
            }
            StripeHttpClient stripeHttpClient2 = this.this$0;
            Throwable e11 = q.e(b11);
            if (e11 != null) {
                errorReporter = stripeHttpClient2.errorReporter;
                errorReporter.reportError(e11);
            }
            Throwable e12 = q.e(b11);
            if (e12 == null) {
                return b11;
            }
            throw new SDKRuntimeException(e12);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}