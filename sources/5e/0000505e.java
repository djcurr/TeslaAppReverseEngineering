package com.stripe.android.link.ui.verification;

import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.model.LinkAccount;
import h00.p;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlinx.coroutines.flow.u;
import v20.o0;
import vz.b0;
import vz.q;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.link.ui.verification.VerificationViewModel$onVerificationCodeEntered$1", f = "VerificationViewModel.kt", l = {79}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class VerificationViewModel$onVerificationCodeEntered$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ String $code;
    int label;
    final /* synthetic */ VerificationViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationViewModel$onVerificationCodeEntered$1(VerificationViewModel verificationViewModel, String str, d<? super VerificationViewModel$onVerificationCodeEntered$1> dVar) {
        super(2, dVar);
        this.this$0 = verificationViewModel;
        this.$code = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new VerificationViewModel$onVerificationCodeEntered$1(this.this$0, this.$code, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((VerificationViewModel$onVerificationCodeEntered$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        LinkAccountManager linkAccountManager;
        Object m158confirmVerificationgIAlus;
        u uVar;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            linkAccountManager = this.this$0.linkAccountManager;
            String str = this.$code;
            this.label = 1;
            m158confirmVerificationgIAlus = linkAccountManager.m158confirmVerificationgIAlus(str, this);
            if (m158confirmVerificationgIAlus == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
            m158confirmVerificationgIAlus = ((q) obj).j();
        }
        VerificationViewModel verificationViewModel = this.this$0;
        Throwable e11 = q.e(m158confirmVerificationgIAlus);
        if (e11 == null) {
            LinkAccount linkAccount = (LinkAccount) m158confirmVerificationgIAlus;
            uVar = verificationViewModel._isProcessing;
            uVar.setValue(b.a(false));
            verificationViewModel.getOnVerificationCompleted().invoke();
        } else {
            verificationViewModel.onError(e11);
        }
        return b0.f54756a;
    }
}