package com.stripe.android.ui.core.elements;

import com.stripe.android.ui.core.forms.FormFieldEntry;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.j0;
import vz.b0;
import vz.p;
import wz.v;
import wz.w;

/* loaded from: classes6.dex */
public abstract class SectionSingleFieldElement implements SectionFieldElement {
    public static final int $stable = 0;
    private final IdentifierSpec identifier;

    private SectionSingleFieldElement(IdentifierSpec identifierSpec) {
        this.identifier = identifierSpec;
    }

    public /* synthetic */ SectionSingleFieldElement(IdentifierSpec identifierSpec, DefaultConstructorMarker defaultConstructorMarker) {
        this(identifierSpec);
    }

    public abstract InputController getController();

    @Override // com.stripe.android.ui.core.elements.SectionFieldElement
    public e<List<p<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow() {
        final e<FormFieldEntry> formFieldValue = getController().getFormFieldValue();
        return new e<List<? extends p<? extends IdentifierSpec, ? extends FormFieldEntry>>>() { // from class: com.stripe.android.ui.core.elements.SectionSingleFieldElement$getFormFieldValueFlow$$inlined$map$1

            /* renamed from: com.stripe.android.ui.core.elements.SectionSingleFieldElement$getFormFieldValueFlow$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;
                final /* synthetic */ SectionSingleFieldElement this$0;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.ui.core.elements.SectionSingleFieldElement$getFormFieldValueFlow$$inlined$map$1$2", f = "SectionSingleFieldElement.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.ui.core.elements.SectionSingleFieldElement$getFormFieldValueFlow$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(zz.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(f fVar, SectionSingleFieldElement sectionSingleFieldElement) {
                    this.$this_unsafeFlow = fVar;
                    this.this$0 = sectionSingleFieldElement;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, zz.d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.stripe.android.ui.core.elements.SectionSingleFieldElement$getFormFieldValueFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.stripe.android.ui.core.elements.SectionSingleFieldElement$getFormFieldValueFlow$$inlined$map$1$2$1 r0 = (com.stripe.android.ui.core.elements.SectionSingleFieldElement$getFormFieldValueFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.ui.core.elements.SectionSingleFieldElement$getFormFieldValueFlow$$inlined$map$1$2$1 r0 = new com.stripe.android.ui.core.elements.SectionSingleFieldElement$getFormFieldValueFlow$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r6)
                        goto L4f
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        vz.r.b(r6)
                        kotlinx.coroutines.flow.f r6 = r4.$this_unsafeFlow
                        com.stripe.android.ui.core.forms.FormFieldEntry r5 = (com.stripe.android.ui.core.forms.FormFieldEntry) r5
                        com.stripe.android.ui.core.elements.SectionSingleFieldElement r2 = r4.this$0
                        com.stripe.android.ui.core.elements.IdentifierSpec r2 = r2.getIdentifier()
                        vz.p r5 = vz.v.a(r2, r5)
                        java.util.List r5 = wz.u.d(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4f
                        return r1
                    L4f:
                        vz.b0 r5 = vz.b0.f54756a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.SectionSingleFieldElement$getFormFieldValueFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(f<? super List<? extends p<? extends IdentifierSpec, ? extends FormFieldEntry>>> fVar, zz.d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar, this), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        };
    }

    @Override // com.stripe.android.ui.core.elements.SectionFieldElement
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    @Override // com.stripe.android.ui.core.elements.SectionFieldElement
    public e<List<IdentifierSpec>> getTextFieldIdentifiers() {
        List d11;
        d11 = v.d(getIdentifier());
        if (!(getController() instanceof TextFieldController)) {
            d11 = null;
        }
        if (d11 == null) {
            d11 = w.i();
        }
        return j0.a(d11);
    }

    @Override // com.stripe.android.ui.core.elements.SectionFieldElement
    public SectionFieldErrorController sectionFieldErrorController() {
        return getController();
    }

    @Override // com.stripe.android.ui.core.elements.SectionFieldElement
    public void setRawValue(Map<IdentifierSpec, String> rawValuesMap) {
        s.g(rawValuesMap, "rawValuesMap");
        String str = rawValuesMap.get(getIdentifier());
        if (str == null) {
            return;
        }
        getController().onRawValueChange(str);
    }
}