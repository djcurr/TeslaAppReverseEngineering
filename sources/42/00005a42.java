package com.stripe.android.ui.core.elements;

import com.stripe.android.model.CardBrand;
import com.stripe.android.ui.core.elements.TextFieldController;
import com.stripe.android.ui.core.elements.TextFieldIcon;
import com.stripe.android.ui.core.forms.FormFieldEntry;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.u;
import s2.k0;
import vz.b0;

/* loaded from: classes6.dex */
public final class CvcController implements TextFieldController, SectionFieldErrorController {
    private final e<TextFieldState> _fieldState;
    private final u<String> _fieldValue;
    private final u<Boolean> _hasFocus;
    private final e<Integer> _label;
    private final int capitalization;
    private final e<String> contentDescription;
    private final CvcConfig cvcTextFieldConfig;
    private final String debugLabel;
    private final e<FieldError> error;
    private final e<TextFieldState> fieldState;
    private final e<String> fieldValue;
    private final e<FormFieldEntry> formFieldValue;
    private final e<Boolean> isComplete;
    private final int keyboardType;
    private final e<Integer> label;
    private final e<Boolean> loading;
    private final e<String> rawFieldValue;
    private final boolean showOptionalLabel;
    private final e<TextFieldIcon> trailingIcon;
    private final e<Boolean> visibleError;
    private final k0 visualTransformation;

