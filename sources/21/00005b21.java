package com.stripe.android.ui.core.elements;

import ch.qos.logback.core.CoreConstants;
import com.stripe.android.ui.core.forms.FormFieldEntry;
import h00.a;
import h00.q;
import java.util.ArrayList;
import java.util.List;
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
public final class SectionElement extends FormElement {
    public static final int $stable = 8;
    private final SectionController controller;
    private final List<SectionFieldElement> fields;
    private final IdentifierSpec identifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SectionElement(IdentifierSpec identifier, List<? extends SectionFieldElement> fields, SectionController controller) {
        super(null);
        s.g(identifier, "identifier");
        s.g(fields, "fields");
        s.g(controller, "controller");
        this.identifier = identifier;
        this.fields = fields;
        this.controller = controller;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SectionElement copy$default(SectionElement sectionElement, IdentifierSpec identifierSpec, List list, SectionController sectionController, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            identifierSpec = sectionElement.getIdentifier();
        }
        if ((i11 & 2) != 0) {
            list = sectionElement.fields;
        }
        if ((i11 & 4) != 0) {
            sectionController = sectionElement.getController();
        }
        return sectionElement.copy(identifierSpec, list, sectionController);
    }

    public final IdentifierSpec component1() {
        return getIdentifier();
    }

    public final List<SectionFieldElement> component2() {
        return this.fields;
    }

    public final SectionController component3() {
        return getController();
    }

    public final SectionElement copy(IdentifierSpec identifier, List<? extends SectionFieldElement> fields, SectionController controller) {
        s.g(identifier, "identifier");
        s.g(fields, "fields");
        s.g(controller, "controller");
        return new SectionElement(identifier, fields, controller);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SectionElement) {
            SectionElement sectionElement = (SectionElement) obj;
            return s.c(getIdentifier(), sectionElement.getIdentifier()) && s.c(this.fields, sectionElement.fields) && s.c(getController(), sectionElement.getController());
        }
        return false;
    }

    public final List<SectionFieldElement> getFields() {
        return this.fields;
    }

    @Override // com.stripe.android.ui.core.elements.FormElement
    public e<List<p<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow() {
        int t11;
        List O0;
        List<SectionFieldElement> list = this.fields;
        t11 = x.t(list, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (SectionFieldElement sectionFieldElement : list) {
            arrayList.add(sectionFieldElement.getFormFieldValueFlow());
        }
        O0 = e0.O0(arrayList);
        Object[] array = O0.toArray(new e[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        final e[] eVarArr = (e[]) array;
        return new e<List<? extends p<? extends IdentifierSpec, ? extends FormFieldEntry>>>() { // from class: com.stripe.android.ui.core.elements.SectionElement$getFormFieldValueFlow$$inlined$combine$1

            /* renamed from: com.stripe.android.ui.core.elements.SectionElement$getFormFieldValueFlow$$inlined$combine$1$2  reason: invalid class name */
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

            @f(c = "com.stripe.android.ui.core.elements.SectionElement$getFormFieldValueFlow$$inlined$combine$1$3", f = "SectionElement.kt", l = {333}, m = "invokeSuspend")
            /* renamed from: com.stripe.android.ui.core.elements.SectionElement$getFormFieldValueFlow$$inlined$combine$1$3  reason: invalid class name */
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

    @Override // com.stripe.android.ui.core.elements.FormElement
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    @Override // com.stripe.android.ui.core.elements.FormElement
    public e<List<IdentifierSpec>> getTextFieldIdentifiers() {
        int t11;
        List O0;
        List<SectionFieldElement> list = this.fields;
        t11 = x.t(list, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (SectionFieldElement sectionFieldElement : list) {
            arrayList.add(sectionFieldElement.getTextFieldIdentifiers());
        }
        O0 = e0.O0(arrayList);
        Object[] array = O0.toArray(new e[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        final e[] eVarArr = (e[]) array;
        return new e<List<? extends IdentifierSpec>>() { // from class: com.stripe.android.ui.core.elements.SectionElement$getTextFieldIdentifiers$$inlined$combine$1

            /* renamed from: com.stripe.android.ui.core.elements.SectionElement$getTextFieldIdentifiers$$inlined$combine$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            static final class AnonymousClass2 extends u implements a<List<? extends IdentifierSpec>[]> {
                final /* synthetic */ e[] $flowArray;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(e[] eVarArr) {
                    super(0);
                    this.$flowArray = eVarArr;
                }

                @Override // h00.a
                public final List<? extends IdentifierSpec>[] invoke() {
                    return new List[this.$flowArray.length];
                }
            }

            @f(c = "com.stripe.android.ui.core.elements.SectionElement$getTextFieldIdentifiers$$inlined$combine$1$3", f = "SectionElement.kt", l = {333}, m = "invokeSuspend")
            /* renamed from: com.stripe.android.ui.core.elements.SectionElement$getTextFieldIdentifiers$$inlined$combine$1$3  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass3 extends l implements q<kotlinx.coroutines.flow.f<? super List<? extends IdentifierSpec>>, List<? extends IdentifierSpec>[], d<? super b0>, Object> {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                public AnonymousClass3(d dVar) {
                    super(3, dVar);
                }

                @Override // h00.q
                public final Object invoke(kotlinx.coroutines.flow.f<? super List<? extends IdentifierSpec>> fVar, List<? extends IdentifierSpec>[] listArr, d<? super b0> dVar) {
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
            public Object collect(kotlinx.coroutines.flow.f<? super List<? extends IdentifierSpec>> fVar, d dVar) {
                Object d11;
                e[] eVarArr2 = eVarArr;
                Object a11 = i.a(fVar, eVarArr2, new AnonymousClass2(eVarArr2), new AnonymousClass3(null), dVar);
                d11 = a00.d.d();
                return a11 == d11 ? a11 : b0.f54756a;
            }
        };
    }

    public int hashCode() {
        return (((getIdentifier().hashCode() * 31) + this.fields.hashCode()) * 31) + getController().hashCode();
    }

    public String toString() {
        return "SectionElement(identifier=" + getIdentifier() + ", fields=" + this.fields + ", controller=" + getController() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // com.stripe.android.ui.core.elements.FormElement
    public SectionController getController() {
        return this.controller;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SectionElement(com.stripe.android.ui.core.elements.IdentifierSpec r2, com.stripe.android.ui.core.elements.SectionFieldElement r3, com.stripe.android.ui.core.elements.SectionController r4) {
        /*
            r1 = this;
            java.lang.String r0 = "identifier"
            kotlin.jvm.internal.s.g(r2, r0)
            java.lang.String r0 = "field"
            kotlin.jvm.internal.s.g(r3, r0)
            java.lang.String r0 = "controller"
            kotlin.jvm.internal.s.g(r4, r0)
            java.util.List r3 = wz.u.d(r3)
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.SectionElement.<init>(com.stripe.android.ui.core.elements.IdentifierSpec, com.stripe.android.ui.core.elements.SectionFieldElement, com.stripe.android.ui.core.elements.SectionController):void");
    }
}