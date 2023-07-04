package com.stripe.android.ui.core.cardscan;

import com.stripe.android.ui.core.databinding.ActivityCardScanBinding;
import h00.a;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class CardScanActivity$viewBinding$2 extends u implements a<ActivityCardScanBinding> {
    final /* synthetic */ CardScanActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardScanActivity$viewBinding$2(CardScanActivity cardScanActivity) {
        super(0);
        this.this$0 = cardScanActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final ActivityCardScanBinding invoke() {
        return ActivityCardScanBinding.inflate(this.this$0.getLayoutInflater());
    }
}