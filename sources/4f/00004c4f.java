package com.stripe.android.cards;

import android.app.Application;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.b;
import androidx.lifecycle.g;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.AccountRange;
import kotlin.jvm.internal.s;
import vz.k;
import vz.m;

/* loaded from: classes2.dex */
public final class CardWidgetViewModel extends b {
    private final k cardAccountRangeRepository$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardWidgetViewModel(Application application, CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory) {
        super(application);
        k a11;
        s.g(application, "application");
        s.g(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        a11 = m.a(new CardWidgetViewModel$cardAccountRangeRepository$2(cardAccountRangeRepositoryFactory));
        this.cardAccountRangeRepository$delegate = a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CardAccountRangeRepository getCardAccountRangeRepository() {
        return (CardAccountRangeRepository) this.cardAccountRangeRepository$delegate.getValue();
    }

    public final LiveData<AccountRange> getAccountRange(CardNumber.Unvalidated cardNumber) {
        s.g(cardNumber, "cardNumber");
        return g.b(null, 0L, new CardWidgetViewModel$getAccountRange$1(this, cardNumber, null), 3, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardWidgetViewModel(Application application) {
        this(application, new DefaultCardAccountRangeRepositoryFactory(application));
        s.g(application, "application");
    }
}