    public CvcController(CvcConfig cvcTextFieldConfig, final e<? extends CardBrand> cardBrandFlow, String str, boolean z11) {
        s.g(cvcTextFieldConfig, "cvcTextFieldConfig");
        s.g(cardBrandFlow, "cardBrandFlow");
        this.cvcTextFieldConfig = cvcTextFieldConfig;
        this.showOptionalLabel = z11;
        this.capitalization = cvcTextFieldConfig.mo430getCapitalizationIUNYP9k();
        this.keyboardType = cvcTextFieldConfig.mo431getKeyboardPjHm6EE();
        this.visualTransformation = cvcTextFieldConfig.getVisualTransformation();
        e<Integer> eVar = new e<Integer>() { // from class: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$1

            /* renamed from: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$1$2", f = "CvcController.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$1$2$1  reason: invalid class name */
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

                public AnonymousClass2(f fVar) {
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
                        boolean r0 = r6 instanceof com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$1$2$1 r0 = (com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$1$2$1 r0 = new com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r6)
                        goto L4e
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        vz.r.b(r6)
                        kotlinx.coroutines.flow.f r6 = r4.$this_unsafeFlow
                        com.stripe.android.model.CardBrand r5 = (com.stripe.android.model.CardBrand) r5
                        com.stripe.android.model.CardBrand r2 = com.stripe.android.model.CardBrand.AmericanExpress
                        if (r5 != r2) goto L3f
                        int r5 = com.stripe.android.ui.core.R.string.cvc_amex_hint
                        goto L41
                    L3f:
                        int r5 = com.stripe.android.ui.core.R.string.cvc_number_hint
                    L41:
                        java.lang.Integer r5 = kotlin.coroutines.jvm.internal.b.c(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4e
                        return r1
                    L4e:
                        vz.b0 r5 = vz.b0.f54756a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(f<? super Integer> fVar, zz.d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        };
        this._label = eVar;
        this.label = eVar;
        this.debugLabel = cvcTextFieldConfig.getDebugLabel();
        final u<String> a11 = j0.a("");
        this._fieldValue = a11;
        this.fieldValue = a11;
        this.rawFieldValue = new e<String>() { // from class: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$2

            /* renamed from: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;
                final /* synthetic */ CvcController this$0;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$2$2", f = "CvcController.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$2$2$1  reason: invalid class name */
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

                public AnonymousClass2(f fVar, CvcController cvcController) {
                    this.$this_unsafeFlow = fVar;
                    this.this$0 = cvcController;
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
                        boolean r0 = r6 instanceof com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$2$2$1 r0 = (com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$2$2$1 r0 = new com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$2$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r6)
                        goto L4b
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        vz.r.b(r6)
                        kotlinx.coroutines.flow.f r6 = r4.$this_unsafeFlow
                        java.lang.String r5 = (java.lang.String) r5
                        com.stripe.android.ui.core.elements.CvcController r2 = r4.this$0
                        com.stripe.android.ui.core.elements.CvcConfig r2 = com.stripe.android.ui.core.elements.CvcController.access$getCvcTextFieldConfig$p(r2)
                        java.lang.String r5 = r2.convertToRaw(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4b
                        return r1
                    L4b:
                        vz.b0 r5 = vz.b0.f54756a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(f<? super String> fVar, zz.d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar, this), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        };
        this.contentDescription = new e<String>() { // from class: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$3

            /* renamed from: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$3$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$3$2", f = "CvcController.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$3$2$1  reason: invalid class name */
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

                public AnonymousClass2(f fVar) {
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
                        boolean r0 = r7 instanceof com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$3.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$3$2$1 r0 = (com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$3.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$3$2$1 r0 = new com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$3$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r7)
                        goto L4e
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        vz.r.b(r7)
                        kotlinx.coroutines.flow.f r7 = r5.$this_unsafeFlow
                        java.lang.String r6 = (java.lang.String) r6
                        kotlin.text.i r2 = new kotlin.text.i
                        java.lang.String r4 = "\\d"
                        r2.<init>(r4)
                        java.lang.String r4 = "$0 "
                        java.lang.String r6 = r2.i(r6, r4)
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L4e
                        return r1
                    L4e:
                        vz.b0 r6 = vz.b0.f54756a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(f<? super String> fVar, zz.d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        };
        final e<TextFieldState> h11 = g.h(cardBrandFlow, a11, new CvcController$_fieldState$1(this, null));
        this._fieldState = h11;
        this.fieldState = h11;
        Boolean bool = Boolean.FALSE;
        u<Boolean> a12 = j0.a(bool);
        this._hasFocus = a12;
        this.visibleError = g.h(h11, a12, new CvcController$visibleError$1(null));
        this.error = g.h(getVisibleError(), h11, new CvcController$error$1(null));
        this.isComplete = new e<Boolean>() { // from class: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$4

            /* renamed from: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$4$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$4$2", f = "CvcController.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$4$2$1  reason: invalid class name */
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

                public AnonymousClass2(f fVar) {
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
                        boolean r0 = r6 instanceof com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$4.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$4$2$1 r0 = (com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$4.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$4$2$1 r0 = new com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$4$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r6)
                        goto L49
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        vz.r.b(r6)
                        kotlinx.coroutines.flow.f r6 = r4.$this_unsafeFlow
                        com.stripe.android.ui.core.elements.TextFieldState r5 = (com.stripe.android.ui.core.elements.TextFieldState) r5
                        boolean r5 = r5.isValid()
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L49
                        return r1
                    L49:
                        vz.b0 r5 = vz.b0.f54756a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$4.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(f<? super Boolean> fVar, zz.d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        };
        this.formFieldValue = g.h(isComplete(), getRawFieldValue(), new CvcController$formFieldValue$1(null));
        this.trailingIcon = new e<TextFieldIcon.Trailing>() { // from class: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$5

            /* renamed from: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$5$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$5$2", f = "CvcController.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$5$2$1  reason: invalid class name */
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

                public AnonymousClass2(f fVar) {
                    this.$this_unsafeFlow = fVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r11, zz.d r12) {
                    /*
                        r10 = this;
                        boolean r0 = r12 instanceof com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$5.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r12
                        com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$5$2$1 r0 = (com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$5.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$5$2$1 r0 = new com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$5$2$1
                        r0.<init>(r12)
                    L18:
                        java.lang.Object r12 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r12)
                        goto L4f
                    L29:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r12)
                        throw r11
                    L31:
                        vz.r.b(r12)
                        kotlinx.coroutines.flow.f r12 = r10.$this_unsafeFlow
                        com.stripe.android.model.CardBrand r11 = (com.stripe.android.model.CardBrand) r11
                        com.stripe.android.ui.core.elements.TextFieldIcon$Trailing r2 = new com.stripe.android.ui.core.elements.TextFieldIcon$Trailing
                        int r5 = r11.getCvcIcon()
                        r6 = 0
                        r7 = 0
                        r8 = 2
                        r9 = 0
                        r4 = r2
                        r4.<init>(r5, r6, r7, r8, r9)
                        r0.label = r3
                        java.lang.Object r11 = r12.emit(r2, r0)
                        if (r11 != r1) goto L4f
                        return r1
                    L4f:
                        vz.b0 r11 = vz.b0.f54756a
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.CvcController$special$$inlined$map$5.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(f<? super TextFieldIcon.Trailing> fVar, zz.d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        };
        this.loading = j0.a(bool);
        onRawValueChange(str == null ? "" : str);
    }

    public static final /* synthetic */ CvcConfig access$getCvcTextFieldConfig$p(CvcController cvcController) {
        return cvcController.cvcTextFieldConfig;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldController
    /* renamed from: getCapitalization-IUNYP9k */
    public int mo432getCapitalizationIUNYP9k() {
        return this.capitalization;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldController
    public e<String> getContentDescription() {
        return this.contentDescription;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldController
    public String getDebugLabel() {
        return this.debugLabel;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldController
    public boolean getEnabled() {
        return TextFieldController.DefaultImpls.getEnabled(this);
    }

    @Override // com.stripe.android.ui.core.elements.SectionFieldErrorController
    public e<FieldError> getError() {
        return this.error;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldController
    public e<TextFieldState> getFieldState() {
        return this.fieldState;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldController, com.stripe.android.ui.core.elements.InputController
    public e<String> getFieldValue() {
        return this.fieldValue;
    }

    @Override // com.stripe.android.ui.core.elements.InputController
    public e<FormFieldEntry> getFormFieldValue() {
        return this.formFieldValue;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldController
    /* renamed from: getKeyboardType-PjHm6EE */
    public int mo433getKeyboardTypePjHm6EE() {
        return this.keyboardType;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldController, com.stripe.android.ui.core.elements.InputController
    public e<Integer> getLabel() {
        return this.label;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldController
    public e<Boolean> getLoading() {
        return this.loading;
    }

    @Override // com.stripe.android.ui.core.elements.InputController
    public e<String> getRawFieldValue() {
        return this.rawFieldValue;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldController, com.stripe.android.ui.core.elements.InputController
    public boolean getShowOptionalLabel() {
        return this.showOptionalLabel;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldController
    public e<TextFieldIcon> getTrailingIcon() {
        return this.trailingIcon;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldController
    public e<Boolean> getVisibleError() {
        return this.visibleError;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldController
    public k0 getVisualTransformation() {
        return this.visualTransformation;
    }

    @Override // com.stripe.android.ui.core.elements.InputController
    public e<Boolean> isComplete() {
        return this.isComplete;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldController
    public void onFocusChange(boolean z11) {
        this._hasFocus.setValue(Boolean.valueOf(z11));
    }

    @Override // com.stripe.android.ui.core.elements.InputController
    public void onRawValueChange(String rawValue) {
        s.g(rawValue, "rawValue");
        onValueChange(this.cvcTextFieldConfig.convertFromRaw(rawValue));
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldController
    public TextFieldState onValueChange(String displayFormatted) {
        s.g(displayFormatted, "displayFormatted");
        this._fieldValue.setValue(this.cvcTextFieldConfig.filter(displayFormatted));
        return null;
    }

    public /* synthetic */ CvcController(CvcConfig cvcConfig, e eVar, String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(cvcConfig, eVar, str, (i11 & 8) != 0 ? false : z11);
    }
}