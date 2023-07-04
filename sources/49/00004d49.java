package com.stripe.android.financialconnections;

import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$fetchFinancialConnectionsSession$1", f = "FinancialConnectionsSheetViewModel.kt", l = {150, 154, 156}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FinancialConnectionsSheetViewModel$fetchFinancialConnectionsSession$1 extends l implements p<o0, d<? super b0>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ FinancialConnectionsSheetViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetViewModel$fetchFinancialConnectionsSession$1(FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel, d<? super FinancialConnectionsSheetViewModel$fetchFinancialConnectionsSession$1> dVar) {
        super(2, dVar);
        this.this$0 = financialConnectionsSheetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new FinancialConnectionsSheetViewModel$fetchFinancialConnectionsSession$1(this.this$0, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((FinancialConnectionsSheetViewModel$fetchFinancialConnectionsSession$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
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
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L28
            if (r1 == r3) goto L24
            if (r1 == r4) goto L1e
            if (r1 != r2) goto L16
            vz.r.b(r8)
            goto La2
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            java.lang.Object r1 = r7.L$0
            vz.r.b(r8)
            goto L8f
        L24:
            vz.r.b(r8)     // Catch: java.lang.Throwable -> L4f
            goto L48
        L28:
            vz.r.b(r8)
            com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel r8 = r7.this$0
            vz.q$a r1 = vz.q.f54772b     // Catch: java.lang.Throwable -> L4f
            com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSession r1 = com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel.access$getFetchFinancialConnectionsSession$p(r8)     // Catch: java.lang.Throwable -> L4f
            com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs r8 = com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel.access$getStarterArgs$p(r8)     // Catch: java.lang.Throwable -> L4f
            com.stripe.android.financialconnections.FinancialConnectionsSheet$Configuration r8 = r8.getConfiguration()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r8 = r8.getFinancialConnectionsSessionClientSecret()     // Catch: java.lang.Throwable -> L4f
            r7.label = r3     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r8 = r1.invoke(r8, r7)     // Catch: java.lang.Throwable -> L4f
            if (r8 != r0) goto L48
            return r0
        L48:
            com.stripe.android.financialconnections.model.FinancialConnectionsSession r8 = (com.stripe.android.financialconnections.model.FinancialConnectionsSession) r8     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r8 = vz.q.b(r8)     // Catch: java.lang.Throwable -> L4f
            goto L5a
        L4f:
            r8 = move-exception
            vz.q$a r1 = vz.q.f54772b
            java.lang.Object r8 = vz.r.a(r8)
            java.lang.Object r8 = vz.q.b(r8)
        L5a:
            r1 = r8
            com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel r8 = r7.this$0
            boolean r3 = vz.q.h(r1)
            if (r3 == 0) goto L8f
            r3 = r1
            com.stripe.android.financialconnections.model.FinancialConnectionsSession r3 = (com.stripe.android.financialconnections.model.FinancialConnectionsSession) r3
            com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult$Completed r5 = new com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult$Completed
            r6 = 0
            r5.<init>(r3, r6, r4, r6)
            com.stripe.android.financialconnections.analytics.FinancialConnectionsEventReporter r3 = com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel.access$getEventReporter$p(r8)
            com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs r6 = com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel.access$getStarterArgs$p(r8)
            com.stripe.android.financialconnections.FinancialConnectionsSheet$Configuration r6 = r6.getConfiguration()
            r3.onResult(r6, r5)
            kotlinx.coroutines.flow.t r8 = com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel.access$get_viewEffect$p(r8)
            com.stripe.android.financialconnections.FinancialConnectionsSheetViewEffect$FinishWithResult r3 = new com.stripe.android.financialconnections.FinancialConnectionsSheetViewEffect$FinishWithResult
            r3.<init>(r5)
            r7.L$0 = r1
            r7.label = r4
            java.lang.Object r8 = r8.emit(r3, r7)
            if (r8 != r0) goto L8f
            return r0
        L8f:
            com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel r8 = r7.this$0
            java.lang.Throwable r3 = vz.q.e(r1)
            if (r3 == 0) goto La2
            r7.L$0 = r1
            r7.label = r2
            java.lang.Object r8 = com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel.access$onFatal(r8, r3, r7)
            if (r8 != r0) goto La2
            return r0
        La2:
            vz.b0 r8 = vz.b0.f54756a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$fetchFinancialConnectionsSession$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}