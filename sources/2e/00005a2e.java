package com.stripe.android.ui.core.elements;

import com.stripe.android.model.CardBrand;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.elements.TextFieldIcon;
import com.stripe.android.ui.core.elements.TextFieldStateConstants;
import com.stripe.android.ui.core.forms.FormFieldEntry;
import java.util.Map;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.u;
import s2.k0;
import vz.b0;

/* loaded from: classes6.dex */
public final class CardNumberViewOnlyController extends CardNumberController {
    private final u<String> _fieldValue;
    private final int capitalization;
    private final e<CardBrand> cardBrandFlow;
    private final boolean cardScanEnabled;
    private final e<String> contentDescription;
    private final String debugLabel;
    private final boolean enabled;
    private final e error;
    private final e<TextFieldStateConstants.Valid.Full> fieldState;
    private final e<String> fieldValue;
    private final e<FormFieldEntry> formFieldValue;
    private final e<Boolean> isComplete;
    private final int keyboardType;
    private final u<Integer> label;
    private final e<Boolean> loading;
    private final e<String> rawFieldValue;
    private final boolean showOptionalLabel;
    private final e<TextFieldIcon.Trailing> trailingIcon;
    private final e<Boolean> visibleError;
    private final k0 visualTransformation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardNumberViewOnlyController(CardNumberConfig cardTextFieldConfig, Map<IdentifierSpec, String> initialValues) {
        super(null);
        s.g(cardTextFieldConfig, "cardTextFieldConfig");
        s.g(initialValues, "initialValues");
        this.capitalization = cardTextFieldConfig.mo430getCapitalizationIUNYP9k();
        this.keyboardType = cardTextFieldConfig.mo431getKeyboardPjHm6EE();
        this.visualTransformation = k0.f50112a.c();
        this.debugLabel = cardTextFieldConfig.getDebugLabel();
        this.label = j0.a(Integer.valueOf(cardTextFieldConfig.getLabel()));
        IdentifierSpec.Companion companion = IdentifierSpec.Companion;
        String str = initialValues.get(companion.getCardNumber());
        u<String> a11 = j0.a(str == null ? "" : str);
        this._fieldValue = a11;
        this.fieldValue = a11;
        this.rawFieldValue = getFieldValue();
        this.contentDescription = getFieldValue();
        String str2 = initialValues.get(companion.getCardBrand());
        CardBrand fromCode = str2 == null ? null : CardBrand.Companion.fromCode(str2);
        this.cardBrandFlow = g.x(fromCode == null ? CardBrand.Unknown : fromCode);
        final e<CardBrand> cardBrandFlow = getCardBrandFlow();
        this.trailingIcon = new e<TextFieldIcon.Trailing>() { // from class: com.stripe.android.ui.core.elements.CardNumberViewOnlyController$special$$inlined$map$1

            /* renamed from: com.stripe.android.ui.core.elements.CardNumberViewOnlyController$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.ui.core.elements.CardNumberViewOnlyController$special$$inlined$map$1$2", f = "CardNumberViewOnlyController.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.ui.core.elements.CardNumberViewOnlyController$special$$inlined$map$1$2$1  reason: invalid class name */
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
                        boolean r0 = r12 instanceof com.stripe.android.ui.core.elements.CardNumberViewOnlyController$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r12
                        com.stripe.android.ui.core.elements.CardNumberViewOnlyController$special$$inlined$map$1$2$1 r0 = (com.stripe.android.ui.core.elements.CardNumberViewOnlyController$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.ui.core.elements.CardNumberViewOnlyController$special$$inlined$map$1$2$1 r0 = new com.stripe.android.ui.core.elements.CardNumberViewOnlyController$special$$inlined$map$1$2$1
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
                        int r5 = r11.getIcon()
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
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.CardNumberViewOnlyController$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
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
        this.fieldState = g.x(TextFieldStateConstants.Valid.Full.INSTANCE);
        this.isComplete = g.x(Boolean.TRUE);
        this.formFieldValue = g.h(isComplete(), getRawFieldValue(), new CardNumberViewOnlyController$formFieldValue$1(null));
        this.error = g.x(null);
        Boolean bool = Boolean.FALSE;
        this.loading = g.x(bool);
        this.visibleError = g.x(bool);
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

    @Override // com.stripe.android.ui.core.elements.CardNumberController, com.stripe.android.ui.core.elements.TextFieldController
    public boolean getEnabled() {
        return this.enabled;
    }

    @Override // com.stripe.android.ui.core.elements.SectionFieldErrorController
    public e getError() {
        return this.error;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldController
    public e<TextFieldStateConstants.Valid.Full> getFieldState() {
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
    public e<TextFieldIcon.Trailing> getTrailingIcon() {
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
    }

    @Override // com.stripe.android.ui.core.elements.InputController
    public void onRawValueChange(String rawValue) {
        s.g(rawValue, "rawValue");
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldController
    public TextFieldState onValueChange(String displayFormatted) {
        s.g(displayFormatted, "displayFormatted");
        return null;
    }

    @Override // com.stripe.android.ui.core.elements.TextFieldController, com.stripe.android.ui.core.elements.InputController
    public u<Integer> getLabel() {
        return this.label;
    }
}