package com.stripe.android.ui.core.elements;

import com.stripe.android.ui.core.forms.FormFieldEntry;
import h00.a;
import h00.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.e;
import vz.b0;
import vz.p;
import vz.r;
import wz.e0;
import wz.x;
import y20.i;
import zz.d;

/* loaded from: classes6.dex */
public final class RowElement extends SectionMultiFieldElement {
    public static final int $stable = 8;
    private final RowController controller;
    private final List<SectionSingleFieldElement> fields;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RowElement(IdentifierSpec _identifier, List<? extends SectionSingleFieldElement> fields, RowController controller) {
        super(_identifier, null);
        s.g(_identifier, "_identifier");
        s.g(fields, "fields");
        s.g(controller, "controller");
        this.fields = fields;
        this.controller = controller;
    }

    public final RowController getController() {
        return this.controller;
    }

    public final List<SectionSingleFieldElement> getFields() {
        return this.fields;
    }

    @Override // com.stripe.android.ui.core.elements.SectionFieldElement
    public e<List<p<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow() {
        int t11;
        List O0;
        List<SectionSingleFieldElement> list = this.fields;
        t11 = x.t(list, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (SectionSingleFieldElement sectionSingleFieldElement : list) {
            arrayList.add(sectionSingleFieldElement.getFormFieldValueFlow());
        }
        O0 = e0.O0(arrayList);
        Object[] array = O0.toArray(new e[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        final e[] eVarArr = (e[]) array;
        return new e<List<? extends p<? extends IdentifierSpec, ? extends FormFieldEntry>>>() { // from class: com.stripe.android.ui.core.elements.RowElement$getFormFieldValueFlow$$inlined$combine$1

            /* renamed from: com.stripe.android.ui.core.elements.RowElement$getFormFieldValueFlow$$inlined$combine$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            static final class AnonymousClass2 extends u implements a<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[]> {
                final /* synthetic */ e[] $flowArray;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(e[] eVarArr) {
                    super(0);
                    this.$flowArray = eVarArr;
                }

                @Override // h00.a
                public final List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[] invoke() {
                    return new List[this.$flowArray.length];
                }
            }

            @f(c = "com.stripe.android.ui.core.elements.RowElement$getFormFieldValueFlow$$inlined$combine$1$3", f = "RowElement.kt", l = {333}, m = "invokeSuspend")
            /* renamed from: com.stripe.android.ui.core.elements.RowElement$getFormFieldValueFlow$$inlined$combine$1$3  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass3 extends l implements q<kotlinx.coroutines.flow.f<? super List<? extends p<? extends IdentifierSpec, ? extends FormFieldEntry>>>, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[], d<? super b0>, Object> {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                public AnonymousClass3(d dVar) {
                    super(3, dVar);
                }

                @Override // h00.q
                public final Object invoke(kotlinx.coroutines.flow.f<? super List<? extends p<? extends IdentifierSpec, ? extends FormFieldEntry>>> fVar, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[] listArr, d<? super b0> dVar) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(dVar);
                    anonymousClass3.L$0 = fVar;
                    anonymousClass3.L$1 = listArr;
                    return anonymousClass3.invokeSuspend(b0.f54756a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d11;
                    List s02;
                    List v11;
                    d11 = a00.d.d();
                    int i11 = this.label;
                    if (i11 == 0) {
                        r.b(obj);
                        s02 = wz.p.s0((List[]) ((Object[]) this.L$1));
                        v11 = x.v(s02);
                        this.label = 1;
                        if (((kotlinx.coroutines.flow.f) this.L$0).emit(v11, this) == d11) {
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
            public Object collect(kotlinx.coroutines.flow.f<? super List<? extends p<? extends IdentifierSpec, ? extends FormFieldEntry>>> fVar, d dVar) {
                Object d11;
                e[] eVarArr2 = eVarArr;
                Object a11 = i.a(fVar, eVarArr2, new AnonymousClass2(eVarArr2), new AnonymousClass3(null), dVar);
                d11 = a00.d.d();
                return a11 == d11 ? a11 : b0.f54756a;
            }
        };
    }

    @Override // com.stripe.android.ui.core.elements.SectionFieldElement
    public e<List<IdentifierSpec>> getTextFieldIdentifiers() {
        int t11;
        List<SectionSingleFieldElement> list = this.fields;
        t11 = x.t(list, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (SectionSingleFieldElement sectionSingleFieldElement : list) {
            arrayList.add(sectionSingleFieldElement.getTextFieldIdentifiers());
        }
        return (e) wz.u.n0(arrayList);
    }

    @Override // com.stripe.android.ui.core.elements.SectionFieldElement
    public void setRawValue(Map<IdentifierSpec, String> rawValuesMap) {
        s.g(rawValuesMap, "rawValuesMap");
        for (SectionSingleFieldElement sectionSingleFieldElement : this.fields) {
            sectionSingleFieldElement.setRawValue(rawValuesMap);
        }
    }

    @Override // com.stripe.android.ui.core.elements.SectionFieldElement
    public RowController sectionFieldErrorController() {
        return this.controller;
    }
}