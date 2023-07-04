package com.stripe.android;

import com.stripe.android.networking.FraudDetectionData;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.DefaultFraudDetectionDataRepository$getLatest$2", f = "FraudDetectionDataRepository.kt", l = {70, 76}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class DefaultFraudDetectionDataRepository$getLatest$2 extends l implements p<o0, zz.d<? super FraudDetectionData>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DefaultFraudDetectionDataRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFraudDetectionDataRepository$getLatest$2(DefaultFraudDetectionDataRepository defaultFraudDetectionDataRepository, zz.d<? super DefaultFraudDetectionDataRepository$getLatest$2> dVar) {
        super(2, dVar);
        this.this$0 = defaultFraudDetectionDataRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
        DefaultFraudDetectionDataRepository$getLatest$2 defaultFraudDetectionDataRepository$getLatest$2 = new DefaultFraudDetectionDataRepository$getLatest$2(this.this$0, dVar);
        defaultFraudDetectionDataRepository$getLatest$2.L$0 = obj;
        return defaultFraudDetectionDataRepository$getLatest$2;
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, zz.d<? super FraudDetectionData> dVar) {
        return ((DefaultFraudDetectionDataRepository$getLatest$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        if (r7.isExpired(((java.lang.Number) r4.invoke()).longValue()) != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = a00.b.d()
            int r1 = r6.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            vz.r.b(r7)     // Catch: java.lang.Throwable -> L13
            goto L70
        L13:
            r7 = move-exception
            goto L7b
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            java.lang.Object r1 = r6.L$0
            v20.o0 r1 = (v20.o0) r1
            vz.r.b(r7)
            goto L3d
        L25:
            vz.r.b(r7)
            java.lang.Object r7 = r6.L$0
            v20.o0 r7 = (v20.o0) r7
            com.stripe.android.DefaultFraudDetectionDataRepository r1 = r6.this$0
            com.stripe.android.FraudDetectionDataStore r1 = com.stripe.android.DefaultFraudDetectionDataRepository.access$getLocalStore$p(r1)
            r6.L$0 = r7
            r6.label = r4
            java.lang.Object r7 = r1.get(r6)
            if (r7 != r0) goto L3d
            return r0
        L3d:
            com.stripe.android.DefaultFraudDetectionDataRepository r1 = r6.this$0
            com.stripe.android.networking.FraudDetectionData r7 = (com.stripe.android.networking.FraudDetectionData) r7
            if (r7 == 0) goto L57
            h00.a r4 = com.stripe.android.FraudDetectionDataRepositoryKt.access$getTimestampSupplier$p()
            java.lang.Object r4 = r4.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            long r4 = r4.longValue()
            boolean r4 = r7.isExpired(r4)
            if (r4 == 0) goto L90
        L57:
            vz.q$a r4 = vz.q.f54772b     // Catch: java.lang.Throwable -> L13
            com.stripe.android.core.networking.StripeNetworkClient r4 = com.stripe.android.DefaultFraudDetectionDataRepository.access$getStripeNetworkClient$p(r1)     // Catch: java.lang.Throwable -> L13
            com.stripe.android.networking.FraudDetectionDataRequestFactory r1 = com.stripe.android.DefaultFraudDetectionDataRepository.access$getFraudDetectionDataRequestFactory$p(r1)     // Catch: java.lang.Throwable -> L13
            com.stripe.android.networking.FraudDetectionDataRequest r7 = r1.create(r7)     // Catch: java.lang.Throwable -> L13
            r6.L$0 = r2     // Catch: java.lang.Throwable -> L13
            r6.label = r3     // Catch: java.lang.Throwable -> L13
            java.lang.Object r7 = r4.executeRequest(r7, r6)     // Catch: java.lang.Throwable -> L13
            if (r7 != r0) goto L70
            return r0
        L70:
            com.stripe.android.core.networking.StripeResponse r7 = (com.stripe.android.core.networking.StripeResponse) r7     // Catch: java.lang.Throwable -> L13
            com.stripe.android.networking.FraudDetectionData r7 = com.stripe.android.FraudDetectionDataRepositoryKt.access$fraudDetectionData(r7)     // Catch: java.lang.Throwable -> L13
            java.lang.Object r7 = vz.q.b(r7)     // Catch: java.lang.Throwable -> L13
            goto L85
        L7b:
            vz.q$a r0 = vz.q.f54772b
            java.lang.Object r7 = vz.r.a(r7)
            java.lang.Object r7 = vz.q.b(r7)
        L85:
            boolean r0 = vz.q.g(r7)
            if (r0 == 0) goto L8c
            goto L8d
        L8c:
            r2 = r7
        L8d:
            r7 = r2
            com.stripe.android.networking.FraudDetectionData r7 = (com.stripe.android.networking.FraudDetectionData) r7
        L90:
            com.stripe.android.DefaultFraudDetectionDataRepository r0 = r6.this$0
            com.stripe.android.networking.FraudDetectionData r0 = com.stripe.android.DefaultFraudDetectionDataRepository.access$getCachedFraudDetectionData$p(r0)
            boolean r0 = kotlin.jvm.internal.s.c(r0, r7)
            if (r0 != 0) goto La4
            if (r7 != 0) goto L9f
            goto La4
        L9f:
            com.stripe.android.DefaultFraudDetectionDataRepository r0 = r6.this$0
            r0.save(r7)
        La4:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.DefaultFraudDetectionDataRepository$getLatest$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}