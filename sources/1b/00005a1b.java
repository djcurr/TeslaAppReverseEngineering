package com.stripe.android.ui.core.elements;

import android.content.Context;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.cards.CardAccountRangeService;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.cards.DefaultCardAccountRangeRepositoryFactory;
import com.stripe.android.cards.DefaultStaticCardAccountRanges;
import com.stripe.android.cards.StaticCardAccountRanges;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.CardBrand;
import com.stripe.android.ui.core.forms.FormFieldEntry;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.u;
import s2.k0;
import v20.e1;
import vz.b0;
import zz.g;

/* loaded from: classes6.dex */
public final class CardNumberEditableController extends CardNumberController {
    private final e<TextFieldState> _fieldState;
    private final u<String> _fieldValue;
    private final u<Boolean> _hasFocus;
    private final CardAccountRangeService accountRangeService;
    private final int capitalization;
    private final e<CardBrand> cardBrandFlow;
    private final boolean cardScanEnabled;
    private final CardNumberConfig cardTextFieldConfig;
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
    private final e<TextFieldIcon> trailingIcon;
    private final e<Boolean> visibleError;
    private final k0 visualTransformation;

    public /* synthetic */ CardNumberEditableController(CardNumberConfig cardNumberConfig, CardAccountRangeRepository cardAccountRangeRepository, g gVar, StaticCardAccountRanges staticCardAccountRanges, String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(cardNumberConfig, cardAccountRangeRepository, gVar, (i11 & 8) != 0 ? new DefaultStaticCardAccountRanges() : staticCardAccountRanges, str, (i11 & 32) != 0 ? false : z11);
    }

    public static final /* synthetic */ CardNumberConfig access$getCardTextFieldConfig$p(CardNumberEditableController cardNumberEditableController) {
        return cardNumberEditableController.cardTextFieldConfig;
    }

    public static /* synthetic */ void getAccountRangeService$annotations() {
    }

