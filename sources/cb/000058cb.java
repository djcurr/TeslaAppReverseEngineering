package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlinx.coroutines.TimeoutCancellationException;
import v20.o0;
import vz.b0;
import vz.q;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor$execute$2", f = "StripeChallengeRequestExecutor.kt", l = {62, 70}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class StripeChallengeRequestExecutor$execute$2 extends l implements p<o0, d<? super ChallengeRequestResult>, Object> {
    final /* synthetic */ ChallengeRequestData $creqData;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StripeChallengeRequestExecutor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeChallengeRequestExecutor$execute$2(StripeChallengeRequestExecutor stripeChallengeRequestExecutor, ChallengeRequestData challengeRequestData, d<? super StripeChallengeRequestExecutor$execute$2> dVar) {
        super(2, dVar);
        this.this$0 = stripeChallengeRequestExecutor;
        this.$creqData = challengeRequestData;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        StripeChallengeRequestExecutor$execute$2 stripeChallengeRequestExecutor$execute$2 = new StripeChallengeRequestExecutor$execute$2(this.this$0, this.$creqData, dVar);
        stripeChallengeRequestExecutor$execute$2.L$0 = obj;
        return stripeChallengeRequestExecutor$execute$2;
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super ChallengeRequestResult> dVar) {
        return ((StripeChallengeRequestExecutor$execute$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        Object b11;
        ChallengeResponseProcessor challengeResponseProcessor;
        ErrorReporter errorReporter;
        HttpClient httpClient;
        String requestBody;
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
            StripeChallengeRequestExecutor stripeChallengeRequestExecutor = this.this$0;
            ChallengeRequestData challengeRequestData = this.$creqData;
            q.a aVar2 = q.f54772b;
            httpClient = stripeChallengeRequestExecutor.httpClient;
            requestBody = stripeChallengeRequestExecutor.getRequestBody(challengeRequestData.toJson$3ds2sdk_release());
            this.label = 1;
            obj = httpClient.doPostRequest(requestBody, "application/jose; charset=UTF-8", this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            if (i11 == 2) {
                r.b(obj);
                return (ChallengeRequestResult) obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
        }
        b11 = q.b((HttpResponse) obj);
        StripeChallengeRequestExecutor stripeChallengeRequestExecutor2 = this.this$0;
        Throwable e11 = q.e(b11);
        if (e11 != null) {
            errorReporter = stripeChallengeRequestExecutor2.errorReporter;
            errorReporter.reportError(e11);
        }
        StripeChallengeRequestExecutor stripeChallengeRequestExecutor3 = this.this$0;
        ChallengeRequestData challengeRequestData2 = this.$creqData;
        Throwable e12 = q.e(b11);
        if (e12 == null) {
            challengeResponseProcessor = stripeChallengeRequestExecutor3.responseProcessor;
            this.label = 2;
            obj = challengeResponseProcessor.process(challengeRequestData2, (HttpResponse) b11, this);
            if (obj == d11) {
                return d11;
            }
            return (ChallengeRequestResult) obj;
        } else if (e12 instanceof TimeoutCancellationException) {
            return StripeChallengeRequestExecutor.Companion.createTimeoutResult(challengeRequestData2);
        } else {
            return new ChallengeRequestResult.RuntimeError(e12);
        }
    }
}