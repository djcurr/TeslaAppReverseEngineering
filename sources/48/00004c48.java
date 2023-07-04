package com.stripe.android.cards;

import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.AccountRange;
import kotlinx.coroutines.flow.e;
import zz.d;

/* loaded from: classes2.dex */
public interface CardAccountRangeSource {
    Object getAccountRange(CardNumber.Unvalidated unvalidated, d<? super AccountRange> dVar);

    e<Boolean> getLoading();
}