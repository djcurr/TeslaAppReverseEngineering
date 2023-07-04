package com.stripe.android.cards;

import com.stripe.android.model.AccountRange;
import java.util.List;
import zz.d;

/* loaded from: classes2.dex */
public interface CardAccountRangeStore {
    Object contains(Bin bin, d<? super Boolean> dVar);

    Object get(Bin bin, d<? super List<AccountRange>> dVar);

    void save(Bin bin, List<AccountRange> list);
}