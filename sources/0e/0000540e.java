package com.stripe.android.payments.core.authentication.threeds2;

import androidx.lifecycle.w;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import h00.l;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import v20.a2;
import v20.o0;
import vz.b0;
import vz.k;
import vz.r;
import zz.d;

/* loaded from: classes6.dex */
final class Stripe3ds2TransactionActivity$onCreate$onChallengeResult$1 extends u implements l<ChallengeResult, a2> {
    final /* synthetic */ k<Stripe3ds2TransactionViewModel> $viewModel$delegate;
    final /* synthetic */ Stripe3ds2TransactionActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$onCreate$onChallengeResult$1$1", f = "Stripe3ds2TransactionActivity.kt", l = {88}, m = "invokeSuspend")
    /* renamed from: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$onCreate$onChallengeResult$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p<o0, d<? super b0>, Object> {
        final /* synthetic */ ChallengeResult $challengeResult;
        final /* synthetic */ k<Stripe3ds2TransactionViewModel> $viewModel$delegate;
        Object L$0;
        int label;
        final /* synthetic */ Stripe3ds2TransactionActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Stripe3ds2TransactionActivity stripe3ds2TransactionActivity, ChallengeResult challengeResult, k<Stripe3ds2TransactionViewModel> kVar, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = stripe3ds2TransactionActivity;
            this.$challengeResult = challengeResult;
            this.$viewModel$delegate = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<b0> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$challengeResult, this.$viewModel$delegate, dVar);
        }

        @Override // h00.p
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object mo160invoke(o0 o0Var, d<? super b0> dVar) {
            return ((AnonymousClass1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            Stripe3ds2TransactionViewModel m285onCreate$lambda6;
            Stripe3ds2TransactionActivity stripe3ds2TransactionActivity;
            d11 = a00.d.d();
            int i11 = this.label;
            if (i11 == 0) {
                r.b(obj);
                Stripe3ds2TransactionActivity stripe3ds2TransactionActivity2 = this.this$0;
                m285onCreate$lambda6 = Stripe3ds2TransactionActivity.m285onCreate$lambda6(this.$viewModel$delegate);
                ChallengeResult challengeResult = this.$challengeResult;
                this.L$0 = stripe3ds2TransactionActivity2;
                this.label = 1;
                Object processChallengeResult = m285onCreate$lambda6.processChallengeResult(challengeResult, this);
                if (processChallengeResult == d11) {
                    return d11;
                }
                stripe3ds2TransactionActivity = stripe3ds2TransactionActivity2;
                obj = processChallengeResult;
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                stripe3ds2TransactionActivity = (Stripe3ds2TransactionActivity) this.L$0;
                r.b(obj);
            }
            stripe3ds2TransactionActivity.finishWithResult((PaymentFlowResult.Unvalidated) obj);
            return b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Stripe3ds2TransactionActivity$onCreate$onChallengeResult$1(Stripe3ds2TransactionActivity stripe3ds2TransactionActivity, k<Stripe3ds2TransactionViewModel> kVar) {
        super(1);
        this.this$0 = stripe3ds2TransactionActivity;
        this.$viewModel$delegate = kVar;
    }

    @Override // h00.l
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final a2 mo12invoke(ChallengeResult challengeResult) {
        a2 d11;
        s.g(challengeResult, "challengeResult");
        d11 = v20.k.d(w.a(this.this$0), null, null, new AnonymousClass1(this.this$0, challengeResult, this.$viewModel$delegate, null), 3, null);
        return d11;
    }
}