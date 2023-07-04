package com.stripe.android.financialconnections;

import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$fetchManifest$1", f = "FinancialConnectionsSheetViewModel.kt", l = {65, 70, 72}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FinancialConnectionsSheetViewModel$fetchManifest$1 extends l implements p<o0, d<? super b0>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ FinancialConnectionsSheetViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetViewModel$fetchManifest$1(FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel, d<? super FinancialConnectionsSheetViewModel$fetchManifest$1> dVar) {
        super(2, dVar);
        this.this$0 = financialConnectionsSheetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new FinancialConnectionsSheetViewModel$fetchManifest$1(this.this$0, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((FinancialConnectionsSheetViewModel$fetchManifest$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
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
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L28
            if (r1 == r4) goto L24
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            vz.r.b(r7)
            goto L88
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            java.lang.Object r1 = r6.L$0
            vz.r.b(r7)
            goto L72
        L24:
            vz.r.b(r7)     // Catch: java.lang.Throwable -> L53
            goto L4c
        L28:
            vz.r.b(r7)
            com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel r7 = r6.this$0
            vz.q$a r1 = vz.q.f54772b     // Catch: java.lang.Throwable -> L53
            com.stripe.android.financialconnections.domain.GenerateFinancialConnectionsSessionManifest r1 = com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel.access$getGenerateFinancialConnectionsSessionManifest$p(r7)     // Catch: java.lang.Throwable -> L53
            com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs r5 = com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel.access$getStarterArgs$p(r7)     // Catch: java.lang.Throwable -> L53
            com.stripe.android.financialconnections.FinancialConnectionsSheet$Configuration r5 = r5.getConfiguration()     // Catch: java.lang.Throwable -> L53
            java.lang.String r5 = r5.getFinancialConnectionsSessionClientSecret()     // Catch: java.lang.Throwable -> L53
            java.lang.String r7 = com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel.access$getApplicationId$p(r7)     // Catch: java.lang.Throwable -> L53
            r6.label = r4     // Catch: java.lang.Throwable -> L53
            java.lang.Object r7 = r1.invoke(r5, r7, r6)     // Catch: java.lang.Throwable -> L53
            if (r7 != r0) goto L4c
            return r0
        L4c:
            com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest r7 = (com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest) r7     // Catch: java.lang.Throwable -> L53
            java.lang.Object r7 = vz.q.b(r7)     // Catch: java.lang.Throwable -> L53
            goto L5e
        L53:
            r7 = move-exception
            vz.q$a r1 = vz.q.f54772b
            java.lang.Object r7 = vz.r.a(r7)
            java.lang.Object r7 = vz.q.b(r7)
        L5e:
            r1 = r7
            com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel r7 = r6.this$0
            java.lang.Throwable r4 = vz.q.e(r1)
            if (r4 == 0) goto L72
            r6.L$0 = r1
            r6.label = r3
            java.lang.Object r7 = com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel.access$onFatal(r7, r4, r6)
            if (r7 != r0) goto L72
            return r0
        L72:
            com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel r7 = r6.this$0
            boolean r3 = vz.q.h(r1)
            if (r3 == 0) goto L88
            r3 = r1
            com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest r3 = (com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest) r3
            r6.L$0 = r1
            r6.label = r2
            java.lang.Object r7 = com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel.access$openAuthFlow(r7, r3, r6)
            if (r7 != r0) goto L88
            return r0
        L88:
            vz.b0 r7 = vz.b0.f54756a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$fetchManifest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}