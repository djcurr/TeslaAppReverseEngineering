package com.stripe.android.ui.core.elements;

import com.stripe.android.model.CardBrand;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.forms.FormFieldEntry;
import h00.s;
import java.util.List;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.j0;
import kotlin.text.u;
import kotlin.text.y;
import vz.b0;
import vz.p;
import vz.r;
import vz.v;
import wz.w;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.ui.core.elements.CardDetailsElement$getFormFieldValueFlow$1", f = "CardDetailsElement.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class CardDetailsElement$getFormFieldValueFlow$1 extends l implements s<FormFieldEntry, FormFieldEntry, FormFieldEntry, CardBrand, d<? super List<? extends p<? extends IdentifierSpec, ? extends FormFieldEntry>>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;
    final /* synthetic */ CardDetailsElement this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDetailsElement$getFormFieldValueFlow$1(CardDetailsElement cardDetailsElement, d<? super CardDetailsElement$getFormFieldValueFlow$1> dVar) {
        super(5, dVar);
        this.this$0 = cardDetailsElement;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(FormFieldEntry formFieldEntry, FormFieldEntry formFieldEntry2, FormFieldEntry formFieldEntry3, CardBrand cardBrand, d<? super List<p<IdentifierSpec, FormFieldEntry>>> dVar) {
        CardDetailsElement$getFormFieldValueFlow$1 cardDetailsElement$getFormFieldValueFlow$1 = new CardDetailsElement$getFormFieldValueFlow$1(this.this$0, dVar);
        cardDetailsElement$getFormFieldValueFlow$1.L$0 = formFieldEntry;
        cardDetailsElement$getFormFieldValueFlow$1.L$1 = formFieldEntry2;
        cardDetailsElement$getFormFieldValueFlow$1.L$2 = formFieldEntry3;
        cardDetailsElement$getFormFieldValueFlow$1.L$3 = cardBrand;
        return cardDetailsElement$getFormFieldValueFlow$1.invokeSuspend(b0.f54756a);
    }

    @Override // h00.s
    public /* bridge */ /* synthetic */ Object invoke(FormFieldEntry formFieldEntry, FormFieldEntry formFieldEntry2, FormFieldEntry formFieldEntry3, CardBrand cardBrand, d<? super List<? extends p<? extends IdentifierSpec, ? extends FormFieldEntry>>> dVar) {
        return invoke2(formFieldEntry, formFieldEntry2, formFieldEntry3, cardBrand, (d<? super List<p<IdentifierSpec, FormFieldEntry>>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        List l11;
        String i12;
        Integer n11;
        String j12;
        Integer n12;
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            FormFieldEntry formFieldEntry = (FormFieldEntry) this.L$0;
            FormFieldEntry formFieldEntry2 = (FormFieldEntry) this.L$1;
            FormFieldEntry formFieldEntry3 = (FormFieldEntry) this.L$2;
            CardBrand cardBrand = (CardBrand) this.L$3;
            j0 j0Var = new j0();
            j0Var.f34912a = -1;
            j0 j0Var2 = new j0();
            j0Var2.f34912a = -1;
            String value = formFieldEntry3.getValue();
            if (value != null) {
                String convertTo4DigitDate = DateUtilsKt.convertTo4DigitDate(value);
                if (convertTo4DigitDate.length() == 4) {
                    i12 = y.i1(convertTo4DigitDate, 2);
                    n11 = u.n(i12);
                    if (n11 != null) {
                        j0Var.f34912a = n11.intValue();
                        j12 = y.j1(convertTo4DigitDate, 2);
                        n12 = u.n(j12);
                        if (n12 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        j0Var2.f34912a = n12.intValue() + 2000;
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
            }
            IdentifierSpec.Companion companion = IdentifierSpec.Companion;
            l11 = w.l(v.a(this.this$0.getController().getNumberElement().getIdentifier(), formFieldEntry), v.a(this.this$0.getController().getCvcElement().getIdentifier(), formFieldEntry2), v.a(companion.getCardBrand(), new FormFieldEntry(cardBrand.getCode(), true)), v.a(companion.getCardExpMonth(), FormFieldEntry.copy$default(formFieldEntry3, String.valueOf(j0Var.f34912a), false, 2, null)), v.a(companion.getCardExpYear(), FormFieldEntry.copy$default(formFieldEntry3, String.valueOf(j0Var2.f34912a), false, 2, null)));
            return l11;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}