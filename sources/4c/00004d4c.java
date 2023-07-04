package com.stripe.android.financialconnections;

import android.content.Intent;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.u;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$handleOnNewIntent$2", f = "FinancialConnectionsSheetViewModel.kt", l = {224, 225}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FinancialConnectionsSheetViewModel$handleOnNewIntent$2 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ Intent $intent;
    int label;
    final /* synthetic */ FinancialConnectionsSheetViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetViewModel$handleOnNewIntent$2(FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel, Intent intent, d<? super FinancialConnectionsSheetViewModel$handleOnNewIntent$2> dVar) {
        super(2, dVar);
        this.this$0 = financialConnectionsSheetViewModel;
        this.$intent = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new FinancialConnectionsSheetViewModel$handleOnNewIntent$2(this.this$0, this.$intent, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((FinancialConnectionsSheetViewModel$handleOnNewIntent$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        u uVar;
        Object onFatal;
        Object onUserCancel;
        FinancialConnectionsSheetActivityArgs financialConnectionsSheetActivityArgs;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            uVar = this.this$0._state;
            FinancialConnectionsSessionManifest manifest = ((FinancialConnectionsSheetState) uVar.getValue()).getManifest();
            Intent intent = this.$intent;
            String valueOf = String.valueOf(intent == null ? null : intent.getData());
            if (s.c(valueOf, manifest == null ? null : manifest.getSuccessUrl())) {
                financialConnectionsSheetActivityArgs = this.this$0.starterArgs;
                if (financialConnectionsSheetActivityArgs instanceof FinancialConnectionsSheetActivityArgs.ForData) {
                    this.this$0.fetchFinancialConnectionsSession();
                } else if (financialConnectionsSheetActivityArgs instanceof FinancialConnectionsSheetActivityArgs.ForToken) {
                    this.this$0.fetchFinancialConnectionsSessionForToken();
                }
            } else {
                if (s.c(valueOf, manifest != null ? manifest.getCancelUrl() : null)) {
                    FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel = this.this$0;
                    this.label = 1;
                    onUserCancel = financialConnectionsSheetViewModel.onUserCancel(this);
                    if (onUserCancel == d11) {
                        return d11;
                    }
                } else {
                    FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel2 = this.this$0;
                    Exception exc = new Exception("Error processing FinancialConnectionsSheet intent");
                    this.label = 2;
                    onFatal = financialConnectionsSheetViewModel2.onFatal(exc, this);
                    if (onFatal == d11) {
                        return d11;
                    }
                }
            }
        } else if (i11 != 1 && i11 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
        }
        return b0.f54756a;
    }
}