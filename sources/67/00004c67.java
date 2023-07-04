package com.stripe.android.cards;

import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.AccountRange;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.g;
import zz.d;

/* loaded from: classes2.dex */
public final class StaticCardAccountRangeSource implements CardAccountRangeSource {
    public static final int $stable = 8;
    private final StaticCardAccountRanges accountRanges;
    private final e<Boolean> loading;

    public StaticCardAccountRangeSource() {
        this(null, 1, null);
    }

    public StaticCardAccountRangeSource(StaticCardAccountRanges accountRanges) {
        s.g(accountRanges, "accountRanges");
        this.accountRanges = accountRanges;
        this.loading = g.x(Boolean.FALSE);
    }

    @Override // com.stripe.android.cards.CardAccountRangeSource
    public Object getAccountRange(CardNumber.Unvalidated unvalidated, d<? super AccountRange> dVar) {
        return this.accountRanges.first(unvalidated);
    }

    @Override // com.stripe.android.cards.CardAccountRangeSource
    public e<Boolean> getLoading() {
        return this.loading;
    }

    public /* synthetic */ StaticCardAccountRangeSource(StaticCardAccountRanges staticCardAccountRanges, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new DefaultStaticCardAccountRanges() : staticCardAccountRanges);
    }
}