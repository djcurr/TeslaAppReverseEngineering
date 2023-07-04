package com.stripe.android.link.ui.cardedit;

import h00.a;
import kotlin.jvm.internal.u;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class CardEditViewModel$isDefault$2 extends u implements a<Boolean> {
    final /* synthetic */ CardEditViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardEditViewModel$isDefault$2(CardEditViewModel cardEditViewModel) {
        super(0);
        this.this$0 = cardEditViewModel;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final Boolean invoke() {
        return Boolean.valueOf(this.this$0.getPaymentDetails().isDefault());
    }
}