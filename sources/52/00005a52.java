package com.stripe.android.ui.core.elements;

import com.stripe.android.model.CardBrand;
import h00.q;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import vz.b0;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.ui.core.elements.CvcController$_fieldState$1", f = "CvcController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class CvcController$_fieldState$1 extends l implements q<CardBrand, String, d<? super TextFieldState>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ CvcController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CvcController$_fieldState$1(CvcController cvcController, d<? super CvcController$_fieldState$1> dVar) {
        super(3, dVar);
        this.this$0 = cvcController;
    }

    @Override // h00.q
    public final Object invoke(CardBrand cardBrand, String str, d<? super TextFieldState> dVar) {
        CvcController$_fieldState$1 cvcController$_fieldState$1 = new CvcController$_fieldState$1(this.this$0, dVar);
        cvcController$_fieldState$1.L$0 = cardBrand;
        cvcController$_fieldState$1.L$1 = str;
        return cvcController$_fieldState$1.invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CvcConfig cvcConfig;
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            CardBrand cardBrand = (CardBrand) this.L$0;
            cvcConfig = this.this$0.cvcTextFieldConfig;
            return cvcConfig.determineState(cardBrand, (String) this.L$1, cardBrand.getMaxCvcLength());
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}