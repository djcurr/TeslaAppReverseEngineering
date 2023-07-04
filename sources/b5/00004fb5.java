package com.stripe.android.link.ui.forms;

import com.stripe.android.ui.core.elements.CardBillingAddressElement;
import com.stripe.android.ui.core.elements.FormElement;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.elements.LayoutSpec;
import com.stripe.android.ui.core.forms.FormFieldEntry;
import com.stripe.android.ui.core.forms.TransformSpecToElements;
import com.stripe.android.ui.core.forms.resources.ResourceRepository;
import h00.p;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.u;
import v20.k;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

/* loaded from: classes6.dex */
public final class FormController {
    private final e<CardBillingAddressElement> cardBillingElement;
    private final e<Map<IdentifierSpec, FormFieldEntry>> completeFormValues;
    private final h0<List<FormElement>> elements;
    private final LayoutSpec formSpec;
    private final e<List<IdentifierSpec>> hiddenIdentifiers;
    private final e<IdentifierSpec> lastTextFieldIdentifier;
    private final ResourceRepository resourceRepository;
    private final e<List<IdentifierSpec>> textFieldControllerIdsFlow;
    private final TransformSpecToElements transformSpecToElement;

    @f(c = "com.stripe.android.link.ui.forms.FormController$1", f = "FormController.kt", l = {42}, m = "invokeSuspend")
    /* renamed from: com.stripe.android.link.ui.forms.FormController$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends l implements p<o0, d<? super b0>, Object> {
        final /* synthetic */ u<List<FormElement>> $delayedElements;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(u<List<FormElement>> uVar, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$delayedElements = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<b0> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$delayedElements, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, d<? super b0> dVar) {
            return ((AnonymousClass1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.label;
            if (i11 == 0) {
                r.b(obj);
                ResourceRepository resourceRepository = FormController.this.resourceRepository;
                this.label = 1;
                if (resourceRepository.waitUntilLoaded(this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                r.b(obj);
            }
            this.$delayedElements.setValue(FormController.this.transformSpecToElement.transform(FormController.this.formSpec.getItems()));
            return b0.f54756a;
        }
    }

    public FormController(LayoutSpec formSpec, ResourceRepository resourceRepository, TransformSpecToElements transformSpecToElement, o0 viewModelScope) {
        s.g(formSpec, "formSpec");
        s.g(resourceRepository, "resourceRepository");
        s.g(transformSpecToElement, "transformSpecToElement");
        s.g(viewModelScope, "viewModelScope");
        this.formSpec = formSpec;
        this.resourceRepository = resourceRepository;
        this.transformSpecToElement = transformSpecToElement;
        if (resourceRepository.isLoaded()) {
            this.elements = j0.a(transformSpecToElement.transform(formSpec.getItems()));
        } else {
            u a11 = j0.a(null);
            k.d(viewModelScope, null, null, new AnonymousClass1(a11, null), 3, null);
            this.elements = a11;
        }
        final h0<List<FormElement>> h0Var = this.elements;
        final e<CardBillingAddressElement> eVar = new e<CardBillingAddressElement>() { // from class: com.stripe.android.link.ui.forms.FormController$special$$inlined$map$1

            /* renamed from: com.stripe.android.link.ui.forms.FormController$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.f {
                final /* synthetic */ kotlinx.coroutines.flow.f $this_unsafeFlow;

                @f(c = "com.stripe.android.link.ui.forms.FormController$special$$inlined$map$1$2", f = "FormController.kt", l = {228}, m = "emit")
                /* renamed from: com.stripe.android.link.ui.forms.FormController$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.f fVar) {
                    this.$this_unsafeFlow = fVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
                @Override // kotlinx.coroutines.flow.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, zz.d r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.stripe.android.link.ui.forms.FormController$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.stripe.android.link.ui.forms.FormController$special$$inlined$map$1$2$1 r0 = (com.stripe.android.link.ui.forms.FormController$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.link.ui.forms.FormController$special$$inlined$map$1$2$1 r0 = new com.stripe.android.link.ui.forms.FormController$special$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L32
                        if (r2 != r3) goto L2a
                        vz.r.b(r8)
                        goto L9f
                    L2a:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L32:
                        vz.r.b(r8)
                        kotlinx.coroutines.flow.f r8 = r6.$this_unsafeFlow
                        java.util.List r7 = (java.util.List) r7
                        if (r7 != 0) goto L3d
                        r7 = 0
                        goto L96
                    L3d:
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r2.<init>()
                        java.util.Iterator r7 = r7.iterator()
                    L46:
                        boolean r4 = r7.hasNext()
                        if (r4 == 0) goto L58
                        java.lang.Object r4 = r7.next()
                        boolean r5 = r4 instanceof com.stripe.android.ui.core.elements.SectionElement
                        if (r5 == 0) goto L46
                        r2.add(r4)
                        goto L46
                    L58:
                        java.util.ArrayList r7 = new java.util.ArrayList
                        r7.<init>()
                        java.util.Iterator r2 = r2.iterator()
                    L61:
                        boolean r4 = r2.hasNext()
                        if (r4 == 0) goto L75
                        java.lang.Object r4 = r2.next()
                        com.stripe.android.ui.core.elements.SectionElement r4 = (com.stripe.android.ui.core.elements.SectionElement) r4
                        java.util.List r4 = r4.getFields()
                        wz.u.z(r7, r4)
                        goto L61
                    L75:
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r2.<init>()
                        java.util.Iterator r7 = r7.iterator()
                    L7e:
                        boolean r4 = r7.hasNext()
                        if (r4 == 0) goto L90
                        java.lang.Object r4 = r7.next()
                        boolean r5 = r4 instanceof com.stripe.android.ui.core.elements.CardBillingAddressElement
                        if (r5 == 0) goto L7e
                        r2.add(r4)
                        goto L7e
                    L90:
                        java.lang.Object r7 = wz.u.d0(r2)
                        com.stripe.android.ui.core.elements.CardBillingAddressElement r7 = (com.stripe.android.ui.core.elements.CardBillingAddressElement) r7
                    L96:
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L9f
                        return r1
                    L9f:
                        vz.b0 r7 = vz.b0.f54756a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.ui.forms.FormController$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(kotlinx.coroutines.flow.f<? super CardBillingAddressElement> fVar, d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        };
        this.cardBillingElement = eVar;
        e<List<IdentifierSpec>> u11 = g.u(new e<e<? extends List<? extends IdentifierSpec>>>() { // from class: com.stripe.android.link.ui.forms.FormController$special$$inlined$map$2

            /* renamed from: com.stripe.android.link.ui.forms.FormController$special$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.f {
                final /* synthetic */ kotlinx.coroutines.flow.f $this_unsafeFlow;

                @f(c = "com.stripe.android.link.ui.forms.FormController$special$$inlined$map$2$2", f = "FormController.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.link.ui.forms.FormController$special$$inlined$map$2$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.f fVar) {
                    this.$this_unsafeFlow = fVar;
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
                        boolean r0 = r6 instanceof com.stripe.android.link.ui.forms.FormController$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.stripe.android.link.ui.forms.FormController$special$$inlined$map$2$2$1 r0 = (com.stripe.android.link.ui.forms.FormController$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.link.ui.forms.FormController$special$$inlined$map$2$2$1 r0 = new com.stripe.android.link.ui.forms.FormController$special$$inlined$map$2$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r6)
                        goto L53
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        vz.r.b(r6)
                        kotlinx.coroutines.flow.f r6 = r4.$this_unsafeFlow
                        com.stripe.android.ui.core.elements.CardBillingAddressElement r5 = (com.stripe.android.ui.core.elements.CardBillingAddressElement) r5
                        if (r5 != 0) goto L3c
                        r5 = 0
                        goto L40
                    L3c:
                        kotlinx.coroutines.flow.e r5 = r5.getHiddenIdentifiers()
                    L40:
                        if (r5 != 0) goto L4a
                        java.util.List r5 = wz.u.i()
                        kotlinx.coroutines.flow.e r5 = kotlinx.coroutines.flow.g.x(r5)
                    L4a:
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L53
                        return r1
                    L53:
                        vz.b0 r5 = vz.b0.f54756a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.ui.forms.FormController$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(kotlinx.coroutines.flow.f<? super e<? extends List<? extends IdentifierSpec>>> fVar, d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        });
        this.hiddenIdentifiers = u11;
        final e p11 = g.p(this.elements);
        final e h11 = g.h(g.u(new e<e<? extends Map<IdentifierSpec, ? extends FormFieldEntry>>>() { // from class: com.stripe.android.link.ui.forms.FormController$special$$inlined$map$3

            /* renamed from: com.stripe.android.link.ui.forms.FormController$special$$inlined$map$3$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.f {
                final /* synthetic */ kotlinx.coroutines.flow.f $this_unsafeFlow;

                @f(c = "com.stripe.android.link.ui.forms.FormController$special$$inlined$map$3$2", f = "FormController.kt", l = {230}, m = "emit")
                /* renamed from: com.stripe.android.link.ui.forms.FormController$special$$inlined$map$3$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.f fVar) {
                    this.$this_unsafeFlow = fVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, zz.d r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.stripe.android.link.ui.forms.FormController$special$$inlined$map$3.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.stripe.android.link.ui.forms.FormController$special$$inlined$map$3$2$1 r0 = (com.stripe.android.link.ui.forms.FormController$special$$inlined$map$3.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.link.ui.forms.FormController$special$$inlined$map$3$2$1 r0 = new com.stripe.android.link.ui.forms.FormController$special$$inlined$map$3$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r7)
                        goto L7b
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        vz.r.b(r7)
                        kotlinx.coroutines.flow.f r7 = r5.$this_unsafeFlow
                        java.util.List r6 = (java.util.List) r6
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r4 = 10
                        int r4 = wz.u.t(r6, r4)
                        r2.<init>(r4)
                        java.util.Iterator r6 = r6.iterator()
                    L47:
                        boolean r4 = r6.hasNext()
                        if (r4 == 0) goto L5b
                        java.lang.Object r4 = r6.next()
                        com.stripe.android.ui.core.elements.FormElement r4 = (com.stripe.android.ui.core.elements.FormElement) r4
                        kotlinx.coroutines.flow.e r4 = r4.getFormFieldValueFlow()
                        r2.add(r4)
                        goto L47
                    L5b:
                        java.util.List r6 = wz.u.O0(r2)
                        r2 = 0
                        kotlinx.coroutines.flow.e[] r2 = new kotlinx.coroutines.flow.e[r2]
                        java.lang.Object[] r6 = r6.toArray(r2)
                        java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                        java.util.Objects.requireNonNull(r6, r2)
                        kotlinx.coroutines.flow.e[] r6 = (kotlinx.coroutines.flow.e[]) r6
                        com.stripe.android.link.ui.forms.FormController$completeFormValues$lambda-5$$inlined$combine$1 r2 = new com.stripe.android.link.ui.forms.FormController$completeFormValues$lambda-5$$inlined$combine$1
                        r2.<init>(r6)
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r2, r0)
                        if (r6 != r1) goto L7b
                        return r1
                    L7b:
                        vz.b0 r6 = vz.b0.f54756a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.ui.forms.FormController$special$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(kotlinx.coroutines.flow.f<? super e<? extends Map<IdentifierSpec, ? extends FormFieldEntry>>> fVar, d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        }), u11, new FormController$completeFormValues$2(null));
        this.completeFormValues = new e<Map<IdentifierSpec, ? extends FormFieldEntry>>() { // from class: com.stripe.android.link.ui.forms.FormController$special$$inlined$map$4

            /* renamed from: com.stripe.android.link.ui.forms.FormController$special$$inlined$map$4$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.f {
                final /* synthetic */ kotlinx.coroutines.flow.f $this_unsafeFlow;

                @f(c = "com.stripe.android.link.ui.forms.FormController$special$$inlined$map$4$2", f = "FormController.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.link.ui.forms.FormController$special$$inlined$map$4$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.f fVar) {
                    this.$this_unsafeFlow = fVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, zz.d r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.stripe.android.link.ui.forms.FormController$special$$inlined$map$4.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.stripe.android.link.ui.forms.FormController$special$$inlined$map$4$2$1 r0 = (com.stripe.android.link.ui.forms.FormController$special$$inlined$map$4.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.link.ui.forms.FormController$special$$inlined$map$4$2$1 r0 = new com.stripe.android.link.ui.forms.FormController$special$$inlined$map$4$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r7)
                        goto L6c
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        vz.r.b(r7)
                        kotlinx.coroutines.flow.f r7 = r5.$this_unsafeFlow
                        java.util.Map r6 = (java.util.Map) r6
                        java.util.Collection r2 = r6.values()
                        boolean r4 = r2 instanceof java.util.Collection
                        if (r4 == 0) goto L48
                        boolean r4 = r2.isEmpty()
                        if (r4 == 0) goto L48
                    L46:
                        r2 = r3
                        goto L5f
                    L48:
                        java.util.Iterator r2 = r2.iterator()
                    L4c:
                        boolean r4 = r2.hasNext()
                        if (r4 == 0) goto L46
                        java.lang.Object r4 = r2.next()
                        com.stripe.android.ui.core.forms.FormFieldEntry r4 = (com.stripe.android.ui.core.forms.FormFieldEntry) r4
                        boolean r4 = r4.isComplete()
                        if (r4 != 0) goto L4c
                        r2 = 0
                    L5f:
                        if (r2 == 0) goto L62
                        goto L63
                    L62:
                        r6 = 0
                    L63:
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L6c
                        return r1
                    L6c:
                        vz.b0 r6 = vz.b0.f54756a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.ui.forms.FormController$special$$inlined$map$4.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(kotlinx.coroutines.flow.f<? super Map<IdentifierSpec, ? extends FormFieldEntry>> fVar, d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        };
        final e p12 = g.p(this.elements);
        e<List<IdentifierSpec>> u12 = g.u(new e<e<? extends List<? extends IdentifierSpec>>>() { // from class: com.stripe.android.link.ui.forms.FormController$special$$inlined$map$5

            /* renamed from: com.stripe.android.link.ui.forms.FormController$special$$inlined$map$5$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.f {
                final /* synthetic */ kotlinx.coroutines.flow.f $this_unsafeFlow;

                @f(c = "com.stripe.android.link.ui.forms.FormController$special$$inlined$map$5$2", f = "FormController.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.link.ui.forms.FormController$special$$inlined$map$5$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.f fVar) {
                    this.$this_unsafeFlow = fVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, zz.d r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.stripe.android.link.ui.forms.FormController$special$$inlined$map$5.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.stripe.android.link.ui.forms.FormController$special$$inlined$map$5$2$1 r0 = (com.stripe.android.link.ui.forms.FormController$special$$inlined$map$5.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.link.ui.forms.FormController$special$$inlined$map$5$2$1 r0 = new com.stripe.android.link.ui.forms.FormController$special$$inlined$map$5$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r7)
                        goto L7b
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        vz.r.b(r7)
                        kotlinx.coroutines.flow.f r7 = r5.$this_unsafeFlow
                        java.util.List r6 = (java.util.List) r6
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r4 = 10
                        int r4 = wz.u.t(r6, r4)
                        r2.<init>(r4)
                        java.util.Iterator r6 = r6.iterator()
                    L47:
                        boolean r4 = r6.hasNext()
                        if (r4 == 0) goto L5b
                        java.lang.Object r4 = r6.next()
                        com.stripe.android.ui.core.elements.FormElement r4 = (com.stripe.android.ui.core.elements.FormElement) r4
                        kotlinx.coroutines.flow.e r4 = r4.getTextFieldIdentifiers()
                        r2.add(r4)
                        goto L47
                    L5b:
                        java.util.List r6 = wz.u.O0(r2)
                        r2 = 0
                        kotlinx.coroutines.flow.e[] r2 = new kotlinx.coroutines.flow.e[r2]
                        java.lang.Object[] r6 = r6.toArray(r2)
                        java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                        java.util.Objects.requireNonNull(r6, r2)
                        kotlinx.coroutines.flow.e[] r6 = (kotlinx.coroutines.flow.e[]) r6
                        com.stripe.android.link.ui.forms.FormController$textFieldControllerIdsFlow$lambda-11$$inlined$combine$1 r2 = new com.stripe.android.link.ui.forms.FormController$textFieldControllerIdsFlow$lambda-11$$inlined$combine$1
                        r2.<init>(r6)
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r2, r0)
                        if (r6 != r1) goto L7b
                        return r1
                    L7b:
                        vz.b0 r6 = vz.b0.f54756a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.ui.forms.FormController$special$$inlined$map$5.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(kotlinx.coroutines.flow.f<? super e<? extends List<? extends IdentifierSpec>>> fVar, d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        });
        this.textFieldControllerIdsFlow = u12;
        this.lastTextFieldIdentifier = g.h(u11, u12, new FormController$lastTextFieldIdentifier$1(null));
    }

    public final e<Map<IdentifierSpec, FormFieldEntry>> getCompleteFormValues() {
        return this.completeFormValues;
    }

    public final h0<List<FormElement>> getElements$link_release() {
        return this.elements;
    }

    public final e<List<IdentifierSpec>> getHiddenIdentifiers$link_release() {
        return this.hiddenIdentifiers;
    }

    public final e<IdentifierSpec> getLastTextFieldIdentifier() {
        return this.lastTextFieldIdentifier;
    }
}