package com.stripe.android.link.ui.verification;

import com.stripe.android.core.Logger;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.model.LinkAccount;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.q;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.link.ui.verification.VerificationViewModel$startVerification$1", f = "VerificationViewModel.kt", l = {93}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class VerificationViewModel$startVerification$1 extends l implements p<o0, d<? super b0>, Object> {
    int label;
    final /* synthetic */ VerificationViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationViewModel$startVerification$1(VerificationViewModel verificationViewModel, d<? super VerificationViewModel$startVerification$1> dVar) {
        super(2, dVar);
        this.this$0 = verificationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new VerificationViewModel$startVerification$1(this.this$0, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((VerificationViewModel$startVerification$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        LinkAccountManager linkAccountManager;
        Object m163startVerificationIoAF18A;
        Logger logger;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            linkAccountManager = this.this$0.linkAccountManager;
            this.label = 1;
            m163startVerificationIoAF18A = linkAccountManager.m163startVerificationIoAF18A(this);
            if (m163startVerificationIoAF18A == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
            m163startVerificationIoAF18A = ((q) obj).j();
        }
        VerificationViewModel verificationViewModel = this.this$0;
        Throwable e11 = q.e(m163startVerificationIoAF18A);
        if (e11 == null) {
            LinkAccount linkAccount = (LinkAccount) m163startVerificationIoAF18A;
            logger = verificationViewModel.logger;
            logger.info("Verification code sent");
        } else {
            verificationViewModel.onError(e11);
        }
        return b0.f54756a;
    }
}