package com.stripe.android.ui.core.elements;

import android.content.Context;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import h00.a;
import h00.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.text.y;
import kotlinx.coroutines.flow.e;
import vz.b0;
import vz.r;
import wz.e0;
import wz.p;
import wz.w;
import wz.x;
import y20.i;
import zz.d;

/* loaded from: classes6.dex */
public final class CardDetailsController implements SectionFieldErrorController {
    private final CvcElement cvcElement;
    private final e<FieldError> error;
    private final SimpleTextElement expirationDateElement;
    private final List<SectionFieldElement> fields;
    private final Integer label;
    private final CardNumberElement numberElement;
    private final List<SectionSingleFieldElement> rowFields;

    public CardDetailsController(Context context, Map<IdentifierSpec, String> initialValues, boolean z11) {
        CardNumberController cardNumberEditableController;
        List<SectionSingleFieldElement> l11;
        List<SectionFieldElement> l12;
        List<SectionSingleFieldElement> l13;
        int t11;
        int t12;
        List O0;
        s.g(context, "context");
        s.g(initialValues, "initialValues");
        IdentifierSpec.Companion companion = IdentifierSpec.Companion;
        IdentifierSpec cardNumber = companion.getCardNumber();
        if (z11) {
            cardNumberEditableController = new CardNumberViewOnlyController(new CardNumberConfig(), initialValues);
        } else {
            cardNumberEditableController = new CardNumberEditableController(new CardNumberConfig(), context, initialValues.get(companion.getCardNumber()));
        }
        CardNumberElement cardNumberElement = new CardNumberElement(cardNumber, cardNumberEditableController);
        this.numberElement = cardNumberElement;
        CvcElement cvcElement = new CvcElement(companion.getCardCvc(), new CvcController(new CvcConfig(), cardNumberElement.getController().getCardBrandFlow(), initialValues.get(companion.getCardCvc()), false, 8, null));
        this.cvcElement = cvcElement;
        IdentifierSpec Generic = companion.Generic("date");
        DateConfig dateConfig = new DateConfig();
        String str = initialValues.get(companion.getCardExpMonth());
        String str2 = initialValues.get(companion.getCardExpYear());
        SimpleTextElement simpleTextElement = new SimpleTextElement(Generic, new SimpleTextFieldController(dateConfig, false, s.p(str, str2 == null ? null : y.j1(str2, 2)), 2, null));
        this.expirationDateElement = simpleTextElement;
        l11 = w.l(simpleTextElement, cvcElement);
        this.rowFields = l11;
        l12 = w.l(cardNumberElement, new RowElement(companion.Generic(s.p("row_", Long.valueOf(UUID.randomUUID().getLeastSignificantBits()))), l11, new RowController(l11)));
        this.fields = l12;
        l13 = w.l(cardNumberElement, simpleTextElement, cvcElement);
        t11 = x.t(l13, 10);
        ArrayList<InputController> arrayList = new ArrayList(t11);
        for (SectionSingleFieldElement sectionSingleFieldElement : l13) {
            arrayList.add(sectionSingleFieldElement.getController());
        }
        t12 = x.t(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(t12);
        for (InputController inputController : arrayList) {
            arrayList2.add(inputController.getError());
        }
        O0 = e0.O0(arrayList2);
        Object[] array = O0.toArray(new e[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        final e[] eVarArr = (e[]) array;
        this.error = new e<FieldError>() { // from class: com.stripe.android.ui.core.elements.CardDetailsController$special$$inlined$combine$1

            /* renamed from: com.stripe.android.ui.core.elements.CardDetailsController$special$$inlined$combine$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            static final class AnonymousClass2 extends u implements a<FieldError[]> {
                final /* synthetic */ e[] $flowArray;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(e[] eVarArr) {
                    super(0);
                    this.$flowArray = eVarArr;
                }

                @Override // h00.a
                public final FieldError[] invoke() {
                    return new FieldError[this.$flowArray.length];
                }
            }

            @f(c = "com.stripe.android.ui.core.elements.CardDetailsController$special$$inlined$combine$1$3", f = "CardDetailsController.kt", l = {333}, m = "invokeSuspend")
            /* renamed from: com.stripe.android.ui.core.elements.CardDetailsController$special$$inlined$combine$1$3  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass3 extends l implements q<kotlinx.coroutines.flow.f<? super FieldError>, FieldError[], d<? super b0>, Object> {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                public AnonymousClass3(d dVar) {
                    super(3, dVar);
                }

                @Override // h00.q
                public final Object invoke(kotlinx.coroutines.flow.f<? super FieldError> fVar, FieldError[] fieldErrorArr, d<? super b0> dVar) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(dVar);
                    anonymousClass3.L$0 = fVar;
                    anonymousClass3.L$1 = fieldErrorArr;
                    return anonymousClass3.invokeSuspend(b0.f54756a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d11;
                    List E;
                    d11 = a00.d.d();
                    int i11 = this.label;
                    if (i11 == 0) {
                        r.b(obj);
                        E = p.E((FieldError[]) ((Object[]) this.L$1));
                        Object d02 = wz.u.d0(E);
                        this.label = 1;
                        if (((kotlinx.coroutines.flow.f) this.L$0).emit(d02, this) == d11) {
                            return d11;
                        }
                    } else if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        r.b(obj);
                    }
                    return b0.f54756a;
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(kotlinx.coroutines.flow.f<? super FieldError> fVar, d dVar) {
                Object d11;
                e[] eVarArr2 = eVarArr;
                Object a11 = i.a(fVar, eVarArr2, new AnonymousClass2(eVarArr2), new AnonymousClass3(null), dVar);
                d11 = a00.d.d();
                return a11 == d11 ? a11 : b0.f54756a;
            }
        };
    }

    public final CvcElement getCvcElement() {
        return this.cvcElement;
    }

    @Override // com.stripe.android.ui.core.elements.SectionFieldErrorController
    public e<FieldError> getError() {
        return this.error;
    }

    public final SimpleTextElement getExpirationDateElement() {
        return this.expirationDateElement;
    }

    public final List<SectionFieldElement> getFields() {
        return this.fields;
    }

    public final Integer getLabel() {
        return this.label;
    }

    public final CardNumberElement getNumberElement() {
        return this.numberElement;
    }

    public /* synthetic */ CardDetailsController(Context context, Map map, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, map, (i11 & 4) != 0 ? false : z11);
    }
}