    public final CardAccountRangeService getAccountRangeService() {
        return this.accountRangeService;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldController
    /* renamed from: getCapitalization-IUNYP9k */
    public int mo432getCapitalizationIUNYP9k() {
        return this.capitalization;
    }

    @Override // com.stripe.android.ui.core.elements.CardNumberController
    public e<CardBrand> getCardBrandFlow() {
        return this.cardBrandFlow;
    }

    @Override // com.stripe.android.ui.core.elements.CardNumberController
    public boolean getCardScanEnabled() {
        return this.cardScanEnabled;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldController
    public e<String> getContentDescription() {
        return this.contentDescription;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldController
    public String getDebugLabel() {
        return this.debugLabel;
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
        onValueChange(this.cardTextFieldConfig.convertFromRaw(rawValue));
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldController
    public TextFieldState onValueChange(String displayFormatted) {
        s.g(displayFormatted, "displayFormatted");
        this._fieldValue.setValue(this.cardTextFieldConfig.filter(displayFormatted));
        this.accountRangeService.onCardNumberChanged(new CardNumber.Unvalidated(displayFormatted));
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardNumberEditableController(CardNumberConfig cardTextFieldConfig, CardAccountRangeRepository cardAccountRangeRepository, g workContext, StaticCardAccountRanges staticCardAccountRanges, String str, boolean z11) {
        super(null);
        s.g(cardTextFieldConfig, "cardTextFieldConfig");
        s.g(cardAccountRangeRepository, "cardAccountRangeRepository");
        s.g(workContext, "workContext");
        s.g(staticCardAccountRanges, "staticCardAccountRanges");
        this.cardTextFieldConfig = cardTextFieldConfig;
        this.showOptionalLabel = z11;
        this.capitalization = cardTextFieldConfig.mo430getCapitalizationIUNYP9k();
        this.keyboardType = cardTextFieldConfig.mo431getKeyboardPjHm6EE();
        this.visualTransformation = cardTextFieldConfig.getVisualTransformation();
        this.debugLabel = cardTextFieldConfig.getDebugLabel();
        this.label = j0.a(Integer.valueOf(cardTextFieldConfig.getLabel()));
        final u<String> a11 = j0.a("");
        this._fieldValue = a11;
        this.fieldValue = a11;
        this.rawFieldValue = new e<String>() { // from class: com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$1

            /* renamed from: com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;
                final /* synthetic */ CardNumberEditableController this$0;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$1$2", f = "CardNumberController.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$1$2$1  reason: invalid class name */
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

                public AnonymousClass2(f fVar, CardNumberEditableController cardNumberEditableController) {
                    this.$this_unsafeFlow = fVar;
                    this.this$0 = cardNumberEditableController;
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
                        boolean r0 = r6 instanceof com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$1$2$1 r0 = (com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$1$2$1 r0 = new com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$1$2$1
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
                        com.stripe.android.ui.core.elements.CardNumberEditableController r2 = r4.this$0
                        com.stripe.android.ui.core.elements.CardNumberConfig r2 = com.stripe.android.ui.core.elements.CardNumberEditableController.access$getCardTextFieldConfig$p(r2)
                        java.lang.String r5 = r2.convertToRaw(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4b
                        return r1
                    L4b:
                        vz.b0 r5 = vz.b0.f54756a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
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
        this.cardBrandFlow = new e<CardBrand>() { // from class: com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$2

            /* renamed from: com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;
                final /* synthetic */ CardNumberEditableController this$0;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$2$2", f = "CardNumberController.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$2$2$1  reason: invalid class name */
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

                public AnonymousClass2(f fVar, CardNumberEditableController cardNumberEditableController) {
                    this.$this_unsafeFlow = fVar;
                    this.this$0 = cardNumberEditableController;
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
                        boolean r0 = r6 instanceof com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$2$2$1 r0 = (com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$2$2$1 r0 = new com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$2$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r6)
                        goto L66
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        vz.r.b(r6)
                        kotlinx.coroutines.flow.f r6 = r4.$this_unsafeFlow
                        java.lang.String r5 = (java.lang.String) r5
                        com.stripe.android.ui.core.elements.CardNumberEditableController r2 = r4.this$0
                        com.stripe.android.cards.CardAccountRangeService r2 = r2.getAccountRangeService()
                        com.stripe.android.model.AccountRange r2 = r2.getAccountRange()
                        if (r2 != 0) goto L46
                        r2 = 0
                        goto L4a
                    L46:
                        com.stripe.android.model.CardBrand r2 = r2.getBrand()
                    L4a:
                        if (r2 != 0) goto L5d
                        com.stripe.android.model.CardBrand$Companion r2 = com.stripe.android.model.CardBrand.Companion
                        java.util.List r5 = r2.getCardBrands(r5)
                        java.lang.Object r5 = wz.u.d0(r5)
                        r2 = r5
                        com.stripe.android.model.CardBrand r2 = (com.stripe.android.model.CardBrand) r2
                        if (r2 != 0) goto L5d
                        com.stripe.android.model.CardBrand r2 = com.stripe.android.model.CardBrand.Unknown
                    L5d:
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r2, r0)
                        if (r5 != r1) goto L66
                        return r1
                    L66:
                        vz.b0 r5 = vz.b0.f54756a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(f<? super CardBrand> fVar, zz.d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar, this), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        };
        this.cardScanEnabled = true;
        this.trailingIcon = new e<TextFieldIcon>() { // from class: com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$3

            /* renamed from: com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$3$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;
                final /* synthetic */ CardNumberEditableController this$0;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$3$2", f = "CardNumberController.kt", l = {225}, m = "emit")
                /* renamed from: com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$3$2$1  reason: invalid class name */
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

                public AnonymousClass2(f fVar, CardNumberEditableController cardNumberEditableController) {
                    this.$this_unsafeFlow = fVar;
                    this.this$0 = cardNumberEditableController;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
                @Override // kotlinx.coroutines.flow.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r17, zz.d r18) {
                    /*
                        Method dump skipped, instructions count: 311
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(f<? super TextFieldIcon> fVar, zz.d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar, this), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        };
        final e<TextFieldState> h11 = kotlinx.coroutines.flow.g.h(getCardBrandFlow(), a11, new CardNumberEditableController$_fieldState$1(this, null));
        this._fieldState = h11;
        this.fieldState = h11;
        u<Boolean> a12 = j0.a(Boolean.FALSE);
        this._hasFocus = a12;
        CardAccountRangeService cardAccountRangeService = new CardAccountRangeService(cardAccountRangeRepository, workContext, staticCardAccountRanges, new CardAccountRangeService.AccountRangeResultListener() { // from class: com.stripe.android.ui.core.elements.CardNumberEditableController$accountRangeService$1
            @Override // com.stripe.android.cards.CardAccountRangeService.AccountRangeResultListener
            public void onAccountRangeResult(AccountRange accountRange) {
                if (accountRange == null) {
                    return;
                }
                ((CardNumberVisualTransformation) CardNumberEditableController.this.getVisualTransformation()).setBinBasedMaxPan$payments_ui_core_release(Integer.valueOf(accountRange.getPanLength()));
            }
        });
        this.accountRangeService = cardAccountRangeService;
        this.loading = cardAccountRangeService.isLoading();
        this.visibleError = kotlinx.coroutines.flow.g.h(h11, a12, new CardNumberEditableController$visibleError$1(null));
        this.error = kotlinx.coroutines.flow.g.h(getVisibleError(), h11, new CardNumberEditableController$error$1(null));
        this.isComplete = new e<Boolean>() { // from class: com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$4

            /* renamed from: com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$4$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$4$2", f = "CardNumberController.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$4$2$1  reason: invalid class name */
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
                        boolean r0 = r6 instanceof com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$4.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$4$2$1 r0 = (com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$4.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$4$2$1 r0 = new com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$4$2$1
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
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.CardNumberEditableController$special$$inlined$map$4.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
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
        this.formFieldValue = kotlinx.coroutines.flow.g.h(isComplete(), getRawFieldValue(), new CardNumberEditableController$formFieldValue$1(null));
        onRawValueChange(str == null ? "" : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardNumberEditableController(CardNumberConfig cardTextFieldConfig, Context context, String str) {
        this(cardTextFieldConfig, new DefaultCardAccountRangeRepositoryFactory(context).create(), e1.b(), null, str, false, 40, null);
        s.g(cardTextFieldConfig, "cardTextFieldConfig");
        s.g(context, "context");
    }
}