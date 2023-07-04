package com.stripe.android.cards;

import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.g;

/* loaded from: classes2.dex */
public final class InMemoryCardAccountRangeSource implements CardAccountRangeSource {
    private final e<Boolean> loading;
    private final CardAccountRangeStore store;

    public InMemoryCardAccountRangeSource(CardAccountRangeStore store) {
        s.g(store, "store");
        this.store = store;
        this.loading = g.x(Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b A[EDGE_INSN: B:28:0x006b->B:26:0x006b ?: BREAK  , SYNTHETIC] */
    @Override // com.stripe.android.cards.CardAccountRangeSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getAccountRange(com.stripe.android.cards.CardNumber.Unvalidated r6, zz.d<? super com.stripe.android.model.AccountRange> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.stripe.android.cards.InMemoryCardAccountRangeSource$getAccountRange$1
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.cards.InMemoryCardAccountRangeSource$getAccountRange$1 r0 = (com.stripe.android.cards.InMemoryCardAccountRangeSource$getAccountRange$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.cards.InMemoryCardAccountRangeSource$getAccountRange$1 r0 = new com.stripe.android.cards.InMemoryCardAccountRangeSource$getAccountRange$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r6 = r0.L$0
            com.stripe.android.cards.CardNumber$Unvalidated r6 = (com.stripe.android.cards.CardNumber.Unvalidated) r6
            vz.r.b(r7)
            goto L4d
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            vz.r.b(r7)
            com.stripe.android.cards.Bin r7 = r6.getBin()
            if (r7 != 0) goto L40
            goto L6d
        L40:
            com.stripe.android.cards.CardAccountRangeStore r2 = r5.store
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r2.get(r7, r0)
            if (r7 != r1) goto L4d
            return r1
        L4d:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L53:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r0 = r7.next()
            r1 = r0
            com.stripe.android.model.AccountRange r1 = (com.stripe.android.model.AccountRange) r1
            com.stripe.android.model.BinRange r1 = r1.component1()
            boolean r1 = r1.matches(r6)
            if (r1 == 0) goto L53
            r3 = r0
        L6b:
            com.stripe.android.model.AccountRange r3 = (com.stripe.android.model.AccountRange) r3
        L6d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.cards.InMemoryCardAccountRangeSource.getAccountRange(com.stripe.android.cards.CardNumber$Unvalidated, zz.d):java.lang.Object");
    }

    @Override // com.stripe.android.cards.CardAccountRangeSource
    public e<Boolean> getLoading() {
        return this.loading;
    }
}