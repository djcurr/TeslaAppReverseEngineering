package com.stripe.android.cards;

import com.stripe.android.cards.CardAccountRangeRepository;
import h00.a;
import kotlin.jvm.internal.u;

/* loaded from: classes2.dex */
final class CardWidgetViewModel$cardAccountRangeRepository$2 extends u implements a<CardAccountRangeRepository> {
    final /* synthetic */ CardAccountRangeRepository.Factory $cardAccountRangeRepositoryFactory;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardWidgetViewModel$cardAccountRangeRepository$2(CardAccountRangeRepository.Factory factory) {
        super(0);
        this.$cardAccountRangeRepositoryFactory = factory;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final CardAccountRangeRepository invoke() {
        return this.$cardAccountRangeRepositoryFactory.create();
    }
}