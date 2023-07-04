package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import h00.p;
import java.io.InputStream;
import java.net.HttpURLConnection;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.q;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.stripe3ds2.transaction.StripeHttpClient$doGetRequest$2", f = "StripeHttpClient.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class StripeHttpClient$doGetRequest$2 extends l implements p<o0, d<? super InputStream>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StripeHttpClient this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeHttpClient$doGetRequest$2(StripeHttpClient stripeHttpClient, d<? super StripeHttpClient$doGetRequest$2> dVar) {
        super(2, dVar);
        this.this$0 = stripeHttpClient;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        StripeHttpClient$doGetRequest$2 stripeHttpClient$doGetRequest$2 = new StripeHttpClient$doGetRequest$2(this.this$0, dVar);
        stripeHttpClient$doGetRequest$2.L$0 = obj;
        return stripeHttpClient$doGetRequest$2;
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super InputStream> dVar) {
        return ((StripeHttpClient$doGetRequest$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object b11;
        ErrorReporter errorReporter;
        HttpURLConnection createGetConnection;
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            o0 o0Var = (o0) this.L$0;
            StripeHttpClient stripeHttpClient = this.this$0;
            try {
                q.a aVar = q.f54772b;
                createGetConnection = stripeHttpClient.createGetConnection();
                createGetConnection.connect();
                b11 = q.b(createGetConnection.getResponseCode() == 200 ? createGetConnection.getInputStream() : null);
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
            if (q.g(b11)) {
                return null;
            }
            return b11;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}