package com.stripe.android.ui.core.elements;

import com.stripe.android.model.AccountRange;
import com.stripe.android.model.CardBrand;
import h00.q;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import vz.b0;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.ui.core.elements.CardNumberEditableController$_fieldState$1", f = "CardNumberController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class CardNumberEditableController$_fieldState$1 extends l implements q<CardBrand, String, d<? super TextFieldState>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ CardNumberEditableController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardNumberEditableController$_fieldState$1(CardNumberEditableController cardNumberEditableController, d<? super CardNumberEditableController$_fieldState$1> dVar) {
        super(3, dVar);
        this.this$0 = cardNumberEditableController;
    }

    @Override // h00.q
    public final Object invoke(CardBrand cardBrand, String str, d<? super TextFieldState> dVar) {
        CardNumberEditableController$_fieldState$1 cardNumberEditableController$_fieldState$1 = new CardNumberEditableController$_fieldState$1(this.this$0, dVar);
        cardNumberEditableController$_fieldState$1.L$0 = cardBrand;
        cardNumberEditableController$_fieldState$1.L$1 = str;
        return cardNumberEditableController$_fieldState$1.invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CardNumberConfig cardNumberConfig;
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            CardBrand cardBrand = (CardBrand) this.L$0;
            String str = (String) this.L$1;
            cardNumberConfig = this.this$0.cardTextFieldConfig;
            AccountRange accountRange = this.this$0.getAccountRangeService().getAccountRange();
            Integer c11 = accountRange == null ? null : b.c(accountRange.getPanLength());
            return cardNumberConfig.determineState(cardBrand, str, c11 == null ? cardBrand.getMaxLengthForCardNumber(str) : c11.intValue());
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}