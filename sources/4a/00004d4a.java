package com.stripe.android.financialconnections;

import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import org.spongycastle.crypto.tls.CipherSuite;
import v20.o0;
import vz.b0;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$fetchFinancialConnectionsSessionForToken$1", f = "FinancialConnectionsSheetViewModel.kt", l = {CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_PSK_WITH_NULL_SHA384, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FinancialConnectionsSheetViewModel$fetchFinancialConnectionsSessionForToken$1 extends l implements p<o0, d<? super b0>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ FinancialConnectionsSheetViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetViewModel$fetchFinancialConnectionsSessionForToken$1(FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel, d<? super FinancialConnectionsSheetViewModel$fetchFinancialConnectionsSessionForToken$1> dVar) {
        super(2, dVar);
        this.this$0 = financialConnectionsSheetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new FinancialConnectionsSheetViewModel$fetchFinancialConnectionsSessionForToken$1(this.this$0, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((FinancialConnectionsSheetViewModel$fetchFinancialConnectionsSessionForToken$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = a00.b.d()
            int r1 = r7.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L29
            if (r1 == r4) goto L25
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            vz.r.b(r8)
            goto Lae
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            java.lang.Object r1 = r7.L$0
            vz.r.b(r8)
            goto L9b
        L25:
            vz.r.b(r8)     // Catch: java.lang.Throwable -> L50
            goto L49
        L29:
            vz.r.b(r8)
            com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel r8 = r7.this$0
            vz.q$a r1 = vz.q.f54772b     // Catch: java.lang.Throwable -> L50
            com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSessionForToken r1 = com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel.access$getFetchFinancialConnectionsSessionForToken$p(r8)     // Catch: java.lang.Throwable -> L50
            com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs r8 = com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel.access$getStarterArgs$p(r8)     // Catch: java.lang.Throwable -> L50
            com.stripe.android.financialconnections.FinancialConnectionsSheet$Configuration r8 = r8.getConfiguration()     // Catch: java.lang.Throwable -> L50
            java.lang.String r8 = r8.getFinancialConnectionsSessionClientSecret()     // Catch: java.lang.Throwable -> L50
            r7.label = r4     // Catch: java.lang.Throwable -> L50
            java.lang.Object r8 = r1.invoke(r8, r7)     // Catch: java.lang.Throwable -> L50
            if (r8 != r0) goto L49
            return r0
        L49:
            vz.p r8 = (vz.p) r8     // Catch: java.lang.Throwable -> L50
            java.lang.Object r8 = vz.q.b(r8)     // Catch: java.lang.Throwable -> L50
            goto L5b
        L50:
            r8 = move-exception
            vz.q$a r1 = vz.q.f54772b
            java.lang.Object r8 = vz.r.a(r8)
            java.lang.Object r8 = vz.q.b(r8)
        L5b:
            r1 = r8
            com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel r8 = r7.this$0
            boolean r4 = vz.q.h(r1)
            if (r4 == 0) goto L9b
            r4 = r1
            vz.p r4 = (vz.p) r4
            java.lang.Object r5 = r4.a()
            com.stripe.android.financialconnections.model.FinancialConnectionsSession r5 = (com.stripe.android.financialconnections.model.FinancialConnectionsSession) r5
            java.lang.Object r4 = r4.b()
            com.stripe.android.model.Token r4 = (com.stripe.android.model.Token) r4
            com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult$Completed r6 = new com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult$Completed
            r6.<init>(r5, r4)
            com.stripe.android.financialconnections.analytics.FinancialConnectionsEventReporter r4 = com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel.access$getEventReporter$p(r8)
            com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs r5 = com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel.access$getStarterArgs$p(r8)
            com.stripe.android.financialconnections.FinancialConnectionsSheet$Configuration r5 = r5.getConfiguration()
            r4.onResult(r5, r6)
            kotlinx.coroutines.flow.t r8 = com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel.access$get_viewEffect$p(r8)
            com.stripe.android.financialconnections.FinancialConnectionsSheetViewEffect$FinishWithResult r4 = new com.stripe.android.financialconnections.FinancialConnectionsSheetViewEffect$FinishWithResult
            r4.<init>(r6)
            r7.L$0 = r1
            r7.label = r3
            java.lang.Object r8 = r8.emit(r4, r7)
            if (r8 != r0) goto L9b
            return r0
        L9b:
            com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel r8 = r7.this$0
            java.lang.Throwable r3 = vz.q.e(r1)
            if (r3 == 0) goto Lae
            r7.L$0 = r1
            r7.label = r2
            java.lang.Object r8 = com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel.access$onFatal(r8, r3, r7)
            if (r8 != r0) goto Lae
            return r0
        Lae:
            vz.b0 r8 = vz.b0.f54756a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$fetchFinancialConnectionsSessionForToken$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}