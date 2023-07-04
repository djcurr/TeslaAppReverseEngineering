package com.stripe.android.ui.core.elements;

import com.stripe.android.ui.core.address.AddressFieldElementRepository;
import com.stripe.android.ui.core.forms.FormFieldEntry;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.g;
import vz.b0;
import vz.p;

/* loaded from: classes6.dex */
public class AddressElement extends SectionMultiFieldElement {
    public static final int $stable = 8;
    private final AddressFieldElementRepository addressFieldRepository;
    private final AddressController controller;
    private final CountryElement countryElement;
    private final e<List<SectionFieldElement>> fields;
    private final e<List<SectionFieldElement>> otherFields;
    private Map<IdentifierSpec, String> rawValuesMap;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ AddressElement(com.stripe.android.ui.core.elements.IdentifierSpec r12, com.stripe.android.ui.core.address.AddressFieldElementRepository r13, java.util.Map r14, java.util.Set r15, com.stripe.android.ui.core.elements.DropdownFieldController r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r11 = this;
            r0 = r17 & 4
            if (r0 == 0) goto La
            java.util.Map r0 = wz.p0.i()
            r4 = r0
            goto Lb
        La:
            r4 = r14
        Lb:
            r0 = r17 & 8
            if (r0 == 0) goto L14
            java.util.Set r0 = wz.v0.d()
            goto L15
        L14:
            r0 = r15
        L15:
            r1 = r17 & 16
            if (r1 == 0) goto L37
            com.stripe.android.ui.core.elements.DropdownFieldController r1 = new com.stripe.android.ui.core.elements.DropdownFieldController
            com.stripe.android.ui.core.elements.CountryConfig r2 = new com.stripe.android.ui.core.elements.CountryConfig
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            r5 = r2
            r6 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            com.stripe.android.ui.core.elements.IdentifierSpec$Companion r3 = com.stripe.android.ui.core.elements.IdentifierSpec.Companion
            com.stripe.android.ui.core.elements.IdentifierSpec r3 = r3.getCountry()
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r1.<init>(r2, r3)
            r6 = r1
            goto L39
        L37:
            r6 = r16
        L39:
            r1 = r11
            r2 = r12
            r3 = r13
            r5 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.AddressElement.<init>(com.stripe.android.ui.core.elements.IdentifierSpec, com.stripe.android.ui.core.address.AddressFieldElementRepository, java.util.Map, java.util.Set, com.stripe.android.ui.core.elements.DropdownFieldController, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static final /* synthetic */ AddressFieldElementRepository access$getAddressFieldRepository$p(AddressElement addressElement) {
        return addressElement.addressFieldRepository;
    }

    public static final /* synthetic */ Map access$getRawValuesMap$p(AddressElement addressElement) {
        return addressElement.rawValuesMap;
    }

    public static /* synthetic */ void getCountryElement$annotations() {
    }

    public final AddressController getController() {
        return this.controller;
    }

    public final CountryElement getCountryElement() {
        return this.countryElement;
    }

    public final e<List<SectionFieldElement>> getFields() {
        return this.fields;
    }

    @Override // com.stripe.android.ui.core.elements.SectionFieldElement
    public e<List<p<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow() {
        return g.G(this.fields, new AddressElement$getFormFieldValueFlow$$inlined$flatMapLatest$1(null));
    }

    @Override // com.stripe.android.ui.core.elements.SectionFieldElement
    public e<List<IdentifierSpec>> getTextFieldIdentifiers() {
        return g.G(this.fields, new AddressElement$getTextFieldIdentifiers$$inlined$flatMapLatest$1(null));
    }

    @Override // com.stripe.android.ui.core.elements.SectionFieldElement
    public SectionFieldErrorController sectionFieldErrorController() {
        return this.controller;
    }

    @Override // com.stripe.android.ui.core.elements.SectionFieldElement
    public void setRawValue(Map<IdentifierSpec, String> rawValuesMap) {
        s.g(rawValuesMap, "rawValuesMap");
        this.rawValuesMap = rawValuesMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressElement(IdentifierSpec _identifier, AddressFieldElementRepository addressFieldRepository, Map<IdentifierSpec, String> rawValuesMap, Set<String> countryCodes, DropdownFieldController countryDropdownFieldController) {
        super(_identifier, null);
        s.g(_identifier, "_identifier");
        s.g(addressFieldRepository, "addressFieldRepository");
        s.g(rawValuesMap, "rawValuesMap");
        s.g(countryCodes, "countryCodes");
        s.g(countryDropdownFieldController, "countryDropdownFieldController");
        this.addressFieldRepository = addressFieldRepository;
        this.rawValuesMap = rawValuesMap;
        CountryElement countryElement = new CountryElement(IdentifierSpec.Companion.getCountry(), countryDropdownFieldController);
        this.countryElement = countryElement;
        final e k11 = g.k(countryElement.getController().getRawFieldValue());
        final e<List<? extends SectionFieldElement>> eVar = new e<List<? extends SectionFieldElement>>() { // from class: com.stripe.android.ui.core.elements.AddressElement$special$$inlined$map$1

            /* renamed from: com.stripe.android.ui.core.elements.AddressElement$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;
                final /* synthetic */ AddressElement this$0;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.ui.core.elements.AddressElement$special$$inlined$map$1$2", f = "AddressElement.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.ui.core.elements.AddressElement$special$$inlined$map$1$2$1  reason: invalid class name */
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

                public AnonymousClass2(f fVar, AddressElement addressElement) {
                    this.$this_unsafeFlow = fVar;
                    this.this$0 = addressElement;
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
                        boolean r0 = r6 instanceof com.stripe.android.ui.core.elements.AddressElement$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.stripe.android.ui.core.elements.AddressElement$special$$inlined$map$1$2$1 r0 = (com.stripe.android.ui.core.elements.AddressElement$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.ui.core.elements.AddressElement$special$$inlined$map$1$2$1 r0 = new com.stripe.android.ui.core.elements.AddressElement$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r6)
                        goto L51
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        vz.r.b(r6)
                        kotlinx.coroutines.flow.f r6 = r4.$this_unsafeFlow
                        java.lang.String r5 = (java.lang.String) r5
                        com.stripe.android.ui.core.elements.AddressElement r2 = r4.this$0
                        com.stripe.android.ui.core.address.AddressFieldElementRepository r2 = com.stripe.android.ui.core.elements.AddressElement.access$getAddressFieldRepository$p(r2)
                        java.util.List r5 = r2.get$payments_ui_core_release(r5)
                        if (r5 != 0) goto L48
                        java.util.List r5 = wz.u.i()
                    L48:
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L51
                        return r1
                    L51:
                        vz.b0 r5 = vz.b0.f54756a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.AddressElement$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(f<? super List<? extends SectionFieldElement>> fVar, zz.d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar, this), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        };
        final e eVar2 = new e<List<? extends SectionFieldElement>>() { // from class: com.stripe.android.ui.core.elements.AddressElement$special$$inlined$map$2

            /* renamed from: com.stripe.android.ui.core.elements.AddressElement$special$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;
                final /* synthetic */ AddressElement this$0;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.ui.core.elements.AddressElement$special$$inlined$map$2$2", f = "AddressElement.kt", l = {229}, m = "emit")
                /* renamed from: com.stripe.android.ui.core.elements.AddressElement$special$$inlined$map$2$2$1  reason: invalid class name */
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

                public AnonymousClass2(f fVar, AddressElement addressElement) {
                    this.$this_unsafeFlow = fVar;
                    this.this$0 = addressElement;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, zz.d r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.stripe.android.ui.core.elements.AddressElement$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.stripe.android.ui.core.elements.AddressElement$special$$inlined$map$2$2$1 r0 = (com.stripe.android.ui.core.elements.AddressElement$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.ui.core.elements.AddressElement$special$$inlined$map$2$2$1 r0 = new com.stripe.android.ui.core.elements.AddressElement$special$$inlined$map$2$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r8)
                        goto L5b
                    L29:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L31:
                        vz.r.b(r8)
                        kotlinx.coroutines.flow.f r8 = r6.$this_unsafeFlow
                        java.util.List r7 = (java.util.List) r7
                        java.util.Iterator r2 = r7.iterator()
                    L3c:
                        boolean r4 = r2.hasNext()
                        if (r4 == 0) goto L52
                        java.lang.Object r4 = r2.next()
                        com.stripe.android.ui.core.elements.SectionFieldElement r4 = (com.stripe.android.ui.core.elements.SectionFieldElement) r4
                        com.stripe.android.ui.core.elements.AddressElement r5 = r6.this$0
                        java.util.Map r5 = com.stripe.android.ui.core.elements.AddressElement.access$getRawValuesMap$p(r5)
                        r4.setRawValue(r5)
                        goto L3c
                    L52:
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L5b
                        return r1
                    L5b:
                        vz.b0 r7 = vz.b0.f54756a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.AddressElement$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(f<? super List<? extends SectionFieldElement>> fVar, zz.d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar, this), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        };
        this.otherFields = eVar2;
        e eVar3 = new e<List<? extends SectionFieldElement>>() { // from class: com.stripe.android.ui.core.elements.AddressElement$special$$inlined$map$3

            /* renamed from: com.stripe.android.ui.core.elements.AddressElement$special$$inlined$map$3$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;
                final /* synthetic */ AddressElement this$0;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.ui.core.elements.AddressElement$special$$inlined$map$3$2", f = "AddressElement.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.ui.core.elements.AddressElement$special$$inlined$map$3$2$1  reason: invalid class name */
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

                public AnonymousClass2(f fVar, AddressElement addressElement) {
                    this.$this_unsafeFlow = fVar;
                    this.this$0 = addressElement;
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
                        boolean r0 = r6 instanceof com.stripe.android.ui.core.elements.AddressElement$special$$inlined$map$3.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.stripe.android.ui.core.elements.AddressElement$special$$inlined$map$3$2$1 r0 = (com.stripe.android.ui.core.elements.AddressElement$special$$inlined$map$3.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.ui.core.elements.AddressElement$special$$inlined$map$3$2$1 r0 = new com.stripe.android.ui.core.elements.AddressElement$special$$inlined$map$3$2$1
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
                        java.util.List r5 = (java.util.List) r5
                        com.stripe.android.ui.core.elements.AddressElement r2 = r4.this$0
                        com.stripe.android.ui.core.elements.CountryElement r2 = r2.getCountryElement()
                        java.util.List r2 = wz.u.d(r2)
                        java.util.List r5 = wz.u.y0(r2, r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4f
                        return r1
                    L4f:
                        vz.b0 r5 = vz.b0.f54756a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.AddressElement$special$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(f<? super List<? extends SectionFieldElement>> fVar, zz.d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar, this), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        };
        this.fields = eVar3;
        this.controller = new AddressController(eVar3);
    }
}