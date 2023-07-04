package com.stripe.android.cards;

import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.AccountRange;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.cards.CardAccountRangeService$queryAccountRangeRepository$1", f = "CardAccountRangeService.kt", l = {61, 66}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CardAccountRangeService$queryAccountRangeRepository$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ CardNumber.Unvalidated $cardNumber;
    int label;
    final /* synthetic */ CardAccountRangeService this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "com.stripe.android.cards.CardAccountRangeService$queryAccountRangeRepository$1$1", f = "CardAccountRangeService.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.stripe.android.cards.CardAccountRangeService$queryAccountRangeRepository$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends l implements p<o0, d<? super b0>, Object> {
        final /* synthetic */ AccountRange $accountRange;
        int label;
        final /* synthetic */ CardAccountRangeService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CardAccountRangeService cardAccountRangeService, AccountRange accountRange, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = cardAccountRangeService;
            this.$accountRange = accountRange;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<b0> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$accountRange, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, d<? super b0> dVar) {
            return ((AnonymousClass1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.label == 0) {
                r.b(obj);
                this.this$0.updateAccountRangeResult(this.$accountRange);
                return b0.f54756a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardAccountRangeService$queryAccountRangeRepository$1(CardNumber.Unvalidated unvalidated, CardAccountRangeService cardAccountRangeService, d<? super CardAccountRangeService$queryAccountRangeRepository$1> dVar) {
        super(2, dVar);
        this.$cardNumber = unvalidated;
        this.this$0 = cardAccountRangeService;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new CardAccountRangeService$queryAccountRangeRepository$1(this.$cardNumber, this.this$0, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((CardAccountRangeService$queryAccountRangeRepository$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052 A[RETURN] */
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
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            vz.r.b(r7)
            goto L53
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            vz.r.b(r7)
            goto L3b
        L1f:
            vz.r.b(r7)
            com.stripe.android.cards.CardNumber$Unvalidated r7 = r6.$cardNumber
            com.stripe.android.cards.Bin r7 = r7.getBin()
            if (r7 == 0) goto L3e
            com.stripe.android.cards.CardAccountRangeService r7 = r6.this$0
            com.stripe.android.cards.CardAccountRangeRepository r7 = com.stripe.android.cards.CardAccountRangeService.access$getCardAccountRangeRepository$p(r7)
            com.stripe.android.cards.CardNumber$Unvalidated r1 = r6.$cardNumber
            r6.label = r4
            java.lang.Object r7 = r7.getAccountRange(r1, r6)
            if (r7 != r0) goto L3b
            return r0
        L3b:
            com.stripe.android.model.AccountRange r7 = (com.stripe.android.model.AccountRange) r7
            goto L3f
        L3e:
            r7 = r2
        L3f:
            v20.l2 r1 = v20.e1.c()
            com.stripe.android.cards.CardAccountRangeService$queryAccountRangeRepository$1$1 r4 = new com.stripe.android.cards.CardAccountRangeService$queryAccountRangeRepository$1$1
            com.stripe.android.cards.CardAccountRangeService r5 = r6.this$0
            r4.<init>(r5, r7, r2)
            r6.label = r3
            java.lang.Object r7 = v20.i.g(r1, r4, r6)
            if (r7 != r0) goto L53
            return r0
        L53:
            vz.b0 r7 = vz.b0.f54756a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.cards.CardAccountRangeService$queryAccountRangeRepository$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}