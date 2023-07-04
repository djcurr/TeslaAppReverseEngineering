package com.stripe.android.cards;

import androidx.lifecycle.b0;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.AccountRange;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import vz.r;
import zz.d;

@f(c = "com.stripe.android.cards.CardWidgetViewModel$getAccountRange$1", f = "CardWidgetViewModel.kt", l = {29, 29}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CardWidgetViewModel$getAccountRange$1 extends l implements p<b0<AccountRange>, d<? super vz.b0>, Object> {
    final /* synthetic */ CardNumber.Unvalidated $cardNumber;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CardWidgetViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardWidgetViewModel$getAccountRange$1(CardWidgetViewModel cardWidgetViewModel, CardNumber.Unvalidated unvalidated, d<? super CardWidgetViewModel$getAccountRange$1> dVar) {
        super(2, dVar);
        this.this$0 = cardWidgetViewModel;
        this.$cardNumber = unvalidated;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<vz.b0> create(Object obj, d<?> dVar) {
        CardWidgetViewModel$getAccountRange$1 cardWidgetViewModel$getAccountRange$1 = new CardWidgetViewModel$getAccountRange$1(this.this$0, this.$cardNumber, dVar);
        cardWidgetViewModel$getAccountRange$1.L$0 = obj;
        return cardWidgetViewModel$getAccountRange$1;
    }

    @Override // h00.p
    public final Object invoke(b0<AccountRange> b0Var, d<? super vz.b0> dVar) {
        return ((CardWidgetViewModel$getAccountRange$1) create(b0Var, dVar)).invokeSuspend(vz.b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        b0 b0Var;
        CardAccountRangeRepository cardAccountRangeRepository;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            b0Var = (b0) this.L$0;
            cardAccountRangeRepository = this.this$0.getCardAccountRangeRepository();
            CardNumber.Unvalidated unvalidated = this.$cardNumber;
            this.L$0 = b0Var;
            this.label = 1;
            obj = cardAccountRangeRepository.getAccountRange(unvalidated, this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return vz.b0.f54756a;
        } else {
            b0Var = (b0) this.L$0;
            r.b(obj);
        }
        this.L$0 = null;
        this.label = 2;
        if (b0Var.emit(obj, this) == d11) {
            return d11;
        }
        return vz.b0.f54756a;
    }
}