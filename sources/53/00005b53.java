package com.stripe.android.ui.core.elements;

import com.stripe.android.ui.core.elements.TextFieldController;
import com.stripe.android.ui.core.elements.TextFieldStateConstants;
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
public final class SimpleTextFieldController implements TextFieldController, SectionFieldErrorController {
    private final u<TextFieldState> _fieldState;
    private final u<String> _fieldValue;
    private final u<Boolean> _hasFocus;
    private final int capitalization;
    private final e<String> contentDescription;
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
    private final TextFieldConfig textFieldConfig;
    private final e<TextFieldIcon> trailingIcon;
    private final e<Boolean> visibleError;
    private final k0 visualTransformation;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SimpleTextFieldController createEmailSectionController(String str) {
            return new SimpleTextFieldController(new EmailConfig(), false, str, 2, null);
        }

        public final SimpleTextFieldController createNameSectionController(String str) {
            return new SimpleTextFieldController(new NameConfig(), false, str, 2, null);
        }
    }

    public SimpleTextFieldController(TextFieldConfig textFieldConfig, boolean z11, String str) {
        s.g(textFieldConfig, "textFieldConfig");
        this.textFieldConfig = textFieldConfig;
        this.showOptionalLabel = z11;
        this.trailingIcon = textFieldConfig.getTrailingIcon();
        this.capitalization = textFieldConfig.mo425getCapitalizationIUNYP9k();
        this.keyboardType = textFieldConfig.mo426getKeyboardPjHm6EE();
        k0 visualTransformation = textFieldConfig.getVisualTransformation();
        this.visualTransformation = visualTransformation == null ? k0.f50112a.c() : visualTransformation;
        this.label = j0.a(Integer.valueOf(textFieldConfig.getLabel()));
        this.debugLabel = textFieldConfig.getDebugLabel();
        final u<String> a11 = j0.a("");
        this._fieldValue = a11;
        this.fieldValue = a11;
        this.rawFieldValue = new e<String>() { // from class: com.stripe.android.ui.core.elements.SimpleTextFieldController$special$$inlined$map$1

            /* renamed from: com.stripe.android.ui.core.elements.SimpleTextFieldController$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;
                final /* synthetic */ SimpleTextFieldController this$0;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.ui.core.elements.SimpleTextFieldController$special$$inlined$map$1$2", f = "TextFieldController.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.ui.core.elements.SimpleTextFieldController$special$$inlined$map$1$2$1  reason: invalid class name */
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

                public AnonymousClass2(f fVar, SimpleTextFieldController simpleTextFieldController) {
                    this.$this_unsafeFlow = fVar;
                    this.this$0 = simpleTextFieldController;
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
                        boolean r0 = r6 instanceof com.stripe.android.ui.core.elements.SimpleTextFieldController$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.stripe.android.ui.core.elements.SimpleTextFieldController$special$$inlined$map$1$2$1 r0 = (com.stripe.android.ui.core.elements.SimpleTextFieldController$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.ui.core.elements.SimpleTextFieldController$special$$inlined$map$1$2$1 r0 = new com.stripe.android.ui.core.elements.SimpleTextFieldController$special$$inlined$map$1$2$1
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
                        com.stripe.android.ui.core.elements.SimpleTextFieldController r2 = r4.this$0
                        com.stripe.android.ui.core.elements.TextFieldConfig r2 = com.stripe.android.ui.core.elements.SimpleTextFieldController.access$getTextFieldConfig$p(r2)
                        java.lang.String r5 = r2.convertToRaw(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4b
                        return r1
                    L4b:
                        vz.b0 r5 = vz.b0.f54756a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.SimpleTextFieldController$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
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
        this.contentDescription = a11;
        final u<TextFieldState> a12 = j0.a(TextFieldStateConstants.Error.Blank.INSTANCE);
        this._fieldState = a12;
        this.fieldState = a12;
        this.loading = textFieldConfig.getLoading();
        u<Boolean> a13 = j0.a(Boolean.FALSE);
        this._hasFocus = a13;
        this.visibleError = g.h(a12, a13, new SimpleTextFieldController$visibleError$1(null));
        final e<Boolean> visibleError = getVisibleError();
        this.error = new e<FieldError>() { // from class: com.stripe.android.ui.core.elements.SimpleTextFieldController$special$$inlined$map$2

            /* renamed from: com.stripe.android.ui.core.elements.SimpleTextFieldController$special$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;
                final /* synthetic */ SimpleTextFieldController this$0;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.ui.core.elements.SimpleTextFieldController$special$$inlined$map$2$2", f = "TextFieldController.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.ui.core.elements.SimpleTextFieldController$special$$inlined$map$2$2$1  reason: invalid class name */
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

                public AnonymousClass2(f fVar, SimpleTextFieldController simpleTextFieldController) {
                    this.$this_unsafeFlow = fVar;
                    this.this$0 = simpleTextFieldController;
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
                        boolean r0 = r7 instanceof com.stripe.android.ui.core.elements.SimpleTextFieldController$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.stripe.android.ui.core.elements.SimpleTextFieldController$special$$inlined$map$2$2$1 r0 = (com.stripe.android.ui.core.elements.SimpleTextFieldController$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.ui.core.elements.SimpleTextFieldController$special$$inlined$map$2$2$1 r0 = new com.stripe.android.ui.core.elements.SimpleTextFieldController$special$$inlined$map$2$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r7)
                        goto L5c
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        vz.r.b(r7)
                        kotlinx.coroutines.flow.f r7 = r5.$this_unsafeFlow
                        java.lang.Boolean r6 = (java.lang.Boolean) r6
                        boolean r6 = r6.booleanValue()
                        com.stripe.android.ui.core.elements.SimpleTextFieldController r2 = r5.this$0
                        kotlinx.coroutines.flow.u r2 = com.stripe.android.ui.core.elements.SimpleTextFieldController.access$get_fieldState$p(r2)
                        java.lang.Object r2 = r2.getValue()
                        com.stripe.android.ui.core.elements.TextFieldState r2 = (com.stripe.android.ui.core.elements.TextFieldState) r2
                        com.stripe.android.ui.core.elements.FieldError r2 = r2.getError()
                        r4 = 0
                        if (r2 != 0) goto L51
                    L4f:
                        r2 = r4
                        goto L53
                    L51:
                        if (r6 == 0) goto L4f
                    L53:
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r2, r0)
                        if (r6 != r1) goto L5c
                        return r1
                    L5c:
                        vz.b0 r6 = vz.b0.f54756a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.SimpleTextFieldController$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(f<? super FieldError> fVar, zz.d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar, this), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        };
        this.isComplete = new e<Boolean>() { // from class: com.stripe.android.ui.core.elements.SimpleTextFieldController$special$$inlined$map$3

            /* renamed from: com.stripe.android.ui.core.elements.SimpleTextFieldController$special$$inlined$map$3$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;
                final /* synthetic */ SimpleTextFieldController this$0;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.ui.core.elements.SimpleTextFieldController$special$$inlined$map$3$2", f = "TextFieldController.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.ui.core.elements.SimpleTextFieldController$special$$inlined$map$3$2$1  reason: invalid class name */
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

                public AnonymousClass2(f fVar, SimpleTextFieldController simpleTextFieldController) {
                    this.$this_unsafeFlow = fVar;
                    this.this$0 = simpleTextFieldController;
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
                        boolean r0 = r6 instanceof com.stripe.android.ui.core.elements.SimpleTextFieldController$special$$inlined$map$3.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.stripe.android.ui.core.elements.SimpleTextFieldController$special$$inlined$map$3$2$1 r0 = (com.stripe.android.ui.core.elements.SimpleTextFieldController$special$$inlined$map$3.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.ui.core.elements.SimpleTextFieldController$special$$inlined$map$3$2$1 r0 = new com.stripe.android.ui.core.elements.SimpleTextFieldController$special$$inlined$map$3$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r6)
                        goto L63
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        vz.r.b(r6)
                        kotlinx.coroutines.flow.f r6 = r4.$this_unsafeFlow
                        com.stripe.android.ui.core.elements.TextFieldState r5 = (com.stripe.android.ui.core.elements.TextFieldState) r5
                        boolean r2 = r5.isValid()
                        if (r2 != 0) goto L55
                        boolean r2 = r5.isValid()
                        if (r2 != 0) goto L53
                        com.stripe.android.ui.core.elements.SimpleTextFieldController r2 = r4.this$0
                        boolean r2 = r2.getShowOptionalLabel()
                        if (r2 == 0) goto L53
                        boolean r5 = r5.isBlank()
                        if (r5 == 0) goto L53
                        goto L55
                    L53:
                        r5 = 0
                        goto L56
                    L55:
                        r5 = r3
                    L56:
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L63
                        return r1
                    L63:
                        vz.b0 r5 = vz.b0.f54756a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.SimpleTextFieldController$special$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(f<? super Boolean> fVar, zz.d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar, this), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        };
        this.formFieldValue = g.h(isComplete(), getRawFieldValue(), new SimpleTextFieldController$formFieldValue$1(null));
        if (str == null) {
            return;
        }
        onRawValueChange(str);
    }

    public static final /* synthetic */ TextFieldConfig access$getTextFieldConfig$p(SimpleTextFieldController simpleTextFieldController) {
        return simpleTextFieldController.textFieldConfig;
    }

    public static final /* synthetic */ u access$get_fieldState$p(SimpleTextFieldController simpleTextFieldController) {
        return simpleTextFieldController._fieldState;
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
        onValueChange(this.textFieldConfig.convertFromRaw(rawValue));
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldController
    public TextFieldState onValueChange(String displayFormatted) {
        s.g(displayFormatted, "displayFormatted");
        this._fieldValue.setValue(this.textFieldConfig.filter(displayFormatted));
        this._fieldState.setValue(this.textFieldConfig.determineState(this._fieldValue.getValue()));
        if (s.c(this._fieldState.getValue(), this._fieldState.getValue())) {
            return null;
        }
        return this._fieldState.getValue();
    }

    public /* synthetic */ SimpleTextFieldController(TextFieldConfig textFieldConfig, boolean z11, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldConfig, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? null : str);
    }
}